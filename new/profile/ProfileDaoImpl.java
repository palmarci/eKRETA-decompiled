package hu.ekreta.ellenorzo.profile;

import a.q.a.b;
import h.w.v;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import io.realm.RealmQuery;
import java.util.Date;
import java.util.List;
import k.b.b0.h;
import k.b.f;
import k.b.n;
import k.c.c0;
import k.c.d0;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\nH\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\nH\u0016J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000b0 H\u0002J>\u0010!\u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u0006 #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\"0\"*\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JT\u0010$\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b #*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u0013 #*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b #*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u0013\u0018\u00010\n0\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006%"}, d2 = {"Lhu/ekreta/ellenorzo/profile/ProfileDaoImpl;", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "ENTITY", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "getENTITY", "()Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "addProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "profile", "deepDeleteProfile", "Lio/reactivex/Completable;", "id", "", "findEntityByPrimaryKey", "Lio/reactivex/Flowable;", "", "getActiveProfile", "getAllProfiles", "instituteCode", "instituteUserId", "", "getProfile", "getProfilesByInstituteCode", "getProfilesByStudentId", "studentId", "setActiveProfile", "updateProfile", "modification", "Lkotlin/Function1;", "primaryKeyEquals", "Lio/realm/RealmQuery;", "kotlin.jvm.PlatformType", "toProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl implements ProfileDao {

    /* renamed from: a  reason: collision with root package name */
    public final ProfileRealm f6013a = new ProfileRealm((String) null, (String) null, (String) null, false, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, (String) null, (String) null, (d0) null, (Date) null, (String) null, (String) null, (Boolean) null, (Boolean) null, 67108863, (DefaultConstructorMarker) null);

    public ProfileDaoImpl(c0 c0Var) {
        c0 c0Var2 = c0Var;
        Intrinsics.checkParameterIsNotNull(c0Var2, "config");
        b.b.a(ProfileRealm.class, c0Var2);
    }

    public n<List<Profile>> a() {
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAllAsFlowable().toProfile()");
        return a2;
    }

    public n<List<Profile>> b(String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, (Function1) new ProfileDaoImpl$getProfilesByStudentId$1(str, i2), 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAsFlowable {…())\n        }.toProfile()");
        return a2;
    }

    public n<List<Profile>> c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, (Function1) new ProfileDaoImpl$findEntityByPrimaryKey$1(this, str), 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "findEntityByPrimaryKey(id).toProfile()");
        return a2;
    }

    public n<Profile> d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return ExtensionsKt.a((f0) this.f6013a, new ProfileDaoImpl$setActiveProfile$1(profile));
    }

    public n<Profile> f(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return ExtensionsKt.a((f0) this.f6013a, new ProfileDaoImpl$addProfile$1(profile));
    }

    public n<List<Profile>> a(String str, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, (Function1) new ProfileDaoImpl$getAllProfiles$1(str, i2), 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAsFlowable {…())\n        }.toProfile()");
        return a2;
    }

    public n<List<Profile>> b() {
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, (Function1) ProfileDaoImpl$getActiveProfile$1.INSTANCE, 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAsFlowable {…ive\", true) }.toProfile()");
        return a2;
    }

    public n<Profile> c(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return ExtensionsKt.a((f0) this.f6013a, new ProfileDaoImpl$updateProfile$2(this, profile.m(), new ProfileDaoImpl$updateProfile$1(profile)));
    }

    public n<List<Profile>> a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "instituteCode");
        n<List<Profile>> a2 = a((f<List<ProfileRealm>>) v.a((f0) this.f6013a, false, (Function1) new ProfileDaoImpl$getProfilesByInstituteCode$1(str), 1));
        Intrinsics.checkExpressionValueIsNotNull(a2, "ENTITY.queryAsFlowable {…de)\n        }.toProfile()");
        return a2;
    }

    public k.b.b b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        k.b.b e = ExtensionsKt.a((f0) this.f6013a, new ProfileDaoImpl$deepDeleteProfile$1(str)).e();
        Intrinsics.checkExpressionValueIsNotNull(e, "ENTITY.executeTransactio…       }.ignoreElements()");
        return e;
    }

    public final RealmQuery<ProfileRealm> a(RealmQuery<ProfileRealm> realmQuery, String str) {
        realmQuery.a("profileId", str);
        return realmQuery;
    }

    public final n<List<Profile>> a(f<List<ProfileRealm>> fVar) {
        return fVar.a((h<? super List<ProfileRealm>, ? extends R>) ProfileDaoImpl$toProfile$1.INSTANCE).b();
    }
}
