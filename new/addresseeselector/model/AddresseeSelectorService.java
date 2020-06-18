package hu.ekreta.ellenorzo.addresseeselector.model;

import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorService;", "", "fetchAddressableClasses", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "accessToken", "", "fetchAddressableGuardiansForClass", "Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "classId", "", "fetchAddressableSzmkRepresentative", "fetchAddressableTypeList", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "fetchAddresseeTypeList", "fetchAdministratorsAddresseeList", "Lhu/ekreta/ellenorzo/addresseeselector/model/EmployeeDetails;", "fetchClassMastersAddresseeList", "fetchDirectorsAddresseeList", "fetchTeacherAddresseeList", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorService.kt */
public interface AddresseeSelectorService {
    n<List<EmployeeDetails>> a(String str);

    n<List<GuardianEAdmin>> a(String str, long j2);

    n<List<EmployeeDetails>> b(String str);

    n<List<KretaClass>> c(String str);

    n<List<AddresseeType>> d(String str);

    n<List<EmployeeDetails>> e(String str);

    n<List<GuardianEAdmin>> f(String str);

    n<List<AddresseeType>> g(String str);

    n<List<EmployeeDetails>> h(String str);
}
