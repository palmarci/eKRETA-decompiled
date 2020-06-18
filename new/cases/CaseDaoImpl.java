package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import k.b.n;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CaseDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "config", "Lio/realm/RealmConfiguration;", "caseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "(Lio/realm/RealmConfiguration;Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;)V", "getCaseById", "Lio/reactivex/Observable;", "caseId", "", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "updateElement", "case", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl extends ProfileSpecificDaoImpl<BaseCase, CaseRealm> implements CaseDao {
    public final CaseFactory b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CaseDaoImpl(k.c.c0 r3, hu.ekreta.ellenorzo.cases.factory.CaseFactory r4) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.cases.CaseRealm> r0 = hu.ekreta.ellenorzo.cases.CaseRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            java.lang.String r1 = "caseFactory"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r1)
            r2.<init>(r0)
            r2.b = r4
            a.q.a.b$a r4 = a.q.a.b.b
            r4.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.cases.CaseDaoImpl.<init>(k.c.c0, hu.ekreta.ellenorzo.cases.factory.CaseFactory):void");
    }

    public n<BaseCase> a(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "case");
        return ExtensionsKt.a((f0) b(), new CaseDaoImpl$updateElement$1(this, baseCase));
    }

    /* renamed from: b */
    public CaseRealm modelToRealmModel(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "model");
        return this.b.a(baseCase);
    }

    /* renamed from: a */
    public BaseCase realmModelToModel(CaseRealm caseRealm) {
        Intrinsics.checkParameterIsNotNull(caseRealm, "realmModel");
        return this.b.a(caseRealm);
    }
}
