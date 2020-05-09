package p289hu.ekreta.ellenorzo.rest.eadminapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p159c.p166z.C2580c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "", "id", "", "fileName", "", "temporaryId", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "(ILjava/lang/String;Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;)V", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getTemporaryId", "()Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "TemporaryId", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto */
/* compiled from: AttachmentDto.kt */
public final class AttachmentDto {
    @C2580c("fajlNev")
    public final String fileName;
    @C2580c("azonosito")

    /* renamed from: id */
    public final int f14686id;
    @C2580c("fajl")
    public final TemporaryId temporaryId;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "", "temporaryServerUid", "", "(Ljava/lang/String;)V", "getTemporaryServerUid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto$TemporaryId */
    /* compiled from: AttachmentDto.kt */
    public static final class TemporaryId {
        @C2580c("ideiglenesFajlAzonosito")
        public final String temporaryServerUid;

        public TemporaryId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "temporaryServerUid");
            this.temporaryServerUid = str;
        }

        public static /* synthetic */ TemporaryId copy$default(TemporaryId temporaryId, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = temporaryId.temporaryServerUid;
            }
            return temporaryId.copy(str);
        }

        public final String component1() {
            return this.temporaryServerUid;
        }

        public final TemporaryId copy(String str) {
            Intrinsics.checkParameterIsNotNull(str, "temporaryServerUid");
            return new TemporaryId(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.temporaryServerUid, (java.lang.Object) ((p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto.TemporaryId) r2).temporaryServerUid) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto.TemporaryId
                if (r0 == 0) goto L_0x0013
                hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto$TemporaryId r2 = (p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto.TemporaryId) r2
                java.lang.String r0 = r1.temporaryServerUid
                java.lang.String r2 = r2.temporaryServerUid
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto.TemporaryId.equals(java.lang.Object):boolean");
        }

        public final String getTemporaryServerUid() {
            return this.temporaryServerUid;
        }

        public int hashCode() {
            String str = this.temporaryServerUid;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C0082a.m106a(C0082a.m111a("TemporaryId(temporaryServerUid="), this.temporaryServerUid, ")");
        }
    }

    public AttachmentDto(int i, String str, TemporaryId temporaryId2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        this.f14686id = i;
        this.fileName = str;
        this.temporaryId = temporaryId2;
    }

    public static /* synthetic */ AttachmentDto copy$default(AttachmentDto attachmentDto, int i, String str, TemporaryId temporaryId2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = attachmentDto.f14686id;
        }
        if ((i2 & 2) != 0) {
            str = attachmentDto.fileName;
        }
        if ((i2 & 4) != 0) {
            temporaryId2 = attachmentDto.temporaryId;
        }
        return attachmentDto.copy(i, str, temporaryId2);
    }

    public final int component1() {
        return this.f14686id;
    }

    public final String component2() {
        return this.fileName;
    }

    public final TemporaryId component3() {
        return this.temporaryId;
    }

    public final AttachmentDto copy(int i, String str, TemporaryId temporaryId2) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        return new AttachmentDto(i, str, temporaryId2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AttachmentDto) {
                AttachmentDto attachmentDto = (AttachmentDto) obj;
                if (!(this.f14686id == attachmentDto.f14686id) || !Intrinsics.areEqual((Object) this.fileName, (Object) attachmentDto.fileName) || !Intrinsics.areEqual((Object) this.temporaryId, (Object) attachmentDto.temporaryId)) {
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
        return this.f14686id;
    }

    public final TemporaryId getTemporaryId() {
        return this.temporaryId;
    }

    public int hashCode() {
        int i = this.f14686id * 31;
        String str = this.fileName;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        TemporaryId temporaryId2 = this.temporaryId;
        if (temporaryId2 != null) {
            i2 = temporaryId2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("AttachmentDto(id=");
        a.append(this.f14686id);
        a.append(", fileName=");
        a.append(this.fileName);
        a.append(", temporaryId=");
        a.append(this.temporaryId);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AttachmentDto(int i, String str, TemporaryId temporaryId2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            temporaryId2 = null;
        }
        this(i, str, temporaryId2);
    }
}
