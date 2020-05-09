package p289hu.ekreta.ellenorzo.home;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.home.HomeFragment.DashboardItemViewHolder;
import p289hu.ekreta.ellenorzo.home.HomeFragment.SectionHeaderViewHolder;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/home/ListItem;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeFragment$onViewCreated$adapter$2 */
/* compiled from: HomeFragment.kt */
public final class HomeFragment$onViewCreated$adapter$2 extends Lambda implements Function2<ViewGroup, Integer, MVVMViewHolder<? super ListItem>> {

    /* renamed from: c */
    public final /* synthetic */ HomeFragment f13341c;

    public HomeFragment$onViewCreated$adapter$2(HomeFragment homeFragment) {
        this.f13341c = homeFragment;
        super(2);
    }

    /* renamed from: a */
    public final MVVMViewHolder<? super ListItem> mo12828a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 0) {
            return new DashboardItemViewHolder(this.f13341c, viewGroup);
        }
        return new SectionHeaderViewHolder(this.f13341c, viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo12828a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
