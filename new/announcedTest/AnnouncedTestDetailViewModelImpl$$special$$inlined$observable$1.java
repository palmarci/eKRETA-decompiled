package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<AnnouncedTest> {
    public final /* synthetic */ AnnouncedTestDetailViewModelImpl c;
    public final /* synthetic */ GroupRepository e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl, GroupRepository groupRepository) {
        super(obj2);
        this.c = announcedTestDetailViewModelImpl;
        this.e = groupRepository;
    }

    public void afterChange(KProperty<?> kProperty, AnnouncedTest announcedTest, AnnouncedTest announcedTest2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        AnnouncedTest announcedTest3 = announcedTest2;
        AnnouncedTest announcedTest4 = announcedTest;
        if (announcedTest3 != null) {
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(UtilsKt.d(announcedTest3.m()));
            String string = this.c.Z1().getString(R.string.lesson);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.lesson)");
            sb.append(announcedTest3.a(string));
            announcedTestDetailViewModelImpl.s(sb.toString());
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl2 = this.c;
            Calendar m2 = announcedTest3.m();
            Intrinsics.checkParameterIsNotNull(m2, "$this$dayOfWeek");
            String format = new SimpleDateFormat("EEEE", Locale.getDefault()).format(m2.getTime());
            Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatDay.format(time)");
            announcedTestDetailViewModelImpl2.t(format);
            this.c.r(String.valueOf(announcedTest3.h()));
            this.c.o(announcedTest3.n());
            this.c.x(announcedTest3.o());
            this.c.u(ExtensionsKt.b(announcedTest3.p()));
            this.c.w(announcedTest3.j());
            this.c.q(UtilsKt.d(announcedTest3.g()));
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl3 = this.c;
            announcedTestDetailViewModelImpl3.a(new AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(announcedTestDetailViewModelImpl3), this.e.b(announcedTest3.i()));
        }
    }
}
