package hu.ekreta.ellenorzo.authentication;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import k.b.a0.c;
import k.b.f0.b;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u00020\u000e*\u00020\u000eJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u000fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0011R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;)V", "onCleared", "", "retryWhenUnauthorized", "Lio/reactivex/Completable;", "Lio/reactivex/Observable;", "T", "Lio/reactivex/Single;", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticatedViewModel.kt */
public class AuthenticatedViewModel extends DataBindingViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static c f5055l;

    /* renamed from: m  reason: collision with root package name */
    public static int f5056m;

    /* renamed from: k  reason: collision with root package name */
    public final AuthenticationService f5057k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel$Companion;", "", "()V", "loginViewStarter", "Lio/reactivex/disposables/Disposable;", "refCount", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AuthenticatedViewModel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        this.f5057k = authenticationService;
        int i2 = f5056m;
        f5056m = i2 + 1;
        if (i2 == 0) {
            n<U> a2 = this.f5057k.l().b(TokenExpired.class).a(a.a());
            Intrinsics.checkExpressionValueIsNotNull(a2, "authenticationService.st…dSchedulers.mainThread())");
            f5055l = b.a(a2, new Function1<Throwable, Unit>(this) {
                public final /* synthetic */ AuthenticatedViewModel c;

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
            }, (Function0) null, new Function1<TokenExpired, Unit>(this) {
                public final /* synthetic */ AuthenticatedViewModel c;

                {
                    this.c = r1;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    TokenExpired tokenExpired = (TokenExpired) obj;
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.c.V1().c("AuthenticatedViewModel::TokenExpired");
                    this.c.b((Function1<? super Activity, ? extends Intent>) AnonymousClass1.INSTANCE);
                }
            }, 2);
        }
    }

    public void U1() {
        this.e.b();
        f5056m--;
        if (f5056m == 0) {
            c cVar = f5055l;
            if (cVar != null) {
                cVar.b();
            }
            f5055l = null;
        }
    }

    public final <T> n<T> a(n<T> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$retryWhenUnauthorized");
        n<T> j2 = nVar.b().j(new AuthenticatedViewModel$retryWhenUnauthorized$1(this));
        Intrinsics.checkExpressionValueIsNotNull(j2, "distinctUntilChanged().r…    }\n            }\n    }");
        return j2;
    }

    public final k.b.b a(k.b.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$retryWhenUnauthorized");
        n d2 = bVar.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "toObservable<Any>()");
        k.b.b e = a(d2).e();
        Intrinsics.checkExpressionValueIsNotNull(e, "toObservable<Any>().retr…orized().ignoreElements()");
        return e;
    }
}
