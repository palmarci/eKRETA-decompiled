package hu.ekreta.ellenorzo.cases.decision;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.cases.subModels.Decision;
import hu.ekreta.ellenorzo.cases.subModels.Judgement;
import hu.ekreta.ellenorzo.cases.subModels.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\b\u0010$\u001a\u00020\tH\u0016J\u0013\u0010%\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000e¨\u0006/"}, d2 = {"Lhu/ekreta/ellenorzo/cases/decision/CaseDetailParameter;", "Landroid/os/Parcelable;", "decision", "Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "longName", "", "caseId", "documentNumber", "decisionCount", "", "caseStateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "(Lhu/ekreta/ellenorzo/cases/subModels/Decision;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILhu/ekreta/ellenorzo/cases/subModels/State$StateType;)V", "getCaseId", "()Ljava/lang/String;", "getCaseStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getDecision", "()Lhu/ekreta/ellenorzo/cases/subModels/Decision;", "getDecisionCount", "()I", "decisionNeedsToBeSent", "", "getDecisionNeedsToBeSent", "()Z", "getDocumentNumber", "finalDecisionSent", "getFinalDecisionSent", "getLongName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseDetailParameter.kt */
public final class CaseDetailParameter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final boolean c;
    public final boolean e;
    public final Decision f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5109g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5110h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5111i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5112j;

    /* renamed from: k  reason: collision with root package name */
    public final State.StateType f5113k;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            State.StateType stateType;
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Decision decision = (Decision) Decision.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                stateType = (State.StateType) Enum.valueOf(State.StateType.class, parcel.readString());
            } else {
                stateType = null;
            }
            return new CaseDetailParameter(decision, readString, readString2, readString3, readInt, stateType);
        }

        public final Object[] newArray(int i2) {
            return new CaseDetailParameter[i2];
        }
    }

    public CaseDetailParameter(Decision decision, String str, String str2, String str3, int i2, State.StateType stateType) {
        Intrinsics.checkParameterIsNotNull(decision, "decision");
        Intrinsics.checkParameterIsNotNull(str, "longName");
        Intrinsics.checkParameterIsNotNull(str2, "caseId");
        Intrinsics.checkParameterIsNotNull(str3, "documentNumber");
        this.f = decision;
        this.f5109g = str;
        this.f5110h = str2;
        this.f5111i = str3;
        this.f5112j = i2;
        this.f5113k = stateType;
        Judgement h2 = this.f.h();
        boolean z = false;
        this.c = (h2 != null ? h2.g() : false) & (this.f5112j == 1) & (this.f5113k != State.StateType.NEEDS_CORRECTION ? false : true);
        Judgement h3 = this.f.h();
        this.e = h3 != null ? h3.e() : z;
    }

    public static /* synthetic */ CaseDetailParameter copy$default(CaseDetailParameter caseDetailParameter, Decision decision, String str, String str2, String str3, int i2, State.StateType stateType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            decision = caseDetailParameter.f;
        }
        if ((i3 & 2) != 0) {
            str = caseDetailParameter.f5109g;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = caseDetailParameter.f5110h;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = caseDetailParameter.f5111i;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            i2 = caseDetailParameter.f5112j;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            stateType = caseDetailParameter.f5113k;
        }
        return caseDetailParameter.a(decision, str4, str5, str6, i4, stateType);
    }

    public final CaseDetailParameter a(Decision decision, String str, String str2, String str3, int i2, State.StateType stateType) {
        Intrinsics.checkParameterIsNotNull(decision, "decision");
        Intrinsics.checkParameterIsNotNull(str, "longName");
        Intrinsics.checkParameterIsNotNull(str2, "caseId");
        Intrinsics.checkParameterIsNotNull(str3, "documentNumber");
        return new CaseDetailParameter(decision, str, str2, str3, i2, stateType);
    }

    public final String d() {
        return this.f5110h;
    }

    public int describeContents() {
        return 0;
    }

    public final Decision e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaseDetailParameter) {
                CaseDetailParameter caseDetailParameter = (CaseDetailParameter) obj;
                if (Intrinsics.areEqual((Object) this.f, (Object) caseDetailParameter.f) && Intrinsics.areEqual((Object) this.f5109g, (Object) caseDetailParameter.f5109g) && Intrinsics.areEqual((Object) this.f5110h, (Object) caseDetailParameter.f5110h) && Intrinsics.areEqual((Object) this.f5111i, (Object) caseDetailParameter.f5111i)) {
                    if (!(this.f5112j == caseDetailParameter.f5112j) || !Intrinsics.areEqual((Object) this.f5113k, (Object) caseDetailParameter.f5113k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.c;
    }

    public final String g() {
        return this.f5111i;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        Decision decision = this.f;
        int i2 = 0;
        int hashCode = (decision != null ? decision.hashCode() : 0) * 31;
        String str = this.f5109g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5110h;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5111i;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f5112j) * 31;
        State.StateType stateType = this.f5113k;
        if (stateType != null) {
            i2 = stateType.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String i() {
        return this.f5109g;
    }

    public String toString() {
        StringBuilder a2 = a.a("CaseDetailParameter(decision=");
        a2.append(this.f);
        a2.append(", longName=");
        a2.append(this.f5109g);
        a2.append(", caseId=");
        a2.append(this.f5110h);
        a2.append(", documentNumber=");
        a2.append(this.f5111i);
        a2.append(", decisionCount=");
        a2.append(this.f5112j);
        a2.append(", caseStateType=");
        a2.append(this.f5113k);
        a2.append(")");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this.f.writeToParcel(parcel, 0);
        parcel.writeString(this.f5109g);
        parcel.writeString(this.f5110h);
        parcel.writeString(this.f5111i);
        parcel.writeInt(this.f5112j);
        State.StateType stateType = this.f5113k;
        if (stateType != null) {
            parcel.writeInt(1);
            parcel.writeString(stateType.name());
            return;
        }
        parcel.writeInt(0);
    }
}
