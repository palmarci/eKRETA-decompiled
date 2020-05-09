package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.settings.SettingsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivitySettingsBinding */
public abstract class ActivitySettingsBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12234A;

    /* renamed from: B */
    public SettingsViewModel f12235B;

    /* renamed from: z */
    public final FrameLayout f12236z;

    public ActivitySettingsBinding(Object obj, View view, int i, AppBarLayout appBarLayout, FrameLayout frameLayout, TextView textView, Toolbar toolbar) {
        super(obj, view, i);
        this.f12236z = frameLayout;
        this.f12234A = textView;
    }

    /* renamed from: a */
    public abstract void mo12377a(SettingsViewModel settingsViewModel);
}
