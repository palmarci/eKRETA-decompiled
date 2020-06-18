package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import hu.ekreta.ellenorzo.institute.InstitutePickerViewModel;

public abstract class ActivityInsitutePickerBinding extends ViewDataBinding {
    public InstitutePickerViewModel z;

    public ActivityInsitutePickerBinding(Object obj, View view, int i2, RecyclerView recyclerView, TextInputLayout textInputLayout) {
        super(obj, view, i2);
    }

    public abstract void a(InstitutePickerViewModel institutePickerViewModel);
}
