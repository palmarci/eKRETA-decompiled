package hu.ekreta.ellenorzo.util.binding;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import hu.ekreta.ellenorzo.util.binding.SpinnerBindings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\r"}, d2 = {"hu/ekreta/ellenorzo/util/binding/SpinnerBindings$Companion$setItemSelectedListener$1", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SpinnerBindings.kt */
public final class SpinnerBindings$Companion$setItemSelectedListener$1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ Spinner c;
    public final /* synthetic */ SpinnerBindings.SpinnerItemSelectedListener e;

    public SpinnerBindings$Companion$setItemSelectedListener$1(Spinner spinner, SpinnerBindings.SpinnerItemSelectedListener spinnerItemSelectedListener) {
        this.c = spinner;
        this.e = spinnerItemSelectedListener;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        Intrinsics.checkParameterIsNotNull(adapterView, "parent");
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!Intrinsics.areEqual(this.c.getTag(), (Object) Integer.valueOf(i2))) {
            SpinnerBindings.SpinnerItemSelectedListener spinnerItemSelectedListener = this.e;
            Object itemAtPosition = adapterView.getItemAtPosition(i2);
            Intrinsics.checkExpressionValueIsNotNull(itemAtPosition, "parent.getItemAtPosition(position)");
            spinnerItemSelectedListener.a(itemAtPosition);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Intrinsics.checkParameterIsNotNull(adapterView, "parent");
    }
}
