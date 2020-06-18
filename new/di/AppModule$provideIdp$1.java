package hu.ekreta.ellenorzo.di;

import hu.ekreta.ellenorzo.rest.Idp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m.y;
import p.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/rest/Idp;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$provideIdp$1 extends Lambda implements Function0<Idp> {
    public final /* synthetic */ o.b c;
    public final /* synthetic */ String e;
    public final /* synthetic */ y.b f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppModule$provideIdp$1(o.b bVar, String str, y.b bVar2) {
        super(0);
        this.c = bVar;
        this.e = str;
        this.f = bVar2;
    }

    public final Idp invoke() {
        o.b bVar = this.c;
        bVar.a(this.e);
        bVar.a(this.f.a());
        Object a2 = bVar.a().a(Idp.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "retrofitBuilder\n        … .create(Idp::class.java)");
        return (Idp) a2;
    }
}
