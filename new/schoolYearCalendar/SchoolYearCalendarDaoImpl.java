package hu.ekreta.ellenorzo.schoolYearCalendar;

import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntryRealm;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarDaoImpl.kt */
public final class SchoolYearCalendarDaoImpl extends ProfileSpecificDaoImpl<SchoolYearCalendarEntry, SchoolYearCalendarEntryRealm> implements SchoolYearCalendarDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SchoolYearCalendarDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm> r0 = hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntryRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public SchoolYearCalendarEntry realmModelToModel(SchoolYearCalendarEntryRealm schoolYearCalendarEntryRealm) {
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarEntryRealm, "realmModel");
        try {
            String d2 = schoolYearCalendarEntryRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = schoolYearCalendarEntryRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Date e2 = schoolYearCalendarEntryRealm.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.b(e2);
            if (b == null) {
                Intrinsics.throwNpe();
            }
            SchoolYearCalendarEntry.Type.Companion companion = SchoolYearCalendarEntry.Type.Companion;
            String j2 = schoolYearCalendarEntryRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            SchoolYearCalendarEntry.Type a2 = companion.a(j2);
            String k2 = schoolYearCalendarEntryRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            SchoolYearCalendarEntry.IrregularDayType a3 = SchoolYearCalendarEntry.IrregularDayType.Companion.a(schoolYearCalendarEntryRealm.g2());
            String h2 = schoolYearCalendarEntryRealm.h2();
            SchoolYearCalendarEntry.WeekType.Companion companion2 = SchoolYearCalendarEntry.WeekType.Companion;
            String l2 = schoolYearCalendarEntryRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            SchoolYearCalendarEntry.WeekType a4 = companion2.a(l2);
            String m2 = schoolYearCalendarEntryRealm.m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            return new SchoolYearCalendarEntry(d2, i2, b, a2, k2, a3, h2, a4, m2, schoolYearCalendarEntryRealm.f2());
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public SchoolYearCalendarEntryRealm modelToRealmModel(SchoolYearCalendarEntry schoolYearCalendarEntry) {
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarEntry, "model");
        String d2 = schoolYearCalendarEntry.d();
        String e = schoolYearCalendarEntry.e();
        Date time = schoolYearCalendarEntry.f().getTime();
        String b = schoolYearCalendarEntry.j().b();
        String k2 = schoolYearCalendarEntry.k();
        SchoolYearCalendarEntry.IrregularDayType h2 = schoolYearCalendarEntry.h();
        return new SchoolYearCalendarEntryRealm(d2, e, time, b, k2, h2 != null ? h2.a() : null, schoolYearCalendarEntry.i(), schoolYearCalendarEntry.l().a(), schoolYearCalendarEntry.m(), schoolYearCalendarEntry.g());
    }
}
