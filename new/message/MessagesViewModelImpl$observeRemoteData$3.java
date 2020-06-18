package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.eadminapi.CurrentInstitutionDetailsDto;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/message/Message;", "it", "Lhu/ekreta/ellenorzo/rest/eadminapi/CurrentInstitutionDetailsDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesViewModelImpl.kt */
public final class MessagesViewModelImpl$observeRemoteData$3<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessagesViewModelImpl c;
    public final /* synthetic */ Profile e;

    public MessagesViewModelImpl$observeRemoteData$3(MessagesViewModelImpl messagesViewModelImpl, Profile profile) {
        this.c = messagesViewModelImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<Message>> apply(CurrentInstitutionDetailsDto currentInstitutionDetailsDto) {
        Intrinsics.checkParameterIsNotNull(currentInstitutionDetailsDto, "it");
        if (Intrinsics.areEqual((Object) currentInstitutionDetailsDto.isMessageHandlingAccessible(), (Object) true)) {
            return this.c.z.w(this.e);
        }
        n<List<Message>> d2 = n.d(CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkExpressionValueIsNotNull(d2, "Observable.just(emptyList())");
        return d2;
    }
}
