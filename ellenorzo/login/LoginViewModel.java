package p289hu.ekreta.ellenorzo.login;

import android.view.View.OnFocusChangeListener;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p211h.p271p.C3817l;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020'H&J\b\u0010)\u001a\u00020'H&J\b\u0010*\u001a\u00020'H&J\b\u0010+\u001a\u00020'H&J\b\u0010,\u001a\u00020'H&J\b\u0010-\u001a\u00020'H&J\b\u0010.\u001a\u00020'H&R\u001a\u0010\u0004\u001a\u00020\u00058gX¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00058gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000e8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128gX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00058gX¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000e8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\u000e8gX¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u001dR\u001a\u0010#\u001a\u00020\u00058gX¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "Landroidx/lifecycle/LifecycleObserver;", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "institutePickerButtonText", "getInstitutePickerButtonText", "setInstitutePickerButtonText", "loginEnabled", "", "getLoginEnabled", "()Z", "onFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "password", "getPassword", "setPassword", "passwordShowable", "getPasswordShowable", "setPasswordShowable", "(Z)V", "progressVisible", "getProgressVisible", "savePassword", "getSavePassword", "setSavePassword", "userId", "getUserId", "setUserId", "checkPowerSaverMode", "", "hideKeyboard", "login", "onBackPressed", "startFAQActivity", "startForgottenPasswordActivity", "startInstitutePickerActivity", "startPrivacyPolicyActivity", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModel */
/* compiled from: LoginViewModel.kt */
public interface LoginViewModel extends UiCommandSource, C3705i, C3817l {
    /* renamed from: A */
    String mo13112A();

    /* renamed from: C */
    void mo13113C();

    /* renamed from: D */
    boolean mo13114D();

    /* renamed from: G */
    String mo13115G();

    /* renamed from: H */
    void mo13116H();

    /* renamed from: I */
    OnFocusChangeListener mo13117I();

    /* renamed from: K */
    void mo13118K();

    /* renamed from: L */
    boolean mo13119L();

    /* renamed from: M */
    boolean mo13120M();

    /* renamed from: R */
    String mo13121R();

    /* renamed from: V */
    void mo13122V();

    /* renamed from: a */
    void mo13123a(String str);

    /* renamed from: a */
    void mo13124a(boolean z);

    /* renamed from: b */
    void mo13125b(String str);

    /* renamed from: c */
    void mo13126c(String str);

    /* renamed from: d */
    boolean mo13127d();

    /* renamed from: n */
    String mo13128n();

    /* renamed from: s */
    void mo13129s();

    /* renamed from: t */
    void mo13130t();

    /* renamed from: v */
    void mo13131v();
}
