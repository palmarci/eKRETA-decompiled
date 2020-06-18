package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b;
import k.b.b0.h;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$saveHomeworkState$2<T, R> implements h<Profile, d> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;
    public final /* synthetic */ boolean e;

    public HomeworkDetailViewModelImpl$saveHomeworkState$2(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl, boolean z) {
        this.c = homeworkDetailViewModelImpl;
        this.e = z;
    }

    /* renamed from: a */
    public final b apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        HomeworkRepository access$getRepository$p = this.c.B;
        Homework Z1 = this.c.Z1();
        if (Z1 == null) {
            Intrinsics.throwNpe();
        }
        return access$getRepository$p.a(Z1.d(), this.e, profile);
    }
}
