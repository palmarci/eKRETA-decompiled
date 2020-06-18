package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "", "id", "", "code", "", "shortName", "name", "description", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeTypeDto.kt */
public final class AddresseeTypeDto {
    @c("kod")
    public final String code;
    @c("leiras")
    public final String description;
    @c("azonosito")
    public final Long id;
    @c("nev")
    public final String name;
    @c("rovidNev")
    public final String shortName;

    public AddresseeTypeDto(Long l2, String str, String str2, String str3, String str4) {
        this.id = l2;
        this.code = str;
        this.shortName = str2;
        this.name = str3;
        this.description = str4;
    }

    public static /* synthetic */ AddresseeTypeDto copy$default(AddresseeTypeDto addresseeTypeDto, Long l2, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = addresseeTypeDto.id;
        }
        if ((i2 & 2) != 0) {
            str = addresseeTypeDto.code;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = addresseeTypeDto.shortName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = addresseeTypeDto.name;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = addresseeTypeDto.description;
        }
        return addresseeTypeDto.copy(l2, str5, str6, str7, str4);
    }

    public final Long component1() {
        return this.id;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.shortName;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final AddresseeTypeDto copy(Long l2, String str, String str2, String str3, String str4) {
        return new AddresseeTypeDto(l2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddresseeTypeDto)) {
            return false;
        }
        AddresseeTypeDto addresseeTypeDto = (AddresseeTypeDto) obj;
        return Intrinsics.areEqual((Object) this.id, (Object) addresseeTypeDto.id) && Intrinsics.areEqual((Object) this.code, (Object) addresseeTypeDto.code) && Intrinsics.areEqual((Object) this.shortName, (Object) addresseeTypeDto.shortName) && Intrinsics.areEqual((Object) this.name, (Object) addresseeTypeDto.name) && Intrinsics.areEqual((Object) this.description, (Object) addresseeTypeDto.description);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        Long l2 = this.id;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.shortName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("AddresseeTypeDto(id=");
        a2.append(this.id);
        a2.append(", code=");
        a2.append(this.code);
        a2.append(", shortName=");
        a2.append(this.shortName);
        a2.append(", name=");
        a2.append(this.name);
        a2.append(", description=");
        return a.a(a2, this.description, ")");
    }
}
