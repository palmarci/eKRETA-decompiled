package p289hu.ekreta.ellenorzo.profile.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationState;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.DebugHelpersKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u000208H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010<\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0016J\b\u0010=\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0016J\u0010\u0010?\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R+\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0%0$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R+\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020(8V@VX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010/\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R+\u00103\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010\u001a\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018¨\u0006@"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;)V", "activeProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getActiveProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "<set-?>", "", "fullName", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "fullName$delegate", "Lkotlin/properties/ReadWriteProperty;", "grantType", "getGrantType", "setGrantType", "grantType$delegate", "instituteName", "getInstituteName", "setInstituteName", "instituteName$delegate", "profiles", "Landroidx/lifecycle/MutableLiveData;", "", "getProfiles", "()Landroidx/lifecycle/MutableLiveData;", "", "progressVisible", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "progressVisible$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "studentShortName", "getStudentShortName", "setStudentShortName", "studentShortName$delegate", "onActiveProfile", "", "profile", "onAddProfile", "onDeleteActiveProfile", "onDeleteProfile", "onDetailActiveProfile", "onDetailProfile", "onSelectProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl */
/* compiled from: ProfileListViewModelImpl.kt */
public final class ProfileListViewModelImpl extends DataBindingViewModel implements ProfileListViewModel {

    /* renamed from: s */
    public static final /* synthetic */ KProperty[] f14614s;

    /* renamed from: j */
    public final C3824r<List<Profile>> f14615j = new C3824r<>();

    /* renamed from: k */
    public final ReadWriteProperty f14616k;

    /* renamed from: l */
    public final ReadWriteProperty f14617l;

    /* renamed from: m */
    public final ReadWriteProperty f14618m;

    /* renamed from: n */
    public final ReadWriteProperty f14619n;

    /* renamed from: o */
    public final ReadWriteProperty f14620o;

    /* renamed from: p */
    public final ReadWriteProperty f14621p;

    /* renamed from: q */
    public final ProfileRepository f14622q;

    /* renamed from: r */
    public final Context f14623r;

    static {
        Class<ProfileListViewModelImpl> cls = ProfileListViewModelImpl.class;
        f14614s = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "fullName", "getFullName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "instituteName", "getInstituteName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "grantType", "getGrantType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentShortName", "getStudentShortName()Ljava/lang/String;"))};
    }

    public ProfileListViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14622q = profileRepository;
        this.f14623r = context;
        this.f14616k = DataBindingViewModel.boundString$default(this, this, 24, null, null, 6, null);
        this.f14617l = DataBindingViewModel.boundString$default(this, this, 105, null, null, 6, null);
        this.f14618m = DataBindingViewModel.boundString$default(this, this, 41, null, null, 6, null);
        this.f14619n = DataBindingViewModel.boundString$default(this, this, 30, null, null, 6, null);
        this.f14620o = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        this.f14621p = DataBindingViewModel.boundString$default(this, this, 68, null, null, 6, null);
        C5027n k = this.f14622q.mo14187a().mo17252k(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ ProfileListViewModelImpl f14624c;

            {
                this.f14624c = r1;
            }

            /* renamed from: a */
            public final C5027n<List<Profile>> apply(List<Profile> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                boolean z = true;
                if (!list.isEmpty()) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!(!((Profile) it.next()).mo14044e())) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        return this.f14624c.f14622q.mo14194d((Profile) CollectionsKt___CollectionsKt.first(list)).mo16976a((C5030q<T>) C5027n.m16898d(list));
                    }
                }
                return C5027n.m16898d(list);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(k, "profileRepository\n      …          }\n            }");
        mo16413a(C4998b.m16842a(k, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ProfileListViewModelImpl f14626c;

            {
                this.f14626c = r1;
            }

            /* renamed from: a */
            public final void mo14277a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.f14626c, th, null, null, 6, null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14277a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<List<? extends Profile>, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ProfileListViewModelImpl f14625c;

            {
                this.f14625c = r1;
            }

            /* renamed from: a */
            public final void mo14276a(List<Profile> list) {
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                if (!list.isEmpty()) {
                    this.f14625c.getProfiles().setValue(list);
                    DebugHelpersKt.debugPrint$default(String.valueOf(this.f14625c.mo14267P1()), null, Integer.valueOf(3), 2, null);
                    Profile access$getActiveProfile$p = this.f14625c.mo14267P1();
                    if (access$getActiveProfile$p != null) {
                        this.f14625c.mo14269e(access$getActiveProfile$p);
                        return;
                    }
                    return;
                }
                this.f14625c.mo14257T0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14276a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        mo16413a(C4998b.m16842a(authenticationService.mo11515l(), (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ProfileListViewModelImpl f14628c;

            {
                this.f14628c = r1;
            }

            /* renamed from: a */
            public final void mo14279a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                this.f14628c.mo16412M1().mo114a(th.getMessage(), th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14279a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<AuthenticationState, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ProfileListViewModelImpl f14627c;

            {
                this.f14627c = r1;
            }

            /* renamed from: a */
            public final void mo14278a(AuthenticationState authenticationState) {
                Intrinsics.checkParameterIsNotNull(authenticationState, "it");
                this.f14627c.mo14268b(authenticationState.mo11551c());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo14278a((AuthenticationState) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    /* renamed from: B0 */
    public String mo14256B0() {
        return (String) this.f14617l.getValue(this, f14614s[1]);
    }

    /* renamed from: P1 */
    public final Profile mo14267P1() {
        List list = (List) getProfiles().mo6263a();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Profile) next).mo14044e()) {
                obj = next;
                break;
            }
        }
        return (Profile) obj;
    }

    /* renamed from: T0 */
    public void mo14257T0() {
        mo16376b((Function1<? super Activity, ? extends Intent>) ProfileListViewModelImpl$onAddProfile$1.INSTANCE);
    }

    /* renamed from: W0 */
    public void mo14258W0() {
        Profile P1 = mo14267P1();
        if (P1 != null) {
            mo14259a(P1);
        }
    }

    /* renamed from: a */
    public void mo14259a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C4667b b = mo16365a(Integer.valueOf(C4014R.string.title_delete_profile), Integer.valueOf(C4014R.string.delete_profile_message), Integer.valueOf(C4014R.string.Alert_ButtonOk_Text), Integer.valueOf(C4014R.string.Common_Delete_Cancel)).mo17263b((C4675h<? super T, ? extends C4991d>) new ProfileListViewModelImpl$onDeleteProfile$1<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "showRxDialog(\n        ti…)\n            }\n        }");
        mo16413a(C4998b.m16839a(b, (Function1) new ProfileListViewModelImpl$onDeleteProfile$2(this), (Function0) null, 2));
    }

    /* renamed from: b */
    public void mo14260b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        if (!profile.mo14044e()) {
            mo16413a(C4998b.m16839a(this.f14622q.mo14194d(profile), (Function1) new ProfileListViewModelImpl$onSelectProfile$1(this), (Function0) null, 2));
        }
    }

    /* renamed from: b */
    public void mo14268b(boolean z) {
        this.f14620o.setValue(this, f14614s[4], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo14261d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        mo16376b((Function1<? super Activity, ? extends Intent>) new ProfileListViewModelImpl$onDetailProfile$1<Object,Object>(profile));
    }

    /* renamed from: d */
    public boolean mo14262d() {
        return ((Boolean) this.f14620o.getValue(this, f14614s[4])).booleanValue();
    }

    /* renamed from: e */
    public final void mo14269e(Profile profile) {
        String str;
        mo14273u(profile.mo14069z());
        String str2 = "";
        if (profile.mo14064v() == SupportedRole.Guardian) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(profile.mo14053l());
            sb.append(')');
            str = sb.toString();
        } else {
            str = str2;
        }
        mo14270r(str);
        mo14272t(profile.mo14056o());
        String string = this.f14623r.getString(profile.mo14065w());
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(profile.roleNameRes)");
        mo14271s(string);
        if (profile.mo14064v() == SupportedRole.Guardian) {
            str2 = profile.mo14037A();
        }
        mo14274v(str2);
    }

    /* renamed from: o1 */
    public String mo14264o1() {
        return (String) this.f14618m.getValue(this, f14614s[2]);
    }

    /* renamed from: q */
    public String mo14265q() {
        return (String) this.f14616k.getValue(this, f14614s[0]);
    }

    /* renamed from: r */
    public void mo14270r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14617l.setValue(this, f14614s[1], str);
    }

    /* renamed from: s */
    public void mo14271s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14619n.setValue(this, f14614s[3], str);
    }

    /* renamed from: t */
    public void mo14272t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14618m.setValue(this, f14614s[2], str);
    }

    /* renamed from: u */
    public void mo14273u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14616k.setValue(this, f14614s[0], str);
    }

    /* renamed from: u1 */
    public void mo14266u1() {
        Profile P1 = mo14267P1();
        if (P1 != null) {
            mo14261d(P1);
        }
    }

    /* renamed from: v */
    public void mo14274v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14621p.setValue(this, f14614s[5], str);
    }

    public C3824r<List<Profile>> getProfiles() {
        return this.f14615j;
    }
}
