package hu.ekreta.ellenorzo.settings;

import android.content.Context;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class SettingsViewModelImpl_Factory implements c<SettingsViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6111a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<String> f6112d;
    public final a<Context> e;

    public SettingsViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<String> aVar4, a<Context> aVar5) {
        this.f6111a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6112d = aVar4;
        this.e = aVar5;
    }

    public SettingsViewModelImpl get() {
        return new SettingsViewModelImpl(this.f6111a.get(), this.b.get(), this.c.get(), this.f6112d.get(), this.e.get());
    }
}
