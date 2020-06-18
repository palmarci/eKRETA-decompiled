package hu.ekreta.ellenorzo.omission;

import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.OmissionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "it", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/OmissionDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionRepositoryImpl.kt */
public final class OmissionRepositoryImpl$fetchOmissions$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public OmissionRepositoryImpl$fetchOmissions$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<Omission> apply(List<OmissionDto> list) {
        List<OmissionDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OmissionDto omissionDto = (OmissionDto) it.next();
            Iterator<T> it2 = it;
            Omission omission = r3;
            Omission omission2 = new Omission(omissionDto.getUid(), this.c.m(), Omission.Type.Companion.a(omissionDto.getTypeName()), omissionDto.getTypeDescription(), omissionDto.getSubjectName(), omissionDto.getSubjectCategoryDescription(), omissionDto.getSubjectCategoryName(), Omission.LessonType.Companion.a(omissionDto.getModeName()), omissionDto.getModeDescription(), omissionDto.getDelayTimeMinutes(), omissionDto.getTeacher(), omissionDto.getLessonStartTime(), omissionDto.getLessonEndTime(), omissionDto.getClassScheduleNumber(), omissionDto.getCreatingTime(), Omission.JustificationState.Companion.a(omissionDto.getJustificationState()), omissionDto.getJustificationTypeDescription(), omissionDto.getJustificationTypeName(), omissionDto.getDate(), omissionDto.getGroupUid(), (Boolean) null, 1048576, (DefaultConstructorMarker) null);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(omission);
            arrayList = arrayList2;
            it = it2;
        }
        return arrayList;
    }
}
