package hu.ekreta.ellenorzo.omission.detail;

import android.content.Context;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class OmissionDetailViewModelImpl_Factory implements c<OmissionDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5988a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Context> f5989d;
    public final a<GroupRepository> e;

    public OmissionDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<Context> aVar4, a<GroupRepository> aVar5) {
        this.f5988a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5989d = aVar4;
        this.e = aVar5;
    }

    public OmissionDetailViewModelImpl get() {
        return new OmissionDetailViewModelImpl(this.f5988a.get(), this.b.get(), this.c.get(), this.f5989d.get(), this.e.get());
    }
}
