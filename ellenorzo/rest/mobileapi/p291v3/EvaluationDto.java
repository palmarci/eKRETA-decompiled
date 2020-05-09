package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0003STUB£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0011HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\t\u0010B\u001a\u00020\u0011HÂ\u0003J\t\u0010C\u001a\u00020\u0017HÂ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J¾\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\tHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0015\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0010\u0010\u0016\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010-\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0013\u0010/\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0013\u00101\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR\u0010\u0010\u0010\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001c¨\u0006V"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "", "uid", "", "form", "weight", "value", "shortValue", "numberValue", "", "seenByTutelaryUTC", "Ljava/util/Calendar;", "teacher", "recordingDate", "creatingTime", "theme", "type", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "subject", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;", "mode", "formType", "group", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;)V", "getCreatingTime", "()Ljava/util/Calendar;", "getForm", "()Ljava/lang/String;", "formTypeDescription", "getFormTypeDescription", "formTypeName", "getFormTypeName", "groupUid", "getGroupUid", "modeDescription", "getModeDescription", "modeName", "getModeName", "getNumberValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecordingDate", "getSeenByTutelaryUTC", "getShortValue", "subjectCategoryDescription", "getSubjectCategoryDescription", "subjectCategoryName", "getSubjectCategoryName", "subjectName", "getSubjectName", "getTeacher", "getTheme", "typeDescription", "getTypeDescription", "typeName", "getTypeName", "getUid", "getValue", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;)Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto;", "equals", "", "other", "hashCode", "toString", "Subject", "UidStructure", "ValueDescriptor", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto */
/* compiled from: EvaluationDto.kt */
public final class EvaluationDto {
    @C2580c("KeszitesDatuma")
    public final Calendar creatingTime;
    @C2580c("Jelleg")
    public final String form;
    @C2580c("ErtekFajta")
    public final ValueDescriptor formType;
    @C2580c("OsztalyCsoport")
    public final UidStructure group;
    @C2580c("Mod")
    public final ValueDescriptor mode;
    @C2580c("SzamErtek")
    public final Integer numberValue;
    @C2580c("RogzitesDatuma")
    public final Calendar recordingDate;
    @C2580c("LattamozasDatuma")
    public final Calendar seenByTutelaryUTC;
    @C2580c("SzovegesErtekelesRovidNev")
    public final String shortValue;
    @C2580c("Tantargy")
    public final Subject subject;
    @C2580c("ErtekeloTanarNeve")
    public final String teacher;
    @C2580c("Tema")
    public final String theme;
    @C2580c("Tipus")
    public final ValueDescriptor type;
    @C2580c("Uid")
    public final String uid;
    @C2580c("SzovegesErtek")
    public final String value;
    @C2580c("SulySzazalekErteke")
    public final String weight;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$Subject;", "", "uid", "", "subjectCategory", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "name", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSubjectCategory", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$Subject */
    /* compiled from: EvaluationDto.kt */
    public static final class Subject {
        @C2580c("Nev")
        public final String name;
        @C2580c("Kategoria")
        public final ValueDescriptor subjectCategory;
        @C2580c("Uid")
        public final String uid;

        public Subject(String str, ValueDescriptor valueDescriptor, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(valueDescriptor, "subjectCategory");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            this.uid = str;
            this.subjectCategory = valueDescriptor;
            this.name = str2;
        }

