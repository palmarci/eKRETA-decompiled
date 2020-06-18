package hu.ekreta.ellenorzo.util.viewmodel;

import a.a.a.b;
import a.a.a.f;
import h.m.d.d;
import k.b.b0.e;
import k.b.c0.e.f.a;
import k.b.v;
import k.b.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$showRxDialog$1<T> implements x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DataBindingViewModel f6332a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ Integer c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Integer f6333d;
    public final /* synthetic */ Integer e;

    public DataBindingViewModel$showRxDialog$1(DataBindingViewModel dataBindingViewModel, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f6332a = dataBindingViewModel;
        this.b = num;
        this.c = num2;
        this.f6333d = num3;
        this.e = num4;
    }

    public final void a(final v<Integer> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "emitter");
        this.f6332a.a((Function1<? super d, Unit>) new Function1<d, Unit>(this) {
            public final /* synthetic */ DataBindingViewModel$showRxDialog$1 c;

            {
                this.c = r1;
            }

            public final void a(d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                f fVar = new f(dVar, (b) null, 2);
                fVar.a(false);
                fVar.setOnDismissListener(new DataBindingViewModel$showRxDialog$1$1$$special$$inlined$apply$lambda$1(this));
                Integer num = this.c.b;
                if (num != null) {
                    f.c(fVar, Integer.valueOf(num.intValue()), (CharSequence) null, (Function1) null, 6);
                    f.c(fVar, (Integer) null, (CharSequence) null, new DataBindingViewModel$showRxDialog$1$1$$special$$inlined$apply$lambda$2(fVar, this), 3);
                }
                Integer num2 = this.c.c;
                if (num2 != null) {
                    f.b(fVar, Integer.valueOf(num2.intValue()), (CharSequence) null, (Function1) null, 6);
                    f.b(fVar, (Integer) null, (CharSequence) null, new DataBindingViewModel$showRxDialog$1$1$$special$$inlined$apply$lambda$3(fVar, this), 3);
                }
                Integer num3 = this.c.f6333d;
                if (num3 != null) {
                    f.a(fVar, Integer.valueOf(num3.intValue()), (CharSequence) null, (Function1) null, 6);
                }
                Integer num4 = this.c.e;
                if (num4 != null) {
                    f.a(fVar, Integer.valueOf(num4.intValue()), (String) null, 2);
                }
                ((a.C0123a) vVar).a((e) new DataBindingViewModel$showRxDialog$1$1$1$6(fVar));
                fVar.show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
