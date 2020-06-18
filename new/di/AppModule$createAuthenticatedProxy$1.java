package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.util.RxDelegateProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import k.b.n;
import kotlin.Metadata;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00022\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u00072,\u0010\b\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RxDelegateProxy f5318a;
    public final /* synthetic */ a b;

    public AppModule$createAuthenticatedProxy$1(RxDelegateProxy rxDelegateProxy, a aVar) {
        this.f5318a = rxDelegateProxy;
        this.b = aVar;
    }

    public final n<Object> invoke(Object obj, Method method, Object[] objArr) {
        AppModule$createAuthenticatedProxy$1$retry$1 appModule$createAuthenticatedProxy$1$retry$1 = new AppModule$createAuthenticatedProxy$1$retry$1(this, obj, method, objArr);
        AuthenticationService authenticationService = (AuthenticationService) this.b.get();
        return authenticationService.l().d(1).c(new AppModule$sam$i$io_reactivex_functions_Function$0(appModule$createAuthenticatedProxy$1$retry$1)).j(new AppModule$createAuthenticatedProxy$1$1$1(authenticationService));
    }
}
