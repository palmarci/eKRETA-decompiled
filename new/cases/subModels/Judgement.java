package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import hu.ekreta.ellenorzo.R;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u00012B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\b\u0010'\u001a\u00020\u0003H\u0016J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000f¨\u00063"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "Landroid/os/Parcelable;", "id", "", "judgementType", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "shortName", "", "name", "description", "(ILhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "decisionTypeCodeFormatted", "getDecisionTypeCodeFormatted", "()I", "getDescription", "()Ljava/lang/String;", "finalDecision", "", "getFinalDecision", "()Z", "finalDecisionTypes", "", "getFinalDecisionTypes", "()Ljava/util/List;", "getId", "getJudgementType", "()Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "getName", "rectificationTypes", "getRectificationTypes", "rectificiationType", "getRectificiationType", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "JudgementType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Judgement.kt */
public final class Judgement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final List<JudgementType> c = CollectionsKt__CollectionsKt.listOf(JudgementType.RECTIFICATION_WITH_DECISION, JudgementType.RECTIFICATION_WITH_MESSAGE);
    public final List<JudgementType> e = CollectionsKt__CollectionsKt.listOf(JudgementType.ACCEPTED, JudgementType.DENIED);
    public final boolean f = this.c.contains(this.f5193j);

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5190g = this.e.contains(this.f5193j);

    /* renamed from: h  reason: collision with root package name */
    public final int f5191h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5192i;

    /* renamed from: j  reason: collision with root package name */
    public final JudgementType f5193j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5194k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5195l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5196m;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Judgement(parcel.readInt(), (JudgementType) Enum.valueOf(JudgementType.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new Judgement[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ACCEPTED", "ACCEPTED_WITH_MODIFICATION", "DENIED", "RECTIFICATION_WITH_DECISION", "RECTIFICATION_WITH_MESSAGE", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: Judgement.kt */
    public enum JudgementType {
        ACCEPTED("ELFOGADVA"),
        ACCEPTED_WITH_MODIFICATION("ELFOGADVA_MODOSITASSAL"),
        DENIED("ELUTASITVA"),
        RECTIFICATION_WITH_DECISION("HIANYPOTLAS_HATAROZATTAL"),
        RECTIFICATION_WITH_MESSAGE("HIANYPOTLAS_UZENETTEL");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "code", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: Judgement.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5197a = null;

            static {
                f5197a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final JudgementType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "code");
                Lazy access$getMap$cp = JudgementType.f;
                Companion companion = JudgementType.Companion;
                KProperty kProperty = f5197a[0];
                JudgementType judgementType = (JudgementType) ((Map) access$getMap$cp.getValue()).get(str);
                return judgementType != null ? judgementType : JudgementType.ACCEPTED;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(Judgement$JudgementType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        JudgementType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5198a = new int[JudgementType.values().length];

        static {
            f5198a[JudgementType.ACCEPTED.ordinal()] = 1;
            f5198a[JudgementType.RECTIFICATION_WITH_MESSAGE.ordinal()] = 2;
            f5198a[JudgementType.RECTIFICATION_WITH_DECISION.ordinal()] = 3;
            f5198a[JudgementType.DENIED.ordinal()] = 4;
            f5198a[JudgementType.ACCEPTED_WITH_MODIFICATION.ordinal()] = 5;
        }
    }

    public Judgement(int i2, JudgementType judgementType, String str, String str2, String str3) {
        int i3;
        Intrinsics.checkParameterIsNotNull(judgementType, "judgementType");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.f5192i = i2;
        this.f5193j = judgementType;
        this.f5194k = str;
        this.f5195l = str2;
        this.f5196m = str3;
        int i4 = WhenMappings.f5198a[this.f5193j.ordinal()];
        if (i4 == 1) {
            i3 = R.string.decision_accepted;
        } else if (i4 == 2) {
            i3 = R.string.decision_rectification_with_message;
        } else if (i4 == 3) {
            i3 = R.string.decision_rectification_with_decision;
        } else if (i4 == 4) {
            i3 = R.string.decision_denied;
        } else if (i4 == 5) {
            i3 = R.string.decision_accepted_with_modification;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f5191h = i3;
    }

    public static /* synthetic */ Judgement copy$default(Judgement judgement, int i2, JudgementType judgementType, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = judgement.f5192i;
        }
        if ((i3 & 2) != 0) {
            judgementType = judgement.f5193j;
        }
        JudgementType judgementType2 = judgementType;
        if ((i3 & 4) != 0) {
            str = judgement.f5194k;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = judgement.f5195l;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = judgement.f5196m;
        }
        return judgement.a(i2, judgementType2, str4, str5, str3);
    }

    public final Judgement a(int i2, JudgementType judgementType, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(judgementType, "judgementType");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        return new Judgement(i2, judgementType, str, str2, str3);
    }

    public final int d() {
        return this.f5191h;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f5190g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Judgement) {
                Judgement judgement = (Judgement) obj;
                if (!(this.f5192i == judgement.f5192i) || !Intrinsics.areEqual((Object) this.f5193j, (Object) judgement.f5193j) || !Intrinsics.areEqual((Object) this.f5194k, (Object) judgement.f5194k) || !Intrinsics.areEqual((Object) this.f5195l, (Object) judgement.f5195l) || !Intrinsics.areEqual((Object) this.f5196m, (Object) judgement.f5196m)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final JudgementType f() {
        return this.f5193j;
    }

    public final boolean g() {
        return this.f;
    }

    public int hashCode() {
        int i2 = this.f5192i * 31;
        JudgementType judgementType = this.f5193j;
        int i3 = 0;
        int hashCode = (i2 + (judgementType != null ? judgementType.hashCode() : 0)) * 31;
        String str = this.f5194k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5195l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5196m;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode3 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("Judgement(id=");
        a2.append(this.f5192i);
        a2.append(", judgementType=");
        a2.append(this.f5193j);
        a2.append(", shortName=");
        a2.append(this.f5194k);
        a2.append(", name=");
        a2.append(this.f5195l);
        a2.append(", description=");
        return a.a(a2, this.f5196m, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f5192i);
        parcel.writeString(this.f5193j.name());
        parcel.writeString(this.f5194k);
        parcel.writeString(this.f5195l);
        parcel.writeString(this.f5196m);
    }
}
