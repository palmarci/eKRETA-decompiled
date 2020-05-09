package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Completable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$deleteHomeworkComment$1 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$deleteHomeworkComment$1<T, R> implements C4675h<Profile, C4991d> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkDetailViewModelImpl f13486c;

    /* renamed from: e */
    public final /* synthetic */ HomeworkComment f13487e;

    public HomeworkDetailViewModelImpl$deleteHomeworkComment$1(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl, HomeworkComment homeworkComment) {
        this.f13486c = homeworkDetailViewModelImpl;
        this.f13487e = homeworkComment;
    }

    /* renamed from: a */
    public final C4667b apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.f13486c;
        return homeworkDetailViewModelImpl.mo11504a(homeworkDetailViewModelImpl.f13473x.mo13007a(this.f13487e, profile));
    }
}
