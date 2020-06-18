package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/homework/Homework;", "Lhu/ekreta/ellenorzo/homework/HomeworkRealm;", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDaoImpl.kt */
public final class HomeworkDaoImpl extends ReadableByUserDaoImpl<Homework, HomeworkRealm> implements HomeworkDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HomeworkDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.homework.HomeworkRealm> r0 = hu.ekreta.ellenorzo.homework.HomeworkRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.homework.HomeworkDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public Homework realmModelToModel(HomeworkRealm homeworkRealm) {
        Calendar calendar;
        Intrinsics.checkParameterIsNotNull(homeworkRealm, "realmModel");
        try {
            String d2 = homeworkRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = homeworkRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = homeworkRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = homeworkRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            Boolean o2 = homeworkRealm.o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            boolean booleanValue = o2.booleanValue();
            String l2 = homeworkRealm.l2();
            Date i2 = homeworkRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(i2);
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Date f2 = homeworkRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(f2);
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Date e2 = homeworkRealm.e2();
            if (e2 == null || (calendar = UtilsKt.b(e2)) == null) {
                Date f22 = homeworkRealm.f2();
                if (f22 == null) {
                    Intrinsics.throwNpe();
                }
                calendar = UtilsKt.b(f22);
                if (calendar == null) {
                    Intrinsics.throwNpe();
                }
            }
            Boolean n2 = homeworkRealm.n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            boolean booleanValue2 = n2.booleanValue();
            Boolean m2 = homeworkRealm.m2();
            return new Homework(d2, h2, k2, j2, booleanValue, l2, b, b2, calendar, booleanValue2, m2 != null ? m2.booleanValue() : false, homeworkRealm.u(), homeworkRealm.g2());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some fields are null");
        }
    }

    /* renamed from: a */
    public HomeworkRealm modelToRealmModel(Homework homework) {
        Intrinsics.checkParameterIsNotNull(homework, "model");
        return new HomeworkRealm(homework.d(), homework.e(), homework.m(), homework.l(), Boolean.valueOf(homework.q()), homework.n(), homework.k().getTime(), homework.h().getTime(), homework.g().getTime(), Boolean.valueOf(homework.p()), Boolean.valueOf(homework.o()), homework.j(), homework.i());
    }
}
