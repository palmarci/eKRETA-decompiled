package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0001\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u0002 \u0005*B\u0012<\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$fetchAddressableTypeList$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;

    public AddresseeSelectorViewModelImpl$fetchAddressableTypeList$1(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl) {
        this.c = addresseeSelectorViewModelImpl;
    }

    /* renamed from: a */
    public final n<Pair<List<AddresseeType>, List<AddresseeType>>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl = this.c;
        n<List<AddresseeType>> a2 = addresseeSelectorViewModelImpl.a(addresseeSelectorViewModelImpl.x.g(profile.d()));
        AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl2 = this.c;
        return n.a(a2, addresseeSelectorViewModelImpl2.a(addresseeSelectorViewModelImpl2.x.d(profile.d())), AnonymousClass1.INSTANCE);
    }
}
