package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import k.b.b0.f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$teacherHomework$2$1$1", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$$special$$inlined$also$lambda$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$1<T> implements f<Profile> {
    public final /* synthetic */ Homework c;
    public final /* synthetic */ HomeworkDetailViewModelImpl$$special$$inlined$observable$1 e;

    public HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(Homework homework, HomeworkDetailViewModelImpl$$special$$inlined$observable$1 homeworkDetailViewModelImpl$$special$$inlined$observable$1) {
        this.c = homework;
        this.e = homeworkDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final void accept(Profile profile) {
        boolean z = true;
        this.e.c.c(profile.v() == SupportedRole.Student && this.c.p());
        HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.e.c;
        if (profile.v() != SupportedRole.Student) {
            z = false;
        }
        homeworkDetailViewModelImpl.e(z);
    }
}
