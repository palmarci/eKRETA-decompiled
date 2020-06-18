package hu.ekreta.ellenorzo.util.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lhu/ekreta/ellenorzo/util/exception/NoStackTraceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "fillInStackTrace", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoStackTraceException.kt */
public class NoStackTraceException extends RuntimeException {
    public Throwable fillInStackTrace() {
        return this;
    }
}
