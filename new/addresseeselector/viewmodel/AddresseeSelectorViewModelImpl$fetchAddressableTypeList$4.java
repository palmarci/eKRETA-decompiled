package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import h.l.k;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$fetchAddressableTypeList$4 extends Lambda implements Function1<Pair<? extends List<? extends AddresseeType>, ? extends List<? extends AddresseeType>>, Unit> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorViewModelImpl$fetchAddressableTypeList$4(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl) {
        super(1);
        this.c = addresseeSelectorViewModelImpl;
    }

    public final void a(Pair<? extends List<AddresseeType>, ? extends List<AddresseeType>> pair) {
        this.c.u = (List) pair.component2();
        String string = this.c.y.getString(R.string.addresseeSelector_typeEmpty);
        Intrinsics.checkExpressionValueIsNotNull(string, "headerTitle");
        T mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new AddresseeType(-1, "EMPTY", string, "", ""));
        mutableListOf.addAll((List) pair.component1());
        k<List<AddresseeType>> J1 = this.c.J1();
        if (mutableListOf != J1.e) {
            J1.e = mutableListOf;
            J1.U1();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Pair) obj);
        return Unit.INSTANCE;
    }
}
