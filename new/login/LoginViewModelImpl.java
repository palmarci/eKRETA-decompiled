package hu.ekreta.ellenorzo.login;

import a.k.a.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import h.m.d.d;
import h.p.h;
import h.p.t;
import hu.ekreta.ellenorzo.BuildConfig;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.authentication.LoggedIn;
import hu.ekreta.ellenorzo.authentication.LoggingIn;
import hu.ekreta.ellenorzo.authentication.LoginFailCause;
import hu.ekreta.ellenorzo.authentication.LoginFailed;
import hu.ekreta.ellenorzo.authentication.TokenExpired;
import hu.ekreta.ellenorzo.institute.InstituteRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverChecker;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import k.b.b0.f;
import k.b.f0.b;
import k.b.j;
import k.b.n;
import k.b.u;
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
import kotlin.text.StringsKt__StringsJVMKt;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\u0010\u0018J\b\u0010M\u001a\u00020NH\u0017J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020%H\u0002J\b\u0010Q\u001a\u00020NH\u0016J\b\u0010R\u001a\u00020NH\u0016J\b\u0010S\u001a\u00020NH\u0007J\b\u0010T\u001a\u00020NH\u0016J\b\u0010U\u001a\u00020NH\u0016J\b\u0010V\u001a\u00020NH\u0016J\b\u0010W\u001a\u00020NH\u0016J\u0014\u0010X\u001a\u00020N2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010ZH\u0002R+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010!\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00102\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR+\u00106\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b9\u0010 \u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010:\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R+\u0010>\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\bA\u0010 \u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R/\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0019\u001a\u0004\u0018\u00010B8B@BX\u0002¢\u0006\u0012\n\u0004\bH\u0010 \u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010I\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00128V@VX\u0002¢\u0006\u0012\n\u0004\bL\u0010 \u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001e¨\u0006["}, d2 = {"Lhu/ekreta/ellenorzo/login/LoginViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/login/LoginViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "instituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "appVersionString", "", "powerSaverChecker", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "rxActivityResultProvider", "Ljavax/inject/Provider;", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/institute/InstituteRepository;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Ljava/lang/String;Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;Ljavax/inject/Provider;)V", "<set-?>", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "appVersion$delegate", "Lkotlin/properties/ReadWriteProperty;", "institutePickerButtonText", "getInstitutePickerButtonText", "setInstitutePickerButtonText", "institutePickerButtonText$delegate", "", "loginEnabled", "getLoginEnabled", "()Z", "setLoginEnabled", "(Z)V", "loginEnabled$delegate", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "password", "getPassword", "setPassword", "password$delegate", "passwordShowable", "getPasswordShowable", "setPasswordShowable", "passwordShowable$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "savePassword", "getSavePassword", "setSavePassword", "savePassword$delegate", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "selectedInstitute", "getSelectedInstitute", "()Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "setSelectedInstitute", "(Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;)V", "selectedInstitute$delegate", "userId", "getUserId", "setUserId", "userId$delegate", "checkPowerSaverMode", "", "createOnFocusChangeListener", "hasCredentials", "login", "onBackPressed", "onStartActivity", "startFAQActivity", "startForgottenPasswordActivity", "startInstitutePickerActivity", "startPrivacyPolicyActivity", "updateLoginEnabled", "ignore", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl extends DataBindingViewModel implements LoginViewModel {
    public static final /* synthetic */ KProperty[] B;
    public final a<c> A;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5715k = DataBindingViewModel.boundString$default(this, this, 58, (String) null, new LoginViewModelImpl$userId$2(this), 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f5716l;

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f5717m;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5718n;

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5719o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5720p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5721q;
    public final ReadWriteProperty r;
    public View.OnFocusChangeListener s;
    public final ReadWriteProperty t;
    public final Context u;
    public final ProfileRepository v;
    public final InstituteRepository w;
    public final AuthenticationService x;
    public final String y;
    public final PowerSaverChecker z;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5722a = new int[LoginFailCause.values().length];
        public static final /* synthetic */ int[] b = new int[LoginFailCause.values().length];

        static {
            f5722a[LoginFailCause.BadCredentials.ordinal()] = 1;
            f5722a[LoginFailCause.UnknownError.ordinal()] = 2;
            f5722a[LoginFailCause.NotSupportedRole.ordinal()] = 3;
            f5722a[LoginFailCause.NotEnoughPermission.ordinal()] = 4;
            f5722a[LoginFailCause.GuardianIsNotAuthenticated.ordinal()] = 5;
            f5722a[LoginFailCause.StudentIsNotAuthenticated.ordinal()] = 6;
            b[LoginFailCause.GuardianIsNotAuthenticated.ordinal()] = 1;
            b[LoginFailCause.StudentIsNotAuthenticated.ordinal()] = 2;
        }
    }

    static {
        Class<LoginViewModelImpl> cls = LoginViewModelImpl.class;
        B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "userId", "getUserId()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "password", "getPassword()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "institutePickerButtonText", "getInstitutePickerButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "loginEnabled", "getLoginEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "appVersion", "getAppVersion()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "savePassword", "getSavePassword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "passwordShowable", "getPasswordShowable()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "selectedInstitute", "getSelectedInstitute()Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, Context context, ProfileRepository profileRepository, InstituteRepository instituteRepository, AuthenticationService authenticationService, String str, PowerSaverChecker powerSaverChecker, a<c> aVar) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(instituteRepository, "instituteRepository");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(str, "appVersionString");
        Intrinsics.checkParameterIsNotNull(powerSaverChecker, "powerSaverChecker");
        Intrinsics.checkParameterIsNotNull(aVar, "rxActivityResultProvider");
        this.u = context;
        this.v = profileRepository;
        this.w = instituteRepository;
        this.x = authenticationService;
        this.y = str;
        this.z = powerSaverChecker;
        this.A = aVar;
        this.f5716l = DataBindingViewModel.boundString$default(this, this, 12, (String) null, new LoginViewModelImpl$password$2(this), 2, (Object) null);
        String string = this.u.getString(R.string.Button_SelectInstitute_Text);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…ton_SelectInstitute_Text)");
        this.f5717m = DataBindingViewModel.boundString$default(this, this, 35, string, (Function1) null, 4, (Object) null);
        this.f5718n = DataBindingViewModel.boundBoolean$default(this, this, 52, false, (Function1) null, 6, (Object) null);
        this.f5719o = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.f5720p = DataBindingViewModel.boundString$default(this, this, 2, (String) null, (Function1) null, 6, (Object) null);
        this.f5721q = DataBindingViewModel.boundBoolean$default(this, this, 74, true, (Function1) null, 4, (Object) null);
        this.r = DataBindingViewModel.boundBoolean$default(this, this, 105, false, (Function1) null, 4, (Object) null);
        this.s = new LoginViewModelImpl$createOnFocusChangeListener$1(this);
        Delegates delegates = Delegates.INSTANCE;
        this.t = new LoginViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
        k.b.a0.c e = this.x.l().d(1).e(new f<AuthenticationState>(this) {
            public final /* synthetic */ LoginViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(AuthenticationState authenticationState) {
                if (authenticationState instanceof TokenExpired) {
                    Profile a2 = ((TokenExpired) authenticationState).a();
                    this.c.b(a2.D());
                    LoginViewModelImpl loginViewModelImpl = this.c;
                    String s = a2.s();
                    if (s == null) {
                        s = "";
                    }
                    loginViewModelImpl.c(s);
                    LoginViewModelImpl loginViewModelImpl2 = this.c;
                    String s2 = a2.s();
                    boolean z = false;
                    loginViewModelImpl2.d(s2 == null || s2.length() == 0);
                    LoginViewModelImpl loginViewModelImpl3 = this.c;
                    String s3 = a2.s();
                    if (s3 == null || s3.length() == 0) {
                        z = true;
                    }
                    loginViewModelImpl3.a(!z);
                    LoginViewModelImpl loginViewModelImpl4 = this.c;
                    k.b.a0.c e = loginViewModelImpl4.w.c(a2.n()).d(1).e(new LoginViewModelImpl$1$$special$$inlined$let$lambda$1(this));
                    Intrinsics.checkExpressionValueIsNotNull(e, "instituteRepository\n    …tute = it.firstOrNull() }");
                    loginViewModelImpl4.a(e);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e, "authenticationService.st…          }\n            }");
        a(e);
        n<AuthenticationState> c = this.x.l().c(1);
        Intrinsics.checkExpressionValueIsNotNull(c, "authenticationService.state\n            .skip(1)");
        a(b.a(c, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl c;

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
        }, (Function0) null, new Function1<AuthenticationState, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(final AuthenticationState authenticationState) {
                int i2;
                this.c.e(Intrinsics.areEqual((Object) authenticationState, (Object) LoggingIn.INSTANCE));
                if (authenticationState instanceof LoginFailed) {
                    LoginFailed loginFailed = (LoginFailed) authenticationState;
                    if (loginFailed.c() == LoginFailCause.NetworkError) {
                        DataBindingViewModel.showSnackbar$default(this.c, R.string.network_error, 0, 2, (Object) null);
                        return;
                    }
                    LoginViewModelImpl loginViewModelImpl = this.c;
                    switch (WhenMappings.f5722a[loginFailed.c().ordinal()]) {
                        case 1:
                            i2 = R.string.bad_credentials;
                            break;
                        case 2:
                            i2 = R.string.unknown_error;
                            break;
                        case 3:
                            i2 = R.string.not_supported_profile;
                            break;
                        case 4:
                            i2 = R.string.no_right_to_use_app;
                            break;
                        case 5:
                            i2 = R.string.tutelary_is_not_authenticated;
                            break;
                        case 6:
                            i2 = R.string.student_is_not_authenticated;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    DataBindingViewModel.showAlert$default(loginViewModelImpl, i2, (Integer) null, new Function1<a.a.a.f, Unit>(this) {
                        public final /* synthetic */ AnonymousClass2 c;

                        {
                            this.c = r1;
                        }

                        public final void a(a.a.a.f fVar) {
                            Intrinsics.checkParameterIsNotNull(fVar, "<anonymous parameter 0>");
                            int i2 = WhenMappings.b[((LoginFailed) authenticationState).c().ordinal()];
                            if (i2 == 1) {
                                ExtensionsKt.a(this.c.c.u, BuildConfig.APPLICATION_ID);
                            } else if (i2 == 2) {
                                ExtensionsKt.a(this.c.c.u, "hu.ekreta.student");
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((a.a.a.f) obj);
                            return Unit.INSTANCE;
                        }
                    }, (Integer) null, (Function1) null, 26, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AuthenticationState) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        u<U> d2 = this.x.l().c(1).b(LoggedIn.class).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "authenticationService.st…          .firstOrError()");
        a(b.a(d2, (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl c;

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
        }, new Function1<LoggedIn, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl c;

            {
                this.c = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                LoggedIn loggedIn = (LoggedIn) obj;
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                this.c.W1();
            }
        }));
        q(this.u.getString(R.string.app_name) + ' ' + this.y);
    }

    public static /* synthetic */ void a(LoginViewModelImpl loginViewModelImpl, Object obj, int i2) {
        int i3 = i2 & 1;
        loginViewModelImpl.a2();
    }

    public String A() {
        return (String) this.f5717m.getValue(this, B[2]);
    }

    public void C() {
        InstituteDto Z1 = Z1();
        if (Z1 != null) {
            this.x.a(new LoginRequest(Z1, R(), G()), D());
        }
    }

    public boolean D() {
        return ((Boolean) this.f5721q.getValue(this, B[6])).booleanValue();
    }

    public String G() {
        return (String) this.f5716l.getValue(this, B[1]);
    }

    public void H() {
        b((Function1<? super Activity, ? extends Intent>) new LoginViewModelImpl$startPrivacyPolicyActivity$1(this));
    }

    public View.OnFocusChangeListener I() {
        return this.s;
    }

    public void K() {
        b((Function1<? super Activity, ? extends Intent>) new LoginViewModelImpl$startForgottenPasswordActivity$1(this));
    }

    public boolean L() {
        return ((Boolean) this.r.getValue(this, B[7])).booleanValue();
    }

    public boolean M() {
        return ((Boolean) this.f5718n.getValue(this, B[3])).booleanValue();
    }

    public String R() {
        return (String) this.f5715k.getValue(this, B[0]);
    }

    public void V() {
        a((Function1<? super d, Unit>) new LoginViewModelImpl$startInstitutePickerActivity$1(this));
    }

    public final InstituteDto Z1() {
        return (InstituteDto) this.t.getValue(this, B[8]);
    }

    public void a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5717m.setValue(this, B[2], str);
    }

    public void a(boolean z2) {
        this.f5721q.setValue(this, B[6], Boolean.valueOf(z2));
    }

    public final void a2() {
        boolean z2 = true;
        if (!(!StringsKt__StringsJVMKt.isBlank(R()) && !StringsKt__StringsJVMKt.isBlank(G())) || Z1() == null) {
            z2 = false;
        }
        c(z2);
    }

    public void b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5715k.setValue(this, B[0], str);
    }

    public void c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5716l.setValue(this, B[1], str);
    }

    public void c(boolean z2) {
        this.f5718n.setValue(this, B[3], Boolean.valueOf(z2));
    }

    @t(h.a.ON_CREATE)
    public void checkPowerSaverMode() {
        u<R> c = this.z.a().c(new LoginViewModelImpl$checkPowerSaverMode$1(this));
        Intrinsics.checkExpressionValueIsNotNull(c, "powerSaverChecker\n      …          )\n            }");
        a(b.a(c, (Function1<? super Throwable, Unit>) new LoginViewModelImpl$checkPowerSaverMode$3(this), new LoginViewModelImpl$checkPowerSaverMode$2(this)));
    }

    public void d(boolean z2) {
        this.r.setValue(this, B[7], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.f5719o.getValue(this, B[4])).booleanValue();
    }

    public void e(boolean z2) {
        this.f5719o.setValue(this, B[4], Boolean.valueOf(z2));
    }

    public String n() {
        return (String) this.f5720p.getValue(this, B[5]);
    }

    @t(h.a.ON_START)
    public final void onStartActivity() {
        V1().b("LoginActivity started");
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5720p.setValue(this, B[5], str);
    }

    public void t() {
        j<R> a2 = this.v.d().c(new LoginViewModelImpl$onBackPressed$1(this)).a(k.b.z.a.a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository\n      …dSchedulers.mainThread())");
        LoginViewModelImpl$onBackPressed$2 loginViewModelImpl$onBackPressed$2 = new LoginViewModelImpl$onBackPressed$2(this);
        b.a(a2, (Function1<? super Throwable, Unit>) new LoginViewModelImpl$onBackPressed$4(this), (Function0<Unit>) new LoginViewModelImpl$onBackPressed$3(this), loginViewModelImpl$onBackPressed$2);
    }

    public void v() {
        b((Function1<? super Activity, ? extends Intent>) new LoginViewModelImpl$startFAQActivity$1(this));
    }
}
