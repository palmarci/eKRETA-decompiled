package hu.ekreta.ellenorzo.timetable.detail;

import a.k.a.c;
import android.content.Intent;
import h.m.d.d;
import hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.Calendar;
import java.util.List;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$addHomework$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ TimeTableItemDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl$addHomework$1(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        super(1);
        this.c = timeTableItemDetailViewModelImpl;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        Intent intent = new Intent(dVar, HomeworkCommentFormActivity.class);
        TimeTableItem Z1 = this.c.Z1();
        ExtensionsKt.c(intent, Z1 != null ? Z1.B() : null);
        n<R> b = ((c) this.c.C.get()).f2809a.a(intent).a(AnonymousClass1.INSTANCE).b(AnonymousClass2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(b, "rxActivityResultProvider…bservable.just(it.data) }");
        b.a(b, (Function1) null, (Function0) null, new Function1<Intent, Unit>(this) {
            public final /* synthetic */ TimeTableItemDetailViewModelImpl$addHomework$1 c;

            {
                this.c = r1;
            }

            public final void a(Intent intent) {
                TimeTableItem timeTableItem;
                TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.c.c;
                TimeTableItem Z1 = timeTableItemDetailViewModelImpl.Z1();
                if (Z1 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(intent, "it");
                    timeTableItem = TimeTableItem.copy$default(Z1, (String) null, (String) null, (String) null, (Calendar) null, (Integer) null, (Calendar) null, (Calendar) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (List) null, String.valueOf(ExtensionsKt.f(intent)), 8388607, (Object) null);
                } else {
                    timeTableItem = null;
                }
                timeTableItemDetailViewModelImpl.a(timeTableItem);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Intent) obj);
                return Unit.INSTANCE;
            }
        }, 3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
