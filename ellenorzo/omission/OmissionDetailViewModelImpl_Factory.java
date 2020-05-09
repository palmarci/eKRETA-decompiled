package p289hu.ekreta.ellenorzo.omission;

import android.content.Context;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailViewModelImpl_Factory */
public final class OmissionDetailViewModelImpl_Factory implements C4463c<OmissionDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14383a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14384b;

    /* renamed from: c */
    public final C5431a<Context> f14385c;

    /* renamed from: d */
    public final C5431a<GroupRepository> f14386d;

    public OmissionDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<Context> aVar3, C5431a<GroupRepository> aVar4) {
        this.f14383a = aVar;
        this.f14384b = aVar2;
        this.f14385c = aVar3;
        this.f14386d = aVar4;
    }

    public OmissionDetailViewModelImpl get() {
        return new OmissionDetailViewModelImpl((ObservableImpl) this.f14383a.get(), (ExecuteOnceUiCommandSource) this.f14384b.get(), (Context) this.f14385c.get(), (GroupRepository) this.f14386d.get());
    }
}
