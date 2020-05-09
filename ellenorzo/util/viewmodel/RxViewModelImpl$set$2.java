package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "T", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RxViewModelImpl$set$2 */
/* compiled from: RxViewModelImpl.kt */
public final class RxViewModelImpl$set$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ RxViewModelImpl f15487c;

    public RxViewModelImpl$set$2(RxViewModelImpl rxViewModelImpl) {
        this.f15487c = rxViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo16416a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f15487c.mo16412M1().mo115b(th.getMessage());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16416a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
