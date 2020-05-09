package p289hu.ekreta.ellenorzo.authentication;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.DebugHelpersKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u00020\f*\u00020\fJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000f\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;)V", "onCleared", "", "retryWhenUnauthorized", "Lio/reactivex/Completable;", "Lio/reactivex/Observable;", "T", "Lio/reactivex/Single;", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel */
/* compiled from: AuthenticatedViewModel.kt */
public class AuthenticatedViewModel extends DataBindingViewModel {
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    public static C4663c f11201k;

    /* renamed from: l */
    public static int f11202l;

    /* renamed from: j */
    public final AuthenticationService f11203j;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel$Companion;", "", "()V", "loginViewStarter", "Lio/reactivex/disposables/Disposable;", "refCount", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel$Companion */
    /* compiled from: AuthenticatedViewModel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AuthenticatedViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        super(observableImpl, executeOnceUiCommandSource);
        this.f11203j = authenticationService;
        int i = f11202l;
        f11202l = i + 1;
        if (i == 0) {
            f11201k = this.f11203j.mo11515l().mo17221b(TokenExpired.class).mo17214a(C5041a.m16999a()).mo17240e((C4673f<? super T>) new C4673f<TokenExpired>(this) {

                /* renamed from: c */
                public final /* synthetic */ AuthenticatedViewModel f11204c;

                {
                    this.f11204c = r1;
                }

                /* renamed from: a */
                public final void mo11506a() {
                    DebugHelpersKt.debugPrint$default("AuthenticatedViewModel::TokenExpired", null, null, 6, null);
                    this.f11204c.mo16376b((Function1<? super Activity, ? extends Intent>) C40351.INSTANCE);
                }

                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    TokenExpired tokenExpired = (TokenExpired) obj;
                    mo11506a();
                }
            });
        }
    }

    /* renamed from: L1 */
    public void mo10653L1() {
        this.f15483e.mo16965b();
        f11202l--;
        if (f11202l == 0) {
            C4663c cVar = f11201k;
            if (cVar != null) {
                cVar.mo16965b();
            }
            f11201k = null;
        }
    }

    /* renamed from: a */
    public final <T> C5027n<T> mo11505a(C5027n<T> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$retryWhenUnauthorized");
        C5027n<T> j = nVar.mo17220b().mo17251j(new AuthenticatedViewModel$retryWhenUnauthorized$1(this));
        Intrinsics.checkExpressionValueIsNotNull(j, "distinctUntilChanged().r…    }\n            }\n    }");
        return j;
    }

    /* renamed from: a */
    public final C4667b mo11504a(C4667b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$retryWhenUnauthorized");
        C5027n d = bVar.mo16983d();
        Intrinsics.checkExpressionValueIsNotNull(d, "toObservable<Any>()");
        C4667b e = mo11505a(d).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e, "toObservable<Any>().retr…orized().ignoreElements()");
        return e;
    }
}
