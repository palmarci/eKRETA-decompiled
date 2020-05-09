package p289hu.ekreta.ellenorzo.configSettings;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p349io.ConstantsKt;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.powersaver.PowerSaverManagerAppDetails;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\u0010\u0014J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\rHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rHÆ\u0001J\u0013\u0010:\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0016¨\u0006>"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/configSettings/Configuration;", "", "privacyPolicyUrl", "", "privacyPolicyUpdateDate", "latestVersion", "", "minimumSupportedVersion", "androidMobileStoreUrl", "iosMobileStoreUrl", "androidMobileTeacherStoreUrl", "iosMobileTeacherStoreUrl", "blacklistPlatformByMobileBuildVersion", "", "mobileApiVersion", "appVersionCode", "", "appVersionName", "powerSaverManagerAppsByManufacturer", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverManagerAppDetails;", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IJLjava/lang/String;Ljava/util/List;)V", "getAndroidMobileStoreUrl", "()Ljava/lang/String;", "getAndroidMobileTeacherStoreUrl", "appUnsupported", "", "getAppUnsupported", "()Z", "getAppVersionCode", "()J", "getAppVersionName", "getBlacklistPlatformByMobileBuildVersion", "()Ljava/util/List;", "hasAppUpdate", "getHasAppUpdate", "getIosMobileStoreUrl", "getIosMobileTeacherStoreUrl", "getLatestVersion", "()I", "getMinimumSupportedVersion", "getMobileApiVersion", "getPowerSaverManagerAppsByManufacturer", "getPrivacyPolicyUpdateDate", "getPrivacyPolicyUrl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.Configuration */
/* compiled from: Configuration.kt */
public final class Configuration {

    /* renamed from: a */
    public final boolean f11880a;

    /* renamed from: b */
    public final boolean f11881b;

    /* renamed from: c */
    public final String f11882c;

    /* renamed from: d */
    public final String f11883d;

    /* renamed from: e */
    public final int f11884e;

    /* renamed from: f */
    public final int f11885f;

    /* renamed from: g */
    public final String f11886g;

    /* renamed from: h */
    public final String f11887h;

    /* renamed from: i */
    public final String f11888i;

    /* renamed from: j */
    public final String f11889j;

    /* renamed from: k */
    public final List<String> f11890k;

    /* renamed from: l */
    public final int f11891l;

    /* renamed from: m */
    public final long f11892m;

    /* renamed from: n */
    public final String f11893n;

    /* renamed from: o */
    public final List<PowerSaverManagerAppDetails> f11894o;

