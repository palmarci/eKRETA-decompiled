package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.OnErrorRetryCache;
import java.util.List;
import k.b.g0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl$delegate$2 extends Lambda implements Function0<n<List<? extends InstituteDto>>> {
    public final /* synthetic */ InstituteRepositoryImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstituteRepositoryImpl$delegate$2(InstituteRepositoryImpl instituteRepositoryImpl) {
        super(0);
        this.c = instituteRepositoryImpl;
    }

    public final n<List<InstituteDto>> invoke() {
        OnErrorRetryCache.Companion companion = OnErrorRetryCache.Companion;
        n<List<InstituteDto>> d2 = this.c.b.getInstitutes(this.c.c).d(1);
        Intrinsics.checkExpressionValueIsNotNull(d2, "globalMobileApi.getInstitutes(apiKey).take(1)");
        return companion.a(d2).b(b.a());
    }
}
