package p289hu.ekreta.ellenorzo.timetable;

import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableViewModelImpl_Factory */
public final class TimeTableViewModelImpl_Factory implements C4463c<TimeTableViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f15203a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f15204b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f15205c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f15206d;

    /* renamed from: e */
    public final C5431a<TimeTableItemRepository> f15207e;

    public TimeTableViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<TimeTableItemRepository> aVar5) {
        this.f15203a = aVar;
        this.f15204b = aVar2;
        this.f15205c = aVar3;
        this.f15206d = aVar4;
        this.f15207e = aVar5;
    }

    public TimeTableViewModelImpl get() {
        TimeTableViewModelImpl timeTableViewModelImpl = new TimeTableViewModelImpl((ObservableImpl) this.f15203a.get(), (ExecuteOnceUiCommandSource) this.f15204b.get(), (AuthenticationService) this.f15205c.get(), (ProfileRepository) this.f15206d.get(), (TimeTableItemRepository) this.f15207e.get());
        return timeTableViewModelImpl;
    }
}
