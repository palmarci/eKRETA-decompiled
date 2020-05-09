package p289hu.ekreta.ellenorzo.timetable.detail;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.homework.Homework;
import p289hu.ekreta.ellenorzo.homework.HomeworkDetailActivity;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/homework/Homework;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$loadHomework$4 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$loadHomework$4 extends Lambda implements Function1<Homework, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15255c;

    public TimeTableItemDetailViewModelImpl$loadHomework$4(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15255c = timeTableItemDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo16181a(final Homework homework) {
        this.f15255c.mo16376b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>() {
            /* renamed from: a */
            public final Intent invoke(Activity activity) {
                Intent a = C0082a.m88a(activity, "$receiver", activity, HomeworkDetailActivity.class);
                ExtensionsKt.m14640a(a, homework);
                return a;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16181a((Homework) obj);
        return Unit.INSTANCE;
    }
}
