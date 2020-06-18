package hu.ekreta.ellenorzo.settings;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import i.b;
import l.a.a;

public final class SettingsActivity_MembersInjector implements b<SettingsActivity> {

    /* renamed from: a  reason: collision with root package name */
    public final a<DispatchingAndroidInjector<Fragment>> f6106a;
    public final a<DispatchingAndroidInjector<android.app.Fragment>> b;
    public final a<SettingsViewModel> c;

    /* renamed from: a */
    public void injectMembers(SettingsActivity settingsActivity) {
        settingsActivity.v = this.f6106a.get();
        settingsActivity.w = this.b.get();
        settingsActivity.x = this.c.get();
    }

    public static void a(SettingsActivity settingsActivity, SettingsViewModel settingsViewModel) {
        settingsActivity.x = settingsViewModel;
    }
}
