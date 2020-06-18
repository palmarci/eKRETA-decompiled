package hu.ekreta.ellenorzo.cases;

import io.realm.RealmQuery;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl$getCaseById$1 extends Lambda implements Function1<RealmQuery<CaseRealm>, Unit> {
    public final /* synthetic */ String c;

    public final void a(RealmQuery<CaseRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.a("id", this.c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
