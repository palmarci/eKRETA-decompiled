package p289hu.ekreta.ellenorzo.message;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesViewModelImpl$observeRemoteData$3 */
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeRemoteData$3<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessagesViewModelImpl f13948c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13949e;

    public MessagesViewModelImpl$observeRemoteData$3(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        this.f13948c = messagesViewModelImpl;
        this.f13949e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Message>> apply(CurrentInstitutionDetailsDto currentInstitutionDetailsDto) {
        Intrinsics.checkParameterIsNotNull(currentInstitutionDetailsDto, "it");
        if (Intrinsics.areEqual((Object) currentInstitutionDetailsDto.isMessageHandlingAccessible(), (Object) Boolean.valueOf(true))) {
            return this.f13948c.f13938y.mo13405w(this.f13949e);
        }
        C5027n<List<Message>> d = C5027n.m16898d(CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkExpressionValueIsNotNull(d, "Observable.just(emptyList())");
        return d;
    }
}
