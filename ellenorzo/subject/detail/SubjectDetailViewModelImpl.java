package p289hu.ekreta.ellenorzo.subject.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p037g.p038a.p039a.p044e.C0340h;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import p289hu.ekreta.ellenorzo.subject.SubjectsRepository;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.SectionHeader;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader;
import p289hu.ekreta.ellenorzo.util.BehaviorRelay;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.RefreshFinished;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.RefreshStarted;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshReason;
import p300k.p313b.C4667b;
import p300k.p313b.C4996f;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5033t;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4685a;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4815f;
import p300k.p313b.p316c0.p321e.p326e.C4907y0;
import p300k.p313b.p335f0.C4997a;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;
import p365o.p372c.p373a.C5642g;
import p365o.p372c.p373a.C5650n;
import p365o.p372c.p373a.p375p.C5696j;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BO\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020B0!2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0!H\u0002J\b\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\"H\u0016J(\u0010I\u001a\b\u0012\u0004\u0012\u0002020!*\b\u0012\u0004\u0012\u0002020!2\u0006\u00103\u001a\u00020+2\u0006\u0010J\u001a\u00020KH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R+\u0010%\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178V@VX\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178V@VX\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020!01X\u0004¢\u0006\u0002\n\u0000R+\u00103\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020+8V@VX\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010;\u001a\u00020:2\u0006\u0010\u0016\u001a\u00020:8V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010\u001e\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006L"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "subjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "schoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;Lhu/ekreta/ellenorzo/subject/SubjectsRepository;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;)V", "<set-?>", "", "emptyViewVisible", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "emptyViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "evaluations", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "getEvaluations", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "parameterRelay", "Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "subjectParameters", "getSubjectParameters", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "subjectParameters$delegate", "Lhu/ekreta/ellenorzo/util/BehaviorRelay;", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title$delegate", "createMPChartData", "Lcom/github/mikephil/charting/data/Entry;", "sortedListOfAverages", "", "onRefresh", "", "onSelect", "item", "filterForSubjectDetailObject", "periodEnd", "Ljava/util/Calendar;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl */
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl extends AuthenticatedViewModel implements SubjectDetailViewModel {

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f15029x;

    /* renamed from: m */
    public final BehaviorRelay<SubjectParameters> f15030m = new BehaviorRelay<>(null, 1, null);

    /* renamed from: n */
    public final BehaviorRelay f15031n = this.f15030m;

    /* renamed from: o */
    public final ReadWriteProperty f15032o;

    /* renamed from: p */
    public final ReadWriteProperty f15033p;

    /* renamed from: q */
    public final C3824r<List<ListItem>> f15034q;

    /* renamed from: r */
    public final ReadWriteProperty f15035r;

    /* renamed from: s */
    public final RefreshAdapter<List<Evaluation>> f15036s;

    /* renamed from: t */
    public final ProfileRepository f15037t;

    /* renamed from: u */
    public final Context f15038u;

    /* renamed from: v */
    public final SubjectsRepository f15039v;

    /* renamed from: w */
    public final DateTimeFactory f15040w;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15056a = new int[Type.values().length];

        static {
            f15056a[Type.HalfYear.ordinal()] = 1;
            f15056a[Type.EndOfYear.ordinal()] = 2;
        }
    }

    static {
        Class<SubjectDetailViewModelImpl> cls = SubjectDetailViewModelImpl.class;
        f15029x = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subjectParameters", "getSubjectParameters()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;"))};
    }

    public SubjectDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context, SubjectsRepository subjectsRepository, DateTimeFactory dateTimeFactory, EvaluationRepository evaluationRepository, SchoolYearCalendarRepository schoolYearCalendarRepository) {
        C5027n nVar;
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
        AuthenticationService authenticationService2 = authenticationService;
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository2, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(subjectsRepository2, "subjectsRepository");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory2, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(evaluationRepository2, "evaluationRepository");
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarRepository2, "schoolYearCalendarRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f15037t = profileRepository2;
        this.f15038u = context2;
        this.f15039v = subjectsRepository2;
        this.f15040w = dateTimeFactory2;
        this.f15032o = DataBindingViewModel.boundBoolean$default(this, this, 37, true, null, 4, null);
        DataBindingViewModel.boundBoolean$default(this, this, 3, false, null, 6, null);
        this.f15033p = DataBindingViewModel.boundBoolean$default(this, this, 65, false, null, 6, null);
        this.f15034q = new C3824r<>();
        String string = this.f15038u.getString(C4014R.string.EvaluationDetail_Page_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…luationDetail_Page_Title)");
        this.f15035r = DataBindingViewModel.boundString$default(this, this, 95, string, null, 4, null);
        this.f15036s = new RefreshAdapter<>(this.f15037t);
        C4663c e = this.f15030m.mo17240e((C4673f<? super T>) new C4673f<SubjectParameters>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectDetailViewModelImpl f15041c;

            {
                this.f15041c = r1;
            }

            /* renamed from: a */
            public final void accept(SubjectParameters subjectParameters) {
                SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.f15041c;
                Context access$getContext$p = subjectDetailViewModelImpl.f15038u;
                int i = WhenMappings.f15056a[subjectParameters.mo15946h().ordinal()];
                int i2 = i != 1 ? i != 2 ? C4014R.string.EvaluationsAverage_TabPage_Title : C4014R.string.EvaluationsEndYear_TabPage_Title : C4014R.string.EvaluationsHalfYear_TabPage_Title;
                String string = access$getContext$p.getString(i2);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …          }\n            )");
                subjectDetailViewModelImpl.mo15919r(string);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e, "parameterRelay.subscribe…}\n            )\n        }");
        mo16413a(e);
        BehaviorRelay<SubjectParameters> behaviorRelay = this.f15030m;
        C5027n b = this.f15037t.mo14191b();
        Intrinsics.checkParameterIsNotNull(behaviorRelay, "source1");
        Intrinsics.checkParameterIsNotNull(b, "source2");
        C4997a aVar = C4997a.f17149a;
        C4704b.m16116a(behaviorRelay, "source1 is null");
        C4704b.m16116a(b, "source2 is null");
        C4675h a = C4685a.m16110a((C4670c<? super T1, ? super T2, ? extends R>) aVar);
        int i = C4996f.f17148c;
        C5030q[] qVarArr = {behaviorRelay, b};
        C4704b.m16116a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            nVar = C5027n.m16899j();
        } else {
            C4704b.m16116a(a, "combiner is null");
            C4704b.m16114a(i, "bufferSize");
            C4815f fVar = new C4815f(qVarArr, null, a, i << 1, false);
            nVar = C4664d.m16039a((C5027n<T>) fVar);
        }
        C5027n k = nVar.mo17252k(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectDetailViewModelImpl f15042c;

            {
                this.f15042c = r1;
            }

            /* renamed from: a */
            public final C5027n<List<ListItem>> apply(Pair<SubjectParameters, Profile> pair) {
                Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
                final SubjectParameters subjectParameters = (SubjectParameters) pair.component1();
                return schoolYearCalendarRepository2.mo15642a(subjectParameters.mo15946h(), (Profile) pair.component2()).mo17257a(this.f15042c.f15040w.mo16327a()).mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C43712 f15045c;

                    {
                        this.f15045c = r1;
                    }

                    /* renamed from: a */
                    public final C5027n<List<ListItem>> apply(final Calendar calendar) {
                        Intrinsics.checkParameterIsNotNull(calendar, "periodEnd");
                        return this.f15045c.f15042c.f15036s.mo16395a(new Function1<Profile, C5027n<List<? extends Evaluation>>>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C43721 f15047c;

                            {
                                this.f15047c = r1;
                            }

                            /* renamed from: a */
                            public final C5027n<List<Evaluation>> invoke(Profile profile) {
                                Intrinsics.checkParameterIsNotNull(profile, "it");
                                return evaluationRepository2.mo12735C(profile);
                            }
                        }, new Function1<Profile, C4667b>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C43721 f15048c;

                            {
                                this.f15048c = r1;
                            }

                            /* renamed from: a */
                            public final C4667b invoke(Profile profile) {
                                Intrinsics.checkParameterIsNotNull(profile, "it");
                                C43712 r0 = this.f15048c.f15045c;
                                C4667b e = r0.f15042c.mo11505a(evaluationRepository2.mo12737m(profile)).mo17241e();
                                Intrinsics.checkExpressionValueIsNotNull(e, "evaluationRepository\n   …        .ignoreElements()");
                                return e;
                            }
                        }).mo17238d((C4673f<? super C4663c>) new C4673f<C4663c>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C43721 f15049c;

                            {
                                this.f15049c = r1;
                            }

                            /* renamed from: a */
                            public final void mo15925a() {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                C5033t a = C5041a.m16999a();
                                C4704b.m16116a(timeUnit, "unit is null");
                                C4704b.m16116a(a, "scheduler is null");
                                C4664d.m16039a((C5027n<T>) new C4907y0<T>(Math.max(100, 0), timeUnit, a)).mo17240e((C4673f<? super T>) new C4673f<Long>() {
                                    /* renamed from: a */
                                    public final void mo15926a() {
                                        C43753.this.f15049c.f15045c.f15042c.f15036s.mo16396a(RefreshReason.Automatic);
                                    }

                                    public /* bridge */ /* synthetic */ void accept(Object obj) {
                                        Long l = (Long) obj;
                                        mo15926a();
                                    }
                                });
                            }

                            public /* bridge */ /* synthetic */ void accept(Object obj) {
                                C4663c cVar = (C4663c) obj;
                                mo15925a();
                            }
                        }).mo17233c((C4673f<? super T>) new C4673f<RefreshEvent<List<? extends Evaluation>>>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C43721 f15051c;

                            {
                                this.f15051c = r1;
                            }

                            /* renamed from: a */
                            public final void accept(RefreshEvent<List<Evaluation>> refreshEvent) {
                                if (refreshEvent instanceof Error) {
                                    this.f15051c.f15045c.f15042c.mo15918c(false);
                                    DataBindingViewModel.showError$default(this.f15051c.f15045c.f15042c, ((Error) refreshEvent).mo16403a(), null, null, 6, null);
                                } else if (refreshEvent instanceof RefreshStarted) {
                                    this.f15051c.f15045c.f15042c.mo15918c(true);
                                } else if (refreshEvent instanceof RefreshFinished) {
                                    this.f15051c.f15045c.f15042c.mo15918c(false);
                                }
                            }
                        }).mo17221b(LocalData.class).mo17246g(new C4675h<T, R>(this) {

                            /* renamed from: c */
                            public final /* synthetic */ C43721 f15052c;

                            {
                                this.f15052c = r1;
                            }

                            /* renamed from: a */
                            public final List<ListItem> apply(LocalData<?> localData) {
                                Intrinsics.checkParameterIsNotNull(localData, "it");
                                Object a = localData.mo16408a();
                                if (a != null) {
                                    List list = (List) a;
                                    C43721 r0 = this.f15052c;
                                    List access$filterForSubjectDetailObject = r0.f15045c.f15042c.mo15915a(list, subjectParameters, calendar);
                                    C43721 r3 = this.f15052c;
                                    SubjectParameters subjectParameters = subjectParameters;
                                    List<ListItem> mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new TableHeader(subjectParameters, r3.f15045c.f15042c.mo15916b(subjectParameters.mo15949j()), UtilsKt.m14828a(calendar)));
                                    List sortedWith = CollectionsKt___CollectionsKt.sortedWith(access$filterForSubjectDetailObject, new C4381xf1fe34d8());
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object next : sortedWith) {
                                        C5650n a2 = C4664d.m16043a(((Evaluation) next).mo12610t());
                                        Intrinsics.checkExpressionValueIsNotNull(a2, "zonedDateTime");
                                        Pair pair = new Pair(Integer.valueOf(a2.f18303c.f18263c.f18258c), a2.f18303c.f18263c.mo22068g());
                                        Object obj = linkedHashMap.get(pair);
                                        if (obj == null) {
                                            obj = new ArrayList();
                                            linkedHashMap.put(pair, obj);
                                        }
                                        ((List) obj).add(next);
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (Entry entry : linkedHashMap.entrySet()) {
                                        Pair pair2 = (Pair) entry.getKey();
                                        List<Evaluation> list2 = (List) entry.getValue();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(((Number) pair2.getFirst()).intValue());
                                        sb.append(". ");
                                        sb.append(((C5642g) pair2.getSecond()).mo22106a(C5696j.FULL, Locale.getDefault()));
                                        arrayList.add(new SectionHeader(sb.toString()));
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                        for (Evaluation evaluationItem : list2) {
                                            arrayList2.add(new EvaluationItem(evaluationItem));
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
        Intrinsics.checkExpressionValueIsNotNull(k, "Observables\n            …          }\n            }");
        mo16413a(C4998b.m16842a(k, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectDetailViewModelImpl f15055c;

            {
                this.f15055c = r1;
            }

            /* renamed from: a */
            public final void mo15930a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.f15055c, th, null, null, 6, null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo15930a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<List<ListItem>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectDetailViewModelImpl f15054c;

            {
                this.f15054c = r1;
            }

            /* renamed from: a */
            public final void mo15929a(List<ListItem> list) {
                SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.f15054c;
                boolean z = true;
                if (list.size() > 1) {
                    z = false;
                }
                subjectDetailViewModelImpl.mo15917b(z);
                this.f15054c.getEvaluations().setValue(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo15929a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    /* renamed from: P1 */
    public SubjectParameters mo15914P1() {
        return (SubjectParameters) this.f15031n.getValue(this, f15029x[0]);
    }

    /* renamed from: a */
    public void mo15886a(ListItem listItem) {
        Intrinsics.checkParameterIsNotNull(listItem, "item");
        if (listItem instanceof EvaluationItem) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new SubjectDetailViewModelImpl$onSelect$1<Object,Object>(listItem));
        }
    }

    /* renamed from: a */
    public void mo15887a(SubjectParameters subjectParameters) {
        Intrinsics.checkParameterIsNotNull(subjectParameters, "<set-?>");
        this.f15031n.setValue(this, f15029x[0], subjectParameters);
    }

    /* renamed from: b */
    public final List<C0340h> mo15916b(List<Float> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        float f = 0.0f;
        for (Number floatValue : list) {
            float f2 = 1.0f + f;
            arrayList.add(new C0340h(f, floatValue.floatValue()));
            f = f2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo15917b(boolean z) {
        this.f15033p.setValue(this, f15029x[3], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo15918c(boolean z) {
        this.f15032o.setValue(this, f15029x[1], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo15888d() {
        return ((Boolean) this.f15032o.getValue(this, f15029x[1])).booleanValue();
    }

    /* renamed from: e */
    public void mo15889e() {
        C5027n b = this.f15037t.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new SubjectDetailViewModelImpl$onRefresh$1<Object,Object>(this)).mo17246g(new SubjectDetailViewModelImpl$onRefresh$2(this)).mo17233c((C4673f<? super T>) new SubjectDetailViewModelImpl$onRefresh$3<Object>(this)).mo17224b((C4673f<? super Throwable>) new SubjectDetailViewModelImpl$onRefresh$4<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(b, "profileRepository.getAct…ble = false\n            }");
        mo16413a(C4998b.m16842a(b, (Function1) new SubjectDetailViewModelImpl$onRefresh$6(this), (Function0) null, (Function1) new SubjectDetailViewModelImpl$onRefresh$5(this), 2));
    }

    /* renamed from: f */
    public boolean mo15890f() {
        return ((Boolean) this.f15033p.getValue(this, f15029x[3])).booleanValue();
    }

    public String getTitle() {
        return (String) this.f15035r.getValue(this, f15029x[4]);
    }

    /* renamed from: r */
    public void mo15919r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15035r.setValue(this, f15029x[4], str);
    }

    public C3824r<List<ListItem>> getEvaluations() {
        return this.f15034q;
    }

    /* renamed from: a */
    public final List<Evaluation> mo15915a(List<Evaluation> list, SubjectParameters subjectParameters, Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Evaluation evaluation = (Evaluation) next;
            if (Intrinsics.areEqual((Object) evaluation.mo12592a(this.f15038u), (Object) subjectParameters.mo15950k()) && (evaluation.mo12586B() == Type.MidYear || evaluation.mo12586B() == Type.Other) && calendar.compareTo(evaluation.mo12610t()) > 0 && Intrinsics.areEqual((Object) evaluation.mo12596g(), (Object) subjectParameters.mo15944f())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
