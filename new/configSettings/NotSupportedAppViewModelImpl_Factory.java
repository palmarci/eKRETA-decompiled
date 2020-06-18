package hu.ekreta.ellenorzo.configSettings;

import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NotSupportedAppViewModelImpl_Factory implements c<NotSupportedAppViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5303a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    public NotSupportedAppViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3) {
        this.f5303a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public NotSupportedAppViewModelImpl get() {
        return new NotSupportedAppViewModelImpl(this.f5303a.get(), this.b.get(), this.c.get());
    }
}
