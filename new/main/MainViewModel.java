package hu.ekreta.ellenorzo.main;

import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.Map;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014H&J\b\u0010\u0018\u001a\u00020\u0011H&J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0016H&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "activeProfileName", "", "getActiveProfileName", "()Ljava/lang/String;", "activeProfileRole", "getActiveProfileRole", "appVersion", "getAppVersion", "viewState", "Landroidx/lifecycle/LiveData;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "changeProfile", "", "profileId", "getBadgeCount", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "onBackPressed", "onMenuItemSelected", "menuItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MainViewModel.kt */
public interface MainViewModel extends UiCommandSource, i {
    String D1();

    String N0();

    void a(MainMenuItem mainMenuItem);

    LiveData<MainViewState> getViewState();

    void l(String str);

    String n();

    n<Map<MainMenuItem, Integer>> n1();

    void t();
}
