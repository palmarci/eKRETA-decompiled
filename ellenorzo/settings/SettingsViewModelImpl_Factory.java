package p289hu.ekreta.ellenorzo.settings;

import android.content.Context;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.settings.SettingsViewModelImpl_Factory */
public final class SettingsViewModelImpl_Factory implements C4463c<SettingsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14789a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14790b;

    /* renamed from: c */
    public final C5431a<String> f14791c;

    /* renamed from: d */
    public final C5431a<Context> f14792d;

    public SettingsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<String> aVar3, C5431a<Context> aVar4) {
        this.f14789a = aVar;
        this.f14790b = aVar2;
        this.f14791c = aVar3;
        this.f14792d = aVar4;
    }

    public SettingsViewModelImpl get() {
        return new SettingsViewModelImpl((ObservableImpl) this.f14789a.get(), (ExecuteOnceUiCommandSource) this.f14790b.get(), (String) this.f14791c.get(), (Context) this.f14792d.get());
    }
}
