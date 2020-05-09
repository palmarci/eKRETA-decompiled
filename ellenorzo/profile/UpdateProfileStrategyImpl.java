package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.notification.NotificationRepository;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategyImpl;", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "notificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "deleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;Lhu/ekreta/ellenorzo/notification/NotificationRepository;Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;)V", "updateProfile", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "newProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "studentDto", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/StudentDto;", "listOfGroupDto", "", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/GroupDto;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl */
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl implements UpdateProfileStrategy {

    /* renamed from: a */
    public final ProfileRepository f14544a;

    /* renamed from: b */
    public final GroupRepository f14545b;

    /* renamed from: c */
    public final NotificationRepository f14546c;

    /* renamed from: d */
    public final DeleteProfileStrategy f14547d;

    public UpdateProfileStrategyImpl(ProfileRepository profileRepository, GroupRepository groupRepository, NotificationRepository notificationRepository, DeleteProfileStrategy deleteProfileStrategy) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        Intrinsics.checkParameterIsNotNull(notificationRepository, "notificationRepository");
        Intrinsics.checkParameterIsNotNull(deleteProfileStrategy, "deleteProfileStrategy");
        this.f14544a = profileRepository;
        this.f14545b = groupRepository;
        this.f14546c = notificationRepository;
        this.f14547d = deleteProfileStrategy;
    }

    /* renamed from: a */
    public C5027n<AuthenticationState> mo14208a(Profile profile, StudentDto studentDto, List<GroupDto> list) {
        Intrinsics.checkParameterIsNotNull(profile, "newProfile");
        Intrinsics.checkParameterIsNotNull(studentDto, "studentDto");
        Intrinsics.checkParameterIsNotNull(list, "listOfGroupDto");
        C5027n<AuthenticationState> c = this.f14544a.mo14188a(profile.mo14055n()).mo17237d(1).mo17246g(new UpdateProfileStrategyImpl$updateProfile$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new UpdateProfileStrategyImpl$updateProfile$2<Object,Object>(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new UpdateProfileStrategyImpl$updateProfile$3<Object,Object>(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new UpdateProfileStrategyImpl$updateProfile$4<Object,Object>(this)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new UpdateProfileStrategyImpl$updateProfile$5<Object,Object>(this, studentDto, list));
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository\n      …(profile)))\n            }");
        return c;
    }
}
