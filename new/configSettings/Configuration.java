package hu.ekreta.ellenorzo.configSettings;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003JQ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\nHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u0006)"}, d2 = {"Lhu/ekreta/ellenorzo/configSettings/Configuration;", "", "latestApiVersion", "", "minimumApiVersion", "blacklist", "", "", "appVersionCode", "appVersionName", "", "powerSaverManagerAppsByManufacturer", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverManagerAppDetails;", "(IILjava/util/List;JLjava/lang/String;Ljava/util/List;)V", "getAppVersionCode", "()J", "getAppVersionName", "()Ljava/lang/String;", "getBlacklist", "()Ljava/util/List;", "existsNewerApplication", "", "getExistsNewerApplication", "()Z", "getLatestApiVersion", "()I", "getMinimumApiVersion", "getPowerSaverManagerAppsByManufacturer", "unsupportedApplication", "getUnsupportedApplication", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Configuration.kt */
public final class Configuration {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5293a;
    public final boolean b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5294d;
    public final List<Long> e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5295g;

    /* renamed from: h  reason: collision with root package name */
    public final List<PowerSaverManagerAppDetails> f5296h;

    public Configuration(int i2, int i3, List<Long> list, long j2, String str, List<PowerSaverManagerAppDetails> list2) {
        Intrinsics.checkParameterIsNotNull(list, "blacklist");
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        Intrinsics.checkParameterIsNotNull(list2, "powerSaverManagerAppsByManufacturer");
        this.c = i2;
        this.f5294d = i3;
        this.e = list;
        this.f = j2;
        this.f5295g = str;
        this.f5296h = list2;
        boolean z = false;
        this.f5293a = this.f5294d > 3 || this.e.contains(Long.valueOf(this.f));
        this.b = this.c > 3 ? true : z;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, int i2, int i3, List<Long> list, long j2, String str, List<PowerSaverManagerAppDetails> list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = configuration.c;
        }
        if ((i4 & 2) != 0) {
            i3 = configuration.f5294d;
        }
        int i5 = i3;
        if ((i4 & 4) != 0) {
            list = configuration.e;
        }
        List<Long> list3 = list;
        if ((i4 & 8) != 0) {
            j2 = configuration.f;
        }
        long j3 = j2;
        if ((i4 & 16) != 0) {
            str = configuration.f5295g;
        }
        String str2 = str;
        if ((i4 & 32) != 0) {
            list2 = configuration.f5296h;
        }
        return configuration.a(i2, i5, list3, j3, str2, list2);
    }

    public final Configuration a(int i2, int i3, List<Long> list, long j2, String str, List<PowerSaverManagerAppDetails> list2) {
        Intrinsics.checkParameterIsNotNull(list, "blacklist");
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        List<PowerSaverManagerAppDetails> list3 = list2;
        Intrinsics.checkParameterIsNotNull(list3, "powerSaverManagerAppsByManufacturer");
        return new Configuration(i2, i3, list, j2, str, list3);
    }

    public final boolean a() {
        return this.b;
    }

    public final List<PowerSaverManagerAppDetails> b() {
        return this.f5296h;
    }

    public final boolean c() {
        return this.f5293a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                if (this.c == configuration.c) {
                    if ((this.f5294d == configuration.f5294d) && Intrinsics.areEqual((Object) this.e, (Object) configuration.e)) {
                        if (!(this.f == configuration.f) || !Intrinsics.areEqual((Object) this.f5295g, (Object) configuration.f5295g) || !Intrinsics.areEqual((Object) this.f5296h, (Object) configuration.f5296h)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = ((this.c * 31) + this.f5294d) * 31;
        List<Long> list = this.e;
        int i3 = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        long j2 = this.f;
        int i4 = (((i2 + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f5295g;
        int hashCode2 = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        List<PowerSaverManagerAppDetails> list2 = this.f5296h;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode2 + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("Configuration(latestApiVersion=");
        a2.append(this.c);
        a2.append(", minimumApiVersion=");
        a2.append(this.f5294d);
        a2.append(", blacklist=");
        a2.append(this.e);
        a2.append(", appVersionCode=");
        a2.append(this.f);
        a2.append(", appVersionName=");
        a2.append(this.f5295g);
        a2.append(", powerSaverManagerAppsByManufacturer=");
        return a.a(a2, (List) this.f5296h, ")");
    }
}
