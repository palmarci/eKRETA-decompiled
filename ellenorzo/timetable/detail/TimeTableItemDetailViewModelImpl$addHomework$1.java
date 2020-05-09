package p289hu.ekreta.ellenorzo.timetable.detail;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormActivity;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p315b0.C4676i;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$addHomework$1 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$addHomework$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15244c;

    public TimeTableItemDetailViewModelImpl$addHomework$1(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15244c = timeTableItemDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo16170a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        Intent intent = new Intent(dVar, HomeworkCommentFormActivity.class);
        TimeTableItem P1 = this.f15244c.mo16156P1();
        ExtensionsKt.m14666c(intent, P1 != null ? P1.mo15995B() : null);
        C5027n b = ((C2676c) this.f15244c.f15223B.get()).f6080a.mo5054a(intent).mo17256a((C4676i<? super T>) C43941.INSTANCE).mo17188b((C4675h<? super T, ? extends C5030q<? extends R>>) C43952.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(b, "rxActivityResultProvider…bservable.just(it.data) }");
        C4998b.m16842a(b, (Function1) null, (Function0) null, (Function1) new Function1<Intent, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ TimeTableItemDetailViewModelImpl$addHomework$1 f15245c;

            {
                this.f15245c = r1;
            }

            /* renamed from: a */
            public final void mo16173a(Intent intent) {
                TimeTableItem timeTableItem;
                TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.f15245c.f15244c;
                TimeTableItem P1 = timeTableItemDetailViewModelImpl.mo16156P1();
                if (P1 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(intent, "it");
                    timeTableItem = TimeTableItem.copy$default(P1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, String.valueOf(ExtensionsKt.m14668e(intent)), 8388607, null);
                } else {
                    timeTableItem = null;
                }
                timeTableItemDetailViewModelImpl.mo16149a(timeTableItem);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo16173a((Intent) obj);
                return Unit.INSTANCE;
            }
        }, 3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16170a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
