package hu.ekreta.ellenorzo.util.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhu/ekreta/ellenorzo/util/exception/NoContentException;", "Ljava/lang/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoContentException.kt */
public final class NoContentException extends RuntimeException {
    public NoContentException() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NoContentException(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.lang.String r1 = "There is no content!"
        L_0x0006:
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.util.exception.NoContentException.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
