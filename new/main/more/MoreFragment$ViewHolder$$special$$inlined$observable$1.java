package hu.ekreta.ellenorzo.main.more;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import h.i.f.a;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.more.MoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class MoreFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<MoreMenuItem> {
    public final /* synthetic */ MoreFragment.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, MoreFragment.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, MoreMenuItem moreMenuItem, MoreMenuItem moreMenuItem2) {
        int i2;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        MoreMenuItem moreMenuItem3 = moreMenuItem2;
        MoreMenuItem moreMenuItem4 = moreMenuItem;
        if (moreMenuItem3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((TextView) view.findViewById(R.id.more_item_textview)).setText(moreMenuItem3.d());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((ImageView) view2.findViewById(R.id.more_item_imageview)).setImageResource(moreMenuItem3.c());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ImageView imageView = (ImageView) view3.findViewById(R.id.more_item_imageview);
            Context n2 = this.c.x.n();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            imageView.setColorFilter(a.a(n2, (int) R.color.moreMenuIconTintColor), PorterDuff.Mode.SRC_IN);
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            View findViewById = view4.findViewById(R.id.more_item_badge_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.more_item_badge_text");
            if (!StringsKt__StringsJVMKt.isBlank(moreMenuItem3.a())) {
                View view5 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                AppCompatTextView appCompatTextView = (AppCompatTextView) view5.findViewById(R.id.badge_text);
                Intrinsics.checkExpressionValueIsNotNull(appCompatTextView, "itemView.badge_text");
                appCompatTextView.setText(moreMenuItem3.a());
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }
}
