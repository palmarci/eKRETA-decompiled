package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.UiCommandKt$once$1 */
/* compiled from: UiCommand.kt */
public final class UiCommandKt$once$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ BooleanRef f15488c;

    /* renamed from: e */
    public final /* synthetic */ Function1 f15489e;

    public UiCommandKt$once$1(BooleanRef booleanRef, Function1 function1) {
        this.f15488c = booleanRef;
        this.f15489e = function1;
        super(1);
    }

    /* renamed from: a */
    public final void mo16417a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        BooleanRef booleanRef = this.f15488c;
        if (booleanRef.element) {
            booleanRef.element = false;
            this.f15489e.invoke(dVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16417a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
