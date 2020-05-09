package p289hu.ekreta.ellenorzo.main;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$1 */
/* compiled from: MainActivity.kt */
public final class MainActivity$handleBadgeCount$1 extends Lambda implements Function1<Map<MainMenuItem, ? extends Integer>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MainActivity f13686c;

    public MainActivity$handleBadgeCount$1(MainActivity mainActivity) {
        this.f13686c = mainActivity;
        super(1);
    }

    /* renamed from: a */
    public final void mo13161a(Map<MainMenuItem, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "it");
        for (MainMenuItem mainMenuItem : this.f13686c.f13681A) {
            if (!(mainMenuItem.mo13170b() == null || map.get(mainMenuItem) == null)) {
                ((AdvancedBottomNavigationView) this.f13686c.mo13159c(C4014R.C4016id.navigation)).mo16359a(mainMenuItem.mo13170b().intValue(), (Integer) map.get(mainMenuItem));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13161a((Map) obj);
        return Unit.INSTANCE;
    }
}
