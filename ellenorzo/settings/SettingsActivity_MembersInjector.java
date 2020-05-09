package p289hu.ekreta.ellenorzo.settings;

import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.settings.SettingsActivity_MembersInjector */
public final class SettingsActivity_MembersInjector implements C4447b<SettingsActivity> {

    /* renamed from: a */
    public final C5431a<DispatchingAndroidInjector<Fragment>> f14782a;

    /* renamed from: b */
    public final C5431a<DispatchingAndroidInjector<android.app.Fragment>> f14783b;

    /* renamed from: c */
    public final C5431a<SettingsViewModel> f14784c;

    /* renamed from: a */
    public void injectMembers(SettingsActivity settingsActivity) {
        settingsActivity.f15496v = (DispatchingAndroidInjector) this.f14782a.get();
        settingsActivity.f15497w = (DispatchingAndroidInjector) this.f14783b.get();
        settingsActivity.f14777x = (SettingsViewModel) this.f14784c.get();
    }

    /* renamed from: a */
    public static void m14091a(SettingsActivity settingsActivity, SettingsViewModel settingsViewModel) {
        settingsActivity.f14777x = settingsViewModel;
    }
}
