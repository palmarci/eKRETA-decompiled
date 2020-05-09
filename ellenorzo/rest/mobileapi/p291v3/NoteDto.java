package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002/0BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\fHÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÂ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u00061"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto;", "", "uid", "", "title", "content", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "date", "creatingTime", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;)V", "getContent", "()Ljava/lang/String;", "getCreatingTime", "()Ljava/util/Calendar;", "getDate", "groupUid", "getGroupUid", "getSeenByTutelaryUTC", "getTeacher", "getTitle", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto */
/* compiled from: NoteDto.kt */
public final class NoteDto {
    @C2580c("Tartalom")
    public final String content;
    @C2580c("KeszitesDatuma")
    public final Calendar creatingTime;
    @C2580c("Datum")
    public final Calendar date;
    @C2580c("OsztalyCsoport")
    public final UidStructure group;
    @C2580c("LattamozasDatuma")
    public final Calendar seenByTutelaryUTC;
    @C2580c("KeszitoTanarNeve")
    public final String teacher;
    @C2580c("Cim")
    public final String title;
    @C2580c("Tipus")
    public final ValueDescriptor type;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$UidStructure */
    /* compiled from: NoteDto.kt */
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
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.UidStructure) r2
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.UidStructure.equals(java.lang.Object):boolean");
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

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$ValueDescriptor */
    /* compiled from: NoteDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.ValueDescriptor) r3
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.ValueDescriptor.equals(java.lang.Object):boolean");
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

    public NoteDto(String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(str3, "content");
        Intrinsics.checkParameterIsNotNull(str4, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "date");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "type");
        this.uid = str;
        this.title = str2;
        this.content = str3;
        this.seenByTutelaryUTC = calendar;
        this.teacher = str4;
        this.date = calendar2;
        this.creatingTime = calendar3;
        this.type = valueDescriptor;
        this.group = uidStructure;
    }

    private final ValueDescriptor component8() {
        return this.type;
    }

    private final UidStructure component9() {
        return this.group;
    }

    public static /* synthetic */ NoteDto copy$default(NoteDto noteDto, String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure, int i, Object obj) {
        NoteDto noteDto2 = noteDto;
        int i2 = i;
        return noteDto.copy((i2 & 1) != 0 ? noteDto2.uid : str, (i2 & 2) != 0 ? noteDto2.title : str2, (i2 & 4) != 0 ? noteDto2.content : str3, (i2 & 8) != 0 ? noteDto2.seenByTutelaryUTC : calendar, (i2 & 16) != 0 ? noteDto2.teacher : str4, (i2 & 32) != 0 ? noteDto2.date : calendar2, (i2 & 64) != 0 ? noteDto2.creatingTime : calendar3, (i2 & 128) != 0 ? noteDto2.type : valueDescriptor, (i2 & 256) != 0 ? noteDto2.group : uidStructure);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.content;
    }

    public final Calendar component4() {
        return this.seenByTutelaryUTC;
    }

    public final String component5() {
        return this.teacher;
    }

    public final Calendar component6() {
        return this.date;
    }

    public final Calendar component7() {
        return this.creatingTime;
    }

    public final NoteDto copy(String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure) {
        String str5 = str;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str6 = str2;
        Intrinsics.checkParameterIsNotNull(str2, "title");
        String str7 = str3;
        Intrinsics.checkParameterIsNotNull(str3, "content");
        String str8 = str4;
        Intrinsics.checkParameterIsNotNull(str8, "teacher");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "date");
        Calendar calendar5 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        ValueDescriptor valueDescriptor2 = valueDescriptor;
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "type");
        NoteDto noteDto = new NoteDto(str5, str6, str7, calendar, str8, calendar4, calendar5, valueDescriptor2, uidStructure);
        return noteDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.group, (java.lang.Object) r3.group) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto
            if (r0 == 0) goto L_0x0063
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.util.Calendar r0 = r2.seenByTutelaryUTC
            java.util.Calendar r1 = r3.seenByTutelaryUTC
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.teacher
            java.lang.String r1 = r3.teacher
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.util.Calendar r0 = r2.date
            java.util.Calendar r1 = r3.date
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.util.Calendar r0 = r2.creatingTime
            java.util.Calendar r1 = r3.creatingTime
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$ValueDescriptor r0 = r2.type
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$ValueDescriptor r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$UidStructure r0 = r2.group
            hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto$UidStructure r3 = r3.group
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NoteDto.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.content;
    }

    public final Calendar getCreatingTime() {
        return this.creatingTime;
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

    public final Calendar getSeenByTutelaryUTC() {
        return this.seenByTutelaryUTC;
    }

    public final String getTeacher() {
        return this.teacher;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTypeDescription() {
        return this.type.getDescription();
    }

    public final String getTypeName() {
        return this.type.getName();
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Calendar calendar = this.seenByTutelaryUTC;
        int hashCode4 = (hashCode3 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str4 = this.teacher;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Calendar calendar2 = this.date;
        int hashCode6 = (hashCode5 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.creatingTime;
        int hashCode7 = (hashCode6 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor = this.type;
        int hashCode8 = (hashCode7 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i = uidStructure.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("NoteDto(uid=");
        a.append(this.uid);
        a.append(", title=");
        a.append(this.title);
        a.append(", content=");
        a.append(this.content);
        a.append(", seenByTutelaryUTC=");
        a.append(this.seenByTutelaryUTC);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(", date=");
        a.append(this.date);
        a.append(", creatingTime=");
        a.append(this.creatingTime);
        a.append(", type=");
        a.append(this.type);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ NoteDto(String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : calendar, str4, calendar2, calendar3, valueDescriptor, uidStructure);
    }
}
