package p289hu.ekreta.ellenorzo.main.more;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C2900g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainMenuItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment$onResume$1 */
/* compiled from: MoreFragment.kt */
public final class MoreFragment$onResume$1 extends Lambda implements Function1<Map<MainMenuItem, ? extends Integer>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MoreFragment f13763c;

    public MoreFragment$onResume$1(MoreFragment moreFragment) {
        this.f13763c = moreFragment;
        super(1);
    }

    /* renamed from: a */
    public final void mo13215a(Map<MainMenuItem, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "it");
        int i = 0;
        for (MoreMenuItem moreMenuItem : this.f13763c.f13756c0) {
            Integer num = (Integer) map.get(moreMenuItem.mo13223b());
            if (num != null) {
                this.f13763c.f13756c0.set(i, MoreMenuItem.copy$default(moreMenuItem, null, 0, 0, this.f13763c.mo13211f(num.intValue()), 7, null));
                RecyclerView recyclerView = (RecyclerView) this.f13763c.mo13210e(C4014R.C4016id.more_recyclerview);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "more_recyclerview");
                C2900g adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.mo6662c(i);
                }
            }
            i++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13215a((Map) obj);
        return Unit.INSTANCE;
    }
}
