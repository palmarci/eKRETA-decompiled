package hu.ekreta.ellenorzo.addresseeselector.view;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AddresseeSelectorListItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<AddresseeSelectorListItem> {
    public final /* synthetic */ AddresseeSelectorListItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorListItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, AddresseeSelectorListItemViewHolder addresseeSelectorListItemViewHolder) {
        super(obj2);
        this.c = addresseeSelectorListItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, AddresseeSelectorListItem addresseeSelectorListItem, AddresseeSelectorListItem addresseeSelectorListItem2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        AddresseeSelectorListItem addresseeSelectorListItem3 = addresseeSelectorListItem2;
        AddresseeSelectorListItem addresseeSelectorListItem4 = addresseeSelectorListItem;
        View view = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.addresseeSelectorItem_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.addresseeSelectorItem_name");
        if (addresseeSelectorListItem3 == null || (charSequence = addresseeSelectorListItem3.b()) == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
        if (addresseeSelectorListItem3 == null || (charSequence2 = addresseeSelectorListItem3.c()) == null) {
            charSequence2 = "";
        }
        View view2 = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(R.id.addresseeSelectorItem_type);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.addresseeSelectorItem_type");
        textView2.setText(charSequence2);
        View view3 = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(R.id.addresseeSelectorItem_type);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.addresseeSelectorItem_type");
        int i2 = 0;
        if (charSequence2.length() == 0) {
            i2 = 8;
        }
        textView3.setVisibility(i2);
        View view4 = this.c.c;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView4 = (TextView) view4.findViewById(R.id.addresseeSelectorItem_description);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.addresseeSelectorItem_description");
        if (addresseeSelectorListItem3 == null || (charSequence3 = addresseeSelectorListItem3.a()) == null) {
            charSequence3 = "";
        }
        textView4.setText(charSequence3);
    }
}
