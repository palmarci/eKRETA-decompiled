package hu.ekreta.ellenorzo.cases;

import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "it", "", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl$getCaseById$2<T, R> implements h<T, R> {
    public final /* synthetic */ CaseDaoImpl c;

    /* renamed from: a */
    public final BaseCase apply(List<? extends CaseRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.c.realmModelToModel((CaseRealm) CollectionsKt___CollectionsKt.first(list));
    }
}
