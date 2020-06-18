package hu.ekreta.ellenorzo.reminder;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import java.util.ArrayList;
import l.a.a;

public final class RemindersViewModelImpl_Factory implements c<RemindersViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6065a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6066d;
    public final a<ProfileRepository> e;
    public final a<ArrayList<ReminderRepository>> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<DateTimeFactory> f6067g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Context> f6068h;

    public RemindersViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<ArrayList<ReminderRepository>> aVar6, a<DateTimeFactory> aVar7, a<Context> aVar8) {
        this.f6065a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6066d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f6067g = aVar7;
        this.f6068h = aVar8;
    }

    public static RemindersViewModelImpl_Factory a(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<ArrayList<ReminderRepository>> aVar6, a<DateTimeFactory> aVar7, a<Context> aVar8) {
        return new RemindersViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public RemindersViewModelImpl get() {
        return new RemindersViewModelImpl(this.f6065a.get(), this.b.get(), this.c.get(), this.f6066d.get(), this.e.get(), this.f.get(), this.f6067g.get(), this.f6068h.get());
    }
}
