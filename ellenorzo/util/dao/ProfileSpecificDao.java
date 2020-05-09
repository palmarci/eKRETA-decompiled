package p289hu.ekreta.ellenorzo.util.dao;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "", "getAllElements", "Lio/reactivex/Observable;", "", "getElementsForProfile", "profileId", "", "setElementsForProfile", "elements", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ProfileSpecificDao */
/* compiled from: ProfileSpecificDao.kt */
public interface ProfileSpecificDao<TModel extends ProfileSpecificModel> {
    /* renamed from: a */
    C5027n<List<TModel>> mo16311a();

    /* renamed from: a */
    C5027n<List<TModel>> mo16312a(String str);

    /* renamed from: a */
    C5027n<List<TModel>> mo13307a(String str, List<? extends TModel> list);
}
