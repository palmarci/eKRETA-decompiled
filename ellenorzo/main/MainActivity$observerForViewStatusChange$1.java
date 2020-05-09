package p289hu.ekreta.ellenorzo.main;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import p211h.p262m.p263d.C3791x;
import p211h.p271p.C3825s;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/main/MainViewState;", "kotlin.jvm.PlatformType", "onChanged"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainActivity$observerForViewStatusChange$1 */
/* compiled from: MainActivity.kt */
public final class MainActivity$observerForViewStatusChange$1<T> implements C3825s<MainViewState> {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f13692a;

    public MainActivity$observerForViewStatusChange$1(MainActivity mainActivity) {
        this.f13692a = mainActivity;
    }

    /* renamed from: a */
    public final void onChanged(MainViewState mainViewState) {
        C3791x a = this.f13692a.mo10581g().mo10673a();
        a.mo10551a(C4014R.C4016id.fragmentContainer, (Fragment) mainViewState.mo13205a().invoke(), null, 2);
        a.mo10547a();
    }
}
