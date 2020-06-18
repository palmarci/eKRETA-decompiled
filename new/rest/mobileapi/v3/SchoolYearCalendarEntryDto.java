package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002,-B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010#\u001a\u00020\u0007HÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÂ\u0003JI\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0010\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto;", "", "uid", "", "date", "Ljava/util/Calendar;", "dayType", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;", "irregularDay", "weekTypeSchedule", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;", "(Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;)V", "getDate", "()Ljava/util/Calendar;", "groupUid", "getGroupUid", "()Ljava/lang/String;", "irregularDayType", "getIrregularDayType", "irregularDayTypeDesc", "getIrregularDayTypeDesc", "type", "getType", "typeDesc", "getTypeDesc", "getUid", "weekType", "getWeekType", "weekTypeDesc", "getWeekTypeDesc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "UidStructure", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SchoolYearCalendarEntryDto.kt */
public final class SchoolYearCalendarEntryDto {
    @c("Datum")
    public final Calendar date;
    @c("Naptipus")
    public final ValueDescriptor dayType;
    @c("OsztalyCsoport")
    public final UidStructure group;
    @c("ElteroOrarendSzerintiTanitasiNap")
    public final ValueDescriptor irregularDay;
    @c("Uid")
    public final String uid;
    @c("OrarendiNapHetirendje")
    public final ValueDescriptor weekTypeSchedule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolYearCalendarEntryDto.kt */
    public static final class UidStructure {
        @c("Uid")
        public final String uid;

        public UidStructure(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ UidStructure copy$default(UidStructure uidStructure, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
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

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof UidStructure) && Intrinsics.areEqual((Object) this.uid, (Object) ((UidStructure) obj).uid);
            }
            return true;
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
            return a.a(a.a("UidStructure(uid="), this.uid, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolYearCalendarEntryDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SchoolYearCalendarEntryDto.kt */
    public static final class ValueDescriptor {
        @c("Leiras")
        public final String description;
        @c("Nev")
        public final String name;
        @c("Uid")
        public final String uid;

        public ValueDescriptor(String str, String str2, String str3) {
            a.a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ ValueDescriptor copy$default(ValueDescriptor valueDescriptor, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = valueDescriptor.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = valueDescriptor.description;
            }
            if ((i2 & 4) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueDescriptor)) {
                return false;
            }
            ValueDescriptor valueDescriptor = (ValueDescriptor) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) valueDescriptor.uid) && Intrinsics.areEqual((Object) this.description, (Object) valueDescriptor.description) && Intrinsics.areEqual((Object) this.name, (Object) valueDescriptor.name);
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
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("ValueDescriptor(uid=");
            a2.append(this.uid);
            a2.append(", description=");
            a2.append(this.description);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
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

    public static /* synthetic */ SchoolYearCalendarEntryDto copy$default(SchoolYearCalendarEntryDto schoolYearCalendarEntryDto, String str, Calendar calendar, ValueDescriptor valueDescriptor, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = schoolYearCalendarEntryDto.uid;
        }
        if ((i2 & 2) != 0) {
            calendar = schoolYearCalendarEntryDto.date;
        }
        Calendar calendar2 = calendar;
        if ((i2 & 4) != 0) {
            valueDescriptor = schoolYearCalendarEntryDto.dayType;
        }
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        if ((i2 & 8) != 0) {
            valueDescriptor2 = schoolYearCalendarEntryDto.irregularDay;
        }
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        if ((i2 & 16) != 0) {
            valueDescriptor3 = schoolYearCalendarEntryDto.weekTypeSchedule;
        }
        ValueDescriptor valueDescriptor6 = valueDescriptor3;
        if ((i2 & 32) != 0) {
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
        return new SchoolYearCalendarEntryDto(str, calendar, valueDescriptor, valueDescriptor2, valueDescriptor3, uidStructure);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolYearCalendarEntryDto)) {
            return false;
        }
        SchoolYearCalendarEntryDto schoolYearCalendarEntryDto = (SchoolYearCalendarEntryDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) schoolYearCalendarEntryDto.uid) && Intrinsics.areEqual((Object) this.date, (Object) schoolYearCalendarEntryDto.date) && Intrinsics.areEqual((Object) this.dayType, (Object) schoolYearCalendarEntryDto.dayType) && Intrinsics.areEqual((Object) this.irregularDay, (Object) schoolYearCalendarEntryDto.irregularDay) && Intrinsics.areEqual((Object) this.weekTypeSchedule, (Object) schoolYearCalendarEntryDto.weekTypeSchedule) && Intrinsics.areEqual((Object) this.group, (Object) schoolYearCalendarEntryDto.group);
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
        int i2 = 0;
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
            i2 = uidStructure.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("SchoolYearCalendarEntryDto(uid=");
        a2.append(this.uid);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(", dayType=");
        a2.append(this.dayType);
        a2.append(", irregularDay=");
        a2.append(this.irregularDay);
        a2.append(", weekTypeSchedule=");
        a2.append(this.weekTypeSchedule);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }
}
