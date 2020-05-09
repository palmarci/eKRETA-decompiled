package p289hu.ekreta.ellenorzo.timetable.detail;

import android.app.Activity;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4 extends Lambda implements Function1<List<? extends AnnouncedTest>, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15249c;

    public TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15249c = timeTableItemDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo16176a(List<AnnouncedTest> list) {
        Object obj;
        Intrinsics.checkExpressionValueIsNotNull(list, "it");
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String d = ((AnnouncedTest) obj).mo11316d();
            TimeTableItem P1 = this.f15249c.mo16156P1();
            if (P1 != null) {
                List d2 = P1.mo15999d();
                if (d2 != null) {
                    str = (String) CollectionsKt___CollectionsKt.first(d2);
                }
            }
            if (Intrinsics.areEqual((Object) d, (Object) str)) {
                break;
            }
        }
        AnnouncedTest announcedTest = (AnnouncedTest) obj;
        if (announcedTest != null) {
            this.f15249c.mo16376b((Function1<? super Activity, ? extends Intent>) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4$2$1<Object,Object>(announcedTest));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16176a((List) obj);
        return Unit.INSTANCE;
    }
}
