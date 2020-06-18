package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;

public abstract class IncludeCaseDetailsRectificationbuttonBinding extends ViewDataBinding {
    public final Button A;
    public CaseDetailsViewModel B;
    public final Button z;

    public IncludeCaseDetailsRectificationbuttonBinding(Object obj, View view, int i2, Button button, Button button2) {
        super(obj, view, i2);
        this.z = button;
        this.A = button2;
    }

    public abstract void a(CaseDetailsViewModel caseDetailsViewModel);
}
