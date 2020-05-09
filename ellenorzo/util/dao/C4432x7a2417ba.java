package p289hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "Lio/realm/RealmQuery;", "invoke", "hu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl$setElementsForProfile$1$1$3"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl$setElementsForProfile$1$$special$$inlined$apply$lambda$1 */
/* compiled from: ReadableByUserDaoImpl.kt */
public final class C4432x7a2417ba extends Lambda implements Function1<RealmQuery<TRealmClass>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ ReadableByUserDaoImpl$setElementsForProfile$1 f15397c;

    public C4432x7a2417ba(ReadableByUserDaoImpl$setElementsForProfile$1 readableByUserDaoImpl$setElementsForProfile$1) {
        this.f15397c = readableByUserDaoImpl$setElementsForProfile$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo16321a(RealmQuery<TRealmClass> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16476a("profileId", this.f15397c.f15403f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16321a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
