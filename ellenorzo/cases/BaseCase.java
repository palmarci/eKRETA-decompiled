package p289hu.ekreta.ellenorzo.cases;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType.Code;
import p289hu.ekreta.ellenorzo.cases.subModels.Decision;
import p289hu.ekreta.ellenorzo.cases.subModels.State.StateType;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\u0002\u0010\u001cJ\b\u00103\u001a\u000204H\u0016J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u000e\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020\u0004J\b\u0010=\u001a\u000204H\u0016J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000204HÖ\u0001R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0014\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001e¨\u0006C"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "id", "sentDate", "Ljava/util/Calendar;", "lastModificationDate", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "stateDescription", "typeCode", "typeName", "documentNumber", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "reason", "filedDocumentId", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "applicationMandatoryDocumentList", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "decisions", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdministratorName", "()Ljava/lang/String;", "getApplicationMandatoryDocumentList", "()Ljava/util/List;", "getAttachmentList", "getDecisions", "getDocumentNumber", "getFiledDocumentId", "getId", "getLastModificationDate", "()Ljava/util/Calendar;", "getProfileId", "getReason", "getSentDate", "getStateDescription", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getStudentEducationId", "getStudentFamilyName", "getStudentFirstName", "getTypeCode", "getTypeName", "describeContents", "", "equals", "", "other", "", "getCaseNameWithAbbreviation", "longName", "getResourceIdFromCodeType", "typeCodeShortName", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.BaseCase */
/* compiled from: BaseCase.kt */
public class BaseCase implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final String f11265c;

    /* renamed from: e */
    public final String f11266e;

    /* renamed from: f */
    public final Calendar f11267f;

    /* renamed from: g */
    public final Calendar f11268g;

    /* renamed from: h */
    public final StateType f11269h;

    /* renamed from: i */
    public final String f11270i;

    /* renamed from: j */
    public final String f11271j;

    /* renamed from: k */
    public final String f11272k;

    /* renamed from: l */
    public final String f11273l;

    /* renamed from: m */
    public final String f11274m;

    /* renamed from: n */
    public final String f11275n;

    /* renamed from: o */
    public final String f11276o;

    /* renamed from: p */
    public final String f11277p;

    /* renamed from: q */
    public final String f11278q;

    /* renamed from: r */
    public final String f11279r;

    /* renamed from: s */
    public final List<Attachment> f11280s;

    /* renamed from: t */
    public final List<ApplicationMandatoryDocument> f11281t;

    /* renamed from: u */
    public final List<Decision> f11282u;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.BaseCase$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Calendar calendar = (Calendar) parcel.readSerializable();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            StateType stateType = (StateType) Enum.valueOf(StateType.class, parcel.readString());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt = parcel.readInt();
            String str2 = readString10;
            ArrayList arrayList2 = new ArrayList(readInt);
            while (true) {
                str = readString9;
                if (readInt == 0) {
                    break;
                }
                arrayList2.add((Attachment) Attachment.CREATOR.createFromParcel(parcel2));
                readInt--;
                readString9 = str;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            while (true) {
                arrayList = arrayList2;
                if (readInt2 == 0) {
                    break;
                }
                arrayList3.add((ApplicationMandatoryDocument) ApplicationMandatoryDocument.CREATOR.createFromParcel(parcel2));
                readInt2--;
                arrayList2 = arrayList;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            while (true) {
                ArrayList arrayList5 = arrayList3;
                if (readInt3 != 0) {
                    arrayList4.add((Decision) Decision.CREATOR.createFromParcel(parcel2));
                    readInt3--;
                    arrayList3 = arrayList5;
                } else {
                    BaseCase baseCase = new BaseCase(readString, readString2, calendar, calendar2, stateType, readString3, readString4, readString5, readString6, readString7, readString8, str, str2, readString11, readString12, arrayList, arrayList5, arrayList4);
                    return baseCase;
                }
            }
        }

        public final Object[] newArray(int i) {
            return new BaseCase[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.BaseCase$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11283a = new int[Code.values().length];

        static {
            f11283a[Code.ENROLLMENT_TO_ELEMENTARY_SCHOOL.ordinal()] = 1;
            f11283a[Code.ENROLLMENT_TO_PRIMARY_SCHOOL.ordinal()] = 2;
            f11283a[Code.ENROLLMENT_TO_PUBLIC_EDUCATION.ordinal()] = 3;
            f11283a[Code.ENROLLMENT_WITHOUT_COMPULSORY_SCHOOLING.ordinal()] = 4;
            f11283a[Code.SWITCHING_SCHOOL.ordinal()] = 5;
            f11283a[Code.QUIT_FROM_PUBLIC_EDUCATION.ordinal()] = 6;
            f11283a[Code.QUIT_WITHOUT_COMPULSORY_SCHOOLING.ordinal()] = 7;
            f11283a[Code.ANNOUNCE_STUDY_ABROAD.ordinal()] = 8;
            f11283a[Code.PRIVATE_STUDENT_REQUEST.ordinal()] = 9;
            f11283a[Code.GUEST_STUDENT_REQUEST.ordinal()] = 10;
            f11283a[Code.VERIFICATION_FOR_COMMUNITY_SERVICE.ordinal()] = 11;
            f11283a[Code.CHANGE_CLASS_REQUEST.ordinal()] = 12;
            f11283a[Code.DIRECTOR_PERMISSION_FOR_PARENT_TO_GIVE_VERIFICATION.ordinal()] = 13;
            f11283a[Code.ACQUITTAL_FOR_STUDENT_BY_PARENT.ordinal()] = 14;
            f11283a[Code.VERIFICATION_BY_PARENT.ordinal()] = 15;
            f11283a[Code.PRACTICE_AREA.ordinal()] = 16;
            f11283a[Code.CERTIFICATION_DUPLICATE.ordinal()] = 17;
            f11283a[Code.PERSONAL_DATA_CHANGE.ordinal()] = 18;
        }
    }

    public BaseCase(String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<Attachment> list, List<ApplicationMandatoryDocument> list2, List<Decision> list3) {
        String str13 = str;
        String str14 = str2;
        Calendar calendar3 = calendar;
        StateType stateType2 = stateType;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        List<Attachment> list4 = list;
        List<ApplicationMandatoryDocument> list5 = list2;
        List<Decision> list6 = list3;
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(stateType2, "stateType");
        Intrinsics.checkParameterIsNotNull(str15, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str16, "typeCode");
        Intrinsics.checkParameterIsNotNull(str17, "typeName");
        Intrinsics.checkParameterIsNotNull(list4, "attachmentList");
        Intrinsics.checkParameterIsNotNull(list5, "applicationMandatoryDocumentList");
        Intrinsics.checkParameterIsNotNull(list6, "decisions");
        this.f11265c = str13;
        this.f11266e = str14;
        this.f11267f = calendar3;
        this.f11268g = calendar2;
        this.f11269h = stateType2;
        this.f11270i = str15;
        this.f11271j = str16;
        this.f11272k = str17;
        this.f11273l = str6;
        this.f11274m = str7;
        this.f11275n = str8;
        this.f11276o = str9;
        this.f11277p = str10;
        this.f11278q = str11;
        this.f11279r = str12;
        this.f11280s = list4;
        this.f11281t = list5;
        this.f11282u = list6;
    }

    /* renamed from: a */
    public final String mo11574a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "longName");
        StringBuilder sb = new StringBuilder();
        sb.append(mo11594u());
        sb.append(" - ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final int mo11575b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "typeCodeShortName");
        switch (WhenMappings.f11283a[Code.Companion.mo11931a(str).ordinal()]) {
            case 1:
                return C4014R.string.enrollment_to_elementary_school;
            case 2:
                return C4014R.string.enrollment_to_primary_school;
            case 3:
                return C4014R.string.enrollment_to_public_education;
            case 4:
                return C4014R.string.enrollment_without_compulsory_schooling;
            case 5:
                return C4014R.string.switching_school;
            case 6:
                return C4014R.string.quit_from_public_education;
            case 7:
                return C4014R.string.quit_without_compulsory_schooling;
            case 8:
                return C4014R.string.announce_study_abroad;
            case 9:
                return C4014R.string.private_student_request;
            case 10:
                return C4014R.string.guest_student_request;
            case 11:
                return C4014R.string.verification_for_community_service;
            case 12:
                return C4014R.string.change_class_request;
            case 13:
                return C4014R.string.director_permission_for_parent_to_give_verification;
            case 14:
                return C4014R.string.acquittal_for_student_by_parent;
            case 15:
                return C4014R.string.verification_by_parent;
            case 16:
                return C4014R.string.practice_area;
            case 17:
                return C4014R.string.certificate_duplicate;
            case 18:
                return C4014R.string.personal_data_change;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11265c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            BaseCase baseCase = (BaseCase) obj;
            return !(Intrinsics.areEqual((Object) mo11318e(), (Object) baseCase.mo11318e()) ^ true) && !(Intrinsics.areEqual((Object) mo11585l(), (Object) baseCase.mo11585l()) ^ true) && !(Intrinsics.areEqual((Object) mo11588o(), (Object) baseCase.mo11588o()) ^ true) && !(Intrinsics.areEqual((Object) mo11586m(), (Object) baseCase.mo11586m()) ^ true) && !(Intrinsics.areEqual((Object) mo11594u(), (Object) baseCase.mo11594u()) ^ true) && !(Intrinsics.areEqual((Object) mo11595v(), (Object) baseCase.mo11595v()) ^ true) && !(Intrinsics.areEqual((Object) mo11583j(), (Object) baseCase.mo11583j()) ^ true) && !(Intrinsics.areEqual((Object) mo11592s(), (Object) baseCase.mo11592s()) ^ true) && !(Intrinsics.areEqual((Object) mo11593t(), (Object) baseCase.mo11593t()) ^ true) && !(Intrinsics.areEqual((Object) mo11591r(), (Object) baseCase.mo11591r()) ^ true) && !(Intrinsics.areEqual((Object) mo11578f(), (Object) baseCase.mo11578f()) ^ true) && !(Intrinsics.areEqual((Object) mo11587n(), (Object) baseCase.mo11587n()) ^ true) && !(Intrinsics.areEqual((Object) mo11584k(), (Object) baseCase.mo11584k()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type hu.ekreta.ellenorzo.cases.BaseCase");
    }

    /* renamed from: f */
    public String mo11578f() {
        return this.f11277p;
    }

    /* renamed from: g */
    public List<ApplicationMandatoryDocument> mo11579g() {
        return this.f11281t;
    }

    /* renamed from: h */
    public List<Attachment> mo11580h() {
        return this.f11280s;
    }

    public int hashCode() {
        return mo11318e().hashCode() + (mo11585l().hashCode() * 31);
    }

    /* renamed from: i */
    public List<Decision> mo11582i() {
        return this.f11282u;
    }

    /* renamed from: j */
    public String mo11583j() {
        return this.f11273l;
    }

    /* renamed from: k */
    public String mo11584k() {
        return this.f11279r;
    }

    /* renamed from: l */
    public String mo11585l() {
        return this.f11266e;
    }

    /* renamed from: m */
    public Calendar mo11586m() {
        return this.f11268g;
    }

    /* renamed from: n */
    public String mo11587n() {
        return this.f11278q;
    }

    /* renamed from: o */
    public Calendar mo11588o() {
        return this.f11267f;
    }

    /* renamed from: p */
    public String mo11589p() {
        return this.f11270i;
    }

    /* renamed from: q */
    public StateType mo11590q() {
        return this.f11269h;
    }

    /* renamed from: r */
    public String mo11591r() {
        return this.f11276o;
    }

    /* renamed from: s */
    public String mo11592s() {
        return this.f11274m;
    }

    /* renamed from: t */
    public String mo11593t() {
        return this.f11275n;
    }

    /* renamed from: u */
    public String mo11594u() {
        return this.f11271j;
    }

    /* renamed from: v */
    public String mo11595v() {
        return this.f11272k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11265c);
        parcel.writeString(this.f11266e);
        parcel.writeSerializable(this.f11267f);
        parcel.writeSerializable(this.f11268g);
        parcel.writeString(this.f11269h.name());
        parcel.writeString(this.f11270i);
        parcel.writeString(this.f11271j);
        parcel.writeString(this.f11272k);
        parcel.writeString(this.f11273l);
        parcel.writeString(this.f11274m);
        parcel.writeString(this.f11275n);
        parcel.writeString(this.f11276o);
        parcel.writeString(this.f11277p);
        parcel.writeString(this.f11278q);
        parcel.writeString(this.f11279r);
        List<Attachment> list = this.f11280s;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<ApplicationMandatoryDocument> list2 = this.f11281t;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        List<Decision> list3 = this.f11282u;
        parcel.writeInt(list3.size());
        for (Decision writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, 0);
        }
    }

    public /* synthetic */ BaseCase(String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, calendar, calendar2, stateType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, list2, (i & 131072) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
