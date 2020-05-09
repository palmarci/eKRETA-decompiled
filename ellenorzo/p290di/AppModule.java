package p289hu.ekreta.ellenorzo.p290di;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import p000a.p054h.p159c.C2559k;
import p000a.p054h.p159c.C2561l;
import p000a.p054h.p159c.C2565p;
import p000a.p054h.p159c.C2571v;
import p000a.p054h.p159c.p160a0.p161a0.C2455m.C2458c;
import p000a.p054h.p159c.p160a0.p161a0.C2460o;
import p000a.p180n.p181a.C2723b;
import p211h.p238i.p239e.C3535m;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.BuildConfig;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p289hu.ekreta.ellenorzo.rest.Idp;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.secure.KeyStoreAdapter;
import p289hu.ekreta.ellenorzo.secure.KeyStoreAdapterFromMVersionImpl;
import p289hu.ekreta.ellenorzo.secure.KeyStoreAdapterPreMVersionImpl;
import p289hu.ekreta.ellenorzo.secure.RealmSecureStore;
import p289hu.ekreta.ellenorzo.util.RxDelegateProxy;
import p289hu.ekreta.ellenorzo.util.RxDynamicProxyKt;
import p289hu.ekreta.ellenorzo.util.gson.CalendarTypeAdapter;
import p289hu.ekreta.ellenorzo.util.realm.RealmMIgrationKt$migration$1;
import p300k.p313b.C5033t;
import p300k.p313b.p336g0.C5006b;
import p300k.p340c.C5047a;
import p300k.p340c.C5061c0;
import p300k.p340c.C5061c0.C5062a;
import p300k.p340c.C5179y;
import p351l.p352a.C5431a;
import p353m.C5575v;
import p353m.C5581y.C5583b;
import p353m.p354l0.C5469c;
import p353m.p363m0.C5557a;
import p353m.p363m0.C5557a.C5558a;
import p380p.C5748c.C5749a;
import p380p.C5751e.C5752a;
import p380p.C5788o.C5790b;
import p380p.C5793q;
import p380p.p381r.p382a.C5807g;
import p380p.p383s.p384a.C5808a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0002\u0010\nJB\u0010\u000b\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\b¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u001c\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u0015H\u0007J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J0\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010(\u001a\u00020\u0011H\u0007J\b\u0010)\u001a\u00020*H\u0007J0\u0010+\u001a\u00020,2\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010-\u001a\u00020\u0011H\u0007J\b\u0010.\u001a\u00020/H\u0007J\"\u00100\u001a\u0002012\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u00102\u001a\u00020\u0011H\u0007J\u0010\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020$H\u0007J&\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u00109\u001a\n :*\u0004\u0018\u00010\u000f0\u000f2\b\b\u0001\u0010;\u001a\u00020\u0011H\u0007J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010=\u001a\u00020>2\u0006\u0010#\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020\rH\u0007J\u0010\u0010B\u001a\u00020C2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010D\u001a\u00020E2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010F\u001a\u00020*2\u0006\u0010;\u001a\u00020\u0011H\u0007J\u001a\u0010G\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010H\u001a\u00020\u0011H\u0007¨\u0006J"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/di/AppModule;", "", "()V", "createAuthenticatedProxy", "T", "delegate", "Lhu/ekreta/ellenorzo/util/RxDelegateProxy;", "authenticationServiceProvider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "(Lhu/ekreta/ellenorzo/util/RxDelegateProxy;Ljavax/inject/Provider;)Ljava/lang/Object;", "createAuthenticatedRetrofitInterface", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "baseUrl", "", "(Lretrofit2/Retrofit$Builder;Lokhttp3/OkHttpClient$Builder;Ljavax/inject/Provider;Ljava/lang/String;)Ljava/lang/Object;", "provideApiKey", "provideAppVersionCode", "", "packageInfo", "Landroid/content/pm/PackageInfo;", "provideAppVersionName", "provideAppVersionNumber", "versionName", "versionCode", "provideAuthorizedRoles", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "provideBuildConfigIsInDebugMode", "", "provideContentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "provideEAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "url", "provideEUgyintezesBasePointUrl", "provideGeneralInterceptor", "Lokhttp3/Interceptor;", "provideGlobalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "provideGlobalMobileApiBaseUrl", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideIdp", "Lhu/ekreta/ellenorzo/rest/Idp;", "provideIdpServiceUrl", "provideKeyStoreAdapter", "Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "provideMobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "provideNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "provideOkHttpClientBuilder", "kotlin.jvm.PlatformType", "userAgentFormattedText", "providePackageInfo", "provideRealmConfig", "Lio/realm/RealmConfiguration;", "realmSecureStore", "Lhu/ekreta/ellenorzo/secure/RealmSecureStore;", "provideRetrofitBuilder", "provideRootBeer", "Lcom/scottyab/rootbeer/RootBeer;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "provideUserAgentInterceptor", "providesUserAgentString", "appVersionName", "DelegateBindings", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.AppModule */
/* compiled from: AppModule.kt */
public final class AppModule {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Ö\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H'J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020#H'J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020&H'J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020)H'J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\nH'J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020.H'J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0004\u001a\u000201H'J\u0010\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u000204H'J\u0010\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u000207H'J\u0010\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020:H'J\u0010\u0010;\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020=H'J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020@H'J\u0010\u0010A\u001a\u00020B2\u0006\u0010\u0004\u001a\u00020CH'J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020FH'J\u0010\u0010G\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020IH'J\u0010\u0010J\u001a\u00020K2\u0006\u0010\u0004\u001a\u00020LH'J\u0010\u0010M\u001a\u00020N2\u0006\u0010\u0004\u001a\u00020OH'J\u0010\u0010P\u001a\u00020Q2\u0006\u0010\u0004\u001a\u00020RH'J\u0010\u0010S\u001a\u00020T2\u0006\u0010\u0004\u001a\u00020UH'J\u0010\u0010V\u001a\u00020W2\u0006\u0010\u0004\u001a\u00020XH'J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010\u0004\u001a\u00020[H'J\u0010\u0010\\\u001a\u00020]2\u0006\u0010\u0004\u001a\u00020^H'J\u0010\u0010_\u001a\u00020`2\u0006\u0010\u0004\u001a\u00020aH'J\u0010\u0010b\u001a\u00020c2\u0006\u0010\u0004\u001a\u00020dH'J\u0010\u0010e\u001a\u00020f2\u0006\u0010\u0004\u001a\u00020gH'J\u0010\u0010h\u001a\u00020i2\u0006\u0010\u0004\u001a\u00020jH'J\u0010\u0010k\u001a\u00020l2\u0006\u0010\u0004\u001a\u00020mH'J\u0010\u0010n\u001a\u00020o2\u0006\u0010\u0004\u001a\u00020pH'J\u0010\u0010q\u001a\u00020r2\u0006\u0010\u0004\u001a\u00020sH'J\u0010\u0010t\u001a\u00020u2\u0006\u0010\u0004\u001a\u00020vH'J\u0010\u0010w\u001a\u00020x2\u0006\u0010\u0004\u001a\u00020yH'J\u0010\u0010z\u001a\u00020{2\u0006\u0010\u0004\u001a\u00020|H'J\u0010\u0010}\u001a\u00020~2\u0006\u0010\u0004\u001a\u00020H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030 \u0001H'J\u0013\u0010¡\u0001\u001a\u00030¢\u00012\u0007\u0010\u0004\u001a\u00030£\u0001H'J\u0013\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010\u0004\u001a\u00030¦\u0001H'J\u0013\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010\u0004\u001a\u00030©\u0001H'J\u0013\u0010ª\u0001\u001a\u00030«\u00012\u0007\u0010\u0004\u001a\u00030¬\u0001H'J\u0013\u0010­\u0001\u001a\u00030®\u00012\u0007\u0010\u0004\u001a\u00030¯\u0001H'J\u0013\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010\u0004\u001a\u00030²\u0001H'¨\u0006³\u0001"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/di/AppModule$DelegateBindings;", "", "provideAnnouncedTestDao", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "delegate", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDaoImpl;", "provideAnnouncedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl;", "provideApplication", "Landroid/app/Application;", "Lhu/ekreta/ellenorzo/eKretaApp;", "provideAttachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepositoryImpl;", "provideAttachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "Lhu/ekreta/ellenorzo/attachment/AttachmentServiceImpl;", "provideAuthenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl;", "provideCaseDao", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "Lhu/ekreta/ellenorzo/cases/CaseDaoImpl;", "provideCaseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactoryImpl;", "provideCaseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl;", "provideCaseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepositoryImpl;", "provideChildrenDataRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepositoryImpl;", "provideClassMasterDao", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDaoImpl;", "provideClassMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepositoryImpl;", "provideContext", "Landroid/content/Context;", "provideDateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactoryImpl;", "provideDecisionRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepositoryImpl;", "provideDeleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategyImpl;", "provideDetectRootedDevice", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDeviceImpl;", "provideEvaluationDao", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDaoImpl;", "provideEvaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl;", "provideFileAdapter", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "Lhu/ekreta/ellenorzo/file/FileAdapterImpl;", "provideFirebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl;", "provideGroupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "Lhu/ekreta/ellenorzo/group/GroupDaoImpl;", "provideGroupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "Lhu/ekreta/ellenorzo/group/GroupRepositoryImpl;", "provideGuardianDao", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "Lhu/ekreta/ellenorzo/profile/GuardianDaoImpl;", "provideHomeworkDao", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "Lhu/ekreta/ellenorzo/homework/HomeworkDaoImpl;", "provideHomeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "Lhu/ekreta/ellenorzo/homework/HomeworkRepositoryImpl;", "provideInstituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "Lhu/ekreta/ellenorzo/institute/InstituteRepositoryImpl;", "provideLessonDao", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDaoImpl;", "provideLessonRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepositoryImpl;", "provideLessonService", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemServiceImpl;", "provideMessageDao", "Lhu/ekreta/ellenorzo/message/MessageDao;", "Lhu/ekreta/ellenorzo/message/MessageDaoImpl;", "provideMessageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl;", "provideMessageService", "Lhu/ekreta/ellenorzo/message/MessagesService;", "Lhu/ekreta/ellenorzo/message/MessagesServiceImpl;", "provideNewMessageRepository", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageServiceImpl;", "provideNoteDao", "Lhu/ekreta/ellenorzo/notes/NoteDao;", "Lhu/ekreta/ellenorzo/notes/NoteDaoImpl;", "provideNotesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "Lhu/ekreta/ellenorzo/notes/NotesRepositoryImpl;", "provideNoticeBoardItemDao", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDaoImpl;", "provideNoticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl;", "provideNotificationDao", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "Lhu/ekreta/ellenorzo/notification/NotificationDaoImpl;", "provideNotificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "Lhu/ekreta/ellenorzo/notification/NotificationRepositoryImpl;", "provideNotificationService", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "Lhu/ekreta/ellenorzo/notification/NotificationStrategyImpl;", "provideOmissionDao", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "Lhu/ekreta/ellenorzo/omission/OmissionDaoImpl;", "provideOmissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl;", "providePowerSaverChecker", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverCheckerImpl;", "provideProfileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "Lhu/ekreta/ellenorzo/profile/ProfileDaoImpl;", "provideProfileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "Lhu/ekreta/ellenorzo/profile/ProfileRepositoryImpl;", "provideProfileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "Lhu/ekreta/ellenorzo/profile/ProfileServiceImpl;", "provideRealmContainer", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapperImpl;", "provideRealmSecureStore", "Lhu/ekreta/ellenorzo/secure/RealmSecureStore;", "Lhu/ekreta/ellenorzo/secure/RealmSecureStoreImpl;", "provideSchoolYearCalendarDao", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDaoImpl;", "provideSchoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl;", "provideSignerRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepositoryImpl;", "provideSubjectDao", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl;", "provideSubjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl;", "provideTmgiCaseRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepositoryImpl;", "provideTmgiRepository", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepositoryImpl;", "provideTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TypeRepositoryImpl;", "provideUpdateProfileStrategy", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategyImpl;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.di.AppModule$DelegateBindings */
    /* compiled from: AppModule.kt */
    public interface DelegateBindings {
    }

    /* renamed from: a */
    public final long mo12446a(PackageInfo packageInfo) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        if (VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    /* renamed from: a */
    public final String mo12451a() {
        return BuildConfig.GLOBAL_MOBILE_API_KEY;
    }

    /* renamed from: b */
    public final KeyStoreAdapter mo12457b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (VERSION.SDK_INT >= 23) {
            return new KeyStoreAdapterFromMVersionImpl(context);
        }
        return new KeyStoreAdapterPreMVersionImpl(context);
    }

    /* renamed from: c */
    public final C3535m mo12461c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C3535m mVar = new C3535m(context);
        Intrinsics.checkExpressionValueIsNotNull(mVar, "NotificationManagerCompat.from(context)");
        return mVar;
    }

    /* renamed from: c */
    public final boolean mo12462c() {
        return false;
    }

    /* renamed from: d */
    public final PackageInfo mo12463d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.checkExpressionValueIsNotNull(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
        return packageInfo;
    }

    /* renamed from: d */
    public final String mo12464d() {
        return "https://eugyintezes.e-kreta.hu/api/v1/";
    }

    /* renamed from: e */
    public final C2723b mo12465e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new C2723b(context);
    }

    /* renamed from: f */
    public final SharedPreferences mo12467f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ekreta-shared-prefs", 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "context.getSharedPrefere…red-prefs\", MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* renamed from: f */
    public final String mo12468f() {
        return "https://kretaglobalmobileapi2.ekreta.hu/api/v3/";
    }

    /* renamed from: g */
    public final C5557a mo12469g() {
        C5557a aVar = new C5557a(new AppModule$provideHttpLoggingInterceptor$1());
        C5558a aVar2 = C5558a.NONE;
        if (aVar2 != null) {
            aVar.f18016c = aVar2;
            return aVar;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    /* renamed from: h */
    public final String mo12470h() {
        return BuildConfig.IDP_SERVICE_URL;
    }

    /* renamed from: i */
    public final C5790b mo12471i() {
        C2561l lVar = new C2561l();
        Class<Calendar> cls = Calendar.class;
        CalendarTypeAdapter calendarTypeAdapter = new CalendarTypeAdapter();
        boolean z = calendarTypeAdapter instanceof C2571v;
        if (!z) {
            boolean z2 = calendarTypeAdapter instanceof C2565p;
        }
        C3984v.m10284b(true);
        if ((calendarTypeAdapter instanceof C2565p) || z) {
            lVar.f5885f.add(new C2458c(calendarTypeAdapter, null, false, cls));
        }
        lVar.f5884e.add(C2460o.m5290b(cls, calendarTypeAdapter));
        C2559k a = lVar.mo4835a();
        C5790b bVar = new C5790b();
        C5808a aVar = new C5808a(a);
        List<C5752a> list = bVar.f18638d;
        String str = "factory == null";
        C5793q.m19251a(aVar, str);
        list.add(aVar);
        C5033t a2 = C5006b.m16847a();
        if (a2 != null) {
            C5807g gVar = new C5807g(a2, false);
            List<C5749a> list2 = bVar.f18639e;
            C5793q.m19251a(gVar, str);
            list2.add(gVar);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "Retrofit.Builder()\n     …heduler(Schedulers.io()))");
            return bVar;
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public final C5575v mo12466e() {
        return AppModule$provideGeneralInterceptor$1.INSTANCE;
    }

    /* renamed from: a */
    public final String mo12452a(PackageInfo packageInfo, String str) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        StringBuilder sb = new StringBuilder();
        sb.append("hu.ekreta.student/");
        sb.append(str);
        sb.append('/');
        sb.append(Build.MODEL);
        sb.append('/');
        sb.append(VERSION.RELEASE);
        sb.append('/');
        sb.append(VERSION.SDK_INT);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo12458b(PackageInfo packageInfo) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        Intrinsics.checkExpressionValueIsNotNull(str, "packageInfo.versionName");
        return str;
    }

    /* renamed from: a */
    public final String mo12453a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "versionName");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('+');
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: b */
    public final List<SupportedRole> mo12459b() {
        String str = BuildConfig.AUTHORIZED_ROLENAMES;
        if (!(str.length() > 0)) {
            return ArraysKt___ArraysKt.toList((T[]) SupportedRole.values());
        }
        List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
        for (String valueOf : split$default) {
            arrayList.add(SupportedRole.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C5061c0 mo12454a(Context context, RealmSecureStore realmSecureStore) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(realmSecureStore, "realmSecureStore");
        C5179y.m17792a(context);
        C5062a aVar = new C5062a(C5047a.f17205j);
        aVar.f17255b = "ekreta.ellenorzo.realm";
        Intrinsics.checkExpressionValueIsNotNull(aVar, "RealmConfiguration.Build…\"ekreta.ellenorzo.realm\")");
        Intrinsics.checkParameterIsNotNull(aVar, "$this$migration");
        aVar.mo17302a(5);
        RealmMIgrationKt$migration$1 realmMIgrationKt$migration$1 = RealmMIgrationKt$migration$1.INSTANCE;
        if (realmMIgrationKt$migration$1 != null) {
            aVar.f17259f = realmMIgrationKt$migration$1;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "this\n    .schemaVersion(…        }\n        }\n    }");
            byte[] a = realmSecureStore.mo15656a();
            if (a == null) {
                throw new IllegalArgumentException("A non-null key must be provided");
            } else if (a.length == 64) {
                aVar.f17257d = Arrays.copyOf(a, a.length);
                C5061c0 a2 = aVar.mo17303a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "RealmConfiguration.Build…Key)\n            .build()");
                return a2;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The provided key must be %s bytes. Yours was: %s", new Object[]{Integer.valueOf(64), Integer.valueOf(a.length)}));
            }
        } else {
            throw new IllegalArgumentException("A non-null migration must be provided");
        }
    }

    /* renamed from: b */
    public final C5575v mo12460b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userAgentFormattedText");
        return new AppModule$provideUserAgentInterceptor$1(str);
    }

    /* renamed from: b */
    public final GlobalMobileApi mo12456b(String str, C5790b bVar, C5583b bVar2, C5431a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (GlobalMobileApi) RxDynamicProxyKt.m14767a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new C4127x4c218124(bVar, str, bVar2)), aVar), Reflection.getOrCreateKotlinClass(GlobalMobileApi.class));
    }

    /* renamed from: a */
    public final ContentResolver mo12447a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkExpressionValueIsNotNull(contentResolver, "context.contentResolver");
        return contentResolver;
    }

    /* renamed from: a */
    public final Idp mo12449a(String str, C5790b bVar, C5583b bVar2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Idp idp = (Idp) RxDynamicProxyKt.m14767a(new RxDelegateProxy(new AppModule$provideIdp$1(bVar, str, bVar2)), Reflection.getOrCreateKotlinClass(Idp.class));
        Intrinsics.checkExpressionValueIsNotNull(idp, "createDelegate {\n       …te(Idp::class.java)\n    }");
        return idp;
    }

    /* renamed from: a */
    public final C5583b mo12455a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userAgentFormattedText");
        C5583b bVar = new C5583b();
        String str2 = "timeout";
        bVar.f18136y = C5469c.m17971a(str2, 120, TimeUnit.SECONDS);
        bVar.f18110A = C5469c.m17971a(str2, 120, TimeUnit.SECONDS);
        bVar.f18137z = C5469c.m17971a(str2, 120, TimeUnit.SECONDS);
        bVar.mo21881a(mo12469g());
        bVar.mo21881a(mo12460b(str));
        bVar.mo21881a(mo12466e());
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final /* synthetic */ <T> T m11987a(RxDelegateProxy<T> rxDelegateProxy, C5431a<AuthenticationService> aVar) {
        AppModule$createAuthenticatedProxy$1 appModule$createAuthenticatedProxy$1 = new AppModule$createAuthenticatedProxy$1(rxDelegateProxy, aVar);
        Intrinsics.reifiedOperationMarker(4, "T");
        return RxDynamicProxyKt.m14767a(appModule$createAuthenticatedProxy$1, Reflection.getOrCreateKotlinClass(Object.class));
    }

    /* renamed from: a */
    public final EAdminApi mo12448a(String str, C5790b bVar, C5583b bVar2, C5431a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (EAdminApi) RxDynamicProxyKt.m14767a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new C4126xccbf5bf(bVar, str, bVar2)), aVar), Reflection.getOrCreateKotlinClass(EAdminApi.class));
    }

    /* renamed from: a */
    public final MobileApiV3 mo12450a(C5583b bVar, C5790b bVar2, C5431a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (MobileApiV3) RxDynamicProxyKt.m14767a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new C4128x7b8f3d24(bVar2, "https://www.baseurl.com", bVar)), aVar), Reflection.getOrCreateKotlinClass(MobileApiV3.class));
    }
}
