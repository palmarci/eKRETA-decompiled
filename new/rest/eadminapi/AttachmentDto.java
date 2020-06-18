package hu.ekreta.ellenorzo.rest.eadminapi;

import a.b.a.a.a;
import a.h.c.z.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "", "id", "", "fileName", "", "temporaryId", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "(ILjava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;)V", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getTemporaryId", "()Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "TemporaryId", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AttachmentDto.kt */
public final class AttachmentDto {
    @c("fajlNev")
    public final String fileName;
    @c("azonosito")
    public final int id;
    @c("fajl")
    public final TemporaryId temporaryId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "", "id", "", "fileHandler", "", "temporaryServerUid", "path", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileHandler", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPath", "getTemporaryServerUid", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AttachmentDto.kt */
    public static final class TemporaryId {
        @c("fileHandler")
        public final String fileHandler;
        @c("azonosito")
        public final Integer id;
        @c("utvonal")
        public final String path;
        @c("ideiglenesFajlAzonosito")
        public final String temporaryServerUid;

        public TemporaryId() {
            this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public TemporaryId(Integer num, String str, String str2, String str3) {
            this.id = num;
            this.fileHandler = str;
            this.temporaryServerUid = str2;
            this.path = str3;
        }

        public static /* synthetic */ TemporaryId copy$default(TemporaryId temporaryId, Integer num, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = temporaryId.id;
            }
            if ((i2 & 2) != 0) {
                str = temporaryId.fileHandler;
            }
            if ((i2 & 4) != 0) {
                str2 = temporaryId.temporaryServerUid;
            }
            if ((i2 & 8) != 0) {
                str3 = temporaryId.path;
            }
            return temporaryId.copy(num, str, str2, str3);
        }

        public final Integer component1() {
            return this.id;
        }

        public final String component2() {
            return this.fileHandler;
        }

        public final String component3() {
            return this.temporaryServerUid;
        }

        public final String component4() {
            return this.path;
        }

        public final TemporaryId copy(Integer num, String str, String str2, String str3) {
            return new TemporaryId(num, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemporaryId)) {
                return false;
            }
            TemporaryId temporaryId = (TemporaryId) obj;
            return Intrinsics.areEqual((Object) this.id, (Object) temporaryId.id) && Intrinsics.areEqual((Object) this.fileHandler, (Object) temporaryId.fileHandler) && Intrinsics.areEqual((Object) this.temporaryServerUid, (Object) temporaryId.temporaryServerUid) && Intrinsics.areEqual((Object) this.path, (Object) temporaryId.path);
        }

        public final String getFileHandler() {
            return this.fileHandler;
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getTemporaryServerUid() {
            return this.temporaryServerUid;
        }

        public int hashCode() {
            Integer num = this.id;
            int i2 = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.fileHandler;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.temporaryServerUid;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.path;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            StringBuilder a2 = a.a("TemporaryId(id=");
            a2.append(this.id);
            a2.append(", fileHandler=");
            a2.append(this.fileHandler);
            a2.append(", temporaryServerUid=");
            a2.append(this.temporaryServerUid);
            a2.append(", path=");
            return a.a(a2, this.path, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TemporaryId(Integer num, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }
    }

    public AttachmentDto(int i2, String str, TemporaryId temporaryId2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.id = i2;
        this.fileName = str;
        this.temporaryId = temporaryId2;
    }

    public static /* synthetic */ AttachmentDto copy$default(AttachmentDto attachmentDto, int i2, String str, TemporaryId temporaryId2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = attachmentDto.id;
        }
        if ((i3 & 2) != 0) {
            str = attachmentDto.fileName;
        }
        if ((i3 & 4) != 0) {
            temporaryId2 = attachmentDto.temporaryId;
        }
        return attachmentDto.copy(i2, str, temporaryId2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final TemporaryId component3() {
        return this.temporaryId;
    }

    public final AttachmentDto copy(int i2, String str, TemporaryId temporaryId2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        return new AttachmentDto(i2, str, temporaryId2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AttachmentDto) {
                AttachmentDto attachmentDto = (AttachmentDto) obj;
                if (!(this.id == attachmentDto.id) || !Intrinsics.areEqual((Object) this.fileName, (Object) attachmentDto.fileName) || !Intrinsics.areEqual((Object) this.temporaryId, (Object) attachmentDto.temporaryId)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getId() {
        return this.id;
    }

    public final TemporaryId getTemporaryId() {
        return this.temporaryId;
    }

    public int hashCode() {
        int i2 = this.id * 31;
        String str = this.fileName;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        TemporaryId temporaryId2 = this.temporaryId;
        if (temporaryId2 != null) {
            i3 = temporaryId2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("AttachmentDto(id=");
        a2.append(this.id);
        a2.append(", fileName=");
        a2.append(this.fileName);
        a2.append(", temporaryId=");
        a2.append(this.temporaryId);
        a2.append(")");
        return a2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentDto(int i2, String str, TemporaryId temporaryId2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, (i3 & 4) != 0 ? null : temporaryId2);
    }
}
