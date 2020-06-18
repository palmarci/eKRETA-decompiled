package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType;
import hu.ekreta.ellenorzo.addresseeselector.model.GuardianEAdmin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$2 extends Lambda implements Function1<List<? extends GuardianEAdmin>, Unit> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;
    public final /* synthetic */ AddresseeType e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$2(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl, AddresseeType addresseeType) {
        super(1);
        this.c = addresseeSelectorViewModelImpl;
        this.e = addresseeType;
    }

    public final void a(List<GuardianEAdmin> list) {
        AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl = this.c;
        Intrinsics.checkExpressionValueIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GuardianEAdmin access$createListItemFromGuardian : list) {
            arrayList.add(this.c.a(access$createListItemFromGuardian, this.e));
        }
        addresseeSelectorViewModelImpl.b((List<AddresseeSelectorListItem>) arrayList);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return Unit.INSTANCE;
    }
}
