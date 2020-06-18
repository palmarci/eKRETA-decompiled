package hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.content.ContentResolver;
import android.content.Context;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import hu.ekreta.ellenorzo.newmessage.model.NewMessageService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class NewMessageViewModelImpl_Factory implements c<NewMessageViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f5835a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f5836d;
    public final a<ProfileRepository> e;
    public final a<NewMessageService> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<DateTimeFactory> f5837g;

    /* renamed from: h  reason: collision with root package name */
    public final a<AttachmentRepository> f5838h;

    /* renamed from: i  reason: collision with root package name */
    public final a<AttachmentService> f5839i;

    /* renamed from: j  reason: collision with root package name */
    public final a<ContentResolver> f5840j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Context> f5841k;

    public NewMessageViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<NewMessageService> aVar6, a<DateTimeFactory> aVar7, a<AttachmentRepository> aVar8, a<AttachmentService> aVar9, a<ContentResolver> aVar10, a<Context> aVar11) {
        this.f5835a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5836d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5837g = aVar7;
        this.f5838h = aVar8;
        this.f5839i = aVar9;
        this.f5840j = aVar10;
        this.f5841k = aVar11;
    }

    public NewMessageViewModelImpl get() {
        return new NewMessageViewModelImpl(this.f5835a.get(), this.b.get(), this.c.get(), this.f5836d.get(), this.e.get(), this.f.get(), this.f5837g.get(), this.f5838h.get(), this.f5839i.get(), this.f5840j.get(), this.f5841k.get());
    }
}
