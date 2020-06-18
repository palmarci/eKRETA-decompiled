package hu.ekreta.ellenorzo.profile;

import h.w.v;
import io.realm.RealmQuery;
import k.c.k0;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "realm", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$setActiveProfile$1 extends Lambda implements Function1<y, Profile> {
    public final /* synthetic */ Profile c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDaoImpl$setActiveProfile$1(Profile profile) {
        super(1);
        this.c = profile;
    }

    /* renamed from: a */
    public final Profile invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "realm");
        Profile profile = this.c;
        yVar.c();
        k0<ProfileRealm> a2 = new RealmQuery(yVar, ProfileRealm.class).a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "realm.where(ProfileRealm…               .findAll()");
        for (ProfileRealm profileRealm : a2) {
            profileRealm.f(Intrinsics.areEqual((Object) profileRealm.u2(), (Object) this.c.m()));
            if (profileRealm.f2()) {
                Intrinsics.checkExpressionValueIsNotNull(profileRealm, "it");
                profile = v.a(profileRealm);
            }
        }
        return profile;
    }
}
