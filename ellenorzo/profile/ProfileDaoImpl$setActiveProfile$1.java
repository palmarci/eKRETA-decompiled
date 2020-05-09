package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p296io.realm.RealmQuery;
import p300k.p340c.C5092k0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "realm", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$setActiveProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$setActiveProfile$1 extends Lambda implements Function1<C5179y, Profile> {

    /* renamed from: c */
    public final /* synthetic */ Profile f14501c;

    public ProfileDaoImpl$setActiveProfile$1(Profile profile) {
        this.f14501c = profile;
        super(1);
    }

    /* renamed from: a */
    public final Profile invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "realm");
        Profile profile = this.f14501c;
        yVar.mo17277c();
        C5092k0<ProfileRealm> a = new RealmQuery(yVar, ProfileRealm.class).mo16478a();
        Intrinsics.checkExpressionValueIsNotNull(a, "realm.where(ProfileRealm…               .findAll()");
        for (ProfileRealm profileRealm : a) {
            profileRealm.mo14139f(Intrinsics.areEqual((Object) profileRealm.mo14175t2(), (Object) this.f14501c.mo14054m()));
            if (profileRealm.mo14138e2()) {
                Intrinsics.checkExpressionValueIsNotNull(profileRealm, "it");
                profile = C3984v.m10160a(profileRealm);
            }
        }
        return profile;
    }
}
