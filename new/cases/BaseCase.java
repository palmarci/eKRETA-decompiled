package hu.ekreta.ellenorzo.cases;

import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.cases.subModels.Decision;
import hu.ekreta.ellenorzo.cases.subModels.State;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\u0002\u0010\u001cJ\b\u00103\u001a\u000204H\u0016J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u000e\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004J\u000e\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020\u0004J\b\u0010=\u001a\u000204H\u0016J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000204HÖ\u0001R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0014\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001e¨\u0006C"}, d2 = {"Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "profileId", "", "id", "sentDate", "Ljava/util/Calendar;", "lastModificationDate", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "stateDescription", "typeCode", "typeName", "documentNumber", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "reason", "filedDocumentId", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "applicationMandatoryDocumentList", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "decisions", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdministratorName", "()Ljava/lang/String;", "getApplicationMandatoryDocumentList", "()Ljava/util/List;", "getAttachmentList", "getDecisions", "getDocumentNumber", "getFiledDocumentId", "getId", "getLastModificationDate", "()Ljava/util/Calendar;", "getProfileId", "getReason", "getSentDate", "getStateDescription", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getStudentEducationId", "getStudentFamilyName", "getStudentFirstName", "getTypeCode", "getTypeName", "describeContents", "", "equals", "", "other", "", "getCaseNameWithAbbreviation", "longName", "getResourceIdFromCodeType", "typeCodeShortName", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: BaseCase.kt */
public class BaseCase implements Parcelable, ProfileSpecificModel {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String c;
    public final String e;
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final Calendar f5076g;

    /* renamed from: h  reason: collision with root package name */
    public final State.StateType f5077h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5078i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5079j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5080k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5081l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5082m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5083n;

