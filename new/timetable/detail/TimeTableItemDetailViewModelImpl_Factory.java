package hu.ekreta.ellenorzo.timetable.detail;

import android.content.Context;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class TimeTableItemDetailViewModelImpl_Factory implements c<TimeTableItemDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6264a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6265d;
    public final a<Context> e;
    public final a<ProfileRepository> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<HomeworkRepository> f6266g;

    /* renamed from: h  reason: collision with root package name */
    public final a<AnnouncedTestRepository> f6267h;

    /* renamed from: i  reason: collision with root package name */
    public final a<TimeTableItemRepository> f6268i;

    /* renamed from: j  reason: collision with root package name */
    public final a<a.k.a.c> f6269j;

    public TimeTableItemDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<Context> aVar5, a<ProfileRepository> aVar6, a<HomeworkRepository> aVar7, a<AnnouncedTestRepository> aVar8, a<TimeTableItemRepository> aVar9, a<a.k.a.c> aVar10) {
        this.f6264a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6265d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f6266g = aVar7;
        this.f6267h = aVar8;
        this.f6268i = aVar9;
        this.f6269j = aVar10;
    }

    public TimeTableItemDetailViewModelImpl get() {
        return new TimeTableItemDetailViewModelImpl(this.f6264a.get(), this.b.get(), this.c.get(), this.f6265d.get(), this.e.get(), this.f.get(), this.f6266g.get(), this.f6267h.get(), this.f6268i.get(), this.f6269j);
    }
}
