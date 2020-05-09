package p289hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl_Factory */
public final class EvaluationDetailsViewModelImpl_Factory implements C4463c<EvaluationDetailsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f13238a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f13239b;

    /* renamed from: c */
    public final C5431a<Context> f13240c;

    /* renamed from: d */
    public final C5431a<GroupRepository> f13241d;

    public EvaluationDetailsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<Context> aVar3, C5431a<GroupRepository> aVar4) {
        this.f13238a = aVar;
        this.f13239b = aVar2;
        this.f13240c = aVar3;
        this.f13241d = aVar4;
    }

    public EvaluationDetailsViewModelImpl get() {
        return new EvaluationDetailsViewModelImpl((ObservableImpl) this.f13238a.get(), (ExecuteOnceUiCommandSource) this.f13239b.get(), (Context) this.f13240c.get(), (GroupRepository) this.f13241d.get());
    }
}
