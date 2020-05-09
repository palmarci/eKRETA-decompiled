package p289hu.ekreta.ellenorzo.group;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/group/Group;", "it", "Lhu/ekreta/ellenorzo/group/GroupRealm;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupDaoImpl$getGroup$2 */
/* compiled from: GroupDaoImpl.kt */
public final class GroupDaoImpl$getGroup$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ GroupDaoImpl f13307c;

    public GroupDaoImpl$getGroup$2(GroupDaoImpl groupDaoImpl) {
        this.f13307c = groupDaoImpl;
    }

    /* renamed from: a */
    public final List<Group> apply(List<? extends GroupRealm> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GroupRealm a : list) {
            arrayList.add(this.f13307c.realmModelToModel(a));
        }
        return arrayList;
    }
}
