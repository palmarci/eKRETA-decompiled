package hu.ekreta.ellenorzo.profile.detail;

import hu.ekreta.ellenorzo.profile.Guardian;
import java.util.List;
import k.b.b0.f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/profile/Guardian;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$profile$2$1$1", "hu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModelImpl$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModelImpl.kt */
public final class ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$1<T> implements f<List<? extends Guardian>> {
    public final /* synthetic */ ProfileDetailViewModelImpl$$special$$inlined$observable$1 c;

    public ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(ProfileDetailViewModelImpl$$special$$inlined$observable$1 profileDetailViewModelImpl$$special$$inlined$observable$1) {
        this.c = profileDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final void accept(List<Guardian> list) {
        this.c.c.getGuardianList().setValue(list);
    }
}
