package p289hu.ekreta.ellenorzo.util.powersaver;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverManagerAppDetails;", "", "packageName", "", "className", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPackageName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toIntent", "Landroid/content/Intent;", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails */
/* compiled from: PowerSaverManagerAppDetails.kt */
public final class PowerSaverManagerAppDetails {
    public final String className;
    public final String packageName;

    public PowerSaverManagerAppDetails(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        Intrinsics.checkParameterIsNotNull(str2, "className");
        this.packageName = str;
        this.className = str2;
    }

    public static /* synthetic */ PowerSaverManagerAppDetails copy$default(PowerSaverManagerAppDetails powerSaverManagerAppDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = powerSaverManagerAppDetails.packageName;
        }
        if ((i & 2) != 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.className, (java.lang.Object) r3.className) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails r3 = (p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails) r3
            java.lang.String r0 = r2.packageName
            java.lang.String r1 = r3.packageName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.className
            java.lang.String r3 = r3.className
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails.equals(java.lang.Object):boolean");
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        String str = this.packageName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.className;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final Intent toIntent() {
        Intent component = new Intent().setComponent(new ComponentName(this.packageName, this.className));
        Intrinsics.checkExpressionValueIsNotNull(component, "Intent().setComponent(Co…(packageName, className))");
        return component;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("PowerSaverManagerAppDetails(packageName=");
        a.append(this.packageName);
        a.append(", className=");
        return C0082a.m106a(a, this.className, ")");
    }
}
