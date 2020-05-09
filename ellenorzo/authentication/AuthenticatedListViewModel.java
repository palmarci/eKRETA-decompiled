package p289hu.ekreta.ellenorzo.authentication;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.exception.NoContentException;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshReason;
import p300k.p313b.C5027n;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016JP\u0010+\u001a\u00020&2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180/0-2\u001e\u00100\u001a\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180/0-2\b\b\u0002\u00101\u001a\u00020\u000eR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R+\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180$X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "T", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "emptyViewVisible", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "emptyViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "items", "Landroidx/lifecycle/MutableLiveData;", "", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "errorHandler", "", "throwable", "", "noContentHandler", "onRefresh", "start", "observeLocalData", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lio/reactivex/Observable;", "updateLocalData", "autoRefreshEnabled", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel */
/* compiled from: AuthenticatedListViewModel.kt */
public abstract class AuthenticatedListViewModel<T> extends AuthenticatedViewModel implements DataBindingListViewModel<T> {

    /* renamed from: r */
    public static final /* synthetic */ KProperty[] f11190r;

    /* renamed from: m */
    public final ReadWriteProperty f11191m = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f11192n;

    /* renamed from: o */
    public final ReadWriteProperty f11193o;

    /* renamed from: p */
    public final C3824r<List<T>> f11194p;

    /* renamed from: q */
    public final RefreshAdapter<List<T>> f11195q;

    static {
        Class<AuthenticatedListViewModel> cls = AuthenticatedListViewModel.class;
        f11190r = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z"))};
    }

    public AuthenticatedListViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11192n = DataBindingViewModel.boundBoolean$default(this, this, 3, false, null, 6, null);
        this.f11193o = DataBindingViewModel.boundBoolean$default(this, this, 65, false, null, 6, null);
        this.f11194p = new C3824r<>();
        this.f11195q = new RefreshAdapter<>(profileRepository);
    }

    public static /* synthetic */ void start$default(AuthenticatedListViewModel authenticatedListViewModel, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            authenticatedListViewModel.mo11490a(function1, function12, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    /* renamed from: P1 */
    public void mo11488P1() {
    }

    /* renamed from: a */
    public final void mo11490a(Function1<? super Profile, ? extends C5027n<List<T>>> function1, Function1<? super Profile, ? extends C5027n<List<T>>> function12, boolean z) {
        Intrinsics.checkParameterIsNotNull(function1, "observeLocalData");
        Intrinsics.checkParameterIsNotNull(function12, "updateLocalData");
        mo16413a(C4998b.m16842a(this.f11195q.mo16395a(new AuthenticatedListViewModel$start$1(function1), new AuthenticatedListViewModel$start$2(this, function12)), (Function1) new AuthenticatedListViewModel$start$4(this), (Function0) null, (Function1) new AuthenticatedListViewModel$start$3(this), 2));
        if (z) {
            this.f11195q.mo16396a(RefreshReason.Automatic);
        }
    }

    /* renamed from: b */
    public void mo11491b(boolean z) {
        this.f11193o.setValue(this, f11190r[2], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo11492c(boolean z) {
        this.f11192n.setValue(this, f11190r[1], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo11493d(boolean z) {
        this.f11191m.setValue(this, f11190r[0], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo11494d() {
        return ((Boolean) this.f11191m.getValue(this, f11190r[0])).booleanValue();
    }

    /* renamed from: e */
    public void mo11495e() {
        this.f11195q.mo16396a(RefreshReason.User);
    }

    /* renamed from: f */
    public boolean mo11496f() {
        return ((Boolean) this.f11193o.getValue(this, f11190r[2])).booleanValue();
    }

    /* renamed from: g */
    public boolean mo11497g() {
        return ((Boolean) this.f11192n.getValue(this, f11190r[1])).booleanValue();
    }

    public void onSelect(T t) {
    }

    public C3824r<List<T>> getItems() {
        return this.f11194p;
    }

    /* renamed from: a */
    public void mo11489a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (th instanceof NoContentException) {
            mo11488P1();
        } else {
            DataBindingViewModel.showError$default(this, th, null, null, 6, null);
        }
    }
}
