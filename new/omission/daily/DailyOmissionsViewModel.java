package hu.ekreta.ellenorzo.omission.daily;

import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "omissions", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "getOmissions", "()Ljava/util/List;", "setOmissions", "(Ljava/util/List;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DailyOmissionsViewModel.kt */
public interface DailyOmissionsViewModel extends DataBindingListViewModel<OmissionViewModel> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: DailyOmissionsViewModel.kt */
    public static final class DefaultImpls {
    }

    void a(List<Omission> list);
}
