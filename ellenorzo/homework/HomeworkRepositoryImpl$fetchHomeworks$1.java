package p289hu.ekreta.ellenorzo.homework;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/homework/Homework;", "mobileApiHomeworks", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl$fetchHomeworks$1 */
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl$fetchHomeworks$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f13512c;

    public HomeworkRepositoryImpl$fetchHomeworks$1(Profile profile) {
        this.f13512c = profile;
    }

    /* renamed from: a */
    public final List<Homework> apply(List<HomeworkDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "mobileApiHomeworks");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HomeworkDto a : list) {
            arrayList.add(C3984v.m10157a(a, this.f13512c.mo14054m()));
        }
        return arrayList;
    }
}
