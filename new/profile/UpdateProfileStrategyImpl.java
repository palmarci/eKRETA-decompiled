package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.notification.NotificationRepository;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategyImpl;", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "deleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;Lhu/ekreta/ellenorzo/notification/NotificationRepository;Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;)V", "updateProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "newProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "studentDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "groupDtoList", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl implements UpdateProfileStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final ProfileRepository f6031a;
    public final GroupRepository b;
    public final NotificationRepository c;

    /* renamed from: d  reason: collision with root package name */
    public final DeleteProfileStrategy f6032d;

    public UpdateProfileStrategyImpl(ProfileRepository profileRepository, GroupRepository groupRepository, NotificationRepository notificationRepository, DeleteProfileStrategy deleteProfileStrategy) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(deleteProfileStrategy, "deleteProfileStrategy");
        this.f6031a = profileRepository;
        this.b = groupRepository;
        this.c = notificationRepository;
        this.f6032d = deleteProfileStrategy;
    }

    public n<AuthenticationState> a(Profile profile, StudentDto studentDto, List<GroupDto> list) {
        Intrinsics.checkParameterIsNotNull(profile, "newProfile");
        Intrinsics.checkParameterIsNotNull(studentDto, "studentDto");
        Intrinsics.checkParameterIsNotNull(list, "groupDtoList");
        n<R> c2 = this.f6031a.a(profile.n()).d(1).g(new UpdateProfileStrategyImpl$updateProfile$1(profile)).c(new UpdateProfileStrategyImpl$updateProfile$2(this, profile)).c(new UpdateProfileStrategyImpl$updateProfile$3(this, profile)).c(new UpdateProfileStrategyImpl$updateProfile$4(this)).c(new UpdateProfileStrategyImpl$updateProfile$5(this, studentDto, list));
        Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository\n      …(profile)))\n            }");
        return c2;
    }
}
