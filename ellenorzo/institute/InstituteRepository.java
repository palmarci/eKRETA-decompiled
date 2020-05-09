package p289hu.ekreta.ellenorzo.institute;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/institute/Institute;", "fetchInstitutes", "Lio/reactivex/Observable;", "", "getInstituteByCode", "code", "", "search", "searchTerm", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstituteRepository */
/* compiled from: InstituteRepository.kt */
public interface InstituteRepository extends Repository<Institute> {
    /* renamed from: c */
    C5027n<List<Institute>> mo13093c();

    /* renamed from: c */
    C5027n<List<Institute>> mo13094c(String str);

    /* renamed from: f */
    C5027n<List<Institute>> mo13095f(String str);
}
