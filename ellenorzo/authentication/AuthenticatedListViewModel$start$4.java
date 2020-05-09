package p289hu.ekreta.ellenorzo.authentication;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel$start$4 */
/* compiled from: AuthenticatedListViewModel.kt */
public final class AuthenticatedListViewModel$start$4 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticatedListViewModel f11200c;

    public AuthenticatedListViewModel$start$4(AuthenticatedListViewModel authenticatedListViewModel) {
        this.f11200c = authenticatedListViewModel;
        super(1);
    }

    /* renamed from: a */
    public final void mo11503a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.f11200c, th, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11503a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
