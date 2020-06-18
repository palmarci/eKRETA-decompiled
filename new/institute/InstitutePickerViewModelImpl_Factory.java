package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class InstitutePickerViewModelImpl_Factory implements c<InstitutePickerViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5705a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<InstituteRepository> f5706d;

    public InstitutePickerViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<InstituteRepository> aVar4) {
        this.f5705a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5706d = aVar4;
    }

    public InstitutePickerViewModelImpl get() {
        return new InstitutePickerViewModelImpl(this.f5705a.get(), this.b.get(), this.c.get(), this.f5706d.get());
    }
}
