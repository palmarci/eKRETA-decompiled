package hu.ekreta.ellenorzo.subject.certificate;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$fetchData$1<T, R> implements h<T, R> {
    public final /* synthetic */ CertificateViewModelImpl c;

    public CertificateViewModelImpl$fetchData$1(CertificateViewModelImpl certificateViewModelImpl) {
        this.c = certificateViewModelImpl;
    }

    /* renamed from: a */
    public final List<CertificationListItem> apply(List<Evaluation> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return CertificateViewModelImpl.access$convertAndAddHeaders(this.c, list);
    }
}
