package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.attachment.Attachment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0001¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0003H\u0016J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\tHÖ\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"¨\u0006I"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "Landroid/os/Parcelable;", "id", "", "requestedAbsenceStart", "Ljava/util/Calendar;", "requestedAbsenceEnd", "decisionDate", "adjudication", "", "justification", "signerId", "needToBeSendDigitally", "", "judgement", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "filedDocumentId", "postState", "Lhu/ekreta/ellenorzo/cases/subModels/PostState;", "attachments", "", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "applicationMandatoryDocument", "Lhu/ekreta/ellenorzo/cases/subModels/ApplicationMandatoryDocument;", "(Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/cases/subModels/Judgement;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/PostState;Ljava/util/List;Ljava/util/List;)V", "getAdjudication", "()Ljava/lang/String;", "getApplicationMandatoryDocument", "()Ljava/util/List;", "getAttachments", "getDecisionDate", "()Ljava/util/Calendar;", "getFiledDocumentId", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJudgement", "()Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "getJustification", "getNeedToBeSendDigitally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPostState", "()Lhu/ekreta/ellenorzo/cases/subModels/PostState;", "getRequestedAbsenceEnd", "getRequestedAbsenceStart", "getSignerId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lhu/ekreta/ellenorzo/cases/subModels/Judgement;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/PostState;Ljava/util/List;Ljava/util/List;)Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Decision.kt */
public final class Decision implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final Integer c;
    public final Calendar e;
    public final Calendar f;

    /* renamed from: g  reason: collision with root package name */
    public final Calendar f5180g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5181h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5182i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f5183j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f5184k;

    /* renamed from: l  reason: collision with root package name */
    public final Judgement f5185l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5186m;

    /* renamed from: n  reason: collision with root package name */
    public final PostState f5187n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Attachment> f5188o;

    /* renamed from: p  reason: collision with root package name */
    public final List<ApplicationMandatoryDocument> f5189p;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkParameterIsNotNull(parcel2, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Calendar calendar = (Calendar) parcel.readSerializable();
            Calendar calendar2 = (Calendar) parcel.readSerializable();
            Calendar calendar3 = (Calendar) parcel.readSerializable();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Judgement judgement = parcel.readInt() != 0 ? (Judgement) Judgement.CREATOR.createFromParcel(parcel2) : null;
            String readString3 = parcel.readString();
            PostState postState = parcel.readInt() != 0 ? (PostState) PostState.CREATOR.createFromParcel(parcel2) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Attachment) Attachment.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (true) {
                ArrayList arrayList3 = arrayList;
                if (readInt2 != 0) {
                    arrayList2.add((ApplicationMandatoryDocument) ApplicationMandatoryDocument.CREATOR.createFromParcel(parcel2));
                    readInt2--;
                    arrayList = arrayList3;
                } else {
                    return new Decision(valueOf, calendar, calendar2, calendar3, readString, readString2, valueOf2, bool, judgement, readString3, postState, arrayList3, arrayList2);
                }
            }
        }

        public final Object[] newArray(int i2) {
            return new Decision[i2];
        }
    }

    public Decision(Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List<Attachment> list, List<ApplicationMandatoryDocument> list2) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        Intrinsics.checkParameterIsNotNull(list2, "applicationMandatoryDocument");
        this.c = num;
        this.e = calendar;
        this.f = calendar2;
        this.f5180g = calendar3;
        this.f5181h = str;
        this.f5182i = str2;
        this.f5183j = num2;
        this.f5184k = bool;
        this.f5185l = judgement;
        this.f5186m = str3;
        this.f5187n = postState;
        this.f5188o = list;
        this.f5189p = list2;
    }

    public static /* synthetic */ Decision copy$default(Decision decision, Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List list, List list2, int i2, Object obj) {
        Decision decision2 = decision;
        int i3 = i2;
        return decision.a((i3 & 1) != 0 ? decision2.c : num, (i3 & 2) != 0 ? decision2.e : calendar, (i3 & 4) != 0 ? decision2.f : calendar2, (i3 & 8) != 0 ? decision2.f5180g : calendar3, (i3 & 16) != 0 ? decision2.f5181h : str, (i3 & 32) != 0 ? decision2.f5182i : str2, (i3 & 64) != 0 ? decision2.f5183j : num2, (i3 & 128) != 0 ? decision2.f5184k : bool, (i3 & 256) != 0 ? decision2.f5185l : judgement, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? decision2.f5186m : str3, (i3 & 1024) != 0 ? decision2.f5187n : postState, (i3 & 2048) != 0 ? decision2.f5188o : list, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? decision2.f5189p : list2);
    }

    public final Decision a(Integer num, Calendar calendar, Calendar calendar2, Calendar calendar3, String str, String str2, Integer num2, Boolean bool, Judgement judgement, String str3, PostState postState, List<Attachment> list, List<ApplicationMandatoryDocument> list2) {
        List<Attachment> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "attachments");
        List<ApplicationMandatoryDocument> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "applicationMandatoryDocument");
        return new Decision(num, calendar, calendar2, calendar3, str, str2, num2, bool, judgement, str3, postState, list3, list4);
    }

    public final String d() {
        return this.f5181h;
    }

    public int describeContents() {
        return 0;
    }

    public final List<Attachment> e() {
        return this.f5188o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Decision)) {
            return false;
        }
        Decision decision = (Decision) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) decision.c) && Intrinsics.areEqual((Object) this.e, (Object) decision.e) && Intrinsics.areEqual((Object) this.f, (Object) decision.f) && Intrinsics.areEqual((Object) this.f5180g, (Object) decision.f5180g) && Intrinsics.areEqual((Object) this.f5181h, (Object) decision.f5181h) && Intrinsics.areEqual((Object) this.f5182i, (Object) decision.f5182i) && Intrinsics.areEqual((Object) this.f5183j, (Object) decision.f5183j) && Intrinsics.areEqual((Object) this.f5184k, (Object) decision.f5184k) && Intrinsics.areEqual((Object) this.f5185l, (Object) decision.f5185l) && Intrinsics.areEqual((Object) this.f5186m, (Object) decision.f5186m) && Intrinsics.areEqual((Object) this.f5187n, (Object) decision.f5187n) && Intrinsics.areEqual((Object) this.f5188o, (Object) decision.f5188o) && Intrinsics.areEqual((Object) this.f5189p, (Object) decision.f5189p);
    }

    public final Calendar f() {
        return this.f5180g;
    }

    public final String g() {
        return this.f5186m;
    }

    public final Judgement h() {
        return this.f5185l;
    }

    public int hashCode() {
        Integer num = this.c;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Calendar calendar = this.e;
        int hashCode2 = (hashCode + (calendar != null ? calendar.hashCode() : 0)) * 31;
        Calendar calendar2 = this.f;
        int hashCode3 = (hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0)) * 31;
        Calendar calendar3 = this.f5180g;
        int hashCode4 = (hashCode3 + (calendar3 != null ? calendar3.hashCode() : 0)) * 31;
        String str = this.f5181h;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5182i;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.f5183j;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.f5184k;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Judgement judgement = this.f5185l;
        int hashCode9 = (hashCode8 + (judgement != null ? judgement.hashCode() : 0)) * 31;
        String str3 = this.f5186m;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PostState postState = this.f5187n;
        int hashCode11 = (hashCode10 + (postState != null ? postState.hashCode() : 0)) * 31;
        List<Attachment> list = this.f5188o;
        int hashCode12 = (hashCode11 + (list != null ? list.hashCode() : 0)) * 31;
        List<ApplicationMandatoryDocument> list2 = this.f5189p;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String i() {
        return this.f5182i;
    }

    public final Calendar j() {
        return this.f;
    }

    public final Calendar k() {
        return this.e;
    }

    public final Integer l() {
        return this.f5183j;
    }

    public String toString() {
        StringBuilder a2 = a.a("Decision(id=");
        a2.append(this.c);
        a2.append(", requestedAbsenceStart=");
        a2.append(this.e);
        a2.append(", requestedAbsenceEnd=");
        a2.append(this.f);
        a2.append(", decisionDate=");
        a2.append(this.f5180g);
        a2.append(", adjudication=");
        a2.append(this.f5181h);
        a2.append(", justification=");
        a2.append(this.f5182i);
        a2.append(", signerId=");
        a2.append(this.f5183j);
        a2.append(", needToBeSendDigitally=");
        a2.append(this.f5184k);
        a2.append(", judgement=");
        a2.append(this.f5185l);
        a2.append(", filedDocumentId=");
        a2.append(this.f5186m);
        a2.append(", postState=");
        a2.append(this.f5187n);
        a2.append(", attachments=");
        a2.append(this.f5188o);
        a2.append(", applicationMandatoryDocument=");
        return a.a(a2, (List) this.f5189p, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        Integer num = this.c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.f5180g);
        parcel.writeString(this.f5181h);
        parcel.writeString(this.f5182i);
        Integer num2 = this.f5183j;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f5184k;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Judgement judgement = this.f5185l;
        if (judgement != null) {
            parcel.writeInt(1);
            judgement.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f5186m);
        PostState postState = this.f5187n;
        if (postState != null) {
            parcel.writeInt(1);
            postState.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Attachment> list = this.f5188o;
        parcel.writeInt(list.size());
        for (Attachment writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<ApplicationMandatoryDocument> list2 = this.f5189p;
        parcel.writeInt(list2.size());
        for (ApplicationMandatoryDocument writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Decision(java.lang.Integer r17, java.util.Calendar r18, java.util.Calendar r19, java.util.Calendar r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23, java.lang.Boolean r24, hu.ekreta.ellenorzo.cases.subModels.Judgement r25, java.lang.String r26, hu.ekreta.ellenorzo.cases.subModels.PostState r27, java.util.List r28, java.util.List r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r14 = r1
            goto L_0x000e
        L_0x000c:
            r14 = r28
        L_0x000e:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r15 = r0
            goto L_0x001a
        L_0x0018:
            r15 = r29
        L_0x001a:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.cases.subModels.Decision.<init>(java.lang.Integer, java.util.Calendar, java.util.Calendar, java.util.Calendar, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, hu.ekreta.ellenorzo.cases.subModels.Judgement, java.lang.String, hu.ekreta.ellenorzo.cases.subModels.PostState, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
