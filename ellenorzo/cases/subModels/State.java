package p289hu.ekreta.ellenorzo.cases.subModels;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State;", "Landroid/os/Parcelable;", "id", "", "code", "", "shortName", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "description", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()I", "getShortName", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "StateType", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModels.State */
/* compiled from: State.kt */
public final class State implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11612c;

    /* renamed from: e */
    public final String f11613e;

    /* renamed from: f */
    public final String f11614f;

    /* renamed from: g */
    public final StateType f11615g;

    /* renamed from: h */
    public final String f11616h;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.State$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            State state = new State(parcel.readInt(), parcel.readString(), parcel.readString(), (StateType) Enum.valueOf(StateType.class, parcel.readString()), parcel.readString());
            return state;
        }

        public final Object[] newArray(int i) {
            return new State[i];
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "", "stateCode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStateCode", "()Ljava/lang/String;", "NEW", "IN_PROGRESS", "NEEDS_CORRECTION", "DONE", "CLOSED", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.cases.subModels.State$StateType */
    /* compiled from: State.kt */
    public enum StateType {
        NEW("UJ"),
        IN_PROGRESS("FOLYAMATBAN"),
        NEEDS_CORRECTION("HIANYPOTLAS"),
        DONE("KESZ"),
        CLOSED("LEZART");
        
        public static final Companion Companion = null;

        /* renamed from: f */
        public static final Lazy f11618f = null;

        /* renamed from: c */
        public final String f11619c;

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State$StateType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "stateName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.cases.subModels.State$StateType$Companion */
        /* compiled from: State.kt */
        public static final class Companion {

            /* renamed from: a */
            public static final /* synthetic */ KProperty[] f11620a = null;

            static {
                f11620a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            /* renamed from: a */
            public final StateType mo12022a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "stateName");
                Lazy access$getMap$cp = StateType.f11618f;
                Companion companion = StateType.Companion;
                KProperty kProperty = f11620a[0];
                StateType stateType = (StateType) ((Map) access$getMap$cp.getValue()).get(str);
                return stateType != null ? stateType : StateType.IN_PROGRESS;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion(null);
            f11618f = LazyKt__LazyJVMKt.lazy(State$StateType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        StateType(String str) {
            this.f11619c = str;
        }

        /* renamed from: a */
        public final String mo12021a() {
            return this.f11619c;
        }
    }

    public State(int i, String str, String str2, StateType stateType, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(stateType, "stateType");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.f11612c = i;
        this.f11613e = str;
        this.f11614f = str2;
        this.f11615g = stateType;
        this.f11616h = str3;
    }

    public static /* synthetic */ State copy$default(State state, int i, String str, String str2, StateType stateType, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = state.f11612c;
        }
        if ((i2 & 2) != 0) {
            str = state.f11613e;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = state.f11614f;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            stateType = state.f11615g;
        }
        StateType stateType2 = stateType;
        if ((i2 & 16) != 0) {
            str3 = state.f11616h;
        }
        return state.mo12013a(i, str4, str5, stateType2, str3);
    }

    /* renamed from: a */
    public final State mo12013a(int i, String str, String str2, StateType stateType, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(stateType, "stateType");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        State state = new State(i, str, str2, stateType, str3);
        return state;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof State) {
                State state = (State) obj;
                if (!(this.f11612c == state.f11612c) || !Intrinsics.areEqual((Object) this.f11613e, (Object) state.f11613e) || !Intrinsics.areEqual((Object) this.f11614f, (Object) state.f11614f) || !Intrinsics.areEqual((Object) this.f11615g, (Object) state.f11615g) || !Intrinsics.areEqual((Object) this.f11616h, (Object) state.f11616h)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f11612c * 31;
        String str = this.f11613e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11614f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        StateType stateType = this.f11615g;
        int hashCode3 = (hashCode2 + (stateType != null ? stateType.hashCode() : 0)) * 31;
        String str3 = this.f11616h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("State(id=");
        a.append(this.f11612c);
        a.append(", code=");
        a.append(this.f11613e);
        a.append(", shortName=");
        a.append(this.f11614f);
        a.append(", stateType=");
        a.append(this.f11615g);
        a.append(", description=");
        return C0082a.m106a(a, this.f11616h, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11612c);
        parcel.writeString(this.f11613e);
        parcel.writeString(this.f11614f);
        parcel.writeString(this.f11615g.name());
        parcel.writeString(this.f11616h);
    }
}
