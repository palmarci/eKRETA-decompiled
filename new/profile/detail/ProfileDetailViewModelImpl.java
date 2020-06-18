package hu.ekreta.ellenorzo.profile.detail;

import h.p.r;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Guardian;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.b;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u00108\u001a\u000209H\u0016R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R+\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R/\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u000e\u001a\u0004\u0018\u00010-8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0016\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0016\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014¨\u0006:"}, d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "address", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "address$delegate", "Lkotlin/properties/ReadWriteProperty;", "birthDate", "getBirthDate", "setBirthDate", "birthDate$delegate", "birthName", "getBirthName", "setBirthName", "birthName$delegate", "birthPlace", "getBirthPlace", "setBirthPlace", "birthPlace$delegate", "guardianList", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/profile/Guardian;", "getGuardianList", "()Landroidx/lifecycle/MutableLiveData;", "mothersName", "getMothersName", "setMothersName", "mothersName$delegate", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setProfile", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "profile$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "killRefreshToken", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl extends DataBindingViewModel implements ProfileDetailViewModel {
    public static final /* synthetic */ KProperty[] u;

    /* renamed from: k  reason: collision with root package name */
    public final r<List<Guardian>> f6037k = new r<>();

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f6038l;

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f6039m;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f6040n;

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f6041o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f6042p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f6043q;
    public final ReadWriteProperty r;
    public final AuthenticationService s;
    public final ProfileRepository t;

    static {
        Class<ProfileDetailViewModelImpl> cls = ProfileDetailViewModelImpl.class;
        u = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), FirebaseContainer.Param.PROFILE, "getProfile()Lhu/ekreta/ellenorzo/profile/Profile;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthName", "getBirthName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthDate", "getBirthDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthPlace", "getBirthPlace()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mothersName", "getMothersName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "address", "getAddress()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        this.s = authenticationService;
        this.t = profileRepository;
        Delegates delegates = Delegates.INSTANCE;
        this.f6038l = new ProfileDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
        this.f6039m = DataBindingViewModel.boundString$default(this, this, 24, (String) null, (Function1) null, 6, (Object) null);
        this.f6040n = DataBindingViewModel.boundString$default(this, this, 9, (String) null, (Function1) null, 6, (Object) null);
        this.f6041o = DataBindingViewModel.boundString$default(this, this, 110, (String) null, (Function1) null, 6, (Object) null);
        this.f6042p = DataBindingViewModel.boundString$default(this, this, 43, (String) null, (Function1) null, 6, (Object) null);
        this.f6043q = DataBindingViewModel.boundString$default(this, this, 26, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 56, (String) null, (Function1) null, 6, (Object) null);
    }

    public void E1() {
        Profile Z1 = Z1();
        if (Z1 != null) {
            b a2 = this.s.a(Z1).a(a.a());
            Intrinsics.checkExpressionValueIsNotNull(a2, "authenticationService\n  …dSchedulers.mainThread())");
            a(k.b.f0.b.a(a2, (Function1<? super Throwable, Unit>) new ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$1(this), (Function0<Unit>) new ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$2(this)));
        }
    }

    public String H1() {
        return (String) this.r.getValue(this, u[6]);
    }

    public String I0() {
        return (String) this.f6040n.getValue(this, u[2]);
    }

    public String K1() {
        return (String) this.f6043q.getValue(this, u[5]);
    }

    public Profile Z1() {
        return (Profile) this.f6038l.getValue(this, u[0]);
    }

    public void c(Profile profile) {
        this.f6038l.setValue(this, u[0], profile);
    }

    public String q() {
        return (String) this.f6039m.getValue(this, u[1]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, u[6], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6041o.setValue(this, u[3], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6040n.setValue(this, u[2], str);
    }

    public String s1() {
        return (String) this.f6041o.getValue(this, u[3]);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6042p.setValue(this, u[4], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6043q.setValue(this, u[5], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6039m.setValue(this, u[1], str);
    }

    public String y1() {
        return (String) this.f6042p.getValue(this, u[4]);
    }

    public r<List<Guardian>> getGuardianList() {
        return this.f6037k;
    }
}
