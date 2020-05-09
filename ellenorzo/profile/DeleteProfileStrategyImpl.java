package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.notification.NotificationRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategyImpl;", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "profileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "(Lhu/ekreta/ellenorzo/notification/NotificationRepository;Lhu/ekreta/ellenorzo/profile/ProfileDao;)V", "deleteProfile", "Lio/reactivex/Completable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.DeleteProfileStrategyImpl */
/* compiled from: DeleteProfileStrategyImpl.kt */
public final class DeleteProfileStrategyImpl implements DeleteProfileStrategy {

    /* renamed from: a */
    public final NotificationRepository f14450a;

    /* renamed from: b */
    public final ProfileDao f14451b;

    public DeleteProfileStrategyImpl(NotificationRepository notificationRepository, ProfileDao profileDao) {
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(profileDao, "profileDao");
        this.f14450a = notificationRepository;
        this.f14451b = profileDao;
    }

    /* renamed from: e */
    public C4667b mo14011e(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C4667b a = this.f14450a.mo13759u(profile).mo16980b().mo16974a((C4991d) this.f14451b.mo14075b(profile.mo14054m()));
        Intrinsics.checkExpressionValueIsNotNull(a, "notificationRepository.u…eleteProfile(profile.id))");
        return a;
    }
}
