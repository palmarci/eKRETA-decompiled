package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "kotlin.jvm.PlatformType", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$observeRemoteData$2 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeRemoteData$2<T> implements C4673f<CurrentInstitutionDetailsDto> {

    /* renamed from: c */
    public final /* synthetic */ MessagesViewModelImpl f13947c;

    public MessagesViewModelImpl$observeRemoteData$2(MessagesViewModelImpl messagesViewModelImpl) {
        this.f13947c = messagesViewModelImpl;
    }

    /* renamed from: a */
    public final void accept(CurrentInstitutionDetailsDto currentInstitutionDetailsDto) {
        MessagesViewModelImpl.access$setVisibilityStates(this.f13947c, currentInstitutionDetailsDto.isMessageHandlingAccessible());
    }
}
