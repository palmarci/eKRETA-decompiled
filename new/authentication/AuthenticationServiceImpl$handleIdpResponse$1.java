package hu.ekreta.ellenorzo.authentication;

import a.d.a.a.d;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.idp.AuthenticationDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.GroupDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.InstitutionDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.StudentDto;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import k.b.c0.b.a;
import k.b.c0.b.b;
import k.b.f;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "response", "Lhu/ekreta/ellenorzo/rest/idp/AuthenticationDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$handleIdpResponse$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AuthenticationServiceImpl c;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f5067g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5068h;

    public AuthenticationServiceImpl$handleIdpResponse$1(AuthenticationServiceImpl authenticationServiceImpl, String str, String str2, String str3, String str4) {
        this.c = authenticationServiceImpl;
        this.e = str;
        this.f = str2;
        this.f5067g = str3;
        this.f5068h = str4;
    }

    /* renamed from: a */
    public final n<AuthenticationState> apply(final AuthenticationDto authenticationDto) {
        Intrinsics.checkParameterIsNotNull(authenticationDto, "response");
        n<StudentDto> c2 = this.c.f5061h.c(this.e, authenticationDto.getAccessToken());
        n<List<GroupDto>> a2 = this.c.f5061h.a(this.e, authenticationDto.getAccessToken());
        n<InstitutionDto> b = this.c.f5061h.b(this.e, authenticationDto.getAccessToken());
        AnonymousClass1 r3 = AnonymousClass1.INSTANCE;
        b.a(c2, "source1 is null");
        b.a(a2, "source2 is null");
        b.a(b, "source3 is null");
        return n.a(a.a(r3), false, f.c, (q<? extends T>[]) new q[]{c2, a2, b}).c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ AuthenticationServiceImpl$handleIdpResponse$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<AuthenticationState> apply(Triple<StudentDto, ? extends List<GroupDto>, InstitutionDto> triple) {
                Intrinsics.checkParameterIsNotNull(triple, "<name for destructuring parameter 0>");
                StudentDto component1 = triple.component1();
                List list = (List) triple.component2();
                InstitutionDto component3 = triple.component3();
                d dVar = new d(authenticationDto.getAccessToken());
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$1 = this.c;
                String str = authenticationServiceImpl$handleIdpResponse$1.f;
                String access$getString = authenticationServiceImpl$handleIdpResponse$1.c.b(dVar, "name");
                String str2 = access$getString != null ? access$getString : "";
                String accessToken = authenticationDto.getAccessToken();
                String tokenType = authenticationDto.getTokenType();
                int expiresIn = authenticationDto.getExpiresIn();
                String refreshToken = authenticationDto.getRefreshToken();
                String name = component1.getName();
                SupportedRole a2 = SupportedRole.Companion.a(this.c.c.a(dVar, "role"));
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$12 = this.c;
                String str3 = authenticationServiceImpl$handleIdpResponse$12.f5067g;
                String str4 = "";
                String access$getString2 = authenticationServiceImpl$handleIdpResponse$12.c.b(dVar, "kreta:institute_code");
                String str5 = access$getString2 != null ? access$getString2 : str4;
                String access$getString3 = this.c.c.b(dVar, "kreta:institute_user_id");
                String str6 = access$getString3 != null ? access$getString3 : str4;
                String access$getString4 = this.c.c.b(dVar, "kreta:student_id");
                String str7 = access$getString4 != null ? access$getString4 : str4;
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$13 = this.c;
                String str8 = authenticationServiceImpl$handleIdpResponse$13.e;
                String access$getString5 = authenticationServiceImpl$handleIdpResponse$13.c.b(dVar, "kreta:school_year_id");
                String str9 = access$getString5 != null ? access$getString5 : str4;
                String nameOfBirth = component1.getNameOfBirth();
                Calendar dateOfBirthUtc = component1.getDateOfBirthUtc();
                String placeOfBirth = component1.getPlaceOfBirth();
                String mothersName = component1.getMothersName();
                List<String> addressDataList = component1.getAddressDataList();
                Calendar a3 = this.c.c.f5063j.a();
                String access$getString6 = this.c.c.b(dVar, "sub");
                String str10 = access$getString6 != null ? access$getString6 : str4;
                String str11 = str8;
                Profile profile = new Profile(str, str2, false, accessToken, tokenType, expiresIn, refreshToken, name, a2, str3, str5, str6, str8, str7, str9, nameOfBirth, dateOfBirthUtc, placeOfBirth, mothersName, addressDataList, a3, str10, this.c.f5068h, component3.isActiveEAdministration());
                if (profile.v() != SupportedRole.NotSupportedRole) {
                    boolean z = true;
                    if (!(!this.c.c.f5064k.isEmpty()) || this.c.c.f5064k.contains(profile.v())) {
                        if (profile.y().length() != 0) {
                            z = false;
                        }
                        if (!z || profile.v() != SupportedRole.Student) {
                            return this.c.c.f5062i.a(profile, component1, list);
                        }
                        return this.c.c.f5062i.a(Profile.copy$default(profile, (String) null, (String) null, false, (String) null, (String) null, 0, (String) null, (String) null, (SupportedRole) null, (String) null, (String) null, (String) null, (String) null, profile.q(), (String) null, (String) null, (Calendar) null, (String) null, (String) null, (List) null, (Calendar) null, (String) null, (String) null, false, 16769023, (Object) null), component1, list);
                    }
                    throw new RoleIsNotAuthenticatedException(profile.v());
                }
                throw new RoleIsNotSupportedException();
            }
        });
    }
}
