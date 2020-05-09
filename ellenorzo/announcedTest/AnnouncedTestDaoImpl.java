package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRealm;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDaoImpl */
/* compiled from: AnnouncedTestDaoImpl.kt */
public final class AnnouncedTestDaoImpl extends ReadableByUserDaoImpl<AnnouncedTest, AnnouncedTestRealm> implements AnnouncedTestDao {
    public AnnouncedTestDaoImpl(C5061c0 c0Var) {
        Class<AnnouncedTestRealm> cls = AnnouncedTestRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public AnnouncedTestRealm modelToRealmModel(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "model");
        try {
            AnnouncedTestRealm announcedTestRealm = new AnnouncedTestRealm(announcedTest.mo11316d(), announcedTest.mo11328m().getTime(), Integer.valueOf(announcedTest.mo11322h()), announcedTest.mo11329n(), announcedTest.mo11330o(), announcedTest.mo11331p(), announcedTest.mo11326k(), announcedTest.mo11325j(), announcedTest.mo11321g().getTime(), announcedTest.mo11318e(), announcedTest.mo11327l(), announcedTest.mo11324i());
            return announcedTestRealm;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }

    /* renamed from: a */
    public AnnouncedTest realmModelToModel(AnnouncedTestRealm announcedTestRealm) {
        Intrinsics.checkParameterIsNotNull(announcedTestRealm, "realmModel");
        try {
            String d = announcedTestRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.m14838b(announcedTestRealm.mo11381f2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Integer e2 = announcedTestRealm.mo11379e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            int intValue = e2.intValue();
            String k2 = announcedTestRealm.mo11391k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String l2 = announcedTestRealm.mo11392l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String m2 = announcedTestRealm.mo11394m2();
            String i2 = announcedTestRealm.mo11386i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = announcedTestRealm.mo11385h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(announcedTestRealm.mo11377d2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = announcedTestRealm.mo11389j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            AnnouncedTest announcedTest = new AnnouncedTest(d, b, intValue, k2, l2, m2, i2, h2, b2, j2, announcedTestRealm.mo11399u(), announcedTestRealm.mo11383g2());
            return announcedTest;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field is null");
        }
    }
}
