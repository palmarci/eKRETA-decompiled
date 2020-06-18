package hu.ekreta.ellenorzo.rest.globalmobile;

import a.h.c.z.c;
import java.text.Collator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "", "instituteCode", "", "name", "url", "city", "advertisingUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertisingUrl", "()Ljava/lang/String;", "getCity", "getInstituteCode", "getName", "getUrl", "compareTo", "", "other", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstituteDto.kt */
public final class InstituteDto implements Comparable<InstituteDto> {
    @c("advertisingUrl")
    public final String advertisingUrl;
    @c("city")
    public final String city;
    @c("instituteCode")
    public final String instituteCode;
    @c("name")
    public final String name;
    @c("url")
    public final String url;

    public InstituteDto(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "city");
        Intrinsics.checkParameterIsNotNull(str5, "advertisingUrl");
        this.instituteCode = str;
        this.name = str2;
        this.url = str3;
        this.city = str4;
        this.advertisingUrl = str5;
    }

    public static /* synthetic */ InstituteDto copy$default(InstituteDto instituteDto, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = instituteDto.instituteCode;
        }
        if ((i2 & 2) != 0) {
            str2 = instituteDto.name;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = instituteDto.url;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = instituteDto.city;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = instituteDto.advertisingUrl;
        }
        return instituteDto.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.instituteCode;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.advertisingUrl;
    }

    public final InstituteDto copy(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "url");
        Intrinsics.checkParameterIsNotNull(str4, "city");
        Intrinsics.checkParameterIsNotNull(str5, "advertisingUrl");
        return new InstituteDto(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstituteDto)) {
            return false;
        }
        InstituteDto instituteDto = (InstituteDto) obj;
        return Intrinsics.areEqual((Object) this.instituteCode, (Object) instituteDto.instituteCode) && Intrinsics.areEqual((Object) this.name, (Object) instituteDto.name) && Intrinsics.areEqual((Object) this.url, (Object) instituteDto.url) && Intrinsics.areEqual((Object) this.city, (Object) instituteDto.city) && Intrinsics.areEqual((Object) this.advertisingUrl, (Object) instituteDto.advertisingUrl);
    }

    public final String getAdvertisingUrl() {
        return this.advertisingUrl;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getInstituteCode() {
        return this.instituteCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.instituteCode;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.city;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.advertisingUrl;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return this.name + ' ' + this.city + ' ' + this.instituteCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstituteDto(String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? "" : str4, str5);
    }

    public int compareTo(InstituteDto instituteDto) {
        Intrinsics.checkParameterIsNotNull(instituteDto, "other");
        return Collator.getInstance(new Locale("hu")).compare(this.name, instituteDto.name);
    }
}
