package hu.ekreta.ellenorzo.rest.mobileapi.v3;

import a.b.a.a.a;
import a.h.c.z.c;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019¨\u00064"}, d2 = {"Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "", "uid", "", "schoolYearUID", "", "name", "nameOfBirth", "placeOfBirth", "mothersName", "addressDataList", "", "dateOfBirthUtc", "Ljava/util/Calendar;", "instituteName", "instituteCode", "guardianList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianDto;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAddressDataList", "()Ljava/util/List;", "getDateOfBirthUtc", "()Ljava/util/Calendar;", "getGuardianList", "getInstituteCode", "()Ljava/lang/String;", "getInstituteName", "getMothersName", "getName", "getNameOfBirth", "getPlaceOfBirth", "getSchoolYearUID", "()J", "getUid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: StudentDto.kt */
public final class StudentDto {
    @c("Cimek")
    public final List<String> addressDataList;
    @c("SzuletesiDatum")
    public final Calendar dateOfBirthUtc;
    @c("Gondviselok")
    public final List<GuardianDto> guardianList;
    @c("IntezmenyAzonosito")
    public final String instituteCode;
    @c("IntezmenyNev")
    public final String instituteName;
    @c("AnyjaNeve")
    public final String mothersName;
    @c("Nev")
    public final String name;
    @c("SzuletesiNev")
    public final String nameOfBirth;
    @c("SzuletesiHely")
    public final String placeOfBirth;
    @c("TanevUid")
    public final long schoolYearUID;
    @c("Uid")
    public final String uid;

