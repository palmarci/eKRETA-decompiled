package p289hu.ekreta.ellenorzo.main;

import androidx.lifecycle.LiveData;
import java.util.Map;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014H&J\b\u0010\u0018\u001a\u00020\u0011H&J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0016H&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "activeProfileName", "", "getActiveProfileName", "()Ljava/lang/String;", "activeProfileRole", "getActiveProfileRole", "appVersion", "getAppVersion", "viewState", "Landroidx/lifecycle/LiveData;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "changeProfile", "", "profileId", "getBadgeCount", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "onBackPressed", "onMenuItemSelected", "menuItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModel */
/* compiled from: MainViewModel.kt */
public interface MainViewModel extends UiCommandSource, C3705i {
    /* renamed from: L0 */
    String mo13177L0();

    /* renamed from: a */
    void mo13178a(MainMenuItem mainMenuItem);

    /* renamed from: g1 */
    C5027n<Map<MainMenuItem, Integer>> mo13179g1();

    LiveData<MainViewState> getViewState();

    /* renamed from: l */
    void mo13181l(String str);

    /* renamed from: n */
    String mo13182n();

    /* renamed from: t */
    void mo13183t();

    /* renamed from: v1 */
    String mo13184v1();
}
