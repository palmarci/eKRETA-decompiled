package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$getAllProfiles$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$getAllProfiles$1 extends Lambda implements Function1<RealmQuery<ProfileRealm>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ String f14496c;

    /* renamed from: e */
    public final /* synthetic */ int f14497e;

    public ProfileDaoImpl$getAllProfiles$1(String str, int i) {
        this.f14496c = str;
        this.f14497e = i;
        super(1);
    }

    /* renamed from: a */
    public final void mo14088a(RealmQuery<ProfileRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16476a("instituteCode", this.f14496c);
        realmQuery.mo16476a("instituteUserId", String.valueOf(this.f14497e));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo14088a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
