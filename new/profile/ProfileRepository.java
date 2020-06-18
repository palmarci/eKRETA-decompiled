package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.b;
import k.b.n;
import k.b.u;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u0004H&J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u00042\u0006\u0010\u0014\u001a\u00020\u000fH&J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H&J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u00042\u0006\u0010\u0018\u001a\u00020\u000fH&J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u00042\u0006\u0010\u000e\u001a\u00020\u000fH&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H&J*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u00042\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\rH&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006!"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/profile/Profile;", "activeProfileObservable", "Lio/reactivex/Observable;", "getActiveProfileObservable", "()Lio/reactivex/Observable;", "addProfile", "profile", "deleteProfile", "Lio/reactivex/Completable;", "getActiveProfile", "getAllProfiles", "", "instituteCode", "", "instituteUserId", "", "getGuardiansByProfileId", "Lhu/ekreta/ellenorzo/profile/Guardian;", "profileId", "getGuardiansByStudentId", "studentId", "getProfileById", "id", "getProfilesByInstituteCode", "hasActiveProfile", "Lio/reactivex/Single;", "", "setActiveProfile", "setGuardiansForProfile", "guardianList", "updateProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileRepository.kt */
public interface ProfileRepository extends Repository<Profile> {
    n<List<Profile>> a();

    n<List<Profile>> a(String str);

    n<List<Profile>> a(String str, int i2);

    n<List<Guardian>> a(String str, List<Guardian> list);

    n<Profile> b();

    n<List<Profile>> b(String str, int i2);

    n<Profile> c(Profile profile);

    b d(Profile profile);

    n<List<Profile>> d(String str);

    u<Boolean> d();

    b e(Profile profile);

    n<Profile> e();

    n<List<Guardian>> e(String str);

    n<Profile> f(Profile profile);
}
