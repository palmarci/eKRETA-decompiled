package p289hu.ekreta.ellenorzo.noticeboard.detail;

import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModelImpl_Factory */
public final class NoticeBoardItemDetailViewModelImpl_Factory implements C4463c<NoticeBoardItemDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14191a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14192b;

    public NoticeBoardItemDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2) {
        this.f14191a = aVar;
        this.f14192b = aVar2;
    }

    public NoticeBoardItemDetailViewModelImpl get() {
        return new NoticeBoardItemDetailViewModelImpl((ObservableImpl) this.f14191a.get(), (ExecuteOnceUiCommandSource) this.f14192b.get());
    }
}
