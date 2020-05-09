package p289hu.ekreta.ellenorzo.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.message.MessageRepository;
import p289hu.ekreta.ellenorzo.omission.OmissionRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.ExtensionsKt;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p321e.p326e.C4835j0;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0010\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020&H\u0002J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0014H\u0016J\u001a\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020'0605H\u0016J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020'052\u0006\u00109\u001a\u00020:2\u0006\u0010,\u001a\u00020&H\u0002J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020'052\u0006\u0010,\u001a\u00020&2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010<\u001a\u000201H\u0016J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u000207H\u0016R+\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u0014\u0010\"\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R*\u0010$\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'`(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010&0&0*X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0-X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006?"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "omissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "messageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "appVersionString", "", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/omission/OmissionRepository;Lhu/ekreta/ellenorzo/message/MessageRepository;Lhu/ekreta/ellenorzo/rest/EAdminApi;Ljava/lang/String;)V", "<set-?>", "activeProfileName", "getActiveProfileName", "()Ljava/lang/String;", "setActiveProfileName", "(Ljava/lang/String;)V", "activeProfileName$delegate", "Lkotlin/properties/ReadWriteProperty;", "activeProfileRole", "getActiveProfileRole", "setActiveProfileRole", "activeProfileRole$delegate", "appVersion", "getAppVersion", "messagesMap", "Ljava/util/HashMap;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "", "Lkotlin/collections/HashMap;", "selectedMenuSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "viewState", "Landroidx/lifecycle/MutableLiveData;", "getViewState", "()Landroidx/lifecycle/MutableLiveData;", "bringStudentToMoreViewIfItNeeded", "", "changeProfile", "profileId", "getBadgeCount", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "handleEAdministrationRelatedViewState", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "handleViewState", "onBackPressed", "onMenuItemSelected", "menuItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl extends AuthenticatedViewModel implements MainViewModel {

    /* renamed from: y */
    public static final /* synthetic */ KProperty[] f13710y;

    /* renamed from: m */
    public final String f13711m;

    /* renamed from: n */
    public final C3824r<MainViewState> f13712n = new C3824r<>();

    /* renamed from: o */
    public final ReadWriteProperty f13713o;

    /* renamed from: p */
    public final ReadWriteProperty f13714p;

    /* renamed from: q */
    public C5016a<MainViewState> f13715q;

    /* renamed from: r */
    public HashMap<MainViewState, Integer> f13716r;

    /* renamed from: s */
    public final Context f13717s;

    /* renamed from: t */
    public final ProfileRepository f13718t;

    /* renamed from: u */
    public final OmissionRepository f13719u;

    /* renamed from: v */
    public final MessageRepository f13720v;

    /* renamed from: w */
    public final EAdminApi f13721w;

    /* renamed from: x */
    public final String f13722x;

    static {
        Class<MainViewModelImpl> cls = MainViewModelImpl.class;
        f13710y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "activeProfileName", "getActiveProfileName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "activeProfileRole", "getActiveProfileRole()Ljava/lang/String;"))};
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r2v9, types: [hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MainViewModelImpl(p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl r12, p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource r13, final p289hu.ekreta.ellenorzo.authentication.AuthenticationService r14, android.content.Context r15, p289hu.ekreta.ellenorzo.profile.ProfileRepository r16, p289hu.ekreta.ellenorzo.omission.OmissionRepository r17, p289hu.ekreta.ellenorzo.message.MessageRepository r18, p289hu.ekreta.ellenorzo.rest.EAdminApi r19, java.lang.String r20) {
        /*
            r11 = this;
            r7 = r11
            r8 = r14
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            java.lang.String r6 = "observable"
            r9 = r12
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r6)
            java.lang.String r6 = "uiCommandSource"
            r10 = r13
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r6)
            java.lang.String r6 = "authenticationService"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r6)
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r6)
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
            r11.<init>(r12, r13, r14)
            r7.f13717s = r0
            r7.f13718t = r1
            r7.f13719u = r2
            r7.f13720v = r3
            r7.f13721w = r4
            r7.f13722x = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r7.f13717s
            r2 = 2131689800(0x7f0f0148, float:1.9008626E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = r7.f13722x
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f13711m = r0
            h.p.r r0 = new h.p.r
            r0.<init>()
            r7.f13712n = r0
            r2 = 38
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r0 = r11
            r1 = r11
            kotlin.properties.ReadWriteProperty r0 = p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.boundString$default(r0, r1, r2, r3, r4, r5, r6)
            r7.f13713o = r0
            r2 = 61
            r0 = r11
            kotlin.properties.ReadWriteProperty r0 = p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel.boundString$default(r0, r1, r2, r3, r4, r5, r6)
            r7.f13714p = r0
            hu.ekreta.ellenorzo.main.MainViewState r0 = p289hu.ekreta.ellenorzo.main.MainViewState.DASHBOARD
            k.b.h0.a r0 = p300k.p313b.p337h0.C5016a.m16849f(r0)
            java.lang.String r1 = "BehaviorSubject.createDefault(DASHBOARD)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.f13715q = r0
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            hu.ekreta.ellenorzo.main.MainViewState r1 = p289hu.ekreta.ellenorzo.main.MainViewState.MESSAGES
            r2 = 2131689925(0x7f0f01c5, float:1.900888E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = kotlin.TuplesKt.m17868to(r1, r2)
            r2 = 0
            r0[r2] = r1
            hu.ekreta.ellenorzo.main.MainViewState r1 = p289hu.ekreta.ellenorzo.main.MainViewState.POST_TMGI
            r3 = 2131689923(0x7f0f01c3, float:1.9008875E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r1 = kotlin.TuplesKt.m17868to(r1, r3)
            r4 = 1
            r0[r4] = r1
            hu.ekreta.ellenorzo.main.MainViewState r1 = p289hu.ekreta.ellenorzo.main.MainViewState.CASES
            kotlin.Pair r1 = kotlin.TuplesKt.m17868to(r1, r3)
            r3 = 2
            r0[r3] = r1
            java.util.HashMap r0 = kotlin.collections.MapsKt__MapsKt.hashMapOf(r0)
            r7.f13716r = r0
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r7.f13718t
            k.b.n r0 = r0.mo14198e()
            k.b.h0.a<hu.ekreta.ellenorzo.main.MainViewState> r1 = r7.f13715q
            java.lang.String r5 = "source1"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
            java.lang.String r5 = "source2"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r5)
            k.b.f0.a r5 = p300k.p313b.p335f0.C4997a.f17149a
            java.lang.String r6 = "source1 is null"
            p300k.p313b.p316c0.p318b.C4704b.m16116a(r0, r6)
            java.lang.String r6 = "source2 is null"
            p300k.p313b.p316c0.p318b.C4704b.m16116a(r1, r6)
            k.b.b0.h r5 = p300k.p313b.p316c0.p318b.C4685a.m16110a(r5)
            int r6 = p300k.p313b.C4996f.f17148c
            k.b.q[] r9 = new p300k.p313b.C5030q[r3]
            r9[r2] = r0
            r9[r4] = r1
            java.lang.String r0 = "sources is null"
            p300k.p313b.p316c0.p318b.C4704b.m16116a(r9, r0)
            int r0 = r9.length
            if (r0 != 0) goto L_0x0100
            k.b.n r0 = p300k.p313b.C5027n.m16899j()
            goto L_0x0122
        L_0x0100:
            java.lang.String r0 = "combiner is null"
            p300k.p313b.p316c0.p318b.C4704b.m16116a(r5, r0)
            java.lang.String r0 = "bufferSize"
            p300k.p313b.p316c0.p318b.C4704b.m16114a(r6, r0)
            int r0 = r6 << 1
            k.b.c0.e.e.f r1 = new k.b.c0.e.e.f
            r2 = 0
            r4 = 0
            r15 = r1
            r16 = r9
            r17 = r2
            r18 = r5
            r19 = r0
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            k.b.n r0 = p300k.p313b.p314a0.C4664d.m16039a(r1)
        L_0x0122:
            k.b.n r0 = r0.mo17220b()
            hu.ekreta.ellenorzo.main.MainViewModelImpl$1 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$1
            r1.<init>(r11)
            k.b.n r0 = r0.mo17233c(r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$2 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$2
            r1.<init>(r11)
            k.b.n r0 = r0.mo17234c(r1)
            java.lang.String r1 = "Observables\n            …ate(viewState, profile) }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$3 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$3
            r1.<init>(r11)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$4 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$4
            r2.<init>(r11)
            r4 = 0
            k.b.a0.c r0 = p300k.p313b.p335f0.C4998b.m16842a(r0, r2, r4, r1, r3)
            r11.mo16413a(r0)
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r7.f13718t
            k.b.n r0 = r0.mo14198e()
            kotlin.reflect.KProperty1 r1 = p289hu.ekreta.ellenorzo.main.MainViewModelImpl.C42305.INSTANCE
            if (r1 == 0) goto L_0x015f
            hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x015f:
            k.b.b0.h r1 = (p300k.p313b.p315b0.C4675h) r1
            k.b.n r0 = r0.mo17225b(r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$6 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$6
            r1.<init>(r14)
            k.b.n r0 = r0.mo17234c(r1)
            java.lang.String r1 = "profileRepository.active…{ profile }\n            }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$7 r1 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$7
            r1.<init>(r14)
            hu.ekreta.ellenorzo.main.MainViewModelImpl$8 r2 = new hu.ekreta.ellenorzo.main.MainViewModelImpl$8
            r2.<init>(r11)
            k.b.a0.c r0 = p300k.p313b.p335f0.C4998b.m16842a(r0, r2, r4, r1, r3)
            r11.mo16413a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.main.MainViewModelImpl.<init>(hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl, hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource, hu.ekreta.ellenorzo.authentication.AuthenticationService, android.content.Context, hu.ekreta.ellenorzo.profile.ProfileRepository, hu.ekreta.ellenorzo.omission.OmissionRepository, hu.ekreta.ellenorzo.message.MessageRepository, hu.ekreta.ellenorzo.rest.EAdminApi, java.lang.String):void");
    }

    /* renamed from: L0 */
    public String mo13177L0() {
        return (String) this.f13714p.getValue(this, f13710y[1]);
    }

    /* renamed from: a */
    public final C5027n<Integer> mo13185a(MainViewState mainViewState, Profile profile) {
        String str = "Observable.never()";
        if (mainViewState.mo13206b() && profile.mo14064v() == SupportedRole.Student) {
            if (((MainViewState) getViewState().mo6263a()) == mainViewState) {
                getViewState().setValue(MainViewState.MORE);
                this.f13715q.mo17017a(MainViewState.MORE);
            }
            C5027n<Integer> a = C4664d.m16039a(C4835j0.f16681c);
            Intrinsics.checkExpressionValueIsNotNull(a, str);
            return a;
        } else if (!mainViewState.mo13207c()) {
            getViewState().setValue(mainViewState);
            C5027n<Integer> a2 = C4664d.m16039a(C4835j0.f16681c);
            Intrinsics.checkExpressionValueIsNotNull(a2, str);
            return a2;
        } else if (profile.mo14051j()) {
            C5027n<Integer> i = ExtensionsKt.isAvailable(this.f13721w, profile).mo16975a(C5041a.m16999a()).mo16970a((C4668a) new MainViewModelImpl$handleEAdministrationRelatedViewState$1(this, mainViewState)).mo16983d().mo17250i(new MainViewModelImpl$handleEAdministrationRelatedViewState$2(this));
            Intrinsics.checkExpressionValueIsNotNull(i, "eAdminApi.isAvailable(pr…      }\n                }");
            return i;
        } else {
            C5027n<Integer> d = C5027n.m16898d(this.f13716r.get(mainViewState));
            Intrinsics.checkExpressionValueIsNotNull(d, "Observable.just(messagesMap[viewState])");
            return d;
        }
    }

    /* renamed from: g1 */
    public C5027n<Map<MainMenuItem, Integer>> mo13179g1() {
        C5027n<Map<MainMenuItem, Integer>> g = this.f13718t.mo14198e().mo17252k(new MainViewModelImpl$getBadgeCount$1(this)).mo17246g(MainViewModelImpl$getBadgeCount$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "profileRepository.active…          )\n            }");
        return g;
    }

    /* renamed from: l */
    public void mo13181l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        C4667b b = this.f13718t.mo14195d(str).mo17239d().mo17269e(MainViewModelImpl$changeProfile$1.INSTANCE).mo17263b((C4675h<? super T, ? extends C4991d>) new MainViewModelImpl$changeProfile$2<Object,Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(b, "profileRepository.getPro…ry.setActiveProfile(it) }");
        mo16413a(C4998b.m16839a(b, (Function1) new MainViewModelImpl$changeProfile$3(this), (Function0) null, 2));
    }

    /* renamed from: n */
    public String mo13182n() {
        return this.f13711m;
    }

    /* renamed from: r */
    public void mo13186r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13713o.setValue(this, f13710y[0], str);
    }

    /* renamed from: s */
    public void mo13187s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13714p.setValue(this, f13710y[1], str);
    }

    /* renamed from: t */
    public void mo13183t() {
        mo16363N1();
    }

    /* renamed from: v1 */
    public String mo13184v1() {
        return (String) this.f13713o.getValue(this, f13710y[0]);
    }

    public C3824r<MainViewState> getViewState() {
        return this.f13712n;
    }

    /* renamed from: a */
    public void mo13178a(MainMenuItem mainMenuItem) {
        Intrinsics.checkParameterIsNotNull(mainMenuItem, "menuItem");
        MainNavigationData c = mainMenuItem.mo13171c();
        if (c.mo13176c() != null) {
            this.f13715q.mo17017a(c.mo13176c());
        } else if (c.mo13175b() != null) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new MainViewModelImpl$onMenuItemSelected$1$1<Object,Object>(c));
        } else if (c.mo13174a() != null) {
            mo16376b((Function1<? super Activity, ? extends Intent>) new MainViewModelImpl$onMenuItemSelected$1$2<Object,Object>(c));
        }
    }
}
