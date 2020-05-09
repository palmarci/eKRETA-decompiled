package p289hu.ekreta.ellenorzo.group;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "groupList", "", "Lhu/ekreta/ellenorzo/group/Group;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupRepositoryImpl$getGroupNameById$1 */
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl$getGroupNameById$1<T, R> implements C4675h<T, R> {
    public static final GroupRepositoryImpl$getGroupNameById$1 INSTANCE = new GroupRepositoryImpl$getGroupNameById$1();

    /* renamed from: a */
    public final String apply(List<Group> list) {
        Intrinsics.checkParameterIsNotNull(list, "groupList");
        Group group = (Group) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (group == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(group.mo12761j());
        sb.append(" - ");
        sb.append(group.mo12757g());
        return sb.toString();
    }
}
