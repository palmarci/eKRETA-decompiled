package hu.ekreta.ellenorzo.cases.tmgi;

import android.content.ContentResolver;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository;
import hu.ekreta.ellenorzo.cases.subModelRepositories.TmgiCaseTypeRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class TmgiFormViewModelImpl_Factory implements c<TmgiFormViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5253a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5254d;
    public final a<CaseTypeRepository> e;
    public final a<TmgiCaseTypeRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<ChildrenRepository> f5255g;

    /* renamed from: h  reason: collision with root package name */
    public final a<ProfileRepository> f5256h;

    /* renamed from: i  reason: collision with root package name */
    public final a<TmgiRepository> f5257i;

    /* renamed from: j  reason: collision with root package name */
    public final a<AttachmentRepository> f5258j;

    /* renamed from: k  reason: collision with root package name */
    public final a<AttachmentService> f5259k;

    /* renamed from: l  reason: collision with root package name */
    public final a<ContentResolver> f5260l;

    /* renamed from: m  reason: collision with root package name */
    public final a<DateTimeFactory> f5261m;

    public TmgiFormViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<CaseTypeRepository> aVar5, a<TmgiCaseTypeRepository> aVar6, a<ChildrenRepository> aVar7, a<ProfileRepository> aVar8, a<TmgiRepository> aVar9, a<AttachmentRepository> aVar10, a<AttachmentService> aVar11, a<ContentResolver> aVar12, a<DateTimeFactory> aVar13) {
        this.f5253a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5254d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5255g = aVar7;
        this.f5256h = aVar8;
        this.f5257i = aVar9;
        this.f5258j = aVar10;
        this.f5259k = aVar11;
        this.f5260l = aVar12;
        this.f5261m = aVar13;
    }

    public TmgiFormViewModelImpl get() {
        return new TmgiFormViewModelImpl(this.f5253a.get(), this.b.get(), this.c.get(), this.f5254d.get(), this.e.get(), this.f.get(), this.f5255g.get(), this.f5256h.get(), this.f5257i.get(), this.f5258j.get(), this.f5259k.get(), this.f5260l.get(), this.f5261m.get());
    }
}
