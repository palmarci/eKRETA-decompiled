package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profiles", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl$updateProfile$3 */
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$3<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ UpdateProfileStrategyImpl f14552c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14553e;

    public UpdateProfileStrategyImpl$updateProfile$3(UpdateProfileStrategyImpl updateProfileStrategyImpl, Profile profile) {
        this.f14552c = updateProfileStrategyImpl;
        this.f14553e = profile;
    }

    /* renamed from: a */
    public final C5027n<Profile> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "profiles");
        Profile profile = (Profile) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (profile == null) {
            return this.f14552c.f14544a.mo14200f(this.f14553e);
        }
        return this.f14552c.f14544a.mo14193c(Profile.copy$default(this.f14553e, null, null, profile.mo14044e(), null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777211, null));
    }
}
