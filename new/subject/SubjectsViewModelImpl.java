package hu.ekreta.ellenorzo.subject;

import h.p.r;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.subject.SubjectsViewModel;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshReason;
import java.util.List;
import k.b.b;
import k.b.b0.a;
import k.b.b0.f;
import k.b.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001eR+\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u001eR\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00160&X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;)V", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "listViewVisible", "getListViewVisible", "setListViewVisible", "(Z)V", "listViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectsViewModelImpl.kt */
public final class SubjectsViewModelImpl extends AuthenticatedViewModel implements SubjectsViewModel {
    public static final /* synthetic */ KProperty[] s;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f6154n = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f6155o = DataBindingViewModel.boundBoolean$default(this, this, 3, false, (Function1) null, 6, (Object) null);

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6156p;

    /* renamed from: q  reason: collision with root package name */
    public final r<List<SubjectsViewModel.Tab>> f6157q = new r<>();
    public final RefreshAdapter<List<Evaluation>> r;

    static {
        Class<SubjectsViewModelImpl> cls = SubjectsViewModelImpl.class;
        s = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, final EvaluationRepository evaluationRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        this.r = new RefreshAdapter<>(profileRepository);
        n<R> g2 = this.r.a(new Function1<Profile, n<List<? extends Evaluation>>>() {
            /* renamed from: a */
            public final n<List<Evaluation>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return evaluationRepository.C(profile);
            }
        }, new Function1<Profile, b>(this) {
            public final /* synthetic */ SubjectsViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final b invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                SubjectsViewModelImpl subjectsViewModelImpl = this.c;
                n<List<Evaluation>> a2 = evaluationRepository.m(profile).a((a) new a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ AnonymousClass2 f6158a;

                    {
                        this.f6158a = r1;
                    }

                    public final void run() {
                        this.f6158a.c.d(false);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(a2, "evaluationRepository\n   …progressVisible = false }");
                b e2 = subjectsViewModelImpl.a(a2).e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "evaluationRepository\n   …        .ignoreElements()");
                return e2;
            }
        }).c(new f<RefreshEvent<List<? extends Evaluation>>>(this) {
            public final /* synthetic */ SubjectsViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(RefreshEvent<List<Evaluation>> refreshEvent) {
                if (refreshEvent instanceof RefreshEvent.Error) {
                    this.c.d(false);
                    DataBindingViewModel.showError$default(this.c, ((RefreshEvent.Error) refreshEvent).a(), (Integer) null, (Function1) null, 6, (Object) null);
                } else if (refreshEvent instanceof RefreshEvent.RefreshStarted) {
                    this.c.d(true);
                } else if (refreshEvent instanceof RefreshEvent.RefreshFinished) {
                    this.c.d(false);
                }
            }
        }).b(RefreshEvent.LocalData.class).g(AnonymousClass4.INSTANCE).b().g(AnonymousClass5.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "refreshAdapter\n         …eVisible(actualTypes) } }");
        a(k.b.f0.b.a(g2, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ SubjectsViewModelImpl c;

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
        }, (Function0) null, new Function1<List<? extends SubjectsViewModel.Tab>, Unit>(this) {
            public final /* synthetic */ SubjectsViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(List<? extends SubjectsViewModel.Tab> list) {
                this.c.getItems().setValue(list);
                SubjectsViewModelImpl subjectsViewModelImpl = this.c;
                boolean z = true;
                if (list.size() <= 1) {
                    z = false;
                }
                subjectsViewModelImpl.c(z);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        this.r.a(RefreshReason.Automatic);
    }

    /* renamed from: a */
    public void onSelect(SubjectsViewModel.Tab tab) {
        Intrinsics.checkParameterIsNotNull(tab, "item");
        Intrinsics.checkParameterIsNotNull(tab, "item");
    }

    public void c(boolean z) {
        this.f6155o.setValue(this, s[1], Boolean.valueOf(z));
    }

    public void d(boolean z) {
        this.f6154n.setValue(this, s[0], Boolean.valueOf(z));
    }

    public boolean d() {
        return ((Boolean) this.f6154n.getValue(this, s[0])).booleanValue();
    }

    public void e() {
    }

    public boolean f() {
        return this.f6156p;
    }

    public boolean g() {
        return ((Boolean) this.f6155o.getValue(this, s[1])).booleanValue();
    }

    public r<List<SubjectsViewModel.Tab>> getItems() {
        return this.f6157q;
    }
}
