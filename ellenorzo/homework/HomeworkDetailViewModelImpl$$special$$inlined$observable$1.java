package p289hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class HomeworkDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Homework> {

    /* renamed from: c */
    public final /* synthetic */ HomeworkDetailViewModelImpl f13474c;

    /* renamed from: e */
    public final /* synthetic */ GroupRepository f13475e;

    public HomeworkDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, HomeworkDetailViewModelImpl homeworkDetailViewModelImpl, GroupRepository groupRepository) {
        this.f13474c = homeworkDetailViewModelImpl;
        this.f13475e = groupRepository;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Homework homework, Homework homework2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Homework homework3 = homework2;
        Homework homework4 = homework;
        if (homework3 != null) {
            this.f13474c.mo12958p(homework3.mo12914m());
            HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.f13474c;
            String n = homework3.mo12915n();
            if (n == null) {
                n = "";
            }
            homeworkDetailViewModelImpl.mo12962u(n);
            this.f13474c.mo12960s(UtilsKt.m14841d(homework3.mo12908h()));
            this.f13474c.mo12959r(UtilsKt.m14841d(homework3.mo12907g()));
            this.f13474c.mo12957d(homework3.mo12916o());
            this.f13474c.f13472w.mo14191b().mo17240e((C4673f<? super T>) new C4204xc339e19<Object>(homework3, this));
            HomeworkDetailViewModelImpl homeworkDetailViewModelImpl2 = this.f13474c;
            homeworkDetailViewModelImpl2.mo16415a((KMutableProperty0<T>) new C4205xc339e1a<T>(homeworkDetailViewModelImpl2), this.f13475e.mo12812b(homework3.mo12910i()));
        }
    }
}
