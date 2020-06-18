package hu.ekreta.ellenorzo.configSettings;

import a.b.a.a.a;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/configSettings/BuildVersionByPlatform;", "", "MobileBuildVersions", "", "Platform", "(Ljava/lang/String;Ljava/lang/String;)V", "getMobileBuildVersions", "()Ljava/lang/String;", "getPlatform", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: BuildVersionByPlatform.kt */
public final class BuildVersionByPlatform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Type c;

    /* renamed from: a  reason: collision with root package name */
    public final String f5292a;
    public final String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/configSettings/BuildVersionByPlatform$Companion;", "", "()V", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: BuildVersionByPlatform.kt */
    public static final class Companion {
        public Companion() {
        }

        public final Type a() {
            return BuildVersionByPlatform.c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Type b2 = new BuildVersionByPlatform$Companion$type$1().b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "object : TypeToken<List<…ionByPlatform>>() {}.type");
        c = b2;
    }

    public BuildVersionByPlatform(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "MobileBuildVersions");
        Intrinsics.checkParameterIsNotNull(str2, "Platform");
        this.f5292a = str;
        this.b = str2;
    }

    public static /* synthetic */ BuildVersionByPlatform copy$default(BuildVersionByPlatform buildVersionByPlatform, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buildVersionByPlatform.f5292a;
        }
        if ((i2 & 2) != 0) {
            str2 = buildVersionByPlatform.b;
        }
        return buildVersionByPlatform.a(str, str2);
    }

    public final BuildVersionByPlatform a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "MobileBuildVersions");
        Intrinsics.checkParameterIsNotNull(str2, "Platform");
        return new BuildVersionByPlatform(str, str2);
    }

    public final String a() {
        return this.f5292a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildVersionByPlatform)) {
            return false;
        }
        BuildVersionByPlatform buildVersionByPlatform = (BuildVersionByPlatform) obj;
        return Intrinsics.areEqual((Object) this.f5292a, (Object) buildVersionByPlatform.f5292a) && Intrinsics.areEqual((Object) this.b, (Object) buildVersionByPlatform.b);
    }

    public int hashCode() {
        String str = this.f5292a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("BuildVersionByPlatform(MobileBuildVersions=");
        a2.append(this.f5292a);
        a2.append(", Platform=");
        return a.a(a2, this.b, ")");
    }
}
