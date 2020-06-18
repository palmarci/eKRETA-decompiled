package hu.ekreta.ellenorzo.classmaster;

import hu.ekreta.ellenorzo.group.Group;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "fetchClassMasterByProfile", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchClassMastersByProfile", "", "groupList", "Lhu/ekreta/ellenorzo/group/Group;", "getClassMastersByProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterRepository.kt */
public interface ClassMasterRepository extends Repository<ClassMaster> {
    n<List<ClassMaster>> a(Profile profile, List<Group> list);

    n<ClassMaster> l(Profile profile);

    n<List<ClassMaster>> q(Profile profile);
}
