package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p353m.C5581y.C5583b;
import p380p.C5788o;
import p380p.C5788o.C5790b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo17463d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "", "invoke", "()Ljava/lang/Object;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$createAuthenticatedRetrofitInterface$delegate$1 */
/* compiled from: AppModule.kt */
public final class AppModule$createAuthenticatedRetrofitInterface$delegate$1 extends Lambda implements Function0<T> {

    /* renamed from: c */
    public final /* synthetic */ C5790b f12557c;

    /* renamed from: e */
    public final /* synthetic */ String f12558e;

    /* renamed from: f */
    public final /* synthetic */ C5583b f12559f;

    public final T invoke() {
        C5790b bVar = this.f12557c;
        bVar.mo22327a(this.f12558e);
        bVar.mo22328a(this.f12559f.mo21882a());
        C5788o a = bVar.mo22329a();
        Intrinsics.reifiedOperationMarker(4, "T");
        T a2 = a.mo22320a(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "retrofitBuilder\n        …   .create(T::class.java)");
        return a2;
    }
}
