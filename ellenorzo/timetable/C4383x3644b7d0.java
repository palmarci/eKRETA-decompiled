package p289hu.ekreta.ellenorzo.timetable;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p211h.p238i.p240f.C3545a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.timetable.TimeTableFragment.TimeTableItemViewHolder;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$TimeTableItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4383x3644b7d0 extends ObservableProperty<TimeTableItem> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemViewHolder f15106c;

    public C4383x3644b7d0(Object obj, Object obj2, TimeTableItemViewHolder timeTableItemViewHolder) {
        this.f15106c = timeTableItemViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, TimeTableItem timeTableItem, TimeTableItem timeTableItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        TimeTableItem timeTableItem3 = timeTableItem2;
        TimeTableItem timeTableItem4 = timeTableItem;
        if (timeTableItem3 != null) {
            View view = this.f15106c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C4014R.C4016id.timetable_constraint_layout);
            Context n = this.f15106c.f15104x.mo6209n();
            if (n == null) {
                Intrinsics.throwNpe();
            }
            constraintLayout.setBackgroundColor(C3545a.m9033a(n, timeTableItem3.mo16018t() ? C4014R.color.accessorColor : C4014R.color.colorSecondary));
            boolean z = true;
            String str2 = "itemView.end_time_text_view";
            String str3 = "itemView.start_time_text_view";
            if (!Intrinsics.areEqual((Object) timeTableItem3.mo16016r().getTime(), (Object) timeTableItem3.mo16007i().getTime())) {
                View view2 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view2, str);
                TextView textView = (TextView) view2.findViewById(C4014R.C4016id.start_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView, str3);
                Date time = timeTableItem3.mo16016r().getTime();
                Intrinsics.checkExpressionValueIsNotNull(time, "startTime.time");
                textView.setText(UtilsKt.m14829a(time));
                View view3 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view3, str);
                TextView textView2 = (TextView) view3.findViewById(C4014R.C4016id.end_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView2, str2);
                Date time2 = timeTableItem3.mo16007i().getTime();
                Intrinsics.checkExpressionValueIsNotNull(time2, "endTime.time");
                textView2.setText(UtilsKt.m14829a(time2));
            } else {
                View view4 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view4, str);
                TextView textView3 = (TextView) view4.findViewById(C4014R.C4016id.start_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView3, str3);
                textView3.setText(null);
                View view5 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view5, str);
                TextView textView4 = (TextView) view5.findViewById(C4014R.C4016id.end_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView4, str2);
                textView4.setText(null);
            }
            View view6 = this.f15106c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view6, str);
            TextView textView5 = (TextView) view6.findViewById(C4014R.C4016id.timetable_lesson_text_view);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.timetable_lesson_text_view");
            textView5.setText(timeTableItem3.mo16012n());
            View view7 = this.f15106c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view7, str);
            TextView textView6 = (TextView) view7.findViewById(C4014R.C4016id.timetable_room_text_view);
            String s = timeTableItem3.mo16017s();
            String a = this.f15106c.f15104x.mo6148a((int) C4014R.string.timetable_item_cancelled_state_description);
            Intrinsics.checkExpressionValueIsNotNull(a, "getString(R.string.timet…celled_state_description)");
            boolean contains = StringsKt__StringsKt.contains((CharSequence) s, (CharSequence) a, true);
            textView6.setText(contains ? this.f15106c.f15104x.mo6148a((int) C4014R.string.timetable_item_class_cancelled) : timeTableItem3.mo16004g());
            Context context = textView6.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            textView6.setTextColor(C3545a.m9033a(context, contains ? C4014R.color.cancelledLessonFontColor : C4014R.color.primaryFontColor));
            List d = timeTableItem3.mo15999d();
            String str4 = "itemView.announced_test_icon";
            if (!(d == null || d.isEmpty())) {
                View view8 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view8, str);
                ImageView imageView = (ImageView) view8.findViewById(C4014R.C4016id.announced_test_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, str4);
                imageView.setVisibility(0);
            } else {
                View view9 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view9, str);
                ImageView imageView2 = (ImageView) view9.findViewById(C4014R.C4016id.announced_test_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, str4);
                imageView2.setVisibility(8);
            }
            String j = timeTableItem3.mo16008j();
            if (j != null && !StringsKt__StringsJVMKt.isBlank(j)) {
                z = false;
            }
            String str5 = "itemView.homework_icon";
            if (!z) {
                View view10 = this.f15106c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view10, str);
                ImageView imageView3 = (ImageView) view10.findViewById(C4014R.C4016id.homework_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, str5);
                imageView3.setVisibility(0);
                return;
            }
            View view11 = this.f15106c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view11, str);
            ImageView imageView4 = (ImageView) view11.findViewById(C4014R.C4016id.homework_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, str5);
            imageView4.setVisibility(8);
        }
    }
}
