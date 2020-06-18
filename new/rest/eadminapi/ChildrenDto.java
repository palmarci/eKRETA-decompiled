package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/ChildrenDto;", "", "firstName", "", "lastName", "educationId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getEducationId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ChildrenDto.kt */
public final class ChildrenDto {
    @c("oktatasiAzonosito")
    public final long educationId;
    @c("vezetekNev")
    public final String firstName;
    @c("keresztNev")
    public final String lastName;

    public ChildrenDto(String str, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        this.firstName = str;
        this.lastName = str2;
        this.educationId = j2;
    }

    public static /* synthetic */ ChildrenDto copy$default(ChildrenDto childrenDto, String str, String str2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = childrenDto.firstName;
        }
        if ((i2 & 2) != 0) {
            str2 = childrenDto.lastName;
        }
        if ((i2 & 4) != 0) {
            j2 = childrenDto.educationId;
        }
        return childrenDto.copy(str, str2, j2);
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

    public final ChildrenDto copy(String str, String str2, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "firstName");
        Intrinsics.checkParameterIsNotNull(str2, "lastName");
        return new ChildrenDto(str, str2, j2);
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
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lastName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j2 = this.educationId;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a2 = a.a("ChildrenDto(firstName=");
        a2.append(this.firstName);
        a2.append(", lastName=");
        a2.append(this.lastName);
        a2.append(", educationId=");
        a2.append(this.educationId);
        a2.append(")");
        return a2.toString();
    }
}
