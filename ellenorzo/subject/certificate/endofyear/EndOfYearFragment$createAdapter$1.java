package p289hu.ekreta.ellenorzo.subject.certificate.endofyear;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo17463d2 = {"hu/ekreta/ellenorzo/subject/certificate/endofyear/EndOfYearFragment$createAdapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "getItemViewType", "", "position", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.endofyear.EndOfYearFragment$createAdapter$1 */
/* compiled from: EndOfYearFragment.kt */
public final class EndOfYearFragment$createAdapter$1 extends MVVMRecyclerViewAdapter<CertificationListItem, MVVMViewHolder<? super CertificationListItem>> {
    public EndOfYearFragment$createAdapter$1(EndOfYearFragment endOfYearFragment, Function2 function2) {
        super(function2);
    }

    /* renamed from: b */
    public int mo56b(int i) {
        return ((CertificationListItem) mo16300d(i)).mo15820a();
    }
}
