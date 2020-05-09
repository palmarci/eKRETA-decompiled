package p289hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0004H\u00040\u0006H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "Lio/realm/RealmQuery;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl$getElementsForProfile$1 */
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$getElementsForProfile$1 extends Lambda implements Function1<RealmQuery<TRealmClass>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ String f15392c;

    public ProfileSpecificDaoImpl$getElementsForProfile$1(String str) {
        this.f15392c = str;
        super(1);
    }

    /* renamed from: a */
    public final void mo16316a(RealmQuery<TRealmClass> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16476a("profileId", this.f15392c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16316a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
