package p289hu.ekreta.ellenorzo.util.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0004H\u00040\u0001H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "it", "kotlin.jvm.PlatformType", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl$getElementsForProfile$2 */
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$getElementsForProfile$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ ProfileSpecificDaoImpl f15393c;

    public ProfileSpecificDaoImpl$getElementsForProfile$2(ProfileSpecificDaoImpl profileSpecificDaoImpl) {
        this.f15393c = profileSpecificDaoImpl;
    }

    /* renamed from: a */
    public final List<TModel> apply(List<? extends TRealmClass> list) {
        String str = "it";
        Intrinsics.checkParameterIsNotNull(list, str);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProfileSpecificModelRealm profileSpecificModelRealm = (ProfileSpecificModelRealm) it.next();
            ProfileSpecificDaoImpl profileSpecificDaoImpl = this.f15393c;
            Intrinsics.checkExpressionValueIsNotNull(profileSpecificModelRealm, str);
            arrayList.add(profileSpecificDaoImpl.realmModelToModel(profileSpecificModelRealm));
        }
        return arrayList;
    }
}
