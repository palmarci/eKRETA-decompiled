package hu.ekreta.ellenorzo.noticeboard.detail;

import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NoticeBoardItemDetailViewModelImpl_Factory implements c<NoticeBoardItemDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5905a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    public NoticeBoardItemDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3) {
        this.f5905a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public NoticeBoardItemDetailViewModelImpl get() {
        return new NoticeBoardItemDetailViewModelImpl(this.f5905a.get(), this.b.get(), this.c.get());
    }
}
