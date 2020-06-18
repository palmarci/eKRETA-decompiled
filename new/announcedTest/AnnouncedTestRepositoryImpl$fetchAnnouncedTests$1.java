package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.AnnouncedTestDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "response", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/AnnouncedTestDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<AnnouncedTest> apply(List<AnnouncedTestDto> list) {
        List<AnnouncedTestDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AnnouncedTestDto announcedTestDto : list) {
            Profile profile = this.c;
            Intrinsics.checkParameterIsNotNull(announcedTestDto, "$this$toAnnouncedTest");
            Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
            arrayList.add(new AnnouncedTest(announcedTestDto.getUid(), announcedTestDto.getDate(), announcedTestDto.getClassScheduleNumber(), announcedTestDto.getSubject(), announcedTestDto.getTeacher(), announcedTestDto.getTheme(), announcedTestDto.getModeName(), announcedTestDto.getModeDescription(), announcedTestDto.getAnnouncedAtUTC(), profile.m(), (Boolean) null, announcedTestDto.getGroupUid()));
        }
        return arrayList;
    }
}
