package hu.ekreta.ellenorzo.settings;

import h.w.v;
import i.d.c;
import l.a.a;

public final class SettingsActivityModule_ProvideViewModelFactory implements c<SettingsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final SettingsActivityModule f6105a;
    public final a<SettingsActivity> b;
    public final a<SettingsViewModelImpl> c;

    public SettingsActivityModule_ProvideViewModelFactory(SettingsActivityModule settingsActivityModule, a<SettingsActivity> aVar, a<SettingsViewModelImpl> aVar2) {
        this.f6105a = settingsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public SettingsViewModel get() {
        SettingsViewModel a2 = this.f6105a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
