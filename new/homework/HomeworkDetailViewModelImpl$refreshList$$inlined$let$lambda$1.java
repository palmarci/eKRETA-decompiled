package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$refreshList$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ Homework c;
    public final /* synthetic */ HomeworkDetailViewModelImpl e;

    public HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1(Homework homework, HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        this.c = homework;
        this.e = homeworkDetailViewModelImpl;
    }

    /* renamed from: a */
    public final n<List<HomeworkComment>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.e;
        n<List<HomeworkComment>> d2 = homeworkDetailViewModelImpl.B.a(Long.parseLong(this.c.d()), profile).d(1);
        Intrinsics.checkExpressionValueIsNotNull(d2, "repository.fetchHomework…                 .take(1)");
        return homeworkDetailViewModelImpl.a(d2);
    }
}
