package hu.ekreta.ellenorzo.profile.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.authentication.AuthenticationState;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0011H\u0002J\b\u0010<\u001a\u00020:H\u0016J\b\u0010=\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0011H\u0016J\b\u0010?\u001a\u00020:H\u0016J\u0010\u0010@\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010A\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0011H\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR+\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110'0&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R+\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020*8V@VX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00101\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR+\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001c\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001a¨\u0006B"}, d2 = {"Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/profile/list/ProfileListViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;)V", "activeProfile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getActiveProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "<set-?>", "", "fullName", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "fullName$delegate", "Lkotlin/properties/ReadWriteProperty;", "grantType", "getGrantType", "setGrantType", "grantType$delegate", "instituteName", "getInstituteName", "setInstituteName", "instituteName$delegate", "profiles", "Landroidx/lifecycle/MutableLiveData;", "", "getProfiles", "()Landroidx/lifecycle/MutableLiveData;", "", "progressVisible", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "progressVisible$delegate", "studentName", "getStudentName", "setStudentName", "studentName$delegate", "studentShortName", "getStudentShortName", "setStudentShortName", "studentShortName$delegate", "onActiveProfile", "", "profile", "onAddProfile", "onDeleteActiveProfile", "onDeleteProfile", "onDetailActiveProfile", "onDetailProfile", "onSelectProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileListViewModelImpl.kt */
public final class ProfileListViewModelImpl extends DataBindingViewModel implements ProfileListViewModel {
    public static final /* synthetic */ KProperty[] t;

    /* renamed from: k  reason: collision with root package name */
    public final r<List<Profile>> f6048k = new r<>();

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f6049l;

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f6050m;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f6051n;

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f6052o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f6053p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f6054q;
    public final ProfileRepository r;
    public final Context s;

    static {
        Class<ProfileListViewModelImpl> cls = ProfileListViewModelImpl.class;
        t = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentName", "getStudentName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "fullName", "getFullName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "instituteName", "getInstituteName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "grantType", "getGrantType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "studentShortName", "getStudentShortName()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileListViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.r = profileRepository;
        this.s = context;
        this.f6049l = DataBindingViewModel.boundString$default(this, this, 24, (String) null, (Function1) null, 6, (Object) null);
        this.f6050m = DataBindingViewModel.boundString$default(this, this, 108, (String) null, (Function1) null, 6, (Object) null);
        this.f6051n = DataBindingViewModel.boundString$default(this, this, 41, (String) null, (Function1) null, 6, (Object) null);
        this.f6052o = DataBindingViewModel.boundString$default(this, this, 30, (String) null, (Function1) null, 6, (Object) null);
        this.f6053p = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.f6054q = DataBindingViewModel.boundString$default(this, this, 68, (String) null, (Function1) null, 6, (Object) null);
        n<R> k2 = this.r.a().k(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ ProfileListViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<List<Profile>> apply(List<Profile> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                boolean z = true;
                if (!list.isEmpty()) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!(!((Profile) it.next()).e())) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        return this.c.r.d((Profile) CollectionsKt___CollectionsKt.first(list)).a(n.d(list));
                    }
                }
                return n.d(list);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(k2, "profileRepository\n      …          }\n            }");
        a(b.a(k2, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ ProfileListViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<List<? extends Profile>, Unit>(this) {
            public final /* synthetic */ ProfileListViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(List<Profile> list) {
                this.c.getProfiles().setValue(list);
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                if (!list.isEmpty()) {
                    Profile access$getActiveProfile$p = this.c.Z1();
                    if (access$getActiveProfile$p != null) {
                        this.c.e(access$getActiveProfile$p);
                        return;
                    }
                    return;
                }
                this.c.W0();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Unit.INSTANCE;
            }
        }, 2));
        a(b.a(authenticationService.l(), new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ ProfileListViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                this.c.c(false);
                this.c.V1().a(th.getMessage(), th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<AuthenticationState, Unit>(this) {
            public final /* synthetic */ ProfileListViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(AuthenticationState authenticationState) {
                Intrinsics.checkParameterIsNotNull(authenticationState, "it");
                this.c.c(authenticationState.b());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AuthenticationState) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public String B0() {
        return (String) this.f6050m.getValue(this, t[1]);
    }

    public void C1() {
        Profile Z1 = Z1();
        if (Z1 != null) {
            d(Z1);
        }
    }

    public void W0() {
        b((Function1<? super Activity, ? extends Intent>) ProfileListViewModelImpl$onAddProfile$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: hu.ekreta.ellenorzo.profile.Profile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hu.ekreta.ellenorzo.profile.Profile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: hu.ekreta.ellenorzo.profile.Profile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: hu.ekreta.ellenorzo.profile.Profile} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hu.ekreta.ellenorzo.profile.Profile Z1() {
        /*
            r4 = this;
            h.p.r r0 = r4.getProfiles()
            java.lang.Object r0 = r0.a()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0027
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r0.next()
            r3 = r2
            hu.ekreta.ellenorzo.profile.Profile r3 = (hu.ekreta.ellenorzo.profile.Profile) r3
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x0011
            r1 = r2
        L_0x0025:
            hu.ekreta.ellenorzo.profile.Profile r1 = (hu.ekreta.ellenorzo.profile.Profile) r1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl.Z1():hu.ekreta.ellenorzo.profile.Profile");
    }

    public void a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        k.b.b b = a(Integer.valueOf(R.string.title_delete_profile), Integer.valueOf(R.string.delete_profile_message), Integer.valueOf(R.string.Alert_ButtonOk_Text), Integer.valueOf(R.string.Common_Delete_Cancel)).b(new ProfileListViewModelImpl$onDeleteProfile$1(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(b, "showRxDialog(\n        ti…)\n            }\n        }");
        a(b.a(b, (Function1) new ProfileListViewModelImpl$onDeleteProfile$2(this), (Function0) null, 2));
    }

    public void a1() {
        Profile Z1 = Z1();
        if (Z1 != null) {
            a(Z1);
        }
    }

    public void b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        if (!profile.e()) {
            a(b.a(this.r.d(profile), (Function1) new ProfileListViewModelImpl$onSelectProfile$1(this), (Function0) null, 2));
        }
    }

    public void c(boolean z) {
        this.f6053p.setValue(this, t[4], Boolean.valueOf(z));
    }

    public void d(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        b((Function1<? super Activity, ? extends Intent>) new ProfileListViewModelImpl$onDetailProfile$1(profile));
    }

    public boolean d() {
        return ((Boolean) this.f6053p.getValue(this, t[4])).booleanValue();
    }

    public final void e(Profile profile) {
        String str;
        t(profile.z());
        String str2 = "";
        if (profile.v() == SupportedRole.Guardian) {
            str = '(' + profile.l() + ')';
        } else {
            str = str2;
        }
        q(str);
        s(profile.o());
        String string = this.s.getString(profile.w());
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(profile.roleNameRes)");
        r(string);
        if (profile.v() == SupportedRole.Guardian) {
            str2 = profile.A();
        }
        u(str2);
    }

    public String q() {
        return (String) this.f6049l.getValue(this, t[0]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6050m.setValue(this, t[1], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6052o.setValue(this, t[3], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6051n.setValue(this, t[2], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6049l.setValue(this, t[0], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6054q.setValue(this, t[5], str);
    }

    public String v1() {
        return (String) this.f6051n.getValue(this, t[2]);
    }

    public r<List<Profile>> getProfiles() {
        return this.f6048k;
    }
}