    public StudentDto(String str, long j2, String str2, String str3, String str4, String str5, List<String> list, Calendar calendar, String str6, String str7, List<GuardianDto> list2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "nameOfBirth");
        Intrinsics.checkParameterIsNotNull(str4, "placeOfBirth");
        Intrinsics.checkParameterIsNotNull(str5, "mothersName");
        Intrinsics.checkParameterIsNotNull(list, "addressDataList");
        Intrinsics.checkParameterIsNotNull(calendar, "dateOfBirthUtc");
        Intrinsics.checkParameterIsNotNull(str6, "instituteName");
        Intrinsics.checkParameterIsNotNull(str7, "instituteCode");
        Intrinsics.checkParameterIsNotNull(list2, "guardianList");
        this.uid = str;
        this.schoolYearUID = j2;
        this.name = str2;
        this.nameOfBirth = str3;
        this.placeOfBirth = str4;
        this.mothersName = str5;
        this.addressDataList = list;
        this.dateOfBirthUtc = calendar;
        this.instituteName = str6;
        this.instituteCode = str7;
        this.guardianList = list2;
    }

    public static /* synthetic */ StudentDto copy$default(StudentDto studentDto, String str, long j2, String str2, String str3, String str4, String str5, List list, Calendar calendar, String str6, String str7, List list2, int i2, Object obj) {
        StudentDto studentDto2 = studentDto;
        int i3 = i2;
        return studentDto.copy((i3 & 1) != 0 ? studentDto2.uid : str, (i3 & 2) != 0 ? studentDto2.schoolYearUID : j2, (i3 & 4) != 0 ? studentDto2.name : str2, (i3 & 8) != 0 ? studentDto2.nameOfBirth : str3, (i3 & 16) != 0 ? studentDto2.placeOfBirth : str4, (i3 & 32) != 0 ? studentDto2.mothersName : str5, (i3 & 64) != 0 ? studentDto2.addressDataList : list, (i3 & 128) != 0 ? studentDto2.dateOfBirthUtc : calendar, (i3 & 256) != 0 ? studentDto2.instituteName : str6, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? studentDto2.instituteCode : str7, (i3 & 1024) != 0 ? studentDto2.guardianList : list2);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component10() {
        return this.instituteCode;
    }

    public final List<GuardianDto> component11() {
        return this.guardianList;
    }

    public final long component2() {
        return this.schoolYearUID;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.nameOfBirth;
    }

    public final String component5() {
        return this.placeOfBirth;
    }

    public final String component6() {
        return this.mothersName;
    }

    public final List<String> component7() {
        return this.addressDataList;
    }

    public final Calendar component8() {
        return this.dateOfBirthUtc;
    }

    public final String component9() {
        return this.instituteName;
    }

    public final StudentDto copy(String str, long j2, String str2, String str3, String str4, String str5, List<String> list, Calendar calendar, String str6, String str7, List<GuardianDto> list2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        String str8 = str2;
        Intrinsics.checkParameterIsNotNull(str8, "name");
        String str9 = str3;
        Intrinsics.checkParameterIsNotNull(str9, "nameOfBirth");
        String str10 = str4;
        Intrinsics.checkParameterIsNotNull(str10, "placeOfBirth");
        String str11 = str5;
        Intrinsics.checkParameterIsNotNull(str11, "mothersName");
        List<String> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "addressDataList");
        Calendar calendar2 = calendar;
        Intrinsics.checkParameterIsNotNull(calendar2, "dateOfBirthUtc");
        String str12 = str6;
        Intrinsics.checkParameterIsNotNull(str12, "instituteName");
        String str13 = str7;
        Intrinsics.checkParameterIsNotNull(str13, "instituteCode");
        List<GuardianDto> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "guardianList");
        return new StudentDto(str, j2, str8, str9, str10, str11, list3, calendar2, str12, str13, list4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StudentDto) {
                StudentDto studentDto = (StudentDto) obj;
                if (Intrinsics.areEqual((Object) this.uid, (Object) studentDto.uid)) {
                    if (!(this.schoolYearUID == studentDto.schoolYearUID) || !Intrinsics.areEqual((Object) this.name, (Object) studentDto.name) || !Intrinsics.areEqual((Object) this.nameOfBirth, (Object) studentDto.nameOfBirth) || !Intrinsics.areEqual((Object) this.placeOfBirth, (Object) studentDto.placeOfBirth) || !Intrinsics.areEqual((Object) this.mothersName, (Object) studentDto.mothersName) || !Intrinsics.areEqual((Object) this.addressDataList, (Object) studentDto.addressDataList) || !Intrinsics.areEqual((Object) this.dateOfBirthUtc, (Object) studentDto.dateOfBirthUtc) || !Intrinsics.areEqual((Object) this.instituteName, (Object) studentDto.instituteName) || !Intrinsics.areEqual((Object) this.instituteCode, (Object) studentDto.instituteCode) || !Intrinsics.areEqual((Object) this.guardianList, (Object) studentDto.guardianList)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<String> getAddressDataList() {
        return this.addressDataList;
    }

    public final Calendar getDateOfBirthUtc() {
        return this.dateOfBirthUtc;
    }

    public final List<GuardianDto> getGuardianList() {
        return this.guardianList;
    }

    public final String getInstituteCode() {
        return this.instituteCode;
    }

    public final String getInstituteName() {
        return this.instituteName;
    }

    public final String getMothersName() {
        return this.mothersName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameOfBirth() {
        return this.nameOfBirth;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final long getSchoolYearUID() {
        return this.schoolYearUID;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.schoolYearUID;
        int i3 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.name;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nameOfBirth;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.placeOfBirth;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mothersName;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.addressDataList;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Calendar calendar = this.dateOfBirthUtc;
        int hashCode7 = (hashCode6 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        String str6 = this.instituteName;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.instituteCode;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<GuardianDto> list2 = this.guardianList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode9 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("StudentDto(uid=");
        a2.append(this.uid);
        a2.append(", schoolYearUID=");
        a2.append(this.schoolYearUID);
        a2.append(", name=");
        a2.append(this.name);
        a2.append(", nameOfBirth=");
        a2.append(this.nameOfBirth);
        a2.append(", placeOfBirth=");
        a2.append(this.placeOfBirth);
        a2.append(", mothersName=");
        a2.append(this.mothersName);
        a2.append(", addressDataList=");
        a2.append(this.addressDataList);
        a2.append(", dateOfBirthUtc=");
        a2.append(this.dateOfBirthUtc);
        a2.append(", instituteName=");
        a2.append(this.instituteName);
        a2.append(", instituteCode=");
        a2.append(this.instituteCode);
        a2.append(", guardianList=");
        return a.a(a2, (List) this.guardianList, ")");
    }
}
