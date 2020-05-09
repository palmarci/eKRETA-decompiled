package p289hu.ekreta.ellenorzo.p290di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.rest.Idp;
import p353m.C5581y.C5583b;
import p380p.C5788o.C5790b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/rest/Idp;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule$provideIdp$1 */
/* compiled from: AppModule.kt */
public final class AppModule$provideIdp$1 extends Lambda implements Function0<Idp> {

    /* renamed from: c */
    public final /* synthetic */ C5790b f12562c;

    /* renamed from: e */
    public final /* synthetic */ String f12563e;

    /* renamed from: f */
    public final /* synthetic */ C5583b f12564f;

    public AppModule$provideIdp$1(C5790b bVar, String str, C5583b bVar2) {
        this.f12562c = bVar;
        this.f12563e = str;
        this.f12564f = bVar2;
        super(0);
    }

    public final Idp invoke() {
        C5790b bVar = this.f12562c;
        bVar.mo22327a(this.f12563e);
        bVar.mo22328a(this.f12564f.mo21882a());
        Object a = bVar.mo22329a().mo22320a(Idp.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "retrofitBuilder\n        … .create(Idp::class.java)");
        return (Idp) a;
    }
}
