package p289hu.ekreta.ellenorzo.authentication;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.Error;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.LocalData;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.RefreshFinished;
import p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent.RefreshStarted;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "T", "it", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel$start$3 */
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$3 extends Lambda implements Function1<RefreshEvent<List<? extends T>>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedListViewModel f11199c;

    public AuthenticatedListViewModel$start$3(AuthenticatedListViewModel authenticatedListViewModel) {
        this.f11199c = authenticatedListViewModel;
        super(1);
    }

    /* renamed from: a */
    public final void mo11502a(RefreshEvent<List<T>> refreshEvent) {
        Intrinsics.checkParameterIsNotNull(refreshEvent, "it");
        if (refreshEvent instanceof LocalData) {
            List list = (List) ((LocalData) refreshEvent).mo16408a();
            this.f11199c.getItems().setValue(list);
            this.f11199c.mo11491b(list.isEmpty());
            AuthenticatedListViewModel authenticatedListViewModel = this.f11199c;
            authenticatedListViewModel.mo11492c(!authenticatedListViewModel.mo11496f());
        } else if (refreshEvent instanceof Error) {
            this.f11199c.mo11489a(((Error) refreshEvent).mo16403a());
            this.f11199c.mo11493d(false);
        } else if (refreshEvent instanceof RefreshStarted) {
            this.f11199c.mo11493d(true);
        } else if (refreshEvent instanceof RefreshFinished) {
            this.f11199c.mo11493d(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11502a((RefreshEvent) obj);
        return Unit.INSTANCE;
    }
}
