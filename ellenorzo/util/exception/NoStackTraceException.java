package p289hu.ekreta.ellenorzo.util.exception;

import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/exception/NoStackTraceException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "fillInStackTrace", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.exception.NoStackTraceException */
/* compiled from: NoStackTraceException.kt */
public class NoStackTraceException extends RuntimeException {
    public Throwable fillInStackTrace() {
        return this;
    }
}
