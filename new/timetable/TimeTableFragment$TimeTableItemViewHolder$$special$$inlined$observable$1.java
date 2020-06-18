package hu.ekreta.ellenorzo.timetable;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import h.i.f.a;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.timetable.TimeTableFragment;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class TimeTableFragment$TimeTableItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<TimeTableItem> {
    public final /* synthetic */ TimeTableFragment.TimeTableItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableFragment$TimeTableItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, TimeTableFragment.TimeTableItemViewHolder timeTableItemViewHolder) {
        super(obj2);
        this.c = timeTableItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, TimeTableItem timeTableItem, TimeTableItem timeTableItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        TimeTableItem timeTableItem3 = timeTableItem2;
        TimeTableItem timeTableItem4 = timeTableItem;
        if (timeTableItem3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.timetable_constraint_layout);
            Context n2 = this.c.x.n();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            constraintLayout.setBackgroundColor(a.a(n2, timeTableItem3.t() ? R.color.accessorColor : R.color.colorSecondary));
            boolean z = true;
            if (!Intrinsics.areEqual((Object) timeTableItem3.r().getTime(), (Object) timeTableItem3.i().getTime())) {
                View view2 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                TextView textView = (TextView) view2.findViewById(R.id.start_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.start_time_text_view");
                Date time = timeTableItem3.r().getTime();
                Intrinsics.checkExpressionValueIsNotNull(time, "startTime.time");
                textView.setText(UtilsKt.a(time));
                View view3 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(R.id.end_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.end_time_text_view");
                Date time2 = timeTableItem3.i().getTime();
                Intrinsics.checkExpressionValueIsNotNull(time2, "endTime.time");
                textView2.setText(UtilsKt.a(time2));
            } else {
                View view4 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                TextView textView3 = (TextView) view4.findViewById(R.id.start_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.start_time_text_view");
                textView3.setText((CharSequence) null);
                View view5 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                TextView textView4 = (TextView) view5.findViewById(R.id.end_time_text_view);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.end_time_text_view");
                textView4.setText((CharSequence) null);
            }
            View view6 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            TextView textView5 = (TextView) view6.findViewById(R.id.timetable_lesson_text_view);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.timetable_lesson_text_view");
            textView5.setText(timeTableItem3.n());
            View view7 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            TextView textView6 = (TextView) view7.findViewById(R.id.timetable_room_text_view);
            String s = timeTableItem3.s();
            String a2 = this.c.x.a((int) R.string.timetable_item_cancelled_state_description);
            Intrinsics.checkExpressionValueIsNotNull(a2, "getString(R.string.timet…celled_state_description)");
            boolean contains = StringsKt__StringsKt.contains((CharSequence) s, (CharSequence) a2, true);
            textView6.setText(contains ? this.c.x.a((int) R.string.timetable_item_class_cancelled) : timeTableItem3.g());
            Context context = textView6.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            textView6.setTextColor(a.a(context, contains ? R.color.cancelledLessonFontColor : R.color.primaryFontColor));
            List<String> d2 = timeTableItem3.d();
            if (!(d2 == null || d2.isEmpty())) {
                View view8 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                ImageView imageView = (ImageView) view8.findViewById(R.id.announced_test_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.announced_test_icon");
                imageView.setVisibility(0);
            } else {
                View view9 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                ImageView imageView2 = (ImageView) view9.findViewById(R.id.announced_test_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.announced_test_icon");
                imageView2.setVisibility(8);
            }
            String j2 = timeTableItem3.j();
            if (j2 != null && !StringsKt__StringsJVMKt.isBlank(j2)) {
                z = false;
            }
            if (!z) {
                View view10 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                ImageView imageView3 = (ImageView) view10.findViewById(R.id.homework_icon);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.homework_icon");
                imageView3.setVisibility(0);
                return;
            }
            View view11 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ImageView imageView4 = (ImageView) view11.findViewById(R.id.homework_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "itemView.homework_icon");
            imageView4.setVisibility(8);
        }
    }
}
