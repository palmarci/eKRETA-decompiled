package hu.ekreta.ellenorzo.authentication;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.login.LoginRequest;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.profile.ProfileService;
import hu.ekreta.ellenorzo.profile.UpdateProfileStrategy;
import hu.ekreta.ellenorzo.rest.Idp;
import hu.ekreta.ellenorzo.rest.idp.AuthenticationDto;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k.b.a0.b;
import k.b.b0.h;
import k.b.h0.d;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001EBT\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0013\b\u0001\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J#\u0010-\u001a\u0004\u0018\u00010\u00102\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200H\u0002¢\u0006\u0002\u00101J\u0018\u00102\u001a\n \u001e*\u0004\u0018\u000103032\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00104\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020*H\u0016J\b\u0010:\u001a\u00020*H\u0002J\u0014\u0010;\u001a\u000200*\u00020<2\u0006\u0010=\u001a\u000200H\u0002J\u0016\u0010>\u001a\u0004\u0018\u000100*\u00020<2\u0006\u0010=\u001a\u000200H\u0002JZ\u0010?\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010%0% \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010%0%\u0018\u00010$0$*\b\u0012\u0004\u0012\u00020@0$2\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\n\b\u0002\u0010D\u001a\u0004\u0018\u000100H\u0002R\u0019\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8FX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "idp", "Lhu/ekreta/ellenorzo/rest/Idp;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "schoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "profileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "updateProfileStrategy", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "authorizedRoles", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "Lkotlin/jvm/JvmSuppressWildcards;", "ignore", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "(Lhu/ekreta/ellenorzo/rest/Idp;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;Lhu/ekreta/ellenorzo/profile/ProfileService;Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Ljava/util/List;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "extendTokenRequestSubject", "Lio/reactivex/subjects/Subject;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl$ExtendTokenRequest;", "getIgnore", "()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "pendingAuthenticationSubject", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "state", "getState", "()Lio/reactivex/Observable;", "extendToken", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getSupportedRole", "roles", "", "", "([Ljava/lang/String;)Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "killRefreshToken", "Lio/reactivex/Completable;", "login", "loginRequest", "Lhu/ekreta/ellenorzo/login/LoginRequest;", "savePassword", "", "logout", "tryExtendActiveAuthentication", "getRole", "Lcom/auth0/android/jwt/JWT;", "name", "getString", "handleIdpResponse", "Lhu/ekreta/ellenorzo/rest/idp/AuthenticationDto;", "instituteUrl", "userName", "instituteName", "password", "ExtendTokenRequest", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl implements AuthenticationService {

    /* renamed from: a  reason: collision with root package name */
    public final b f5058a = new b();
    public final n<AuthenticationState> b;
    public final d<n<AuthenticationState>> c;

    /* renamed from: d  reason: collision with root package name */
    public final d<ExtendTokenRequest> f5059d;
    public final Idp e;
    public final ProfileRepository f;

    /* renamed from: g  reason: collision with root package name */
    public final SchoolYearCalendarRepository f5060g;

    /* renamed from: h  reason: collision with root package name */
    public final ProfileService f5061h;

    /* renamed from: i  reason: collision with root package name */
    public final UpdateProfileStrategy f5062i;

    /* renamed from: j  reason: collision with root package name */
    public final DateTimeFactory f5063j;

    /* renamed from: k  reason: collision with root package name */
    public final List<SupportedRole> f5064k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl$ExtendTokenRequest;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AuthenticationServiceImpl.kt */
    public static final class ExtendTokenRequest {

        /* renamed from: a  reason: collision with root package name */
        public final Profile f5065a;

        public ExtendTokenRequest(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
            this.f5065a = profile;
        }

        public static /* synthetic */ ExtendTokenRequest copy$default(ExtendTokenRequest extendTokenRequest, Profile profile, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                profile = extendTokenRequest.f5065a;
            }
            return extendTokenRequest.a(profile);
        }

        public final ExtendTokenRequest a(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
            return new ExtendTokenRequest(profile);
        }

        public final Profile a() {
            return this.f5065a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ExtendTokenRequest) && Intrinsics.areEqual((Object) this.f5065a, (Object) ((ExtendTokenRequest) obj).f5065a);
            }
            return true;
        }

        public int hashCode() {
            Profile profile = this.f5065a;
            if (profile != null) {
                return profile.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a2 = a.a("ExtendTokenRequest(profile=");
            a2.append(this.f5065a);
            a2.append(")");
            return a2.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5066a = new int[SupportedRole.values().length];

        static {
            f5066a[SupportedRole.Guardian.ordinal()] = 1;
            f5066a[SupportedRole.Student.ordinal()] = 2;
        }
    }

    static {
        new KProperty[1][0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AuthenticationServiceImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"));
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationServiceImpl(hu.ekreta.ellenorzo.rest.Idp r7, hu.ekreta.ellenorzo.profile.ProfileRepository r8, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository r9, hu.ekreta.ellenorzo.profile.ProfileService r10, hu.ekreta.ellenorzo.profile.UpdateProfileStrategy r11, hu.ekreta.ellenorzo.util.datetime.DateTimeFactory r12, java.util.List<hu.ekreta.ellenorzo.authentication.SupportedRole> r13, hu.ekreta.ellenorzo.util.firebase.FirebaseContainer r14) {
        /*
            r6 = this;
            java.lang.String r0 = "idp"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "profileRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "schoolYearCalendarRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "profileService"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "updateProfileStrategy"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "dateTimeFactory"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "authorizedRoles"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            java.lang.String r0 = "ignore"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            r6.<init>()
            r6.e = r7
            r6.f = r8
            r6.f5060g = r9
            r6.f5061h = r10
            r6.f5062i = r11
            r6.f5063j = r12
            r6.f5064k = r13
            k.b.a0.b r7 = new k.b.a0.b
            r7.<init>()
            r6.f5058a = r7
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$logger$2 r7 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$logger$2.INSTANCE
            kotlin.LazyKt__LazyJVMKt.lazy(r7)
            k.b.h0.b r7 = new k.b.h0.b
            r7.<init>()
            java.lang.String r8 = "PublishSubject.create()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.c = r7
            k.b.h0.b r7 = new k.b.h0.b
            r7.<init>()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.f5059d = r7
            k.b.h0.d<k.b.n<hu.ekreta.ellenorzo.authentication.AuthenticationState>> r7 = r6.c
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$1 r8 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass1.INSTANCE
            k.b.n r7 = r7.k(r8)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$2 r8 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$2
            r8.<init>(r6)
            k.b.n r7 = r7.c(r8)
            r8 = 1
            k.b.d0.a r7 = r7.b((int) r8)
            r7.l()
            k.b.c0.e.e.e0 r9 = new k.b.c0.e.e.e0
            r9.<init>(r7)
            k.b.n r7 = k.b.a0.d.a(r9)
            k.b.t r9 = k.b.z.a.a.a()
            k.b.n r7 = r7.a((k.b.t) r9)
            java.lang.String r9 = "pendingAuthenticationSub…dSchedulers.mainThread())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r9)
            r6.b = r7
            k.b.h0.d<hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$ExtendTokenRequest> r7 = r6.f5059d
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$4 r9 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass4.INSTANCE
            k.b.n r0 = r7.g(r9)
            java.lang.String r7 = "extendTokenRequestSubjec…      .map { it.profile }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$5 r3 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass5.INSTANCE
            r4 = 2
            r5 = 0
            k.b.n r7 = hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default((k.b.n) r0, (java.lang.Integer) r1, (java.lang.String) r2, (kotlin.jvm.functions.Function1) r3, (int) r4, (java.lang.Object) r5)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$6 r9 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$6
            r9.<init>(r6)
            r10 = 0
            k.b.n r0 = r7.a(r9, (boolean) r10, (int) r8)
            java.lang.String r7 = "extendTokenRequestSubjec…\n            }, false, 1)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$7 r3 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass7.INSTANCE
            k.b.n r7 = hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default((k.b.n) r0, (java.lang.Integer) r1, (java.lang.String) r2, (kotlin.jvm.functions.Function1) r3, (int) r4, (java.lang.Object) r5)
            kotlin.reflect.KProperty1 r9 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass8.INSTANCE
            if (r9 == 0) goto L_0x00cd
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0 r11 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0
            r11.<init>(r9)
            r9 = r11
        L_0x00cd:
            k.b.b0.h r9 = (k.b.b0.h) r9
            k.b.n r0 = r7.b(r9)
            java.lang.String r7 = "extendTokenRequestSubjec…ed(Profile::refreshToken)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$9 r3 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass9.INSTANCE
            r4 = 2
            r5 = 0
            k.b.n r7 = hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default((k.b.n) r0, (java.lang.Integer) r1, (java.lang.String) r2, (kotlin.jvm.functions.Function1) r3, (int) r4, (java.lang.Object) r5)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$10 r9 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$10
            r9.<init>(r6)
            k.b.n r7 = r7.a(r9, (boolean) r10, (int) r8)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$11 r8 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$11
            r8.<init>(r6)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$12 r9 = hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.AnonymousClass12.INSTANCE
            k.b.a0.c r7 = r7.a(r8, (k.b.b0.f<? super java.lang.Throwable>) r9)
            java.lang.String r8 = "extendTokenRequestSubjec…         {}\n            )"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            k.b.a0.b r8 = r6.f5058a
            hu.ekreta.ellenorzo.util.ExtensionsKt.a((k.b.a0.c) r7, (k.b.a0.b) r8)
            k.b.h0.d<k.b.n<hu.ekreta.ellenorzo.authentication.AuthenticationState>> r7 = r6.c
            hu.ekreta.ellenorzo.authentication.LoggingIn r8 = hu.ekreta.ellenorzo.authentication.LoggingIn.INSTANCE
            k.b.n r8 = k.b.n.d(r8)
            r7.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.<init>(hu.ekreta.ellenorzo.rest.Idp, hu.ekreta.ellenorzo.profile.ProfileRepository, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository, hu.ekreta.ellenorzo.profile.ProfileService, hu.ekreta.ellenorzo.profile.UpdateProfileStrategy, hu.ekreta.ellenorzo.util.datetime.DateTimeFactory, java.util.List, hu.ekreta.ellenorzo.util.firebase.FirebaseContainer):void");
    }

    public final n<AuthenticationState> a(n<AuthenticationDto> nVar, String str, String str2, String str3, String str4) {
        return nVar.c((h<? super AuthenticationDto, ? extends q<? extends R>>) new AuthenticationServiceImpl$handleIdpResponse$1(this, str, str2, str3, str4));
    }

    public void b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        this.f5059d.a(new ExtendTokenRequest(profile));
    }

    public n<AuthenticationState> l() {
        return this.b;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.b.n<hu.ekreta.ellenorzo.profile.Profile> m() {
        /*
            r3 = this;
            k.b.n r0 = r3.l()
            java.lang.Class<hu.ekreta.ellenorzo.authentication.LoggedIn> r1 = hu.ekreta.ellenorzo.authentication.LoggedIn.class
            k.b.n r0 = r0.b(r1)
            kotlin.reflect.KProperty1 r1 = hu.ekreta.ellenorzo.authentication.AuthenticationService$loggedInProfileObservable$1.INSTANCE
            if (r1 == 0) goto L_0x0014
            hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x0014:
            k.b.b0.h r1 = (k.b.b0.h) r1
            k.b.n r0 = r0.g(r1)
            java.lang.String r1 = "state\n        .ofType(Lo…  .map(LoggedIn::profile)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.m():k.b.n");
    }

    public void a(LoginRequest loginRequest, boolean z) {
        LoginRequest loginRequest2 = loginRequest;
        Intrinsics.checkParameterIsNotNull(loginRequest2, "loginRequest");
        n login$default = Idp.DefaultImpls.login$default(this.e, loginRequest.c(), loginRequest.b(), loginRequest.a().getInstituteCode(), (String) null, (String) null, 24, (Object) null);
        String url = loginRequest.a().getUrl();
        String c2 = loginRequest.c();
        String name = loginRequest.a().getName();
        String b2 = loginRequest.b();
        if (!z) {
            b2 = null;
        }
        this.c.a(a(login$default, url, c2, name, b2).c(new AuthenticationServiceImpl$login$2(this)).i(new AuthenticationServiceImpl$login$3(loginRequest2)).c(LoggingIn.INSTANCE));
    }

    public final String b(a.d.a.a.d dVar, String str) {
        return dVar.b(str).a();
    }

    public final String a(a.d.a.a.d dVar, String str) {
        String a2;
        String a3 = dVar.b(str).a();
        if (a3 == null) {
            String[] strArr = (String[]) dVar.b(str).a(String.class);
            Intrinsics.checkExpressionValueIsNotNull(strArr, "roles");
            SupportedRole a4 = a((String[]) Arrays.copyOf(strArr, strArr.length));
            if (a4 != null) {
                return a4.a();
            }
            return "";
        }
        SupportedRole a5 = a(a3);
        if (a5 == null || (a2 = a5.a()) == null) {
            return "";
        }
        return a2;
    }

    public final SupportedRole a(String... strArr) {
        Object obj;
        SupportedRole[] values = SupportedRole.values();
        ArrayList arrayList = new ArrayList();
        for (SupportedRole supportedRole : values) {
            if (ArraysKt___ArraysKt.contains((T[]) strArr, supportedRole.a())) {
                arrayList.add(supportedRole);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int d2 = ((SupportedRole) obj).d();
                do {
                    Object next = it.next();
                    int d3 = ((SupportedRole) next).d();
                    if (d2 < d3) {
                        obj = next;
                        d2 = d3;
                    }
                } while (it.hasNext());
            }
        }
        return (SupportedRole) obj;
    }

    public k.b.b a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return Idp.DefaultImpls.extendToken$default(this.e, profile.u(), (String) null, (String) null, 6, (Object) null).e();
    }
}
