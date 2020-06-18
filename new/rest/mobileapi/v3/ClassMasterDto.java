package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÂ\u0003J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto;", "", "uid", "", "listOfClassDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/SchoolClassDto;", "teacher", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;", "(Ljava/lang/String;Ljava/util/List;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;)V", "emailList", "getEmailList", "()Ljava/util/List;", "getListOfClassDto", "name", "getName", "()Ljava/lang/String;", "phoneList", "getPhoneList", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "EmailDto", "EmployeeDto", "PhoneDto", "TeacherDto", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterDto.kt */
public final class ClassMasterDto {
    @c("Osztalyai")
    public final List<SchoolClassDto> listOfClassDto;
    @c("Tanar")
    public final TeacherDto teacher;
    @c("Uid")
    public final String uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmailDto;", "", "uid", "", "email", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMasterDto.kt */
    public static final class EmailDto {
        @c("Email")
        public final String email;
        @c("Uid")
        public final String uid;

        public EmailDto(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "email");
            this.uid = str;
            this.email = str2;
        }

        public static /* synthetic */ EmailDto copy$default(EmailDto emailDto, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = emailDto.uid;
            }
            if ((i2 & 2) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmailDto)) {
                return false;
            }
            EmailDto emailDto = (EmailDto) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) emailDto.uid) && Intrinsics.areEqual((Object) this.email, (Object) emailDto.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.email;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("EmailDto(uid=");
            a2.append(this.uid);
            a2.append(", email=");
            return a.a(a2, this.email, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "", "uid", "", "name", "phoneList", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$PhoneDto;", "emailList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmailDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEmailList", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPhoneList", "getUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMasterDto.kt */
    public static final class EmployeeDto {
        @c("Emailek")
        public final List<EmailDto> emailList;
        @c("Nev")
        public final String name;
        @c("Telefonok")
        public final List<PhoneDto> phoneList;
        @c("Uid")
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

        public static /* synthetic */ EmployeeDto copy$default(EmployeeDto employeeDto, String str, String str2, List<PhoneDto> list, List<EmailDto> list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = employeeDto.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = employeeDto.name;
            }
            if ((i2 & 4) != 0) {
                list = employeeDto.phoneList;
            }
            if ((i2 & 8) != 0) {
                list2 = employeeDto.emailList;
            }
            return employeeDto.copy(str, str2, list, list2);
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmployeeDto)) {
                return false;
            }
            EmployeeDto employeeDto = (EmployeeDto) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) employeeDto.uid) && Intrinsics.areEqual((Object) this.name, (Object) employeeDto.name) && Intrinsics.areEqual((Object) this.phoneList, (Object) employeeDto.phoneList) && Intrinsics.areEqual((Object) this.emailList, (Object) employeeDto.emailList);
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
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<PhoneDto> list = this.phoneList;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            List<EmailDto> list2 = this.emailList;
            if (list2 != null) {
                i2 = list2.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("EmployeeDto(uid=");
            a2.append(this.uid);
            a2.append(", name=");
            a2.append(this.name);
            a2.append(", phoneList=");
            a2.append(this.phoneList);
            a2.append(", emailList=");
            return a.a(a2, (List) this.emailList, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EmployeeDto(String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$PhoneDto;", "", "uid", "", "phone", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMasterDto.kt */
    public static final class PhoneDto {
        @c("Telefonszam")
        public final String phone;
        @c("Uid")
        public final String uid;

        public PhoneDto(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "phone");
            this.uid = str;
            this.phone = str2;
        }

        public static /* synthetic */ PhoneDto copy$default(PhoneDto phoneDto, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = phoneDto.uid;
            }
            if ((i2 & 2) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneDto)) {
                return false;
            }
            PhoneDto phoneDto = (PhoneDto) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) phoneDto.uid) && Intrinsics.areEqual((Object) this.phone, (Object) phoneDto.phone);
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.phone;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("PhoneDto(uid=");
            a2.append(this.uid);
            a2.append(", phone=");
            return a.a(a2, this.phone, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$TeacherDto;", "", "uid", "", "employee", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "(Ljava/lang/String;Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;)V", "getEmployee", "()Lhu/ekreta/ellenorzo/rest/mobileapi/v3/ClassMasterDto$EmployeeDto;", "getUid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: ClassMasterDto.kt */
    public static final class TeacherDto {
        @c("Alkalmazott")
        public final EmployeeDto employee;
        @c("Uid")
        public final String uid;

        public TeacherDto(String str, EmployeeDto employeeDto) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(employeeDto, "employee");
            this.uid = str;
            this.employee = employeeDto;
        }

        public static /* synthetic */ TeacherDto copy$default(TeacherDto teacherDto, String str, EmployeeDto employeeDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = teacherDto.uid;
            }
            if ((i2 & 2) != 0) {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeacherDto)) {
                return false;
            }
            TeacherDto teacherDto = (TeacherDto) obj;
            return Intrinsics.areEqual((Object) this.uid, (Object) teacherDto.uid) && Intrinsics.areEqual((Object) this.employee, (Object) teacherDto.employee);
        }

        public final EmployeeDto getEmployee() {
            return this.employee;
        }

        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            String str = this.uid;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EmployeeDto employeeDto = this.employee;
            if (employeeDto != null) {
                i2 = employeeDto.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("TeacherDto(uid=");
            a2.append(this.uid);
            a2.append(", employee=");
            a2.append(this.employee);
            a2.append(")");
            return a2.toString();
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

    public static /* synthetic */ ClassMasterDto copy$default(ClassMasterDto classMasterDto, String str, List<SchoolClassDto> list, TeacherDto teacherDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = classMasterDto.uid;
        }
        if ((i2 & 2) != 0) {
            list = classMasterDto.listOfClassDto;
        }
        if ((i2 & 4) != 0) {
            teacherDto = classMasterDto.teacher;
        }
        return classMasterDto.copy(str, list, teacherDto);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassMasterDto)) {
            return false;
        }
        ClassMasterDto classMasterDto = (ClassMasterDto) obj;
        return Intrinsics.areEqual((Object) this.uid, (Object) classMasterDto.uid) && Intrinsics.areEqual((Object) this.listOfClassDto, (Object) classMasterDto.listOfClassDto) && Intrinsics.areEqual((Object) this.teacher, (Object) classMasterDto.teacher);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SchoolClassDto> list = this.listOfClassDto;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        TeacherDto teacherDto = this.teacher;
        if (teacherDto != null) {
            i2 = teacherDto.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("ClassMasterDto(uid=");
        a2.append(this.uid);
        a2.append(", listOfClassDto=");
        a2.append(this.listOfClassDto);
        a2.append(", teacher=");
        a2.append(this.teacher);
        a2.append(")");
        return a2.toString();
    }
}
