package p289hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDao;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "deleteElement", "Lio/reactivex/Observable;", "element", "(Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;)Lio/reactivex/Observable;", "updateElement", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ReadableByUserDao */
/* compiled from: ReadableByUserDao.kt */
public interface ReadableByUserDao<TModel extends ReadableByUserModel> extends ProfileSpecificDao<TModel> {
    /* renamed from: a */
    C5027n<TModel> mo16319a(TModel tmodel);

    /* renamed from: b */
    C5027n<TModel> mo16320b(TModel tmodel);
}
