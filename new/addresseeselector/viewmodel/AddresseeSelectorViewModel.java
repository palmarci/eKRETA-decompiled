package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import h.l.i;
import h.l.k;
import h.p.r;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType;
import hu.ekreta.ellenorzo.addresseeselector.model.KretaClass;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0019H&J(\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H&J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H&R \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000f8gX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020!8gX¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00063"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addresseeTypes", "Landroidx/databinding/ObservableField;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "getAddresseeTypes", "()Landroidx/databinding/ObservableField;", "addresseesForSelection", "Landroidx/lifecycle/MutableLiveData;", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "getAddresseesForSelection", "()Landroidx/lifecycle/MutableLiveData;", "classSelectorIsVisible", "", "getClassSelectorIsVisible", "()Z", "setClassSelectorIsVisible", "(Z)V", "classes", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "getClasses", "listItemSelectedListener", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "", "getListItemSelectedListener", "()Lkotlin/jvm/functions/Function1;", "progressVisible", "getProgressVisible", "setProgressVisible", "searchText", "", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "onClassSelected", "newValue", "", "onItemSelected", "addressee", "onSearchTextChanged", "s", "", "start", "", "before", "count", "onTypeSelected", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModel.kt */
public interface AddresseeSelectorViewModel extends UiCommandSource, i {
    k<List<AddresseeType>> J1();

    r<List<AddresseeSelectorListItem>> L1();

    boolean X0();

    void a(CharSequence charSequence, int i2, int i3, int i4);

    void a(Object obj);

    void b(Object obj);

    boolean d();

    String h1();

    void k(String str);

    k<List<KretaClass>> x1();
}
