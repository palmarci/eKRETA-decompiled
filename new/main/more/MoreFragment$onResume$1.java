package hu.ekreta.ellenorzo.main.more;

import androidx.recyclerview.widget.RecyclerView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainMenuItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: MoreFragment.kt */
public final class MoreFragment$onResume$1 extends Lambda implements Function1<Map<MainMenuItem, ? extends Integer>, Unit> {
    public final /* synthetic */ MoreFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$onResume$1(MoreFragment moreFragment) {
        super(1);
        this.c = moreFragment;
    }

    public final void a(Map<MainMenuItem, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "it");
        int i2 = 0;
        for (MoreMenuItem moreMenuItem : this.c.c0) {
            Integer num = map.get(moreMenuItem.b());
            if (num != null) {
                this.c.c0.set(i2, MoreMenuItem.copy$default(moreMenuItem, (MainMenuItem) null, 0, 0, this.c.f(num.intValue()), 7, (Object) null));
                RecyclerView recyclerView = (RecyclerView) this.c.e(R.id.more_recyclerview);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "more_recyclerview");
                RecyclerView.g adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.c(i2);
                }
            }
            i2++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Map) obj);
        return Unit.INSTANCE;
    }
}
