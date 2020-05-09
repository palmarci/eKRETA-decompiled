package p289hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import java.util.ArrayList;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl_Factory */
public final class RemindersViewModelImpl_Factory implements C4463c<RemindersViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f14674a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f14675b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f14676c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f14677d;

    /* renamed from: e */
    public final C5431a<ArrayList<ReminderRepository>> f14678e;

    /* renamed from: f */
    public final C5431a<Context> f14679f;

    public RemindersViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<ArrayList<ReminderRepository>> aVar5, C5431a<Context> aVar6) {
        this.f14674a = aVar;
        this.f14675b = aVar2;
        this.f14676c = aVar3;
        this.f14677d = aVar4;
        this.f14678e = aVar5;
        this.f14679f = aVar6;
    }

    /* renamed from: a */
    public static RemindersViewModelImpl_Factory m14005a(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<ArrayList<ReminderRepository>> aVar5, C5431a<Context> aVar6) {
        RemindersViewModelImpl_Factory remindersViewModelImpl_Factory = new RemindersViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
        return remindersViewModelImpl_Factory;
    }

    public RemindersViewModelImpl get() {
        RemindersViewModelImpl remindersViewModelImpl = new RemindersViewModelImpl((ObservableImpl) this.f14674a.get(), (ExecuteOnceUiCommandSource) this.f14675b.get(), (AuthenticationService) this.f14676c.get(), (ProfileRepository) this.f14677d.get(), (ArrayList) this.f14678e.get(), (Context) this.f14679f.get());
        return remindersViewModelImpl;
    }
}
