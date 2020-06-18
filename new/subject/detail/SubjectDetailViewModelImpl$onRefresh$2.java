package hu.ekreta.ellenorzo.subject.detail;

import hu.ekreta.ellenorzo.subject.Subject;
import java.util.List;
import java.util.NoSuchElementException;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/subject/Subject;", "subjectList", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewModelImpl.kt */
public final class SubjectDetailViewModelImpl$onRefresh$2<T, R> implements h<T, R> {
    public final /* synthetic */ SubjectDetailViewModelImpl c;

    public SubjectDetailViewModelImpl$onRefresh$2(SubjectDetailViewModelImpl subjectDetailViewModelImpl) {
        this.c = subjectDetailViewModelImpl;
    }

    /* renamed from: a */
    public final Subject apply(List<Subject> list) {
        Intrinsics.checkParameterIsNotNull(list, "subjectList");
        for (Subject subject : list) {
            if (Intrinsics.areEqual((Object) subject.m(), (Object) this.c.Z1().k()) && Intrinsics.areEqual((Object) subject.h(), (Object) this.c.Z1().f())) {
                return subject;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
