package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.AnnouncedTestDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "response", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1 */
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f11103c;

    public AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1(Profile profile) {
        this.f11103c = profile;
    }

    /* renamed from: a */
    public final List<AnnouncedTest> apply(List<AnnouncedTestDto> list) {
        List<AnnouncedTestDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AnnouncedTestDto announcedTestDto : list) {
            Profile profile = this.f11103c;
            Intrinsics.checkParameterIsNotNull(announcedTestDto, "$this$toAnnouncedTest");
            Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
            AnnouncedTest announcedTest = new AnnouncedTest(announcedTestDto.getUid(), announcedTestDto.getDate(), announcedTestDto.getClassScheduleNumber(), announcedTestDto.getSubject(), announcedTestDto.getTeacher(), announcedTestDto.getTheme(), announcedTestDto.getModeName(), announcedTestDto.getModeDescription(), announcedTestDto.getAnnouncedAtUTC(), profile.mo14054m(), null, announcedTestDto.getGroupUid());
            arrayList.add(announcedTest);
        }
        return arrayList;
    }
}
