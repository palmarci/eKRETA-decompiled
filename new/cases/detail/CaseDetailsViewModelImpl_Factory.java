package hu.ekreta.ellenorzo.cases.detail;

import android.content.Context;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.CaseRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class CaseDetailsViewModelImpl_Factory implements c<CaseDetailsViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5140a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5141d;
    public final a<Context> e;
    public final a<ProfileRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<CaseRepository> f5142g;

    /* renamed from: h  reason: collision with root package name */
    public final a<AttachmentService> f5143h;

    public CaseDetailsViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<ProfileRepository> aVar6, a<CaseRepository> aVar7, a<AttachmentService> aVar8) {
        this.f5140a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5141d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5142g = aVar7;
        this.f5143h = aVar8;
    }

    public CaseDetailsViewModelImpl get() {
        return new CaseDetailsViewModelImpl(this.f5140a.get(), this.b.get(), this.c.get(), this.f5141d.get(), this.e.get(), this.f.get(), this.f5142g.get(), this.f5143h.get());
    }
}
