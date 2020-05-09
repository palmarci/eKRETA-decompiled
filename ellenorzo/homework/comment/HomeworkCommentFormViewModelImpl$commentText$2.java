package p289hu.ekreta.ellenorzo.homework.comment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl$commentText$2 */
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$commentText$2 extends Lambda implements Function1<String, Unit> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkCommentFormViewModelImpl f13568c;

    public HomeworkCommentFormViewModelImpl$commentText$2(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        this.f13568c = homeworkCommentFormViewModelImpl;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkParameterIsNotNull(str, "it");
        this.f13568c.mo13054b(!StringsKt__StringsJVMKt.isBlank(str));
    }
}
