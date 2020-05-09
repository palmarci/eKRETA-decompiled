package p289hu.ekreta.ellenorzo.authentication;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import p000a.p026d.p027a.p028a.C0089d;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.Idp.Response;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.GroupDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.InstitutionDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.StudentDto;
import p300k.p313b.C4996f;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4674g;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4685a;
import p300k.p313b.p316c0.p318b.C4704b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "kotlin.jvm.PlatformType", "response", "Lhu/ekreta/ellenorzo/rest/Idp$Response;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.authentication.AuthenticationServiceImpl$handleIdpResponse$1 */
/* compiled from: AuthenticationServiceImpl.kt */
public final class AuthenticationServiceImpl$handleIdpResponse$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ AuthenticationServiceImpl f11228c;

    /* renamed from: e */
    public final /* synthetic */ String f11229e;

    /* renamed from: f */
    public final /* synthetic */ String f11230f;

    /* renamed from: g */
    public final /* synthetic */ String f11231g;

    /* renamed from: h */
    public final /* synthetic */ String f11232h;

    public AuthenticationServiceImpl$handleIdpResponse$1(AuthenticationServiceImpl authenticationServiceImpl, String str, String str2, String str3, String str4) {
        this.f11228c = authenticationServiceImpl;
        this.f11229e = str;
        this.f11230f = str2;
        this.f11231g = str3;
        this.f11232h = str4;
    }

    /* renamed from: a */
    public final C5027n<AuthenticationState> apply(final Response response) {
        Intrinsics.checkParameterIsNotNull(response, "response");
        C5027n student = this.f11228c.f11215h.getStudent(this.f11229e, response.getAccessToken());
        C5027n groups = this.f11228c.f11215h.getGroups(this.f11229e, response.getAccessToken());
        C5027n institutes = this.f11228c.f11215h.getInstitutes(this.f11229e, response.getAccessToken());
        C40531 r3 = C40531.INSTANCE;
        C4704b.m16116a(student, "source1 is null");
        C4704b.m16116a(groups, "source2 is null");
        C4704b.m16116a(institutes, "source3 is null");
        return C5027n.m16889a(C4685a.m16111a((C4674g<T1, T2, T3, R>) r3), false, C4996f.f17148c, (C5030q<? extends T>[]) new C5030q[]{student, groups, institutes}).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ AuthenticationServiceImpl$handleIdpResponse$1 f11233c;

            {
                this.f11233c = r1;
            }

            /* renamed from: a */
            public final C5027n<AuthenticationState> apply(Triple<StudentDto, ? extends List<GroupDto>, InstitutionDto> triple) {
                Intrinsics.checkParameterIsNotNull(triple, "<name for destructuring parameter 0>");
                StudentDto studentDto = (StudentDto) triple.component1();
                List list = (List) triple.component2();
                InstitutionDto institutionDto = (InstitutionDto) triple.component3();
                C0089d dVar = new C0089d(response.getAccessToken());
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$1 = this.f11233c;
                String str = authenticationServiceImpl$handleIdpResponse$1.f11230f;
                String access$getString = authenticationServiceImpl$handleIdpResponse$1.f11228c.mo11520b(dVar, "name");
                String str2 = "";
                String str3 = access$getString != null ? access$getString : str2;
                String accessToken = response.getAccessToken();
                String tokenType = response.getTokenType();
                int expiresIn = response.getExpiresIn();
                String refreshToken = response.getRefreshToken();
                String name = studentDto.getName();
                SupportedRole a = SupportedRole.Companion.mo11569a(this.f11233c.f11228c.mo11518a(dVar, "role"));
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$12 = this.f11233c;
                String str4 = authenticationServiceImpl$handleIdpResponse$12.f11231g;
                String str5 = str2;
                String access$getString2 = authenticationServiceImpl$handleIdpResponse$12.f11228c.mo11520b(dVar, "kreta:institute_code");
                String str6 = access$getString2 != null ? access$getString2 : str5;
                String access$getString3 = this.f11233c.f11228c.mo11520b(dVar, "kreta:institute_user_id");
                String str7 = access$getString3 != null ? access$getString3 : str5;
                String access$getString4 = this.f11233c.f11228c.mo11520b(dVar, "kreta:student_id");
                String str8 = access$getString4 != null ? access$getString4 : str5;
                AuthenticationServiceImpl$handleIdpResponse$1 authenticationServiceImpl$handleIdpResponse$13 = this.f11233c;
                String str9 = authenticationServiceImpl$handleIdpResponse$13.f11229e;
                String access$getString5 = authenticationServiceImpl$handleIdpResponse$13.f11228c.mo11520b(dVar, "kreta:school_year_id");
                String str10 = access$getString5 != null ? access$getString5 : str5;
                String nameOfBirth = studentDto.getNameOfBirth();
                Calendar dateOfBirthUtc = studentDto.getDateOfBirthUtc();
                String placeOfBirth = studentDto.getPlaceOfBirth();
                String mothersName = studentDto.getMothersName();
                List addressDataList = studentDto.getAddressDataList();
                Calendar a2 = this.f11233c.f11228c.f11217j.mo16327a();
                String access$getString6 = this.f11233c.f11228c.mo11520b(dVar, "sub");
                String str11 = access$getString6 != null ? access$getString6 : str5;
                String str12 = str9;
                Profile profile = new Profile(str, str3, false, accessToken, tokenType, expiresIn, refreshToken, name, a, str4, str6, str7, str9, str8, str10, nameOfBirth, dateOfBirthUtc, placeOfBirth, mothersName, addressDataList, a2, str11, this.f11233c.f11232h, institutionDto.isActiveEAdministration());
                if (profile.mo14064v() != SupportedRole.NotSupportedRole) {
                    boolean z = true;
                    if (!(!this.f11233c.f11228c.f11218k.isEmpty()) || this.f11233c.f11228c.f11218k.contains(profile.mo14064v())) {
                        if (profile.mo14068y().length() != 0) {
                            z = false;
                        }
                        if (!z || profile.mo14064v() != SupportedRole.Student) {
                            return this.f11233c.f11228c.f11216i.mo14208a(profile, studentDto, list);
                        }
                        return this.f11233c.f11228c.f11216i.mo14208a(Profile.copy$default(profile, null, null, false, null, null, 0, null, null, null, null, null, null, null, profile.mo14058q(), null, null, null, null, null, null, null, null, null, false, 16769023, null), studentDto, list);
                    }
                    throw new RoleIsNotAuthenticatedException(profile.mo14064v());
                }
                throw new RoleIsNotSupportedException();
            }
        });
    }
}
