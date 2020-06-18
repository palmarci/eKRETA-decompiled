package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u000201BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\rHÂ\u0003J\t\u0010)\u001a\u00020\u000fHÂ\u0003Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0010\u0010\u000e\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00062"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "", "uid", "", "date", "Ljava/util/Calendar;", "classScheduleNumber", "", "subject", "teacher", "theme", "announcedAtUTC", "mode", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;)V", "getAnnouncedAtUTC", "()Ljava/util/Calendar;", "getClassScheduleNumber", "()I", "getDate", "groupUid", "getGroupUid", "()Ljava/lang/String;", "modeDescription", "getModeDescription", "modeName", "getModeName", "getSubject", "getTeacher", "getTheme", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Group", "Mode", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestDto.kt */
public final class AnnouncedTestDto {
    @c("BejelentesDatuma")
    public final Calendar announcedAtUTC;
    @c("OrarendiOraOraszama")
    public final int classScheduleNumber;
    @c("Datum")
    public final Calendar date;
    @c("OsztalyCsoport")
    public final Group group;
    @c("Modja")
    public final Mode mode;
    @c("TantargyNeve")
    public final String subject;
    @c("RogzitoTanarNeve")
    public final String teacher;
    @c("Temaja")
    public final String theme;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AnnouncedTestDto.kt */
    public static final class Group {
        @c("Uid")
        public final String uid;

        public Group(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ Group copy$default(Group group, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = group.uid;
            }
            return group.copy(str);
        }

        public final String component1() {
            return this.uid;
        }

        public final Group copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            return new Group(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Group) && Intrinsics.areEqual((Object) this.uid, (Object) ((Group) obj).uid);
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
            return a.a(a.a("Group(uid="), this.uid, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AnnouncedTestDto.kt */
    public static final class Mode {
        @c("Leiras")
        public final String description;
        @c("Nev")
        public final String name;
        @c("Uid")
        public final String uid;

        public Mode(String str, String str2, String str3) {
            a.a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ Mode copy$default(Mode mode, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = mode.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = mode.description;
            }
            if ((i2 & 4) != 0) {
                str3 = mode.name;
            }
            return mode.copy(str, str2, str3);
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

        public final Mode copy(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "description");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            return new Mode(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mode)) {
                return false;
            }
            Mode mode = (Mode) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) mode.uid) && Intrinsics.areEqual((Object) this.description, (Object) mode.description) && Intrinsics.areEqual((Object) this.name, (Object) mode.name);
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
            StringBuilder a2 = a.a("Mode(uid=");
            a2.append(this.uid);
            a2.append(", description=");
            a2.append(this.description);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    public AnnouncedTestDto(String str, Calendar calendar, int i2, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "announcedAtUTC");
        Intrinsics.checkParameterIsNotNull(mode2, "mode");
        Intrinsics.checkParameterIsNotNull(group2, "group");
        this.uid = str;
        this.date = calendar;
        this.classScheduleNumber = i2;
        this.subject = str2;
        this.teacher = str3;
        this.theme = str4;
        this.announcedAtUTC = calendar2;
        this.mode = mode2;
        this.group = group2;
    }

    private final Mode component8() {
        return this.mode;
    }

    private final Group component9() {
        return this.group;
    }

    public static /* synthetic */ AnnouncedTestDto copy$default(AnnouncedTestDto announcedTestDto, String str, Calendar calendar, int i2, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2, int i3, Object obj) {
        AnnouncedTestDto announcedTestDto2 = announcedTestDto;
        int i4 = i3;
        return announcedTestDto.copy((i4 & 1) != 0 ? announcedTestDto2.uid : str, (i4 & 2) != 0 ? announcedTestDto2.date : calendar, (i4 & 4) != 0 ? announcedTestDto2.classScheduleNumber : i2, (i4 & 8) != 0 ? announcedTestDto2.subject : str2, (i4 & 16) != 0 ? announcedTestDto2.teacher : str3, (i4 & 32) != 0 ? announcedTestDto2.theme : str4, (i4 & 64) != 0 ? announcedTestDto2.announcedAtUTC : calendar2, (i4 & 128) != 0 ? announcedTestDto2.mode : mode2, (i4 & 256) != 0 ? announcedTestDto2.group : group2);
    }

    public final String component1() {
        return this.uid;
    }

    public final Calendar component2() {
        return this.date;
    }

    public final int component3() {
        return this.classScheduleNumber;
    }

    public final String component4() {
        return this.subject;
    }

    public final String component5() {
        return this.teacher;
    }

    public final String component6() {
        return this.theme;
    }

    public final Calendar component7() {
        return this.announcedAtUTC;
    }

    public final AnnouncedTestDto copy(String str, Calendar calendar, int i2, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        String str5 = str3;
        Intrinsics.checkParameterIsNotNull(str5, "teacher");
        Calendar calendar3 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar3, "announcedAtUTC");
        Mode mode3 = mode2;
        Intrinsics.checkParameterIsNotNull(mode3, "mode");
        Group group3 = group2;
        Intrinsics.checkParameterIsNotNull(group3, "group");
        return new AnnouncedTestDto(str, calendar, i2, str2, str5, str4, calendar3, mode3, group3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnnouncedTestDto) {
                AnnouncedTestDto announcedTestDto = (AnnouncedTestDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) announcedTestDto.uid) && Intrinsics.areEqual((Object) this.date, (Object) announcedTestDto.date)) {
                    if (!(this.classScheduleNumber == announcedTestDto.classScheduleNumber) || !Intrinsics.areEqual((Object) this.subject, (Object) announcedTestDto.subject) || !Intrinsics.areEqual((Object) this.teacher, (Object) announcedTestDto.teacher) || !Intrinsics.areEqual((Object) this.theme, (Object) announcedTestDto.theme) || !Intrinsics.areEqual((Object) this.announcedAtUTC, (Object) announcedTestDto.announcedAtUTC) || !Intrinsics.areEqual((Object) this.mode, (Object) announcedTestDto.mode) || !Intrinsics.areEqual((Object) this.group, (Object) announcedTestDto.group)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Calendar getAnnouncedAtUTC() {
        return this.announcedAtUTC;
    }

    public final int getClassScheduleNumber() {
        return this.classScheduleNumber;
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final String getGroupUid() {
        return this.group.getUid();
    }

    public final String getModeDescription() {
        return this.mode.getDescription();
    }

    public final String getModeName() {
        return this.mode.getName();
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getTeacher() {
        return this.teacher;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Calendar calendar = this.date;
        int hashCode2 = (((hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31) + this.classScheduleNumber) * 31;
        String str2 = this.subject;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.teacher;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.theme;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Calendar calendar2 = this.announcedAtUTC;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Mode mode2 = this.mode;
        int hashCode7 = (hashCode6 + (mode2 != null ? mode2.hashCode() : 0)) * 31;
        Group group2 = this.group;
        if (group2 != null) {
            i2 = group2.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("AnnouncedTestDto(uid=");
        a2.append(this.uid);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(", classScheduleNumber=");
        a2.append(this.classScheduleNumber);
        a2.append(", subject=");
        a2.append(this.subject);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(", theme=");
        a2.append(this.theme);
        a2.append(", announcedAtUTC=");
        a2.append(this.announcedAtUTC);
        a2.append(", mode=");
        a2.append(this.mode);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }
}
