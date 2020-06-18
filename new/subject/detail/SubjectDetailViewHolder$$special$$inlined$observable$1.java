package hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import android.widget.TextView;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class SubjectDetailViewHolder$$special$$inlined$observable$1 extends ObservableProperty<SubjectDetailViewModel.ListItem> {
    public final /* synthetic */ SubjectDetailViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectDetailViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, SubjectDetailViewHolder subjectDetailViewHolder) {
        super(obj2);
        this.c = subjectDetailViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, SubjectDetailViewModel.ListItem listItem, SubjectDetailViewModel.ListItem listItem2) {
        Evaluation a2;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        SubjectDetailViewModel.ListItem listItem3 = listItem2;
        SubjectDetailViewModel.ListItem listItem4 = listItem;
        if (!(listItem3 instanceof SubjectDetailViewModel.ListItem.EvaluationItem)) {
            listItem3 = null;
        }
        SubjectDetailViewModel.ListItem.EvaluationItem evaluationItem = (SubjectDetailViewModel.ListItem.EvaluationItem) listItem3;
        if (evaluationItem != null && (a2 = evaluationItem.a()) != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.modeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.modeLabel");
            textView.setText(a2.o() ? a2.C() : a2.n());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.dateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.dateLabel");
            textView2.setText(UtilsKt.d(a2.t()));
            int i2 = SubjectDetailViewHolder.WhenMappings.f6188a[a2.j().ordinal()];
            if (i2 == 1) {
                View view3 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                TextView textView3 = (TextView) view3.findViewById(R.id.detailLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.detailLabel");
                v.a(textView3, Intrinsics.stringPlus(a2.D(), "<br>"));
                View view4 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                TextView textView4 = (TextView) view4.findViewById(R.id.detailLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.detailLabel");
                textView4.setVisibility(0);
                View view5 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                TextView textView5 = (TextView) view5.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.valueTitleLabel");
                textView5.setVisibility(8);
            } else if (i2 != 2) {
                View view6 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                TextView textView6 = (TextView) view6.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.valueTitleLabel");
                textView6.setText(a2.D());
                View view7 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                TextView textView7 = (TextView) view7.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.valueTitleLabel");
                textView7.setVisibility(0);
                View view8 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                TextView textView8 = (TextView) view8.findViewById(R.id.detailLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "itemView.detailLabel");
                textView8.setVisibility(8);
            } else {
                View view9 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                TextView textView9 = (TextView) view9.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "itemView.valueTitleLabel");
                textView9.setText(String.valueOf(a2.q()));
                View view10 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                TextView textView10 = (TextView) view10.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "itemView.valueTitleLabel");
                textView10.setVisibility(0);
                View view11 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
                TextView textView11 = (TextView) view11.findViewById(R.id.detailLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "itemView.detailLabel");
                textView11.setVisibility(8);
            }
        }
    }
}
