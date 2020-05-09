package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/PostStateDto;", "", "id", "", "code", "", "shortName", "name", "description", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "()I", "getName", "getShortName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.PostStateDto */
/* compiled from: PostStateDto.kt */
public final class PostStateDto {
    @C2580c("kod")
    public final String code;
    @C2580c("leiras")
    public final String description;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14695id;
    @C2580c("nev")
    public final String name;
    @C2580c("rovidNev")
    public final String shortName;

    public PostStateDto() {
        this(0, null, null, null, null, 31, null);
    }

    public PostStateDto(int i, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        this.f14695id = i;
        this.code = str;
        this.shortName = str2;
        this.name = str3;
        this.description = str4;
    }

    public static /* synthetic */ PostStateDto copy$default(PostStateDto postStateDto, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = postStateDto.f14695id;
        }
        if ((i2 & 2) != 0) {
            str = postStateDto.code;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = postStateDto.shortName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = postStateDto.name;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = postStateDto.description;
        }
        return postStateDto.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f14695id;
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

    public final PostStateDto copy(int i, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        Intrinsics.checkParameterIsNotNull(str2, "shortName");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "description");
        PostStateDto postStateDto = new PostStateDto(i, str, str2, str3, str4);
        return postStateDto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostStateDto) {
                PostStateDto postStateDto = (PostStateDto) obj;
                if (!(this.f14695id == postStateDto.f14695id) || !Intrinsics.areEqual((Object) this.code, (Object) postStateDto.code) || !Intrinsics.areEqual((Object) this.shortName, (Object) postStateDto.shortName) || !Intrinsics.areEqual((Object) this.name, (Object) postStateDto.name) || !Intrinsics.areEqual((Object) this.description, (Object) postStateDto.description)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f14695id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int i = this.f14695id * 31;
        String str = this.code;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("PostStateDto(id=");
        a.append(this.f14695id);
        a.append(", code=");
        a.append(this.code);
        a.append(", shortName=");
        a.append(this.shortName);
        a.append(", name=");
        a.append(this.name);
        a.append(", description=");
        return C0082a.m106a(a, this.description, ")");
    }

    public /* synthetic */ PostStateDto(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        String str5 = "";
        String str6 = (i2 & 2) != 0 ? str5 : str;
        String str7 = (i2 & 4) != 0 ? str5 : str2;
        String str8 = (i2 & 8) != 0 ? str5 : str3;
        if ((i2 & 16) == 0) {
            str5 = str4;
        }
        this(i, str6, str7, str8, str5);
    }
}
