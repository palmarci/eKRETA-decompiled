package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0003H&J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\tH&J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileDao;", "", "addProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "deepDeleteProfile", "Lio/reactivex/Completable;", "id", "", "getActiveProfile", "", "getAllProfiles", "instituteCode", "instituteUserId", "", "getProfile", "getProfilesByInstituteCode", "getProfilesByStudentId", "studentId", "setActiveProfile", "updateProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDao */
/* compiled from: ProfileDao.kt */
public interface ProfileDao {
    /* renamed from: a */
    C5027n<List<Profile>> mo14072a();

    /* renamed from: a */
    C5027n<List<Profile>> mo14073a(String str);

    /* renamed from: a */
    C5027n<List<Profile>> mo14074a(String str, int i);

    /* renamed from: b */
    C4667b mo14075b(String str);

    /* renamed from: b */
    C5027n<List<Profile>> mo14076b();

    /* renamed from: b */
    C5027n<List<Profile>> mo14077b(String str, int i);

    /* renamed from: c */
    C5027n<Profile> mo14078c(Profile profile);

    /* renamed from: c */
    C5027n<List<Profile>> mo14079c(String str);

    /* renamed from: d */
    C5027n<Profile> mo14080d(Profile profile);

    /* renamed from: f */
    C5027n<Profile> mo14081f(Profile profile);
}
