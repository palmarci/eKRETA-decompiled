package p289hu.ekreta.ellenorzo.cases.decision;

import android.content.ContentResolver;
import android.content.Context;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl_Factory */
public final class DecisionDetailViewModelImpl_Factory implements C4463c<DecisionDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11430a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11431b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11432c;

    /* renamed from: d */
    public final C5431a<Context> f11433d;

    /* renamed from: e */
    public final C5431a<ProfileRepository> f11434e;

    /* renamed from: f */
    public final C5431a<SignerRepository> f11435f;

    /* renamed from: g */
    public final C5431a<AttachmentService> f11436g;

    /* renamed from: h */
    public final C5431a<ContentResolver> f11437h;

    /* renamed from: i */
    public final C5431a<AttachmentRepository> f11438i;

    /* renamed from: j */
    public final C5431a<DecisionRepository> f11439j;

    /* renamed from: k */
    public final C5431a<CaseTypeRepository> f11440k;

    public DecisionDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<ProfileRepository> aVar5, C5431a<SignerRepository> aVar6, C5431a<AttachmentService> aVar7, C5431a<ContentResolver> aVar8, C5431a<AttachmentRepository> aVar9, C5431a<DecisionRepository> aVar10, C5431a<CaseTypeRepository> aVar11) {
        this.f11430a = aVar;
        this.f11431b = aVar2;
        this.f11432c = aVar3;
        this.f11433d = aVar4;
        this.f11434e = aVar5;
        this.f11435f = aVar6;
        this.f11436g = aVar7;
        this.f11437h = aVar8;
        this.f11438i = aVar9;
        this.f11439j = aVar10;
        this.f11440k = aVar11;
    }

    public DecisionDetailViewModelImpl get() {
        DecisionDetailViewModelImpl decisionDetailViewModelImpl = new DecisionDetailViewModelImpl((ObservableImpl) this.f11430a.get(), (ExecuteOnceUiCommandSource) this.f11431b.get(), (AuthenticationService) this.f11432c.get(), (Context) this.f11433d.get(), (ProfileRepository) this.f11434e.get(), (SignerRepository) this.f11435f.get(), (AttachmentService) this.f11436g.get(), (ContentResolver) this.f11437h.get(), (AttachmentRepository) this.f11438i.get(), (DecisionRepository) this.f11439j.get(), (CaseTypeRepository) this.f11440k.get());
        return decisionDetailViewModelImpl;
    }
}
