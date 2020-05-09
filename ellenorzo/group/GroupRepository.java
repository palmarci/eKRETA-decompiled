package p289hu.ekreta.ellenorzo.group;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\nH&J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/group/GroupRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/group/Group;", "fetchGroupsByProfile", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getGroupNameById", "Lio/reactivex/Single;", "", "groupId", "getGroupsByProfileId", "profileId", "setGroupsForProfile", "groupList", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupRepository */
/* compiled from: GroupRepository.kt */
public interface GroupRepository extends Repository<Group> {
    /* renamed from: D */
    C5027n<List<Group>> mo12810D(Profile profile);

    /* renamed from: b */
    C5027n<List<Group>> mo12811b(String str, List<Group> list);

    /* renamed from: b */
    C5036u<String> mo12812b(String str);

    /* renamed from: g */
    C5027n<List<Group>> mo12813g(String str);
}
