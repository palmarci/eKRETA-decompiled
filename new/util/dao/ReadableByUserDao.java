package hu.ekreta.ellenorzo.util.dao;

import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDao;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "deleteElement", "Lio/reactivex/Observable;", "element", "(Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;)Lio/reactivex/Observable;", "updateElement", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReadableByUserDao.kt */
public interface ReadableByUserDao<TModel extends ReadableByUserModel> extends ProfileSpecificDao<TModel> {
    n<TModel> a(TModel tmodel);

    n<TModel> b(TModel tmodel);
}
