package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "", "id", "", "code", "", "shortName", "name", "description", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto */
/* compiled from: AddresseeTypeDto.kt */
public final class AddresseeTypeDto {
    @C2580c("kod")
    public final String code;
    @C2580c("leiras")
    public final String description;
    @C2580c("azonosito")

    /* renamed from: id */
    public final Long f14681id;
    @C2580c("nev")
    public final String name;
    @C2580c("rovidNev")
    public final String shortName;

    public AddresseeTypeDto(Long l, String str, String str2, String str3, String str4) {
        this.f14681id = l;
        this.code = str;
        this.shortName = str2;
        this.name = str3;
        this.description = str4;
    }

    public static /* synthetic */ AddresseeTypeDto copy$default(AddresseeTypeDto addresseeTypeDto, Long l, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addresseeTypeDto.f14681id;
        }
        if ((i & 2) != 0) {
            str = addresseeTypeDto.code;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = addresseeTypeDto.shortName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = addresseeTypeDto.name;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = addresseeTypeDto.description;
        }
        return addresseeTypeDto.copy(l, str5, str6, str7, str4);
    }

    public final Long component1() {
        return this.f14681id;
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

    public final AddresseeTypeDto copy(Long l, String str, String str2, String str3, String str4) {
        AddresseeTypeDto addresseeTypeDto = new AddresseeTypeDto(l, str, str2, str3, str4);
        return addresseeTypeDto;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.description, (java.lang.Object) r3.description) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto
            if (r0 == 0) goto L_0x003b
            hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto) r3
            java.lang.Long r0 = r2.f14681id
            java.lang.Long r1 = r3.f14681id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.shortName
            java.lang.String r1 = r3.shortName
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.description
            java.lang.String r3 = r3.description
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.f14681id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        Long l = this.f14681id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.shortName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AddresseeTypeDto(id=");
        a.append(this.f14681id);
        a.append(", code=");
        a.append(this.code);
        a.append(", shortName=");
        a.append(this.shortName);
        a.append(", name=");
        a.append(this.name);
        a.append(", description=");
        return C0082a.m106a(a, this.description, ")");
    }
}
