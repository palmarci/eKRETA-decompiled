package hu.ekreta.ellenorzo.profile.detail;

import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.profile.Guardian;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010$\u001a\u00020%H&R\u001a\u0010\u0003\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/profile/detail/ProfileDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "birthDate", "getBirthDate", "setBirthDate", "birthName", "getBirthName", "setBirthName", "birthPlace", "getBirthPlace", "setBirthPlace", "guardianList", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/profile/Guardian;", "getGuardianList", "()Landroidx/lifecycle/LiveData;", "mothersName", "getMothersName", "setMothersName", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "setProfile", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "studentName", "getStudentName", "setStudentName", "killRefreshToken", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileDetailViewModel.kt */
public interface ProfileDetailViewModel extends UiCommandSource, i {
    void E1();

    String H1();

    String I0();

    String K1();

    void c(Profile profile);

    LiveData<List<Guardian>> getGuardianList();

    String q();

    String s1();

    String y1();
}
