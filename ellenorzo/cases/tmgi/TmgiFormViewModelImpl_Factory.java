package p289hu.ekreta.ellenorzo.cases.tmgi;

import android.content.ContentResolver;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl_Factory */
public final class TmgiFormViewModelImpl_Factory implements C4463c<TmgiFormViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f11773a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f11774b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f11775c;

    /* renamed from: d */
    public final C5431a<CaseTypeRepository> f11776d;

    /* renamed from: e */
    public final C5431a<TmgiCaseTypeRepository> f11777e;

    /* renamed from: f */
    public final C5431a<ChildrenRepository> f11778f;

    /* renamed from: g */
    public final C5431a<ProfileRepository> f11779g;

    /* renamed from: h */
    public final C5431a<TmgiRepository> f11780h;

    /* renamed from: i */
    public final C5431a<AttachmentRepository> f11781i;

    /* renamed from: j */
    public final C5431a<AttachmentService> f11782j;

    /* renamed from: k */
    public final C5431a<ContentResolver> f11783k;

    /* renamed from: l */
    public final C5431a<DateTimeFactory> f11784l;

    public TmgiFormViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<CaseTypeRepository> aVar4, C5431a<TmgiCaseTypeRepository> aVar5, C5431a<ChildrenRepository> aVar6, C5431a<ProfileRepository> aVar7, C5431a<TmgiRepository> aVar8, C5431a<AttachmentRepository> aVar9, C5431a<AttachmentService> aVar10, C5431a<ContentResolver> aVar11, C5431a<DateTimeFactory> aVar12) {
        this.f11773a = aVar;
        this.f11774b = aVar2;
        this.f11775c = aVar3;
        this.f11776d = aVar4;
        this.f11777e = aVar5;
        this.f11778f = aVar6;
        this.f11779g = aVar7;
        this.f11780h = aVar8;
        this.f11781i = aVar9;
        this.f11782j = aVar10;
        this.f11783k = aVar11;
        this.f11784l = aVar12;
    }

    public TmgiFormViewModelImpl get() {
        TmgiFormViewModelImpl tmgiFormViewModelImpl = new TmgiFormViewModelImpl((ObservableImpl) this.f11773a.get(), (ExecuteOnceUiCommandSource) this.f11774b.get(), (AuthenticationService) this.f11775c.get(), (CaseTypeRepository) this.f11776d.get(), (TmgiCaseTypeRepository) this.f11777e.get(), (ChildrenRepository) this.f11778f.get(), (ProfileRepository) this.f11779g.get(), (TmgiRepository) this.f11780h.get(), (AttachmentRepository) this.f11781i.get(), (AttachmentService) this.f11782j.get(), (ContentResolver) this.f11783k.get(), (DateTimeFactory) this.f11784l.get());
        return tmgiFormViewModelImpl;
    }
}
