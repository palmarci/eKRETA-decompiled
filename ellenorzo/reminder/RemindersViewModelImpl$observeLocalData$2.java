package p289hu.ekreta.ellenorzo.reminder;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/reminder/ReminderItem;", "it", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl$observeLocalData$2 */
/* compiled from: RemindersViewModelImpl.kt */
public final class RemindersViewModelImpl$observeLocalData$2<T, R> implements C4675h<Object[], R> {
    public static final RemindersViewModelImpl$observeLocalData$2 INSTANCE = new RemindersViewModelImpl$observeLocalData$2();

    /* renamed from: a */
    public final List<ReminderItem> apply(Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "it");
        return ExtensionsKt.m14631a(objArr);
    }
}
