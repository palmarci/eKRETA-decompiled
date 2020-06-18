package hu.ekreta.ellenorzo.util.viewmodel;

import h.m.d.d;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$showAlert$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Function1 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Integer f6330g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function1 f6331h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataBindingViewModel$showAlert$1(int i2, Integer num, Function1 function1, Integer num2, Function1 function12) {
        super(1);
        this.c = i2;
        this.e = num;
        this.f = function1;
        this.f6330g = num2;
        this.f6331h = function12;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        ExtensionsKt.a(dVar, this.c, this.e, this.f, this.f6330g, this.f6331h);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
