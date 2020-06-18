package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModel;

public abstract class ActivityRootedDeviceDetectedBinding extends ViewDataBinding {
    public RootedDeviceDetectedViewModel A;
    public final Button z;

    public ActivityRootedDeviceDetectedBinding(Object obj, View view, int i2, Button button, TextView textView, TextView textView2) {
        super(obj, view, i2);
        this.z = button;
    }
}
