package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/GuardianDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "Lhu/ekreta/ellenorzo/profile/GuardianRealm;", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.GuardianDaoImpl */
/* compiled from: GuardianDaoImpl.kt */
public final class GuardianDaoImpl extends ProfileSpecificDaoImpl<Guardian, GuardianRealm> implements GuardianDao {
    public GuardianDaoImpl(C5061c0 c0Var) {
        Class<GuardianRealm> cls = GuardianRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public GuardianRealm modelToRealmModel(Guardian guardian) {
        Intrinsics.checkParameterIsNotNull(guardian, "model");
        GuardianRealm guardianRealm = new GuardianRealm(guardian.mo11318e(), guardian.mo14016d(), guardian.mo14014b(), guardian.mo14013a(), guardian.mo14015c());
        return guardianRealm;
    }

    /* renamed from: a */
    public Guardian realmModelToModel(GuardianRealm guardianRealm) {
        Intrinsics.checkParameterIsNotNull(guardianRealm, "realmModel");
        try {
            String g2 = guardianRealm.mo14034g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            String d = guardianRealm.mo14029d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String e2 = guardianRealm.mo14032e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Guardian guardian = new Guardian(g2, d, e2, guardianRealm.mo14031d2(), guardianRealm.mo14033f2());
            return guardian;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
