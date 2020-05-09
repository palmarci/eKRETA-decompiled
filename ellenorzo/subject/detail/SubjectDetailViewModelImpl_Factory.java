package p289hu.ekreta.ellenorzo.subject.detail;

import android.content.Context;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.evaluation.EvaluationRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import p289hu.ekreta.ellenorzo.subject.SubjectsRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModelImpl_Factory */
public final class SubjectDetailViewModelImpl_Factory implements C4463c<SubjectDetailViewModelImpl> {

    /* renamed from: a */
    public final C5431a<ObservableImpl> f15064a;

    /* renamed from: b */
    public final C5431a<ExecuteOnceUiCommandSource> f15065b;

    /* renamed from: c */
    public final C5431a<AuthenticationService> f15066c;

    /* renamed from: d */
    public final C5431a<ProfileRepository> f15067d;

    /* renamed from: e */
    public final C5431a<Context> f15068e;

    /* renamed from: f */
    public final C5431a<SubjectsRepository> f15069f;

    /* renamed from: g */
    public final C5431a<DateTimeFactory> f15070g;

    /* renamed from: h */
    public final C5431a<EvaluationRepository> f15071h;

    /* renamed from: i */
    public final C5431a<SchoolYearCalendarRepository> f15072i;

    public SubjectDetailViewModelImpl_Factory(C5431a<ObservableImpl> aVar, C5431a<ExecuteOnceUiCommandSource> aVar2, C5431a<AuthenticationService> aVar3, C5431a<ProfileRepository> aVar4, C5431a<Context> aVar5, C5431a<SubjectsRepository> aVar6, C5431a<DateTimeFactory> aVar7, C5431a<EvaluationRepository> aVar8, C5431a<SchoolYearCalendarRepository> aVar9) {
        this.f15064a = aVar;
        this.f15065b = aVar2;
        this.f15066c = aVar3;
        this.f15067d = aVar4;
        this.f15068e = aVar5;
        this.f15069f = aVar6;
        this.f15070g = aVar7;
        this.f15071h = aVar8;
        this.f15072i = aVar9;
    }

    public SubjectDetailViewModelImpl get() {
        SubjectDetailViewModelImpl subjectDetailViewModelImpl = new SubjectDetailViewModelImpl((ObservableImpl) this.f15064a.get(), (ExecuteOnceUiCommandSource) this.f15065b.get(), (AuthenticationService) this.f15066c.get(), (ProfileRepository) this.f15067d.get(), (Context) this.f15068e.get(), (SubjectsRepository) this.f15069f.get(), (DateTimeFactory) this.f15070g.get(), (EvaluationRepository) this.f15071h.get(), (SchoolYearCalendarRepository) this.f15072i.get());
        return subjectDetailViewModelImpl;
    }
}
