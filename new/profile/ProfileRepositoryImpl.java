package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\nH\u0016J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\n2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001bH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0018\u0010'\u001a\n \u000f*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J*\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\n2\u0006\u0010\u001e\u001a\u00020\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR5\u0010\u000e\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileRepositoryImpl;", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "profileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "guardianDao", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "deleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "(Lhu/ekreta/ellenorzo/profile/ProfileDao;Lhu/ekreta/ellenorzo/profile/GuardianDao;Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;)V", "activeProfileObservable", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getActiveProfileObservable", "()Lio/reactivex/Observable;", "activeProfileSource", "kotlin.jvm.PlatformType", "getActiveProfileSource", "addProfile", "profile", "deleteProfile", "Lio/reactivex/Completable;", "getActiveProfile", "getAllProfiles", "", "instituteCode", "", "instituteUserId", "", "getGuardiansByProfileId", "Lhu/ekreta/ellenorzo/profile/Guardian;", "profileId", "getGuardiansByStudentId", "studentId", "getProfileById", "id", "getProfilesByInstituteCode", "hasActiveProfile", "Lio/reactivex/Single;", "", "setActiveProfile", "setGuardiansForProfile", "guardianList", "updateProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileRepositoryImpl.kt */
public final class ProfileRepositoryImpl implements ProfileRepository {

    /* renamed from: a  reason: collision with root package name */
    public final n<Profile> f6026a = this.c.b().a(ProfileRepositoryImpl$activeProfileSource$1.INSTANCE).g(ProfileRepositoryImpl$activeProfileSource$2.INSTANCE);
    public final n<Profile> b;
    public final ProfileDao c;

    /* renamed from: d  reason: collision with root package name */
    public final GuardianDao f6027d;
    public final DeleteProfileStrategy e;

    public ProfileRepositoryImpl(ProfileDao profileDao, GuardianDao guardianDao, DeleteProfileStrategy deleteProfileStrategy) {
        Intrinsics.checkParameterIsNotNull(profileDao, "profileDao");
        Intrinsics.checkParameterIsNotNull(guardianDao, "guardianDao");
        Intrinsics.checkParameterIsNotNull(deleteProfileStrategy, "deleteProfileStrategy");
        this.c = profileDao;
        this.f6027d = guardianDao;
        this.e = deleteProfileStrategy;
        n<Profile> m2 = this.f6026a.b(1).m();
        Intrinsics.checkExpressionValueIsNotNull(m2, "activeProfileSource.replay(1).refCount()");
        this.b = m2;
    }

    public n<List<Profile>> a() {
        return this.c.a();
    }

    public n<Profile> b() {
        n<Profile> d2 = this.f6026a.d(1);
        Intrinsics.checkExpressionValueIsNotNull(d2, "activeProfileSource.take(1)");
        return d2;
    }

    public n<Profile> c(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.c(profile);
    }

    public u<Boolean> d() {
        u<R> d2 = this.c.b().g(ProfileRepositoryImpl$hasActiveProfile$1.INSTANCE).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "profileDao.getActiveProf…tEmpty() }.firstOrError()");
        return d2;
    }

    public n<Profile> e() {
        return this.b;
    }

    public n<Profile> f(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.f(profile);
    }

    public n<List<Profile>> a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.c.a(str);
    }

    public n<List<Profile>> b(String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.c.b(str, i2);
    }

    public n<List<Profile>> d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return this.c.c(str);
    }

    public b e(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.e.e(profile);
    }

    public n<List<Profile>> a(String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.c.a(str, i2);
    }

    public b d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.d(profile).a(ProfileRepositoryImpl$setActiveProfile$1.INSTANCE, false, 1).e();
    }

    public n<List<Guardian>> e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f6027d.a(str);
    }

    public n<List<Guardian>> a(String str, List<Guardian> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "guardianList");
        return this.f6027d.a(str, list);
    }
}
