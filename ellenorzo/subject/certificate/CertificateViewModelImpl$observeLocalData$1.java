package p289hu.ekreta.ellenorzo.subject.certificate;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "it", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificateViewModelImpl$observeLocalData$1 */
/* compiled from: CertificateViewModelImpl.kt */
public final class CertificateViewModelImpl$observeLocalData$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ CertificateViewModelImpl f14936c;

    public CertificateViewModelImpl$observeLocalData$1(CertificateViewModelImpl certificateViewModelImpl) {
        this.f14936c = certificateViewModelImpl;
    }

    /* renamed from: a */
    public final List<CertificationListItem> apply(List<Evaluation> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return CertificateViewModelImpl.access$convertAndAddHeaders(this.f14936c, list);
    }
}
