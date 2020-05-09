package p289hu.ekreta.ellenorzo.homework.comment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl$commentHomework$1 */
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl$commentHomework$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkCommentFormViewModelImpl f13565c;

    public HomeworkCommentFormViewModelImpl$commentHomework$1(HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl) {
        this.f13565c = homeworkCommentFormViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<NewlyCreatedHomeworkCommentDto> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        HomeworkCommentFormViewModelImpl homeworkCommentFormViewModelImpl = this.f13565c;
        HomeworkRepository access$getRepository$p = homeworkCommentFormViewModelImpl.f13556r;
        Long P1 = this.f13565c.mo13052P1();
        if (P1 == null) {
            Intrinsics.throwNpe();
        }
        C5027n d = access$getRepository$p.mo13009a(P1.longValue(), this.f13565c.mo13046K0(), profile).mo17237d(1);
        Intrinsics.checkExpressionValueIsNotNull(d, "repository.postHomeworkC…                 .take(1)");
        return homeworkCommentFormViewModelImpl.mo11505a(d);
    }
}
