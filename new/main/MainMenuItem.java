package hu.ekreta.ellenorzo.main;

import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006%"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "navigationData", "Lhu/ekreta/ellenorzo/main/MainNavigationData;", "itemId", "", "order", "titleResId", "iconResId", "(Ljava/lang/String;ILhu/ekreta/ellenorzo/main/MainNavigationData;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemId", "getNavigationData", "()Lhu/ekreta/ellenorzo/main/MainNavigationData;", "getOrder", "getTitleResId", "DASHBOARD", "LESSONS", "SUBJECTS", "OMISSIONS", "MORE", "MESSAGES", "NOTES", "ABOUT", "NOTICE_BOARD", "CASES", "POST_TMGI", "HOMEWORKS", "ANNOUNCED_TESTS", "CLASS_MASTERS", "FAQ", "PRIVACY_POLICY", "SETTINGS", "PROFILES", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MainMenuItem.kt */
public enum MainMenuItem {
    DASHBOARD(new MainNavigationData(MainViewState.DASHBOARD), 1, 1, Integer.valueOf(R.string.RootContentPage_Title), Integer.valueOf(R.drawable.menu_dashboard_24dp)),
    LESSONS(new MainNavigationData(MainViewState.LESSONS), 2, 2, Integer.valueOf(R.string.Lessons_Page_Title), Integer.valueOf(R.drawable.menu_timetable_24dp)),
    SUBJECTS(new MainNavigationData(MainViewState.SUBJECTS), 3, 3, Integer.valueOf(R.string.Subjects_Page_Title), Integer.valueOf(R.drawable.menu_subjects_24dp)),
    OMISSIONS(new MainNavigationData(MainViewState.OMISSIONS), 4, 4, Integer.valueOf(R.string.Absences_Page_Title), Integer.valueOf(R.drawable.menu_omissions_24dp)),
    MORE(new MainNavigationData(MainViewState.MORE), 5, 5, Integer.valueOf(R.string.More_Page_Title), Integer.valueOf(R.drawable.menu_others_24dp)),
    MESSAGES(new MainNavigationData(MainViewState.MESSAGES), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    NOTES(new MainNavigationData(MainViewState.NOTES), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    ABOUT(new MainNavigationData(MainViewState.ABOUT), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    NOTICE_BOARD(new MainNavigationData(MainViewState.NOTICE_BOARD), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    CASES(new MainNavigationData(MainViewState.CASES), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    POST_TMGI(new MainNavigationData(MainViewState.POST_TMGI), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    HOMEWORKS(new MainNavigationData(MainViewState.HOMEWORKS), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    ANNOUNCED_TESTS(new MainNavigationData(MainViewState.ANNOUNCED_TESTS), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    CLASS_MASTERS(new MainNavigationData(MainViewState.CLASS_MASTERS), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    FAQ(new MainNavigationData((MainViewState) null, "https://tudasbazis.ekreta.hu/pages/viewpage.action?pageId=4065021", (Class<?>) null), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    PRIVACY_POLICY(new MainNavigationData((MainViewState) null, "https://tudasbazis.ekreta.hu/pages/viewpage.action?pageId=4064926", (Class<?>) null), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    SETTINGS(new MainNavigationData((MainViewState) null, (String) null, r2), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30),
    PROFILES(new MainNavigationData((MainViewState) null, (String) null, r2), (int) null, (MainNavigationData) null, (Integer) null, (Integer) null, 30);
    
    public static final Companion Companion = null;
    public final MainNavigationData c;
    public final Integer e;
    public final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f5737g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f5738h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainMenuItem$Companion;", "", "()V", "DASHBOARD_ID", "", "LESSONS_ID", "MORE_ID", "OMISSIONS_ID", "SUBJECTS_ID", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: MainMenuItem.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    MainMenuItem(MainNavigationData mainNavigationData, Integer num, Integer num2, Integer num3, Integer num4) {
        this.c = mainNavigationData;
        this.e = num;
        this.f = num2;
        this.f5737g = num3;
        this.f5738h = num4;
    }

    public final Integer a() {
        return this.f5738h;
    }

    public final Integer b() {
        return this.e;
    }

    public final MainNavigationData c() {
        return this.c;
    }

    public final Integer e() {
        return this.f;
    }

    public final Integer f() {
        return this.f5737g;
    }
}
