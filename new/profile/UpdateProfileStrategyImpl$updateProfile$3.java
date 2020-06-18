package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.authentication.SupportedRole;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profiles", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$3<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ UpdateProfileStrategyImpl c;
    public final /* synthetic */ Profile e;

    public UpdateProfileStrategyImpl$updateProfile$3(UpdateProfileStrategyImpl updateProfileStrategyImpl, Profile profile) {
        this.c = updateProfileStrategyImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<Profile> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "profiles");
        Profile profile = (Profile) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (profile == null) {
            return this.c.f6031a.f(this.e);
        }
        return this.c.f6031a.c(Profile.copy$default(this.e, (String) null, (String) null, profile.e(), (String) null, (String) null, 0, (String) null, (String) null, (SupportedRole) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Calendar) null, (String) null, (String) null, (List) null, (Calendar) null, (String) null, (String) null, false, 16777211, (Object) null));
    }
}
