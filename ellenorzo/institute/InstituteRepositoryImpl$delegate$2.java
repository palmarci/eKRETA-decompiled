package p289hu.ekreta.ellenorzo.institute;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.OnErrorRetryCache;
import p289hu.ekreta.ellenorzo.util.OnErrorRetryCache.Companion;
import p300k.p313b.C5027n;
import p300k.p313b.p336g0.C5006b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl$delegate$2 */
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl$delegate$2 extends Lambda implements Function0<C5027n<List<? extends Institute>>> {

    /* renamed from: c */
    public final /* synthetic */ InstituteRepositoryImpl f13612c;

    public InstituteRepositoryImpl$delegate$2(InstituteRepositoryImpl instituteRepositoryImpl) {
        this.f13612c = instituteRepositoryImpl;
        super(0);
    }

    public final C5027n<List<Institute>> invoke() {
        Companion companion = OnErrorRetryCache.Companion;
        C5027n d = this.f13612c.f13610b.getInstitutes(this.f13612c.f13611c).mo17237d(1);
        Intrinsics.checkExpressionValueIsNotNull(d, "globalMobileApi.getInstitutes(apiKey).take(1)");
        return companion.mo16290a(d).mo17227b(C5006b.m16847a());
    }
}
