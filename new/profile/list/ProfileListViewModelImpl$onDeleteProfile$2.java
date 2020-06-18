package hu.ekreta.ellenorzo.profile.list;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.exception.MessageThrowable;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileListViewModelImpl.kt */
public final class ProfileListViewModelImpl$onDeleteProfile$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ ProfileListViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileListViewModelImpl$onDeleteProfile$2(ProfileListViewModelImpl profileListViewModelImpl) {
        super(1);
        this.c = profileListViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.c, new MessageThrowable(R.string.error_delete_profile_message), (Integer) null, (Function1) null, 6, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
