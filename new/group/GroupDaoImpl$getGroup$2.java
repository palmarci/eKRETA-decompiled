package hu.ekreta.ellenorzo.group;

import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/group/Group;", "it", "Lhu/ekreta/ellenorzo/group/GroupRealm;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: GroupDaoImpl.kt */
public final class GroupDaoImpl$getGroup$2<T, R> implements h<T, R> {
    public final /* synthetic */ GroupDaoImpl c;

    public GroupDaoImpl$getGroup$2(GroupDaoImpl groupDaoImpl) {
        this.c = groupDaoImpl;
    }

    /* renamed from: a */
    public final List<Group> apply(List<? extends GroupRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GroupRealm a2 : list) {
            arrayList.add(this.c.realmModelToModel(a2));
        }
        return arrayList;
    }
}
