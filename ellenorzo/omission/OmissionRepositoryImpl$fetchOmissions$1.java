package p289hu.ekreta.ellenorzo.omission;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.omission.Omission.JustificationState;
import p289hu.ekreta.ellenorzo.omission.Omission.LessonType;
import p289hu.ekreta.ellenorzo.omission.Omission.Type;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.OmissionDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl$fetchOmissions$1 */
/* compiled from: OmissionRepositoryImpl.kt */
public final class OmissionRepositoryImpl$fetchOmissions$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f14421c;

    public OmissionRepositoryImpl$fetchOmissions$1(Profile profile) {
        this.f14421c = profile;
    }

    /* renamed from: a */
    public final List<Omission> apply(List<OmissionDto> list) {
        List<OmissionDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OmissionDto omissionDto = (OmissionDto) it.next();
            Iterator it2 = it;
            Omission omission = r3;
            Omission omission2 = omission;
            ArrayList arrayList2 = arrayList;
            Omission omission3 = new Omission(omissionDto.getUid(), this.f14421c.mo14054m(), Type.Companion.mo13872a(omissionDto.getTypeName()), omissionDto.getTypeDescription(), omissionDto.getSubjectName(), omissionDto.getSubjectCategoryDescription(), omissionDto.getSubjectCategoryName(), LessonType.Companion.mo13870a(omissionDto.getModeName()), omissionDto.getModeDescription(), omissionDto.getDelayTimeMinutes(), omissionDto.getTeacher(), omissionDto.getLessonStartTime(), omissionDto.getLessonEndTime(), omissionDto.getClassScheduleNumber(), omissionDto.getCreatingTime(), JustificationState.Companion.mo13868a(omissionDto.getJustificationState()), omissionDto.getJustificationTypeDescription(), omissionDto.getJustificationTypeName(), omissionDto.getDate(), omissionDto.getGroupUid(), null, 1048576, null);
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(omission2);
            arrayList = arrayList3;
            it = it2;
        }
        return arrayList;
    }
}
