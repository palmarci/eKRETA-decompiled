package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$updateProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$updateProfile$1 extends Lambda implements Function1<ProfileRealm, Profile> {

    /* renamed from: c */
    public final /* synthetic */ Profile f14502c;

    public ProfileDaoImpl$updateProfile$1(Profile profile) {
        this.f14502c = profile;
        super(1);
    }

    /* renamed from: a */
    public final Profile invoke(ProfileRealm profileRealm) {
        Profile profile = this.f14502c;
        if (profileRealm != null) {
            profileRealm.mo14155i1(profile.mo14040D());
            profileRealm.mo14139f(profile.mo14044e());
            profileRealm.mo14118X0(profile.mo14042d());
            profileRealm.mo14150h1(profile.mo14039C());
            profileRealm.mo14157j(Integer.valueOf(profile.mo14052k()));
            profileRealm.mo14133d1(profile.mo14063u());
            profileRealm.mo14147g1(profile.mo14069z());
            profileRealm.mo14137e1(profile.mo14064v().mo11567a());
            profileRealm.mo14123Z0(profile.mo14056o());
            profileRealm.mo14119Y0(profile.mo14055n());
            profileRealm.mo14129b1(profile.mo14058q());
            profileRealm.mo14128a1(profile.mo14057p());
            profileRealm.mo14141f1(profile.mo14067x());
            profileRealm.mo14132c1(profile.mo14060s());
            profileRealm.mo14152i(Boolean.valueOf(profile.mo14051j()));
        }
        return profile;
    }
}
