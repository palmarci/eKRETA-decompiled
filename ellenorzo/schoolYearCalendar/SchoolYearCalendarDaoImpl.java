package p289hu.ekreta.ellenorzo.schoolYearCalendar;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.IrregularDayType;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.Type;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.Type.Companion;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarEntry.WeekType;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntry;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarEntryRealm;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarDaoImpl */
/* compiled from: SchoolYearCalendarDaoImpl.kt */
public final class SchoolYearCalendarDaoImpl extends ProfileSpecificDaoImpl<SchoolYearCalendarEntry, SchoolYearCalendarEntryRealm> implements SchoolYearCalendarDao {
    public SchoolYearCalendarDaoImpl(C5061c0 c0Var) {
        Class<SchoolYearCalendarEntryRealm> cls = SchoolYearCalendarEntryRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public SchoolYearCalendarEntry realmModelToModel(SchoolYearCalendarEntryRealm schoolYearCalendarEntryRealm) {
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarEntryRealm, "realmModel");
        try {
            String d = schoolYearCalendarEntryRealm.mo15626d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String h2 = schoolYearCalendarEntryRealm.mo15634h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            Date d2 = schoolYearCalendarEntryRealm.mo15628d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b = UtilsKt.m14838b(d2);
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Companion companion = Type.Companion;
            String i2 = schoolYearCalendarEntryRealm.mo15635i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Type a = companion.mo15609a(i2);
            String j2 = schoolYearCalendarEntryRealm.mo15637j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            IrregularDayType a2 = IrregularDayType.Companion.mo15605a(schoolYearCalendarEntryRealm.mo15631f2());
            String g2 = schoolYearCalendarEntryRealm.mo15632g2();
            WeekType.Companion companion2 = WeekType.Companion;
            String k2 = schoolYearCalendarEntryRealm.mo15639k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            WeekType a3 = companion2.mo15611a(k2);
            String l2 = schoolYearCalendarEntryRealm.mo15640l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            SchoolYearCalendarEntry schoolYearCalendarEntry = new SchoolYearCalendarEntry(d, h2, b, a, j2, a2, g2, a3, l2, schoolYearCalendarEntryRealm.mo15630e2());
            return schoolYearCalendarEntry;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public SchoolYearCalendarEntryRealm modelToRealmModel(SchoolYearCalendarEntry schoolYearCalendarEntry) {
        Intrinsics.checkParameterIsNotNull(schoolYearCalendarEntry, "model");
        String d = schoolYearCalendarEntry.mo15588d();
        String e = schoolYearCalendarEntry.mo11318e();
        Date time = schoolYearCalendarEntry.mo15591f().getTime();
        String b = schoolYearCalendarEntry.mo15596j().mo15607b();
        String k = schoolYearCalendarEntry.mo15597k();
        IrregularDayType h = schoolYearCalendarEntry.mo15593h();
        SchoolYearCalendarEntryRealm schoolYearCalendarEntryRealm = new SchoolYearCalendarEntryRealm(d, e, time, b, k, h != null ? h.mo15604a() : null, schoolYearCalendarEntry.mo15595i(), schoolYearCalendarEntry.mo15598l().mo15610a(), schoolYearCalendarEntry.mo15599m(), schoolYearCalendarEntry.mo15592g());
        return schoolYearCalendarEntryRealm;
    }
}
