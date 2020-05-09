package p289hu.ekreta.ellenorzo.announcedTest;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment.ReminderItemViewHolder;
import p289hu.ekreta.ellenorzo.reminder.ReminderItem;
import p289hu.ekreta.ellenorzo.reminder.ReminderListItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment$ReminderItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4022xf98cfc3e extends ObservableProperty<ReminderListItem> {

    /* renamed from: c */
    public final /* synthetic */ ReminderItemViewHolder f11119c;

    public C4022xf98cfc3e(Object obj, Object obj2, ReminderItemViewHolder reminderItemViewHolder) {
        this.f11119c = reminderItemViewHolder;
        super(obj2);
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
            View view = this.f11119c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ((TextView) view.findViewById(C4014R.C4016id.valueTitleLabel)).setBackgroundResource(reminderItem.mo14287c());
            View view2 = this.f11119c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView = (TextView) view2.findViewById(C4014R.C4016id.typeLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.typeLabel");
            textView.setText(reminderItem.mo14289e());
            View view3 = this.f11119c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView2 = (TextView) view3.findViewById(C4014R.C4016id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.subjectLabel");
            textView2.setText(reminderItem.mo14288d());
        }
    }
}
