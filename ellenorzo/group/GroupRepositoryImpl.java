package p289hu.ekreta.ellenorzo.group;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileService;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/group/GroupRepositoryImpl;", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "groupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "profileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "(Lhu/ekreta/ellenorzo/group/GroupDao;Lhu/ekreta/ellenorzo/profile/ProfileService;)V", "fetchGroupsByProfile", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/group/Group;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getGroupNameById", "Lio/reactivex/Single;", "", "groupId", "getGroupsByProfileId", "profileId", "setGroupsForProfile", "groupList", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.group.GroupRepositoryImpl */
/* compiled from: GroupRepositoryImpl.kt */
public final class GroupRepositoryImpl implements GroupRepository {

    /* renamed from: a */
    public final GroupDao f13322a;

    /* renamed from: b */
    public final ProfileService f13323b;

    public GroupRepositoryImpl(GroupDao groupDao, ProfileService profileService) {
        Intrinsics.checkParameterIsNotNull(groupDao, "groupDao");
        Intrinsics.checkParameterIsNotNull(profileService, "profileService");
        this.f13322a = groupDao;
        this.f13323b = profileService;
    }

    /* renamed from: D */
    public C5027n<List<Group>> mo12810D(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Group>> a = this.f13323b.getGroups(profile.mo14057p(), profile.mo14042d()).mo17246g(new GroupRepositoryImpl$fetchGroupsByProfile$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new GroupRepositoryImpl$fetchGroupsByProfile$2<Object,Object>(this, profile)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileService.getGroups…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: b */
    public C5027n<List<Group>> mo12811b(String str, List<Group> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "groupList");
        return this.f13322a.mo13307a(str, list);
    }

    /* renamed from: g */
    public C5027n<List<Group>> mo12813g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f13322a.mo16312a(str);
    }

    /* renamed from: b */
    public C5036u<String> mo12812b(String str) {
        if (!(str == null || str.length() == 0)) {
            C5036u<String> e = this.f13322a.mo12766b(str).mo17269e(GroupRepositoryImpl$getGroupNameById$1.INSTANCE);
            Intrinsics.checkExpressionValueIsNotNull(e, "groupDao.getGroup(groupI…          }\n            }");
            return e;
        }
        C5036u<String> b = C5036u.m16978b("");
        Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(\"\")");
        return b;
    }
}
