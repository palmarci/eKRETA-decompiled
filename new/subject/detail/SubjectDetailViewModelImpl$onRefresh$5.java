package hu.ekreta.ellenorzo.subject.detail;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.Subject;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl$onRefresh$5 extends Lambda implements Function1<Subject, Unit> {
    public final /* synthetic */ SubjectDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectDetailViewModelImpl$onRefresh$5(SubjectDetailViewModelImpl subjectDetailViewModelImpl) {
        super(1);
        this.c = subjectDetailViewModelImpl;
    }

    public final void a(Subject subject) {
        SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.c;
        subjectDetailViewModelImpl.a(SubjectParameters.copy$default(subjectDetailViewModelImpl.Z1(), (String) null, (Evaluation.Type) null, (Calendar) null, (String) null, (String) null, subject.f(), subject.g(), subject.n(), (String) null, (String) null, subject.l(), (String) null, 2847, (Object) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Subject) obj);
        return Unit.INSTANCE;
    }
}
