package hu.ekreta.ellenorzo.institute;

import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H&R\u001e\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "institutes", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "getInstitutes", "()Landroidx/lifecycle/LiveData;", "searchTerm", "", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "hideKeyboard", "", "onSelect", "institute", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstitutePickerViewModel.kt */
public interface InstitutePickerViewModel extends UiCommandSource, i {
    String F0();

    void a(InstituteDto instituteDto);

    LiveData<List<InstituteDto>> getInstitutes();

    void n(String str);

    void s();
}
