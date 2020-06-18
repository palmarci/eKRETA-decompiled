package hu.ekreta.ellenorzo.cases.decision;

import android.content.ContentResolver;
import android.content.Context;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class DecisionDetailViewModelImpl_Factory implements c<DecisionDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5123a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5124d;
    public final a<Context> e;
    public final a<ProfileRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<SignerRepository> f5125g;

    /* renamed from: h  reason: collision with root package name */
    public final a<AttachmentService> f5126h;

    /* renamed from: i  reason: collision with root package name */
    public final a<ContentResolver> f5127i;

    /* renamed from: j  reason: collision with root package name */
    public final a<AttachmentRepository> f5128j;

    /* renamed from: k  reason: collision with root package name */
    public final a<DecisionRepository> f5129k;

    /* renamed from: l  reason: collision with root package name */
    public final a<CaseTypeRepository> f5130l;

    public DecisionDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<ProfileRepository> aVar6, a<SignerRepository> aVar7, a<AttachmentService> aVar8, a<ContentResolver> aVar9, a<AttachmentRepository> aVar10, a<DecisionRepository> aVar11, a<CaseTypeRepository> aVar12) {
        this.f5123a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5124d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5125g = aVar7;
        this.f5126h = aVar8;
        this.f5127i = aVar9;
        this.f5128j = aVar10;
        this.f5129k = aVar11;
        this.f5130l = aVar12;
    }

    public DecisionDetailViewModelImpl get() {
        return new DecisionDetailViewModelImpl(this.f5123a.get(), this.b.get(), this.c.get(), this.f5124d.get(), this.e.get(), this.f.get(), this.f5125g.get(), this.f5126h.get(), this.f5127i.get(), this.f5128j.get(), this.f5129k.get(), this.f5130l.get());
    }
}
