package hu.ekreta.ellenorzo.newmessage.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class NewMessageAddresseeViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Addressee> {
    public final /* synthetic */ NewMessageAddresseeViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewMessageAddresseeViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, NewMessageAddresseeViewHolder newMessageAddresseeViewHolder) {
        super(obj2);
        this.c = newMessageAddresseeViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, Addressee addressee, Addressee addressee2) {
        String str;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Addressee addressee3 = addressee2;
        Addressee addressee4 = addressee;
        View view = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.newMessageAddressee_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.newMessageAddressee_name");
        if (addressee3 == null || (str = addressee3.d()) == null) {
            str = "";
        }
        textView.setText(str);
        if (addressee3 == null || !addressee3.m()) {
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((TextView) view2.findViewById(R.id.newMessageAddressee_name)).setOnTouchListener(this.c.D());
            return;
        }
        View view3 = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((TextView) view3.findViewById(R.id.newMessageAddressee_name)).setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
