package hu.ekreta.ellenorzo.timetable.detail;

import a.b.a.a.a;
import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.homework.Homework;
import hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/homework/Homework;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$loadHomework$4 extends Lambda implements Function1<Homework, Unit> {
    public final /* synthetic */ TimeTableItemDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl$loadHomework$4(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        super(1);
        this.c = timeTableItemDetailViewModelImpl;
    }

    public final void a(final Homework homework) {
        this.c.b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>() {
            /* renamed from: a */
            public final Intent invoke(Activity activity) {
                Intent a2 = a.a(activity, "$receiver", activity, HomeworkDetailActivity.class);
                ExtensionsKt.a(a2, homework);
                return a2;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Homework) obj);
        return Unit.INSTANCE;
    }
}
