package p289hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p296io.realm.RealmQuery;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDaoImpl$setElementsForProfile$1 */
/* compiled from: MessageDaoImpl.kt */
public final class MessageDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<C5179y, List<? extends Message>> {

    /* renamed from: c */
    public final /* synthetic */ MessageDaoImpl f13818c;

    /* renamed from: e */
    public final /* synthetic */ String f13819e;

    /* renamed from: f */
    public final /* synthetic */ List f13820f;

    public MessageDaoImpl$setElementsForProfile$1(MessageDaoImpl messageDaoImpl, String str, List list) {
        this.f13818c = messageDaoImpl;
        this.f13819e = str;
        this.f13820f = list;
        super(1);
    }

    /* renamed from: a */
    public final List<Message> invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<MessageRealm> b = C3984v.m10274b(MessageDaoImpl.access$getENTITY$p(this.f13818c), (Function1<? super RealmQuery<T>, Unit>) new MessageDaoImpl$setElementsForProfile$1$completeMessages$1<Object,Unit>(this));
        C3984v.m10247a(MessageDaoImpl.access$getENTITY$p(this.f13818c), (Function1<? super RealmQuery<T>, Unit>) new Function1<RealmQuery<MessageRealm>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ MessageDaoImpl$setElementsForProfile$1 f13821c;

            {
                this.f13821c = r1;
            }

            /* renamed from: a */
            public final void mo13309a(RealmQuery<MessageRealm> realmQuery) {
                Intrinsics.checkParameterIsNotNull(realmQuery, "$receiver");
                realmQuery.mo16476a("profileId", this.f13821c.f13819e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo13309a((RealmQuery) obj);
                return Unit.INSTANCE;
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
        for (MessageRealm d : b) {
            arrayList.add(d.mo11376d());
        }
        List<Message> list = this.f13820f;
        for (Message a : list) {
            MessageRealm a2 = this.f13818c.modelToRealmModel(a);
            if (arrayList.contains(a2.mo11376d())) {
                for (MessageRealm messageRealm : b) {
                    if (Intrinsics.areEqual((Object) messageRealm.mo11376d(), (Object) a2.mo11376d())) {
                        if (messageRealm.mo13398t2() != a2.mo13398t2()) {
                            C3984v.m10246a(a2);
                        } else {
                            C3984v.m10246a(messageRealm);
                        }
                    }
                }
            } else {
                C3984v.m10246a(a2);
            }
        }
        return list;
    }
}
