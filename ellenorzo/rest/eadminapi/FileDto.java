package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "", "id", "", "temporaryFileId", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemporaryFileId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lhu/ekreta/ellenorzo/rest/eadminapi/FileDto;", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.FileDto */
/* compiled from: FileDto.kt */
public final class FileDto {
    @C2580c("azonosito")

    /* renamed from: id */
    public final Integer f14690id;
    @C2580c("ideiglenesFajlAzonosito")
    public final String temporaryFileId;

    public FileDto(Integer num, String str) {
        this.f14690id = num;
        this.temporaryFileId = str;
    }

    public static /* synthetic */ FileDto copy$default(FileDto fileDto, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fileDto.f14690id;
        }
        if ((i & 2) != 0) {
            str = fileDto.temporaryFileId;
        }
        return fileDto.copy(num, str);
    }

    public final Integer component1() {
        return this.f14690id;
    }

    public final String component2() {
        return this.temporaryFileId;
    }

    public final FileDto copy(Integer num, String str) {
        return new FileDto(num, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.temporaryFileId, (java.lang.Object) r3.temporaryFileId) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.FileDto
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.rest.eadminapi.FileDto r3 = (p289hu.ekreta.ellenorzo.rest.eadminapi.FileDto) r3
            java.lang.Integer r0 = r2.f14690id
            java.lang.Integer r1 = r3.f14690id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.temporaryFileId
            java.lang.String r3 = r3.temporaryFileId
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.FileDto.equals(java.lang.Object):boolean");
    }

    public final Integer getId() {
        return this.f14690id;
    }

    public final String getTemporaryFileId() {
        return this.temporaryFileId;
    }

    public int hashCode() {
        Integer num = this.f14690id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.temporaryFileId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("FileDto(id=");
        a.append(this.f14690id);
        a.append(", temporaryFileId=");
        return C0082a.m106a(a, this.temporaryFileId, ")");
    }
}
