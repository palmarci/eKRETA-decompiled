package p289hu.ekreta.ellenorzo.subject.detail;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.subject.Subject;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/subject/Subject;", "subjectList", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl$onRefresh$2 */
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl$onRefresh$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ SubjectDetailViewModelImpl f15058c;

    public SubjectDetailViewModelImpl$onRefresh$2(SubjectDetailViewModelImpl subjectDetailViewModelImpl) {
        this.f15058c = subjectDetailViewModelImpl;
    }

    /* renamed from: a */
    public final Subject apply(List<Subject> list) {
        Intrinsics.checkParameterIsNotNull(list, "subjectList");
        for (Subject subject : list) {
            if (Intrinsics.areEqual((Object) subject.mo15696m(), (Object) this.f15058c.mo15914P1().mo15950k()) && Intrinsics.areEqual((Object) subject.mo15690h(), (Object) this.f15058c.mo15914P1().mo15944f())) {
                return subject;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
