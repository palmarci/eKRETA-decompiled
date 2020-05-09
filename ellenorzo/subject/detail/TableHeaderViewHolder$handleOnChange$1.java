package p289hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lkotlin/reflect/KProperty;", "oldListItem", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "new", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$handleOnChange$1 */
/* compiled from: TableHeaderViewHolder.kt */
public final class TableHeaderViewHolder$handleOnChange$1 extends Lambda implements Function3<KProperty<?>, ListItem, ListItem, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TableHeaderViewHolder f15091c;

    public TableHeaderViewHolder$handleOnChange$1(TableHeaderViewHolder tableHeaderViewHolder) {
        this.f15091c = tableHeaderViewHolder;
        super(3);
    }

    /* renamed from: a */
    public final void mo15963a(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "<anonymous parameter 0>");
        if (!(listItem2 instanceof TableHeader)) {
            listItem2 = null;
        }
        TableHeader tableHeader = (TableHeader) listItem2;
        if (tableHeader != null) {
            View view = this.f15091c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.subjectLabel");
            textView.setText(tableHeader.mo15908e().mo15950k());
            this.f15091c.mo15958a(tableHeader);
            this.f15091c.mo15961b(tableHeader);
            TableHeaderViewHolder.access$handleAverage(this.f15091c, tableHeader);
            TableHeaderViewHolder.access$handleClassAverage(this.f15091c, tableHeader);
            this.f15091c.mo15959a(tableHeader, listItem);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15963a((KProperty) obj, (ListItem) obj2, (ListItem) obj3);
        return Unit.INSTANCE;
    }
}
