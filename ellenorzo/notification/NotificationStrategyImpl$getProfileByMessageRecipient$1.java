package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$getProfileByMessageRecipient$1 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$getProfileByMessageRecipient$1<T, R> implements C4675h<T, R> {
    public static final NotificationStrategyImpl$getProfileByMessageRecipient$1 INSTANCE = new NotificationStrategyImpl$getProfileByMessageRecipient$1();

    /* renamed from: a */
    public final Profile apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return (Profile) CollectionsKt___CollectionsKt.first(list);
    }
}
