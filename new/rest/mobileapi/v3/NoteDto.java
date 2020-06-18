package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002/0BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\fHÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÂ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0010\u0010\u000b\u001a\u00020\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto;", "", "uid", "", "title", "content", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "date", "creatingTime", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;)V", "getContent", "()Ljava/lang/String;", "getCreatingTime", "()Ljava/util/Calendar;", "getDate", "groupUid", "getGroupUid", "getSeenByTutelaryUTC", "getTeacher", "getTitle", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "UidStructure", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoteDto.kt */
public final class NoteDto {
    @c("Tartalom")
    public final String content;
    @c("KeszitesDatuma")
    public final Calendar creatingTime;
    @c("Datum")
    public final Calendar date;
    @c("OsztalyCsoport")
    public final UidStructure group;
    @c("LattamozasDatuma")
    public final Calendar seenByTutelaryUTC;
    @c("KeszitoTanarNeve")
    public final String teacher;
    @c("Cim")
    public final String title;
    @c("Tipus")
    public final ValueDescriptor type;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NoteDto.kt */
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: NoteDto.kt */
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

    public static /* synthetic */ NoteDto copy$default(NoteDto noteDto, String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure, int i2, Object obj) {
        NoteDto noteDto2 = noteDto;
        int i3 = i2;
        return noteDto.copy((i3 & 1) != 0 ? noteDto2.uid : str, (i3 & 2) != 0 ? noteDto2.title : str2, (i3 & 4) != 0 ? noteDto2.content : str3, (i3 & 8) != 0 ? noteDto2.seenByTutelaryUTC : calendar, (i3 & 16) != 0 ? noteDto2.teacher : str4, (i3 & 32) != 0 ? noteDto2.date : calendar2, (i3 & 64) != 0 ? noteDto2.creatingTime : calendar3, (i3 & 128) != 0 ? noteDto2.type : valueDescriptor, (i3 & 256) != 0 ? noteDto2.group : uidStructure);
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
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(str3, "content");
        String str5 = str4;
        Intrinsics.checkParameterIsNotNull(str5, "teacher");
        Calendar calendar4 = calendar2;
        Intrinsics.checkParameterIsNotNull(calendar4, "date");
        Calendar calendar5 = calendar3;
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        ValueDescriptor valueDescriptor2 = valueDescriptor;
        Intrinsics.checkParameterIsNotNull(valueDescriptor2, "type");
        return new NoteDto(str, str2, str3, calendar, str5, calendar4, calendar5, valueDescriptor2, uidStructure);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteDto)) {
            return false;
        }
        NoteDto noteDto = (NoteDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) noteDto.uid) && Intrinsics.areEqual((Object) this.title, (Object) noteDto.title) && Intrinsics.areEqual((Object) this.content, (Object) noteDto.content) && Intrinsics.areEqual((Object) this.seenByTutelaryUTC, (Object) noteDto.seenByTutelaryUTC) && Intrinsics.areEqual((Object) this.teacher, (Object) noteDto.teacher) && Intrinsics.areEqual((Object) this.date, (Object) noteDto.date) && Intrinsics.areEqual((Object) this.creatingTime, (Object) noteDto.creatingTime) && Intrinsics.areEqual((Object) this.type, (Object) noteDto.type) && Intrinsics.areEqual((Object) this.group, (Object) noteDto.group);
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
        int i2 = 0;
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
            i2 = uidStructure.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("NoteDto(uid=");
        a2.append(this.uid);
        a2.append(", title=");
        a2.append(this.title);
        a2.append(", content=");
        a2.append(this.content);
        a2.append(", seenByTutelaryUTC=");
        a2.append(this.seenByTutelaryUTC);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(", date=");
        a2.append(this.date);
        a2.append(", creatingTime=");
        a2.append(this.creatingTime);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoteDto(String str, String str2, String str3, Calendar calendar, String str4, Calendar calendar2, Calendar calendar3, ValueDescriptor valueDescriptor, UidStructure uidStructure, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : calendar, str4, calendar2, calendar3, valueDescriptor, uidStructure);
    }
}
