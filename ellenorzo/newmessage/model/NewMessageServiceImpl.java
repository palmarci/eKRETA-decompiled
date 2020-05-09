package p289hu.ekreta.ellenorzo.newmessage.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.attachment.Attachment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeDto.Type;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AttachmentDto.TemporaryId;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MessageDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4670c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/model/NewMessageServiceImpl;", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "createTemporaryId", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto$TemporaryId;", "it", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "fetchAddresseeList", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "accessToken", "", "sendMessage", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "message", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessage;", "toAddresseeDtoList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeDto;", "addresseeList", "toAttachmentDtoList", "Lhu/ekreta/ellenorzo/rest/eadminapi/AttachmentDto;", "listOfAttachment", "toMessageDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/MessageDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.model.NewMessageServiceImpl */
/* compiled from: NewMessageServiceImpl.kt */
public final class NewMessageServiceImpl implements NewMessageService {

    /* renamed from: a */
    public final EAdminApi f13980a;

    public NewMessageServiceImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f13980a = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<Boolean> mo13500a(Profile profile, NewMessage newMessage) {
        String str;
        String str2;
        TemporaryId temporaryId;
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(newMessage, "message");
        EAdminApi eAdminApi = this.f13980a;
        String d = profile.mo14042d();
        long a = newMessage.mo13487a();
        Calendar g = newMessage.mo13495g();
        String e = newMessage.mo13492e();
        String f = newMessage.mo13494f();
        String i = newMessage.mo13498i();
        String h = newMessage.mo13496h();
        List b = newMessage.mo13489b();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
        Iterator it = b.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Addressee addressee = (Addressee) it.next();
            Long d2 = addressee.mo13472d();
            long j = 0;
            long longValue = d2 != null ? d2.longValue() : 0;
            Long e2 = addressee.mo13474e();
            long longValue2 = e2 != null ? e2.longValue() : 0;
            String f2 = addressee.mo13476f();
            String str3 = f2 != null ? f2 : str;
            Long i2 = addressee.mo13480i();
            if (i2 != null) {
                j = i2.longValue();
            }
            long j2 = j;
            String g2 = addressee.mo13477g();
            String str4 = g2 != null ? g2 : str;
            String k = addressee.mo13482k();
            String str5 = k != null ? k : str;
            String j3 = addressee.mo13481j();
            String str6 = j3 != null ? j3 : str;
            String h2 = addressee.mo13478h();
            Type type = new Type(j2, str4, str5, str6, h2 != null ? h2 : str);
            AddresseeDto addresseeDto = new AddresseeDto(longValue, longValue2, str3, type);
            arrayList.add(addresseeDto);
        }
        List c = newMessage.mo13490c();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10));
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            Attachment attachment = (Attachment) it2.next();
            int i3 = attachment.mo11437i();
            String h3 = attachment.mo11435h();
            Iterator it3 = it2;
            String str7 = h3 != null ? h3 : str;
            if (attachment.mo11438j() != null) {
                str2 = d;
                temporaryId = new TemporaryId(attachment.mo11438j());
            } else {
                str2 = d;
                temporaryId = null;
            }
            arrayList2.add(new AttachmentDto(i3, str7, temporaryId));
            it2 = it3;
            NewMessage newMessage2 = newMessage;
            d = str2;
        }
        String str8 = d;
        MessageDto messageDto = new MessageDto(a, g, e, f, i, h, arrayList, arrayList2, newMessage.mo13491d());
        C5027n<Boolean> i4 = eAdminApi.sendMessage(str8, messageDto).mo17246g(NewMessageServiceImpl$sendMessage$1.INSTANCE).mo17250i(NewMessageServiceImpl$sendMessage$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(i4, "eAdminApi.sendMessage(\n …          false\n        }");
        return i4;
    }

    /* renamed from: a */
    public C5027n<List<Addressee>> mo13501a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        C5027n<List<Addressee>> g = C5027n.m16892a((C5030q<? extends T1>) this.f13980a.getAddresseeType(str), (C5030q<? extends T2>) this.f13980a.getTeachers(str), (C4670c<? super T1, ? super T2, ? extends R>) NewMessageServiceImpl$fetchAddresseeList$1.INSTANCE).mo17246g(NewMessageServiceImpl$fetchAddresseeList$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "Observable.zip(\n        …)\n            }\n        }");
        return g;
    }
}
