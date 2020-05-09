package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002,-B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010#\u001a\u00020\u0007HÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÂ\u0003JI\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0010\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "", "uid", "", "date", "Ljava/util/Calendar;", "dayType", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;", "irregularDay", "weekTypeSchedule", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;", "(Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;)V", "getDate", "()Ljava/util/Calendar;", "groupUid", "getGroupUid", "()Ljava/lang/String;", "irregularDayType", "getIrregularDayType", "irregularDayTypeDesc", "getIrregularDayTypeDesc", "type", "getType", "typeDesc", "getTypeDesc", "getUid", "weekType", "getWeekType", "weekTypeDesc", "getWeekTypeDesc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto */
/* compiled from: SchoolYearCalendarEntryDto.kt */
public final class SchoolYearCalendarEntryDto {
    @C2580c("Datum")
    public final Calendar date;
    @C2580c("Naptipus")
    public final ValueDescriptor dayType;
    @C2580c("OsztalyCsoport")
    public final UidStructure group;
    @C2580c("ElteroOrarendSzerintiTanitasiNap")
    public final ValueDescriptor irregularDay;
    @C2580c("Uid")
    public final String uid;
    @C2580c("OrarendiNapHetirendje")
    public final ValueDescriptor weekTypeSchedule;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$UidStructure */
    /* compiled from: SchoolYearCalendarEntryDto.kt */
    public static final class UidStructure {
        @C2580c("Uid")
        public final String uid;

        public UidStructure(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ UidStructure copy$default(UidStructure uidStructure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uidStructure.uid;
            }
            return uidStructure.copy(str);
        }

        public final String component1() {
            return this.uid;
        }

        public final UidStructure copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            return new UidStructure(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.UidStructure) r2
                java.lang.String r0 = r1.uid
                java.lang.String r2 = r2.uid
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.UidStructure.equals(java.lang.Object):boolean");
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("UidStructure(uid="), this.uid, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor */
    /* compiled from: SchoolYearCalendarEntryDto.kt */
    public static final class ValueDescriptor {
        @C2580c("Leiras")
        public final String description;
        @C2580c("Nev")
        public final String name;
        @C2580c("Uid")
        public final String uid;

        public ValueDescriptor(String str, String str2, String str3) {
            C0082a.m114a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ ValueDescriptor copy$default(ValueDescriptor valueDescriptor, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueDescriptor.uid;
            }
            if ((i & 2) != 0) {
                str2 = valueDescriptor.description;
            }
            if ((i & 4) != 0) {
                str3 = valueDescriptor.name;
            }
            return valueDescriptor.copy(str, str2, str3);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.name;
        }

        public final ValueDescriptor copy(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "description");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            return new ValueDescriptor(str, str2, str3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.ValueDescriptor) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.description
                java.lang.String r1 = r3.description
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.name
                java.lang.String r3 = r3.name
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.ValueDescriptor.equals(java.lang.Object):boolean");
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("ValueDescriptor(uid=");
            a.append(this.uid);
            a.append(", description=");
            a.append(this.description);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    public SchoolYearCalendarEntryDto(String str, Calendar calendar, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "dayType");
        Intrinsics.checkParameterIsNotNull(valueDescriptor3, "weekTypeSchedule");
        this.uid = str;
        this.date = calendar;
        this.dayType = valueDescriptor;
        this.irregularDay = valueDescriptor2;
        this.weekTypeSchedule = valueDescriptor3;
        this.group = uidStructure;
    }

    private final ValueDescriptor component3() {
        return this.dayType;
    }

    private final ValueDescriptor component4() {
        return this.irregularDay;
    }

    private final ValueDescriptor component5() {
        return this.weekTypeSchedule;
    }

    private final UidStructure component6() {
        return this.group;
    }

    public static /* synthetic */ SchoolYearCalendarEntryDto copy$default(SchoolYearCalendarEntryDto schoolYearCalendarEntryDto, String str, Calendar calendar, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schoolYearCalendarEntryDto.uid;
        }
        if ((i & 2) != 0) {
            calendar = schoolYearCalendarEntryDto.date;
        }
        Calendar calendar2 = calendar;
        if ((i & 4) != 0) {
            valueDescriptor = schoolYearCalendarEntryDto.dayType;
        }
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        if ((i & 8) != 0) {
            valueDescriptor2 = schoolYearCalendarEntryDto.irregularDay;
        }
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        if ((i & 16) != 0) {
            valueDescriptor3 = schoolYearCalendarEntryDto.weekTypeSchedule;
        }
        ValueDescriptor valueDescriptor6 = valueDescriptor3;
        if ((i & 32) != 0) {
            uidStructure = schoolYearCalendarEntryDto.group;
        }
        return schoolYearCalendarEntryDto.copy(str, calendar2, valueDescriptor4, valueDescriptor5, valueDescriptor6, uidStructure);
    }

    public final String component1() {
        return this.uid;
    }

    public final Calendar component2() {
        return this.date;
    }

    public final SchoolYearCalendarEntryDto copy(String str, Calendar calendar, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "dayType");
        Intrinsics.checkParameterIsNotNull(valueDescriptor3, "weekTypeSchedule");
        SchoolYearCalendarEntryDto schoolYearCalendarEntryDto = new SchoolYearCalendarEntryDto(str, calendar, valueDescriptor, valueDescriptor2, valueDescriptor3, uidStructure);
        return schoolYearCalendarEntryDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.group, (java.lang.Object) r3.group) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto
            if (r0 == 0) goto L_0x0045
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.Calendar r0 = r2.date
            java.util.Calendar r1 = r3.date
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r0 = r2.dayType
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r1 = r3.dayType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r0 = r2.irregularDay
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r1 = r3.irregularDay
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r0 = r2.weekTypeSchedule
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$ValueDescriptor r1 = r3.weekTypeSchedule
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$UidStructure r0 = r2.group
            hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolYearCalendarEntryDto$UidStructure r3 = r3.group
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolYearCalendarEntryDto.equals(java.lang.Object):boolean");
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final String getGroupUid() {
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            return uidStructure.getUid();
        }
        return null;
    }

    public final String getIrregularDayType() {
        ValueDescriptor valueDescriptor = this.irregularDay;
        if (valueDescriptor != null) {
            return valueDescriptor.getName();
        }
        return null;
    }

    public final String getIrregularDayTypeDesc() {
        ValueDescriptor valueDescriptor = this.irregularDay;
        if (valueDescriptor != null) {
            return valueDescriptor.getDescription();
        }
        return null;
    }

    public final String getType() {
        return this.dayType.getName();
    }

    public final String getTypeDesc() {
        return this.dayType.getDescription();
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getWeekType() {
        return this.weekTypeSchedule.getName();
    }

    public final String getWeekTypeDesc() {
        return this.weekTypeSchedule.getDescription();
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.date;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor = this.dayType;
        int hashCode3 = (hashCode2 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor2 = this.irregularDay;
        int hashCode4 = (hashCode3 + (valueDescriptor2 != null ? valueDescriptor2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor3 = this.weekTypeSchedule;
        int hashCode5 = (hashCode4 + (valueDescriptor3 != null ? valueDescriptor3.hashCode() : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i = uidStructure.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("SchoolYearCalendarEntryDto(uid=");
        a.append(this.uid);
        a.append(", date=");
        a.append(this.date);
        a.append(", dayType=");
        a.append(this.dayType);
        a.append(", irregularDay=");
        a.append(this.irregularDay);
        a.append(", weekTypeSchedule=");
        a.append(this.weekTypeSchedule);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }
}
