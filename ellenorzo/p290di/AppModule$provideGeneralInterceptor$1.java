package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.util.exception.NoContentException;
import p353m.C5449f0;
import p353m.C5575v;
import p353m.C5575v.C5576a;
import p353m.p354l0.p357f.C5490f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$provideGeneralInterceptor$1 */
/* compiled from: AppModule.kt */
public final class AppModule$provideGeneralInterceptor$1 implements C5575v {
    public static final AppModule$provideGeneralInterceptor$1 INSTANCE = new AppModule$provideGeneralInterceptor$1();

    /* renamed from: a */
    public final C5449f0 mo12479a(C5576a aVar) {
        C5449f0 a = ((C5490f) aVar).mo21648a(((C5490f) aVar).f17774f.mo21537c().mo21543a());
        if (a.f17594f != 204) {
            return a;
        }
        throw new NoContentException(null, 1, null);
    }
}
