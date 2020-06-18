package hu.ekreta.ellenorzo.main;

import a.a.a.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$changeProfile$3 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ MainViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainViewModelImpl$changeProfile$3(MainViewModelImpl mainViewModelImpl) {
        super(1);
        this.c = mainViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showAlert$default(this.c, R.string.no_profile_for_push, (Integer) null, new Function1<f, Unit>(this) {
            public final /* synthetic */ MainViewModelImpl$changeProfile$3 c;

            {
                this.c = r1;
            }

            public final void a(f fVar) {
                Intrinsics.checkParameterIsNotNull(fVar, "it");
                this.c.c.Y1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((f) obj);
                return Unit.INSTANCE;
            }
        }, (Integer) null, (Function1) null, 26, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
