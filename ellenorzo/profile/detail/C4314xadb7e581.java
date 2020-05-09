package p289hu.ekreta.ellenorzo.profile.detail;

import android.widget.Toast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p211h.p262m.p263d.C3737d;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$profile$2$1$2", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$$special$$inlined$also$lambda$2"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$2 */
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class C4314xadb7e581<T> implements C4673f<Throwable> {

    /* renamed from: c */
    public final /* synthetic */ ProfileDetailViewModelImpl$$special$$inlined$observable$1 f14591c;

    public C4314xadb7e581(ProfileDetailViewModelImpl$$special$$inlined$observable$1 profileDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f14591c = profileDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final void accept(final Throwable th) {
        this.f14591c.f14589c.mo16373a((Function1<? super C3737d, Unit>) new Function1<C3737d, Unit>() {
            /* renamed from: a */
            public final void mo14242a(C3737d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                Toast.makeText(dVar, th.getMessage(), 1).show();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14242a((C3737d) obj);
                return Unit.INSTANCE;
            }
        });
    }
}
