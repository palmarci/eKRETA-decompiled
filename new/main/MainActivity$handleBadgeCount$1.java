package hu.ekreta.ellenorzo.main;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity$handleBadgeCount$1 extends Lambda implements Function1<Map<MainMenuItem, ? extends Integer>, Unit> {
    public final /* synthetic */ MainActivity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainActivity$handleBadgeCount$1(MainActivity mainActivity) {
        super(1);
        this.c = mainActivity;
    }

    public final void a(Map<MainMenuItem, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "it");
        for (MainMenuItem mainMenuItem : this.c.A) {
            if (!(mainMenuItem.b() == null || map.get(mainMenuItem) == null)) {
                ((AdvancedBottomNavigationView) this.c.c(R.id.navigation)).a(mainMenuItem.b().intValue(), map.get(mainMenuItem));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Map) obj);
        return Unit.INSTANCE;
    }
}
