package hu.ekreta.ellenorzo.util.viewmodel;

import androidx.lifecycle.LiveData;
import h.m.d.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R-\u0010\u0002\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "", "uiCommand", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "getUiCommand", "()Landroidx/lifecycle/LiveData;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: UiCommand.kt */
public interface UiCommandSource {
    LiveData<Function1<d, Unit>> getUiCommand();
}
