package hu.ekreta.ellenorzo.profile;

import java.util.List;
import k.b.b;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H&J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\tH&J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileDao;", "", "addProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "deepDeleteProfile", "Lio/reactivex/Completable;", "id", "", "getActiveProfile", "", "getAllProfiles", "instituteCode", "instituteUserId", "", "getProfile", "getProfilesByInstituteCode", "getProfilesByStudentId", "studentId", "setActiveProfile", "updateProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileDao.kt */
public interface ProfileDao {
    n<List<Profile>> a();

    n<List<Profile>> a(String str);

    n<List<Profile>> a(String str, int i2);

    b b(String str);

    n<List<Profile>> b();

    n<List<Profile>> b(String str, int i2);

    n<Profile> c(Profile profile);

    n<List<Profile>> c(String str);

    n<Profile> d(Profile profile);

    n<Profile> f(Profile profile);
}
