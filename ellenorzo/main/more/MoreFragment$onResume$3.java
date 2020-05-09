package p289hu.ekreta.ellenorzo.main.more;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.main.more.MoreFragment.ViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/main/more/MoreFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/main/more/MoreFragment;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment$onResume$3 */
/* compiled from: MoreFragment.kt */
public final class MoreFragment$onResume$3 extends Lambda implements Function2<ViewGroup, Integer, ViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ MoreFragment f13764c;

    public MoreFragment$onResume$3(MoreFragment moreFragment) {
        this.f13764c = moreFragment;
        super(2);
    }

    /* renamed from: a */
    public final ViewHolder mo13217a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new ViewHolder(this.f13764c, viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo13217a(viewGroup);
    }
}
