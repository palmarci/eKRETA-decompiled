package p289hu.ekreta.ellenorzo.omission;

import android.content.Context;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsViewModelImpl_Factory */
public final class DailyOmissionsViewModelImpl_Factory implements C4463c<DailyOmissionsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14320a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14321b;

    /* renamed from: c */
    public final C5431a<Context> f14322c;

    public DailyOmissionsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<Context> aVar3) {
        this.f14320a = aVar;
        this.f14321b = aVar2;
        this.f14322c = aVar3;
    }

    public DailyOmissionsViewModelImpl get() {
        return new DailyOmissionsViewModelImpl((ObservableImpl) this.f14320a.get(), (ExecuteOnceUiCommandSource) this.f14321b.get(), (Context) this.f14322c.get());
    }
}
