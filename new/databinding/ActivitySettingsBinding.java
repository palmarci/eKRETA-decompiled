package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.settings.SettingsViewModel;

public abstract class ActivitySettingsBinding extends ViewDataBinding {
    public final TextView A;
    public SettingsViewModel B;
    public final FrameLayout z;

    public ActivitySettingsBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, FrameLayout frameLayout, TextView textView, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = frameLayout;
        this.A = textView;
    }

    public abstract void a(SettingsViewModel settingsViewModel);
}
