package hu.ekreta.ellenorzo.homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder;", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailActivity.kt */
public final class HomeworkDetailActivity$onCreate$1 extends Lambda implements Function2<ViewGroup, Integer, HomeworkDetailActivity.HomeworkCommentViewHolder> {
    public final /* synthetic */ HomeworkDetailActivity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailActivity$onCreate$1(HomeworkDetailActivity homeworkDetailActivity) {
        super(2);
        this.c = homeworkDetailActivity;
    }

    public final HomeworkDetailActivity.HomeworkCommentViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        HomeworkDetailActivity homeworkDetailActivity = this.c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.homework_comment_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ment_item, parent, false)");
        return new HomeworkDetailActivity.HomeworkCommentViewHolder(homeworkDetailActivity, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
