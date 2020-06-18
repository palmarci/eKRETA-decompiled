package hu.ekreta.ellenorzo.util.powersaver;

import a.b.a.a.a;
import android.content.ComponentName;
import android.content.Intent;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverManagerAppDetails;", "", "packageName", "", "className", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPackageName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toIntent", "Landroid/content/Intent;", "toString", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: PowerSaverManagerAppDetails.kt */
public final class PowerSaverManagerAppDetails {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Type type;
    public final String className;
    public final String packageName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverManagerAppDetails$Companion;", "", "()V", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: PowerSaverManagerAppDetails.kt */
    public static final class Companion {
        public Companion() {
        }

        public final Type a() {
            return PowerSaverManagerAppDetails.type;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Type b = new PowerSaverManagerAppDetails$Companion$type$1().b();
        Intrinsics.checkExpressionValueIsNotNull(b, "object : TypeToken<List<…gerAppDetails>>() {}.type");
        type = b;
    }

    public PowerSaverManagerAppDetails(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        Intrinsics.checkParameterIsNotNull(str2, "className");
        this.packageName = str;
        this.className = str2;
    }

    public static /* synthetic */ PowerSaverManagerAppDetails copy$default(PowerSaverManagerAppDetails powerSaverManagerAppDetails, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = powerSaverManagerAppDetails.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = powerSaverManagerAppDetails.className;
        }
        return powerSaverManagerAppDetails.copy(str, str2);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.className;
    }

    public final PowerSaverManagerAppDetails copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        Intrinsics.checkParameterIsNotNull(str2, "className");
        return new PowerSaverManagerAppDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PowerSaverManagerAppDetails)) {
            return false;
        }
        PowerSaverManagerAppDetails powerSaverManagerAppDetails = (PowerSaverManagerAppDetails) obj;
        return Intrinsics.areEqual((Object) this.packageName, (Object) powerSaverManagerAppDetails.packageName) && Intrinsics.areEqual((Object) this.className, (Object) powerSaverManagerAppDetails.className);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.packageName;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.className;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final Intent toIntent() {
        Intent component = new Intent().setComponent(new ComponentName(this.packageName, this.className));
        Intrinsics.checkExpressionValueIsNotNull(component, "Intent().setComponent(Co…(packageName, className))");
        return component;
    }

    public String toString() {
        StringBuilder a2 = a.a("PowerSaverManagerAppDetails(packageName=");
        a2.append(this.packageName);
        a2.append(", className=");
        return a.a(a2, this.className, ")");
    }
}
