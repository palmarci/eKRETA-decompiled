package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityMainBinding */
public abstract class ActivityMainBinding extends ViewDataBinding {

    /* renamed from: A */
    public MainViewModel f12121A;

    /* renamed from: z */
    public final TextView f12122z;

    public ActivityMainBinding(Object obj, View view, int i, FragmentContainerView fragmentContainerView, AdvancedBottomNavigationView advancedBottomNavigationView, Toolbar toolbar, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.f12122z = textView;
    }

    /* renamed from: a */
    public abstract void mo12359a(MainViewModel mainViewModel);
}