    public Configuration(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, List<String> list, int i3, long j, String str7, List<PowerSaverManagerAppDetails> list2) {
        Intrinsics.checkParameterIsNotNull(str, "privacyPolicyUrl");
        Intrinsics.checkParameterIsNotNull(str2, "privacyPolicyUpdateDate");
        Intrinsics.checkParameterIsNotNull(str3, "androidMobileStoreUrl");
        Intrinsics.checkParameterIsNotNull(str4, "iosMobileStoreUrl");
        Intrinsics.checkParameterIsNotNull(str5, "androidMobileTeacherStoreUrl");
        Intrinsics.checkParameterIsNotNull(str6, "iosMobileTeacherStoreUrl");
        Intrinsics.checkParameterIsNotNull(list, "blacklistPlatformByMobileBuildVersion");
        Intrinsics.checkParameterIsNotNull(str7, "appVersionName");
        Intrinsics.checkParameterIsNotNull(list2, "powerSaverManagerAppsByManufacturer");
        this.f11882c = str;
        this.f11883d = str2;
        this.f11884e = i;
        this.f11885f = i2;
        this.f11886g = str3;
        this.f11887h = str4;
        this.f11888i = str5;
        this.f11889j = str6;
        this.f11890k = list;
        this.f11891l = i3;
        this.f11892m = j;
        this.f11893n = str7;
        this.f11894o = list2;
        boolean z = false;
        this.f11880a = this.f11885f > this.f11891l || this.f11890k.contains(String.valueOf(this.f11892m));
        if (this.f11884e > this.f11891l) {
            z = true;
        }
        this.f11881b = z;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, List list, int i3, long j, String str7, List list2, int i4, Object obj) {
        Configuration configuration2 = configuration;
        int i5 = i4;
        return configuration.mo12308a((i5 & 1) != 0 ? configuration2.f11882c : str, (i5 & 2) != 0 ? configuration2.f11883d : str2, (i5 & 4) != 0 ? configuration2.f11884e : i, (i5 & 8) != 0 ? configuration2.f11885f : i2, (i5 & 16) != 0 ? configuration2.f11886g : str3, (i5 & 32) != 0 ? configuration2.f11887h : str4, (i5 & 64) != 0 ? configuration2.f11888i : str5, (i5 & 128) != 0 ? configuration2.f11889j : str6, (i5 & 256) != 0 ? configuration2.f11890k : list, (i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? configuration2.f11891l : i3, (i5 & 1024) != 0 ? configuration2.f11892m : j, (i5 & 2048) != 0 ? configuration2.f11893n : str7, (i5 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? configuration2.f11894o : list2);
    }

    /* renamed from: a */
    public final Configuration mo12308a(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, List<String> list, int i3, long j, String str7, List<PowerSaverManagerAppDetails> list2) {
        String str8 = str;
        Intrinsics.checkParameterIsNotNull(str8, "privacyPolicyUrl");
        String str9 = str2;
        Intrinsics.checkParameterIsNotNull(str9, "privacyPolicyUpdateDate");
        String str10 = str3;
        Intrinsics.checkParameterIsNotNull(str10, "androidMobileStoreUrl");
        String str11 = str4;
        Intrinsics.checkParameterIsNotNull(str11, "iosMobileStoreUrl");
        String str12 = str5;
        Intrinsics.checkParameterIsNotNull(str12, "androidMobileTeacherStoreUrl");
        String str13 = str6;
        Intrinsics.checkParameterIsNotNull(str13, "iosMobileTeacherStoreUrl");
        List<String> list3 = list;
        Intrinsics.checkParameterIsNotNull(list3, "blacklistPlatformByMobileBuildVersion");
        String str14 = str7;
        Intrinsics.checkParameterIsNotNull(str14, "appVersionName");
        List<PowerSaverManagerAppDetails> list4 = list2;
        Intrinsics.checkParameterIsNotNull(list4, "powerSaverManagerAppsByManufacturer");
        Configuration configuration = new Configuration(str8, str9, i, i2, str10, str11, str12, str13, list3, i3, j, str14, list4);
        return configuration;
    }

    /* renamed from: a */
    public final String mo12309a() {
        return this.f11886g;
    }

    /* renamed from: b */
    public final boolean mo12310b() {
        return this.f11880a;
    }

    /* renamed from: c */
    public final boolean mo12311c() {
        return this.f11881b;
    }

    /* renamed from: d */
    public final List<PowerSaverManagerAppDetails> mo12312d() {
        return this.f11894o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                if (Intrinsics.areEqual((Object) this.f11882c, (Object) configuration.f11882c) && Intrinsics.areEqual((Object) this.f11883d, (Object) configuration.f11883d)) {
                    if (this.f11884e == configuration.f11884e) {
                        if ((this.f11885f == configuration.f11885f) && Intrinsics.areEqual((Object) this.f11886g, (Object) configuration.f11886g) && Intrinsics.areEqual((Object) this.f11887h, (Object) configuration.f11887h) && Intrinsics.areEqual((Object) this.f11888i, (Object) configuration.f11888i) && Intrinsics.areEqual((Object) this.f11889j, (Object) configuration.f11889j) && Intrinsics.areEqual((Object) this.f11890k, (Object) configuration.f11890k)) {
                            if (this.f11891l == configuration.f11891l) {
                                if (!(this.f11892m == configuration.f11892m) || !Intrinsics.areEqual((Object) this.f11893n, (Object) configuration.f11893n) || !Intrinsics.areEqual((Object) this.f11894o, (Object) configuration.f11894o)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f11882c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11883d;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f11884e) * 31) + this.f11885f) * 31;
        String str3 = this.f11886g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11887h;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11888i;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f11889j;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.f11890k;
        int hashCode7 = (((hashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.f11891l) * 31;
        long j = this.f11892m;
        int i2 = (hashCode7 + ((int) (j ^ (j >>> 32)))) * 31;
        String str7 = this.f11893n;
        int hashCode8 = (i2 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<PowerSaverManagerAppDetails> list2 = this.f11894o;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Configuration(privacyPolicyUrl=");
        a.append(this.f11882c);
        a.append(", privacyPolicyUpdateDate=");
        a.append(this.f11883d);
        a.append(", latestVersion=");
        a.append(this.f11884e);
        a.append(", minimumSupportedVersion=");
        a.append(this.f11885f);
        a.append(", androidMobileStoreUrl=");
        a.append(this.f11886g);
        a.append(", iosMobileStoreUrl=");
        a.append(this.f11887h);
        a.append(", androidMobileTeacherStoreUrl=");
        a.append(this.f11888i);
        a.append(", iosMobileTeacherStoreUrl=");
        a.append(this.f11889j);
        a.append(", blacklistPlatformByMobileBuildVersion=");
        a.append(this.f11890k);
        a.append(", mobileApiVersion=");
        a.append(this.f11891l);
        a.append(", appVersionCode=");
        a.append(this.f11892m);
        a.append(", appVersionName=");
        a.append(this.f11893n);
        a.append(", powerSaverManagerAppsByManufacturer=");
        return C0082a.m108a(a, (List) this.f11894o, ")");
    }
}