        public static /* synthetic */ Subject copy$default(Subject subject, String str, ValueDescriptor valueDescriptor, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subject.uid;
            }
            if ((i & 2) != 0) {
                valueDescriptor = subject.subjectCategory;
            }
            if ((i & 4) != 0) {
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

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.Subject
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$Subject r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.Subject) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r0 = r2.subjectCategory
                hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r1 = r3.subjectCategory
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.Subject.equals(java.lang.Object):boolean");
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
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ValueDescriptor valueDescriptor = this.subjectCategory;
            int hashCode2 = (hashCode + (valueDescriptor != null ? valueDescriptor.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("Subject(uid=");
            a.append(this.uid);
            a.append(", subjectCategory=");
            a.append(this.subjectCategory);
            a.append(", name=");
            return C0082a.m106a(a, this.name, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$UidStructure;", "", "uid", "", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$UidStructure */
    /* compiled from: EvaluationDto.kt */
    public static final class UidStructure {
        @C2580c("Uid")
        public final String uid;

        public UidStructure(String str) {
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
            return new UidStructure(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.uid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.UidStructure) r2).uid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.UidStructure
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$UidStructure r2 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.UidStructure) r2
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.UidStructure.equals(java.lang.Object):boolean");
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

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/EvaluationDto$ValueDescriptor;", "", "uid", "", "description", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor */
    /* compiled from: EvaluationDto.kt */
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
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.ValueDescriptor
                if (r0 == 0) goto L_0x0027
                hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.ValueDescriptor) r3
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
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.ValueDescriptor.equals(java.lang.Object):boolean");
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

    public EvaluationDto(String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure) {
        String str8 = str;
        String str9 = str4;
        String str10 = str6;
        Calendar calendar4 = calendar2;
        Calendar calendar5 = calendar3;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        ValueDescriptor valueDescriptor5 = valueDescriptor3;
        UidStructure uidStructure2 = uidStructure;
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "value");
        Intrinsics.checkParameterIsNotNull(str10, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar4, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar5, "creatingTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor4, "type");
        Intrinsics.checkParameterIsNotNull(valueDescriptor5, "formType");
        Intrinsics.checkParameterIsNotNull(uidStructure2, "group");
        this.uid = str8;
        this.form = str2;
        this.weight = str3;
        this.value = str9;
        this.shortValue = str5;
        this.numberValue = num;
        this.seenByTutelaryUTC = calendar;
        this.teacher = str10;
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

    public static /* synthetic */ EvaluationDto copy$default(EvaluationDto evaluationDto, String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i, Object obj) {
        EvaluationDto evaluationDto2 = evaluationDto;
        int i2 = i;
        return evaluationDto.copy((i2 & 1) != 0 ? evaluationDto2.uid : str, (i2 & 2) != 0 ? evaluationDto2.form : str2, (i2 & 4) != 0 ? evaluationDto2.weight : str3, (i2 & 8) != 0 ? evaluationDto2.value : str4, (i2 & 16) != 0 ? evaluationDto2.shortValue : str5, (i2 & 32) != 0 ? evaluationDto2.numberValue : num, (i2 & 64) != 0 ? evaluationDto2.seenByTutelaryUTC : calendar, (i2 & 128) != 0 ? evaluationDto2.teacher : str6, (i2 & 256) != 0 ? evaluationDto2.recordingDate : calendar2, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? evaluationDto2.creatingTime : calendar3, (i2 & 1024) != 0 ? evaluationDto2.theme : str7, (i2 & 2048) != 0 ? evaluationDto2.type : valueDescriptor, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? evaluationDto2.subject : subject2, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? evaluationDto2.mode : valueDescriptor2, (i2 & 16384) != 0 ? evaluationDto2.formType : valueDescriptor3, (i2 & 32768) != 0 ? evaluationDto2.group : uidStructure);
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
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        Integer num2 = num;
        Calendar calendar4 = calendar;
        String str13 = str6;
        Calendar calendar5 = calendar2;
        Calendar calendar6 = calendar3;
        String str14 = str7;
        ValueDescriptor valueDescriptor4 = valueDescriptor;
        Subject subject3 = subject2;
        ValueDescriptor valueDescriptor5 = valueDescriptor2;
        ValueDescriptor valueDescriptor6 = valueDescriptor3;
        UidStructure uidStructure2 = uidStructure;
        String str15 = str8;
        Intrinsics.checkParameterIsNotNull(str8, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "value");
        Intrinsics.checkParameterIsNotNull(str6, "teacher");
        Intrinsics.checkParameterIsNotNull(calendar2, "recordingDate");
        Intrinsics.checkParameterIsNotNull(calendar3, "creatingTime");
        Intrinsics.checkParameterIsNotNull(valueDescriptor, "type");
        Intrinsics.checkParameterIsNotNull(valueDescriptor3, "formType");
        Intrinsics.checkParameterIsNotNull(uidStructure, "group");
        EvaluationDto evaluationDto = new EvaluationDto(str15, str9, str10, str11, str12, num2, calendar4, str13, calendar5, calendar6, str14, valueDescriptor4, subject3, valueDescriptor5, valueDescriptor6, uidStructure2);
        return evaluationDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.group, (java.lang.Object) r3.group) != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00ab
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.form
            java.lang.String r1 = r3.form
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.weight
            java.lang.String r1 = r3.weight
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.value
            java.lang.String r1 = r3.value
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.shortValue
            java.lang.String r1 = r3.shortValue
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.Integer r0 = r2.numberValue
            java.lang.Integer r1 = r3.numberValue
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.util.Calendar r0 = r2.seenByTutelaryUTC
            java.util.Calendar r1 = r3.seenByTutelaryUTC
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.teacher
            java.lang.String r1 = r3.teacher
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.util.Calendar r0 = r2.recordingDate
            java.util.Calendar r1 = r3.recordingDate
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.util.Calendar r0 = r2.creatingTime
            java.util.Calendar r1 = r3.creatingTime
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = r2.theme
            java.lang.String r1 = r3.theme
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r0 = r2.type
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r1 = r3.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$Subject r0 = r2.subject
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$Subject r1 = r3.subject
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r0 = r2.mode
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r1 = r3.mode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r0 = r2.formType
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$ValueDescriptor r1 = r3.formType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x00a9
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$UidStructure r0 = r2.group
            hu.ekreta.ellenorzo.rest.mobileapi.v3.EvaluationDto$UidStructure r3 = r3.group
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r3 = 0
            return r3
        L_0x00ab:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.EvaluationDto.equals(java.lang.Object):boolean");
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
        Subject subject2 = this.subject;
        if (subject2 != null) {
            ValueDescriptor subjectCategory = subject2.getSubjectCategory();
            if (subjectCategory != null) {
                return subjectCategory.getDescription();
            }
        }
        return null;
    }

    public final String getSubjectCategoryName() {
        Subject subject2 = this.subject;
        if (subject2 != null) {
            ValueDescriptor subjectCategory = subject2.getSubjectCategory();
            if (subjectCategory != null) {
                return subjectCategory.getName();
            }
        }
        return null;
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
        int i = 0;
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
            i = uidStructure.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("EvaluationDto(uid=");
        a.append(this.uid);
        a.append(", form=");
        a.append(this.form);
        a.append(", weight=");
        a.append(this.weight);
        a.append(", value=");
        a.append(this.value);
        a.append(", shortValue=");
        a.append(this.shortValue);
        a.append(", numberValue=");
        a.append(this.numberValue);
        a.append(", seenByTutelaryUTC=");
        a.append(this.seenByTutelaryUTC);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(", recordingDate=");
        a.append(this.recordingDate);
        a.append(", creatingTime=");
        a.append(this.creatingTime);
        a.append(", theme=");
        a.append(this.theme);
        a.append(", type=");
        a.append(this.type);
        a.append(", subject=");
        a.append(this.subject);
        a.append(", mode=");
        a.append(this.mode);
        a.append(", formType=");
        a.append(this.formType);
        a.append(", group=");
        a.append(this.group);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ EvaluationDto(String str, String str2, String str3, String str4, String str5, Integer num, Calendar calendar, String str6, Calendar calendar2, Calendar calendar3, String str7, ValueDescriptor valueDescriptor, Subject subject2, ValueDescriptor valueDescriptor2, ValueDescriptor valueDescriptor3, UidStructure uidStructure, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : calendar, str6, calendar2, calendar3, str7, valueDescriptor, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : subject2, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : valueDescriptor2, valueDescriptor3, uidStructure);
    }
}
