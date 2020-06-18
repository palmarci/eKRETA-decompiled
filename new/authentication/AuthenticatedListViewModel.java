package hu.ekreta.ellenorzo.authentication;

import h.p.r;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.exception.NoContentException;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter;
import hu.ekreta.ellenorzo.util.viewmodel.RefreshReason;
import java.util.List;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016JP\u0010-\u001a\u00020(2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u000200\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a010/2\u001e\u00102\u001a\u001a\u0012\u0004\u0012\u000200\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a010/2\b\b\u0002\u00103\u001a\u00020\u0010R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R+\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0&X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "T", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "emptyViewVisible", "getEmptyViewVisible", "()Z", "setEmptyViewVisible", "(Z)V", "emptyViewVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "items", "Landroidx/lifecycle/MutableLiveData;", "", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "setListViewVisible", "listViewVisible$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "refreshAdapter", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "errorHandler", "", "throwable", "", "noContentHandler", "onRefresh", "start", "observeLocalData", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lio/reactivex/Observable;", "updateLocalData", "autoRefreshEnabled", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticatedListViewModel.kt */
public abstract class AuthenticatedListViewModel<T> extends AuthenticatedViewModel implements DataBindingListViewModel<T> {
    public static final /* synthetic */ KProperty[] s;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5051n = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5052o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5053p;

    /* renamed from: q  reason: collision with root package name */
    public final r<List<T>> f5054q;
    public final RefreshAdapter<List<T>> r;

    static {
        Class<AuthenticatedListViewModel> cls = AuthenticatedListViewModel.class;
        s = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "listViewVisible", "getListViewVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emptyViewVisible", "getEmptyViewVisible()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedListViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        this.f5052o = DataBindingViewModel.boundBoolean$default(this, this, 3, false, (Function1) null, 6, (Object) null);
        this.f5053p = DataBindingViewModel.boundBoolean$default(this, this, 65, false, (Function1) null, 6, (Object) null);
        this.f5054q = new r<>();
        this.r = new RefreshAdapter<>(profileRepository);
    }

    public static /* synthetic */ void start$default(AuthenticatedListViewModel authenticatedListViewModel, Function1 function1, Function1 function12, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            authenticatedListViewModel.a(function1, function12, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    public void Z1() {
    }

    public final void a(Function1<? super Profile, ? extends n<List<T>>> function1, Function1<? super Profile, ? extends n<List<T>>> function12, boolean z) {
        Intrinsics.checkParameterIsNotNull(function1, "observeLocalData");
        Intrinsics.checkParameterIsNotNull(function12, "updateLocalData");
        a(b.a(this.r.a(new AuthenticatedListViewModel$start$1(function1), new AuthenticatedListViewModel$start$2(this, function12)), new AuthenticatedListViewModel$start$4(this), (Function0) null, new AuthenticatedListViewModel$start$3(this), 2));
        if (z) {
            this.r.a(RefreshReason.Automatic);
        }
    }

    public void c(boolean z) {
        this.f5053p.setValue(this, s[2], Boolean.valueOf(z));
    }

    public void d(boolean z) {
        this.f5052o.setValue(this, s[1], Boolean.valueOf(z));
    }

    public boolean d() {
        return ((Boolean) this.f5051n.getValue(this, s[0])).booleanValue();
    }

    public void e() {
        this.r.a(RefreshReason.User);
    }

    public void e(boolean z) {
        this.f5051n.setValue(this, s[0], Boolean.valueOf(z));
    }

    public boolean f() {
        return ((Boolean) this.f5053p.getValue(this, s[2])).booleanValue();
    }

    public boolean g() {
        return ((Boolean) this.f5052o.getValue(this, s[1])).booleanValue();
    }

    public void onSelect(T t) {
    }

    public r<List<T>> getItems() {
        return this.f5054q;
    }

    public void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (th instanceof NoContentException) {
            Z1();
        } else {
            DataBindingViewModel.showError$default(this, th, (Integer) null, (Function1) null, 6, (Object) null);
        }
    }
}
