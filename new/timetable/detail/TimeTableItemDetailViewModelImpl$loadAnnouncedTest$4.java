package hu.ekreta.ellenorzo.timetable.detail;

import android.app.Activity;
import android.content.Intent;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4 extends Lambda implements Function1<List<? extends AnnouncedTest>, Unit> {
    public final /* synthetic */ TimeTableItemDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        super(1);
        this.c = timeTableItemDetailViewModelImpl;
    }

    public final void a(List<AnnouncedTest> list) {
        T t;
        List<String> d2;
        Intrinsics.checkExpressionValueIsNotNull(list, "it");
        Iterator<T> it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String d3 = ((AnnouncedTest) t).d();
            TimeTableItem Z1 = this.c.Z1();
            if (!(Z1 == null || (d2 = Z1.d()) == null)) {
                str = (String) CollectionsKt___CollectionsKt.first(d2);
            }
            if (Intrinsics.areEqual((Object) d3, (Object) str)) {
                break;
            }
        }
        AnnouncedTest announcedTest = (AnnouncedTest) t;
        if (announcedTest != null) {
            this.c.b((Function1<? super Activity, ? extends Intent>) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4$2$1(announcedTest));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return Unit.INSTANCE;
    }
}
