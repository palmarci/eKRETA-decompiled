package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AdministratorDto;", "", "id", "", "userName", "", "shortName", "title", "userId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getShortName", "()Ljava/lang/String;", "getTitle", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AdministratorDto.kt */
public final class AdministratorDto {
    @c("azonosito")
    public final int id;
    @c("nev")
    public final String shortName;
    @c("titulus")
    public final String title;
    @c("kretaFelhasznaloAzonosito")
    public final int userId;
    @c("felhasznaloNev")
    public final String userName;

    public AdministratorDto() {
        this(0, (String) null, (String) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    public AdministratorDto(int i2, String str, String str2, String str3, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        this.id = i2;
        this.userName = str;
        this.shortName = str2;
        this.title = str3;
        this.userId = i3;
    }

    public static /* synthetic */ AdministratorDto copy$default(AdministratorDto administratorDto, int i2, String str, String str2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = administratorDto.id;
        }
        if ((i4 & 2) != 0) {
            str = administratorDto.userName;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = administratorDto.shortName;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = administratorDto.title;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            i3 = administratorDto.userId;
        }
        return administratorDto.copy(i2, str4, str5, str6, i3);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.shortName;
    }

    public final String component4() {
        return this.title;
    }

    public final int component5() {
        return this.userId;
    }

    public final AdministratorDto copy(int i2, String str, String str2, String str3, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        return new AdministratorDto(i2, str, str2, str3, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdministratorDto) {
                AdministratorDto administratorDto = (AdministratorDto) obj;
                if ((this.id == administratorDto.id) && Intrinsics.areEqual((Object) this.userName, (Object) administratorDto.userName) && Intrinsics.areEqual((Object) this.shortName, (Object) administratorDto.shortName) && Intrinsics.areEqual((Object) this.title, (Object) administratorDto.title)) {
                    if (this.userId == administratorDto.userId) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getId() {
        return this.id;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int i2 = this.id * 31;
        String str = this.userName;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((hashCode2 + i3) * 31) + this.userId;
    }

    public String toString() {
        StringBuilder a2 = a.a("AdministratorDto(id=");
        a2.append(this.id);
        a2.append(", userName=");
        a2.append(this.userName);
        a2.append(", shortName=");
        a2.append(this.shortName);
        a2.append(", title=");
        a2.append(this.title);
        a2.append(", userId=");
        return a.a(a2, this.userId, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AdministratorDto(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = 0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0010
            r2 = r1
            goto L_0x0011
        L_0x0010:
            r2 = r6
        L_0x0011:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0017:
            r3 = r7
        L_0x0018:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r8
        L_0x001e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            r10 = 0
            goto L_0x0025
        L_0x0024:
            r10 = r9
        L_0x0025:
            r5 = r4
            r6 = r11
            r7 = r2
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.rest.eadminapi.AdministratorDto.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
