package p289hu.ekreta.ellenorzo.cases.decision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.cases.subModels.Decision;
import p289hu.ekreta.ellenorzo.cases.subModels.Judgement;
import p289hu.ekreta.ellenorzo.cases.subModels.State.StateType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\b\u0010$\u001a\u00020\tH\u0016J\u0013\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000e¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "Landroid/os/Parcelable;", "decision", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "longName", "", "caseId", "documentNumber", "decisionCount", "", "caseStateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "(Lhu/ekreta/ellenorzo/cases/subModels/Decision;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILhu/ekreta/ellenorzo/cases/subModels/State$StateType;)V", "getCaseId", "()Ljava/lang/String;", "getCaseStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getDecision", "()Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "getDecisionCount", "()I", "decisionNeedsToBeSent", "", "getDecisionNeedsToBeSent", "()Z", "getDocumentNumber", "finalDecisionSent", "getFinalDecisionSent", "getLongName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter */
/* compiled from: CaseDetailParameter.kt */
public final class CaseDetailParameter implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final boolean f11351c;

    /* renamed from: e */
    public final boolean f11352e;

    /* renamed from: f */
    public final Decision f11353f;

    /* renamed from: g */
    public final String f11354g;

    /* renamed from: h */
    public final String f11355h;

    /* renamed from: i */
    public final String f11356i;

    /* renamed from: j */
    public final int f11357j;

    /* renamed from: k */
    public final StateType f11358k;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.decision.CaseDetailParameter$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            StateType stateType;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Decision decision = (Decision) Decision.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                stateType = (StateType) Enum.valueOf(StateType.class, parcel.readString());
            } else {
                stateType = null;
            }
            CaseDetailParameter caseDetailParameter = new CaseDetailParameter(decision, readString, readString2, readString3, readInt, stateType);
            return caseDetailParameter;
        }

        public final Object[] newArray(int i) {
            return new CaseDetailParameter[i];
        }
    }

    public CaseDetailParameter(Decision decision, String str, String str2, String str3, int i, StateType stateType) {
        Intrinsics.checkParameterIsNotNull(decision, "decision");
        Intrinsics.checkParameterIsNotNull(str, "longName");
        Intrinsics.checkParameterIsNotNull(str2, "caseId");
        Intrinsics.checkParameterIsNotNull(str3, "documentNumber");
        this.f11353f = decision;
        this.f11354g = str;
        this.f11355h = str2;
        this.f11356i = str3;
        this.f11357j = i;
        this.f11358k = stateType;
        Judgement h = this.f11353f.mo11952h();
        boolean z = false;
        boolean z2 = true;
        boolean g = (h != null ? h.mo11979g() : false) & (this.f11357j == 1);
        if (this.f11358k != StateType.NEEDS_CORRECTION) {
            z2 = false;
        }
        this.f11351c = g & z2;
        Judgement h2 = this.f11353f.mo11952h();
        if (h2 != null) {
            z = h2.mo11976e();
        }
        this.f11352e = z;
    }

    public static /* synthetic */ CaseDetailParameter copy$default(CaseDetailParameter caseDetailParameter, Decision decision, String str, String str2, String str3, int i, StateType stateType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            decision = caseDetailParameter.f11353f;
        }
        if ((i2 & 2) != 0) {
            str = caseDetailParameter.f11354g;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = caseDetailParameter.f11355h;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = caseDetailParameter.f11356i;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = caseDetailParameter.f11357j;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            stateType = caseDetailParameter.f11358k;
        }
        return caseDetailParameter.mo11697a(decision, str4, str5, str6, i3, stateType);
    }

    /* renamed from: a */
    public final CaseDetailParameter mo11697a(Decision decision, String str, String str2, String str3, int i, StateType stateType) {
        Intrinsics.checkParameterIsNotNull(decision, "decision");
        Intrinsics.checkParameterIsNotNull(str, "longName");
        Intrinsics.checkParameterIsNotNull(str2, "caseId");
        Intrinsics.checkParameterIsNotNull(str3, "documentNumber");
        CaseDetailParameter caseDetailParameter = new CaseDetailParameter(decision, str, str2, str3, i, stateType);
        return caseDetailParameter;
    }

    /* renamed from: d */
    public final String mo11698d() {
        return this.f11355h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Decision mo11700e() {
        return this.f11353f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaseDetailParameter) {
                CaseDetailParameter caseDetailParameter = (CaseDetailParameter) obj;
                if (Intrinsics.areEqual((Object) this.f11353f, (Object) caseDetailParameter.f11353f) && Intrinsics.areEqual((Object) this.f11354g, (Object) caseDetailParameter.f11354g) && Intrinsics.areEqual((Object) this.f11355h, (Object) caseDetailParameter.f11355h) && Intrinsics.areEqual((Object) this.f11356i, (Object) caseDetailParameter.f11356i)) {
                    if (!(this.f11357j == caseDetailParameter.f11357j) || !Intrinsics.areEqual((Object) this.f11358k, (Object) caseDetailParameter.f11358k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo11702f() {
        return this.f11351c;
    }

    /* renamed from: g */
    public final String mo11703g() {
        return this.f11356i;
    }

    /* renamed from: h */
    public final boolean mo11704h() {
        return this.f11352e;
    }

    public int hashCode() {
        Decision decision = this.f11353f;
        int i = 0;
        int hashCode = (decision != null ? decision.hashCode() : 0) * 31;
        String str = this.f11354g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11355h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11356i;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f11357j) * 31;
        StateType stateType = this.f11358k;
        if (stateType != null) {
            i = stateType.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final String mo11706i() {
        return this.f11354g;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("CaseDetailParameter(decision=");
        a.append(this.f11353f);
        a.append(", longName=");
        a.append(this.f11354g);
        a.append(", caseId=");
        a.append(this.f11355h);
        a.append(", documentNumber=");
        a.append(this.f11356i);
        a.append(", decisionCount=");
        a.append(this.f11357j);
        a.append(", caseStateType=");
        a.append(this.f11358k);
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f11353f.writeToParcel(parcel, 0);
        parcel.writeString(this.f11354g);
        parcel.writeString(this.f11355h);
        parcel.writeString(this.f11356i);
        parcel.writeInt(this.f11357j);
        StateType stateType = this.f11358k;
        if (stateType != null) {
            parcel.writeInt(1);
            parcel.writeString(stateType.name());
            return;
        }
        parcel.writeInt(0);
    }
}
