package hu.ekreta.ellenorzo.util.binding;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/SpinnerBindings;", "", "()V", "Companion", "SpinnerItemSelectedListener", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SpinnerBindings.kt */
public final class SpinnerBindings {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007J\u0016\u0010\b\u001a\u00020\u0004*\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0016\u0010\u000b\u001a\u00020\u0004*\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/SpinnerBindings$Companion;", "", "()V", "setEntries", "", "Landroid/widget/Spinner;", "entries", "", "setItemSelectedListener", "listener", "Lhu/ekreta/ellenorzo/util/binding/SpinnerBindings$SpinnerItemSelectedListener;", "setNewValue", "newValue", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SpinnerBindings.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        public final void a(Spinner spinner, List<? extends Object> list) {
            Intrinsics.checkParameterIsNotNull(spinner, "$this$setEntries");
            if (list != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(spinner.getContext(), 17367048, list);
                arrayAdapter.setDropDownViewResource(17367049);
                spinner.setAdapter(arrayAdapter);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(Spinner spinner, SpinnerItemSelectedListener spinnerItemSelectedListener) {
            Intrinsics.checkParameterIsNotNull(spinner, "$this$setItemSelectedListener");
            if (spinnerItemSelectedListener == null) {
                spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
            } else {
                spinner.setOnItemSelectedListener(new SpinnerBindings$Companion$setItemSelectedListener$1(spinner, spinnerItemSelectedListener));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&¨\u0006\u0005"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/SpinnerBindings$SpinnerItemSelectedListener;", "", "onItemSelected", "", "item", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SpinnerBindings.kt */
    public interface SpinnerItemSelectedListener {
        void a(Object obj);
    }
}
