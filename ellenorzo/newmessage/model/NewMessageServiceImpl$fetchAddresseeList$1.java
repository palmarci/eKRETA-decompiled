package p289hu.ekreta.ellenorzo.newmessage.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.rest.eadminapi.AddresseeTypeDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.EmployeeDetailsDto;
import p300k.p313b.p315b0.C4670c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lhu/ekreta/ellenorzo/rest/eadminapi/AddresseeTypeDto;", "Lhu/ekreta/ellenorzo/rest/eadminapi/EmployeeDetailsDto;", "listOfAddresseeType", "listOfTeacher", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.model.NewMessageServiceImpl$fetchAddresseeList$1 */
/* compiled from: NewMessageServiceImpl.kt */
public final class NewMessageServiceImpl$fetchAddresseeList$1<T1, T2, R> implements C4670c<List<? extends AddresseeTypeDto>, List<? extends EmployeeDetailsDto>, Pair<? extends List<? extends AddresseeTypeDto>, ? extends List<? extends EmployeeDetailsDto>>> {
    public static final NewMessageServiceImpl$fetchAddresseeList$1 INSTANCE = new NewMessageServiceImpl$fetchAddresseeList$1();

    /* renamed from: a */
    public final Pair<List<AddresseeTypeDto>, List<EmployeeDetailsDto>> apply(List<AddresseeTypeDto> list, List<EmployeeDetailsDto> list2) {
        Intrinsics.checkParameterIsNotNull(list, "listOfAddresseeType");
        Intrinsics.checkParameterIsNotNull(list2, "listOfTeacher");
        return TuplesKt.m17868to(list, list2);
    }
}
