package p289hu.ekreta.ellenorzo.util.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/exception/NoContentException;", "Ljava/lang/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.exception.NoContentException */
/* compiled from: NoContentException.kt */
public final class NoContentException extends RuntimeException {
    public NoContentException() {
        this(null, 1, null);
    }

    public /* synthetic */ NoContentException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = "There is no content!";
        }
        Intrinsics.checkParameterIsNotNull(str, "message");
        super(str);
    }
}
