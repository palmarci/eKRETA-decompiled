package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "fetchInstitutes", "Lio/reactivex/Observable;", "", "getInstituteByCode", "code", "", "search", "searchTerm", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstituteRepository.kt */
public interface InstituteRepository extends Repository<InstituteDto> {
    n<List<InstituteDto>> c();

    n<List<InstituteDto>> c(String str);

    n<List<InstituteDto>> f(String str);
}
