package hu.ekreta.ellenorzo.subject.detail;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import hu.ekreta.ellenorzo.subject.SubjectsRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import i.d.c;
import l.a.a;

public final class SubjectDetailViewModelImpl_Factory implements c<SubjectDetailViewModelImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ObservableImpl> f6199a;
    public final a<ExecuteOnceUiCommandSource> b;
    public final a<SystemExit> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<AuthenticationService> f6200d;
    public final a<ProfileRepository> e;
    public final a<Context> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<SubjectsRepository> f6201g;

    /* renamed from: h  reason: collision with root package name */
    public final a<DateTimeFactory> f6202h;

    /* renamed from: i  reason: collision with root package name */
    public final a<EvaluationRepository> f6203i;

    /* renamed from: j  reason: collision with root package name */
    public final a<SchoolYearCalendarRepository> f6204j;

    public SubjectDetailViewModelImpl_Factory(a<ObservableImpl> aVar, a<ExecuteOnceUiCommandSource> aVar2, a<SystemExit> aVar3, a<AuthenticationService> aVar4, a<ProfileRepository> aVar5, a<Context> aVar6, a<SubjectsRepository> aVar7, a<DateTimeFactory> aVar8, a<EvaluationRepository> aVar9, a<SchoolYearCalendarRepository> aVar10) {
        this.f6199a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f6200d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f6201g = aVar7;
        this.f6202h = aVar8;
        this.f6203i = aVar9;
        this.f6204j = aVar10;
    }

    public SubjectDetailViewModelImpl get() {
        return new SubjectDetailViewModelImpl(this.f6199a.get(), this.b.get(), this.c.get(), this.f6200d.get(), this.e.get(), this.f.get(), this.f6201g.get(), this.f6202h.get(), this.f6203i.get(), this.f6204j.get());
    }
}
