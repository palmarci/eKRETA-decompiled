package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.subject.SubjectsViewModel.Tab;
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
import p300k.p313b.C5027n;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u001cR\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140$X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "evaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;)V", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "listViewVisible", "getListViewVisible", "setListViewVisible", "(Z)V", "listViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsViewModelImpl */
/* compiled from: SubjectsViewModelImpl.kt */
public final class SubjectsViewModelImpl extends AuthenticatedViewModel implements SubjectsViewModel {

    /* renamed from: r */
    public static final /* synthetic */ KProperty[] f14880r;

    /* renamed from: m */
    public final ReadWriteProperty f14881m = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f14882n = DataBindingViewModel.boundBoolean$default(this, this, 3, false, null, 6, null);

    /* renamed from: o */
    public final boolean f14883o;

    /* renamed from: p */
    public final C3824r<List<Tab>> f14884p = new C3824r<>();

    /* renamed from: q */
    public final RefreshAdapter<List<Evaluation>> f14885q;

    static {
        Class<SubjectsViewModelImpl> cls = SubjectsViewModelImpl.class;
        f14880r = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z"))};
    }

    public SubjectsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, final EvaluationRepository evaluationRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(evaluationRepository, "evaluationRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f14885q = new RefreshAdapter<>(profileRepository);
        C5027n g = this.f14885q.mo16395a(new Function1<Profile, C5027n<List<? extends Evaluation>>>() {
            /* renamed from: a */
            public final C5027n<List<Evaluation>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                return evaluationRepository.mo12735C(profile);
            }
        }, new Function1<Profile, C4667b>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectsViewModelImpl f14887c;

            {
                this.f14887c = r1;
            }

            /* renamed from: a */
            public final C4667b invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "it");
                SubjectsViewModelImpl subjectsViewModelImpl = this.f14887c;
                C5027n a = evaluationRepository.mo12737m(profile).mo17201a((C4668a) new C4668a(this) {

                    /* renamed from: a */
                    public final /* synthetic */ C43502 f14889a;

                    {
                        this.f14889a = r1;
                    }

                    public final void run() {
                        this.f14889a.f14887c.mo15762c(false);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(a, "evaluationRepository\n   …progressVisible = false }");
                C4667b e = subjectsViewModelImpl.mo11505a(a).mo17241e();
                Intrinsics.checkExpressionValueIsNotNull(e, "evaluationRepository\n   …        .ignoreElements()");
                return e;
            }
        }).mo17233c((C4673f<? super T>) new C4673f<RefreshEvent<List<? extends Evaluation>>>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectsViewModelImpl f14890c;

            {
                this.f14890c = r1;
            }

            /* renamed from: a */
            public final void accept(RefreshEvent<List<Evaluation>> refreshEvent) {
                if (refreshEvent instanceof Error) {
                    this.f14890c.mo15762c(false);
                    DataBindingViewModel.showError$default(this.f14890c, ((Error) refreshEvent).mo16403a(), null, null, 6, null);
                } else if (refreshEvent instanceof RefreshStarted) {
                    this.f14890c.mo15762c(true);
                } else if (refreshEvent instanceof RefreshFinished) {
                    this.f14890c.mo15762c(false);
                }
            }
        }).mo17221b(LocalData.class).mo17246g(C43534.INSTANCE).mo17220b().mo17246g(C43545.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "refreshAdapter\n         …eVisible(actualTypes) } }");
        mo16413a(C4998b.m16842a(g, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectsViewModelImpl f14892c;

            {
                this.f14892c = r1;
            }

            /* renamed from: a */
            public final void mo15769a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.f14892c, th, null, null, 6, null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo15769a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<List<? extends Tab>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ SubjectsViewModelImpl f14891c;

            {
                this.f14891c = r1;
            }

            /* renamed from: a */
            public final void mo15768a(List<? extends Tab> list) {
                this.f14891c.getItems().setValue(list);
                SubjectsViewModelImpl subjectsViewModelImpl = this.f14891c;
                boolean z = true;
                if (list.size() <= 1) {
                    z = false;
                }
                subjectsViewModelImpl.mo15761b(z);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo15768a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        this.f14885q.mo16396a(RefreshReason.Automatic);
    }

    /* renamed from: a */
    public void onSelect(Tab tab) {
        String str = "item";
        Intrinsics.checkParameterIsNotNull(tab, str);
        Intrinsics.checkParameterIsNotNull(tab, str);
    }

    /* renamed from: b */
    public void mo15761b(boolean z) {
        this.f14882n.setValue(this, f14880r[1], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo15762c(boolean z) {
        this.f14881m.setValue(this, f14880r[0], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo11494d() {
        return ((Boolean) this.f14881m.getValue(this, f14880r[0])).booleanValue();
    }

    /* renamed from: e */
    public void mo11495e() {
    }

    /* renamed from: f */
    public boolean mo11496f() {
        return this.f14883o;
    }

    /* renamed from: g */
    public boolean mo11497g() {
        return ((Boolean) this.f14882n.getValue(this, f14880r[1])).booleanValue();
    }

    public C3824r<List<Tab>> getItems() {
        return this.f14884p;
    }
}
