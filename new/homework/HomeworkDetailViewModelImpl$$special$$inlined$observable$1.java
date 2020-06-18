package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class HomeworkDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Homework> {
    public final /* synthetic */ HomeworkDetailViewModelImpl c;
    public final /* synthetic */ GroupRepository e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, HomeworkDetailViewModelImpl homeworkDetailViewModelImpl, GroupRepository groupRepository) {
        super(obj2);
        this.c = homeworkDetailViewModelImpl;
        this.e = groupRepository;
    }

    public void afterChange(KProperty<?> kProperty, Homework homework, Homework homework2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Homework homework3 = homework2;
        Homework homework4 = homework;
        if (homework3 != null) {
            this.c.o(homework3.m());
            HomeworkDetailViewModelImpl homeworkDetailViewModelImpl = this.c;
            String n2 = homework3.n();
            if (n2 == null) {
                n2 = "";
            }
            homeworkDetailViewModelImpl.u(n2);
            this.c.r(UtilsKt.d(homework3.h()));
            this.c.q(UtilsKt.d(homework3.g()));
            this.c.g(homework3.p());
            this.c.A.b().e(new HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(homework3, this));
            this.c.d(homework3.o());
            this.c.a2();
            HomeworkDetailViewModelImpl homeworkDetailViewModelImpl2 = this.c;
            homeworkDetailViewModelImpl2.a(new HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$2(homeworkDetailViewModelImpl2), this.e.b(homework3.i()));
        }
    }
}
