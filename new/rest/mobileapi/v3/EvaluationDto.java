package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0003STUB£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0011HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\t\u0010B\u001a\u00020\u0011HÂ\u0003J\t\u0010C\u001a\u00020\u0017HÂ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J¾\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\tHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0015\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0010\u0010\u0016\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010-\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0013\u0010/\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0013\u00101\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001c¨\u0006V"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "", "uid", "", "form", "weight", "value", "shortValue", "numberValue", "", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "theme", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;", "mode", "formType", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;)V", "getCreatingTime", "()Ljava/util/Calendar;", "getForm", "()Ljava/lang/String;", "formTypeDescription", "getFormTypeDescription", "formTypeName", "getFormTypeName", "groupUid", "getGroupUid", "modeDescription", "getModeDescription", "modeName", "getModeName", "getNumberValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecordingDate", "getSeenByTutelaryUTC", "getShortValue", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getTeacher", "getTheme", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "getValue", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "equals", "", "other", "hashCode", "toString", "Subject", "UidStructure", "ValueDescriptor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationDto.kt */
public final class EvaluationDto {
    @c("KeszitesDatuma")
    public final Calendar creatingTime;
    @c("Jelleg")
    public final String form;
    @c("ErtekFajta")
    public final ValueDescriptor formType;
    @c("OsztalyCsoport")
    public final UidStructure group;
    @c("Mod")
    public final ValueDescriptor mode;
    @c("SzamErtek")
    public final Integer numberValue;
    @c("RogzitesDatuma")
    public final Calendar recordingDate;
    @c("LattamozasDatuma")
    public final Calendar seenByTutelaryUTC;
    @c("SzovegesErtekelesRovidNev")
    public final String shortValue;
    @c("Tantargy")
    public final Subject subject;
    @c("ErtekeloTanarNeve")
    public final String teacher;
    @c("Tema")
    public final String theme;
    @c("Tipus")
    public final ValueDescriptor type;
    @c("Uid")
    public final String uid;
    @c("SzovegesErtek")
    public final String value;
    @c("SulySzazalekErteke")
    public final String weight;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: EvaluationDto.kt */
    public static final class Subject {
        @c("Nev")
        public final String name;
        @c("Kategoria")
        public final ValueDescriptor subjectCategory;
        @c("Uid")
        public final String uid;

        public Subject(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.subjectCategory = valueDescriptor;
            this.name = str2;
        }

        public static /* synthetic */ Subject copy$default(Subject subject, String str, ValueDescriptor valueDescriptor, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = subject.uid;
            }
            if ((i2 & 2) != 0) {
                valueDescriptor = subject.subjectCategory;
            }
            if ((i2 & 4) != 0) {
                str2 = subject.name;
            }
            return subject.copy(str, valueDescriptor, str2);
        }

        public final String component1() {
            return this.uid;
        }

        public final ValueDescriptor component2() {
            return this.subjectCategory;
        }

        public final String component3() {
            return this.name;
        }

