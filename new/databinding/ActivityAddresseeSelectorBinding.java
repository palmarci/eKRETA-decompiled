package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel;

public abstract class ActivityAddresseeSelectorBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final TextInputEditText B;
    public final Spinner C;
    public AddresseeSelectorViewModel D;
    public final Spinner z;

    public ActivityAddresseeSelectorBinding(Object obj, View view, int i2, Barrier barrier, Spinner spinner, View view2, FrameLayout frameLayout, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Toolbar toolbar, Spinner spinner2, AppBarLayout appBarLayout) {
        super(obj, view, i2);
        this.z = spinner;
        this.A = frameLayout;
        this.B = textInputEditText;
        this.C = spinner2;
    }

    public abstract void a(AddresseeSelectorViewModel addresseeSelectorViewModel);
}
