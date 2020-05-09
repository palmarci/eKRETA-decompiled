package p289hu.ekreta.ellenorzo.timetable.detail;

import android.content.Context;
import p000a.p173k.p174a.C2676c;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl_Factory */
public final class TimeTableItemDetailViewModelImpl_Factory implements C4463c<TimeTableItemDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f15258a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f15259b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f15260c;

    /* renamed from: d */
    public final C5431a<Context> f15261d;

    /* renamed from: e */
    public final C5431a<ProfileRepository> f15262e;

    /* renamed from: f */
    public final C5431a<HomeworkRepository> f15263f;

    /* renamed from: g */
    public final C5431a<AnnouncedTestRepository> f15264g;

    /* renamed from: h */
    public final C5431a<TimeTableItemRepository> f15265h;

    /* renamed from: i */
    public final C5431a<C2676c> f15266i;

    public TimeTableItemDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<Context> aVar4, C5431a<ProfileRepository> aVar5, C5431a<HomeworkRepository> aVar6, C5431a<AnnouncedTestRepository> aVar7, C5431a<TimeTableItemRepository> aVar8, C5431a<C2676c> aVar9) {
        this.f15258a = aVar;
        this.f15259b = aVar2;
        this.f15260c = aVar3;
        this.f15261d = aVar4;
        this.f15262e = aVar5;
        this.f15263f = aVar6;
        this.f15264g = aVar7;
        this.f15265h = aVar8;
        this.f15266i = aVar9;
    }

    public TimeTableItemDetailViewModelImpl get() {
        TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = new TimeTableItemDetailViewModelImpl((ObservableImpl) this.f15258a.get(), (ExecuteOnceUiCommandSource) this.f15259b.get(), (AuthenticationService) this.f15260c.get(), (Context) this.f15261d.get(), (ProfileRepository) this.f15262e.get(), (HomeworkRepository) this.f15263f.get(), (AnnouncedTestRepository) this.f15264g.get(), (TimeTableItemRepository) this.f15265h.get(), this.f15266i);
        return timeTableItemDetailViewModelImpl;
    }
}
