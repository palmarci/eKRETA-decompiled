package hu.ekreta.ellenorzo.addresseeselector.model;

import hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "listOfAddresseeType", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorServiceImpl.kt */
public final class AddresseeSelectorServiceImpl$fetchAddresseeTypeList$1<T, R> implements h<T, R> {
    public static final AddresseeSelectorServiceImpl$fetchAddresseeTypeList$1 INSTANCE = new AddresseeSelectorServiceImpl$fetchAddresseeTypeList$1();

    /* renamed from: a */
    public final List<AddresseeType> apply(List<AddresseeTypeDto> list) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(list, "listOfAddresseeType");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AddresseeTypeDto addresseeTypeDto : list) {
            Long id = addresseeTypeDto.getId();
            long longValue = id != null ? id.longValue() : -1;
            String code = addresseeTypeDto.getCode();
            String str3 = code != null ? code : "";
            String shortName = addresseeTypeDto.getShortName();
            if (shortName != null) {
                str = shortName;
            } else {
                str = "";
            }
            String name = addresseeTypeDto.getName();
            if (name != null) {
                str2 = name;
            } else {
                str2 = "";
            }
            String description = addresseeTypeDto.getDescription();
            if (description == null) {
                description = "";
            }
            arrayList.add(new AddresseeType(longValue, str3, str, str2, description));
        }
        return arrayList;
    }
}
