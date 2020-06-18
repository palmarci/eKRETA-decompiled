package hu.ekreta.ellenorzo.about;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import h.i.f.a;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.about.AboutFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AboutFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<AboutMenuItem> {
    public final /* synthetic */ AboutFragment.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, AboutFragment.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, AboutMenuItem aboutMenuItem, AboutMenuItem aboutMenuItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        AboutMenuItem aboutMenuItem3 = aboutMenuItem2;
        AboutMenuItem aboutMenuItem4 = aboutMenuItem;
        if (aboutMenuItem3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((TextView) view.findViewById(R.id.about_item_textview)).setText(aboutMenuItem3.c());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((ImageView) view2.findViewById(R.id.about_item_imageview)).setImageResource(aboutMenuItem3.b());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ImageView imageView = (ImageView) view3.findViewById(R.id.about_item_imageview);
            Context n2 = this.c.x.n();
            if (n2 == null) {
                Intrinsics.throwNpe();
            }
            imageView.setColorFilter(a.a(n2, (int) R.color.moreMenuIconTintColor), PorterDuff.Mode.SRC_IN);
        }
    }
}
