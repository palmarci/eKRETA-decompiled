package hu.ekreta.ellenorzo.main;

import h.m.d.x;
import h.p.s;
import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/main/MainViewState;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity$observerForViewStatusChange$1<T> implements s<MainViewState> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f5731a;

    public MainActivity$observerForViewStatusChange$1(MainActivity mainActivity) {
        this.f5731a = mainActivity;
    }

    /* renamed from: a */
    public final void onChanged(MainViewState mainViewState) {
        x a2 = this.f5731a.g().a();
        a2.a(R.id.fragmentContainer, mainViewState.a().invoke(), (String) null, 2);
        a2.a();
    }
}
