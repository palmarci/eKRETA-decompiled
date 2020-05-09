package p289hu.ekreta.ellenorzo.main.more;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.more.MoreFragment.ViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class MoreFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<MoreMenuItem> {

    /* renamed from: c */
    public final /* synthetic */ ViewHolder f13762c;

    public MoreFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ViewHolder viewHolder) {
        this.f13762c = viewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, MoreMenuItem moreMenuItem, MoreMenuItem moreMenuItem2) {
        int i;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        MoreMenuItem moreMenuItem3 = moreMenuItem2;
        MoreMenuItem moreMenuItem4 = moreMenuItem;
        if (moreMenuItem3 != null) {
            View view = this.f13762c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ((TextView) view.findViewById(C4014R.C4016id.more_item_textview)).setText(moreMenuItem3.mo13225d());
            View view2 = this.f13762c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            ((ImageView) view2.findViewById(C4014R.C4016id.more_item_imageview)).setImageResource(moreMenuItem3.mo13224c());
            View view3 = this.f13762c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            View findViewById = view3.findViewById(C4014R.C4016id.more_item_badge_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.more_item_badge_text");
            if (!StringsKt__StringsJVMKt.isBlank(moreMenuItem3.mo13222a())) {
                View view4 = this.f13762c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view4, str);
                AppCompatTextView appCompatTextView = (AppCompatTextView) view4.findViewById(C4014R.C4016id.badge_text);
                Intrinsics.checkExpressionValueIsNotNull(appCompatTextView, "itemView.badge_text");
                appCompatTextView.setText(moreMenuItem3.mo13222a());
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }
}
