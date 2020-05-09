package p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÂ\u0003J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\""}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "", "uid", "", "listOfClassDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto;", "teacher", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;", "(Ljava/lang/String;Ljava/util/List;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;)V", "emailList", "getEmailList", "()Ljava/util/List;", "getListOfClassDto", "name", "getName", "()Ljava/lang/String;", "phoneList", "getPhoneList", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "EmailDto", "EmployeeDto", "PhoneDto", "TeacherDto", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto */
/* compiled from: ClassMasterDto.kt */
public final class ClassMasterDto {
    @C2580c("Osztalyai")
    public final List<SchoolClassDto> listOfClassDto;
    @C2580c("Tanar")
    public final TeacherDto teacher;
    @C2580c("Uid")
    public final String uid;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmailDto;", "", "uid", "", "email", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto */
    /* compiled from: ClassMasterDto.kt */
    public static final class EmailDto {
        @C2580c("Email")
        public final String email;
        @C2580c("Uid")
        public final String uid;

        public EmailDto(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "email");
            this.uid = str;
            this.email = str2;
        }

        public static /* synthetic */ EmailDto copy$default(EmailDto emailDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emailDto.uid;
            }
            if ((i & 2) != 0) {
                str2 = emailDto.email;
            }
            return emailDto.copy(str, str2);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.email;
        }

        public final EmailDto copy(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "email");
            return new EmailDto(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.email, (java.lang.Object) r3.email) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmailDto
                if (r0 == 0) goto L_0x001d
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmailDto) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.email
                java.lang.String r3 = r3.email
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmailDto.equals(java.lang.Object):boolean");
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.email;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("EmailDto(uid=");
            a.append(this.uid);
            a.append(", email=");
            return C0082a.m106a(a, this.email, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "", "uid", "", "name", "phoneList", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$PhoneDto;", "emailList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmailDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEmailList", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPhoneList", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto */
    /* compiled from: ClassMasterDto.kt */
    public static final class EmployeeDto {
        @C2580c("Emailek")
        public final List<EmailDto> emailList;
        @C2580c("Nev")
        public final String name;
        @C2580c("Telefonok")
        public final List<PhoneDto> phoneList;
        @C2580c("Uid")
        public final String uid;

        public EmployeeDto(String str, String str2, List<PhoneDto> list, List<EmailDto> list2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(list, "phoneList");
            Intrinsics.checkParameterIsNotNull(list2, "emailList");
            this.uid = str;
            this.name = str2;
            this.phoneList = list;
            this.emailList = list2;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto>, for r4v0, types: [java.util.List] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto>, for r3v0, types: [java.util.List] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto copy$default(p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto r0, java.lang.String r1, java.lang.String r2, java.util.List<p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.PhoneDto> r3, java.util.List<p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmailDto> r4, int r5, java.lang.Object r6) {
            /*
                r6 = r5 & 1
                if (r6 == 0) goto L_0x0006
                java.lang.String r1 = r0.uid
            L_0x0006:
                r6 = r5 & 2
                if (r6 == 0) goto L_0x000c
                java.lang.String r2 = r0.name
            L_0x000c:
                r6 = r5 & 4
                if (r6 == 0) goto L_0x0012
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto> r3 = r0.phoneList
            L_0x0012:
                r5 = r5 & 8
                if (r5 == 0) goto L_0x0018
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto> r4 = r0.emailList
            L_0x0018:
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto r0 = r0.copy(r1, r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto.copy$default(hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto, java.lang.String, java.lang.String, java.util.List, java.util.List, int, java.lang.Object):hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto");
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.name;
        }

        public final List<PhoneDto> component3() {
            return this.phoneList;
        }

        public final List<EmailDto> component4() {
            return this.emailList;
        }

        public final EmployeeDto copy(String str, String str2, List<PhoneDto> list, List<EmailDto> list2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(list, "phoneList");
            Intrinsics.checkParameterIsNotNull(list2, "emailList");
            return new EmployeeDto(str, str2, list, list2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.emailList, (java.lang.Object) r3.emailList) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto
                if (r0 == 0) goto L_0x0031
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.name
                java.lang.String r1 = r3.name
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto> r0 = r2.phoneList
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto> r1 = r3.phoneList
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto> r0 = r2.emailList
                java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmailDto> r3 = r3.emailList
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.EmployeeDto.equals(java.lang.Object):boolean");
        }

        public final List<EmailDto> getEmailList() {
            return this.emailList;
        }

        public final String getName() {
            return this.name;
        }

        public final List<PhoneDto> getPhoneList() {
            return this.phoneList;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<PhoneDto> list = this.phoneList;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<EmailDto> list2 = this.emailList;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("EmployeeDto(uid=");
            a.append(this.uid);
            a.append(", name=");
            a.append(this.name);
            a.append(", phoneList=");
            a.append(this.phoneList);
            a.append(", emailList=");
            return C0082a.m108a(a, (List) this.emailList, ")");
        }

        public /* synthetic */ EmployeeDto(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 4) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            if ((i & 8) != 0) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(str, str2, list, list2);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$PhoneDto;", "", "uid", "", "phone", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto */
    /* compiled from: ClassMasterDto.kt */
    public static final class PhoneDto {
        @C2580c("Telefonszam")
        public final String phone;
        @C2580c("Uid")
        public final String uid;

        public PhoneDto(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "phone");
            this.uid = str;
            this.phone = str2;
        }

        public static /* synthetic */ PhoneDto copy$default(PhoneDto phoneDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phoneDto.uid;
            }
            if ((i & 2) != 0) {
                str2 = phoneDto.phone;
            }
            return phoneDto.copy(str, str2);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.phone;
        }

        public final PhoneDto copy(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "phone");
            return new PhoneDto(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.phone, (java.lang.Object) r3.phone) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.PhoneDto
                if (r0 == 0) goto L_0x001d
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$PhoneDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.PhoneDto) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.phone
                java.lang.String r3 = r3.phone
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.PhoneDto.equals(java.lang.Object):boolean");
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.phone;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("PhoneDto(uid=");
            a.append(this.uid);
            a.append(", phone=");
            return C0082a.m106a(a, this.phone, ")");
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;", "", "uid", "", "employee", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;)V", "getEmployee", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "getUid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto */
    /* compiled from: ClassMasterDto.kt */
    public static final class TeacherDto {
        @C2580c("Alkalmazott")
        public final EmployeeDto employee;
        @C2580c("Uid")
        public final String uid;

        public TeacherDto(String str, EmployeeDto employeeDto) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(employeeDto, "employee");
            this.uid = str;
            this.employee = employeeDto;
        }

        public static /* synthetic */ TeacherDto copy$default(TeacherDto teacherDto, String str, EmployeeDto employeeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = teacherDto.uid;
            }
            if ((i & 2) != 0) {
                employeeDto = teacherDto.employee;
            }
            return teacherDto.copy(str, employeeDto);
        }

        public final String component1() {
            return this.uid;
        }

        public final EmployeeDto component2() {
            return this.employee;
        }

        public final TeacherDto copy(String str, EmployeeDto employeeDto) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(employeeDto, "employee");
            return new TeacherDto(str, employeeDto);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.employee, (java.lang.Object) r3.employee) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.TeacherDto
                if (r0 == 0) goto L_0x001d
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.TeacherDto) r3
                java.lang.String r0 = r2.uid
                java.lang.String r1 = r3.uid
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x001d
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto r0 = r2.employee
                hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$EmployeeDto r3 = r3.employee
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.TeacherDto.equals(java.lang.Object):boolean");
        }

        public final EmployeeDto getEmployee() {
            return this.employee;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EmployeeDto employeeDto = this.employee;
            if (employeeDto != null) {
                i = employeeDto.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C0082a.m111a("TeacherDto(uid=");
            a.append(this.uid);
            a.append(", employee=");
            a.append(this.employee);
            a.append(")");
            return a.toString();
        }
    }

    public ClassMasterDto(String str, List<SchoolClassDto> list, TeacherDto teacherDto) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(list, "listOfClassDto");
        Intrinsics.checkParameterIsNotNull(teacherDto, "teacher");
        this.uid = str;
        this.listOfClassDto = list;
        this.teacher = teacherDto;
    }

    private final TeacherDto component3() {
        return this.teacher;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolClassDto>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto copy$default(p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto r0, java.lang.String r1, java.util.List<p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.SchoolClassDto> r2, p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.TeacherDto r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.uid
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolClassDto> r2 = r0.listOfClassDto
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto r3 = r0.teacher
        L_0x0012:
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.copy$default(hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto, java.lang.String, java.util.List, hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto, int, java.lang.Object):hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto");
    }

    public final String component1() {
        return this.uid;
    }

    public final List<SchoolClassDto> component2() {
        return this.listOfClassDto;
    }

    public final ClassMasterDto copy(String str, List<SchoolClassDto> list, TeacherDto teacherDto) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(list, "listOfClassDto");
        Intrinsics.checkParameterIsNotNull(teacherDto, "teacher");
        return new ClassMasterDto(str, list, teacherDto);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.teacher, (java.lang.Object) r3.teacher) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto r3 = (p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolClassDto> r0 = r2.listOfClassDto
            java.util.List<hu.ekreta.ellenorzo.rest.mobileapi.v3.SchoolClassDto> r1 = r3.listOfClassDto
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto r0 = r2.teacher
            hu.ekreta.ellenorzo.rest.mobileapi.v3.ClassMasterDto$TeacherDto r3 = r3.teacher
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
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.ClassMasterDto.equals(java.lang.Object):boolean");
    }

    public final List<String> getEmailList() {
        List<EmailDto> emailList = this.teacher.getEmployee().getEmailList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emailList, 10));
        for (EmailDto email : emailList) {
            arrayList.add(email.getEmail());
        }
        return arrayList;
    }

    public final List<SchoolClassDto> getListOfClassDto() {
        return this.listOfClassDto;
    }

    public final String getName() {
        return this.teacher.getEmployee().getName();
    }

    public final List<String> getPhoneList() {
        List<PhoneDto> phoneList = this.teacher.getEmployee().getPhoneList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(phoneList, 10));
        for (PhoneDto phone : phoneList) {
            arrayList.add(phone.getPhone());
        }
        return arrayList;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SchoolClassDto> list = this.listOfClassDto;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        TeacherDto teacherDto = this.teacher;
        if (teacherDto != null) {
            i = teacherDto.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ClassMasterDto(uid=");
        a.append(this.uid);
        a.append(", listOfClassDto=");
        a.append(this.listOfClassDto);
        a.append(", teacher=");
        a.append(this.teacher);
        a.append(")");
        return a.toString();
    }
}
