package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "invoke", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$refreshList$1$5"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        super(1);
        this.c = homeworkDetailViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
