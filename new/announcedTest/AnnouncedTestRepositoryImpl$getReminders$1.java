package hu.ekreta.ellenorzo.announcedTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl$getReminders$1<T, R> implements h<T, R> {
    public final /* synthetic */ AnnouncedTestRepositoryImpl c;

    public AnnouncedTestRepositoryImpl$getReminders$1(AnnouncedTestRepositoryImpl announcedTestRepositoryImpl) {
        this.c = announcedTestRepositoryImpl;
    }

    /* renamed from: a */
    public final List<AnnouncedTest> apply(List<AnnouncedTest> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            Date time = ((AnnouncedTest) next).m().getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "this");
            boolean z = true;
            time.setDate(time.getDate() + 1);
            if (time.compareTo(this.c.b().a().getTime()) <= 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
