package p289hu.ekreta.ellenorzo.timetable;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.reminder.RemindersFragment;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo17463d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;", "it", "", "invoke", "(Ljava/lang/Integer;)Landroidx/fragment/app/Fragment;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableRootFragment$onViewCreated$1 */
/* compiled from: TimeTableRootFragment.kt */
public final class TimeTableRootFragment$onViewCreated$1 extends Lambda implements Function1<Integer, Fragment> {
    public static final TimeTableRootFragment$onViewCreated$1 INSTANCE = new TimeTableRootFragment$onViewCreated$1();

    public TimeTableRootFragment$onViewCreated$1() {
        super(1);
    }

    /* renamed from: a */
    public final Fragment invoke(Integer num) {
        if (num != null && num.intValue() == 1) {
            return new RemindersFragment();
        }
        return new TimeTableFragment();
    }
}
