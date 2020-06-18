package hu.ekreta.ellenorzo.cases;

import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "case", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCaseById$3<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ CaseRepositoryImpl c;

    public CaseRepositoryImpl$fetchCaseById$3(CaseRepositoryImpl caseRepositoryImpl) {
        this.c = caseRepositoryImpl;
    }

    /* renamed from: a */
    public final n<BaseCase> apply(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "case");
        return this.c.a().a(baseCase);
    }
}
