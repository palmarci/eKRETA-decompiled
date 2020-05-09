package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p296io.realm.RealmQuery;
import p300k.p313b.C4667b;
import p300k.p313b.C4996f;
import p300k.p313b.C5027n;
import p300k.p313b.p315b0.C4675h;
import p300k.p340c.C5061c0;
import p300k.p340c.C5074f0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\nH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\nH\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000b0 H\u0002J>\u0010!\u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u0006 #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\"0\"*\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JT\u0010$\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b #*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u0013 #*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b #*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u0013\u0018\u00010\n0\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006%"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileDaoImpl;", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "ENTITY", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "getENTITY", "()Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "addProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "deepDeleteProfile", "Lio/reactivex/Completable;", "id", "", "findEntityByPrimaryKey", "Lio/reactivex/Flowable;", "", "getActiveProfile", "getAllProfiles", "instituteCode", "instituteUserId", "", "getProfile", "getProfilesByInstituteCode", "getProfilesByStudentId", "studentId", "setActiveProfile", "updateProfile", "modification", "Lkotlin/Function1;", "primaryKeyEquals", "Lio/realm/RealmQuery;", "kotlin.jvm.PlatformType", "toProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl implements ProfileDao {

    /* renamed from: a */
    public final ProfileRealm f14491a;

    public ProfileDaoImpl(C5061c0 c0Var) {
        C5061c0 c0Var2 = c0Var;
        Intrinsics.checkParameterIsNotNull(c0Var2, "config");
        ProfileRealm profileRealm = new ProfileRealm(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        this.f14491a = profileRealm;
        C2769b.f6264b.mo5214a(ProfileRealm.class, c0Var2);
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14072a() {
        C5027n<List<Profile>> a = mo14083a(C3984v.m10195a((C5074f0) this.f14491a, false, 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAllAsFlowable().toProfile()");
        return a;
    }

    /* renamed from: b */
    public C5027n<List<Profile>> mo14077b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        C5027n<List<Profile>> a = mo14083a(C3984v.m10196a((C5074f0) this.f14491a, false, (Function1) new ProfileDaoImpl$getProfilesByStudentId$1(str, i), 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAsFlowable {…())\n        }.toProfile()");
        return a;
    }

    /* renamed from: c */
    public C5027n<List<Profile>> mo14079c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        C5027n<List<Profile>> a = mo14083a(C3984v.m10196a((C5074f0) this.f14491a, false, (Function1) new ProfileDaoImpl$findEntityByPrimaryKey$1(this, str), 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "findEntityByPrimaryKey(id).toProfile()");
        return a;
    }

    /* renamed from: d */
    public C5027n<Profile> mo14080d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return ExtensionsKt.m14633a((C5074f0) this.f14491a, (Function1<? super C5179y, ? extends R>) new ProfileDaoImpl$setActiveProfile$1<Object,Object>(profile));
    }

    /* renamed from: f */
    public C5027n<Profile> mo14081f(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return ExtensionsKt.m14633a((C5074f0) this.f14491a, (Function1<? super C5179y, ? extends R>) new ProfileDaoImpl$addProfile$1<Object,Object>(profile));
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14074a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        C5027n<List<Profile>> a = mo14083a(C3984v.m10196a((C5074f0) this.f14491a, false, (Function1) new ProfileDaoImpl$getAllProfiles$1(str, i), 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAsFlowable {…())\n        }.toProfile()");
        return a;
    }

    /* renamed from: b */
    public C5027n<List<Profile>> mo14076b() {
        C5027n<List<Profile>> a = mo14083a(C3984v.m10196a((C5074f0) this.f14491a, false, (Function1) ProfileDaoImpl$getActiveProfile$1.INSTANCE, 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAsFlowable {…ive\", true) }.toProfile()");
        return a;
    }

    /* renamed from: c */
    public C5027n<Profile> mo14078c(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return ExtensionsKt.m14633a((C5074f0) this.f14491a, (Function1<? super C5179y, ? extends R>) new ProfileDaoImpl$updateProfile$2<Object,Object>(this, profile.mo14054m(), new ProfileDaoImpl$updateProfile$1(profile)));
    }

    /* renamed from: a */
    public C5027n<List<Profile>> mo14073a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        C5027n<List<Profile>> a = mo14083a(C3984v.m10196a((C5074f0) this.f14491a, false, (Function1) new ProfileDaoImpl$getProfilesByInstituteCode$1(str), 1));
        Intrinsics.checkExpressionValueIsNotNull(a, "ENTITY.queryAsFlowable {…de)\n        }.toProfile()");
        return a;
    }

    /* renamed from: b */
    public C4667b mo14075b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        C4667b e = ExtensionsKt.m14633a((C5074f0) this.f14491a, (Function1<? super C5179y, ? extends R>) new ProfileDaoImpl$deepDeleteProfile$1<Object,Object>(str)).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e, "ENTITY.executeTransactio…       }.ignoreElements()");
        return e;
    }

    /* renamed from: a */
    public final RealmQuery<ProfileRealm> mo14082a(RealmQuery<ProfileRealm> realmQuery, String str) {
        realmQuery.mo16476a("profileId", str);
        return realmQuery;
    }

    /* renamed from: a */
    public final C5027n<List<Profile>> mo14083a(C4996f<List<ProfileRealm>> fVar) {
        return fVar.mo17165a((C4675h<? super T, ? extends R>) ProfileDaoImpl$toProfile$1.INSTANCE).mo17172b();
    }
}
