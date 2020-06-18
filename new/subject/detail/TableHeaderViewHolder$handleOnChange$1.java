package hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lkotlin/reflect/KProperty;", "oldListItem", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "new", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TableHeaderViewHolder.kt */
public final class TableHeaderViewHolder$handleOnChange$1 extends Lambda implements Function3<KProperty<?>, SubjectDetailViewModel.ListItem, SubjectDetailViewModel.ListItem, Unit> {
    public final /* synthetic */ TableHeaderViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TableHeaderViewHolder$handleOnChange$1(TableHeaderViewHolder tableHeaderViewHolder) {
        super(3);
        this.c = tableHeaderViewHolder;
    }

    public final void a(KProperty<?> kProperty, SubjectDetailViewModel.ListItem listItem, SubjectDetailViewModel.ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "<anonymous parameter 0>");
        if (!(listItem2 instanceof SubjectDetailViewModel.ListItem.TableHeader)) {
            listItem2 = null;
        }
        SubjectDetailViewModel.ListItem.TableHeader tableHeader = (SubjectDetailViewModel.ListItem.TableHeader) listItem2;
        if (tableHeader != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.subjectLabel");
            textView.setText(tableHeader.e().k());
            this.c.a(tableHeader);
            this.c.b(tableHeader);
            TableHeaderViewHolder.access$handleAverage(this.c, tableHeader);
            TableHeaderViewHolder.access$handleClassAverage(this.c, tableHeader);
            this.c.a(tableHeader, listItem);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((KProperty) obj, (SubjectDetailViewModel.ListItem) obj2, (SubjectDetailViewModel.ListItem) obj3);
        return Unit.INSTANCE;
    }
}
