package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p296io.realm.RealmQuery;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lio/realm/RealmQuery;", "Lhu/ekreta/ellenorzo/message/MessageRealm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDaoImpl$setElementsForProfile$1$completeMessages$1 */
/* compiled from: MessageDaoImpl.kt */
public final class MessageDaoImpl$setElementsForProfile$1$completeMessages$1 extends Lambda implements Function1<RealmQuery<MessageRealm>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MessageDaoImpl$setElementsForProfile$1 f13822c;

    public MessageDaoImpl$setElementsForProfile$1$completeMessages$1(MessageDaoImpl$setElementsForProfile$1 messageDaoImpl$setElementsForProfile$1) {
        this.f13822c = messageDaoImpl$setElementsForProfile$1;
        super(1);
    }

    /* renamed from: a */
    public final void mo13310a(RealmQuery<MessageRealm> realmQuery) {
        Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
        realmQuery.mo16476a("profileId", this.f13822c.f13819e);
        realmQuery.f15530b.mo17277c();
        realmQuery.mo16475a("isComplete", Boolean.valueOf(true));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13310a((RealmQuery) obj);
        return Unit.INSTANCE;
    }
}
