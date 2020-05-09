package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo17463d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "accept", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$teacherHomework$2$1$1", "hu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl$$special$$inlined$also$lambda$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class C4204xc339e19<T> implements C4673f<Profile> {

    /* renamed from: c */
    public final /* synthetic */ Homework f13476c;

    /* renamed from: e */
    public final /* synthetic */ HomeworkDetailViewModelImpl$$special$$inlined$observable$1 f13477e;

    public C4204xc339e19(Homework homework, HomeworkDetailViewModelImpl$$special$$inlined$observable$1 homeworkDetailViewModelImpl$$special$$inlined$observable$1) {
        this.f13476c = homework;
        this.f13477e = homeworkDetailViewModelImpl$$special$$inlined$observable$1;
    }

    /* renamed from: a */
    public final void accept(Profile profile) {
        this.f13477e.f13474c.mo12955b(profile.mo14064v() == SupportedRole.Student && this.f13476c.mo12916o());
    }
}
