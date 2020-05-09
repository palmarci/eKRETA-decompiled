package p289hu.ekreta.ellenorzo.p290di;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.util.RxDelegateProxy;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00022\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u00072,\u0010\b\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "T", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lio/reactivex/Observable;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedProxy$1 */
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedProxy$1 implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ RxDelegateProxy f12547a;

    /* renamed from: b */
    public final /* synthetic */ C5431a f12548b;

    public AppModule$createAuthenticatedProxy$1(RxDelegateProxy rxDelegateProxy, C5431a aVar) {
        this.f12547a = rxDelegateProxy;
        this.f12548b = aVar;
    }

    public final C5027n<Object> invoke(Object obj, Method method, Object[] objArr) {
        AppModule$createAuthenticatedProxy$1$retry$1 appModule$createAuthenticatedProxy$1$retry$1 = new AppModule$createAuthenticatedProxy$1$retry$1(this, obj, method, objArr);
        AuthenticationService authenticationService = (AuthenticationService) this.f12548b.get();
        return authenticationService.mo11515l().mo17237d(1).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new AppModule$sam$i$io_reactivex_functions_Function$0<Object,Object>(appModule$createAuthenticatedProxy$1$retry$1)).mo17251j(new AppModule$createAuthenticatedProxy$1$1$1(authenticationService));
    }
}
