package hu.ekreta.ellenorzo.profile.detail;

import android.widget.Toast;
import h.m.d.d;
import k.b.b0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$profile$2$1$2", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$$special$$inlined$also$lambda$2"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$2<T> implements f<Throwable> {
    public final /* synthetic */ ProfileDetailViewModelImpl$$special$$inlined$observable$1 c;

    public ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$2(ProfileDetailViewModelImpl$$special$$inlined$observable$1 profileDetailViewModelImpl$$special$$inlined$observable$1) {
        this.c = profileDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final void accept(final Throwable th) {
        this.c.c.a((Function1<? super d, Unit>) new Function1<d, Unit>() {
            public final void a(d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                Toast.makeText(dVar, th.getMessage(), 1).show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
