package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModel;

public abstract class ActivityNotSupportedAppBinding extends ViewDataBinding {
    public NotSupportedAppViewModel A;
    public final Button z;

    public ActivityNotSupportedAppBinding(Object obj, View view, int i2, TextView textView, Button button) {
        super(obj, view, i2);
        this.z = button;
    }
}
