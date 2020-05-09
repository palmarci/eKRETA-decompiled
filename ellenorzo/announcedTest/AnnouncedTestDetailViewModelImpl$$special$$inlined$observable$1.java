package p289hu.ekreta.ellenorzo.announcedTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<AnnouncedTest> {

    /* renamed from: c */
    public final /* synthetic */ AnnouncedTestDetailViewModelImpl f11076c;

    /* renamed from: e */
    public final /* synthetic */ GroupRepository f11077e;

    public AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl, GroupRepository groupRepository) {
        this.f11076c = announcedTestDetailViewModelImpl;
        this.f11077e = groupRepository;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, AnnouncedTest announcedTest, AnnouncedTest announcedTest2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        AnnouncedTest announcedTest3 = announcedTest2;
        AnnouncedTest announcedTest4 = announcedTest;
        if (announcedTest3 != null) {
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl = this.f11076c;
            StringBuilder sb = new StringBuilder();
            sb.append(UtilsKt.m14841d(announcedTest3.mo11328m()));
            String string = this.f11076c.mo11353P1().getString(C4014R.string.lesson);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.lesson)");
            sb.append(announcedTest3.mo11315a(string));
            announcedTestDetailViewModelImpl.mo11357t(sb.toString());
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl2 = this.f11076c;
            Calendar m = announcedTest3.mo11328m();
            Intrinsics.checkParameterIsNotNull(m, "$this$dayOfWeek");
            String format = new SimpleDateFormat("EEEE", Locale.getDefault()).format(m.getTime());
            Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatDay.format(time)");
            announcedTestDetailViewModelImpl2.mo11358u(format);
            this.f11076c.mo11356s(String.valueOf(announcedTest3.mo11322h()));
            this.f11076c.mo11354p(announcedTest3.mo11329n());
            this.f11076c.mo11362y(announcedTest3.mo11330o());
            this.f11076c.mo11359v(ExtensionsKt.m14662b(announcedTest3.mo11331p()));
            this.f11076c.mo11361x(announcedTest3.mo11325j());
            this.f11076c.mo11355r(UtilsKt.m14841d(announcedTest3.mo11321g()));
            AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl3 = this.f11076c;
            announcedTestDetailViewModelImpl3.mo16415a((KMutableProperty0<T>) new C4019xe0a7345c<T>(announcedTestDetailViewModelImpl3), this.f11077e.mo12812b(announcedTest3.mo11324i()));
        }
    }
}
