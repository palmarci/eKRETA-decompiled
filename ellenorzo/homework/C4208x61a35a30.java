package p289hu.ekreta.ellenorzo.homework;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.homework.HomeworksFragment.SectionHeaderViewHolder;
import p289hu.ekreta.ellenorzo.reminder.ReminderListItem;
import p289hu.ekreta.ellenorzo.reminder.ReminderSectionHeader;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4208x61a35a30 extends ObservableProperty<ReminderListItem> {

    /* renamed from: c */
    public final /* synthetic */ SectionHeaderViewHolder f13527c;

    public C4208x61a35a30(Object obj, Object obj2, SectionHeaderViewHolder sectionHeaderViewHolder) {
        this.f13527c = sectionHeaderViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ReminderListItem reminderListItem, ReminderListItem reminderListItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ReminderListItem reminderListItem3 = reminderListItem2;
        ReminderListItem reminderListItem4 = reminderListItem;
        if (!(reminderListItem3 instanceof ReminderSectionHeader)) {
            reminderListItem3 = null;
        }
        ReminderSectionHeader reminderSectionHeader = (ReminderSectionHeader) reminderListItem3;
        if (reminderSectionHeader != null) {
            View view = this.f13527c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.sectionTitleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.sectionTitleLabel");
            textView.setText(reminderSectionHeader.mo14301b());
        }
    }
}
