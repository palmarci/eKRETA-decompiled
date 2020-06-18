package hu.ekreta.ellenorzo.attachment;

import a.b.a.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import h.w.v;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010%\u001a\u00020\u0004H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/attachment/Attachment;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "fileName", "", "fileTemporaryUid", "attachmentType", "Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "attachmentIsDownloaded", "Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;", "profileId", "fileHandler", "filePath", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/attachment/AttachmentType;Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttachmentIsDownloaded", "()Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;", "getAttachmentType", "()Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "getFileHandler", "()Ljava/lang/String;", "getFileName", "getFilePath", "getFileTemporaryUid", "getId", "()I", "getProfileId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Attachment.kt */
public final class Attachment implements Parcelable, ProfileSpecificModel {
    public static final Parcelable.Creator CREATOR = new Creator();
    public final int c;
    public final String e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final AttachmentType f5038g;

    /* renamed from: h  reason: collision with root package name */
    public final AttachmentDownloadState f5039h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5040i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5041j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5042k;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Attachment(parcel.readInt(), parcel.readString(), parcel.readString(), (AttachmentType) Enum.valueOf(AttachmentType.class, parcel.readString()), (AttachmentDownloadState) Enum.valueOf(AttachmentDownloadState.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i2) {
            return new Attachment[i2];
        }
    }

    public Attachment(int i2, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(attachmentType, "attachmentType");
        Intrinsics.checkParameterIsNotNull(attachmentDownloadState, "attachmentIsDownloaded");
        Intrinsics.checkParameterIsNotNull(str3, "profileId");
        this.c = i2;
        this.e = str;
        this.f = str2;
        this.f5038g = attachmentType;
        this.f5039h = attachmentDownloadState;
        this.f5040i = str3;
        this.f5041j = str4;
        this.f5042k = str5;
    }

    public static /* synthetic */ Attachment copy$default(Attachment attachment, int i2, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3, String str4, String str5, int i3, Object obj) {
        Attachment attachment2 = attachment;
        int i4 = i3;
        return attachment.a((i4 & 1) != 0 ? attachment2.c : i2, (i4 & 2) != 0 ? attachment2.e : str, (i4 & 4) != 0 ? attachment2.f : str2, (i4 & 8) != 0 ? attachment2.f5038g : attachmentType, (i4 & 16) != 0 ? attachment2.f5039h : attachmentDownloadState, (i4 & 32) != 0 ? attachment.e() : str3, (i4 & 64) != 0 ? attachment2.f5041j : str4, (i4 & 128) != 0 ? attachment2.f5042k : str5);
    }

    public final Attachment a(int i2, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(attachmentType, "attachmentType");
        Intrinsics.checkParameterIsNotNull(attachmentDownloadState, "attachmentIsDownloaded");
        String str6 = str3;
        Intrinsics.checkParameterIsNotNull(str6, "profileId");
        return new Attachment(i2, str, str2, attachmentType, attachmentDownloadState, str6, str4, str5);
    }

    public String a(Object obj) {
        return v.a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5040i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Attachment) {
                Attachment attachment = (Attachment) obj;
                if (!(this.c == attachment.c) || !Intrinsics.areEqual((Object) this.e, (Object) attachment.e) || !Intrinsics.areEqual((Object) this.f, (Object) attachment.f) || !Intrinsics.areEqual((Object) this.f5038g, (Object) attachment.f5038g) || !Intrinsics.areEqual((Object) this.f5039h, (Object) attachment.f5039h) || !Intrinsics.areEqual((Object) e(), (Object) attachment.e()) || !Intrinsics.areEqual((Object) this.f5041j, (Object) attachment.f5041j) || !Intrinsics.areEqual((Object) this.f5042k, (Object) attachment.f5042k)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AttachmentDownloadState f() {
        return this.f5039h;
    }

    public final AttachmentType g() {
        return this.f5038g;
    }

    public final String h() {
        return this.f5041j;
    }

    public int hashCode() {
        int i2 = this.c * 31;
        String str = this.e;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AttachmentType attachmentType = this.f5038g;
        int hashCode3 = (hashCode2 + (attachmentType != null ? attachmentType.hashCode() : 0)) * 31;
        AttachmentDownloadState attachmentDownloadState = this.f5039h;
        int hashCode4 = (hashCode3 + (attachmentDownloadState != null ? attachmentDownloadState.hashCode() : 0)) * 31;
        String e2 = e();
        int hashCode5 = (hashCode4 + (e2 != null ? e2.hashCode() : 0)) * 31;
        String str3 = this.f5041j;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5042k;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode6 + i3;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.f5042k;
    }

    public final String k() {
        return this.f;
    }

    public final int l() {
        return this.c;
    }

    public String toString() {
        StringBuilder a2 = a.a("Attachment(id=");
        a2.append(this.c);
        a2.append(", fileName=");
        a2.append(this.e);
        a2.append(", fileTemporaryUid=");
        a2.append(this.f);
        a2.append(", attachmentType=");
        a2.append(this.f5038g);
        a2.append(", attachmentIsDownloaded=");
        a2.append(this.f5039h);
        a2.append(", profileId=");
        a2.append(e());
        a2.append(", fileHandler=");
        a2.append(this.f5041j);
        a2.append(", filePath=");
        return a.a(a2, this.f5042k, ")");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.f5038g.name());
        parcel.writeString(this.f5039h.name());
        parcel.writeString(this.f5040i);
        parcel.writeString(this.f5041j);
        parcel.writeString(this.f5042k);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Attachment(int r13, java.lang.String r14, java.lang.String r15, hu.ekreta.ellenorzo.attachment.AttachmentType r16, hu.ekreta.ellenorzo.attachment.AttachmentDownloadState r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0012
            hu.ekreta.ellenorzo.attachment.AttachmentType r1 = hu.ekreta.ellenorzo.attachment.AttachmentType.UNDEFINIED
            r7 = r1
            goto L_0x0014
        L_0x0012:
            r7 = r16
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            hu.ekreta.ellenorzo.attachment.AttachmentDownloadState r1 = hu.ekreta.ellenorzo.attachment.AttachmentDownloadState.NOT_DOWNLOADED
            r8 = r1
            goto L_0x001e
        L_0x001c:
            r8 = r17
        L_0x001e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0024
            r10 = r2
            goto L_0x0026
        L_0x0024:
            r10 = r19
        L_0x0026:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002c
            r11 = r2
            goto L_0x002e
        L_0x002c:
            r11 = r20
        L_0x002e:
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.attachment.Attachment.<init>(int, java.lang.String, java.lang.String, hu.ekreta.ellenorzo.attachment.AttachmentType, hu.ekreta.ellenorzo.attachment.AttachmentDownloadState, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
