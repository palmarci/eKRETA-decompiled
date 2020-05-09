package p289hu.ekreta.ellenorzo.main;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainViewState;", "", "createFragment", "Lkotlin/Function0;", "Landroidx/fragment/app/Fragment;", "relateToEAdministration", "", "hiddenForStudent", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;ZZ)V", "getCreateFragment", "()Lkotlin/jvm/functions/Function0;", "getHiddenForStudent", "()Z", "getRelateToEAdministration", "DASHBOARD", "LESSONS", "SUBJECTS", "MESSAGES", "MORE", "OMISSIONS", "NOTES", "ABOUT", "NOTICE_BOARD", "CASES", "HOMEWORKS", "ANNOUNCED_TESTS", "POST_TMGI", "CLASS_MASTERS", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewState */
/* compiled from: MainViewState.kt */
public enum MainViewState {
    DASHBOARD(C42361.INSTANCE, false, false, 6),
    LESSONS(C42422.INSTANCE, false, false, 6),
    SUBJECTS(C42433.INSTANCE, false, false, 6),
    MESSAGES(C42444.INSTANCE, true, false, 4),
    MORE(C42455.INSTANCE, false, false, 6),
    OMISSIONS(C42466.INSTANCE, false, false, 6),
    NOTES(C42477.INSTANCE, false, false, 6),
    ABOUT(C42488.INSTANCE, false, false, 6),
    NOTICE_BOARD(C42499.INSTANCE, false, false, 6),
    CASES(C423710.INSTANCE, true, true),
    HOMEWORKS(C423811.INSTANCE, false, false, 6),
    ANNOUNCED_TESTS(C423912.INSTANCE, false, false, 6),
    POST_TMGI(C424013.INSTANCE, true, true),
    CLASS_MASTERS(C424114.INSTANCE, false, false, 6);
    

    /* renamed from: c */
    public final Function0<Fragment> f13751c;

    /* renamed from: e */
    public final boolean f13752e;

    /* renamed from: f */
    public final boolean f13753f;

    /* access modifiers changed from: public */
    MainViewState(Function0<? extends Fragment> function0, boolean z, boolean z2) {
        this.f13751c = function0;
        this.f13752e = z;
        this.f13753f = z2;
    }

    /* renamed from: a */
    public final Function0<Fragment> mo13205a() {
        return this.f13751c;
    }

    /* renamed from: b */
    public final boolean mo13206b() {
        return this.f13753f;
    }

    /* renamed from: c */
    public final boolean mo13207c() {
        return this.f13752e;
    }
}
