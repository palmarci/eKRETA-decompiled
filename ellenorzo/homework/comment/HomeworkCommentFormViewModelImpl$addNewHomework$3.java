package p289hu.ekreta.ellenorzo.homework.comment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl$addNewHomework$3 */
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$addNewHomework$3 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkCommentFormViewModelImpl f13564c;

    public HomeworkCommentFormViewModelImpl$addNewHomework$3(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        this.f13564c = homeworkCommentFormViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13058a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f13564c.mo13054b(true);
        DataBindingViewModel.showError$default(this.f13564c, th, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13058a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
