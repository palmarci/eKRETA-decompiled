package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$4 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ AuthenticatedListViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedListViewModel$start$4(AuthenticatedListViewModel authenticatedListViewModel) {
        super(1);
        this.c = authenticatedListViewModel;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.c.e(false);
        DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
