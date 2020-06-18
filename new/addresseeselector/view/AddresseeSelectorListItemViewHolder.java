package hu.ekreta.ellenorzo.addresseeselector.view;

import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/view/AddresseeSelectorListItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "setModel", "(Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorListItemViewHolder.kt */
public final class AddresseeSelectorListItemViewHolder extends MVVMViewHolder<AddresseeSelectorListItem> {
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AddresseeSelectorListItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;"))};
    public final ReadWriteProperty w = new AddresseeSelectorListItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddresseeSelectorListItemViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.view.LayoutInflater r0 = hu.ekreta.ellenorzo.util.ExtensionsKt.a((android.view.View) r4)
            r1 = 2131427384(0x7f0b0038, float:1.8476383E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "parent.layoutInflater.in…ctor_item, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.c
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            int r0 = hu.ekreta.ellenorzo.R.id.addresseeSelectorItem_layout
            android.view.View r4 = r4.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorListItemViewHolder$1 r0 = new hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorListItemViewHolder$1
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            kotlin.properties.Delegates r4 = kotlin.properties.Delegates.INSTANCE
            hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorListItemViewHolder$$special$$inlined$observable$1 r4 = new hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorListItemViewHolder$$special$$inlined$observable$1
            r0 = 0
            r4.<init>(r0, r0, r3)
            r3.w = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.addresseeselector.view.AddresseeSelectorListItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public void setModel(AddresseeSelectorListItem addresseeSelectorListItem) {
        this.w.setValue(this, x[0], addresseeSelectorListItem);
    }

    public AddresseeSelectorListItem getModel() {
        return (AddresseeSelectorListItem) this.w.getValue(this, x[0]);
    }
}
