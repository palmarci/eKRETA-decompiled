package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/profile/GuardianDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/profile/Guardian;", "Lhu/ekreta/ellenorzo/profile/GuardianRealm;", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GuardianDaoImpl.kt */
public final class GuardianDaoImpl extends ProfileSpecificDaoImpl<Guardian, GuardianRealm> implements GuardianDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GuardianDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.profile.GuardianRealm> r0 = hu.ekreta.ellenorzo.profile.GuardianRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.profile.GuardianDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public GuardianRealm modelToRealmModel(Guardian guardian) {
        Intrinsics.checkParameterIsNotNull(guardian, "model");
        return new GuardianRealm(guardian.e(), guardian.d(), guardian.b(), guardian.a(), guardian.c());
    }

    /* renamed from: a */
    public Guardian realmModelToModel(GuardianRealm guardianRealm) {
        Intrinsics.checkParameterIsNotNull(guardianRealm, "realmModel");
        try {
            String h2 = guardianRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            String d2 = guardianRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String f2 = guardianRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            return new Guardian(h2, d2, f2, guardianRealm.e2(), guardianRealm.g2());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
