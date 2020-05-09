package p289hu.ekreta.ellenorzo.profile.detail;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.profile.Guardian;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010$\u001a\u00020%H&R\u001a\u0010\u0003\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "birthDate", "getBirthDate", "setBirthDate", "birthName", "getBirthName", "setBirthName", "birthPlace", "getBirthPlace", "setBirthPlace", "guardianList", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/profile/Guardian;", "getGuardianList", "()Landroidx/lifecycle/LiveData;", "mothersName", "getMothersName", "setMothersName", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setProfile", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "studentName", "getStudentName", "setStudentName", "killRefreshToken", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel */
/* compiled from: ProfileDetailViewModel.kt */
public interface ProfileDetailViewModel extends UiCommandSource, C3705i {
    /* renamed from: C1 */
    String mo14224C1();

    /* renamed from: H0 */
    String mo14225H0();

    /* renamed from: c */
    void mo14226c(Profile profile);

    LiveData<List<Guardian>> getGuardianList();

    /* renamed from: m1 */
    String mo14228m1();

    /* renamed from: q */
    String mo14229q();

    /* renamed from: q1 */
    String mo14230q1();

    /* renamed from: w1 */
    void mo14231w1();

    /* renamed from: z1 */
    String mo14232z1();
}
