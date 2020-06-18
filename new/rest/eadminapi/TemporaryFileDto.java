package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/TemporaryFileDto;", "", "fileId", "", "path", "fileLength", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFileId", "()Ljava/lang/String;", "getFileLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPath", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lhu/ekreta/ellenorzo/rest/eadminapi/TemporaryFileDto;", "equals", "", "other", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TemporaryFileDto.kt */
public final class TemporaryFileDto {
    @c("fajlAzonosito")
    public final String fileId;
    @c("fajlMeretByteLength")
    public final Long fileLength;
    @c("utvonal")
    public final String path;

    public TemporaryFileDto(String str, String str2, Long l2) {
        this.fileId = str;
        this.path = str2;
        this.fileLength = l2;
    }

    public static /* synthetic */ TemporaryFileDto copy$default(TemporaryFileDto temporaryFileDto, String str, String str2, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = temporaryFileDto.fileId;
        }
        if ((i2 & 2) != 0) {
            str2 = temporaryFileDto.path;
        }
        if ((i2 & 4) != 0) {
            l2 = temporaryFileDto.fileLength;
        }
        return temporaryFileDto.copy(str, str2, l2);
    }

    public final String component1() {
        return this.fileId;
    }

    public final String component2() {
        return this.path;
    }

    public final Long component3() {
        return this.fileLength;
    }

    public final TemporaryFileDto copy(String str, String str2, Long l2) {
        return new TemporaryFileDto(str, str2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemporaryFileDto)) {
            return false;
        }
        TemporaryFileDto temporaryFileDto = (TemporaryFileDto) obj;
        return Intrinsics.areEqual((Object) this.fileId, (Object) temporaryFileDto.fileId) && Intrinsics.areEqual((Object) this.path, (Object) temporaryFileDto.path) && Intrinsics.areEqual((Object) this.fileLength, (Object) temporaryFileDto.fileLength);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final Long getFileLength() {
        return this.fileLength;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.fileId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.path;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.fileLength;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("TemporaryFileDto(fileId=");
        a2.append(this.fileId);
        a2.append(", path=");
        a2.append(this.path);
        a2.append(", fileLength=");
        a2.append(this.fileLength);
        a2.append(")");
        return a2.toString();
    }
}
