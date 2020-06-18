package hu.ekreta.ellenorzo.util.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0004H\u00040\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "it", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$getElementsForProfile$2<T, R> implements h<T, R> {
    public final /* synthetic */ ProfileSpecificDaoImpl c;

    public ProfileSpecificDaoImpl$getElementsForProfile$2(ProfileSpecificDaoImpl profileSpecificDaoImpl) {
        this.c = profileSpecificDaoImpl;
    }

    /* renamed from: a */
    public final List<TModel> apply(List<? extends TRealmClass> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ProfileSpecificModelRealm profileSpecificModelRealm = (ProfileSpecificModelRealm) it.next();
            ProfileSpecificDaoImpl profileSpecificDaoImpl = this.c;
            Intrinsics.checkExpressionValueIsNotNull(profileSpecificModelRealm, "it");
            arrayList.add(profileSpecificDaoImpl.realmModelToModel(profileSpecificModelRealm));
        }
        return arrayList;
    }
}
