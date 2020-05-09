package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel$showAlert$1 */
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$showAlert$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ int f15450c;

    /* renamed from: e */
    public final /* synthetic */ Integer f15451e;

    /* renamed from: f */
    public final /* synthetic */ Function1 f15452f;

    public DataBindingViewModel$showAlert$1(int i, Integer num, Function1 function1) {
        this.f15450c = i;
        this.f15451e = num;
        this.f15452f = function1;
        super(1);
    }

    /* renamed from: a */
    public final void mo16384a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        ExtensionsKt.m14880a(dVar, this.f15450c, this.f15451e, this.f15452f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16384a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
