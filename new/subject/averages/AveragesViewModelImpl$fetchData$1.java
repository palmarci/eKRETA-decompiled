package hu.ekreta.ellenorzo.subject.averages;

import hu.ekreta.ellenorzo.subject.Subject;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/subject/averages/AveragesListItem;", "it", "Lhu/ekreta/ellenorzo/subject/Subject;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AveragesViewModelImpl.kt */
public final class AveragesViewModelImpl$fetchData$1<T, R> implements h<T, R> {
    public final /* synthetic */ AveragesViewModelImpl c;

    public AveragesViewModelImpl$fetchData$1(AveragesViewModelImpl averagesViewModelImpl) {
        this.c = averagesViewModelImpl;
    }

    /* renamed from: a */
    public final List<AveragesListItem> apply(List<Subject> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.c.b(list);
    }
}
