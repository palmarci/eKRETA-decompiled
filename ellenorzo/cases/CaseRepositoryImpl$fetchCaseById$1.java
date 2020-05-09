package p289hu.ekreta.ellenorzo.cases;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import retrofit2.HttpException;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "kotlin.jvm.PlatformType", "t", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl$fetchCaseById$1 */
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCaseById$1<T, R> implements C4675h<Throwable, C5030q<? extends CaseDto>> {
    public static final CaseRepositoryImpl$fetchCaseById$1 INSTANCE = new CaseRepositoryImpl$fetchCaseById$1();

    /* renamed from: a */
    public final C5030q<? extends CaseDto> apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        if (!(th instanceof HttpException) || ((HttpException) th).mo22391a() != 404) {
            return C5027n.m16896b((Throwable) new RuntimeException(th));
        }
        return C5027n.m16896b((Throwable) new NoSuchElementException());
    }
}
