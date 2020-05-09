package p289hu.ekreta.ellenorzo.subject.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.subject.Subject;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/subject/Subject;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl$onRefresh$5 */
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl$onRefresh$5 extends Lambda implements Function1<Subject, Unit> {

    /* renamed from: c */
    public final /* synthetic */ SubjectDetailViewModelImpl f15061c;

    public SubjectDetailViewModelImpl$onRefresh$5(SubjectDetailViewModelImpl subjectDetailViewModelImpl) {
        this.f15061c = subjectDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo15936a(Subject subject) {
        SubjectDetailViewModelImpl subjectDetailViewModelImpl = this.f15061c;
        subjectDetailViewModelImpl.mo15887a(SubjectParameters.copy$default(subjectDetailViewModelImpl.mo15914P1(), null, null, null, null, null, subject.mo15688f(), subject.mo15689g(), subject.mo15697n(), null, null, subject.mo15695l(), null, 2847, null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15936a((Subject) obj);
        return Unit.INSTANCE;
    }
}
