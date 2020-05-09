package p289hu.ekreta.ellenorzo.profile;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.authentication.LoggedIn;
import p289hu.ekreta.ellenorzo.group.Group;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GuardianDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl$updateProfile$5 */
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$5<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ UpdateProfileStrategyImpl f14556c;

    /* renamed from: e */
    public final /* synthetic */ StudentDto f14557e;

    /* renamed from: f */
    public final /* synthetic */ List f14558f;

    public UpdateProfileStrategyImpl$updateProfile$5(UpdateProfileStrategyImpl updateProfileStrategyImpl, StudentDto studentDto, List list) {
        this.f14556c = updateProfileStrategyImpl;
        this.f14557e = studentDto;
        this.f14558f = list;
    }

    /* renamed from: a */
    public final C5027n<LoggedIn> apply(Profile profile) {
        Profile profile2 = profile;
        Intrinsics.checkParameterIsNotNull(profile2, Param.PROFILE);
        ProfileRepository access$getProfileRepository$p = this.f14556c.f14544a;
        String m = profile.mo14054m();
        List<GuardianDto> guardianList = this.f14557e.getGuardianList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(guardianList, 10));
        for (GuardianDto guardianDto : guardianList) {
            Guardian guardian = new Guardian(profile.mo14054m(), guardianDto.getUid(), guardianDto.getName(), guardianDto.getEmail(), guardianDto.getPhoneNumber());
            arrayList.add(guardian);
        }
        C4667b e = access$getProfileRepository$p.mo14190a(m, (List<Guardian>) arrayList).mo17241e();
        GroupRepository access$getGroupRepository$p = this.f14556c.f14545b;
        String m2 = profile.mo14054m();
        List<GroupDto> list = this.f14558f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GroupDto groupDto : list) {
            Group group = r8;
            Group group2 = new Group(profile.mo14054m(), groupDto.getUid(), groupDto.getName(), groupDto.isActive(), groupDto.getType(), groupDto.getEducationTypeName(), groupDto.getEducationTypeDescription(), groupDto.getEducationTypeUid(), groupDto.getClassMasterUid(), groupDto.getClassMasterAssistantUid(), groupDto.getCategoryName(), groupDto.getCategoryDescription(), groupDto.getSortIndex());
            arrayList2.add(group);
        }
        return e.mo16974a((C4991d) access$getGroupRepository$p.mo12811b(m2, arrayList2).mo17241e()).mo16976a((C5030q<T>) C5027n.m16898d(new LoggedIn(profile2)));
    }
}
