package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p315b0.C4676i;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\nH\u0016J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\n2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001bH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00170\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0018\u0010'\u001a\n \u000f*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J*\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\n2\u0006\u0010\u001e\u001a\u00020\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR5\u0010\u000e\u001a&\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b \u000f*\u0012\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileRepositoryImpl;", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "profileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "guardianDao", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "deleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "(Lhu/ekreta/ellenorzo/profile/ProfileDao;Lhu/ekreta/ellenorzo/profile/GuardianDao;Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;)V", "activeProfileObservable", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getActiveProfileObservable", "()Lio/reactivex/Observable;", "activeProfileSource", "kotlin.jvm.PlatformType", "getActiveProfileSource", "addProfile", "profile", "deleteProfile", "Lio/reactivex/Completable;", "getActiveProfile", "getAllProfiles", "", "instituteCode", "", "instituteUserId", "", "getGuardiansByProfileId", "Lhu/ekreta/ellenorzo/profile/Guardian;", "profileId", "getGuardiansByStudentId", "studentId", "getProfileById", "id", "getProfilesByInstituteCode", "hasActiveProfile", "Lio/reactivex/Single;", "", "setActiveProfile", "setGuardiansForProfile", "guardianList", "updateProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileRepositoryImpl */
/* compiled from: ProfileRepositoryImpl.kt */
public final class ProfileRepositoryImpl implements ProfileRepository {

    /* renamed from: a */
    public final C5027n<Profile> f14533a = this.f14535c.mo14076b().mo17211a((C4676i<? super T>) ProfileRepositoryImpl$activeProfileSource$1.INSTANCE).mo17246g(ProfileRepositoryImpl$activeProfileSource$2.INSTANCE);

    /* renamed from: b */
    public final C5027n<Profile> f14534b;

    /* renamed from: c */
    public final ProfileDao f14535c;

    /* renamed from: d */
    public final GuardianDao f14536d;

    /* renamed from: e */
    public final DeleteProfileStrategy f14537e;

    public ProfileRepositoryImpl(ProfileDao profileDao, GuardianDao guardianDao, DeleteProfileStrategy deleteProfileStrategy) {
        Intrinsics.checkParameterIsNotNull(profileDao, "profileDao");
        Intrinsics.checkParameterIsNotNull(guardianDao, "guardianDao");
        Intrinsics.checkParameterIsNotNull(deleteProfileStrategy, "deleteProfileStrategy");
        this.f14535c = profileDao;
        this.f14536d = guardianDao;
        this.f14537e = deleteProfileStrategy;
        C5027n<Profile> m = this.f14533a.mo17219b(1).mo17161m();
        Intrinsics.checkExpressionValueIsNotNull(m, "activeProfileSource.replay(1).refCount()");
        this.f14534b = m;
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14187a() {
        return this.f14535c.mo14072a();
    }

    /* renamed from: b */
    public C5027n<Profile> mo14191b() {
        C5027n<Profile> d = this.f14533a.mo17237d(1);
        Intrinsics.checkExpressionValueIsNotNull(d, "activeProfileSource.take(1)");
        return d;
    }

    /* renamed from: c */
    public C5027n<Profile> mo14193c(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14535c.mo14078c(profile);
    }

    /* renamed from: d */
    public C5036u<Boolean> mo14196d() {
        C5036u<Boolean> d = this.f14535c.mo14076b().mo17246g(ProfileRepositoryImpl$hasActiveProfile$1.INSTANCE).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "profileDao.getActiveProf…tEmpty() }.firstOrError()");
        return d;
    }

    /* renamed from: e */
    public C5027n<Profile> mo14198e() {
        return this.f14534b;
    }

    /* renamed from: f */
    public C5027n<Profile> mo14200f(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14535c.mo14081f(profile);
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14188a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.f14535c.mo14073a(str);
    }

    /* renamed from: b */
    public C5027n<List<Profile>> mo14192b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.f14535c.mo14077b(str, i);
    }

    /* renamed from: d */
    public C5027n<List<Profile>> mo14195d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return this.f14535c.mo14079c(str);
    }

    /* renamed from: e */
    public C4667b mo14197e(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14537e.mo14011e(profile);
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14189a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        return this.f14535c.mo14074a(str, i);
    }

    /* renamed from: d */
    public C4667b mo14194d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14535c.mo14080d(profile).mo17209a((C4675h<? super T, ? extends C5030q<? extends R>>) ProfileRepositoryImpl$setActiveProfile$1.INSTANCE, false, 1).mo17241e();
    }

    /* renamed from: e */
    public C5027n<List<Guardian>> mo14199e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f14536d.mo16312a(str);
    }

    /* renamed from: a */
    public C5027n<List<Guardian>> mo14190a(String str, List<Guardian> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "guardianList");
        return this.f14536d.mo13307a(str, list);
    }
}
