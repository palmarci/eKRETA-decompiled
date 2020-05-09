package p289hu.ekreta.ellenorzo.cases.tmgi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.Decision;
import p289hu.ekreta.ellenorzo.cases.subModels.State.StateType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\u0002\u0010\u001fJ\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016HÆ\u0001J\b\u0010O\u001a\u00020PH\u0016J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020PHÖ\u0001J\t\u0010V\u001a\u00020\u0004HÖ\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020PHÖ\u0001R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0014\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006\\"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiCase;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "Landroid/os/Parcelable;", "profileId", "", "id", "sentDate", "Ljava/util/Calendar;", "lastModificationDate", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "stateDescription", "typeCode", "typeName", "documentNumber", "studentFamilyName", "studentFirstName", "studentEducationId", "administratorName", "reason", "filedDocumentId", "attachmentList", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "justificationType", "requestedAbsenceStart", "requestedAbsenceEnd", "applicationMandatoryDocumentList", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "decisions", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;)V", "getAdministratorName", "()Ljava/lang/String;", "getApplicationMandatoryDocumentList", "()Ljava/util/List;", "getAttachmentList", "getDecisions", "getDocumentNumber", "getFiledDocumentId", "getId", "getJustificationType", "getLastModificationDate", "()Ljava/util/Calendar;", "getProfileId", "getReason", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSentDate", "getStateDescription", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getStudentEducationId", "getStudentFamilyName", "getStudentFirstName", "getTypeCode", "getTypeName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiCase */
/* compiled from: TmgiCase.kt */
public final class TmgiCase extends BaseCase implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: A */
    public final String f11669A;

    /* renamed from: B */
    public final String f11670B;

    /* renamed from: C */
    public final String f11671C;

    /* renamed from: D */
    public final String f11672D;

    /* renamed from: E */
    public final String f11673E;

    /* renamed from: F */
    public final String f11674F;

    /* renamed from: G */
    public final String f11675G;

    /* renamed from: H */
    public final String f11676H;

    /* renamed from: I */
    public final String f11677I;

    /* renamed from: J */
    public final String f11678J;

    /* renamed from: K */
    public final List<Attachment> f11679K;

    /* renamed from: L */
    public final String f11680L;

    /* renamed from: M */
    public final Calendar f11681M;

    /* renamed from: N */
    public final Calendar f11682N;

    /* renamed from: O */
    public final List<ApplicationMandatoryDocument> f11683O;

    /* renamed from: P */
    public final List<Decision> f11684P;

    /* renamed from: v */
    public final String f11685v;

    /* renamed from: w */
    public final String f11686w;

    /* renamed from: x */
    public final Calendar f11687x;

    /* renamed from: y */
    public final Calendar f11688y;

    /* renamed from: z */
    public final StateType f11689z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiCase$Creator */
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
                    TmgiCase tmgiCase = new TmgiCase(readString, readString2, calendar, calendar2, stateType, readString3, readString4, readString5, readString6, readString7, readString8, str, str2, readString11, readString12, arrayList, readString13, calendar3, calendar4, arrayList5, arrayList4);
                    return tmgiCase;
                }
            }
        }

        public final Object[] newArray(int i) {
            return new TmgiCase[i];
        }
    }

    public /* synthetic */ TmgiCase(String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, Calendar calendar3, Calendar calendar4, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, calendar, calendar2, stateType, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, str13, calendar3, calendar4, list2, (i & 1048576) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }

    public static /* synthetic */ TmgiCase copy$default(TmgiCase tmgiCase, String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, Calendar calendar3, Calendar calendar4, List list2, List list3, int i, Object obj) {
        TmgiCase tmgiCase2 = tmgiCase;
        int i2 = i;
        return tmgiCase.mo12105a((i2 & 1) != 0 ? tmgiCase.mo11318e() : str, (i2 & 2) != 0 ? tmgiCase.mo11585l() : str2, (i2 & 4) != 0 ? tmgiCase.mo11588o() : calendar, (i2 & 8) != 0 ? tmgiCase.mo11586m() : calendar2, (i2 & 16) != 0 ? tmgiCase.mo11590q() : stateType, (i2 & 32) != 0 ? tmgiCase.mo11589p() : str3, (i2 & 64) != 0 ? tmgiCase.mo11594u() : str4, (i2 & 128) != 0 ? tmgiCase.mo11595v() : str5, (i2 & 256) != 0 ? tmgiCase.mo11583j() : str6, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? tmgiCase.mo11592s() : str7, (i2 & 1024) != 0 ? tmgiCase.mo11593t() : str8, (i2 & 2048) != 0 ? tmgiCase.mo11591r() : str9, (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? tmgiCase.mo11578f() : str10, (i2 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? tmgiCase.mo11587n() : str11, (i2 & 16384) != 0 ? tmgiCase.mo11584k() : str12, (i2 & 32768) != 0 ? tmgiCase.mo11580h() : list, (i2 & 65536) != 0 ? tmgiCase2.f11680L : str13, (i2 & 131072) != 0 ? tmgiCase2.f11681M : calendar3, (i2 & 262144) != 0 ? tmgiCase2.f11682N : calendar4, (i2 & 524288) != 0 ? tmgiCase.mo11579g() : list2, (i2 & 1048576) != 0 ? tmgiCase.mo11582i() : list3);
    }

    /* renamed from: a */
    public final TmgiCase mo12105a(String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<Attachment> list, String str13, Calendar calendar3, Calendar calendar4, List<ApplicationMandatoryDocument> list2, List<Decision> list3) {
        String str14 = str;
        String str15 = str2;
        Calendar calendar5 = calendar;
        Calendar calendar6 = calendar2;
        StateType stateType2 = stateType;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        List<Attachment> list4 = list;
        String str26 = str13;
        Calendar calendar7 = calendar3;
        Calendar calendar8 = calendar4;
        List<ApplicationMandatoryDocument> list5 = list2;
        List<Decision> list6 = list3;
        String str27 = str14;
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
        TmgiCase tmgiCase = new TmgiCase(str27, str15, calendar5, calendar6, stateType2, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, list4, str26, calendar7, calendar8, list5, list6);
        return tmgiCase;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11685v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0120, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) mo11582i(), (java.lang.Object) r3.mo11582i()) != false) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0125
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase
            if (r0 == 0) goto L_0x0123
            hu.ekreta.ellenorzo.cases.tmgi.TmgiCase r3 = (p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase) r3
            java.lang.String r0 = r2.mo11318e()
            java.lang.String r1 = r3.mo11318e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11585l()
            java.lang.String r1 = r3.mo11585l()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.Calendar r0 = r2.mo11588o()
            java.util.Calendar r1 = r3.mo11588o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.Calendar r0 = r2.mo11586m()
            java.util.Calendar r1 = r3.mo11586m()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            hu.ekreta.ellenorzo.cases.subModels.State$StateType r0 = r2.mo11590q()
            hu.ekreta.ellenorzo.cases.subModels.State$StateType r1 = r3.mo11590q()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11589p()
            java.lang.String r1 = r3.mo11589p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11594u()
            java.lang.String r1 = r3.mo11594u()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11595v()
            java.lang.String r1 = r3.mo11595v()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11583j()
            java.lang.String r1 = r3.mo11583j()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11592s()
            java.lang.String r1 = r3.mo11592s()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11593t()
            java.lang.String r1 = r3.mo11593t()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11591r()
            java.lang.String r1 = r3.mo11591r()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11578f()
            java.lang.String r1 = r3.mo11578f()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11587n()
            java.lang.String r1 = r3.mo11587n()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.mo11584k()
            java.lang.String r1 = r3.mo11584k()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.List r0 = r2.mo11580h()
            java.util.List r1 = r3.mo11580h()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r2.f11680L
            java.lang.String r1 = r3.f11680L
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.Calendar r0 = r2.f11681M
            java.util.Calendar r1 = r3.f11681M
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.Calendar r0 = r2.f11682N
            java.util.Calendar r1 = r3.f11682N
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.List r0 = r2.mo11579g()
            java.util.List r1 = r3.mo11579g()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0123
            java.util.List r0 = r2.mo11582i()
            java.util.List r3 = r3.mo11582i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r3 = 0
            return r3
        L_0x0125:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.cases.tmgi.TmgiCase.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo11578f() {
        return this.f11676H;
    }

    /* renamed from: g */
    public List<ApplicationMandatoryDocument> mo11579g() {
        return this.f11683O;
    }

    /* renamed from: h */
    public List<Attachment> mo11580h() {
        return this.f11679K;
    }

    public int hashCode() {
        String e = mo11318e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String l = mo11585l();
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Calendar o = mo11588o();
        int hashCode3 = (hashCode2 + (o != null ? o.hashCode() : 0)) * 31;
        Calendar m = mo11586m();
        int hashCode4 = (hashCode3 + (m != null ? m.hashCode() : 0)) * 31;
        StateType q = mo11590q();
        int hashCode5 = (hashCode4 + (q != null ? q.hashCode() : 0)) * 31;
        String p = mo11589p();
        int hashCode6 = (hashCode5 + (p != null ? p.hashCode() : 0)) * 31;
        String u = mo11594u();
        int hashCode7 = (hashCode6 + (u != null ? u.hashCode() : 0)) * 31;
        String v = mo11595v();
        int hashCode8 = (hashCode7 + (v != null ? v.hashCode() : 0)) * 31;
        String j = mo11583j();
        int hashCode9 = (hashCode8 + (j != null ? j.hashCode() : 0)) * 31;
        String s = mo11592s();
        int hashCode10 = (hashCode9 + (s != null ? s.hashCode() : 0)) * 31;
        String t = mo11593t();
        int hashCode11 = (hashCode10 + (t != null ? t.hashCode() : 0)) * 31;
        String r = mo11591r();
        int hashCode12 = (hashCode11 + (r != null ? r.hashCode() : 0)) * 31;
        String f = mo11578f();
        int hashCode13 = (hashCode12 + (f != null ? f.hashCode() : 0)) * 31;
        String n = mo11587n();
        int hashCode14 = (hashCode13 + (n != null ? n.hashCode() : 0)) * 31;
        String k = mo11584k();
        int hashCode15 = (hashCode14 + (k != null ? k.hashCode() : 0)) * 31;
        List h = mo11580h();
        int hashCode16 = (hashCode15 + (h != null ? h.hashCode() : 0)) * 31;
        String str = this.f11680L;
        int hashCode17 = (hashCode16 + (str != null ? str.hashCode() : 0)) * 31;
        Calendar calendar = this.f11681M;
        int hashCode18 = (hashCode17 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f11682N;
        int hashCode19 = (hashCode18 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        List g = mo11579g();
        int hashCode20 = (hashCode19 + (g != null ? g.hashCode() : 0)) * 31;
        List i2 = mo11582i();
        if (i2 != null) {
            i = i2.hashCode();
        }
        return hashCode20 + i;
    }

    /* renamed from: i */
    public List<Decision> mo11582i() {
        return this.f11684P;
    }

    /* renamed from: j */
    public String mo11583j() {
        return this.f11672D;
    }

    /* renamed from: k */
    public String mo11584k() {
        return this.f11678J;
    }

    /* renamed from: l */
    public String mo11585l() {
        return this.f11686w;
    }

    /* renamed from: m */
    public Calendar mo11586m() {
        return this.f11688y;
    }

    /* renamed from: n */
    public String mo11587n() {
        return this.f11677I;
    }

    /* renamed from: o */
    public Calendar mo11588o() {
        return this.f11687x;
    }

    /* renamed from: p */
    public String mo11589p() {
        return this.f11669A;
    }

    /* renamed from: q */
    public StateType mo11590q() {
        return this.f11689z;
    }

    /* renamed from: r */
    public String mo11591r() {
        return this.f11675G;
    }

    /* renamed from: s */
    public String mo11592s() {
        return this.f11673E;
    }

    /* renamed from: t */
    public String mo11593t() {
        return this.f11674F;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("TmgiCase(profileId=");
        a.append(mo11318e());
        a.append(", id=");
        a.append(mo11585l());
        a.append(", sentDate=");
        a.append(mo11588o());
        a.append(", lastModificationDate=");
        a.append(mo11586m());
        a.append(", stateType=");
        a.append(mo11590q());
        a.append(", stateDescription=");
        a.append(mo11589p());
        a.append(", typeCode=");
        a.append(mo11594u());
        a.append(", typeName=");
        a.append(mo11595v());
        a.append(", documentNumber=");
        a.append(mo11583j());
        a.append(", studentFamilyName=");
        a.append(mo11592s());
        a.append(", studentFirstName=");
        a.append(mo11593t());
        a.append(", studentEducationId=");
        a.append(mo11591r());
        a.append(", administratorName=");
        a.append(mo11578f());
        a.append(", reason=");
        a.append(mo11587n());
        a.append(", filedDocumentId=");
        a.append(mo11584k());
        a.append(", attachmentList=");
        a.append(mo11580h());
        a.append(", justificationType=");
        a.append(this.f11680L);
        a.append(", requestedAbsenceStart=");
        a.append(this.f11681M);
        a.append(", requestedAbsenceEnd=");
        a.append(this.f11682N);
        a.append(", applicationMandatoryDocumentList=");
        a.append(mo11579g());
        a.append(", decisions=");
        a.append(mo11582i());
        a.append(")");
        return a.toString();
    }

    /* renamed from: u */
    public String mo11594u() {
        return this.f11670B;
    }

    /* renamed from: v */
    public String mo11595v() {
        return this.f11671C;
    }

    /* renamed from: w */
    public final String mo12107w() {
        return this.f11680L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f11685v);
        parcel.writeString(this.f11686w);
        parcel.writeSerializable(this.f11687x);
        parcel.writeSerializable(this.f11688y);
        parcel.writeString(this.f11689z.name());
        parcel.writeString(this.f11669A);
        parcel.writeString(this.f11670B);
        parcel.writeString(this.f11671C);
        parcel.writeString(this.f11672D);
        parcel.writeString(this.f11673E);
        parcel.writeString(this.f11674F);
        parcel.writeString(this.f11675G);
        parcel.writeString(this.f11676H);
        parcel.writeString(this.f11677I);
        parcel.writeString(this.f11678J);
        List<Attachment> list = this.f11679K;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.f11680L);
        parcel.writeSerializable(this.f11681M);
        parcel.writeSerializable(this.f11682N);
        List<ApplicationMandatoryDocument> list2 = this.f11683O;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        List<Decision> list3 = this.f11684P;
        parcel.writeInt(list3.size());
        for (Decision writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: x */
    public final Calendar mo12108x() {
        return this.f11682N;
    }

    /* renamed from: y */
    public final Calendar mo12109y() {
        return this.f11681M;
    }

    public TmgiCase(String str, String str2, Calendar calendar, Calendar calendar2, StateType stateType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<Attachment> list, String str13, Calendar calendar3, Calendar calendar4, List<ApplicationMandatoryDocument> list2, List<Decision> list3) {
        String str14 = str5;
        List<Decision> list4 = list3;
        String str15 = str;
        List<ApplicationMandatoryDocument> list5 = list2;
        String str16 = str2;
        List<Attachment> list6 = list;
        Calendar calendar5 = calendar;
        String str17 = str14;
        Calendar calendar6 = calendar2;
        String str18 = str4;
        StateType stateType2 = stateType;
        String str19 = str3;
        String str20 = str3;
        StateType stateType3 = stateType;
        String str21 = str8;
        String str22 = str4;
        Calendar calendar7 = calendar;
        String str23 = str9;
        String str24 = str14;
        String str25 = str2;
        String str26 = str10;
        String str27 = str6;
        String str28 = str11;
        String str29 = str12;
        List<Attachment> list7 = list;
        List<ApplicationMandatoryDocument> list8 = list2;
        List<Decision> list9 = list3;
        String str30 = str7;
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(str25, "id");
        Intrinsics.checkParameterIsNotNull(calendar7, "sentDate");
        Intrinsics.checkParameterIsNotNull(stateType3, "stateType");
        Intrinsics.checkParameterIsNotNull(str19, "stateDescription");
        Intrinsics.checkParameterIsNotNull(str18, "typeCode");
        Intrinsics.checkParameterIsNotNull(str17, "typeName");
        Intrinsics.checkParameterIsNotNull(list6, "attachmentList");
        Intrinsics.checkParameterIsNotNull(list5, "applicationMandatoryDocumentList");
        Intrinsics.checkParameterIsNotNull(list4, "decisions");
        super(str15, str16, calendar5, calendar6, stateType2, str20, str22, str24, str27, str30, str21, str23, str26, str28, str29, list7, list8, list9);
        this.f11685v = str;
        this.f11686w = str2;
        this.f11687x = calendar;
        this.f11688y = calendar2;
        this.f11689z = stateType;
        this.f11669A = str3;
        this.f11670B = str4;
        this.f11671C = str5;
        this.f11672D = str6;
        this.f11673E = str7;
        this.f11674F = str8;
        this.f11675G = str9;
        this.f11676H = str10;
        this.f11677I = str11;
        this.f11678J = str12;
        this.f11679K = list;
        this.f11680L = str13;
        this.f11681M = calendar3;
        this.f11682N = calendar4;
        this.f11683O = list2;
        this.f11684P = list3;
    }
}
