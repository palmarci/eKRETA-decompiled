package p289hu.ekreta.ellenorzo.homework;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$refreshList$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ Homework f13478c;

    /* renamed from: e */
    public final /* synthetic */ HomeworkDetailViewModelImpl f13479e;

    public HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1(Homework homework, HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        this.f13478c = homework;
        this.f13479e = homeworkDetailViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<List<HomeworkComment>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.f13479e;
        C5027n d = homeworkDetailViewModelImpl.f13473x.mo13008a(Long.parseLong(this.f13478c.mo11316d()), profile).mo17237d(1);
        Intrinsics.checkExpressionValueIsNotNull(d, "repository.fetchHomework…                 .take(1)");
        return homeworkDetailViewModelImpl.mo11505a(d);
    }
}
