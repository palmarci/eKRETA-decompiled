package p289hu.ekreta.ellenorzo.authentication;

import java.util.List;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileService;
import p289hu.ekreta.ellenorzo.profile.UpdateProfileStrategy;
import p289hu.ekreta.ellenorzo.rest.Idp;
import p289hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl_Factory */
public final class AuthenticationServiceImpl_Factory implements C4463c<AuthenticationServiceImpl> {

    /* renamed from: a */
    public final C5431a<Idp> f11243a;

    /* renamed from: b */
    public final C5431a<ProfileRepository> f11244b;

    /* renamed from: c */
    public final C5431a<SchoolYearCalendarRepository> f11245c;

    /* renamed from: d */
    public final C5431a<ProfileService> f11246d;

    /* renamed from: e */
    public final C5431a<UpdateProfileStrategy> f11247e;

    /* renamed from: f */
    public final C5431a<DateTimeFactory> f11248f;

    /* renamed from: g */
    public final C5431a<List<SupportedRole>> f11249g;

    /* renamed from: h */
    public final C5431a<FirebaseContainer> f11250h;

    public AuthenticationServiceImpl_Factory(C5431a<Idp> aVar, C5431a<ProfileRepository> aVar2, C5431a<SchoolYearCalendarRepository> aVar3, C5431a<ProfileService> aVar4, C5431a<UpdateProfileStrategy> aVar5, C5431a<DateTimeFactory> aVar6, C5431a<List<SupportedRole>> aVar7, C5431a<FirebaseContainer> aVar8) {
        this.f11243a = aVar;
        this.f11244b = aVar2;
        this.f11245c = aVar3;
        this.f11246d = aVar4;
        this.f11247e = aVar5;
        this.f11248f = aVar6;
        this.f11249g = aVar7;
        this.f11250h = aVar8;
    }

    public AuthenticationServiceImpl get() {
        AuthenticationServiceImpl authenticationServiceImpl = new AuthenticationServiceImpl((Idp) this.f11243a.get(), (ProfileRepository) this.f11244b.get(), (SchoolYearCalendarRepository) this.f11245c.get(), (ProfileService) this.f11246d.get(), (UpdateProfileStrategy) this.f11247e.get(), (DateTimeFactory) this.f11248f.get(), (List) this.f11249g.get(), (FirebaseContainer) this.f11250h.get());
        return authenticationServiceImpl;
    }
}
