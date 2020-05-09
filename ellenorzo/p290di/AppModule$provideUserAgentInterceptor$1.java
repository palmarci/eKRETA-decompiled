package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p353m.C5438b0.C5439a;
import p353m.C5449f0;
import p353m.C5575v;
import p353m.C5575v.C5576a;
import p353m.p354l0.p357f.C5490f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$provideUserAgentInterceptor$1 */
/* compiled from: AppModule.kt */
public final class AppModule$provideUserAgentInterceptor$1 implements C5575v {

    /* renamed from: a */
    public final /* synthetic */ String f12565a;

    public AppModule$provideUserAgentInterceptor$1(String str) {
        this.f12565a = str;
    }

    /* renamed from: a */
    public final C5449f0 mo12479a(C5576a aVar) {
        C5439a c = ((C5490f) aVar).f17774f.mo21537c();
        c.f17562c.mo21847c(MobileApiV3Kt.HEADER_USER_AGENT, this.f12565a);
        return ((C5490f) aVar).mo21648a(c.mo21543a());
    }
}
