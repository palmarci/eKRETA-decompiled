package hu.ekreta.ellenorzo.announcedTest;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment;
import hu.ekreta.ellenorzo.reminder.ReminderItem;
import hu.ekreta.ellenorzo.reminder.ReminderListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AnnouncedTestsFragment$ReminderItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<ReminderListItem> {
    public final /* synthetic */ AnnouncedTestsFragment.ReminderItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnouncedTestsFragment$ReminderItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, AnnouncedTestsFragment.ReminderItemViewHolder reminderItemViewHolder) {
        super(obj2);
        this.c = reminderItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, ReminderListItem reminderListItem, ReminderListItem reminderListItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ReminderListItem reminderListItem3 = reminderListItem2;
        ReminderListItem reminderListItem4 = reminderListItem;
        if (!(reminderListItem3 instanceof ReminderItem)) {
            reminderListItem3 = null;
        }
        ReminderItem reminderItem = (ReminderItem) reminderListItem3;
        if (reminderItem != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((TextView) view.findViewById(R.id.valueTitleLabel)).setBackgroundResource(reminderItem.c());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.typeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.typeLabel");
            textView.setText(reminderItem.e());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(R.id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.subjectLabel");
            textView2.setText(reminderItem.d());
        }
    }
}
