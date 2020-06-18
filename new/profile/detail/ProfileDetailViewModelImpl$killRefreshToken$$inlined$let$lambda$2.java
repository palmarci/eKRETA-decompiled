package hu.ekreta.ellenorzo.profile.detail;

import android.widget.Toast;
import h.m.d.d;
import hu.ekreta.ellenorzo.profile.Profile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$killRefreshToken$1$2"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ ProfileDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$2(ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        super(0);
        this.c = profileDetailViewModelImpl;
    }

    public final void invoke() {
        this.c.a((Function1<? super d, Unit>) new Function1<d, Unit>(this) {
            public final /* synthetic */ ProfileDetailViewModelImpl$killRefreshToken$$inlined$let$lambda$2 c;

            {
                this.c = r1;
            }

            public final void a(d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                StringBuilder sb = new StringBuilder();
                Profile Z1 = this.c.c.Z1();
                if (Z1 == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(Z1.D());
                sb.append(" refreshtoken is killed.");
                Toast.makeText(dVar, sb.toString(), 0).show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
