package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl$getReminders$1 */
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl$getReminders$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ AnnouncedTestRepositoryImpl f11106c;

    public AnnouncedTestRepositoryImpl$getReminders$1(AnnouncedTestRepositoryImpl announcedTestRepositoryImpl) {
        this.f11106c = announcedTestRepositoryImpl;
    }

    /* renamed from: a */
    public final List<AnnouncedTest> apply(List<AnnouncedTest> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Date time = ((AnnouncedTest) next).mo11328m().getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "this");
            boolean z = true;
            time.setDate(time.getDate() + 1);
            if (time.compareTo(this.f11106c.mo11407b().mo16327a().getTime()) <= 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
