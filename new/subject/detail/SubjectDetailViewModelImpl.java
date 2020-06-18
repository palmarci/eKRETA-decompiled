package hu.ekreta.ellenorzo.subject.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import hu.ekreta.ellenorzo.subject.SubjectsRepository;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.BehaviorRelay;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshReason;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.b.a0.c;
import k.b.a0.d;
import k.b.b0.f;
import k.b.b0.h;
import k.b.c0.b.b;
import k.b.c0.e.e.y0;
import k.b.f0.a;
import k.b.n;
import k.b.q;
import k.b.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import o.c.a.g;
import o.c.a.p.j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020D0#2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0#H\u0002J\b\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020$H\u0016J(\u0010K\u001a\b\u0012\u0004\u0012\u0002040#*\b\u0012\u0004\u0012\u0002040#2\u0006\u00105\u001a\u00020-2\u0006\u0010L\u001a\u00020MH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010.\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010 \u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040#03X\u0004¢\u0006\u0002\n\u0000R+\u00105\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020-8V@VX\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010=\u001a\u00020<2\u0006\u0010\u0018\u001a\u00020<8V@VX\u0002¢\u0006\u0012\n\u0004\bB\u0010 \u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006N"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "subjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "schoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;Lhu/ekreta/ellenorzo/subject/SubjectsRepository;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;)V", "<set-?>", "", "emptyViewVisible", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "emptyViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "evaluations", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "getEvaluations", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "parameterRelay", "Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "subjectParameters", "getSubjectParameters", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "subjectParameters$delegate", "Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title$delegate", "createMPChartData", "Lcom/github/mikephil/charting/data/Entry;", "sortedListOfAverages", "", "onRefresh", "", "onSelect", "item", "filterForSubjectDetailObject", "periodEnd", "Ljava/util/Calendar;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl extends AuthenticatedViewModel implements SubjectDetailViewModel {
    public static final /* synthetic */ KProperty[] y;

    /* renamed from: n  reason: collision with root package name */
    public final BehaviorRelay<SubjectParameters> f6194n = new BehaviorRelay<>((Object) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public final BehaviorRelay f6195o = this.f6194n;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f6196p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f6197q;
    public final r<List<SubjectDetailViewModel.ListItem>> r;
    public final ReadWriteProperty s;
    public final RefreshAdapter<List<Evaluation>> t;
    public final ProfileRepository u;
    public final Context v;
    public final SubjectsRepository w;
    public final DateTimeFactory x;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6198a = new int[Evaluation.Type.values().length];

        static {
            f6198a[Evaluation.Type.HalfYear.ordinal()] = 1;
            f6198a[Evaluation.Type.EndOfYear.ordinal()] = 2;
        }
    }

    static {
        Class<SubjectDetailViewModelImpl> cls = SubjectDetailViewModelImpl.class;
        y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subjectParameters", "getSubjectParameters()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context, SubjectsRepository subjectsRepository, DateTimeFactory dateTimeFactory, EvaluationRepository evaluationRepository, SchoolYearCalendarRepository schoolYearCalendarRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        n nVar;
        ProfileRepository profileRepository2 = profileRepository;
        Context context2 = context;
        SubjectsRepository subjectsRepository2 = subjectsRepository;
        DateTimeFactory dateTimeFactory2 = dateTimeFactory;
        final EvaluationRepository evaluationRepository2 = evaluationRepository;
        final SchoolYearCalendarRepository schoolYearCalendarRepository2 = schoolYearCalendarRepository;
        ObservableImpl observableImpl2 = observableImpl;
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        ExecuteOnceUiCommandSource executeOnceUiCommandSource2 = executeOnceUiCommandSource;
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        SystemExit systemExit2 = systemExit;
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository2, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(subjectsRepository2, "subjectsRepository");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory2, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(evaluationRepository2, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarRepository2, "schoolYearCalendarRepository");
        this.u = profileRepository2;
        this.v = context2;
        this.w = subjectsRepository2;
        this.x = dateTimeFactory2;
        this.f6196p = DataBindingViewModel.boundBoolean$default(this, this, 37, true, (Function1) null, 4, (Object) null);
        DataBindingViewModel.boundBoolean$default(this, this, 3, false, (Function1) null, 6, (Object) null);
        this.f6197q = DataBindingViewModel.boundBoolean$default(this, this, 65, false, (Function1) null, 6, (Object) null);
        this.r = new r<>();
        String string = this.v.getString(R.string.EvaluationDetail_Page_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…luationDetail_Page_Title)");
        this.s = DataBindingViewModel.boundString$default(this, this, 97, string, (Function1) null, 4, (Object) null);
        this.t = new RefreshAdapter<>(this.u);
        c e = this.f6194n.e(new f<SubjectParameters>(this) {
            public final /* synthetic */ SubjectDetailViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(SubjectParameters subjectParameters) {
                SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.c;
                Context access$getContext$p = subjectDetailViewModelImpl.v;
                int i2 = WhenMappings.f6198a[subjectParameters.h().ordinal()];
                String string = access$getContext$p.getString(i2 != 1 ? i2 != 2 ? R.string.EvaluationsAverage_TabPage_Title : R.string.EvaluationsEndYear_TabPage_Title : R.string.EvaluationsHalfYear_TabPage_Title);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …          }\n            )");
                subjectDetailViewModelImpl.q(string);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e, "parameterRelay.subscribe…}\n            )\n        }");
        a(e);
        BehaviorRelay<SubjectParameters> behaviorRelay = this.f6194n;
        n<Profile> b = this.u.b();
        Intrinsics.checkParameterIsNotNull(behaviorRelay, "source1");
        Intrinsics.checkParameterIsNotNull(b, "source2");
        a aVar = a.f7073a;
        b.a(behaviorRelay, "source1 is null");
        b.a(b, "source2 is null");
        h a2 = k.b.c0.b.a.a(aVar);
        int i2 = k.b.f.c;
        q[] qVarArr = {behaviorRelay, b};
        b.a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            nVar = n.j();
        } else {
            b.a(a2, "combiner is null");
            b.a(i2, "bufferSize");
            nVar = d.a(new k.b.c0.e.e.f(qVarArr, (Iterable) null, a2, i2 << 1, false));
        }
        n k2 = nVar.k(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ SubjectDetailViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<List<SubjectDetailViewModel.ListItem>> apply(Pair<SubjectParameters, Profile> pair) {
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                final SubjectParameters component1 = pair.component1();
                return schoolYearCalendarRepository2.a(component1.h(), pair.component2()).a(this.c.x.a()).d(new h<T, q<? extends R>>(this) {
                    public final /* synthetic */ AnonymousClass2 c;

                    {
                        this.c = r1;
                    }

                    /* renamed from: a */
                    public final n<List<SubjectDetailViewModel.ListItem>> apply(final Calendar calendar) {
                        Intrinsics.checkParameterIsNotNull(calendar, "periodEnd");
                        return this.c.c.t.a(new Function1<Profile, n<List<? extends Evaluation>>>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final n<List<Evaluation>> invoke(Profile profile) {
                                Intrinsics.checkParameterIsNotNull(profile, "it");
                                return evaluationRepository2.C(profile);
                            }
                        }, new Function1<Profile, k.b.b>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final k.b.b invoke(Profile profile) {
                                Intrinsics.checkParameterIsNotNull(profile, "it");
                                AnonymousClass2 r0 = this.c.c;
                                k.b.b e = r0.c.a(evaluationRepository2.m(profile)).e();
                                Intrinsics.checkExpressionValueIsNotNull(e, "evaluationRepository\n   …        .ignoreElements()");
                                return e;
                            }
                        }).d((f<? super c>) new f<c>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            public final void a() {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                t a2 = k.b.z.a.a.a();
                                b.a(timeUnit, "unit is null");
                                b.a(a2, "scheduler is null");
                                d.a(new y0(Math.max(100, 0), timeUnit, a2)).e(new f<Long>() {
                                    public final void a() {
                                        AnonymousClass3.this.c.c.c.t.a(RefreshReason.Automatic);
                                    }

                                    public /* bridge */ /* synthetic */ void accept(Object obj) {
                                        Long l2 = (Long) obj;
                                        a();
                                    }
                                });
                            }

                            public /* bridge */ /* synthetic */ void accept(Object obj) {
                                c cVar = (c) obj;
                                a();
                            }
                        }).c(new f<RefreshEvent<List<? extends Evaluation>>>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final void accept(RefreshEvent<List<Evaluation>> refreshEvent) {
                                if (refreshEvent instanceof RefreshEvent.Error) {
                                    this.c.c.c.d(false);
                                    DataBindingViewModel.showError$default(this.c.c.c, ((RefreshEvent.Error) refreshEvent).a(), (Integer) null, (Function1) null, 6, (Object) null);
                                } else if (refreshEvent instanceof RefreshEvent.RefreshStarted) {
                                    this.c.c.c.d(true);
                                } else if (refreshEvent instanceof RefreshEvent.RefreshFinished) {
                                    this.c.c.c.d(false);
                                }
                            }
                        }).b(RefreshEvent.LocalData.class).g(new h<T, R>(this) {
                            public final /* synthetic */ AnonymousClass1 c;

                            {
                                this.c = r1;
                            }

                            /* renamed from: a */
                            public final List<SubjectDetailViewModel.ListItem> apply(RefreshEvent.LocalData<?> localData) {
                                Intrinsics.checkParameterIsNotNull(localData, "it");
                                Object a2 = localData.a();
                                if (a2 != null) {
                                    AnonymousClass1 r0 = this.c;
                                    List access$filterForSubjectDetailObject = r0.c.c.a((List) a2, component1, calendar);
                                    AnonymousClass1 r3 = this.c;
                                    SubjectParameters subjectParameters = component1;
                                    List<SubjectDetailViewModel.ListItem> mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new SubjectDetailViewModel.ListItem.TableHeader(subjectParameters, r3.c.c.b(subjectParameters.j()), UtilsKt.a(calendar)));
                                    List sortedWith = CollectionsKt___CollectionsKt.sortedWith(access$filterForSubjectDetailObject, new SubjectDetailViewModelImpl$2$1$5$$special$$inlined$sortedByDescending$1());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object next : sortedWith) {
                                        o.c.a.n a3 = d.a(((Evaluation) next).t());
                                        Intrinsics.checkExpressionValueIsNotNull(a3, "zonedDateTime");
                                        Pair pair = new Pair(Integer.valueOf(a3.c.c.c), a3.c.c.g());
                                        Object obj = linkedHashMap.get(pair);
                                        if (obj == null) {
                                            obj = new ArrayList();
                                            linkedHashMap.put(pair, obj);
                                        }
                                        ((List) obj).add(next);
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        Pair pair2 = (Pair) entry.getKey();
                                        List<Evaluation> list = (List) entry.getValue();
                                        arrayList.add(new SubjectDetailViewModel.ListItem.SectionHeader(((Number) pair2.getFirst()).intValue() + ". " + ((g) pair2.getSecond()).a(j.FULL, Locale.getDefault())));
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        for (Evaluation evaluationItem : list) {
                                            arrayList2.add(new SubjectDetailViewModel.ListItem.EvaluationItem(evaluationItem));
                                        }
                                        arrayList.addAll(arrayList2);
                                    }
                                    mutableListOf.addAll(arrayList);
                                    return mutableListOf;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<hu.ekreta.ellenorzo.evaluation.Evaluation>");
                            }
                        });
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(k2, "Observables\n            …          }\n            }");
        a(k.b.f0.b.a(k2, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ SubjectDetailViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<List<SubjectDetailViewModel.ListItem>, Unit>(this) {
            public final /* synthetic */ SubjectDetailViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(List<SubjectDetailViewModel.ListItem> list) {
                SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.c;
                boolean z = true;
                if (list.size() > 1) {
                    z = false;
                }
                subjectDetailViewModelImpl.c(z);
                this.c.getEvaluations().setValue(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public SubjectParameters Z1() {
        return (SubjectParameters) this.f6195o.getValue(this, y[0]);
    }

    public void a(SubjectDetailViewModel.ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        if (listItem instanceof SubjectDetailViewModel.ListItem.EvaluationItem) {
            b((Function1<? super Activity, ? extends Intent>) new SubjectDetailViewModelImpl$onSelect$1(listItem));
        }
    }

    public void a(SubjectParameters subjectParameters) {
        Intrinsics.checkParameterIsNotNull(subjectParameters, "<set-?>");
        this.f6195o.setValue(this, y[0], subjectParameters);
    }

    public final List<a.g.a.a.e.h> b(List<Float> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        float f = 0.0f;
        for (Number floatValue : list) {
            arrayList.add(new a.g.a.a.e.h(f, floatValue.floatValue()));
            f = 1.0f + f;
        }
        return arrayList;
    }

    public void c(boolean z) {
        this.f6197q.setValue(this, y[3], Boolean.valueOf(z));
    }

    public void d(boolean z) {
        this.f6196p.setValue(this, y[1], Boolean.valueOf(z));
    }

    public boolean d() {
        return ((Boolean) this.f6196p.getValue(this, y[1])).booleanValue();
    }

    public void e() {
        n<R> b = this.u.b().c(new SubjectDetailViewModelImpl$onRefresh$1(this)).g(new SubjectDetailViewModelImpl$onRefresh$2(this)).c(new SubjectDetailViewModelImpl$onRefresh$3(this)).b((f<? super Throwable>) new SubjectDetailViewModelImpl$onRefresh$4(this));
        Intrinsics.checkExpressionValueIsNotNull(b, "profileRepository.getAct…ble = false\n            }");
        a(k.b.f0.b.a(b, new SubjectDetailViewModelImpl$onRefresh$6(this), (Function0) null, new SubjectDetailViewModelImpl$onRefresh$5(this), 2));
    }

    public boolean f() {
        return ((Boolean) this.f6197q.getValue(this, y[3])).booleanValue();
    }

    public String getTitle() {
        return (String) this.s.getValue(this, y[4]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, y[4], str);
    }

    public r<List<SubjectDetailViewModel.ListItem>> getEvaluations() {
        return this.r;
    }

    public final List<Evaluation> a(List<Evaluation> list, SubjectParameters subjectParameters, Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            Evaluation evaluation = (Evaluation) next;
            if (Intrinsics.areEqual((Object) evaluation.a(this.v), (Object) subjectParameters.k()) && (evaluation.B() == Evaluation.Type.MidYear || evaluation.B() == Evaluation.Type.Other) && calendar.compareTo(evaluation.t()) > 0 && Intrinsics.areEqual((Object) evaluation.g(), (Object) subjectParameters.f())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
