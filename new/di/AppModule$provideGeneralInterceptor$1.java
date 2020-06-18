package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.util.exception.NoContentException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.f0;
import m.l0.f.f;
import m.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "chain", "Lokhttp3/Interceptor$Chain;", "intercept"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$provideGeneralInterceptor$1 implements v {
    public static final AppModule$provideGeneralInterceptor$1 INSTANCE = new AppModule$provideGeneralInterceptor$1();

    public final f0 a(v.a aVar) {
        f0 a2 = ((f) aVar).a(((f) aVar).f.c().a());
        if (a2.f != 204) {
            return a2;
        }
        throw new NoContentException((String) null, 1, (DefaultConstructorMarker) null);
    }
}
