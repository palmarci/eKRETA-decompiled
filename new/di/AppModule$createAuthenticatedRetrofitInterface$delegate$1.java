package hu.ekreta.ellenorzo.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m.y;
import p.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedRetrofitInterface$delegate$1 extends Lambda implements Function0<T> {
    public final /* synthetic */ o.b c;
    public final /* synthetic */ String e;
    public final /* synthetic */ y.b f;

    public final T invoke() {
        o.b bVar = this.c;
        bVar.a(this.e);
        bVar.a(this.f.a());
        o a2 = bVar.a();
        Intrinsics.reifiedOperationMarker(4, "T");
        T a3 = a2.a(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(a3, "retrofitBuilder\n        …   .create(T::class.java)");
        return a3;
    }
}
