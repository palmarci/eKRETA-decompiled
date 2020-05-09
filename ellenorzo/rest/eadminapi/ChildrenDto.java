package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ChildrenDto;", "", "firstName", "", "lastName", "educationId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getEducationId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.ChildrenDto */
/* compiled from: ChildrenDto.kt */
public final class ChildrenDto {
    @C2580c("oktatasiAzonosito")
    public final long educationId;
    @C2580c("vezetekNev")
    public final String firstName;
    @C2580c("keresztNev")
    public final String lastName;

    public ChildrenDto(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        this.firstName = str;
        this.lastName = str2;
        this.educationId = j;
    }

    public static /* synthetic */ ChildrenDto copy$default(ChildrenDto childrenDto, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = childrenDto.firstName;
        }
        if ((i & 2) != 0) {
            str2 = childrenDto.lastName;
        }
        if ((i & 4) != 0) {
            j = childrenDto.educationId;
        }
        return childrenDto.copy(str, str2, j);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final long component3() {
        return this.educationId;
    }

    public final ChildrenDto copy(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        return new ChildrenDto(str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChildrenDto) {
                ChildrenDto childrenDto = (ChildrenDto) obj;
                if (Intrinsics.areEqual((Object) this.firstName, (Object) childrenDto.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) childrenDto.lastName)) {
                    if (this.educationId == childrenDto.educationId) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getEducationId() {
        return this.educationId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lastName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.educationId;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("ChildrenDto(firstName=");
        a.append(this.firstName);
        a.append(", lastName=");
        a.append(this.lastName);
        a.append(", educationId=");
        a.append(this.educationId);
        a.append(")");
        return a.toString();
    }
}
