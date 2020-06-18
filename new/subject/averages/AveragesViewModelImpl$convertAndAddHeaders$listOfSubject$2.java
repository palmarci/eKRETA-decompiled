package hu.ekreta.ellenorzo.subject.averages;

import hu.ekreta.ellenorzo.subject.Subject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/subject/Subject;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2 extends Lambda implements Function1<Subject, Integer> {
    public static final AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2 INSTANCE = new AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2();

    public AveragesViewModelImpl$convertAndAddHeaders$listOfSubject$2() {
        super(1);
    }

    public final int a(Subject subject) {
        Intrinsics.checkParameterIsNotNull(subject, "it");
        return subject.k();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(a((Subject) obj));
    }
}
