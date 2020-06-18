package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "count", "apply", "(Ljava/lang/Integer;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessageRepositoryImpl.kt */
public final class MessageRepositoryImpl$getUnreadMessagesCount$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MessageRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public MessageRepositoryImpl$getUnreadMessagesCount$2(MessageRepositoryImpl messageRepositoryImpl, Profile profile) {
        this.c = messageRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<Integer> apply(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "count");
        if (num.intValue() == 0) {
            return this.c.a().getUnreadMessagesCount(MobileApiV3Kt.getAsAuthorizationHeader(this.e.d()));
        }
        n<Integer> d2 = n.d(num);
        Intrinsics.checkExpressionValueIsNotNull(d2, "Observable.just(count)");
        return d2;
    }
}
