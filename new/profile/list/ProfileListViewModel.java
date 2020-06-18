package hu.ekreta.ellenorzo.profile.list;

import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH&J\b\u0010\u001e\u001a\u00020\u001aH&J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH&J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006!"}, d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "fullName", "", "getFullName", "()Ljava/lang/String;", "grantType", "getGrantType", "instituteName", "getInstituteName", "profiles", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "getProfiles", "()Landroidx/lifecycle/LiveData;", "progressVisible", "", "getProgressVisible", "()Z", "studentName", "getStudentName", "studentShortName", "getStudentShortName", "onAddProfile", "", "onDeleteActiveProfile", "onDeleteProfile", "profile", "onDetailActiveProfile", "onDetailProfile", "onSelectProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileListViewModel.kt */
public interface ProfileListViewModel extends UiCommandSource, i {
    String B0();

    void C1();

    void W0();

    void a(Profile profile);

    void a1();

    void b(Profile profile);

    void d(Profile profile);

    boolean d();

    LiveData<List<Profile>> getProfiles();

    String q();

    String v1();
}
