package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/profile/ProfileRealm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$getActiveProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$getActiveProfile$1 extends Lambda implements Function1<RealmQuery<ProfileRealm>, Unit> {
    public static final ProfileDaoImpl$getActiveProfile$1 INSTANCE = new ProfileDaoImpl$getActiveProfile$1();

    public ProfileDaoImpl$getActiveProfile$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo14087a(RealmQuery<ProfileRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16475a("active", Boolean.valueOf(true));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo14087a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
