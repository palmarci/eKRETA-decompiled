package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.content.ContentResolver;
import android.content.Context;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepository;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterRepository;
import p289hu.ekreta.ellenorzo.newmessage.model.NewMessageService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl_Factory */
public final class NewMessageViewModelImpl_Factory implements C4463c<NewMessageViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14029a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14030b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14031c;

    /* renamed from: d */
    public final C5431a<ClassMasterRepository> f14032d;

    /* renamed from: e */
    public final C5431a<ProfileRepository> f14033e;

    /* renamed from: f */
    public final C5431a<NewMessageService> f14034f;

    /* renamed from: g */
    public final C5431a<DateTimeFactory> f14035g;

    /* renamed from: h */
    public final C5431a<AttachmentRepository> f14036h;

    /* renamed from: i */
    public final C5431a<AttachmentService> f14037i;

    /* renamed from: j */
    public final C5431a<ContentResolver> f14038j;

    /* renamed from: k */
    public final C5431a<Context> f14039k;

    public NewMessageViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ClassMasterRepository> aVar4, C5431a<ProfileRepository> aVar5, C5431a<NewMessageService> aVar6, C5431a<DateTimeFactory> aVar7, C5431a<AttachmentRepository> aVar8, C5431a<AttachmentService> aVar9, C5431a<ContentResolver> aVar10, C5431a<Context> aVar11) {
        this.f14029a = aVar;
        this.f14030b = aVar2;
        this.f14031c = aVar3;
        this.f14032d = aVar4;
        this.f14033e = aVar5;
        this.f14034f = aVar6;
        this.f14035g = aVar7;
        this.f14036h = aVar8;
        this.f14037i = aVar9;
        this.f14038j = aVar10;
        this.f14039k = aVar11;
    }

    public NewMessageViewModelImpl get() {
        NewMessageViewModelImpl newMessageViewModelImpl = new NewMessageViewModelImpl((ObservableImpl) this.f14029a.get(), (ExecuteOnceUiCommandSource) this.f14030b.get(), (AuthenticationService) this.f14031c.get(), (ClassMasterRepository) this.f14032d.get(), (ProfileRepository) this.f14033e.get(), (NewMessageService) this.f14034f.get(), (DateTimeFactory) this.f14035g.get(), (AttachmentRepository) this.f14036h.get(), (AttachmentService) this.f14037i.get(), (ContentResolver) this.f14038j.get(), (Context) this.f14039k.get());
        return newMessageViewModelImpl;
    }
}
