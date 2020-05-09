package p289hu.ekreta.ellenorzo.announcedTest;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment.ReminderItemViewHolder;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment.SectionHeaderViewHolder;
import p289hu.ekreta.ellenorzo.reminder.ReminderListItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment$onViewCreated$adapter$2 */
/* compiled from: AnnouncedTestsFragment.kt */
public final class AnnouncedTestsFragment$onViewCreated$adapter$2 extends Lambda implements Function2<ViewGroup, Integer, MVVMViewHolder<? super ReminderListItem>> {

    /* renamed from: c */
    public final /* synthetic */ AnnouncedTestsFragment f11121c;

    public AnnouncedTestsFragment$onViewCreated$adapter$2(AnnouncedTestsFragment announcedTestsFragment) {
        this.f11121c = announcedTestsFragment;
        super(2);
    }

    /* renamed from: a */
    public final MVVMViewHolder<? super ReminderListItem> mo11424a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 0) {
            return new ReminderItemViewHolder(this.f11121c, viewGroup);
        }
        return new SectionHeaderViewHolder(this.f11121c, viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11424a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
