package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.util.exception.NoContentException;
import k.b.b;
import k.b.b0.h;
import k.b.c0.e.a.c;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$deleteHomeworkComment$2<T, R> implements h<Throwable, d> {
    public static final HomeworkDetailViewModelImpl$deleteHomeworkComment$2 INSTANCE = new HomeworkDetailViewModelImpl$deleteHomeworkComment$2();

    /* renamed from: a */
    public final d apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        if (th instanceof NoContentException) {
            return b.e();
        }
        k.b.c0.b.b.a(th, "error is null");
        return k.b.a0.d.a((b) new c(th));
    }
}
