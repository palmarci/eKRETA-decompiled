package p289hu.ekreta.ellenorzo.cases;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "it", "", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseDaoImpl$getCaseById$2 */
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl$getCaseById$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ CaseDaoImpl f11286c;

    /* renamed from: a */
    public final BaseCase apply(List<? extends CaseRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.f11286c.realmModelToModel((CaseRealm) CollectionsKt___CollectionsKt.first(list));
    }
}
