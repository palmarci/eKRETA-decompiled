package p289hu.ekreta.ellenorzo.classmaster;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType;
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType.Companion;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;
import p300k.p340c.C5065d0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRealm;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterDaoImpl */
/* compiled from: ClassMasterDaoImpl.kt */
public final class ClassMasterDaoImpl extends ProfileSpecificDaoImpl<ClassMaster, ClassMasterRealm> implements ClassMasterDao {
    public ClassMasterDaoImpl(C5061c0 c0Var) {
        Class<ClassMasterRealm> cls = ClassMasterRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public ClassMaster realmModelToModel(ClassMasterRealm classMasterRealm) {
        Intrinsics.checkParameterIsNotNull(classMasterRealm, "realmModel");
        try {
            String i2 = classMasterRealm.mo12250i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String g2 = classMasterRealm.mo12247g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            C5065d0 e2 = classMasterRealm.mo12244e2();
            C5065d0 h2 = classMasterRealm.mo12248h2();
            String d2 = classMasterRealm.mo12242d2();
            String f2 = classMasterRealm.mo12246f2();
            Companion companion = ClassMasterType.Companion;
            Integer j2 = classMasterRealm.mo12251j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            ClassMaster classMaster = new ClassMaster(i2, g2, e2, h2, d2, f2, companion.mo12228a(j2.intValue()));
            return classMaster;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public ClassMasterRealm modelToRealmModel(ClassMaster classMaster) {
        Intrinsics.checkParameterIsNotNull(classMaster, "model");
        String e = classMaster.mo11318e();
        String f = classMaster.mo12222f();
        C5065d0 d0Var = new C5065d0();
        d0Var.addAll(classMaster.mo12219b());
        C5065d0 d0Var2 = new C5065d0();
        d0Var2.addAll(classMaster.mo12223g());
        ClassMasterRealm classMasterRealm = new ClassMasterRealm(e, f, d0Var, d0Var2, classMaster.mo12218a(), classMaster.mo12220c(), Integer.valueOf(classMaster.mo12224h().mo12227a()));
        return classMasterRealm;
    }
}
