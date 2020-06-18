package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import hu.ekreta.ellenorzo.classmaster.ClassMasterViewModel;

public abstract class ActivityClassMasterBinding extends ViewDataBinding {
    public final MaterialButton A;
    public final MaterialButton B;
    public final TextView C;
    public ClassMasterViewModel D;
    public final MaterialButton z;

    public ActivityClassMasterBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, TextView textView, NestedScrollView nestedScrollView, TextView textView2, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = materialButton;
        this.A = materialButton2;
        this.B = materialButton3;
        this.C = textView;
    }

    public abstract void a(ClassMasterViewModel classMasterViewModel);
}
