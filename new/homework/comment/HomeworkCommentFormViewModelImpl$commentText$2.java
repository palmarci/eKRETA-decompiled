package hu.ekreta.ellenorzo.homework.comment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$commentText$2 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ HomeworkCommentFormViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkCommentFormViewModelImpl$commentText$2(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        super(1);
        this.c = homeworkCommentFormViewModelImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkParameterIsNotNull(str, "it");
        this.c.c(!StringsKt__StringsJVMKt.isBlank(str));
    }
}
