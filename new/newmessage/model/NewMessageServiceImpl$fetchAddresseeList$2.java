package hu.ekreta.ellenorzo.newmessage.model;

import hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.EmployeeDetailsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00010\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "Lhu/ekreta/ellenorzo/rest/eadminapi/EmployeeDetailsDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageServiceImpl.kt */
public final class NewMessageServiceImpl$fetchAddresseeList$2<T, R> implements h<T, R> {
    public static final NewMessageServiceImpl$fetchAddresseeList$2 INSTANCE = new NewMessageServiceImpl$fetchAddresseeList$2();

    /* renamed from: a */
    public final List<Addressee> apply(Pair<? extends List<AddresseeTypeDto>, ? extends List<EmployeeDetailsDto>> pair) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
        List<EmployeeDetailsDto> list = (List) pair.component2();
        Iterator it = ((List) pair.component1()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((AddresseeTypeDto) obj).getCode(), (Object) "TANAR")) {
                break;
            }
        }
        AddresseeTypeDto addresseeTypeDto = (AddresseeTypeDto) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (EmployeeDetailsDto employeeDetailsDto : list) {
            Addressee addressee = r5;
            Addressee addressee2 = new Addressee((Long) null, employeeDetailsDto.getName(), employeeDetailsDto.getKretaId(), addresseeTypeDto != null ? addresseeTypeDto.getId() : null, addresseeTypeDto != null ? addresseeTypeDto.getCode() : null, addresseeTypeDto != null ? addresseeTypeDto.getShortName() : null, addresseeTypeDto != null ? addresseeTypeDto.getName() : null, addresseeTypeDto != null ? addresseeTypeDto.getDescription() : null, (String) null, false, 768, (DefaultConstructorMarker) null);
            arrayList.add(addressee);
        }
        return arrayList;
    }
}
