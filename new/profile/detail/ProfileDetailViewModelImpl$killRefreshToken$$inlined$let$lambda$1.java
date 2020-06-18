package hu.ekreta.ellenorzo.profile.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$killRefreshToken$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ ProfileDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$1(ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        super(1);
        this.c = profileDetailViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.c.V1().c(th.getMessage(), th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
