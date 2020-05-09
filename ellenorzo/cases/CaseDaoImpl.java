package p289hu.ekreta.ellenorzo.cases;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p300k.p313b.C5027n;
import p300k.p340c.C5061c0;
import p300k.p340c.C5074f0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CaseDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "config", "Lio/realm/RealmConfiguration;", "caseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "(Lio/realm/RealmConfiguration;Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;)V", "getCaseById", "Lio/reactivex/Observable;", "caseId", "", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "updateElement", "case", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseDaoImpl */
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl extends ProfileSpecificDaoImpl<BaseCase, CaseRealm> implements CaseDao {

    /* renamed from: b */
    public final CaseFactory f11284b;

    public CaseDaoImpl(C5061c0 c0Var, CaseFactory caseFactory) {
        Class<CaseRealm> cls = CaseRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        Intrinsics.checkParameterIsNotNull(caseFactory, "caseFactory");
        super(cls);
        this.f11284b = caseFactory;
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public C5027n<BaseCase> mo11599a(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "case");
        return ExtensionsKt.m14633a((C5074f0) mo16313b(), (Function1<? super C5179y, ? extends R>) new CaseDaoImpl$updateElement$1<Object,Object>(this, baseCase));
    }

    /* renamed from: b */
    public CaseRealm modelToRealmModel(BaseCase baseCase) {
        Intrinsics.checkParameterIsNotNull(baseCase, "model");
        return this.f11284b.mo11853a(baseCase);
    }

    /* renamed from: a */
    public BaseCase realmModelToModel(CaseRealm caseRealm) {
        Intrinsics.checkParameterIsNotNull(caseRealm, "realmModel");
        return this.f11284b.mo11851a(caseRealm);
    }
}
