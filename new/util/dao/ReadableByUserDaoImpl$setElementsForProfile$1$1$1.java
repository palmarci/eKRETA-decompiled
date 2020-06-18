package hu.ekreta.ellenorzo.util.dao;

import io.realm.RealmFieldType;
import io.realm.RealmQuery;
import io.realm.internal.TableQuery;
import k.c.m1.t.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "Lio/realm/RealmQuery;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$setElementsForProfile$1$1$1 extends Lambda implements Function1<RealmQuery<TRealmClass>, Unit> {
    public static final ReadableByUserDaoImpl$setElementsForProfile$1$1$1 INSTANCE = new ReadableByUserDaoImpl$setElementsForProfile$1$1$1();

    public ReadableByUserDaoImpl$setElementsForProfile$1$1$1() {
        super(1);
    }

    public final void a(RealmQuery<TRealmClass> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.b.c();
        c a2 = realmQuery.f6361d.a("readByUser", new RealmFieldType[0]);
        TableQuery tableQuery = realmQuery.c;
        tableQuery.nativeIsNotNull(tableQuery.e, a2.b(), a2.c());
        tableQuery.f = false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
