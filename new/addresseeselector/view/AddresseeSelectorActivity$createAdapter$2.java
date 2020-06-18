package hu.ekreta.ellenorzo.addresseeselector.view;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/addresseeselector/view/AddresseeSelectorListItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorActivity.kt */
public final class AddresseeSelectorActivity$createAdapter$2 extends Lambda implements Function2<ViewGroup, Integer, AddresseeSelectorListItemViewHolder> {
    public static final AddresseeSelectorActivity$createAdapter$2 INSTANCE = new AddresseeSelectorActivity$createAdapter$2();

    public AddresseeSelectorActivity$createAdapter$2() {
        super(2);
    }

    public final AddresseeSelectorListItemViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new AddresseeSelectorListItemViewHolder(viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
