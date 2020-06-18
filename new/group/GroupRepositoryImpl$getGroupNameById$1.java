package hu.ekreta.ellenorzo.group;

import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "groupList", "", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl$getGroupNameById$1<T, R> implements h<T, R> {
    public static final GroupRepositoryImpl$getGroupNameById$1 INSTANCE = new GroupRepositoryImpl$getGroupNameById$1();

    /* renamed from: a */
    public final String apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "groupList");
        Group group = (Group) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (group == null) {
            return null;
        }
        return group.j() + " - " + group.g();
    }
}
