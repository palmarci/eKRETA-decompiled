package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006%"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "navigationData", "Lhu/ekreta/ellenorzo/main/MainNavigationData;", "itemId", "", "order", "titleResId", "iconResId", "(Ljava/lang/String;ILhu/ekreta/ellenorzo/main/MainNavigationData;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemId", "getNavigationData", "()Lhu/ekreta/ellenorzo/main/MainNavigationData;", "getOrder", "getTitleResId", "DASHBOARD", "LESSONS", "SUBJECTS", "OMISSIONS", "MORE", "MESSAGES", "NOTES", "ABOUT", "NOTICE_BOARD", "CASES", "POST_TMGI", "HOMEWORKS", "ANNOUNCED_TESTS", "CLASS_MASTERS", "FAQ", "PRIVACY_POLICY", "SETTINGS", "PROFILES", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainMenuItem */
/* compiled from: MainMenuItem.kt */
public enum MainMenuItem {
    DASHBOARD(r4, r6, r6, Integer.valueOf(C4014R.string.RootContentPage_Title), Integer.valueOf(C4014R.mipmap.menu_dashboard_24dp)),
    LESSONS(r14, r16, r16, Integer.valueOf(C4014R.string.Lessons_Page_Title), Integer.valueOf(C4014R.mipmap.menu_timetable_24dp)),
    SUBJECTS(r3, r24, r24, Integer.valueOf(C4014R.string.Subjects_Page_Title), Integer.valueOf(C4014R.mipmap.menu_subjects_24dp)),
    OMISSIONS(r8, r10, r10, Integer.valueOf(C4014R.string.Absences_Page_Title), Integer.valueOf(C4014R.mipmap.menu_omissions_24dp)),
    MORE(r3, r18, r18, Integer.valueOf(C4014R.string.More_Page_Title), Integer.valueOf(C4014R.mipmap.menu_others_24dp)),
    MESSAGES(new MainNavigationData(MainViewState.MESSAGES), null, null, null, null, 30),
    NOTES(new MainNavigationData(MainViewState.NOTES), null, null, null, null, 30),
    ABOUT(new MainNavigationData(MainViewState.ABOUT), null, null, null, null, 30),
    NOTICE_BOARD(new MainNavigationData(MainViewState.NOTICE_BOARD), null, null, null, null, 30),
    CASES(new MainNavigationData(MainViewState.CASES), null, null, null, null, 30),
    POST_TMGI(new MainNavigationData(MainViewState.POST_TMGI), null, null, null, null, 30),
    HOMEWORKS(new MainNavigationData(MainViewState.HOMEWORKS), null, null, null, null, 30),
    ANNOUNCED_TESTS(new MainNavigationData(MainViewState.ANNOUNCED_TESTS), null, null, null, null, 30),
    CLASS_MASTERS(new MainNavigationData(MainViewState.CLASS_MASTERS), null, null, null, null, 30),
    FAQ(new MainNavigationData(null, r3, null), null, null, null, null, 30),
    PRIVACY_POLICY(new MainNavigationData(null, r4, null), null, null, null, null, 30),
    SETTINGS(new MainNavigationData(null, null, r2), null, null, null, null, 30),
    PROFILES(new MainNavigationData(null, null, r2), null, null, null, null, 30);
    
    public static final Companion Companion = null;

    /* renamed from: c */
    public final MainNavigationData f13702c;

    /* renamed from: e */
    public final Integer f13703e;

    /* renamed from: f */
    public final Integer f13704f;

    /* renamed from: g */
    public final Integer f13705g;

    /* renamed from: h */
    public final Integer f13706h;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainMenuItem$Companion;", "", "()V", "DASHBOARD_ID", "", "LESSONS_ID", "MORE_ID", "OMISSIONS_ID", "SUBJECTS_ID", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.main.MainMenuItem$Companion */
    /* compiled from: MainMenuItem.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion(null);
    }

    /* access modifiers changed from: public */
    MainMenuItem(MainNavigationData mainNavigationData, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f13702c = mainNavigationData;
        this.f13703e = num;
        this.f13704f = num2;
        this.f13705g = num3;
        this.f13706h = num4;
    }

    /* renamed from: a */
    public final Integer mo13169a() {
        return this.f13706h;
    }

    /* renamed from: b */
    public final Integer mo13170b() {
        return this.f13703e;
    }

    /* renamed from: c */
    public final MainNavigationData mo13171c() {
        return this.f13702c;
    }

    /* renamed from: e */
    public final Integer mo13172e() {
        return this.f13704f;
    }

    /* renamed from: f */
    public final Integer mo13173f() {
        return this.f13705g;
    }
}
