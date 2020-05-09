package p289hu.ekreta.ellenorzo.authentication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p026d.p027a.p028a.C0089d;
import p289hu.ekreta.ellenorzo.login.LoginRequest;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileService;
import p289hu.ekreta.ellenorzo.profile.UpdateProfileStrategy;
import p289hu.ekreta.ellenorzo.rest.Idp;
import p289hu.ekreta.ellenorzo.rest.Idp.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.Idp.Response;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4662b;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001EBT\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0013\b\u0001\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J#\u0010-\u001a\u0004\u0018\u00010\u00102\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/\"\u000200H\u0002¢\u0006\u0002\u00101J\u0018\u00102\u001a\n \u001e*\u0004\u0018\u000103032\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u00104\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u0010\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u00109\u001a\u00020*H\u0016J\b\u0010:\u001a\u00020*H\u0002J\u0014\u0010;\u001a\u000200*\u00020<2\u0006\u0010=\u001a\u000200H\u0002J\u0016\u0010>\u001a\u0004\u0018\u000100*\u00020<2\u0006\u0010=\u001a\u000200H\u0002JZ\u0010?\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010%0% \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010%0%\u0018\u00010$0$*\b\u0012\u0004\u0012\u00020@0$2\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\n\b\u0002\u0010D\u001a\u0004\u0018\u000100H\u0002R\u0019\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8FX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "idp", "Lhu/ekreta/ellenorzo/rest/Idp;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "schoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "profileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "updateProfileStrategy", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "authorizedRoles", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "Lkotlin/jvm/JvmSuppressWildcards;", "ignore", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "(Lhu/ekreta/ellenorzo/rest/Idp;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;Lhu/ekreta/ellenorzo/profile/ProfileService;Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Ljava/util/List;Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "extendTokenRequestSubject", "Lio/reactivex/subjects/Subject;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl$ExtendTokenRequest;", "getIgnore", "()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "pendingAuthenticationSubject", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "state", "getState", "()Lio/reactivex/Observable;", "extendToken", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getSupportedRole", "roles", "", "", "([Ljava/lang/String;)Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "killRefreshToken", "Lio/reactivex/Completable;", "login", "loginRequest", "Lhu/ekreta/ellenorzo/login/LoginRequest;", "savePassword", "", "logout", "tryExtendActiveAuthentication", "getRole", "Lcom/auth0/android/jwt/JWT;", "name", "getString", "handleIdpResponse", "Lhu/ekreta/ellenorzo/rest/Idp$Response;", "instituteUrl", "userName", "instituteName", "password", "ExtendTokenRequest", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl */
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl implements AuthenticationService {

    /* renamed from: a */
    public final C4662b f11208a = new C4662b();

    /* renamed from: b */
    public final C5027n<AuthenticationState> f11209b;

    /* renamed from: c */
    public final C5021d<C5027n<AuthenticationState>> f11210c;

    /* renamed from: d */
    public final C5021d<ExtendTokenRequest> f11211d;

    /* renamed from: e */
    public final Idp f11212e;

    /* renamed from: f */
    public final ProfileRepository f11213f;

    /* renamed from: g */
    public final SchoolYearCalendarRepository f11214g;

    /* renamed from: h */
    public final ProfileService f11215h;

    /* renamed from: i */
    public final UpdateProfileStrategy f11216i;

    /* renamed from: j */
    public final DateTimeFactory f11217j;

    /* renamed from: k */
    public final List<SupportedRole> f11218k;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl$ExtendTokenRequest;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$ExtendTokenRequest */
    /* compiled from: AuthenticationServiceImpl.kt */
    public static final class ExtendTokenRequest {

        /* renamed from: a */
        public final Profile f11226a;

        public ExtendTokenRequest(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
            this.f11226a = profile;
        }

        public static /* synthetic */ ExtendTokenRequest copy$default(ExtendTokenRequest extendTokenRequest, Profile profile, int i, Object obj) {
            if ((i & 1) != 0) {
                profile = extendTokenRequest.f11226a;
            }
            return extendTokenRequest.mo11535a(profile);
        }

        /* renamed from: a */
        public final ExtendTokenRequest mo11535a(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
            return new ExtendTokenRequest(profile);
        }

        /* renamed from: a */
        public final Profile mo11536a() {
            return this.f11226a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f11226a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.ExtendTokenRequest) r2).f11226a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.ExtendTokenRequest
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$ExtendTokenRequest r2 = (p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.ExtendTokenRequest) r2
                hu.ekreta.ellenorzo.profile.Profile r0 = r1.f11226a
                hu.ekreta.ellenorzo.profile.Profile r2 = r2.f11226a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.ExtendTokenRequest.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Profile profile = this.f11226a;
            if (profile != null) {
                return profile.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("ExtendTokenRequest(profile=");
            a.append(this.f11226a);
            a.append(")");
            return a.toString();
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11227a = new int[SupportedRole.values().length];

        static {
            f11227a[SupportedRole.Guardian.ordinal()] = 1;
            f11227a[SupportedRole.Student.ordinal()] = 2;
        }
    }

    static {
        new KProperty[1][0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AuthenticationServiceImpl.class), "logger", "getLogger()Lorg/slf4j/Logger;"));
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r11v1, types: [hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthenticationServiceImpl(p289hu.ekreta.ellenorzo.rest.Idp r7, p289hu.ekreta.ellenorzo.profile.ProfileRepository r8, p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository r9, p289hu.ekreta.ellenorzo.profile.ProfileService r10, p289hu.ekreta.ellenorzo.profile.UpdateProfileStrategy r11, p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory r12, java.util.List<p289hu.ekreta.ellenorzo.authentication.SupportedRole> r13, p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer r14) {
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
            r6.f11212e = r7
            r6.f11213f = r8
            r6.f11214g = r9
            r6.f11215h = r10
            r6.f11216i = r11
            r6.f11217j = r12
            r6.f11218k = r13
            k.b.a0.b r7 = new k.b.a0.b
            r7.<init>()
            r6.f11208a = r7
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$logger$2 r7 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$logger$2.INSTANCE
            kotlin.LazyKt__LazyJVMKt.lazy(r7)
            k.b.h0.b r7 = new k.b.h0.b
            r7.<init>()
            java.lang.String r8 = "PublishSubject.create()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.f11210c = r7
            k.b.h0.b r7 = new k.b.h0.b
            r7.<init>()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            r6.f11211d = r7
            k.b.h0.d<k.b.n<hu.ekreta.ellenorzo.authentication.AuthenticationState>> r7 = r6.f11210c
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$1 r8 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40381.INSTANCE
            k.b.n r7 = r7.mo17252k(r8)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$2 r8 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$2
            r8.<init>(r6)
            k.b.n r7 = r7.mo17233c(r8)
            r8 = 1
            k.b.d0.a r7 = r7.mo17219b(r8)
            r7.mo17160l()
            k.b.c0.e.e.e0 r9 = new k.b.c0.e.e.e0
            r9.<init>(r7)
            k.b.n r7 = p300k.p313b.p314a0.C4664d.m16039a(r9)
            k.b.t r9 = p300k.p313b.p338z.p339a.C5041a.m16999a()
            k.b.n r7 = r7.mo17214a(r9)
            java.lang.String r9 = "pendingAuthenticationSub…dSchedulers.mainThread())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r9)
            r6.f11209b = r7
            k.b.h0.d<hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$ExtendTokenRequest> r7 = r6.f11211d
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$4 r9 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40464.INSTANCE
            k.b.n r0 = r7.mo17246g(r9)
            java.lang.String r7 = "extendTokenRequestSubjec…      .map { it.profile }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$5 r3 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40475.INSTANCE
            r4 = 2
            r5 = 0
            k.b.n r7 = p289hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default(r0, r1, r2, r3, r4, r5)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$6 r9 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$6
            r9.<init>(r6)
            r10 = 0
            k.b.n r0 = r7.mo17209a(r9, r10, r8)
            java.lang.String r7 = "extendTokenRequestSubjec…\n            }, false, 1)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$7 r3 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40507.INSTANCE
            k.b.n r7 = p289hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default(r0, r1, r2, r3, r4, r5)
            kotlin.reflect.KProperty1 r9 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40518.INSTANCE
            if (r9 == 0) goto L_0x00cd
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0 r11 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$sam$io_reactivex_functions_Function$0
            r11.<init>(r9)
            r9 = r11
        L_0x00cd:
            k.b.b0.h r9 = (p300k.p313b.p315b0.C4675h) r9
            k.b.n r0 = r7.mo17225b(r9)
            java.lang.String r7 = "extendTokenRequestSubjec…ed(Profile::refreshToken)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r7)
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$9 r3 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C40529.INSTANCE
            r4 = 2
            r5 = 0
            k.b.n r7 = p289hu.ekreta.ellenorzo.util.DebugHelpersKt.printOnEach$default(r0, r1, r2, r3, r4, r5)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$10 r9 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$10
            r9.<init>(r6)
            k.b.n r7 = r7.mo17209a(r9, r10, r8)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$11 r8 = new hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$11
            r8.<init>(r6)
            hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$12 r9 = p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.C404412.INSTANCE
            k.b.a0.c r7 = r7.mo17192a(r8, r9)
            java.lang.String r8 = "extendTokenRequestSubjec…         {}\n            )"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            k.b.a0.b r8 = r6.f11208a
            p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14660a(r7, r8)
            k.b.h0.d<k.b.n<hu.ekreta.ellenorzo.authentication.AuthenticationState>> r7 = r6.f11210c
            hu.ekreta.ellenorzo.authentication.LoggingIn r8 = p289hu.ekreta.ellenorzo.authentication.LoggingIn.INSTANCE
            k.b.n r8 = p300k.p313b.C5027n.m16898d(r8)
            r7.mo17017a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.<init>(hu.ekreta.ellenorzo.rest.Idp, hu.ekreta.ellenorzo.profile.ProfileRepository, hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository, hu.ekreta.ellenorzo.profile.ProfileService, hu.ekreta.ellenorzo.profile.UpdateProfileStrategy, hu.ekreta.ellenorzo.util.datetime.DateTimeFactory, java.util.List, hu.ekreta.ellenorzo.util.firebase.FirebaseContainer):void");
    }

    /* renamed from: a */
    public final C5027n<AuthenticationState> mo11519a(C5027n<Response> nVar, String str, String str2, String str3, String str4) {
        AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$1 = new AuthenticationServiceImpl$handleIdpResponse$1(this, str, str2, str3, str4);
        return nVar.mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) authenticationServiceImpl$handleIdpResponse$1);
    }

    /* renamed from: b */
    public void mo11513b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        this.f11211d.mo17017a(new ExtendTokenRequest(profile));
    }

    /* renamed from: c */
    public void mo11514c(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        mo11513b(profile);
    }

    /* renamed from: l */
    public C5027n<AuthenticationState> mo11515l() {
        return this.f11209b;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p300k.p313b.C5027n<p289hu.ekreta.ellenorzo.profile.Profile> mo11516m() {
        /*
            r3 = this;
            k.b.n r0 = r3.mo11515l()
            java.lang.Class<hu.ekreta.ellenorzo.authentication.LoggedIn> r1 = p289hu.ekreta.ellenorzo.authentication.LoggedIn.class
            k.b.n r0 = r0.mo17221b(r1)
            kotlin.reflect.KProperty1 r1 = p289hu.ekreta.ellenorzo.authentication.AuthenticationService$loggedInProfileObservable$1.INSTANCE
            if (r1 == 0) goto L_0x0014
            hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.authentication.AuthenticationService$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x0014:
            k.b.b0.h r1 = (p300k.p313b.p315b0.C4675h) r1
            k.b.n r0 = r0.mo17246g(r1)
            java.lang.String r1 = "state\n        .ofType(Lo…  .map(LoggedIn::profile)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.mo11516m():k.b.n");
    }

    /* renamed from: a */
    public void mo11512a(LoginRequest loginRequest, boolean z) {
        LoginRequest loginRequest2 = loginRequest;
        Intrinsics.checkParameterIsNotNull(loginRequest2, "loginRequest");
        C5027n login$default = DefaultImpls.login$default(this.f11212e, loginRequest.mo13108c(), loginRequest.mo13107b(), loginRequest.mo13105a().mo13066b(), null, null, 24, null);
        String e = loginRequest.mo13105a().mo13069e();
        String c = loginRequest.mo13108c();
        String c2 = loginRequest.mo13105a().mo13067c();
        String b = loginRequest.mo13107b();
        if (!z) {
            b = null;
        }
        this.f11210c.mo17017a(mo11519a(login$default, e, c, c2, b).mo17233c((C4673f<? super T>) new AuthenticationServiceImpl$login$2<Object>(this)).mo17250i(new AuthenticationServiceImpl$login$3(loginRequest2)).mo17231c(LoggingIn.INSTANCE));
    }

    /* renamed from: b */
    public final String mo11520b(C0089d dVar, String str) {
        return dVar.mo124b(str).mo120a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r3 != null) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11518a(p000a.p026d.p027a.p028a.C0089d r3, java.lang.String r4) {
        /*
            r2 = this;
            a.d.a.a.b r0 = r3.mo124b(r4)
            java.lang.String r0 = r0.mo120a()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0030
            a.d.a.a.b r3 = r3.mo124b(r4)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Object[] r3 = r3.mo121a(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String r4 = "roles"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            hu.ekreta.ellenorzo.authentication.SupportedRole r3 = r2.mo11517a(r3)
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r3.mo11567a()
            return r3
        L_0x002f:
            return r1
        L_0x0030:
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            hu.ekreta.ellenorzo.authentication.SupportedRole r3 = r2.mo11517a(r3)
            if (r3 == 0) goto L_0x0043
            java.lang.String r3 = r3.mo11567a()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = r1
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl.mo11518a(a.d.a.a.d, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final SupportedRole mo11517a(String... strArr) {
        Object obj;
        SupportedRole[] values = SupportedRole.values();
        ArrayList arrayList = new ArrayList();
        for (SupportedRole supportedRole : values) {
            if (ArraysKt___ArraysKt.contains((T[]) strArr, supportedRole.mo11567a())) {
                arrayList.add(supportedRole);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int d = ((SupportedRole) obj).mo11568d();
                do {
                    Object next = it.next();
                    int d2 = ((SupportedRole) next).mo11568d();
                    if (d < d2) {
                        obj = next;
                        d = d2;
                    }
                } while (it.hasNext());
            }
        }
        return (SupportedRole) obj;
    }

    /* renamed from: a */
    public C4667b mo11511a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return DefaultImpls.extendToken$default(this.f11212e, profile.mo14063u(), null, null, 6, null).mo17241e();
    }
}
