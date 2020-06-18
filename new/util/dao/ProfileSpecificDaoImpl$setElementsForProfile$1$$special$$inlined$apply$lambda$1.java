package hu.ekreta.ellenorzo.util.dao;

import io.realm.RealmQuery;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0004H\u00040\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "Lio/realm/RealmQuery;", "kotlin.jvm.PlatformType", "invoke", "hu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl$setElementsForProfile$1$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$setElementsForProfile$1$$special$$inlined$apply$lambda$1 extends Lambda implements Function1<RealmQuery<TRealmClass>, Unit> {
    public final /* synthetic */ ProfileSpecificDaoImpl$setElementsForProfile$1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileSpecificDaoImpl$setElementsForProfile$1$$special$$inlined$apply$lambda$1(ProfileSpecificDaoImpl$setElementsForProfile$1 profileSpecificDaoImpl$setElementsForProfile$1) {
        super(1);
        this.c = profileSpecificDaoImpl$setElementsForProfile$1;
    }

    public final void a(RealmQuery<TRealmClass> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.a("profileId", this.c.f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
