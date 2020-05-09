package p289hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmFieldType;
import p296io.realm.RealmQuery;
import p296io.realm.internal.TableQuery;
import p300k.p340c.p341m1.p344t.C5131c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "Lio/realm/RealmQuery;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl$setElementsForProfile$1$1$1 */
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$setElementsForProfile$1$1$1 extends Lambda implements Function1<RealmQuery<TRealmClass>, Unit> {
    public static final ReadableByUserDaoImpl$setElementsForProfile$1$1$1 INSTANCE = new ReadableByUserDaoImpl$setElementsForProfile$1$1$1();

    public ReadableByUserDaoImpl$setElementsForProfile$1$1$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo16325a(RealmQuery<TRealmClass> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.f15530b.mo17277c();
        C5131c a = realmQuery.f15532d.mo17342a("readByUser", new RealmFieldType[0]);
        TableQuery tableQuery = realmQuery.f15531c;
        tableQuery.nativeIsNotNull(tableQuery.f15978e, a.mo17397b(), a.mo17398c());
        tableQuery.f15979f = false;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16325a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
