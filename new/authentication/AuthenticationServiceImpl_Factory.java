package hu.ekreta.ellenorzo.authentication;

import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.profile.ProfileService;
import hu.ekreta.ellenorzo.profile.UpdateProfileStrategy;
import hu.ekreta.ellenorzo.rest.Idp;
import hu.ekreta.ellenorzo.schoolYearCalendar.SchoolYearCalendarRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import i.d.c;
import java.util.List;
import l.a.a;

public final class AuthenticationServiceImpl_Factory implements c<AuthenticationServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Idp> f5069a;
    public final a<ProfileRepository> b;
    public final a<SchoolYearCalendarRepository> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<ProfileService> f5070d;
    public final a<UpdateProfileStrategy> e;
    public final a<DateTimeFactory> f;

    /* renamed from: g  reason: collision with root package name */
    public final a<List<SupportedRole>> f5071g;

    /* renamed from: h  reason: collision with root package name */
    public final a<FirebaseContainer> f5072h;

    public AuthenticationServiceImpl_Factory(a<Idp> aVar, a<ProfileRepository> aVar2, a<SchoolYearCalendarRepository> aVar3, a<ProfileService> aVar4, a<UpdateProfileStrategy> aVar5, a<DateTimeFactory> aVar6, a<List<SupportedRole>> aVar7, a<FirebaseContainer> aVar8) {
        this.f5069a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5070d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f5071g = aVar7;
        this.f5072h = aVar8;
    }

    public AuthenticationServiceImpl get() {
        return new AuthenticationServiceImpl(this.f5069a.get(), this.b.get(), this.c.get(), this.f5070d.get(), this.e.get(), this.f.get(), this.f5071g.get(), this.f5072h.get());
    }
}
