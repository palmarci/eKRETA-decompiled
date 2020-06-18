package hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$updateProfile$1 extends Lambda implements Function1<ProfileRealm, Profile> {
    public final /* synthetic */ Profile c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDaoImpl$updateProfile$1(Profile profile) {
        super(1);
        this.c = profile;
    }

    /* renamed from: a */
    public final Profile invoke(ProfileRealm profileRealm) {
        Profile profile = this.c;
        if (profileRealm != null) {
            profileRealm.i1(profile.D());
            profileRealm.f(profile.e());
            profileRealm.X0(profile.d());
            profileRealm.h1(profile.C());
            profileRealm.j(Integer.valueOf(profile.k()));
            profileRealm.d1(profile.u());
            profileRealm.g1(profile.z());
            profileRealm.e1(profile.v().a());
            profileRealm.Z0(profile.o());
            profileRealm.Y0(profile.n());
            profileRealm.b1(profile.q());
            profileRealm.a1(profile.p());
            profileRealm.f1(profile.x());
            profileRealm.c1(profile.s());
            profileRealm.j(Boolean.valueOf(profile.j()));
        }
        return profile;
    }
}
