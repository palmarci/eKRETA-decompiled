package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "", "id", "", "temporaryFileId", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemporaryFileId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: FileDto.kt */
public final class FileDto {
    @c("azonosito")
    public final Integer id;
    @c("ideiglenesFajlAzonosito")
    public final String temporaryFileId;

    public FileDto(Integer num, String str) {
        this.id = num;
        this.temporaryFileId = str;
    }

    public static /* synthetic */ FileDto copy$default(FileDto fileDto, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = fileDto.id;
        }
        if ((i2 & 2) != 0) {
            str = fileDto.temporaryFileId;
        }
        return fileDto.copy(num, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.temporaryFileId;
    }

    public final FileDto copy(Integer num, String str) {
        return new FileDto(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDto)) {
            return false;
        }
        FileDto fileDto = (FileDto) obj;
        return Intrinsics.areEqual((Object) this.id, (Object) fileDto.id) && Intrinsics.areEqual((Object) this.temporaryFileId, (Object) fileDto.temporaryFileId);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getTemporaryFileId() {
        return this.temporaryFileId;
    }

    public int hashCode() {
        Integer num = this.id;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.temporaryFileId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("FileDto(id=");
        a2.append(this.id);
        a2.append(", temporaryFileId=");
        return a.a(a2, this.temporaryFileId, ")");
    }
}
