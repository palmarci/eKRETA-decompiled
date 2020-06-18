package hu.ekreta.ellenorzo.omission.daily;

import android.content.Context;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class DailyOmissionsViewModelImpl_Factory implements c<DailyOmissionsViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5976a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Context> f5977d;

    public DailyOmissionsViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<Context> aVar4) {
        this.f5976a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5977d = aVar4;
    }

    public DailyOmissionsViewModelImpl get() {
        return new DailyOmissionsViewModelImpl(this.f5976a.get(), this.b.get(), this.c.get(), this.f5977d.get());
    }
}
