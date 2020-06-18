package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m.y;
import p.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "", "invoke", "()Ljava/lang/Object;", "hu/ekreta/ellenorzo/di/AppModule$createAuthenticatedRetrofitInterface$delegate$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$provideGlobalMobileApi$$inlined$createAuthenticatedRetrofitInterface$1 extends Lambda implements Function0<GlobalMobileApi> {
    public final /* synthetic */ o.b c;
    public final /* synthetic */ String e;
    public final /* synthetic */ y.b f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppModule$provideGlobalMobileApi$$inlined$createAuthenticatedRetrofitInterface$1(o.b bVar, String str, y.b bVar2) {
        super(0);
        this.c = bVar;
        this.e = str;
        this.f = bVar2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu.ekreta.ellenorzo.rest.GlobalMobileApi, java.lang.Object] */
    public final GlobalMobileApi invoke() {
        o.b bVar = this.c;
        bVar.a(this.e);
        bVar.a(this.f.a());
        ? a2 = bVar.a().a(GlobalMobileApi.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "retrofitBuilder\n        …   .create(T::class.java)");
        return a2;
    }
}
