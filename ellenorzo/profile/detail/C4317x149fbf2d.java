package p289hu.ekreta.ellenorzo.profile.detail;

import android.widget.Toast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.profile.Profile;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo17463d2 = {"<anonymous>", "", "invoke", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$killRefreshToken$1$2"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$2 */
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class C4317x149fbf2d extends Lambda implements Function0<Unit> {

    /* renamed from: c */
    public final /* synthetic */ ProfileDetailViewModelImpl f14594c;

    public C4317x149fbf2d(ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        this.f14594c = profileDetailViewModelImpl;
        super(0);
    }

    public final void invoke() {
        this.f14594c.mo16373a((Function1<? super C3737d, Unit>) new Function1<C3737d, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ C4317x149fbf2d f14595c;

            {
                this.f14595c = r1;
            }

            /* renamed from: a */
            public final void mo14244a(C3737d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                StringBuilder sb = new StringBuilder();
                Profile P1 = this.f14595c.f14594c.mo14233P1();
                if (P1 == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(P1.mo14040D());
                sb.append(" refreshtoken is killed.");
                Toast.makeText(dVar, sb.toString(), 0).show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14244a((C3737d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
