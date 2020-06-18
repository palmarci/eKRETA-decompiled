package hu.ekreta.ellenorzo.addresseeselector.model;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.eadminapi.EmployeeDetailsDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GuardianEAdminDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\u001a\u001a\u00020\u0016*\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u000e*\u00020\u001dH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorServiceImpl;", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorService;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchAddressableClasses", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "accessToken", "", "fetchAddressableGuardiansForClass", "Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "classId", "", "fetchAddressableSzmkRepresentative", "fetchAddressableTypeList", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "fetchAddresseeTypeList", "fetchAdministratorsAddresseeList", "Lhu/ekreta/ellenorzo/addresseeselector/model/EmployeeDetails;", "fetchClassMastersAddresseeList", "fetchDirectorsAddresseeList", "fetchTeacherAddresseeList", "toEmployeeDetails", "Lhu/ekreta/ellenorzo/rest/eadminapi/EmployeeDetailsDto;", "toGuardianEAdmin", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GuardianEAdminDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorServiceImpl.kt */
public final class AddresseeSelectorServiceImpl implements AddresseeSelectorService {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f4971a;

    public AddresseeSelectorServiceImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f4971a = eAdminApi;
    }

    public n<List<EmployeeDetails>> a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getDirectors(str).g(new AddresseeSelectorServiceImpl$fetchDirectorsAddresseeList$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getDirectors(a…Details() }\n            }");
        return g2;
    }

    public n<List<EmployeeDetails>> b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAdministrators(str).g(new AddresseeSelectorServiceImpl$fetchAdministratorsAddresseeList$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAdministrat…Details() }\n            }");
        return g2;
    }

    public n<List<KretaClass>> c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAddressableClasses(str, "GONDVISELOK").g(AddresseeSelectorServiceImpl$fetchAddressableClasses$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAddressable…          }\n            }");
        return g2;
    }

    public n<List<AddresseeType>> d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAddresseeType(str).g(AddresseeSelectorServiceImpl$fetchAddresseeTypeList$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAddresseeTy…          }\n            }");
        return g2;
    }

    public n<List<EmployeeDetails>> e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getClassMasters(str).g(new AddresseeSelectorServiceImpl$fetchClassMastersAddresseeList$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getClassMaster…Details() }\n            }");
        return g2;
    }

    public n<List<GuardianEAdmin>> f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAddressableSzmkRepesentative(str).g(new AddresseeSelectorServiceImpl$fetchAddressableSzmkRepresentative$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAddressable…nEAdmin() }\n            }");
        return g2;
    }

    public n<List<AddresseeType>> g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAddressableType(str).g(AddresseeSelectorServiceImpl$fetchAddressableTypeList$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAddressable…          }\n            }");
        return g2;
    }

    public n<List<EmployeeDetails>> h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getTeachers(str).g(new AddresseeSelectorServiceImpl$fetchTeacherAddresseeList$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getTeachers(ac…Details() }\n            }");
        return g2;
    }

    public n<List<GuardianEAdmin>> a(String str, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "accessToken");
        n<R> g2 = this.f4971a.getAddressableGuardiansForClass(str, j2).g(new AddresseeSelectorServiceImpl$fetchAddressableGuardiansForClass$1(this));
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getAddressable…nEAdmin() }\n            }");
        return g2;
    }

    public final GuardianEAdmin a(GuardianEAdminDto guardianEAdminDto) {
        return new GuardianEAdmin(guardianEAdminDto.getKretaId(), guardianEAdminDto.getGuardianName(), guardianEAdminDto.getStudentName(), guardianEAdminDto.getStudentClass(), guardianEAdminDto.getRelationType());
    }

    public final EmployeeDetails a(EmployeeDetailsDto employeeDetailsDto) {
        return new EmployeeDetails(employeeDetailsDto.getKretaId(), employeeDetailsDto.isClassMaster(), employeeDetailsDto.isDeputyClassMaster(), employeeDetailsDto.getEducationClass(), employeeDetailsDto.getName(), employeeDetailsDto.getTitle());
    }
}
