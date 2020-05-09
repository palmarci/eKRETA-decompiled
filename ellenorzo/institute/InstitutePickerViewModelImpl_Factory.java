package p289hu.ekreta.ellenorzo.institute;

import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerViewModelImpl_Factory */
public final class InstitutePickerViewModelImpl_Factory implements C4463c<InstitutePickerViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13605a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13606b;

    /* renamed from: c */
    public final C5431a<InstituteRepository> f13607c;

    public InstitutePickerViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<InstituteRepository> aVar3) {
        this.f13605a = aVar;
        this.f13606b = aVar2;
        this.f13607c = aVar3;
    }

    public InstitutePickerViewModelImpl get() {
        return new InstitutePickerViewModelImpl((ObservableImpl) this.f13605a.get(), (ExecuteOnceUiCommandSource) this.f13606b.get(), (InstituteRepository) this.f13607c.get());
    }
}
