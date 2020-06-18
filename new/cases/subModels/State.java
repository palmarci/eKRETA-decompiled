package hu.ekreta.ellenorzo.cases.subModels;

import a.b.a.a.a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State;", "Landroid/os/Parcelable;", "id", "", "code", "", "shortName", "stateType", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "description", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()I", "getShortName", "getStateType", "()Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "StateType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: State.kt */
public final class State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final int c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final StateType f5204g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5205h;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new State(parcel.readInt(), parcel.readString(), parcel.readString(), (StateType) Enum.valueOf(StateType.class, parcel.readString()), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new State[i2];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "", "stateCode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStateCode", "()Ljava/lang/String;", "NEW", "IN_PROGRESS", "NEEDS_CORRECTION", "DONE", "CLOSED", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: State.kt */
    public enum StateType {
        NEW("UJ"),
        IN_PROGRESS("FOLYAMATBAN"),
        NEEDS_CORRECTION("HIANYPOTLAS"),
        DONE("KESZ"),
        CLOSED("LEZART");
        
        public static final Companion Companion = null;
        public static final Lazy f = null;
        public final String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModels/State$StateType$Companion;", "", "()V", "map", "", "", "Lhu/ekreta/ellenorzo/cases/subModels/State$StateType;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "parse", "stateName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: State.kt */
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ KProperty[] f5206a = null;

            static {
                f5206a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "map", "getMap()Ljava/util/Map;"))};
            }

            public Companion() {
            }

            public final StateType a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "stateName");
                Lazy access$getMap$cp = StateType.f;
                Companion companion = StateType.Companion;
                KProperty kProperty = f5206a[0];
                StateType stateType = (StateType) ((Map) access$getMap$cp.getValue()).get(str);
                return stateType != null ? stateType : StateType.IN_PROGRESS;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            f = LazyKt__LazyJVMKt.lazy(State$StateType$Companion$map$2.INSTANCE);
        }

        /* access modifiers changed from: public */
        StateType(String str) {
            this.c = str;
        }

        public final String a() {
            return this.c;
        }
    }

    public State(int i2, String str, String str2, StateType stateType, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(stateType, "stateType");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        this.c = i2;
        this.e = str;
        this.f = str2;
        this.f5204g = stateType;
        this.f5205h = str3;
    }

    public static /* synthetic */ State copy$default(State state, int i2, String str, String str2, StateType stateType, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = state.c;
        }
        if ((i3 & 2) != 0) {
            str = state.e;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = state.f;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            stateType = state.f5204g;
        }
        StateType stateType2 = stateType;
        if ((i3 & 16) != 0) {
            str3 = state.f5205h;
        }
        return state.a(i2, str4, str5, stateType2, str3);
    }

    public final State a(int i2, String str, String str2, StateType stateType, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(stateType, "stateType");
        Intrinsics.checkParameterIsNotNull(str3, "description");
        return new State(i2, str, str2, stateType, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof State) {
                State state = (State) obj;
                if (!(this.c == state.c) || !Intrinsics.areEqual((Object) this.e, (Object) state.e) || !Intrinsics.areEqual((Object) this.f, (Object) state.f) || !Intrinsics.areEqual((Object) this.f5204g, (Object) state.f5204g) || !Intrinsics.areEqual((Object) this.f5205h, (Object) state.f5205h)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.c * 31;
        String str = this.e;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        StateType stateType = this.f5204g;
        int hashCode3 = (hashCode2 + (stateType != null ? stateType.hashCode() : 0)) * 31;
        String str3 = this.f5205h;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode3 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("State(id=");
        a2.append(this.c);
        a2.append(", code=");
        a2.append(this.e);
        a2.append(", shortName=");
        a2.append(this.f);
        a2.append(", stateType=");
        a2.append(this.f5204g);
        a2.append(", description=");
        return a.a(a2, this.f5205h, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5204g.name());
        parcel.writeString(this.f5205h);
    }
}
