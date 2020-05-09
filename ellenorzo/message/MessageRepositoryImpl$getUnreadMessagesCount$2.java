package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "count", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Observable;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl$getUnreadMessagesCount$2 */
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$getUnreadMessagesCount$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MessageRepositoryImpl f13902c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13903e;

    public MessageRepositoryImpl$getUnreadMessagesCount$2(MessageRepositoryImpl messageRepositoryImpl, Profile profile) {
        this.f13902c = messageRepositoryImpl;
        this.f13903e = profile;
    }

    /* renamed from: a */
    public final C5027n<Integer> apply(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "count");
        if (num.intValue() == 0) {
            return this.f13902c.mo13407a().getUnreadMessagesCount(MobileApiV3Kt.getAsAuthorizationHeader(this.f13903e.mo14042d()));
        }
        C5027n<Integer> d = C5027n.m16898d(num);
        Intrinsics.checkExpressionValueIsNotNull(d, "Observable.just(count)");
        return d;
    }
}
