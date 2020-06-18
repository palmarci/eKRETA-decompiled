package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import java.util.NoSuchElementException;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "kotlin.jvm.PlatformType", "t", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCaseById$1<T, R> implements h<Throwable, q<? extends CaseDto>> {
    public static final CaseRepositoryImpl$fetchCaseById$1 INSTANCE = new CaseRepositoryImpl$fetchCaseById$1();

    /* renamed from: a */
    public final q<? extends CaseDto> apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        if (!(th instanceof HttpException) || ((HttpException) th).a() != 404) {
            return n.b((Throwable) new RuntimeException(th));
        }
        return n.b((Throwable) new NoSuchElementException());
    }
}
