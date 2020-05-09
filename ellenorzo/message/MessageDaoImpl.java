package p289hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.attachment.AttachmentRealm;
import p289hu.ekreta.ellenorzo.message.Message.MessageType;
import p289hu.ekreta.ellenorzo.message.Message.MessageType.Companion;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p313b.C5027n;
import p300k.p340c.C5061c0;
import p300k.p340c.C5065d0;
import p300k.p340c.C5074f0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/message/MessageRealm;", "Lhu/ekreta/ellenorzo/message/MessageDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "setElementsForProfile", "Lio/reactivex/Observable;", "", "profileId", "", "elements", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDaoImpl */
/* compiled from: MessageDaoImpl.kt */
public final class MessageDaoImpl extends ReadableByUserDaoImpl<Message, MessageRealm> implements MessageDao {
    public MessageDaoImpl(C5061c0 c0Var) {
        Class<MessageRealm> cls = MessageRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    public static final /* synthetic */ MessageRealm access$getENTITY$p(MessageDaoImpl messageDaoImpl) {
        return (MessageRealm) messageDaoImpl.mo16313b();
    }

    /* renamed from: a */
    public Message realmModelToModel(MessageRealm messageRealm) {
        String str;
        Intrinsics.checkParameterIsNotNull(messageRealm, "realmModel");
        try {
            String d = messageRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            Long e2 = messageRealm.mo13371e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            long longValue = e2.longValue();
            Boolean u = messageRealm.mo11399u();
            boolean t2 = messageRealm.mo13398t2();
            boolean s2 = messageRealm.mo13397s2();
            String m2 = messageRealm.mo13389m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            Companion companion = MessageType.Companion;
            Long p2 = messageRealm.mo13393p2();
            if (p2 == null) {
                Intrinsics.throwNpe();
            }
            MessageType a = companion.mo13303a(p2.longValue());
            String n2 = messageRealm.mo13390n2();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            String r2 = messageRealm.mo13396r2();
            if (r2 == null) {
                Intrinsics.throwNpe();
            }
            String q2 = messageRealm.mo13394q2();
            if (q2 == null) {
                Intrinsics.throwNpe();
            }
            String o2 = messageRealm.mo13391o2();
            if (o2 == null) {
                Intrinsics.throwNpe();
            }
            Long g2 = messageRealm.mo13377g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            long longValue2 = g2.longValue();
            Calendar b = UtilsKt.m14838b(messageRealm.mo13382j2());
            if (b == null) {
                Intrinsics.throwNpe();
            }
            String h2 = messageRealm.mo13379h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            String i2 = messageRealm.mo13381i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            String l2 = messageRealm.mo13388l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = messageRealm.mo13384k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            C5065d0 d2 = messageRealm.mo13369d2();
            long j = longValue2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(d2, 10));
            Iterator it = d2.iterator();
            while (true) {
                str = "it";
                if (!it.hasNext()) {
                    break;
                }
                AddresseeRealm addresseeRealm = (AddresseeRealm) it.next();
                Intrinsics.checkExpressionValueIsNotNull(addresseeRealm, str);
                arrayList.add(C3984v.m10158a(addresseeRealm));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            C5065d0<AttachmentRealm> f2 = messageRealm.mo13374f2();
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f2, 10));
            for (AttachmentRealm attachmentRealm : f2) {
                Intrinsics.checkExpressionValueIsNotNull(attachmentRealm, str);
                arrayList4.add(C3984v.m10153a(attachmentRealm));
            }
            Message message = new Message(m2, d, longValue, u, t2, s2, a, n2, r2, q2, o2, j, b, h2, i2, l2, k2, arrayList3, new ArrayList(arrayList4));
            return message;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public MessageRealm modelToRealmModel(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "model");
        String d = message.mo11316d();
        Long valueOf = Long.valueOf(message.mo13282i());
        Boolean q = message.mo13290q();
        boolean x = message.mo13299x();
        boolean w = message.mo13297w();
        String e = message.mo11318e();
        Long valueOf2 = Long.valueOf(message.mo13293t().mo13302a());
        String r = message.mo13291r();
        String v = message.mo13296v();
        String u = message.mo13295u();
        String s = message.mo13292s();
        Long valueOf3 = Long.valueOf(message.mo13283j());
        Date time = message.mo13287n().getTime();
        String k = message.mo13284k();
        String m = message.mo13286m();
        String p = message.mo13289p();
        String o = message.mo13288o();
        List f = message.mo13278f();
        String str = m;
        String str2 = k;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            Addressee addressee = (Addressee) it.next();
            Intrinsics.checkParameterIsNotNull(addressee, "$this$toAddresseeRealm");
            Iterator it2 = it;
            AddresseeRealm addresseeRealm = new AddresseeRealm(addressee.mo13230a(Long.valueOf(addressee.mo13233f())), Long.valueOf(addressee.mo13233f()), Long.valueOf(addressee.mo13234g()), addressee.mo13235h(), Long.valueOf(addressee.mo13239k()), addressee.mo13237i(), addressee.mo13241m(), addressee.mo13240l(), addressee.mo13238j(), addressee.mo11318e());
            arrayList.add(addresseeRealm);
            it = it2;
        }
        Object[] array = arrayList.toArray(new AddresseeRealm[0]);
        String str3 = "null cannot be cast to non-null type kotlin.Array<T>";
        if (array != null) {
            AddresseeRealm[] addresseeRealmArr = (AddresseeRealm[]) array;
            C5065d0 d0Var = new C5065d0((AddresseeRealm[]) Arrays.copyOf(addresseeRealmArr, addresseeRealmArr.length));
            List<Attachment> h = message.mo13280h();
            C5065d0 d0Var2 = d0Var;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(h, 10));
            for (Attachment a : h) {
                arrayList2.add(C3984v.m10155a(a));
            }
            Object[] array2 = arrayList2.toArray(new AttachmentRealm[0]);
            if (array2 != null) {
                AttachmentRealm[] attachmentRealmArr = (AttachmentRealm[]) array2;
                C5065d0 d0Var3 = r1;
                C5065d0 d0Var4 = new C5065d0((AttachmentRealm[]) Arrays.copyOf(attachmentRealmArr, attachmentRealmArr.length));
                MessageRealm messageRealm = new MessageRealm(d, valueOf, q, x, w, valueOf2, r, v, u, s, valueOf3, time, str2, str, p, o, d0Var2, d0Var3, e);
                return messageRealm;
            }
            throw new TypeCastException(str3);
        }
        throw new TypeCastException(str3);
    }

    /* renamed from: a */
    public C5027n<List<Message>> mo13307a(String str, List<Message> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "elements");
        return ExtensionsKt.m14633a((C5074f0) mo16313b(), (Function1<? super C5179y, ? extends R>) new MessageDaoImpl$setElementsForProfile$1<Object,Object>(this, str, list));
    }
}
