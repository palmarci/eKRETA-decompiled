package p289hu.ekreta.ellenorzo.homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailActivity.HomeworkCommentViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder;", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivity$onCreate$1 */
/* compiled from: HomeworkDetailActivity.kt */
public final class HomeworkDetailActivity$onCreate$1 extends Lambda implements Function2<ViewGroup, Integer, HomeworkCommentViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkDetailActivity f13454c;

    public HomeworkDetailActivity$onCreate$1(HomeworkDetailActivity homeworkDetailActivity) {
        this.f13454c = homeworkDetailActivity;
        super(2);
    }

    /* renamed from: a */
    public final HomeworkCommentViewHolder mo12935a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        HomeworkDetailActivity homeworkDetailActivity = this.f13454c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4014R.layout.homework_comment_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ment_item, parent, false)");
        return new HomeworkCommentViewHolder(homeworkDetailActivity, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo12935a(viewGroup);
    }
}
