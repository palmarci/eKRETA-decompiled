package hu.ekreta.ellenorzo.newmessage.model;

import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.MessageDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/NewMessageServiceImpl;", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "createTemporaryId", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "it", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "fetchAddresseeList", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "accessToken", "", "sendMessage", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "toAddresseeDtoList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "addresseeList", "toAttachmentDtoList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "listOfAttachment", "toMessageDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessageServiceImpl.kt */
public final class NewMessageServiceImpl implements NewMessageService {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5827a;

    public NewMessageServiceImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5827a = eAdminApi;
    }

    public n<Boolean> a(Profile profile, NewMessage newMessage) {
        String str;
        ArrayList arrayList;
        String str2;
        EAdminApi eAdminApi;
        AttachmentDto.TemporaryId temporaryId;
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(newMessage, "message");
        EAdminApi eAdminApi2 = this.f5827a;
        String d2 = profile.d();
        Long valueOf = Long.valueOf(newMessage.a());
        Calendar g2 = newMessage.g();
        String e = newMessage.e();
        String f = newMessage.f();
        String i2 = newMessage.i();
        String h2 = newMessage.h();
        List<Addressee> b = newMessage.b();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Addressee addressee = (Addressee) it.next();
            Long e2 = addressee.e();
            long j2 = 0;
            long longValue = e2 != null ? e2.longValue() : 0;
            Long f2 = addressee.f();
            long longValue2 = f2 != null ? f2.longValue() : 0;
            String g3 = addressee.g();
            String str3 = g3 != null ? g3 : str;
            Long j3 = addressee.j();
            if (j3 != null) {
                j2 = j3.longValue();
            }
            long j4 = j2;
            String h3 = addressee.h();
            String str4 = h3 != null ? h3 : str;
            String l2 = addressee.l();
            String str5 = l2 != null ? l2 : str;
            String k2 = addressee.k();
            String str6 = k2 != null ? k2 : str;
            String i3 = addressee.i();
            arrayList2.add(new AddresseeDto(longValue, longValue2, str3, new AddresseeDto.Type(j4, str4, str5, str6, i3 != null ? i3 : str)));
        }
        List<Attachment> c = newMessage.c();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10));
        Iterator<T> it2 = c.iterator();
        while (it2.hasNext()) {
            Attachment attachment = (Attachment) it2.next();
            int l3 = attachment.l();
            String i4 = attachment.i();
            Iterator<T> it3 = it2;
            String str7 = i4 != null ? i4 : str;
            String str8 = str;
            if (attachment.k() != null) {
                String h4 = attachment.h();
                if (h4 == null) {
                    h4 = "Local";
                }
                str2 = d2;
                String str9 = h4;
                eAdminApi = eAdminApi2;
                arrayList = arrayList2;
                temporaryId = new AttachmentDto.TemporaryId((Integer) null, str9, attachment.k(), attachment.j());
            } else {
                str2 = d2;
                eAdminApi = eAdminApi2;
                arrayList = arrayList2;
                temporaryId = null;
            }
            arrayList3.add(new AttachmentDto(l3, str7, temporaryId));
            it2 = it3;
            NewMessage newMessage2 = newMessage;
            str = str8;
            eAdminApi2 = eAdminApi;
            d2 = str2;
            arrayList2 = arrayList;
        }
        ArrayList arrayList4 = arrayList2;
        n<R> g4 = eAdminApi2.sendMessage(d2, new MessageDto(valueOf, g2, e, f, i2, h2, arrayList2, arrayList3, newMessage.d())).g(NewMessageServiceImpl$sendMessage$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g4, "eAdminApi.sendMessage(\n …           true\n        }");
        return g4;
    }
}
