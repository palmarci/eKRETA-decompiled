package hu.ekreta.ellenorzo.message;

import h.w.v;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k.b.n;
import k.c.d0;
import k.c.f0;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/message/MessageRealm;", "Lhu/ekreta/ellenorzo/message/MessageDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "setElementsForProfile", "Lio/reactivex/Observable;", "", "profileId", "", "elements", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageDaoImpl.kt */
public final class MessageDaoImpl extends ReadableByUserDaoImpl<Message, MessageRealm> implements MessageDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessageDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.message.MessageRealm> r0 = hu.ekreta.ellenorzo.message.MessageRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.message.MessageDaoImpl.<init>(k.c.c0):void");
    }

    public static final /* synthetic */ MessageRealm access$getENTITY$p(MessageDaoImpl messageDaoImpl) {
        return (MessageRealm) messageDaoImpl.b();
    }

    /* renamed from: a */
    public Message realmModelToModel(MessageRealm messageRealm) {
        Intrinsics.checkParameterIsNotNull(messageRealm, "realmModel");
        try {
            String d2 = messageRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Long f2 = messageRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            long longValue = f2.longValue();
            Boolean u = messageRealm.u();
            boolean u2 = messageRealm.u2();
            boolean t2 = messageRealm.t2();
            String n2 = messageRealm.n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            Message.MessageType.Companion companion = Message.MessageType.Companion;
            Long q2 = messageRealm.q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            Message.MessageType a2 = companion.a(q2.longValue());
            String o2 = messageRealm.o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            String s2 = messageRealm.s2();
            if (s2 == null) {
                Intrinsics.throwNpe();
            }
            String r2 = messageRealm.r2();
            if (r2 == null) {
                Intrinsics.throwNpe();
            }
            String p2 = messageRealm.p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            Long h2 = messageRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            long longValue2 = h2.longValue();
            Calendar b = UtilsKt.b(messageRealm.k2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            String i2 = messageRealm.i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = messageRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String m2 = messageRealm.m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            String l2 = messageRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            d0<AddresseeRealm> e2 = messageRealm.e2();
            long j3 = longValue2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(e2, 10));
            for (AddresseeRealm addresseeRealm : e2) {
                Intrinsics.checkExpressionValueIsNotNull(addresseeRealm, "it");
                arrayList.add(v.a(addresseeRealm));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            d0<AttachmentRealm> g2 = messageRealm.g2();
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10));
            for (AttachmentRealm attachmentRealm : g2) {
                Intrinsics.checkExpressionValueIsNotNull(attachmentRealm, "it");
                arrayList4.add(v.a(attachmentRealm));
            }
            return new Message(n2, d2, longValue, u, u2, t2, a2, o2, s2, r2, p2, j3, b, i2, j2, m2, l2, arrayList3, new ArrayList(arrayList4));
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public MessageRealm modelToRealmModel(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "model");
        String d2 = message.d();
        Long valueOf = Long.valueOf(message.i());
        Boolean q2 = message.q();
        boolean x = message.x();
        boolean w = message.w();
        String e = message.e();
        Long valueOf2 = Long.valueOf(message.t().a());
        String r = message.r();
        String v = message.v();
        String u = message.u();
        String s = message.s();
        Long valueOf3 = Long.valueOf(message.j());
        Date time = message.n().getTime();
        String k2 = message.k();
        String m2 = message.m();
        String p2 = message.p();
        String o2 = message.o();
        List<Addressee> f = message.f();
        String str = m2;
        String str2 = k2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f, 10));
        for (Iterator<T> it = f.iterator(); it.hasNext(); it = it) {
            Addressee addressee = (Addressee) it.next();
            Intrinsics.checkParameterIsNotNull(addressee, "$this$toAddresseeRealm");
            arrayList.add(new AddresseeRealm(addressee.a(Long.valueOf(addressee.f())), Long.valueOf(addressee.f()), Long.valueOf(addressee.g()), addressee.h(), Long.valueOf(addressee.k()), addressee.i(), addressee.m(), addressee.l(), addressee.j(), addressee.e()));
        }
        Object[] array = arrayList.toArray(new AddresseeRealm[0]);
        if (array != null) {
            AddresseeRealm[] addresseeRealmArr = (AddresseeRealm[]) array;
            d0 d0Var = new d0((AddresseeRealm[]) Arrays.copyOf(addresseeRealmArr, addresseeRealmArr.length));
            List<Attachment> h2 = message.h();
            d0 d0Var2 = d0Var;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(h2, 10));
            for (Attachment a2 : h2) {
                arrayList2.add(v.a(a2));
            }
            Object[] array2 = arrayList2.toArray(new AttachmentRealm[0]);
            if (array2 != null) {
                AttachmentRealm[] attachmentRealmArr = (AttachmentRealm[]) array2;
                d0 d0Var3 = r1;
                d0 d0Var4 = new d0((AttachmentRealm[]) Arrays.copyOf(attachmentRealmArr, attachmentRealmArr.length));
                return new MessageRealm(d2, valueOf, q2, x, w, valueOf2, r, v, u, s, valueOf3, time, str2, str, p2, o2, d0Var2, d0Var3, e);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public n<List<Message>> a(String str, List<Message> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "elements");
        return ExtensionsKt.a((f0) b(), new MessageDaoImpl$setElementsForProfile$1(this, str, list));
    }
}
