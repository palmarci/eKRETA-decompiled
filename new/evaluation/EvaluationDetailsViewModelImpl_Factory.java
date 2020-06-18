package hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class EvaluationDetailsViewModelImpl_Factory implements c<EvaluationDetailsViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5577a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Context> f5578d;
    public final a<GroupRepository> e;

    public EvaluationDetailsViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<Context> aVar4, a<GroupRepository> aVar5) {
        this.f5577a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5578d = aVar4;
        this.e = aVar5;
    }

    public EvaluationDetailsViewModelImpl get() {
        return new EvaluationDetailsViewModelImpl(this.f5577a.get(), this.b.get(), this.c.get(), this.f5578d.get(), this.e.get());
    }
}
