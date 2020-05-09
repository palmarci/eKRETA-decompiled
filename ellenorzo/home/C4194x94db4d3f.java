package p289hu.ekreta.ellenorzo.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p211h.p238i.p240f.C3545a;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.home.HomeFragment.DashboardItemViewHolder;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4194x94db4d3f extends ObservableProperty<ListItem> {

    /* renamed from: c */
    public final /* synthetic */ DashboardItemViewHolder f13338c;

    public C4194x94db4d3f(Object obj, Object obj2, DashboardItemViewHolder dashboardItemViewHolder) {
        this.f13338c = dashboardItemViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        boolean z;
        boolean z2;
        int i;
        HomeFragment homeFragment;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ListItem listItem3 = listItem2;
        ListItem listItem4 = listItem;
        if (!(listItem3 instanceof DashboardItem)) {
            listItem3 = null;
        }
        DashboardItem dashboardItem = (DashboardItem) listItem3;
        if (dashboardItem != null) {
            View view = this.f13338c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.titleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.titleLabel");
            textView.setText(dashboardItem.mo12867i());
            View view2 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
            ExtensionsKt.m14651a(textView2, dashboardItem.mo12860d());
            View view3 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.dateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.dateLabel");
            textView3.setText(dashboardItem.mo12859c());
            View view4 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str);
            ((TextView) view4.findViewById(C4014R.C4016id.valueTitleLabel)).setBackgroundResource(dashboardItem.mo12862f());
            View view5 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view5, str);
            TextView textView4 = (TextView) view5.findViewById(C4014R.C4016id.valueTitleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.valueTitleLabel");
            textView4.setText(dashboardItem.getValueTitle());
            View view6 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view6, str);
            TextView textView5 = (TextView) view6.findViewById(C4014R.C4016id.valueDescLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.valueDescLabel");
            ExtensionsKt.m14664b(textView5, dashboardItem.getValueDesc());
            View view7 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view7, str);
            ConstraintLayout constraintLayout = (ConstraintLayout) view7.findViewById(C4014R.C4016id.itemLayout);
            Context a = dashboardItem.mo12857a();
            Boolean h = dashboardItem.mo12866h();
            if (h != null) {
                z = h.booleanValue();
            } else {
                z = dashboardItem.mo12863g();
            }
            constraintLayout.setBackgroundColor(C3545a.m9033a(a, z ? C4014R.color.colorSecondary : C4014R.color.unreadItemBackground));
            View view8 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view8, str);
            TextView textView6 = (TextView) view8.findViewById(C4014R.C4016id.readStateText);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.readStateText");
            Boolean h2 = dashboardItem.mo12866h();
            if (h2 != null) {
                z2 = h2.booleanValue();
            } else {
                z2 = dashboardItem.mo12863g();
            }
            if (z2) {
                homeFragment = this.f13338c.f13333x;
                i = C4014R.string.notReadMessage;
            } else {
                homeFragment = this.f13338c.f13333x;
                i = C4014R.string.readMessage;
            }
            textView6.setText(homeFragment.mo6148a(i));
            View view9 = this.f13338c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view9, str);
            ImageView imageView = (ImageView) view9.findViewById(C4014R.C4016id.readStateIcon);
            Boolean h3 = dashboardItem.mo12866h();
            imageView.setImageResource(h3 != null ? h3.booleanValue() : dashboardItem.mo12863g() ? C4014R.C4015drawable.ic_unread : C4014R.C4015drawable.ic_book_24px);
        }
    }
}
