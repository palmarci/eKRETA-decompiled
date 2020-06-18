package hu.ekreta.ellenorzo.addresseeselector.model;

import hu.ekreta.ellenorzo.rest.mobileapi.v3.KretaClassDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "listOfTeacher", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/KretaClassDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorServiceImpl.kt */
public final class AddresseeSelectorServiceImpl$fetchAddressableClasses$1<T, R> implements h<T, R> {
    public static final AddresseeSelectorServiceImpl$fetchAddressableClasses$1 INSTANCE = new AddresseeSelectorServiceImpl$fetchAddressableClasses$1();

    /* renamed from: a */
    public final List<KretaClass> apply(List<KretaClassDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "listOfTeacher");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KretaClassDto kretaClassDto : list) {
            Long id = kretaClassDto.getId();
            long longValue = id != null ? id.longValue() : -1;
            String name = kretaClassDto.getName();
            if (name == null) {
                name = "";
            }
            arrayList.add(new KretaClass(longValue, name));
        }
        return arrayList;
    }
}
