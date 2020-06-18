package hu.ekreta.ellenorzo.util.dao;

import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "", "getAllElements", "Lio/reactivex/Observable;", "", "getElementsForProfile", "profileId", "", "setElementsForProfile", "elements", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDao.kt */
public interface ProfileSpecificDao<TModel extends ProfileSpecificModel> {
    n<List<TModel>> a();

    n<List<TModel>> a(String str);

    n<List<TModel>> a(String str, List<? extends TModel> list);
}