        public final Subject copy(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            return new Subject(str, valueDescriptor, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subject)) {
                return false;
            }
            Subject subject = (Subject) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) subject.uid) && Intrinsics.areEqual((Object) this.subjectCategory, (Object) subject.subjectCategory) && Intrinsics.areEqual((Object) this.name, (Object) subject.name);
        }

        public final String getName() {
            return this.name;
        }

        public final ValueDescriptor getSubjectCategory() {
            return this.subjectCategory;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ValueDescriptor valueDescriptor = this.subjectCategory;
            int hashCode2 = (hashCode + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("Subject(uid=");
            a2.append(this.uid);
            a2.append(", subjectCategory=");
            a2.append(this.subjectCategory);
            a2.append(", name=");
            return a.a(a2, this.name, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: EvaluationDto.kt */
    public static final class UidStructure {
        @c("Uid")
        public final String uid;

        public UidStructure(String str) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: EvaluationDto.kt */
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

    public EvaluationDto(String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        String str8 = str6;
        Calendar calendar4 = calendar2;
        Calendar calendar5 = calendar3;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        ValueDescriptor valueDescriptor5 = valueDescriptor3;
        UidStructure uidStructure2 = uidStructure;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "value");
        Intrinsics.checkParameterIsNotNull(str8, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "type");
        Intrinsics.checkParameterIsNotNull(valueDescriptor5, "formType");
        Intrinsics.checkParameterIsNotNull(uidStructure2, "group");
        this.uid = str;
        this.form = str2;
        this.weight = str3;
        this.value = str4;
        this.shortValue = str5;
        this.numberValue = num;
        this.seenByTutelaryUTC = calendar;
        this.teacher = str8;
        this.recordingDate = calendar4;
        this.creatingTime = calendar5;
        this.theme = str7;
        this.type = valueDescriptor4;
        this.subject = subject2;
        this.mode = valueDescriptor2;
        this.formType = valueDescriptor5;
        this.group = uidStructure2;
    }

    private final ValueDescriptor component12() {
        return this.type;
    }

    private final Subject component13() {
        return this.subject;
    }

    private final ValueDescriptor component14() {
        return this.mode;
    }

    private final ValueDescriptor component15() {
        return this.formType;
    }

    private final UidStructure component16() {
        return this.group;
    }

    public static /* synthetic */ EvaluationDto copy$default(EvaluationDto evaluationDto, String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i2, Object obj) {
        EvaluationDto evaluationDto2 = evaluationDto;
        int i3 = i2;
        return evaluationDto.copy((i3 & 1) != 0 ? evaluationDto2.uid : str, (i3 & 2) != 0 ? evaluationDto2.form : str2, (i3 & 4) != 0 ? evaluationDto2.weight : str3, (i3 & 8) != 0 ? evaluationDto2.value : str4, (i3 & 16) != 0 ? evaluationDto2.shortValue : str5, (i3 & 32) != 0 ? evaluationDto2.numberValue : num, (i3 & 64) != 0 ? evaluationDto2.seenByTutelaryUTC : calendar, (i3 & 128) != 0 ? evaluationDto2.teacher : str6, (i3 & 256) != 0 ? evaluationDto2.recordingDate : calendar2, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? evaluationDto2.creatingTime : calendar3, (i3 & 1024) != 0 ? evaluationDto2.theme : str7, (i3 & 2048) != 0 ? evaluationDto2.type : valueDescriptor, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? evaluationDto2.subject : subject2, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? evaluationDto2.mode : valueDescriptor2, (i3 & 16384) != 0 ? evaluationDto2.formType : valueDescriptor3, (i3 & 32768) != 0 ? evaluationDto2.group : uidStructure);
    }

    public final String component1() {
        return this.uid;
    }

    public final Calendar component10() {
        return this.creatingTime;
    }

    public final String component11() {
        return this.theme;
    }

    public final String component2() {
        return this.form;
    }

    public final String component3() {
        return this.weight;
    }

    public final String component4() {
        return this.value;
    }

    public final String component5() {
        return this.shortValue;
    }

    public final Integer component6() {
        return this.numberValue;
    }

    public final Calendar component7() {
        return this.seenByTutelaryUTC;
    }

    public final String component8() {
        return this.teacher;
    }

    public final Calendar component9() {
        return this.recordingDate;
    }

    public final EvaluationDto copy(String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        String str8 = str;
        Intrinsics.checkParameterIsNotNull(str8, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "value");
        Intrinsics.checkParameterIsNotNull(str6, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "type");
        Intrinsics.checkParameterIsNotNull(valueDescriptor3, "formType");
        Intrinsics.checkParameterIsNotNull(uidStructure, "group");
        return new EvaluationDto(str8, str2, str3, str4, str5, num, calendar, str6, calendar2, calendar3, str7, valueDescriptor, subject2, valueDescriptor2, valueDescriptor3, uidStructure);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationDto)) {
            return false;
        }
        EvaluationDto evaluationDto = (EvaluationDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) evaluationDto.uid) && Intrinsics.areEqual((Object) this.form, (Object) evaluationDto.form) && Intrinsics.areEqual((Object) this.weight, (Object) evaluationDto.weight) && Intrinsics.areEqual((Object) this.value, (Object) evaluationDto.value) && Intrinsics.areEqual((Object) this.shortValue, (Object) evaluationDto.shortValue) && Intrinsics.areEqual((Object) this.numberValue, (Object) evaluationDto.numberValue) && Intrinsics.areEqual((Object) this.seenByTutelaryUTC, (Object) evaluationDto.seenByTutelaryUTC) && Intrinsics.areEqual((Object) this.teacher, (Object) evaluationDto.teacher) && Intrinsics.areEqual((Object) this.recordingDate, (Object) evaluationDto.recordingDate) && Intrinsics.areEqual((Object) this.creatingTime, (Object) evaluationDto.creatingTime) && Intrinsics.areEqual((Object) this.theme, (Object) evaluationDto.theme) && Intrinsics.areEqual((Object) this.type, (Object) evaluationDto.type) && Intrinsics.areEqual((Object) this.subject, (Object) evaluationDto.subject) && Intrinsics.areEqual((Object) this.mode, (Object) evaluationDto.mode) && Intrinsics.areEqual((Object) this.formType, (Object) evaluationDto.formType) && Intrinsics.areEqual((Object) this.group, (Object) evaluationDto.group);
    }

    public final Calendar getCreatingTime() {
        return this.creatingTime;
    }

    public final String getForm() {
        return this.form;
    }

    public final String getFormTypeDescription() {
        return this.formType.getDescription();
    }

    public final String getFormTypeName() {
        return this.formType.getName();
    }

    public final String getGroupUid() {
        return this.group.getUid();
    }

    public final String getModeDescription() {
        ValueDescriptor valueDescriptor = this.mode;
        if (valueDescriptor != null) {
            return valueDescriptor.getDescription();
        }
        return null;
    }

    public final String getModeName() {
        ValueDescriptor valueDescriptor = this.mode;
        if (valueDescriptor != null) {
            return valueDescriptor.getName();
        }
        return null;
    }

    public final Integer getNumberValue() {
        return this.numberValue;
    }

    public final Calendar getRecordingDate() {
        return this.recordingDate;
    }

    public final Calendar getSeenByTutelaryUTC() {
        return this.seenByTutelaryUTC;
    }

    public final String getShortValue() {
        return this.shortValue;
    }

    public final String getSubjectCategoryDescription() {
        ValueDescriptor subjectCategory;
        Subject subject2 = this.subject;
        if (subject2 == null || (subjectCategory = subject2.getSubjectCategory()) == null) {
            return null;
        }
        return subjectCategory.getDescription();
    }

    public final String getSubjectCategoryName() {
        ValueDescriptor subjectCategory;
        Subject subject2 = this.subject;
        if (subject2 == null || (subjectCategory = subject2.getSubjectCategory()) == null) {
            return null;
        }
        return subjectCategory.getName();
    }

    public final String getSubjectName() {
        Subject subject2 = this.subject;
        if (subject2 != null) {
            return subject2.getName();
        }
        return null;
    }

    public final String getTeacher() {
        return this.teacher;
    }

    public final String getTheme() {
        return this.theme;
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

    public final String getValue() {
        return this.value;
    }

    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.form;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.weight;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.value;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.shortValue;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.numberValue;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Calendar calendar = this.seenByTutelaryUTC;
        int hashCode7 = (hashCode6 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str6 = this.teacher;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Calendar calendar2 = this.recordingDate;
        int hashCode9 = (hashCode8 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.creatingTime;
        int hashCode10 = (hashCode9 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str7 = this.theme;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor = this.type;
        int hashCode12 = (hashCode11 + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
        Subject subject2 = this.subject;
        int hashCode13 = (hashCode12 + (subject2 != null ? subject2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor2 = this.mode;
        int hashCode14 = (hashCode13 + (valueDescriptor2 != null ? valueDescriptor2.hashCode() : 0)) * 31;
        ValueDescriptor valueDescriptor3 = this.formType;
        int hashCode15 = (hashCode14 + (valueDescriptor3 != null ? valueDescriptor3.hashCode() : 0)) * 31;
        UidStructure uidStructure = this.group;
        if (uidStructure != null) {
            i2 = uidStructure.hashCode();
        }
        return hashCode15 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("EvaluationDto(uid=");
        a2.append(this.uid);
        a2.append(", form=");
        a2.append(this.form);
        a2.append(", weight=");
        a2.append(this.weight);
        a2.append(", value=");
        a2.append(this.value);
        a2.append(", shortValue=");
        a2.append(this.shortValue);
        a2.append(", numberValue=");
        a2.append(this.numberValue);
        a2.append(", seenByTutelaryUTC=");
        a2.append(this.seenByTutelaryUTC);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(", recordingDate=");
        a2.append(this.recordingDate);
        a2.append(", creatingTime=");
        a2.append(this.creatingTime);
        a2.append(", theme=");
        a2.append(this.theme);
        a2.append(", type=");
        a2.append(this.type);
        a2.append(", subject=");
        a2.append(this.subject);
        a2.append(", mode=");
        a2.append(this.mode);
        a2.append(", formType=");
        a2.append(this.formType);
        a2.append(", group=");
        a2.append(this.group);
        a2.append(")");
        return a2.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EvaluationDto(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, java.util.Calendar r27, java.lang.String r28, java.util.Calendar r29, java.util.Calendar r30, java.lang.String r31, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.ValueDescriptor r32, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.Subject r33, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.ValueDescriptor r34, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.ValueDescriptor r35, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.UidStructure r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r22
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r23
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r25
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r26
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r27
        L_0x002b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0032
            r16 = r2
            goto L_0x0034
        L_0x0032:
            r16 = r33
        L_0x0034:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x003b
            r17 = r2
            goto L_0x003d
        L_0x003b:
            r17 = r34
        L_0x003d:
            r3 = r20
            r4 = r21
            r7 = r24
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r18 = r35
            r19 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.Calendar, java.lang.String, java.util.Calendar, java.util.Calendar, java.lang.String, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$Subject, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor, hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$UidStructure, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
