package p289hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import androidx.core.content.FileProvider.C2857b;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p211h.p262m.p263d.C3737d;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "file", "Ljava/io/File;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$openAttachment$2 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ C3737d f11148c;

    public AttachmentServiceImpl$openAttachment$2(C3737d dVar) {
        this.f11148c = dVar;
    }

    /* renamed from: a */
    public final Intent apply(File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getName());
        if (StringsKt__StringsJVMKt.isBlank(fileExtensionFromUrl)) {
            String name = file.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
            fileExtensionFromUrl = (String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) name, new String[]{"."}, false, 0, 6, (Object) null));
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "*/*";
        }
        Uri a = ((C2857b) FileProvider.m5991a(this.f11148c, "hu.ekreta.student.provider")).mo5990a(file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(a, mimeTypeFromExtension);
        return intent.addFlags(1);
    }
}
