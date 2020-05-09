package p289hu.ekreta.ellenorzo.omission;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.omission.DailyOmissionsActivity.ViewHolder;
import p289hu.ekreta.ellenorzo.omission.Omission.LessonType;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<OmissionViewModel> {

    /* renamed from: c */
    public final /* synthetic */ ViewHolder f14302c;

    public DailyOmissionsActivity$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ViewHolder viewHolder) {
        this.f14302c = viewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, OmissionViewModel omissionViewModel, OmissionViewModel omissionViewModel2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        OmissionViewModel omissionViewModel3 = omissionViewModel2;
        OmissionViewModel omissionViewModel4 = omissionViewModel;
        if (omissionViewModel3 != null) {
            View view = this.f14302c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.lessonTimeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.lessonTimeLabel");
            textView.setText(omissionViewModel3.mo13985d().mo13852o() == LessonType.Lesson ? omissionViewModel3.mo13982a() : omissionViewModel3.mo13984c());
            View view2 = this.f14302c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.subjectNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.subjectNameLabel");
            textView2.setText(omissionViewModel3.mo13988f());
            View view3 = this.f14302c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.omissionTypeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.omissionTypeLabel");
            textView3.setText(this.f14302c.f14301y.getString(omissionViewModel3.mo13985d().mo13847j().mo13866a()));
            View view4 = this.f14302c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str);
            ((ImageView) view4.findViewById(C4014R.C4016id.omissionTypeImage)).setImageResource(omissionViewModel3.mo13986e());
            View view5 = this.f14302c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view5, str);
            TextView textView4 = (TextView) view5.findViewById(C4014R.C4016id.omissionDetailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.omissionDetailLabel");
            textView4.setText(omissionViewModel3.mo13983b());
        }
    }
}
