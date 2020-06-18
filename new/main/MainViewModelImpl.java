package hu.ekreta.ellenorzo.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.message.MessageRepository;
import hu.ekreta.ellenorzo.omission.OmissionRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.ExtensionsKt;
import java.util.HashMap;
import java.util.Map;
import k.b.a0.d;
import k.b.b;
import k.b.c0.e.e.j0;
import k.b.h0.a;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0010\u00102\u001a\u0002032\u0006\u0010.\u001a\u00020(H\u0002J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0016H\u0016J\u001a\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020)0807H\u0016J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020)072\u0006\u0010;\u001a\u00020<2\u0006\u0010.\u001a\u00020(H\u0002J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020)072\u0006\u0010.\u001a\u00020(2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010>\u001a\u000203H\u0016J\u0010\u0010?\u001a\u0002032\u0006\u0010@\u001a\u000209H\u0016R+\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u0014\u0010$\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R*\u0010&\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'j\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)`*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010(0(0,X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020(0/X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006A"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "appVersionString", "", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/rest/EAdminApi;Ljava/lang/String;)V", "<set-?>", "activeProfileName", "getActiveProfileName", "()Ljava/lang/String;", "setActiveProfileName", "(Ljava/lang/String;)V", "activeProfileName$delegate", "Lkotlin/properties/ReadWriteProperty;", "activeProfileRole", "getActiveProfileRole", "setActiveProfileRole", "activeProfileRole$delegate", "appVersion", "getAppVersion", "messagesMap", "Ljava/util/HashMap;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "", "Lkotlin/collections/HashMap;", "selectedMenuSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "viewState", "Landroidx/lifecycle/MutableLiveData;", "getViewState", "()Landroidx/lifecycle/MutableLiveData;", "bringStudentToMoreViewIfItNeeded", "", "changeProfile", "profileId", "getBadgeCount", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "handleEAdministrationRelatedViewState", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "handleViewState", "onBackPressed", "onMenuItemSelected", "menuItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl extends AuthenticatedViewModel implements MainViewModel {
    public static final /* synthetic */ KProperty[] z;

    /* renamed from: n  reason: collision with root package name */
    public final String f5740n = (this.t.getString(R.string.app_name) + ' ' + this.y);

    /* renamed from: o  reason: collision with root package name */
    public final r<MainViewState> f5741o = new r<>();

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5742p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5743q;
    public a<MainViewState> r;
    public HashMap<MainViewState, Integer> s;
    public final Context t;
    public final ProfileRepository u;
    public final OmissionRepository v;
    public final MessageRepository w;
    public final EAdminApi x;
    public final String y;

    static {
        Class<MainViewModelImpl> cls = MainViewModelImpl.class;
        z = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "activeProfileName", "getActiveProfileName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "activeProfileRole", "getActiveProfileRole()Ljava/lang/String;"))};
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainViewModelImpl(hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl r13, hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource r14, hu.ekreta.ellenorzo.util.systemexit.SystemExit r15, hu.ekreta.ellenorzo.authentication.AuthenticationService r16, android.content.Context r17, hu.ekreta.ellenorzo.profile.ProfileRepository r18, hu.ekreta.ellenorzo.omission.OmissionRepository r19, hu.ekreta.ellenorzo.message.MessageRepository r20, hu.ekreta.ellenorzo.rest.EAdminApi r21, java.lang.String r22) {
        /*
            r12 = this;
            r7 = r12
            r8 = r16
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r6 = "observable"
            r9 = r13
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r6)
            java.lang.String r6 = "uiCommandSource"
            r10 = r14
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r6)
            java.lang.String r6 = "systemExit"
            r11 = r15
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r6)
            java.lang.String r6 = "authenticationService"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r6)
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r6)
            java.lang.String r6 = "profileRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r6)
            java.lang.String r6 = "omissionRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
            java.lang.String r6 = "messageRepository"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r6)
            java.lang.String r6 = "eAdminApi"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r6)
            java.lang.String r6 = "appVersionString"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r6)
            r12.<init>(r13, r14, r15, r16)
            r7.t = r0
            r7.u = r1
            r7.v = r2
            r7.w = r3
            r7.x = r4
            r7.y = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r7.t
            r2 = 2131689810(0x7f0f0152, float:1.9008646E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = r7.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f5740n = r0
            h.p.r r0 = new h.p.r
            r0.<init>()
            r7.f5741o = r0
            r2 = 38
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r0 = r12
            r1 = r12
            kotlin.properties.ReadWriteProperty r0 = hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.boundString$default(r0, r1, r2, r3, r4, r5, r6)
            r7.f5742p = r0
            r2 = 61
            r0 = r12
            kotlin.properties.ReadWriteProperty r0 = hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.boundString$default(r0, r1, r2, r3, r4, r5, r6)
            r7.f5743q = r0
            hu.ekreta.ellenorzo.main.MainViewState r0 = hu.ekreta.ellenorzo.main.MainViewState.DASHBOARD
            k.b.h0.a r0 = k.b.h0.a.f(r0)
            java.lang.String r1 = "BehaviorSubject.createDefault(DASHBOARD)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.r = r0
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            hu.ekreta.ellenorzo.main.MainViewState r1 = hu.ekreta.ellenorzo.main.MainViewState.MESSAGES
            r2 = 2131689938(0x7f0f01d2, float:1.9008906E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r2 = 0
            r0[r2] = r1
            hu.ekreta.ellenorzo.main.MainViewState r1 = hu.ekreta.ellenorzo.main.MainViewState.POST_TMGI
            r3 = 2131689936(0x7f0f01d0, float:1.9008901E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r4 = 1
            r0[r4] = r1
            hu.ekreta.ellenorzo.main.MainViewState r1 = hu.ekreta.ellenorzo.main.MainViewState.CASES
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 2
            r0[r3] = r1
            java.util.HashMap r0 = kotlin.collections.MapsKt__MapsKt.hashMapOf(r0)
            r7.s = r0
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r7.u
            k.b.n r0 = r0.e()
            k.b.h0.a<hu.ekreta.ellenorzo.main.MainViewState> r1 = r7.r
            java.lang.String r5 = "source1"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
            java.lang.String r5 = "source2"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
            k.b.f0.a r5 = k.b.f0.a.f7073a
            java.lang.String r6 = "source1 is null"
            k.b.c0.b.b.a(r0, (java.lang.String) r6)
            java.lang.String r6 = "source2 is null"
            k.b.c0.b.b.a(r1, (java.lang.String) r6)
            k.b.b0.h r5 = k.b.c0.b.a.a(r5)
            int r6 = k.b.f.c
            k.b.q[] r9 = new k.b.q[r3]
            r9[r2] = r0
            r9[r4] = r1
            java.lang.String r0 = "sources is null"
            k.b.c0.b.b.a(r9, (java.lang.String) r0)
            int r0 = r9.length
            if (r0 != 0) goto L_0x0108
            k.b.n r0 = k.b.n.j()
            goto L_0x012b
        L_0x0108:
            java.lang.String r0 = "combiner is null"
            k.b.c0.b.b.a(r5, (java.lang.String) r0)
            java.lang.String r0 = "bufferSize"
            k.b.c0.b.b.a((int) r6, (java.lang.String) r0)
            int r0 = r6 << 1
            k.b.c0.e.e.f r1 = new k.b.c0.e.e.f
            r2 = 0
            r4 = 0
            r17 = r1
            r18 = r9
            r19 = r2
            r20 = r5
            r21 = r0
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            k.b.n r0 = k.b.a0.d.a(r1)
        L_0x012b:
            hu.ekreta.ellenorzo.main.MainViewModelImpl$1 r1 = hu.ekreta.ellenorzo.main.MainViewModelImpl.AnonymousClass1.INSTANCE
            k.b.n r0 = r0.b(r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$2 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$2
            r1.<init>(r12)
            k.b.n r0 = r0.c(r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$3 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$3
            r1.<init>(r12)
            k.b.n r0 = r0.c(r1)
            java.lang.String r1 = "Observables\n            …ate(viewState, profile) }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$4 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$4
            r1.<init>(r12)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$5 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$5
            r2.<init>(r12)
            r4 = 0
            k.b.a0.c r0 = k.b.f0.b.a(r0, r2, r4, r1, r3)
            r12.a(r0)
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r7.u
            k.b.n r0 = r0.e()
            kotlin.reflect.KProperty1 r1 = hu.ekreta.ellenorzo.main.MainViewModelImpl.AnonymousClass6.INSTANCE
            if (r1 == 0) goto L_0x016a
            hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x016a:
            k.b.b0.h r1 = (k.b.b0.h) r1
            k.b.n r0 = r0.b(r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$7 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$7
            r1.<init>(r8)
            k.b.n r0 = r0.c(r1)
            java.lang.String r1 = "profileRepository.active…{ profile }\n            }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$8 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$8
            r1.<init>(r8)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$9 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$9
            r2.<init>(r12)
            k.b.a0.c r0 = k.b.f0.b.a(r0, r2, r4, r1, r3)
            r12.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.main.MainViewModelImpl.<init>(hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl, hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource, hu.ekreta.ellenorzo.util.systemexit.SystemExit, hu.ekreta.ellenorzo.authentication.AuthenticationService, android.content.Context, hu.ekreta.ellenorzo.profile.ProfileRepository, hu.ekreta.ellenorzo.omission.OmissionRepository, hu.ekreta.ellenorzo.message.MessageRepository, hu.ekreta.ellenorzo.rest.EAdminApi, java.lang.String):void");
    }

    public String D1() {
        return (String) this.f5742p.getValue(this, z[0]);
    }

    public String N0() {
        return (String) this.f5743q.getValue(this, z[1]);
    }

    public final n<Integer> a(MainViewState mainViewState, Profile profile) {
        if (mainViewState.b() && profile.v() == SupportedRole.Student) {
            if (((MainViewState) getViewState().a()) == mainViewState) {
                getViewState().setValue(MainViewState.MORE);
                this.r.a(MainViewState.MORE);
            }
            n<Integer> a2 = d.a(j0.c);
            Intrinsics.checkExpressionValueIsNotNull(a2, "Observable.never()");
            return a2;
        } else if (!mainViewState.c()) {
            getViewState().setValue(mainViewState);
            n<Integer> a3 = d.a(j0.c);
            Intrinsics.checkExpressionValueIsNotNull(a3, "Observable.never()");
            return a3;
        } else if (profile.j()) {
            n<Integer> i2 = ExtensionsKt.isAvailable(this.x, profile).a(k.b.z.a.a.a()).a((k.b.b0.a) new MainViewModelImpl$handleEAdministrationRelatedViewState$1(this, mainViewState)).d().i(new MainViewModelImpl$handleEAdministrationRelatedViewState$2(this));
            Intrinsics.checkExpressionValueIsNotNull(i2, "eAdminApi.isAvailable(pr…      }\n                }");
            return i2;
        } else {
            n<Integer> d2 = n.d(this.s.get(mainViewState));
            Intrinsics.checkExpressionValueIsNotNull(d2, "Observable.just(messagesMap[viewState])");
            return d2;
        }
    }

    public void l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        b b = this.u.d(str).d().e(MainViewModelImpl$changeProfile$1.INSTANCE).b(new MainViewModelImpl$changeProfile$2(this));
        Intrinsics.checkExpressionValueIsNotNull(b, "profileRepository.getPro…ry.setActiveProfile(it) }");
        a(k.b.f0.b.a(b, (Function1) new MainViewModelImpl$changeProfile$3(this), (Function0) null, 2));
    }

    public String n() {
        return this.f5740n;
    }

    public n<Map<MainMenuItem, Integer>> n1() {
        n<R> g2 = this.u.e().k(new MainViewModelImpl$getBadgeCount$1(this)).g(MainViewModelImpl$getBadgeCount$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "profileRepository.active…          )\n            }");
        return g2;
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5742p.setValue(this, z[0], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5743q.setValue(this, z[1], str);
    }

    public void t() {
        W1();
    }

    public r<MainViewState> getViewState() {
        return this.f5741o;
    }

    public void a(MainMenuItem mainMenuItem) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "menuItem");
        MainNavigationData c = mainMenuItem.c();
        if (c.c() != null) {
            this.r.a(c.c());
        } else if (c.b() != null) {
            b((Function1<? super Activity, ? extends Intent>) new MainViewModelImpl$onMenuItemSelected$1$1(c));
        } else if (c.a() != null) {
            b((Function1<? super Activity, ? extends Intent>) new MainViewModelImpl$onMenuItemSelected$1$2(c));
        }
    }
}
