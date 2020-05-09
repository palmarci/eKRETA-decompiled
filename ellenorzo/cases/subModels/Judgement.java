package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
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
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u00012B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\b\u0010'\u001a\u00020\u0003H\u0016J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000f¨\u00063"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement;", "Landroid/os/Parcelable;", "id", "", "judgementType", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "shortName", "", "name", "description", "(ILhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "decisionTypeCodeFormatted", "getDecisionTypeCodeFormatted", "()I", "getDescription", "()Ljava/lang/String;", "finalDecision", "", "getFinalDecision", "()Z", "finalDecisionTypes", "", "getFinalDecisionTypes", "()Ljava/util/List;", "getId", "getJudgementType", "()Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "getName", "rectificationTypes", "getRectificationTypes", "rectificiationType", "getRectificiationType", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "JudgementType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.Judgement */
/* compiled from: Judgement.kt */
public final class Judgement implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final List<JudgementType> f11583c = CollectionsKt__CollectionsKt.listOf(JudgementType.RECTIFICATION_WITH_DECISION, JudgementType.RECTIFICATION_WITH_MESSAGE);

    /* renamed from: e */
    public final List<JudgementType> f11584e = CollectionsKt__CollectionsKt.listOf(JudgementType.ACCEPTED, JudgementType.DENIED);

    /* renamed from: f */
    public final boolean f11585f = this.f11583c.contains(this.f11589j);

    /* renamed from: g */
    public final boolean f11586g = this.f11584e.contains(this.f11589j);

    /* renamed from: h */
    public final int f11587h;

    /* renamed from: i */
    public final int f11588i;

    /* renamed from: j */
    public final JudgementType f11589j;

    /* renamed from: k */
    public final String f11590k;

    /* renamed from: l */
    public final String f11591l;

    /* renamed from: m */
    public final String f11592m;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Judgement$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Judgement judgement = new Judgement(parcel.readInt(), (JudgementType) Enum.valueOf(JudgementType.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            return judgement;
        }

        public final Object[] newArray(int i) {
            return new Judgement[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ACCEPTED", "ACCEPTED_WITH_MODIFICATION", "DENIED", "RECTIFICATION_WITH_DECISION", "RECTIFICATION_WITH_MESSAGE", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Judgement$JudgementType */
    /* compiled from: Judgement.kt */
    public enum JudgementType {
        ACCEPTED("ELFOGADVA"),
        ACCEPTED_WITH_MODIFICATION("ELFOGADVA_MODOSITASSAL"),
        DENIED("ELUTASITVA"),
        RECTIFICATION_WITH_DECISION("HIANYPOTLAS_HATAROZATTAL"),
        RECTIFICATION_WITH_MESSAGE("HIANYPOTLAS_UZENETTEL");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f11594f = null;

        /* renamed from: c */
        public final String f11595c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/Judgement$JudgementType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "code", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Judgement$JudgementType$Companion */
        /* compiled from: Judgement.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f11596a = null;

            static {
                f11596a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final JudgementType mo11986a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "code");
                Lazy access$getMap$cp = JudgementType.f11594f;
                Companion companion = JudgementType.Companion;
                KProperty kProperty = f11596a[0];
                JudgementType judgementType = (JudgementType) ((Map) access$getMap$cp.getValue()).get(str);
                return judgementType != null ? judgementType : JudgementType.ACCEPTED;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f11594f = LazyKt__LazyJVMKt.lazy(Judgement$JudgementType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        JudgementType(String str) {
            this.f11595c = str;
        }

        /* renamed from: a */
        public final String mo11985a() {
            return this.f11595c;
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.Judgement$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11597a = new int[JudgementType.values().length];

        static {
            f11597a[JudgementType.ACCEPTED.ordinal()] = 1;
            f11597a[JudgementType.RECTIFICATION_WITH_MESSAGE.ordinal()] = 2;
            f11597a[JudgementType.RECTIFICATION_WITH_DECISION.ordinal()] = 3;
            f11597a[JudgementType.DENIED.ordinal()] = 4;
            f11597a[JudgementType.ACCEPTED_WITH_MODIFICATION.ordinal()] = 5;
        }
    }

    public Judgement(int i, JudgementType judgementType, String str, String str2, String str3) {
        int i2;
        Intrinsics.checkParameterIsNotNull(judgementType, "judgementType");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.f11588i = i;
        this.f11589j = judgementType;
        this.f11590k = str;
        this.f11591l = str2;
        this.f11592m = str3;
        int i3 = WhenMappings.f11597a[this.f11589j.ordinal()];
        if (i3 == 1) {
            i2 = C4014R.string.decision_accepted;
        } else if (i3 == 2) {
            i2 = C4014R.string.decision_rectification_with_message;
        } else if (i3 == 3) {
            i2 = C4014R.string.decision_rectification_with_decision;
        } else if (i3 == 4) {
            i2 = C4014R.string.decision_denied;
        } else if (i3 == 5) {
            i2 = C4014R.string.decision_accepted_with_modification;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f11587h = i2;
    }

    public static /* synthetic */ Judgement copy$default(Judgement judgement, int i, JudgementType judgementType, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = judgement.f11588i;
        }
        if ((i2 & 2) != 0) {
            judgementType = judgement.f11589j;
        }
        JudgementType judgementType2 = judgementType;
        if ((i2 & 4) != 0) {
            str = judgement.f11590k;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = judgement.f11591l;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = judgement.f11592m;
        }
        return judgement.mo11973a(i, judgementType2, str4, str5, str3);
    }

    /* renamed from: a */
    public final Judgement mo11973a(int i, JudgementType judgementType, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(judgementType, "judgementType");
        Intrinsics.checkParameterIsNotNull(str, "shortName");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        Judgement judgement = new Judgement(i, judgementType, str, str2, str3);
        return judgement;
    }

    /* renamed from: d */
    public final int mo11974d() {
        return this.f11587h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo11976e() {
        return this.f11586g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Judgement) {
                Judgement judgement = (Judgement) obj;
                if (!(this.f11588i == judgement.f11588i) || !Intrinsics.areEqual((Object) this.f11589j, (Object) judgement.f11589j) || !Intrinsics.areEqual((Object) this.f11590k, (Object) judgement.f11590k) || !Intrinsics.areEqual((Object) this.f11591l, (Object) judgement.f11591l) || !Intrinsics.areEqual((Object) this.f11592m, (Object) judgement.f11592m)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final JudgementType mo11978f() {
        return this.f11589j;
    }

    /* renamed from: g */
    public final boolean mo11979g() {
        return this.f11585f;
    }

    public int hashCode() {
        int i = this.f11588i * 31;
        JudgementType judgementType = this.f11589j;
        int i2 = 0;
        int hashCode = (i + (judgementType != null ? judgementType.hashCode() : 0)) * 31;
        String str = this.f11590k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11591l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11592m;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Judgement(id=");
        a.append(this.f11588i);
        a.append(", judgementType=");
        a.append(this.f11589j);
        a.append(", shortName=");
        a.append(this.f11590k);
        a.append(", name=");
        a.append(this.f11591l);
        a.append(", description=");
        return C0082a.m106a(a, this.f11592m, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11588i);
        parcel.writeString(this.f11589j.name());
        parcel.writeString(this.f11590k);
        parcel.writeString(this.f11591l);
        parcel.writeString(this.f11592m);
    }
}
