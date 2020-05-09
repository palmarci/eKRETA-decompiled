package p289hu.ekreta.ellenorzo.profile.detail;

import java.util.List;
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
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Guardian;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4667b;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u00106\u001a\u000207H\u0016R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0014\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R/\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\f\u001a\u0004\u0018\u00010+8V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0014\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0014\u001a\u0004\b3\u0010\u0010\"\u0004\b4\u0010\u0012¨\u00068"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "<set-?>", "", "address", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "address$delegate", "Lkotlin/properties/ReadWriteProperty;", "birthDate", "getBirthDate", "setBirthDate", "birthDate$delegate", "birthName", "getBirthName", "setBirthName", "birthName$delegate", "birthPlace", "getBirthPlace", "setBirthPlace", "birthPlace$delegate", "guardianList", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/profile/Guardian;", "getGuardianList", "()Landroidx/lifecycle/MutableLiveData;", "mothersName", "getMothersName", "setMothersName", "mothersName$delegate", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setProfile", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "profile$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "killRefreshToken", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl */
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl extends DataBindingViewModel implements ProfileDetailViewModel {

    /* renamed from: t */
    public static final /* synthetic */ KProperty[] f14578t;

    /* renamed from: j */
    public final C3824r<List<Guardian>> f14579j = new C3824r<>();

    /* renamed from: k */
    public final ReadWriteProperty f14580k;

    /* renamed from: l */
    public final ReadWriteProperty f14581l;

    /* renamed from: m */
    public final ReadWriteProperty f14582m;

    /* renamed from: n */
    public final ReadWriteProperty f14583n;

    /* renamed from: o */
    public final ReadWriteProperty f14584o;

    /* renamed from: p */
    public final ReadWriteProperty f14585p;

    /* renamed from: q */
    public final ReadWriteProperty f14586q;

    /* renamed from: r */
    public final AuthenticationService f14587r;

    /* renamed from: s */
    public final ProfileRepository f14588s;

    static {
        Class<ProfileDetailViewModelImpl> cls = ProfileDetailViewModelImpl.class;
        f14578t = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), Param.PROFILE, "getProfile()Lhu/ekreta/ellenorzo/profile/Profile;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthName", "getBirthName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthDate", "getBirthDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "birthPlace", "getBirthPlace()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mothersName", "getMothersName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "address", "getAddress()Ljava/lang/String;"))};
    }

    public ProfileDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14587r = authenticationService;
        this.f14588s = profileRepository;
        Delegates delegates = Delegates.INSTANCE;
        this.f14580k = new ProfileDetailViewModelImpl$$special$$inlined$observable$1(null, null, this);
        this.f14581l = DataBindingViewModel.boundString$default(this, this, 24, null, null, 6, null);
        this.f14582m = DataBindingViewModel.boundString$default(this, this, 10, null, null, 6, null);
        this.f14583n = DataBindingViewModel.boundString$default(this, this, 107, null, null, 6, null);
        this.f14584o = DataBindingViewModel.boundString$default(this, this, 43, null, null, 6, null);
        this.f14585p = DataBindingViewModel.boundString$default(this, this, 26, null, null, 6, null);
        this.f14586q = DataBindingViewModel.boundString$default(this, this, 55, null, null, 6, null);
    }

    /* renamed from: C1 */
    public String mo14224C1() {
        return (String) this.f14585p.getValue(this, f14578t[5]);
    }

    /* renamed from: H0 */
    public String mo14225H0() {
        return (String) this.f14582m.getValue(this, f14578t[2]);
    }

    /* renamed from: P1 */
    public Profile mo14233P1() {
        return (Profile) this.f14580k.getValue(this, f14578t[0]);
    }

    /* renamed from: c */
    public void mo14226c(Profile profile) {
        this.f14580k.setValue(this, f14578t[0], profile);
    }

    /* renamed from: m1 */
    public String mo14228m1() {
        return (String) this.f14583n.getValue(this, f14578t[3]);
    }

    /* renamed from: q */
    public String mo14229q() {
        return (String) this.f14581l.getValue(this, f14578t[1]);
    }

    /* renamed from: q1 */
    public String mo14230q1() {
        return (String) this.f14584o.getValue(this, f14578t[4]);
    }

    /* renamed from: r */
    public void mo14234r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14586q.setValue(this, f14578t[6], str);
    }

    /* renamed from: s */
    public void mo14235s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14583n.setValue(this, f14578t[3], str);
    }

    /* renamed from: t */
    public void mo14236t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14582m.setValue(this, f14578t[2], str);
    }

    /* renamed from: u */
    public void mo14237u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14584o.setValue(this, f14578t[4], str);
    }

    /* renamed from: v */
    public void mo14238v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14585p.setValue(this, f14578t[5], str);
    }

    /* renamed from: w */
    public void mo14239w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14581l.setValue(this, f14578t[1], str);
    }

    /* renamed from: w1 */
    public void mo14231w1() {
        Profile P1 = mo14233P1();
        if (P1 != null) {
            C4667b a = this.f14587r.mo11511a(P1).mo16975a(C5041a.m16999a());
            Intrinsics.checkExpressionValueIsNotNull(a, "authenticationService\n  …dSchedulers.mainThread())");
            mo16413a(C4998b.m16838a(a, (Function1<? super Throwable, Unit>) new C4316x149fbf2c<Object,Unit>(this), (Function0<Unit>) new C4317x149fbf2d<Unit>(this)));
        }
    }

    /* renamed from: z1 */
    public String mo14232z1() {
        return (String) this.f14586q.getValue(this, f14578t[6]);
    }

    public C3824r<List<Guardian>> getGuardianList() {
        return this.f14579j;
    }
}
