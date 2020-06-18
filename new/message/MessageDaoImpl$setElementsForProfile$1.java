package hu.ekreta.ellenorzo.message;

import h.w.v;
import io.realm.RealmQuery;
import java.util.ArrayList;
import java.util.List;
import k.c.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageDaoImpl.kt */
public final class MessageDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<y, List<? extends Message>> {
    public final /* synthetic */ MessageDaoImpl c;
    public final /* synthetic */ String e;
    public final /* synthetic */ List f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDaoImpl$setElementsForProfile$1(MessageDaoImpl messageDaoImpl, String str, List list) {
        super(1);
        this.c = messageDaoImpl;
        this.e = str;
        this.f = list;
    }

    /* renamed from: a */
    public final List<Message> invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<MessageRealm> b = v.b(MessageDaoImpl.access$getENTITY$p(this.c), new MessageDaoImpl$setElementsForProfile$1$completeMessages$1(this));
        v.a(MessageDaoImpl.access$getENTITY$p(this.c), new Function1<RealmQuery<MessageRealm>, Unit>(this) {
            public final /* synthetic */ MessageDaoImpl$setElementsForProfile$1 c;

            {
                this.c = r1;
            }

            public final void a(RealmQuery<MessageRealm> realmQuery) {
                Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
                realmQuery.a("profileId", this.c.e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((RealmQuery) obj);
                return Unit.INSTANCE;
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
        for (MessageRealm d2 : b) {
            arrayList.add(d2.d());
        }
        List<Message> list = this.f;
        for (Message a2 : list) {
            MessageRealm a3 = this.c.modelToRealmModel(a2);
            if (arrayList.contains(a3.d())) {
                for (MessageRealm messageRealm : b) {
                    if (Intrinsics.areEqual((Object) messageRealm.d(), (Object) a3.d())) {
                        if (messageRealm.u2() != a3.u2()) {
                            v.a(a3);
                        } else {
                            v.a(messageRealm);
                        }
                    }
                }
            } else {
                v.a(a3);
            }
        }
        return list;
    }
}
