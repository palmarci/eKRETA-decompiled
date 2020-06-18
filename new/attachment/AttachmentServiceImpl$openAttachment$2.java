package hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import h.m.d.d;
import java.io.File;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "file", "Ljava/io/File;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$2<T, R> implements h<T, R> {
    public final /* synthetic */ d c;

    public AttachmentServiceImpl$openAttachment$2(d dVar) {
        this.c = dVar;
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
        Uri a2 = ((FileProvider.b) FileProvider.a(this.c, "hu.ekreta.guardian.provider")).a(file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(a2, mimeTypeFromExtension);
        return intent.addFlags(1);
    }
}
