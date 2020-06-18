package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;

public abstract class ActivityMainBinding extends ViewDataBinding {
    public MainViewModel A;
    public final TextView z;

    public ActivityMainBinding(Object obj, View view, int i2, FragmentContainerView fragmentContainerView, AdvancedBottomNavigationView advancedBottomNavigationView, Toolbar toolbar, ImageView imageView, TextView textView) {
        super(obj, view, i2);
        this.z = textView;
    }

    public abstract void a(MainViewModel mainViewModel);
}
