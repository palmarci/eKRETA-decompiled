package hu.ekreta.ellenorzo.util.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/exception/MessageThrowable;", "", "msgRes", "", "(I)V", "getMsgRes", "()I", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageThrowable.kt */
public class MessageThrowable extends Throwable {
    public final int c;

    public MessageThrowable(int i2) {
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }
}
