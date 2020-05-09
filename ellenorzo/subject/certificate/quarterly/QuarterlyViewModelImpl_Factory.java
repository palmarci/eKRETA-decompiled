package p289hu.ekreta.ellenorzo.subject.certificate.quarterly;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModelImpl_Factory */
public final class QuarterlyViewModelImpl_Factory implements C4463c<QuarterlyViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14996a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14997b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14998c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14999d;

    /* renamed from: e */
    public final C5431a<EvaluationRepository> f15000e;

    /* renamed from: f */
    public final C5431a<Context> f15001f;

    public QuarterlyViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<EvaluationRepository> aVar5, C5431a<Context> aVar6) {
        this.f14996a = aVar;
        this.f14997b = aVar2;
        this.f14998c = aVar3;
        this.f14999d = aVar4;
        this.f15000e = aVar5;
        this.f15001f = aVar6;
    }

    public QuarterlyViewModelImpl get() {
        QuarterlyViewModelImpl quarterlyViewModelImpl = new QuarterlyViewModelImpl((ObservableImpl) this.f14996a.get(), (ExecuteOnceUiCommandSource) this.f14997b.get(), (AuthenticationService) this.f14998c.get(), (ProfileRepository) this.f14999d.get(), (EvaluationRepository) this.f15000e.get(), (Context) this.f15001f.get());
        return quarterlyViewModelImpl;
    }
}
