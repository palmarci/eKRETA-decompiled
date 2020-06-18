package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b;
import k.b.b0.h;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$deleteHomeworkComment$1<T, R> implements h<Profile, d> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;
    public final /* synthetic */ HomeworkComment e;

    public HomeworkDetailViewModelImpl$deleteHomeworkComment$1(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl, HomeworkComment homeworkComment) {
        this.c = homeworkDetailViewModelImpl;
        this.e = homeworkComment;
    }

    /* renamed from: a */
    public final b apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.c;
        return homeworkDetailViewModelImpl.a(homeworkDetailViewModelImpl.B.a(this.e, profile));
    }
}
