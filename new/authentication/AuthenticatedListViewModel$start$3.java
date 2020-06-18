package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$3 extends Lambda implements Function1<RefreshEvent<List<? extends T>>, Unit> {
    public final /* synthetic */ AuthenticatedListViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedListViewModel$start$3(AuthenticatedListViewModel authenticatedListViewModel) {
        super(1);
        this.c = authenticatedListViewModel;
    }

    public final void a(RefreshEvent<List<T>> refreshEvent) {
        Intrinsics.checkParameterIsNotNull(refreshEvent, "it");
        if (refreshEvent instanceof RefreshEvent.LocalData) {
            List list = (List) ((RefreshEvent.LocalData) refreshEvent).a();
            this.c.getItems().setValue(list);
            this.c.c(list.isEmpty());
            AuthenticatedListViewModel authenticatedListViewModel = this.c;
            authenticatedListViewModel.d(!authenticatedListViewModel.f());
        } else if (refreshEvent instanceof RefreshEvent.Error) {
            this.c.a(((RefreshEvent.Error) refreshEvent).a());
            this.c.e(false);
        } else if (refreshEvent instanceof RefreshEvent.RefreshStarted) {
            this.c.e(true);
        } else if (refreshEvent instanceof RefreshEvent.RefreshFinished) {
            this.c.e(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RefreshEvent) obj);
        return Unit.INSTANCE;
    }
}