    /* renamed from: o  reason: collision with root package name */
    public final String f5084o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5085p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5086q;
    public final String r;
    public final List<Attachment> s;
    public final List<ApplicationMandatoryDocument> t;
    public final List<Decision> u;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Calendar calendar = (Calendar) parcel.readSerializable();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            State.StateType stateType = (State.StateType) Enum.valueOf(State.StateType.class, parcel.readString());
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
                    return new BaseCase(readString, readString2, calendar, calendar2, stateType, readString3, readString4, readString5, readString6, readString7, readString8, str, str2, readString11, readString12, arrayList, arrayList5, arrayList4);
                }
            }
        }

        public final Object[] newArray(int i2) {
            return new BaseCase[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5087a = new int[CaseType.Code.values().length];

        static {
            f5087a[CaseType.Code.ENROLLMENT_TO_ELEMENTARY_SCHOOL.ordinal()] = 1;
            f5087a[CaseType.Code.ENROLLMENT_TO_PRIMARY_SCHOOL.ordinal()] = 2;
            f5087a[CaseType.Code.ENROLLMENT_TO_PUBLIC_EDUCATION.ordinal()] = 3;
            f5087a[CaseType.Code.ENROLLMENT_WITHOUT_COMPULSORY_SCHOOLING.ordinal()] = 4;
            f5087a[CaseType.Code.SWITCHING_SCHOOL.ordinal()] = 5;
            f5087a[CaseType.Code.QUIT_FROM_PUBLIC_EDUCATION.ordinal()] = 6;
            f5087a[CaseType.Code.QUIT_WITHOUT_COMPULSORY_SCHOOLING.ordinal()] = 7;
            f5087a[CaseType.Code.ANNOUNCE_STUDY_ABROAD.ordinal()] = 8;
            f5087a[CaseType.Code.PRIVATE_STUDENT_REQUEST.ordinal()] = 9;
            f5087a[CaseType.Code.GUEST_STUDENT_REQUEST.ordinal()] = 10;
            f5087a[CaseType.Code.VERIFICATION_FOR_COMMUNITY_SERVICE.ordinal()] = 11;
            f5087a[CaseType.Code.CHANGE_CLASS_REQUEST.ordinal()] = 12;
            f5087a[CaseType.Code.DIRECTOR_PERMISSION_FOR_PARENT_TO_GIVE_VERIFICATION.ordinal()] = 13;
            f5087a[CaseType.Code.ACQUITTAL_FOR_STUDENT_BY_PARENT.ordinal()] = 14;
            f5087a[CaseType.Code.VERIFICATION_BY_PARENT.ordinal()] = 15;
            f5087a[CaseType.Code.PRACTICE_AREA.ordinal()] = 16;
            f5087a[CaseType.Code.CERTIFICATION_DUPLICATE.ordinal()] = 17;
            f5087a[CaseType.Code.PERSONAL_DATA_CHANGE.ordinal()] = 18;
        }
    }

    public BaseCase(String str, String str2, Calendar calendar, Calendar calendar2, State.StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<Attachment> list, List<ApplicationMandatoryDocument> list2, List<Decision> list3) {
        State.StateType stateType2 = stateType;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        List<Attachment> list4 = list;
        List<ApplicationMandatoryDocument> list5 = list2;
        List<Decision> list6 = list3;
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(stateType2, "stateType");
        Intrinsics.checkParameterIsNotNull(str13, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str14, "typeCode");
        Intrinsics.checkParameterIsNotNull(str15, "typeName");
        Intrinsics.checkParameterIsNotNull(list4, "attachmentList");
        Intrinsics.checkParameterIsNotNull(list5, "applicationMandatoryDocumentList");
        Intrinsics.checkParameterIsNotNull(list6, "decisions");
        this.c = str;
        this.e = str2;
        this.f = calendar;
        this.f5076g = calendar2;
        this.f5077h = stateType2;
        this.f5078i = str13;
        this.f5079j = str14;
        this.f5080k = str15;
        this.f5081l = str6;
        this.f5082m = str7;
        this.f5083n = str8;
        this.f5084o = str9;
        this.f5085p = str10;
        this.f5086q = str11;
        this.r = str12;
        this.s = list4;
        this.t = list5;
        this.u = list6;
    }

    public final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "longName");
        return u() + " - " + str;
    }

    public final int b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "typeCodeShortName");
        switch (WhenMappings.f5087a[CaseType.Code.Companion.a(str).ordinal()]) {
            case 1:
                return R.string.enrollment_to_elementary_school;
            case 2:
                return R.string.enrollment_to_primary_school;
            case 3:
                return R.string.enrollment_to_public_education;
            case 4:
                return R.string.enrollment_without_compulsory_schooling;
            case 5:
                return R.string.switching_school;
            case 6:
                return R.string.quit_from_public_education;
            case 7:
                return R.string.quit_without_compulsory_schooling;
            case 8:
                return R.string.announce_study_abroad;
            case 9:
                return R.string.private_student_request;
            case 10:
                return R.string.guest_student_request;
            case 11:
                return R.string.verification_for_community_service;
            case 12:
                return R.string.change_class_request;
            case 13:
                return R.string.director_permission_for_parent_to_give_verification;
            case 14:
                return R.string.acquittal_for_student_by_parent;
            case 15:
                return R.string.verification_by_parent;
            case 16:
                return R.string.practice_area;
            case 17:
                return R.string.certificate_duplicate;
            case 18:
                return R.string.personal_data_change;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
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
            return !(Intrinsics.areEqual((Object) e(), (Object) baseCase.e()) ^ true) && !(Intrinsics.areEqual((Object) l(), (Object) baseCase.l()) ^ true) && !(Intrinsics.areEqual((Object) o(), (Object) baseCase.o()) ^ true) && !(Intrinsics.areEqual((Object) m(), (Object) baseCase.m()) ^ true) && !(Intrinsics.areEqual((Object) u(), (Object) baseCase.u()) ^ true) && !(Intrinsics.areEqual((Object) v(), (Object) baseCase.v()) ^ true) && !(Intrinsics.areEqual((Object) j(), (Object) baseCase.j()) ^ true) && !(Intrinsics.areEqual((Object) s(), (Object) baseCase.s()) ^ true) && !(Intrinsics.areEqual((Object) t(), (Object) baseCase.t()) ^ true) && !(Intrinsics.areEqual((Object) r(), (Object) baseCase.r()) ^ true) && !(Intrinsics.areEqual((Object) f(), (Object) baseCase.f()) ^ true) && !(Intrinsics.areEqual((Object) n(), (Object) baseCase.n()) ^ true) && !(Intrinsics.areEqual((Object) k(), (Object) baseCase.k()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type hu.ekreta.ellenorzo.cases.BaseCase");
    }

    public String f() {
        return this.f5085p;
    }

    public List<ApplicationMandatoryDocument> g() {
        return this.t;
    }

    public List<Attachment> h() {
        return this.s;
    }

    public int hashCode() {
        return e().hashCode() + (l().hashCode() * 31);
    }

    public List<Decision> i() {
        return this.u;
    }

    public String j() {
        return this.f5081l;
    }

    public String k() {
        return this.r;
    }

    public String l() {
        return this.e;
    }

    public Calendar m() {
        return this.f5076g;
    }

    public String n() {
        return this.f5086q;
    }

    public Calendar o() {
        return this.f;
    }

    public String p() {
        return this.f5078i;
    }

    public State.StateType q() {
        return this.f5077h;
    }

    public String r() {
        return this.f5084o;
    }

    public String s() {
        return this.f5082m;
    }

    public String t() {
        return this.f5083n;
    }

    public String u() {
        return this.f5079j;
    }

    public String v() {
        return this.f5080k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.f5076g);
        parcel.writeString(this.f5077h.name());
        parcel.writeString(this.f5078i);
        parcel.writeString(this.f5079j);
        parcel.writeString(this.f5080k);
        parcel.writeString(this.f5081l);
        parcel.writeString(this.f5082m);
        parcel.writeString(this.f5083n);
        parcel.writeString(this.f5084o);
        parcel.writeString(this.f5085p);
        parcel.writeString(this.f5086q);
        parcel.writeString(this.r);
        List<Attachment> list = this.s;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<ApplicationMandatoryDocument> list2 = this.t;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        List<Decision> list3 = this.u;
        parcel.writeInt(list3.size());
        for (Decision writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseCase(String str, String str2, Calendar calendar, Calendar calendar2, State.StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, calendar, calendar2, stateType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, list2, (i2 & 131072) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
