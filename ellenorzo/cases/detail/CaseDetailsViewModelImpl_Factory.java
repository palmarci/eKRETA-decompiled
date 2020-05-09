package p289hu.ekreta.ellenorzo.cases.detail;

import android.content.Context;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.CaseRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModelImpl_Factory */
public final class CaseDetailsViewModelImpl_Factory implements C4463c<CaseDetailsViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11503a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11504b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11505c;

    /* renamed from: d */
    public final C5431a<Context> f11506d;

    /* renamed from: e */
    public final C5431a<ProfileRepository> f11507e;

    /* renamed from: f */
    public final C5431a<CaseRepository> f11508f;

    /* renamed from: g */
    public final C5431a<AttachmentService> f11509g;

    public CaseDetailsViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<ProfileRepository> aVar5, C5431a<CaseRepository> aVar6, C5431a<AttachmentService> aVar7) {
        this.f11503a = aVar;
        this.f11504b = aVar2;
        this.f11505c = aVar3;
        this.f11506d = aVar4;
        this.f11507e = aVar5;
        this.f11508f = aVar6;
        this.f11509g = aVar7;
    }

    public CaseDetailsViewModelImpl get() {
        CaseDetailsViewModelImpl caseDetailsViewModelImpl = new CaseDetailsViewModelImpl((ObservableImpl) this.f11503a.get(), (ExecuteOnceUiCommandSource) this.f11504b.get(), (AuthenticationService) this.f11505c.get(), (Context) this.f11506d.get(), (ProfileRepository) this.f11507e.get(), (CaseRepository) this.f11508f.get(), (AttachmentService) this.f11509g.get());
        return caseDetailsViewModelImpl;
    }
}
