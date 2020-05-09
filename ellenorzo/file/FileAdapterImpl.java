package p289hu.ekreta.ellenorzo.file;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p364n.C5601o;
import p364n.C5611v;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/file/FileAdapterImpl;", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "()V", "sink", "Lokio/Sink;", "file", "Ljava/io/File;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.file.FileAdapterImpl */
/* compiled from: FileAdapterImpl.kt */
public final class FileAdapterImpl implements FileAdapter {
    /* renamed from: a */
    public C5611v mo12746a(File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        C5611v a = C5601o.m18487a(file);
        Intrinsics.checkExpressionValueIsNotNull(a, "Okio.sink(file)");
        return a;
    }
}
