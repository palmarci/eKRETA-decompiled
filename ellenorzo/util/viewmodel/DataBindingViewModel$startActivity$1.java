package p289hu.ekreta.ellenorzo.util.viewmodel;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel$startActivity$1 */
/* compiled from: DataBindingViewModel.kt */
public final class DataBindingViewModel$startActivity$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ Function1 f15464c;

    public DataBindingViewModel$startActivity$1(Function1 function1) {
        this.f15464c = function1;
        super(1);
    }

    /* renamed from: a */
    public final void mo16388a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        Intent intent = (Intent) this.f15464c.invoke(dVar);
        if (intent != null) {
            dVar.startActivity(intent);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16388a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
