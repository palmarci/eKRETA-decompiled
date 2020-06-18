package hu.ekreta.ellenorzo.group;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDao;
import java.util.List;
import k.b.u;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/group/GroupDao;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "Lhu/ekreta/ellenorzo/group/Group;", "getGroup", "Lio/reactivex/Single;", "", "uid", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GroupDao.kt */
public interface GroupDao extends ProfileSpecificDao<Group> {
    u<List<Group>> b(String str);
}
