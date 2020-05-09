package p289hu.ekreta.ellenorzo.configSettings;

import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModelImpl_Factory */
public final class NotSupportedAppViewModelImpl_Factory implements C4463c<NotSupportedAppViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11917a;

    /* renamed from: b */
    public final C5431a<ConfigurationProvider> f11918b;

    /* renamed from: c */
    public final C5431a<ExecuteOnceUiCommandSource> f11919c;

    public NotSupportedAppViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ConfigurationProvider> aVar2, C5431a<ExecuteOnceUiCommandSource> aVar3) {
        this.f11917a = aVar;
        this.f11918b = aVar2;
        this.f11919c = aVar3;
    }

    public NotSupportedAppViewModelImpl get() {
        return new NotSupportedAppViewModelImpl((ObservableImpl) this.f11917a.get(), (ConfigurationProvider) this.f11918b.get(), (ExecuteOnceUiCommandSource) this.f11919c.get());
    }
}
