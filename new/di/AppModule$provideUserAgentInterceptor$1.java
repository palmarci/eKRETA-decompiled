package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import kotlin.Metadata;
import m.b0;
import m.f0;
import m.l0.f.f;
import m.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$provideUserAgentInterceptor$1 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5320a;

    public AppModule$provideUserAgentInterceptor$1(String str) {
        this.f5320a = str;
    }

    public final f0 a(v.a aVar) {
        b0.a c = ((f) aVar).f.c();
        c.c.c(MobileApiV3Kt.HEADER_USER_AGENT, this.f5320a);
        return ((f) aVar).a(c.a());
    }
}
