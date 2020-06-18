package hu.ekreta.ellenorzo.group;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileService;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import k.b.u;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/group/GroupRepositoryImpl;", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "groupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "profileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "(Lhu/ekreta/ellenorzo/group/GroupDao;Lhu/ekreta/ellenorzo/profile/ProfileService;)V", "fetchGroupsByProfile", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/group/Group;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getGroupNameById", "Lio/reactivex/Single;", "", "groupId", "getGroupsByProfileId", "profileId", "setGroupsForProfile", "groupList", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl implements GroupRepository {

    /* renamed from: a  reason: collision with root package name */
    public final GroupDao f5620a;
    public final ProfileService b;

    public GroupRepositoryImpl(GroupDao groupDao, ProfileService profileService) {
        Intrinsics.checkParameterIsNotNull(groupDao, "groupDao");
        Intrinsics.checkParameterIsNotNull(profileService, "profileService");
        this.f5620a = groupDao;
        this.b = profileService;
    }

    public n<List<Group>> D(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> a2 = this.b.a(profile.p(), profile.d()).g(new GroupRepositoryImpl$fetchGroupsByProfile$1(profile)).c(new GroupRepositoryImpl$fetchGroupsByProfile$2(this, profile)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileService.fetchGrou…dSchedulers.mainThread())");
        return a2;
    }

    public n<List<Group>> b(String str, List<Group> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "groupList");
        return this.f5620a.a(str, list);
    }

    public n<List<Group>> g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f5620a.a(str);
    }

    public u<String> b(String str) {
        if (!(str == null || str.length() == 0)) {
            u<R> e = this.f5620a.b(str).e(GroupRepositoryImpl$getGroupNameById$1.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(e, "groupDao.getGroup(groupI…          }\n            }");
            return e;
        }
        u<String> b2 = u.b("");
        Intrinsics.checkExpressionValueIsNotNull(b2, "Single.just(\"\")");
        return b2;
    }
}
