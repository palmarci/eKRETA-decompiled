package p289hu.ekreta.ellenorzo.institute;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H&R\u001e\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\n8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "institutes", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "getInstitutes", "()Landroidx/lifecycle/LiveData;", "searchTerm", "", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "hideKeyboard", "", "onSelect", "institute", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerViewModel */
/* compiled from: InstitutePickerViewModel.kt */
public interface InstitutePickerViewModel extends UiCommandSource, C3705i {
    /* renamed from: F0 */
    String mo13082F0();

    /* renamed from: a */
    void mo13083a(Institute institute);

    LiveData<List<Institute>> getInstitutes();

    /* renamed from: o */
    void mo13085o(String str);

    /* renamed from: s */
    void mo13086s();
}
