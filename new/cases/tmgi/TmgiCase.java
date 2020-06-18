package hu.ekreta.ellenorzo.cases.tmgi;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.Decision;
import hu.ekreta.ellenorzo.cases.subModels.State;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\u0002\u0010\u001fJ\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016HÆ\u0001J\b\u0010O\u001a\u00020PH\u0016J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020PHÖ\u0001J\t\u0010V\u001a\u00020\u0004HÖ\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020PHÖ\u0001R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0014\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006\\"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiCase;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/os/Parcelable;", "profileId", "", "id", "sentDate", "Ljava/util/Calendar;", "lastModificationDate", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "stateDescription", "typeCode", "typeName", "documentNumber", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "reason", "filedDocumentId", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "justificationType", "requestedAbsenceStart", "requestedAbsenceEnd", "applicationMandatoryDocumentList", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "decisions", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;)V", "getAdministratorName", "()Ljava/lang/String;", "getApplicationMandatoryDocumentList", "()Ljava/util/List;", "getAttachmentList", "getDecisions", "getDocumentNumber", "getFiledDocumentId", "getId", "getJustificationType", "getLastModificationDate", "()Ljava/util/Calendar;", "getProfileId", "getReason", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSentDate", "getStateDescription", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getStudentEducationId", "getStudentFamilyName", "getStudentFirstName", "getTypeCode", "getTypeName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiCase.kt */
public final class TmgiCase extends BaseCase implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final List<Attachment> K;
    public final String L;
    public final Calendar M;
    public final Calendar N;
    public final List<ApplicationMandatoryDocument> O;
    public final List<Decision> P;
    public final String v;
    public final String w;
    public final Calendar x;
    public final Calendar y;
    public final State.StateType z;

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
            String readString13 = parcel.readString();
            Calendar calendar3 = (Calendar) parcel.readSerializable();
            Calendar calendar4 = (Calendar) parcel.readSerializable();
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
                    return new TmgiCase(readString, readString2, calendar, calendar2, stateType, readString3, readString4, readString5, readString6, readString7, readString8, str, str2, readString11, readString12, arrayList, readString13, calendar3, calendar4, arrayList5, arrayList4);
                }
            }
        }

        public final Object[] newArray(int i2) {
            return new TmgiCase[i2];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TmgiCase(String str, String str2, Calendar calendar, Calendar calendar2, State.StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, Calendar calendar3, Calendar calendar4, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, calendar, calendar2, stateType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, str13, calendar3, calendar4, list2, (i2 & 1048576) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }

    public static /* synthetic */ TmgiCase copy$default(TmgiCase tmgiCase, String str, String str2, Calendar calendar, Calendar calendar2, State.StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, Calendar calendar3, Calendar calendar4, List list2, List list3, int i2, Object obj) {
        TmgiCase tmgiCase2 = tmgiCase;
        int i3 = i2;
        return tmgiCase.a((i3 & 1) != 0 ? tmgiCase.e() : str, (i3 & 2) != 0 ? tmgiCase.l() : str2, (i3 & 4) != 0 ? tmgiCase.o() : calendar, (i3 & 8) != 0 ? tmgiCase.m() : calendar2, (i3 & 16) != 0 ? tmgiCase.q() : stateType, (i3 & 32) != 0 ? tmgiCase.p() : str3, (i3 & 64) != 0 ? tmgiCase.u() : str4, (i3 & 128) != 0 ? tmgiCase.v() : str5, (i3 & 256) != 0 ? tmgiCase.j() : str6, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiCase.s() : str7, (i3 & 1024) != 0 ? tmgiCase.t() : str8, (i3 & 2048) != 0 ? tmgiCase.r() : str9, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? tmgiCase.f() : str10, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? tmgiCase.n() : str11, (i3 & 16384) != 0 ? tmgiCase.k() : str12, (i3 & 32768) != 0 ? tmgiCase.h() : list, (i3 & 65536) != 0 ? tmgiCase2.L : str13, (i3 & 131072) != 0 ? tmgiCase2.M : calendar3, (i3 & 262144) != 0 ? tmgiCase2.N : calendar4, (i3 & 524288) != 0 ? tmgiCase.g() : list2, (i3 & 1048576) != 0 ? tmgiCase.i() : list3);
    }

    public final TmgiCase a(String str, String str2, Calendar calendar, Calendar calendar2, State.StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<Attachment> list, String str13, Calendar calendar3, Calendar calendar4, List<ApplicationMandatoryDocument> list2, List<Decision> list3) {
        String str14 = str;
        Intrinsics.checkParameterIsNotNull(str14, "profileId");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        Intrinsics.checkParameterIsNotNull(calendar, "sentDate");
        Intrinsics.checkParameterIsNotNull(stateType, "stateType");
        Intrinsics.checkParameterIsNotNull(str3, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str4, "typeCode");
        Intrinsics.checkParameterIsNotNull(str5, "typeName");
        Intrinsics.checkParameterIsNotNull(list, "attachmentList");
        Intrinsics.checkParameterIsNotNull(list2, "applicationMandatoryDocumentList");
        Intrinsics.checkParameterIsNotNull(list3, "decisions");
        return new TmgiCase(str14, str2, calendar, calendar2, stateType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, str13, calendar3, calendar4, list2, list3);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmgiCase)) {
            return false;
        }
        TmgiCase tmgiCase = (TmgiCase) obj;
        return Intrinsics.areEqual((Object) e(), (Object) tmgiCase.e()) && Intrinsics.areEqual((Object) l(), (Object) tmgiCase.l()) && Intrinsics.areEqual((Object) o(), (Object) tmgiCase.o()) && Intrinsics.areEqual((Object) m(), (Object) tmgiCase.m()) && Intrinsics.areEqual((Object) q(), (Object) tmgiCase.q()) && Intrinsics.areEqual((Object) p(), (Object) tmgiCase.p()) && Intrinsics.areEqual((Object) u(), (Object) tmgiCase.u()) && Intrinsics.areEqual((Object) v(), (Object) tmgiCase.v()) && Intrinsics.areEqual((Object) j(), (Object) tmgiCase.j()) && Intrinsics.areEqual((Object) s(), (Object) tmgiCase.s()) && Intrinsics.areEqual((Object) t(), (Object) tmgiCase.t()) && Intrinsics.areEqual((Object) r(), (Object) tmgiCase.r()) && Intrinsics.areEqual((Object) f(), (Object) tmgiCase.f()) && Intrinsics.areEqual((Object) n(), (Object) tmgiCase.n()) && Intrinsics.areEqual((Object) k(), (Object) tmgiCase.k()) && Intrinsics.areEqual((Object) h(), (Object) tmgiCase.h()) && Intrinsics.areEqual((Object) this.L, (Object) tmgiCase.L) && Intrinsics.areEqual((Object) this.M, (Object) tmgiCase.M) && Intrinsics.areEqual((Object) this.N, (Object) tmgiCase.N) && Intrinsics.areEqual((Object) g(), (Object) tmgiCase.g()) && Intrinsics.areEqual((Object) i(), (Object) tmgiCase.i());
    }

    public String f() {
        return this.H;
    }

    public List<ApplicationMandatoryDocument> g() {
        return this.O;
    }

    public List<Attachment> h() {
        return this.K;
    }

    public int hashCode() {
        String e = e();
        int i2 = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String l2 = l();
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Calendar o2 = o();
        int hashCode3 = (hashCode2 + (o2 != null ? o2.hashCode() : 0)) * 31;
        Calendar m2 = m();
        int hashCode4 = (hashCode3 + (m2 != null ? m2.hashCode() : 0)) * 31;
        State.StateType q2 = q();
        int hashCode5 = (hashCode4 + (q2 != null ? q2.hashCode() : 0)) * 31;
        String p2 = p();
        int hashCode6 = (hashCode5 + (p2 != null ? p2.hashCode() : 0)) * 31;
        String u = u();
        int hashCode7 = (hashCode6 + (u != null ? u.hashCode() : 0)) * 31;
        String v2 = v();
        int hashCode8 = (hashCode7 + (v2 != null ? v2.hashCode() : 0)) * 31;
        String j2 = j();
        int hashCode9 = (hashCode8 + (j2 != null ? j2.hashCode() : 0)) * 31;
        String s = s();
        int hashCode10 = (hashCode9 + (s != null ? s.hashCode() : 0)) * 31;
        String t = t();
        int hashCode11 = (hashCode10 + (t != null ? t.hashCode() : 0)) * 31;
        String r = r();
        int hashCode12 = (hashCode11 + (r != null ? r.hashCode() : 0)) * 31;
        String f = f();
        int hashCode13 = (hashCode12 + (f != null ? f.hashCode() : 0)) * 31;
        String n2 = n();
        int hashCode14 = (hashCode13 + (n2 != null ? n2.hashCode() : 0)) * 31;
        String k2 = k();
        int hashCode15 = (hashCode14 + (k2 != null ? k2.hashCode() : 0)) * 31;
        List<Attachment> h2 = h();
        int hashCode16 = (hashCode15 + (h2 != null ? h2.hashCode() : 0)) * 31;
        String str = this.L;
        int hashCode17 = (hashCode16 + (str != null ? str.hashCode() : 0)) * 31;
        Calendar calendar = this.M;
        int hashCode18 = (hashCode17 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.N;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocument> g2 = g();
        int hashCode20 = (hashCode19 + (g2 != null ? g2.hashCode() : 0)) * 31;
        List<Decision> i3 = i();
        if (i3 != null) {
            i2 = i3.hashCode();
        }
        return hashCode20 + i2;
    }

    public List<Decision> i() {
        return this.P;
    }

    public String j() {
        return this.D;
    }

    public String k() {
        return this.J;
    }

    public String l() {
        return this.w;
    }

    public Calendar m() {
        return this.y;
    }

    public String n() {
        return this.I;
    }

    public Calendar o() {
        return this.x;
    }

    public String p() {
        return this.A;
    }

    public State.StateType q() {
        return this.z;
    }

    public String r() {
        return this.G;
    }

    public String s() {
        return this.E;
    }

    public String t() {
        return this.F;
    }

    public String toString() {
        StringBuilder a2 = a.a("TmgiCase(profileId=");
        a2.append(e());
        a2.append(", id=");
        a2.append(l());
        a2.append(", sentDate=");
        a2.append(o());
        a2.append(", lastModificationDate=");
        a2.append(m());
        a2.append(", stateType=");
        a2.append(q());
        a2.append(", stateDescription=");
        a2.append(p());
        a2.append(", typeCode=");
        a2.append(u());
        a2.append(", typeName=");
        a2.append(v());
        a2.append(", documentNumber=");
        a2.append(j());
        a2.append(", studentFamilyName=");
        a2.append(s());
        a2.append(", studentFirstName=");
        a2.append(t());
        a2.append(", studentEducationId=");
        a2.append(r());
        a2.append(", administratorName=");
        a2.append(f());
        a2.append(", reason=");
        a2.append(n());
        a2.append(", filedDocumentId=");
        a2.append(k());
        a2.append(", attachmentList=");
        a2.append(h());
        a2.append(", justificationType=");
        a2.append(this.L);
        a2.append(", requestedAbsenceStart=");
        a2.append(this.M);
        a2.append(", requestedAbsenceEnd=");
        a2.append(this.N);
        a2.append(", applicationMandatoryDocumentList=");
        a2.append(g());
        a2.append(", decisions=");
        a2.append(i());
        a2.append(")");
        return a2.toString();
    }

    public String u() {
        return this.B;
    }

    public String v() {
        return this.C;
    }

    public final String w() {
        return this.L;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeString(this.z.name());
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        List<Attachment> list = this.K;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.N);
        List<ApplicationMandatoryDocument> list2 = this.O;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        List<Decision> list3 = this.P;
        parcel.writeInt(list3.size());
        for (Decision writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, 0);
        }
    }

    public final Calendar x() {
        return this.N;
    }

    public final Calendar y() {
        return this.M;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TmgiCase(java.lang.String r31, java.lang.String r32, java.util.Calendar r33, java.util.Calendar r34, hu.ekreta.ellenorzo.cases.subModels.State.StateType r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.util.List<hu.ekreta.ellenorzo.attachment.Attachment> r46, java.lang.String r47, java.util.Calendar r48, java.util.Calendar r49, java.util.List<hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument> r50, java.util.List<hu.ekreta.ellenorzo.cases.subModels.Decision> r51) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r13 = r32
            r12 = r33
            r11 = r35
            r10 = r36
            r9 = r37
            r8 = r38
            r7 = r46
            r6 = r50
            r5 = r51
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r19 = r0
            r0 = r5
            r5 = r35
            r20 = r1
            r1 = r6
            r6 = r36
            r21 = r2
            r2 = r7
            r7 = r37
            r22 = r3
            r3 = r8
            r23 = r4
            r4 = r9
            r9 = r39
            r24 = r5
            r5 = r10
            r10 = r40
            r25 = r6
            r6 = r11
            r11 = r41
            r26 = r7
            r7 = r12
            r12 = r42
            r27 = r8
            r8 = r13
            r13 = r43
            r28 = r9
            r9 = r14
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r50
            r18 = r51
            r29 = r10
            java.lang.String r10 = "profileId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r10)
            java.lang.String r10 = "id"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r10)
            java.lang.String r10 = "sentDate"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r10)
            java.lang.String r10 = "stateType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r10)
            java.lang.String r10 = "stateDescription"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r10)
            java.lang.String r10 = "typeCode"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r10)
            java.lang.String r10 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r10)
            java.lang.String r10 = "attachmentList"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r10)
            java.lang.String r10 = "applicationMandatoryDocumentList"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r10)
            java.lang.String r10 = "decisions"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r10)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r30
            r1 = r31
            r0.v = r1
            r1 = r32
            r0.w = r1
            r1 = r33
            r0.x = r1
            r1 = r34
            r0.y = r1
            r1 = r35
            r0.z = r1
            r1 = r36
            r0.A = r1
            r1 = r37
            r0.B = r1
            r1 = r38
            r0.C = r1
            r1 = r39
            r0.D = r1
            r1 = r40
            r0.E = r1
            r1 = r41
            r0.F = r1
            r1 = r42
            r0.G = r1
            r1 = r43
            r0.H = r1
            r1 = r44
            r0.I = r1
            r1 = r45
            r0.J = r1
            r1 = r46
            r0.K = r1
            r1 = r47
            r0.L = r1
            r1 = r48
            r0.M = r1
            r1 = r49
            r0.N = r1
            r1 = r50
            r0.O = r1
            r1 = r51
            r0.P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.cases.tmgi.TmgiCase.<init>(java.lang.String, java.lang.String, java.util.Calendar, java.util.Calendar, hu.ekreta.ellenorzo.cases.subModels.State$StateType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.Calendar, java.util.Calendar, java.util.List, java.util.List):void");
    }
}
