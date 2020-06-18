package hu.ekreta.ellenorzo.main;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainViewState;", "", "createFragment", "Lkotlin/Function0;", "Landroidx/fragment/app/Fragment;", "relateToEAdministration", "", "hiddenForStudent", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;ZZ)V", "getCreateFragment", "()Lkotlin/jvm/functions/Function0;", "getHiddenForStudent", "()Z", "getRelateToEAdministration", "DASHBOARD", "LESSONS", "SUBJECTS", "MESSAGES", "MORE", "OMISSIONS", "NOTES", "ABOUT", "NOTICE_BOARD", "CASES", "HOMEWORKS", "ANNOUNCED_TESTS", "POST_TMGI", "CLASS_MASTERS", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MainViewState.kt */
public enum MainViewState {
    DASHBOARD(AnonymousClass1.INSTANCE, false, false, 6),
    LESSONS(AnonymousClass2.INSTANCE, false, false, 6),
    SUBJECTS(AnonymousClass3.INSTANCE, false, false, 6),
    MESSAGES(AnonymousClass4.INSTANCE, true, false, 4),
    MORE(AnonymousClass5.INSTANCE, false, false, 6),
    OMISSIONS(AnonymousClass6.INSTANCE, false, false, 6),
    NOTES(AnonymousClass7.INSTANCE, false, false, 6),
    ABOUT(AnonymousClass8.INSTANCE, false, false, 6),
    NOTICE_BOARD(AnonymousClass9.INSTANCE, false, false, 6),
    CASES(AnonymousClass10.INSTANCE, true, true),
    HOMEWORKS(AnonymousClass11.INSTANCE, false, false, 6),
    ANNOUNCED_TESTS(AnonymousClass12.INSTANCE, false, false, 6),
    POST_TMGI(AnonymousClass13.INSTANCE, true, true),
    CLASS_MASTERS(AnonymousClass14.INSTANCE, false, false, 6);
    
    public final Function0<Fragment> c;
    public final boolean e;
    public final boolean f;

    /* access modifiers changed from: public */
    MainViewState(Function0<? extends Fragment> function0, boolean z, boolean z2) {
        this.c = function0;
        this.e = z;
        this.f = z2;
    }

    public final Function0<Fragment> a() {
        return this.c;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c() {
        return this.e;
    }
}
