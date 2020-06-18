package hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder$onSelect$2 implements View.OnClickListener {
    public final /* synthetic */ SubjectDetailViewHolder c;
    public final /* synthetic */ Function1 e;

    public SubjectDetailViewHolder$onSelect$2(SubjectDetailViewHolder subjectDetailViewHolder, Function1 function1) {
        this.c = subjectDetailViewHolder;
        this.e = function1;
    }

    public final void onClick(View view) {
        SubjectDetailViewModel.ListItem model = this.c.getModel();
        if (model != null) {
            this.e.invoke(model);
        }
    }
}
