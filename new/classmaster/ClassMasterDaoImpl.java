package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.classmaster.ClassMaster;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import k.c.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRealm;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterDaoImpl.kt */
public final class ClassMasterDaoImpl extends ProfileSpecificDaoImpl<ClassMaster, ClassMasterRealm> implements ClassMasterDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClassMasterDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.classmaster.ClassMasterRealm> r0 = hu.ekreta.ellenorzo.classmaster.ClassMasterRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.classmaster.ClassMasterDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public ClassMaster realmModelToModel(ClassMasterRealm classMasterRealm) {
        Intrinsics.checkParameterIsNotNull(classMasterRealm, "realmModel");
        try {
            String j2 = classMasterRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = classMasterRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            d0<String> f2 = classMasterRealm.f2();
            d0<String> i2 = classMasterRealm.i2();
            String e2 = classMasterRealm.e2();
            String g2 = classMasterRealm.g2();
            ClassMaster.ClassMasterType.Companion companion = ClassMaster.ClassMasterType.Companion;
            Integer k2 = classMasterRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            return new ClassMaster(j2, h2, f2, i2, e2, g2, companion.a(k2.intValue()));
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public ClassMasterRealm modelToRealmModel(ClassMaster classMaster) {
        Intrinsics.checkParameterIsNotNull(classMaster, "model");
        String e = classMaster.e();
        String f = classMaster.f();
        d0 d0Var = new d0();
        d0Var.addAll(classMaster.b());
        d0 d0Var2 = new d0();
        d0Var2.addAll(classMaster.g());
        return new ClassMasterRealm(e, f, d0Var, d0Var2, classMaster.a(), classMaster.c(), Integer.valueOf(classMaster.h().a()));
    }
}
