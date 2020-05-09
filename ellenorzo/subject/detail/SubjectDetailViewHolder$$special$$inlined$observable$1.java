package p289hu.ekreta.ellenorzo.subject.detail;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder.WhenMappings;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class SubjectDetailViewHolder$$special$$inlined$observable$1 extends ObservableProperty<ListItem> {

    /* renamed from: c */
    public final /* synthetic */ SubjectDetailViewHolder f15017c;

    public SubjectDetailViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, SubjectDetailViewHolder subjectDetailViewHolder) {
        this.f15017c = subjectDetailViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ListItem listItem3 = listItem2;
        ListItem listItem4 = listItem;
        if (!(listItem3 instanceof EvaluationItem)) {
            listItem3 = null;
        }
        EvaluationItem evaluationItem = (EvaluationItem) listItem3;
        if (evaluationItem != null) {
            Evaluation a = evaluationItem.mo15893a();
            if (a != null) {
                View view = this.f15017c.f7113c;
                String str = "itemView";
                Intrinsics.checkExpressionValueIsNotNull(view, str);
                TextView textView = (TextView) view.findViewById(C4014R.C4016id.modeLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.modeLabel");
                textView.setText(a.mo12605o() ? a.mo12587C() : a.mo12604n());
                View view2 = this.f15017c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view2, str);
                TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.dateLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.dateLabel");
                textView2.setText(UtilsKt.m14841d(a.mo12610t()));
                int i = WhenMappings.f15016a[a.mo12600j().ordinal()];
                String str2 = "itemView.detailLabel";
                String str3 = "itemView.valueTitleLabel";
                if (i == 1) {
                    View view3 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view3, str);
                    TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.detailLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, str2);
                    C3984v.m10230a(textView3, Intrinsics.stringPlus(a.mo12588D(), "<br>"));
                    View view4 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view4, str);
                    TextView textView4 = (TextView) view4.findViewById(C4014R.C4016id.detailLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView4, str2);
                    textView4.setVisibility(0);
                    View view5 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view5, str);
                    TextView textView5 = (TextView) view5.findViewById(C4014R.C4016id.valueTitleLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView5, str3);
                    textView5.setVisibility(8);
                } else if (i != 2) {
                    View view6 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view6, str);
                    TextView textView6 = (TextView) view6.findViewById(C4014R.C4016id.valueTitleLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView6, str3);
                    textView6.setText(a.mo12588D());
                    View view7 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view7, str);
                    TextView textView7 = (TextView) view7.findViewById(C4014R.C4016id.valueTitleLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView7, str3);
                    textView7.setVisibility(0);
                    View view8 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view8, str);
                    TextView textView8 = (TextView) view8.findViewById(C4014R.C4016id.detailLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView8, str2);
                    textView8.setVisibility(8);
                } else {
                    View view9 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view9, str);
                    TextView textView9 = (TextView) view9.findViewById(C4014R.C4016id.valueTitleLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView9, str3);
                    textView9.setText(String.valueOf(a.mo12607q()));
                    View view10 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view10, str);
                    TextView textView10 = (TextView) view10.findViewById(C4014R.C4016id.valueTitleLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView10, str3);
                    textView10.setVisibility(0);
                    View view11 = this.f15017c.f7113c;
                    Intrinsics.checkExpressionValueIsNotNull(view11, str);
                    TextView textView11 = (TextView) view11.findViewById(C4014R.C4016id.detailLabel);
                    Intrinsics.checkExpressionValueIsNotNull(textView11, str2);
                    textView11.setVisibility(8);
                }
            }
        }
    }
}
