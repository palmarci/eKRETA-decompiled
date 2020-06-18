package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRealm;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestDaoImpl.kt */
public final class AnnouncedTestDaoImpl extends ReadableByUserDaoImpl<AnnouncedTest, AnnouncedTestRealm> implements AnnouncedTestDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnnouncedTestDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm> r0 = hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public AnnouncedTestRealm modelToRealmModel(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        try {
            return new AnnouncedTestRealm(announcedTest.d(), announcedTest.m().getTime(), Integer.valueOf(announcedTest.h()), announcedTest.n(), announcedTest.o(), announcedTest.p(), announcedTest.k(), announcedTest.j(), announcedTest.g().getTime(), announcedTest.e(), announcedTest.l(), announcedTest.i());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public AnnouncedTest realmModelToModel(AnnouncedTestRealm announcedTestRealm) {
        Intrinsics.checkParameterIsNotNull(announcedTestRealm, "realmModel");
        try {
            String d2 = announcedTestRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(announcedTestRealm.g2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Integer f2 = announcedTestRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            int intValue = f2.intValue();
            String l2 = announcedTestRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String m2 = announcedTestRealm.m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            String n2 = announcedTestRealm.n2();
            String j2 = announcedTestRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = announcedTestRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(announcedTestRealm.e2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = announcedTestRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            return new AnnouncedTest(d2, b, intValue, l2, m2, n2, j2, i2, b2, k2, announcedTestRealm.u(), announcedTestRealm.h2());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
