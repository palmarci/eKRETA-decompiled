package p289hu.ekreta.ellenorzo.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/group/Group;", "listOfGroupDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupRepositoryImpl$fetchGroupsByProfile$1 */
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl$fetchGroupsByProfile$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f13324c;

    public GroupRepositoryImpl$fetchGroupsByProfile$1(Profile profile) {
        this.f13324c = profile;
    }

    /* renamed from: a */
    public final List<Group> apply(List<GroupDto> list) {
        List<GroupDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "listOfGroupDto");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupDto groupDto = (GroupDto) it.next();
            Iterator it2 = it;
            Group group = r3;
            Group group2 = new Group(this.f13324c.mo14054m(), groupDto.getUid(), groupDto.getName(), groupDto.isActive(), groupDto.getType(), groupDto.getEducationTypeName(), groupDto.getEducationTypeDescription(), groupDto.getEducationTypeUid(), groupDto.getClassMasterUid(), groupDto.getClassMasterAssistantUid(), groupDto.getCategoryName(), groupDto.getCategoryDescription(), groupDto.getSortIndex());
            arrayList.add(group);
            it = it2;
        }
        return arrayList;
    }
}
