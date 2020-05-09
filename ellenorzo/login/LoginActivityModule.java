package p289hu.ekreta.ellenorzo.login;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p173k.p174a.C2676c;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3834w;
import p211h.p271p.C3835x.C3837b;
import p289hu.ekreta.ellenorzo.p290di.ActivityModuleKt$createOrReUseViewModel$1;
import p289hu.ekreta.ellenorzo.p290di.ActivityScope;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginActivityModule;", "", "()V", "provideRxActivityResult", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "provideViewModel", "Lhu/ekreta/ellenorzo/login/LoginViewModel;", "activity", "Lhu/ekreta/ellenorzo/login/LoginActivity;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/login/LoginViewModelImpl;", "Bindings", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginActivityModule */
/* compiled from: LoginActivityModule.kt */
public final class LoginActivityModule {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/login/LoginActivityModule$Bindings;", "", "provideFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "delegate", "Lhu/ekreta/ellenorzo/login/LoginActivity;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.login.LoginActivityModule$Bindings */
    /* compiled from: LoginActivityModule.kt */
    public interface Bindings {
    }

    /* renamed from: a */
    public final C2676c mo13101a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        return new C2676c(dVar);
    }

    @ActivityScope
    /* renamed from: a */
    public final LoginViewModel mo13102a(LoginActivity loginActivity, C5431a<LoginViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(loginActivity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        C3834w a = C3158a.m7823a((C3737d) loginActivity, (C3837b) new ActivityModuleKt$createOrReUseViewModel$1(aVar)).mo10845a(LoginViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return (LoginViewModel) a;
    }
}
