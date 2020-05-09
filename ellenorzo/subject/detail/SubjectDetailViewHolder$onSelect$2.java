package p289hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder$onSelect$2 */
/* compiled from: SubjectDetailViewHolder.kt */
public final class SubjectDetailViewHolder$onSelect$2 implements OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ SubjectDetailViewHolder f15018c;

    /* renamed from: e */
    public final /* synthetic */ Function1 f15019e;

    public SubjectDetailViewHolder$onSelect$2(SubjectDetailViewHolder subjectDetailViewHolder, Function1 function1) {
        this.f15018c = subjectDetailViewHolder;
        this.f15019e = function1;
    }

    public final void onClick(View view) {
        ListItem model = this.f15018c.getModel();
        if (model != null) {
            this.f15019e.invoke(model);
        }
    }
}
