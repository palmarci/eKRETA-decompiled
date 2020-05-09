package p289hu.ekreta.ellenorzo.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View.OnFocusChangeListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import p000a.p001a.p002a.C0006f;
import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3810h.C3811a;
import p211h.p271p.C3826t;
import p289hu.ekreta.ellenorzo.BuildConfig;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.authentication.LoggedIn;
import p289hu.ekreta.ellenorzo.authentication.LoggingIn;
import p289hu.ekreta.ellenorzo.authentication.LoginFailCause;
import p289hu.ekreta.ellenorzo.authentication.LoginFailed;
import p289hu.ekreta.ellenorzo.authentication.TokenExpired;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.institute.Institute;
import p289hu.ekreta.ellenorzo.institute.InstituteRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverChecker;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\u0010\u0016J\b\u0010M\u001a\u00020NH\u0017J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020%H\u0002J\b\u0010Q\u001a\u00020NH\u0016J\b\u0010R\u001a\u00020NH\u0016J\b\u0010S\u001a\u00020NH\u0016J\b\u0010T\u001a\u00020NH\u0016J\b\u0010U\u001a\u00020NH\u0016J\b\u0010V\u001a\u00020NH\u0016J\u0014\u0010W\u001a\u00020N2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010YH\u0002R+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R+\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00102\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001e\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR+\u00106\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b9\u0010\u001e\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010:\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001e\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R+\u0010>\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%8V@VX\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001e\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R/\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0017\u001a\u0004\u0018\u00010B8B@BX\u0002¢\u0006\u0012\n\u0004\bH\u0010\u001e\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010I\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0002¢\u0006\u0012\n\u0004\bL\u0010\u001e\u001a\u0004\bJ\u0010\u001a\"\u0004\bK\u0010\u001c¨\u0006Z"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/login/LoginViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "context", "Landroid/content/Context;", "instituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "appVersionString", "", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "powerSaverChecker", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "rxActivityResultProvider", "Ljavax/inject/Provider;", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Landroid/content/Context;Lhu/ekreta/ellenorzo/institute/InstituteRepository;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Ljava/lang/String;Lhu/ekreta/ellenorzo/group/GroupRepository;Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;Ljavax/inject/Provider;)V", "<set-?>", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "appVersion$delegate", "Lkotlin/properties/ReadWriteProperty;", "institutePickerButtonText", "getInstitutePickerButtonText", "setInstitutePickerButtonText", "institutePickerButtonText$delegate", "loggedInProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "", "loginEnabled", "getLoginEnabled", "()Z", "setLoginEnabled", "(Z)V", "loginEnabled$delegate", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "password", "getPassword", "setPassword", "password$delegate", "passwordShowable", "getPasswordShowable", "setPasswordShowable", "passwordShowable$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "savePassword", "getSavePassword", "setSavePassword", "savePassword$delegate", "Lhu/ekreta/ellenorzo/institute/Institute;", "selectedInstitute", "getSelectedInstitute", "()Lhu/ekreta/ellenorzo/institute/Institute;", "setSelectedInstitute", "(Lhu/ekreta/ellenorzo/institute/Institute;)V", "selectedInstitute$delegate", "userId", "getUserId", "setUserId", "userId$delegate", "checkPowerSaverMode", "", "createOnFocusChangeListener", "hasCredentials", "login", "onBackPressed", "startFAQActivity", "startForgottenPasswordActivity", "startInstitutePickerActivity", "startPrivacyPolicyActivity", "updateLoginEnabled", "ignore", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl extends DataBindingViewModel implements LoginViewModel {

    /* renamed from: B */
    public static final /* synthetic */ KProperty[] f13631B;

    /* renamed from: A */
    public final C5431a<C2676c> f13632A;

    /* renamed from: j */
    public final ReadWriteProperty f13633j = DataBindingViewModel.boundString$default(this, this, 58, null, new LoginViewModelImpl$userId$2(this), 2, null);

    /* renamed from: k */
    public final ReadWriteProperty f13634k;

    /* renamed from: l */
    public final ReadWriteProperty f13635l;

    /* renamed from: m */
    public final ReadWriteProperty f13636m;

    /* renamed from: n */
    public final ReadWriteProperty f13637n;

    /* renamed from: o */
    public final ReadWriteProperty f13638o;

    /* renamed from: p */
    public final ReadWriteProperty f13639p;

    /* renamed from: q */
    public final ReadWriteProperty f13640q;

    /* renamed from: r */
    public OnFocusChangeListener f13641r;

    /* renamed from: s */
    public Profile f13642s;

    /* renamed from: t */
    public final ReadWriteProperty f13643t;

    /* renamed from: u */
    public final Context f13644u;

    /* renamed from: v */
    public final InstituteRepository f13645v;

    /* renamed from: w */
    public final AuthenticationService f13646w;

    /* renamed from: x */
    public final String f13647x;

    /* renamed from: y */
    public final GroupRepository f13648y;

    /* renamed from: z */
    public final PowerSaverChecker f13649z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13656a = new int[LoginFailCause.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f13657b = new int[LoginFailCause.values().length];

        static {
            f13656a[LoginFailCause.NetworkError.ordinal()] = 1;
            f13656a[LoginFailCause.BadCredentials.ordinal()] = 2;
            f13656a[LoginFailCause.UnknownError.ordinal()] = 3;
            f13656a[LoginFailCause.NotSupportedRole.ordinal()] = 4;
            f13656a[LoginFailCause.NoRightToUseApp.ordinal()] = 5;
            f13656a[LoginFailCause.TutelaryIsNotAuthenticated.ordinal()] = 6;
            f13656a[LoginFailCause.StudentIsNotAuthenticated.ordinal()] = 7;
            f13657b[LoginFailCause.TutelaryIsNotAuthenticated.ordinal()] = 1;
            f13657b[LoginFailCause.StudentIsNotAuthenticated.ordinal()] = 2;
        }
    }

    static {
        Class<LoginViewModelImpl> cls = LoginViewModelImpl.class;
        f13631B = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "userId", "getUserId()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "password", "getPassword()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "institutePickerButtonText", "getInstitutePickerButtonText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "loginEnabled", "getLoginEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "appVersion", "getAppVersion()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "savePassword", "getSavePassword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "passwordShowable", "getPasswordShowable()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "selectedInstitute", "getSelectedInstitute()Lhu/ekreta/ellenorzo/institute/Institute;"))};
    }

    public LoginViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, Context context, InstituteRepository instituteRepository, AuthenticationService authenticationService, String str, GroupRepository groupRepository, PowerSaverChecker powerSaverChecker, C5431a<C2676c> aVar) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(instituteRepository, "instituteRepository");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(str, "appVersionString");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        Intrinsics.checkParameterIsNotNull(powerSaverChecker, "powerSaverChecker");
        Intrinsics.checkParameterIsNotNull(aVar, "rxActivityResultProvider");
        super(observableImpl, executeOnceUiCommandSource);
        this.f13644u = context;
        this.f13645v = instituteRepository;
        this.f13646w = authenticationService;
        this.f13647x = str;
        this.f13648y = groupRepository;
        this.f13649z = powerSaverChecker;
        this.f13632A = aVar;
        this.f13634k = DataBindingViewModel.boundString$default(this, this, 13, null, new LoginViewModelImpl$password$2(this), 2, null);
        String string = this.f13644u.getString(C4014R.string.Button_SelectInstitute_Text);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…ton_SelectInstitute_Text)");
        this.f13635l = DataBindingViewModel.boundString$default(this, this, 35, string, null, 4, null);
        this.f13636m = DataBindingViewModel.boundBoolean$default(this, this, 51, false, null, 6, null);
        this.f13637n = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        this.f13638o = DataBindingViewModel.boundString$default(this, this, 2, null, null, 6, null);
        this.f13639p = DataBindingViewModel.boundBoolean$default(this, this, 74, true, null, 4, null);
        this.f13640q = DataBindingViewModel.boundBoolean$default(this, this, 103, false, null, 4, null);
        this.f13641r = new LoginViewModelImpl$createOnFocusChangeListener$1(this);
        Delegates delegates = Delegates.INSTANCE;
        this.f13643t = new LoginViewModelImpl$$special$$inlined$observable$1(null, null, this);
        C4663c e = this.f13646w.mo11515l().mo17237d(1).mo17240e((C4673f<? super T>) new C4673f<AuthenticationState>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl f13650c;

            {
                this.f13650c = r1;
            }

            /* renamed from: a */
            public final void accept(AuthenticationState authenticationState) {
                if (authenticationState instanceof LoggedIn) {
                    this.f13650c.f13642s = ((LoggedIn) authenticationState).mo11553a();
                } else if (authenticationState instanceof TokenExpired) {
                    Profile a = ((TokenExpired) authenticationState).mo11553a();
                    this.f13650c.mo13125b(a.mo14040D());
                    LoginViewModelImpl loginViewModelImpl = this.f13650c;
                    String s = a.mo14060s();
                    if (s == null) {
                        s = "";
                    }
                    loginViewModelImpl.mo13126c(s);
                    LoginViewModelImpl loginViewModelImpl2 = this.f13650c;
                    String s2 = a.mo14060s();
                    boolean z = false;
                    loginViewModelImpl2.mo13135c(s2 == null || s2.length() == 0);
                    LoginViewModelImpl loginViewModelImpl3 = this.f13650c;
                    String s3 = a.mo14060s();
                    if (s3 == null || s3.length() == 0) {
                        z = true;
                    }
                    loginViewModelImpl3.mo13124a(!z);
                    LoginViewModelImpl loginViewModelImpl4 = this.f13650c;
                    C4663c e = loginViewModelImpl4.f13645v.mo13094c(a.mo14055n()).mo17237d(1).mo17240e((C4673f<? super T>) new LoginViewModelImpl$1$$special$$inlined$let$lambda$1<Object>(this));
                    Intrinsics.checkExpressionValueIsNotNull(e, "instituteRepository\n    …tute = it.firstOrNull() }");
                    loginViewModelImpl4.mo16413a(e);
                }
            }
        });
        String str2 = "authenticationService.st…          }\n            }";
        Intrinsics.checkExpressionValueIsNotNull(e, str2);
        mo16413a(e);
        C4663c e2 = this.f13646w.mo11515l().mo17230c(1).mo17240e((C4673f<? super T>) new C4673f<AuthenticationState>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl f13651c;

            {
                this.f13651c = r1;
            }

            /* renamed from: a */
            public final void accept(final AuthenticationState authenticationState) {
                int i;
                this.f13651c.mo13137d(Intrinsics.areEqual((Object) authenticationState, (Object) LoggingIn.INSTANCE));
                if (authenticationState instanceof LoginFailed) {
                    LoginViewModelImpl loginViewModelImpl = this.f13651c;
                    switch (WhenMappings.f13656a[((LoginFailed) authenticationState).mo11562d().ordinal()]) {
                        case 1:
                            i = C4014R.string.network_error;
                            break;
                        case 2:
                            i = C4014R.string.bad_credentials;
                            break;
                        case 3:
                            i = C4014R.string.unknown_error;
                            break;
                        case 4:
                            i = C4014R.string.not_supported_profile;
                            break;
                        case 5:
                            i = C4014R.string.no_right_to_use_app;
                            break;
                        case 6:
                            i = C4014R.string.tutelary_is_not_authenticated;
                            break;
                        case 7:
                            i = C4014R.string.student_is_not_authenticated;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    DataBindingViewModel.showAlert$default(loginViewModelImpl, i, null, new Function1<C0006f, Unit>(this) {

                        /* renamed from: c */
                        public final /* synthetic */ C42162 f13652c;

                        {
                            this.f13652c = r1;
                        }

                        /* renamed from: a */
                        public final void mo13141a(C0006f fVar) {
                            Intrinsics.checkParameterIsNotNull(fVar, "<anonymous parameter 0>");
                            int i = WhenMappings.f13657b[((LoginFailed) authenticationState).mo11562d().ordinal()];
                            if (i == 1) {
                                ExtensionsKt.m14881a(this.f13652c.f13651c.f13644u, "hu.ekreta.guardian");
                            } else if (i == 2) {
                                ExtensionsKt.m14881a(this.f13652c.f13651c.f13644u, BuildConfig.APPLICATION_ID);
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            mo13141a((C0006f) obj);
                            return Unit.INSTANCE;
                        }
                    }, 2, null);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e2, str2);
        mo16413a(e2);
        C4663c e3 = this.f13646w.mo11515l().mo17230c(1).mo17221b(LoggedIn.class).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl f13654c;

            {
                this.f13654c = r1;
            }

            /* renamed from: a */
            public final C5027n<List<Group>> apply(LoggedIn loggedIn) {
                Intrinsics.checkParameterIsNotNull(loggedIn, "it");
                return this.f13654c.f13648y.mo12813g(loggedIn.mo11553a().mo14054m());
            }
        }).mo17240e((C4673f<? super T>) new C4673f<List<? extends Group>>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl f13655c;

            {
                this.f13655c = r1;
            }

            /* renamed from: a */
            public final void mo13143a() {
                this.f13655c.mo16363N1();
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                List list = (List) obj;
                mo13143a();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(e3, "authenticationService.st…ribe { finishActivity() }");
        mo16413a(e3);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13644u.getString(C4014R.string.app_name));
        sb.append(' ');
        sb.append(this.f13647x);
        mo13138r(sb.toString());
    }

    /* renamed from: a */
    public static /* synthetic */ void m12741a(LoginViewModelImpl loginViewModelImpl, Object obj, int i) {
        int i2 = i & 1;
        loginViewModelImpl.mo13133Q1();
    }

    /* renamed from: A */
    public String mo13112A() {
        return (String) this.f13635l.getValue(this, f13631B[2]);
    }

    /* renamed from: C */
    public void mo13113C() {
        Institute P1 = mo13132P1();
        if (P1 != null) {
            this.f13646w.mo11512a(new LoginRequest(P1, mo13121R(), mo13115G()), mo13114D());
        }
    }

    /* renamed from: D */
    public boolean mo13114D() {
        return ((Boolean) this.f13639p.getValue(this, f13631B[6])).booleanValue();
    }

    /* renamed from: G */
    public String mo13115G() {
        return (String) this.f13634k.getValue(this, f13631B[1]);
    }

    /* renamed from: H */
    public void mo13116H() {
        mo16376b((Function1<? super Activity, ? extends Intent>) LoginViewModelImpl$startPrivacyPolicyActivity$1.INSTANCE);
    }

    /* renamed from: I */
    public OnFocusChangeListener mo13117I() {
        return this.f13641r;
    }

    /* renamed from: K */
    public void mo13118K() {
        mo16376b((Function1<? super Activity, ? extends Intent>) LoginViewModelImpl$startForgottenPasswordActivity$1.INSTANCE);
    }

    /* renamed from: L */
    public boolean mo13119L() {
        return ((Boolean) this.f13640q.getValue(this, f13631B[7])).booleanValue();
    }

    /* renamed from: M */
    public boolean mo13120M() {
        return ((Boolean) this.f13636m.getValue(this, f13631B[3])).booleanValue();
    }

    /* renamed from: P1 */
    public final Institute mo13132P1() {
        return (Institute) this.f13643t.getValue(this, f13631B[8]);
    }

    /* renamed from: Q1 */
    public final void mo13133Q1() {
        boolean z;
        String R = mo13121R();
        boolean z2 = true;
        if (!(R == null || StringsKt__StringsJVMKt.isBlank(R))) {
            String G = mo13115G();
            if (!(G == null || StringsKt__StringsJVMKt.isBlank(G))) {
                z = true;
                if (!z || mo13132P1() == null) {
                    z2 = false;
                }
                mo13134b(z2);
            }
        }
        z = false;
        z2 = false;
        mo13134b(z2);
    }

    /* renamed from: R */
    public String mo13121R() {
        return (String) this.f13633j.getValue(this, f13631B[0]);
    }

    /* renamed from: V */
    public void mo13122V() {
        mo16373a((Function1<? super C3737d, Unit>) new LoginViewModelImpl$startInstitutePickerActivity$1<Object,Unit>(this));
    }

    /* renamed from: a */
    public void mo13123a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13635l.setValue(this, f13631B[2], str);
    }

    /* renamed from: a */
    public void mo13124a(boolean z) {
        this.f13639p.setValue(this, f13631B[6], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo13125b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13633j.setValue(this, f13631B[0], str);
    }

    /* renamed from: b */
    public void mo13134b(boolean z) {
        this.f13636m.setValue(this, f13631B[3], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo13126c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13634k.setValue(this, f13631B[1], str);
    }

    /* renamed from: c */
    public void mo13135c(boolean z) {
        this.f13640q.setValue(this, f13631B[7], Boolean.valueOf(z));
    }

    @C3826t(C3811a.ON_CREATE)
    public void checkPowerSaverMode() {
        mo16413a(C4998b.m16840a(this.f13649z.mo16343a(), (Function1) new LoginViewModelImpl$checkPowerSaverMode$2(this), (Function0) null, (Function1) new LoginViewModelImpl$checkPowerSaverMode$1(this), 2));
    }

    /* renamed from: d */
    public void mo13137d(boolean z) {
        this.f13637n.setValue(this, f13631B[4], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo13127d() {
        return ((Boolean) this.f13637n.getValue(this, f13631B[4])).booleanValue();
    }

    /* renamed from: n */
    public String mo13128n() {
        return (String) this.f13638o.getValue(this, f13631B[5]);
    }

    /* renamed from: r */
    public void mo13138r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13638o.setValue(this, f13631B[5], str);
    }

    /* renamed from: t */
    public void mo13130t() {
        C4663c e = this.f13646w.mo11515l().mo17237d(1).mo17240e((C4673f<? super T>) new LoginViewModelImpl$onBackPressed$1<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(e, "authenticationService.st…          }\n            }");
        mo16413a(e);
    }

    /* renamed from: v */
    public void mo13131v() {
        mo16376b((Function1<? super Activity, ? extends Intent>) LoginViewModelImpl$startFAQActivity$1.INSTANCE);
    }
}
