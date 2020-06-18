package hu.ekreta.ellenorzo.home;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import h.i.f.a;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.home.HomeFragment;
import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<ListItem> {
    public final /* synthetic */ HomeFragment.DashboardItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragment$DashboardItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, HomeFragment.DashboardItemViewHolder dashboardItemViewHolder) {
        super(obj2);
        this.c = dashboardItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        boolean z;
        boolean z2;
        HomeFragment homeFragment;
        int i2;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ListItem listItem3 = listItem2;
        ListItem listItem4 = listItem;
        ListItem.DashboardItem dashboardItem = (ListItem.DashboardItem) (!(listItem3 instanceof ListItem.DashboardItem) ? null : listItem3);
        if (dashboardItem != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.titleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.titleLabel");
            textView.setText(dashboardItem.i());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
            ExtensionsKt.a(textView2, dashboardItem.d());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.dateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.dateLabel");
            textView3.setText(dashboardItem.c());
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((TextView) view4.findViewById(R.id.valueTitleLabel)).setBackgroundResource(dashboardItem.f());
            if (listItem3 instanceof ListItem.DashboardItem.AnnouncedTestItem) {
                View view5 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                TextView textView4 = (TextView) view5.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.valueTitleLabel");
                textView4.setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
                View view6 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                TextView textView5 = (TextView) view6.findViewById(R.id.valueTitleLabel);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.valueTitleLabel");
                textView5.setBackgroundTintList(ColorStateList.valueOf(a.a(dashboardItem.a(), (int) R.color.colorPrimary)));
            }
            View view7 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            TextView textView6 = (TextView) view7.findViewById(R.id.valueTitleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.valueTitleLabel");
            textView6.setText(dashboardItem.getValueTitle());
            View view8 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            TextView textView7 = (TextView) view8.findViewById(R.id.valueDescLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.valueDescLabel");
            ExtensionsKt.b(textView7, dashboardItem.getValueDesc());
            View view9 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view9.findViewById(R.id.itemLayout);
            Context a2 = dashboardItem.a();
            Boolean h2 = dashboardItem.h();
            if (h2 != null) {
                z = h2.booleanValue();
            } else {
                z = dashboardItem.g();
            }
            constraintLayout.setBackgroundColor(a.a(a2, z ? R.color.colorSecondary : R.color.unreadItemBackground));
            View view10 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            TextView textView8 = (TextView) view10.findViewById(R.id.readStateText);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "itemView.readStateText");
            Boolean h3 = dashboardItem.h();
            if (h3 != null) {
                z2 = h3.booleanValue();
            } else {
                z2 = dashboardItem.g();
            }
            if (z2) {
                homeFragment = this.c.x;
                i2 = R.string.notReadMessage;
            } else {
                homeFragment = this.c.x;
                i2 = R.string.readMessage;
            }
            textView8.setText(homeFragment.a(i2));
            View view11 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ImageView imageView = (ImageView) view11.findViewById(R.id.readStateIcon);
            Boolean h4 = dashboardItem.h();
            imageView.setImageResource(h4 != null ? h4.booleanValue() : dashboardItem.g() ? R.drawable.ic_unread_24dp : R.drawable.ic_book_24px);
        }
    }
}
