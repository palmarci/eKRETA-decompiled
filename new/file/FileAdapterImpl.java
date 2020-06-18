package hu.ekreta.ellenorzo.file;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.o;
import n.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/file/FileAdapterImpl;", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "()V", "sink", "Lokio/Sink;", "file", "Ljava/io/File;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: FileAdapterImpl.kt */
public final class FileAdapterImpl implements FileAdapter {
    public v a(File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        v a2 = o.a(file);
        Intrinsics.checkExpressionValueIsNotNull(a2, "Okio.sink(file)");
        return a2;
    }
}
