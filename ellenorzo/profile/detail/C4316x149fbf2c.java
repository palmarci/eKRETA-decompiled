package p289hu.ekreta.ellenorzo.profile.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$killRefreshToken$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$1 */
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class C4316x149fbf2c extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ ProfileDetailViewModelImpl f14593c;

    public C4316x149fbf2c(ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        this.f14593c = profileDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo14243a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f14593c.mo16412M1().mo118d(th.getMessage(), th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo14243a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
