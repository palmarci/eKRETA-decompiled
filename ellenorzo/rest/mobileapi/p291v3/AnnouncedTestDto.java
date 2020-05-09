package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u000201BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\rHÂ\u0003J\t\u0010)\u001a\u00020\u000fHÂ\u0003Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0010\u0010\u000e\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00062"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "", "uid", "", "date", "Ljava/util/Calendar;", "classScheduleNumber", "", "subject", "teacher", "theme", "announcedAtUTC", "mode", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;", "(Ljava/lang/String;Ljava/util/Calendar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;)V", "getAnnouncedAtUTC", "()Ljava/util/Calendar;", "getClassScheduleNumber", "()I", "getDate", "groupUid", "getGroupUid", "()Ljava/lang/String;", "modeDescription", "getModeDescription", "modeName", "getModeName", "getSubject", "getTeacher", "getTheme", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Group", "Mode", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto */
/* compiled from: AnnouncedTestDto.kt */
public final class AnnouncedTestDto {
    @C2580c("BejelentesDatuma")
    public final Calendar announcedAtUTC;
    @C2580c("OrarendiOraOraszama")
    public final int classScheduleNumber;
    @C2580c("Datum")
    public final Calendar date;
    @C2580c("OsztalyCsoport")
    public final Group group;
    @C2580c("Modja")
    public final Mode mode;
    @C2580c("TantargyNeve")
    public final String subject;
    @C2580c("RogzitoTanarNeve")
    public final String teacher;
    @C2580c("Temaja")
    public final String theme;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Group;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto$Group */
    /* compiled from: AnnouncedTestDto.kt */
    public static final class Group {
        @C2580c("Uid")
        public final String uid;

        public Group(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.uid = str;
        }

        public static /* synthetic */ Group copy$default(Group group, String str, int i, Object obj) {
            if ((i & 1) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Group) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Group
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto$Group r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Group) r2
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Group.equals(java.lang.Object):boolean");
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
            return C0082a.m106a(C0082a.m111a("Group(uid="), this.uid, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto$Mode;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto$Mode */
    /* compiled from: AnnouncedTestDto.kt */
    public static final class Mode {
        @C2580c("Leiras")
        public final String description;
        @C2580c("Nev")
        public final String name;
        @C2580c("Uid")
        public final String uid;

        public Mode(String str, String str2, String str3) {
            C0082a.m114a(str, "uid", str2, "description", str3, "name");
            this.uid = str;
            this.description = str2;
            this.name = str3;
        }

        public static /* synthetic */ Mode copy$default(Mode mode, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mode.uid;
            }
            if ((i & 2) != 0) {
                str2 = mode.description;
            }
            if ((i & 4) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Mode
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto$Mode r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Mode) r3
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto.Mode.equals(java.lang.Object):boolean");
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
            StringBuilder a = C0082a.m111a("Mode(uid=");
            a.append(this.uid);
            a.append(", description=");
            a.append(this.description);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    public AnnouncedTestDto(String str, Calendar calendar, int i, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        Intrinsics.checkParameterIsNotNull(str3, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "announcedAtUTC");
        Intrinsics.checkParameterIsNotNull(mode2, "mode");
        Intrinsics.checkParameterIsNotNull(group2, "group");
        this.uid = str;
        this.date = calendar;
        this.classScheduleNumber = i;
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

    public static /* synthetic */ AnnouncedTestDto copy$default(AnnouncedTestDto announcedTestDto, String str, Calendar calendar, int i, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2, int i2, Object obj) {
        AnnouncedTestDto announcedTestDto2 = announcedTestDto;
        int i3 = i2;
        return announcedTestDto.copy((i3 & 1) != 0 ? announcedTestDto2.uid : str, (i3 & 2) != 0 ? announcedTestDto2.date : calendar, (i3 & 4) != 0 ? announcedTestDto2.classScheduleNumber : i, (i3 & 8) != 0 ? announcedTestDto2.subject : str2, (i3 & 16) != 0 ? announcedTestDto2.teacher : str3, (i3 & 32) != 0 ? announcedTestDto2.theme : str4, (i3 & 64) != 0 ? announcedTestDto2.announcedAtUTC : calendar2, (i3 & 128) != 0 ? announcedTestDto2.mode : mode2, (i3 & 256) != 0 ? announcedTestDto2.group : group2);
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

    public final AnnouncedTestDto copy(String str, Calendar calendar, int i, String str2, String str3, String str4, Calendar calendar2, Mode mode2, Group group2) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Calendar calendar3 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar, "date");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "subject");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str7, "teacher");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "announcedAtUTC");
        Mode mode3 = mode2;
        Intrinsics.checkParameterIsNotNull(mode3, "mode");
        Group group3 = group2;
        Intrinsics.checkParameterIsNotNull(group3, "group");
        AnnouncedTestDto announcedTestDto = new AnnouncedTestDto(str5, calendar3, i, str6, str7, str4, calendar4, mode3, group3);
        return announcedTestDto;
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
        int i = 0;
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
            i = group2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AnnouncedTestDto(uid=");
        a.append(this.uid);
        a.append(", date=");
        a.append(this.date);
        a.append(", classScheduleNumber=");
        a.append(this.classScheduleNumber);
        a.append(", subject=");
        a.append(this.subject);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(", theme=");
        a.append(this.theme);
        a.append(", announcedAtUTC=");
        a.append(this.announcedAtUTC);
        a.append(", mode=");
        a.append(this.mode);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }
}
