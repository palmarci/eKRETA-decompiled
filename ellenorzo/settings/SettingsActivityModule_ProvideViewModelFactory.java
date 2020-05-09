package p289hu.ekreta.ellenorzo.settings;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.settings.SettingsActivityModule_ProvideViewModelFactory */
public final class SettingsActivityModule_ProvideViewModelFactory implements C4463c<SettingsViewModel> {

    /* renamed from: a */
    public final SettingsActivityModule f14779a;

    /* renamed from: b */
    public final C5431a<SettingsActivity> f14780b;

    /* renamed from: c */
    public final C5431a<SettingsViewModelImpl> f14781c;

    public SettingsActivityModule_ProvideViewModelFactory(SettingsActivityModule settingsActivityModule, C5431a<SettingsActivity> aVar, C5431a<SettingsViewModelImpl> aVar2) {
        this.f14779a = settingsActivityModule;
        this.f14780b = aVar;
        this.f14781c = aVar2;
    }

    public SettingsViewModel get() {
        SettingsViewModel a = this.f14779a.mo15660a((SettingsActivity) this.f14780b.get(), this.f14781c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
