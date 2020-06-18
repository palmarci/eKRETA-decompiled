package hu.ekreta.ellenorzo.homework.comment;

import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$commentHomework$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ HomeworkCommentFormViewModelImpl c;

    public HomeworkCommentFormViewModelImpl$commentHomework$1(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        this.c = homeworkCommentFormViewModelImpl;
    }

    /* renamed from: a */
    public final n<NewlyCreatedHomeworkCommentDto> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl = this.c;
        HomeworkRepository access$getRepository$p = homeworkCommentFormViewModelImpl.s;
        Long Z1 = this.c.Z1();
        if (Z1 == null) {
            Intrinsics.throwNpe();
        }
        n<NewlyCreatedHomeworkCommentDto> d2 = access$getRepository$p.a(Z1.longValue(), this.c.M0(), profile).d(1);
        Intrinsics.checkExpressionValueIsNotNull(d2, "repository.postHomeworkC…                 .take(1)");
        return homeworkCommentFormViewModelImpl.a(d2);
    }
}
