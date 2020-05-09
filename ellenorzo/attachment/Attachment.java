package p289hu.ekreta.ellenorzo.attachment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006+"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/Attachment;", "Landroid/os/Parcelable;", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "id", "", "fileName", "", "temporaryServerUid", "attachmentType", "Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "attachmentIsDownloaded", "Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;", "profileId", "(ILjava/lang/String;Ljava/lang/String;Lhu/ekreta/ellenorzo/attachment/AttachmentType;Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;Ljava/lang/String;)V", "getAttachmentIsDownloaded", "()Lhu/ekreta/ellenorzo/attachment/AttachmentDownloadState;", "getAttachmentType", "()Lhu/ekreta/ellenorzo/attachment/AttachmentType;", "getFileName", "()Ljava/lang/String;", "getId", "()I", "getProfileId", "getTemporaryServerUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.Attachment */
/* compiled from: Attachment.kt */
public final class Attachment implements Parcelable, ProfileSpecificModel {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();

    /* renamed from: c */
    public final int f11129c;

    /* renamed from: e */
    public final String f11130e;

    /* renamed from: f */
    public final String f11131f;

    /* renamed from: g */
    public final AttachmentType f11132g;

    /* renamed from: h */
    public final AttachmentDownloadState f11133h;

    /* renamed from: i */
    public final String f11134i;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.attachment.Attachment$Creator */
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            Attachment attachment = new Attachment(parcel.readInt(), parcel.readString(), parcel.readString(), (AttachmentType) Enum.valueOf(AttachmentType.class, parcel.readString()), (AttachmentDownloadState) Enum.valueOf(AttachmentDownloadState.class, parcel.readString()), parcel.readString());
            return attachment;
        }

        public final Object[] newArray(int i) {
            return new Attachment[i];
        }
    }

    public Attachment(int i, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3) {
        Intrinsics.checkParameterIsNotNull(attachmentType, "attachmentType");
        Intrinsics.checkParameterIsNotNull(attachmentDownloadState, "attachmentIsDownloaded");
        Intrinsics.checkParameterIsNotNull(str3, "profileId");
        this.f11129c = i;
        this.f11130e = str;
        this.f11131f = str2;
        this.f11132g = attachmentType;
        this.f11133h = attachmentDownloadState;
        this.f11134i = str3;
    }

    public static /* synthetic */ Attachment copy$default(Attachment attachment, int i, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = attachment.f11129c;
        }
        if ((i2 & 2) != 0) {
            str = attachment.f11130e;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = attachment.f11131f;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            attachmentType = attachment.f11132g;
        }
        AttachmentType attachmentType2 = attachmentType;
        if ((i2 & 16) != 0) {
            attachmentDownloadState = attachment.f11133h;
        }
        AttachmentDownloadState attachmentDownloadState2 = attachmentDownloadState;
        if ((i2 & 32) != 0) {
            str3 = attachment.mo11318e();
        }
        return attachment.mo11429a(i, str4, str5, attachmentType2, attachmentDownloadState2, str3);
    }

    /* renamed from: a */
    public final Attachment mo11429a(int i, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3) {
        Intrinsics.checkParameterIsNotNull(attachmentType, "attachmentType");
        Intrinsics.checkParameterIsNotNull(attachmentDownloadState, "attachmentIsDownloaded");
        Intrinsics.checkParameterIsNotNull(str3, "profileId");
        Attachment attachment = new Attachment(i, str, str2, attachmentType, attachmentDownloadState, str3);
        return attachment;
    }

    /* renamed from: a */
    public String mo11430a(Object obj) {
        return C3984v.m10183a((ProfileSpecificModel) this, obj);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo11318e() {
        return this.f11134i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Attachment) {
                Attachment attachment = (Attachment) obj;
                if (!(this.f11129c == attachment.f11129c) || !Intrinsics.areEqual((Object) this.f11130e, (Object) attachment.f11130e) || !Intrinsics.areEqual((Object) this.f11131f, (Object) attachment.f11131f) || !Intrinsics.areEqual((Object) this.f11132g, (Object) attachment.f11132g) || !Intrinsics.areEqual((Object) this.f11133h, (Object) attachment.f11133h) || !Intrinsics.areEqual((Object) mo11318e(), (Object) attachment.mo11318e())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final AttachmentDownloadState mo11433f() {
        return this.f11133h;
    }

    /* renamed from: g */
    public final AttachmentType mo11434g() {
        return this.f11132g;
    }

    /* renamed from: h */
    public final String mo11435h() {
        return this.f11130e;
    }

    public int hashCode() {
        int i = this.f11129c * 31;
        String str = this.f11130e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11131f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AttachmentType attachmentType = this.f11132g;
        int hashCode3 = (hashCode2 + (attachmentType != null ? attachmentType.hashCode() : 0)) * 31;
        AttachmentDownloadState attachmentDownloadState = this.f11133h;
        int hashCode4 = (hashCode3 + (attachmentDownloadState != null ? attachmentDownloadState.hashCode() : 0)) * 31;
        String e = mo11318e();
        if (e != null) {
            i2 = e.hashCode();
        }
        return hashCode4 + i2;
    }

    /* renamed from: i */
    public final int mo11437i() {
        return this.f11129c;
    }

    /* renamed from: j */
    public final String mo11438j() {
        return this.f11131f;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("Attachment(id=");
        a.append(this.f11129c);
        a.append(", fileName=");
        a.append(this.f11130e);
        a.append(", temporaryServerUid=");
        a.append(this.f11131f);
        a.append(", attachmentType=");
        a.append(this.f11132g);
        a.append(", attachmentIsDownloaded=");
        a.append(this.f11133h);
        a.append(", profileId=");
        a.append(mo11318e());
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.f11129c);
        parcel.writeString(this.f11130e);
        parcel.writeString(this.f11131f);
        parcel.writeString(this.f11132g.name());
        parcel.writeString(this.f11133h.name());
        parcel.writeString(this.f11134i);
    }

    public /* synthetic */ Attachment(int i, String str, String str2, AttachmentType attachmentType, AttachmentDownloadState attachmentDownloadState, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            attachmentType = AttachmentType.UNDEFINIED;
        }
        AttachmentType attachmentType2 = attachmentType;
        if ((i2 & 16) != 0) {
            attachmentDownloadState = AttachmentDownloadState.NOT_DOWNLOADED;
        }
        this(i, str, str4, attachmentType2, attachmentDownloadState, str3);
    }
}
