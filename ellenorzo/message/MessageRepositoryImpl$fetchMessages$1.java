package p289hu.ekreta.ellenorzo.message;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.eadminapi.MailboxItemDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/message/Message;", "apiMessages", "Lhu/ekreta/ellenorzo/rest/eadminapi/MailboxItemDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$fetchMessages$1 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$fetchMessages$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f13899c;

    public MessageRepositoryImpl$fetchMessages$1(Profile profile) {
        this.f13899c = profile;
    }

    /* renamed from: a */
    public final List<Message> apply(List<MailboxItemDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "apiMessages");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MailboxItemDto message$default : list) {
            arrayList.add(MessageRepositoryImplKt.toMessage$default(message$default, this.f13899c.mo14054m(), false, 2, null));
        }
        return arrayList;
    }
}
