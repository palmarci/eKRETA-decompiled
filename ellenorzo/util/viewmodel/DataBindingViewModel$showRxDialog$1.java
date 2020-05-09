package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p001a.p002a.C0006f;
import p211h.p262m.p263d.C3737d;
import p300k.p313b.C5037v;
import p300k.p313b.C5039x;
import p300k.p313b.p315b0.C4672e;
import p300k.p313b.p316c0.p321e.p327f.C4914a.C4915a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel$showRxDialog$1 */
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$showRxDialog$1<T> implements C5039x<T> {

    /* renamed from: a */
    public final /* synthetic */ DataBindingViewModel f15456a;

    /* renamed from: b */
    public final /* synthetic */ Integer f15457b;

    /* renamed from: c */
    public final /* synthetic */ Integer f15458c;

    /* renamed from: d */
    public final /* synthetic */ Integer f15459d;

    /* renamed from: e */
    public final /* synthetic */ Integer f15460e;

    public DataBindingViewModel$showRxDialog$1(DataBindingViewModel dataBindingViewModel, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15456a = dataBindingViewModel;
        this.f15457b = num;
        this.f15458c = num2;
        this.f15459d = num3;
        this.f15460e = num4;
    }

    /* renamed from: a */
    public final void mo12319a(final C5037v<Integer> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "emitter");
        this.f15456a.mo16373a((Function1<? super C3737d, Unit>) new Function1<C3737d, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ DataBindingViewModel$showRxDialog$1 f15461c;

            {
                this.f15461c = r1;
            }

            /* renamed from: a */
            public final void mo16386a(C3737d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                C0006f fVar = new C0006f(dVar, null, 2);
                fVar.mo14a(false);
                fVar.setOnDismissListener(new C4437x5ce7731c(this));
                Integer num = this.f15461c.f15457b;
                if (num != null) {
                    C0006f.m11c(fVar, Integer.valueOf(num.intValue()), null, null, 6);
                    C0006f.m11c(fVar, null, null, new C4438x5ce7731d(fVar, this), 3);
                }
                Integer num2 = this.f15461c.f15458c;
                if (num2 != null) {
                    C0006f.m10b(fVar, Integer.valueOf(num2.intValue()), null, null, 6);
                    C0006f.m10b(fVar, null, null, new C4439x5ce7731e(fVar, this), 3);
                }
                Integer num3 = this.f15461c.f15459d;
                if (num3 != null) {
                    C0006f.m8a(fVar, Integer.valueOf(num3.intValue()), null, null, 6);
                }
                Integer num4 = this.f15461c.f15460e;
                if (num4 != null) {
                    fVar.mo13a(Integer.valueOf(num4.intValue()), (String) null);
                }
                ((C4915a) vVar).mo17117a((C4672e) new DataBindingViewModel$showRxDialog$1$1$1$6(fVar));
                fVar.show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo16386a((C3737d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
