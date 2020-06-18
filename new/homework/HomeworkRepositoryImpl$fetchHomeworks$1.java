package hu.ekreta.ellenorzo.homework;

import h.w.v;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/homework/Homework;", "mobileApiHomeworks", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/HomeworkDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl$fetchHomeworks$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public HomeworkRepositoryImpl$fetchHomeworks$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<Homework> apply(List<HomeworkDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "mobileApiHomeworks");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HomeworkDto a2 : list) {
            arrayList.add(v.a(a2, this.c.m()));
        }
        return arrayList;
    }
}
