package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.notification.NotificationRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategyImpl;", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "profileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "(Lhu/ekreta/ellenorzo/notification/NotificationRepository;Lhu/ekreta/ellenorzo/profile/ProfileDao;)V", "deleteProfile", "Lio/reactivex/Completable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DeleteProfileStrategyImpl.kt */
public final class DeleteProfileStrategyImpl implements DeleteProfileStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationRepository f5994a;
    public final ProfileDao b;

    public DeleteProfileStrategyImpl(NotificationRepository notificationRepository, ProfileDao profileDao) {
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(profileDao, "profileDao");
        this.f5994a = notificationRepository;
        this.b = profileDao;
    }

    public b e(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        b a2 = this.f5994a.u(profile).b().a((d) this.b.b(profile.m()));
        Intrinsics.checkExpressionValueIsNotNull(a2, "notificationRepository.u…eleteProfile(profile.id))");
        return a2;
    }
}
