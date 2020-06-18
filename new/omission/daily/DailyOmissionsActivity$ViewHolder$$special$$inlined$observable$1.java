package hu.ekreta.ellenorzo.omission.daily;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.omission.OmissionViewModel;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<OmissionViewModel> {
    public final /* synthetic */ DailyOmissionsActivity.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, DailyOmissionsActivity.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, OmissionViewModel omissionViewModel, OmissionViewModel omissionViewModel2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        OmissionViewModel omissionViewModel3 = omissionViewModel2;
        OmissionViewModel omissionViewModel4 = omissionViewModel;
        if (omissionViewModel3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.lessonTimeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.lessonTimeLabel");
            if (omissionViewModel3.a() == null) {
                str = omissionViewModel3.c();
            } else {
                str = omissionViewModel3.a() + this.c.y.getString(R.string.lesson) + " (" + omissionViewModel3.c() + ')';
            }
            textView.setText(str);
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.subjectNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.subjectNameLabel");
            textView2.setText(omissionViewModel3.f());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.omissionTypeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.omissionTypeLabel");
            textView3.setText(this.c.y.getString(omissionViewModel3.d().j().a()));
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((AppCompatImageView) view4.findViewById(R.id.omissionTypeImage)).setImageResource(omissionViewModel3.e());
            View view5 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            TextView textView4 = (TextView) view5.findViewById(R.id.omissionDetailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.omissionDetailLabel");
            textView4.setText(omissionViewModel3.b());
        }
    }
}
