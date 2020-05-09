package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo17463d2 = {"<anonymous>", "", "throwable", "", "invoke", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$refreshList$1$5"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkDetailViewModelImpl f13483c;

    public HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        this.f13483c = homeworkDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12967a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        DataBindingViewModel.showError$default(this.f13483c, th, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12967a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
