package hu.ekreta.ellenorzo.di;

import a.h.c.a0.a0.m;
import a.h.c.k;
import a.h.c.l;
import a.h.c.p;
import a.h.c.v;
import a.n.a.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import h.i.e.m;
import hu.ekreta.ellenorzo.BuildConfig;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.rest.Idp;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.secure.KeyStoreAdapter;
import hu.ekreta.ellenorzo.secure.KeyStoreAdapterFromMVersionImpl;
import hu.ekreta.ellenorzo.secure.KeyStoreAdapterPreMVersionImpl;
import hu.ekreta.ellenorzo.secure.RealmSecureStore;
import hu.ekreta.ellenorzo.util.RxDelegateProxy;
import hu.ekreta.ellenorzo.util.RxDynamicProxyKt;
import hu.ekreta.ellenorzo.util.gson.CalendarTypeAdapter;
import hu.ekreta.ellenorzo.util.realm.RealmMigrationKt$migration$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.b.t;
import k.c.c0;
import k.c.y;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import m.m0.a;
import m.y;
import p.c;
import p.e;
import p.o;
import p.q;
import p.r.a.g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001IB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0002\u0010\nJB\u0010\u000b\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\b¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u001c\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u0015H\u0007J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J0\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010(\u001a\u00020\u0011H\u0007J\b\u0010)\u001a\u00020*H\u0007J0\u0010+\u001a\u00020,2\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\b\u0010-\u001a\u00020\u0011H\u0007J\b\u0010.\u001a\u00020/H\u0007J\"\u00100\u001a\u0002012\b\b\u0001\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u00102\u001a\u00020\u0011H\u0007J\u0010\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020$H\u0007J&\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u00109\u001a\n :*\u0004\u0018\u00010\u000f0\u000f2\b\b\u0001\u0010;\u001a\u00020\u0011H\u0007J\u0010\u0010<\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010=\u001a\u00020>2\u0006\u0010#\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020\rH\u0007J\u0010\u0010B\u001a\u00020C2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010D\u001a\u00020E2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010F\u001a\u00020*2\u0006\u0010;\u001a\u00020\u0011H\u0007J\u001a\u0010G\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010H\u001a\u00020\u0011H\u0007¨\u0006J"}, d2 = {"Lhu/ekreta/ellenorzo/di/AppModule;", "", "()V", "createAuthenticatedProxy", "T", "delegate", "Lhu/ekreta/ellenorzo/util/RxDelegateProxy;", "authenticationServiceProvider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "(Lhu/ekreta/ellenorzo/util/RxDelegateProxy;Ljavax/inject/Provider;)Ljava/lang/Object;", "createAuthenticatedRetrofitInterface", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "baseUrl", "", "(Lretrofit2/Retrofit$Builder;Lokhttp3/OkHttpClient$Builder;Ljavax/inject/Provider;Ljava/lang/String;)Ljava/lang/Object;", "provideApiKey", "provideAppVersionCode", "", "packageInfo", "Landroid/content/pm/PackageInfo;", "provideAppVersionName", "provideAppVersionNumber", "versionName", "versionCode", "provideAuthorizedRoles", "", "Lhu/ekreta/ellenorzo/authentication/SupportedRole;", "provideBuildConfigIsInDebugMode", "", "provideContentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "provideEAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "url", "provideEUgyintezesBasePointUrl", "provideGeneralInterceptor", "Lokhttp3/Interceptor;", "provideGlobalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "provideGlobalMobileApiBaseUrl", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideIdp", "Lhu/ekreta/ellenorzo/rest/Idp;", "provideIdpServiceUrl", "provideKeyStoreAdapter", "Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "provideMobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "provideNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "provideOkHttpClientBuilder", "kotlin.jvm.PlatformType", "userAgentFormattedText", "providePackageInfo", "provideRealmConfig", "Lio/realm/RealmConfiguration;", "realmSecureStore", "Lhu/ekreta/ellenorzo/secure/RealmSecureStore;", "provideRetrofitBuilder", "provideRootBeer", "Lcom/scottyab/rootbeer/RootBeer;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "provideUserAgentInterceptor", "providesUserAgentString", "appVersionName", "DelegateBindings", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AppModule.kt */
public final class AppModule {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H'J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020#H'J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020&H'J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020)H'J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020,H'J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\rH'J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0004\u001a\u000201H'J\u0010\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u000204H'J\u0010\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u000207H'J\u0010\u00108\u001a\u0002092\u0006\u0010\u0004\u001a\u00020:H'J\u0010\u0010;\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020=H'J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020@H'J\u0010\u0010A\u001a\u00020B2\u0006\u0010\u0004\u001a\u00020CH'J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0004\u001a\u00020FH'J\u0010\u0010G\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020IH'J\u0010\u0010J\u001a\u00020K2\u0006\u0010\u0004\u001a\u00020LH'J\u0010\u0010M\u001a\u00020N2\u0006\u0010\u0004\u001a\u00020OH'J\u0010\u0010P\u001a\u00020Q2\u0006\u0010\u0004\u001a\u00020RH'J\u0010\u0010S\u001a\u00020T2\u0006\u0010\u0004\u001a\u00020UH'J\u0010\u0010V\u001a\u00020W2\u0006\u0010\u0004\u001a\u00020XH'J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010\u0004\u001a\u00020[H'J\u0010\u0010\\\u001a\u00020]2\u0006\u0010\u0004\u001a\u00020^H'J\u0010\u0010_\u001a\u00020`2\u0006\u0010\u0004\u001a\u00020aH'J\u0010\u0010b\u001a\u00020c2\u0006\u0010\u0004\u001a\u00020dH'J\u0010\u0010e\u001a\u00020f2\u0006\u0010\u0004\u001a\u00020gH'J\u0010\u0010h\u001a\u00020i2\u0006\u0010\u0004\u001a\u00020jH'J\u0010\u0010k\u001a\u00020l2\u0006\u0010\u0004\u001a\u00020mH'J\u0010\u0010n\u001a\u00020o2\u0006\u0010\u0004\u001a\u00020pH'J\u0010\u0010q\u001a\u00020r2\u0006\u0010\u0004\u001a\u00020sH'J\u0010\u0010t\u001a\u00020u2\u0006\u0010\u0004\u001a\u00020vH'J\u0010\u0010w\u001a\u00020x2\u0006\u0010\u0004\u001a\u00020yH'J\u0010\u0010z\u001a\u00020{2\u0006\u0010\u0004\u001a\u00020|H'J\u0010\u0010}\u001a\u00020~2\u0006\u0010\u0004\u001a\u00020H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030\u0001H'J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0004\u001a\u00030 \u0001H'J\u0013\u0010¡\u0001\u001a\u00030¢\u00012\u0007\u0010\u0004\u001a\u00030£\u0001H'J\u0013\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010\u0004\u001a\u00030¦\u0001H'J\u0013\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010\u0004\u001a\u00030©\u0001H'J\u0013\u0010ª\u0001\u001a\u00030«\u00012\u0007\u0010\u0004\u001a\u00030¬\u0001H'J\u0013\u0010­\u0001\u001a\u00030®\u00012\u0007\u0010\u0004\u001a\u00030¯\u0001H'J\u0013\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010\u0004\u001a\u00030²\u0001H'J\u0013\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010\u0004\u001a\u00030µ\u0001H'J\u0013\u0010¶\u0001\u001a\u00030·\u00012\u0007\u0010\u0004\u001a\u00030¸\u0001H'¨\u0006¹\u0001"}, d2 = {"Lhu/ekreta/ellenorzo/di/AppModule$DelegateBindings;", "", "provideAddresseeSelectorService", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorService;", "delegate", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorServiceImpl;", "provideAnnouncedTestDao", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDaoImpl;", "provideAnnouncedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl;", "provideApplication", "Landroid/app/Application;", "Lhu/ekreta/ellenorzo/eKretaApp;", "provideAttachmentRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepositoryImpl;", "provideAttachmentService", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "Lhu/ekreta/ellenorzo/attachment/AttachmentServiceImpl;", "provideAuthenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationServiceImpl;", "provideCaseDao", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "Lhu/ekreta/ellenorzo/cases/CaseDaoImpl;", "provideCaseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactoryImpl;", "provideCaseRepository", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl;", "provideCaseTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepositoryImpl;", "provideChildrenDataRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepositoryImpl;", "provideClassMasterDao", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDao;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterDaoImpl;", "provideClassMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepositoryImpl;", "provideContext", "Landroid/content/Context;", "provideDateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactoryImpl;", "provideDecisionRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepositoryImpl;", "provideDeleteProfileStrategy", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategy;", "Lhu/ekreta/ellenorzo/profile/DeleteProfileStrategyImpl;", "provideDetectRootedDevice", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDevice;", "Lhu/ekreta/ellenorzo/rootedDeviceDetected/DetectRootedDeviceImpl;", "provideEvaluationDao", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDao;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDaoImpl;", "provideEvaluationRepository", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl;", "provideFileAdapter", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "Lhu/ekreta/ellenorzo/file/FileAdapterImpl;", "provideFirebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl;", "provideGroupDao", "Lhu/ekreta/ellenorzo/group/GroupDao;", "Lhu/ekreta/ellenorzo/group/GroupDaoImpl;", "provideGroupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "Lhu/ekreta/ellenorzo/group/GroupRepositoryImpl;", "provideGuardianDao", "Lhu/ekreta/ellenorzo/profile/GuardianDao;", "Lhu/ekreta/ellenorzo/profile/GuardianDaoImpl;", "provideHomeworkDao", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "Lhu/ekreta/ellenorzo/homework/HomeworkDaoImpl;", "provideHomeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "Lhu/ekreta/ellenorzo/homework/HomeworkRepositoryImpl;", "provideInstituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "Lhu/ekreta/ellenorzo/institute/InstituteRepositoryImpl;", "provideLessonDao", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDao;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemDaoImpl;", "provideLessonRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepositoryImpl;", "provideLessonService", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemService;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemServiceImpl;", "provideMessageDao", "Lhu/ekreta/ellenorzo/message/MessageDao;", "Lhu/ekreta/ellenorzo/message/MessageDaoImpl;", "provideMessageRepository", "Lhu/ekreta/ellenorzo/message/MessageRepository;", "Lhu/ekreta/ellenorzo/message/MessageRepositoryImpl;", "provideMessageService", "Lhu/ekreta/ellenorzo/message/MessagesService;", "Lhu/ekreta/ellenorzo/message/MessagesServiceImpl;", "provideNewMessageService", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageService;", "Lhu/ekreta/ellenorzo/newmessage/model/NewMessageServiceImpl;", "provideNoteDao", "Lhu/ekreta/ellenorzo/notes/NoteDao;", "Lhu/ekreta/ellenorzo/notes/NoteDaoImpl;", "provideNotesRepository", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "Lhu/ekreta/ellenorzo/notes/NotesRepositoryImpl;", "provideNoticeBoardItemDao", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDao;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemDaoImpl;", "provideNoticeBoardItemRepository", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepository;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItemRepositoryImpl;", "provideNotificationDao", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "Lhu/ekreta/ellenorzo/notification/NotificationDaoImpl;", "provideNotificationRepository", "Lhu/ekreta/ellenorzo/notification/NotificationRepository;", "Lhu/ekreta/ellenorzo/notification/NotificationRepositoryImpl;", "provideNotificationService", "Lhu/ekreta/ellenorzo/notification/NotificationStrategy;", "Lhu/ekreta/ellenorzo/notification/NotificationStrategyImpl;", "provideOmissionDao", "Lhu/ekreta/ellenorzo/omission/OmissionDao;", "Lhu/ekreta/ellenorzo/omission/OmissionDaoImpl;", "provideOmissionRepository", "Lhu/ekreta/ellenorzo/omission/OmissionRepository;", "Lhu/ekreta/ellenorzo/omission/OmissionRepositoryImpl;", "providePowerSaverChecker", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverCheckerImpl;", "provideProfileDao", "Lhu/ekreta/ellenorzo/profile/ProfileDao;", "Lhu/ekreta/ellenorzo/profile/ProfileDaoImpl;", "provideProfileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "Lhu/ekreta/ellenorzo/profile/ProfileRepositoryImpl;", "provideProfileService", "Lhu/ekreta/ellenorzo/profile/ProfileService;", "Lhu/ekreta/ellenorzo/profile/ProfileServiceImpl;", "provideRealmContainer", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapperImpl;", "provideRealmSecureStore", "Lhu/ekreta/ellenorzo/secure/RealmSecureStore;", "Lhu/ekreta/ellenorzo/secure/RealmSecureStoreImpl;", "provideSchoolYearCalendarDao", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDao;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarDaoImpl;", "provideSchoolYearCalendarRepository", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepository;", "Lhu/ekreta/ellenorzo/schoolYearCalendar/SchoolYearCalendarRepositoryImpl;", "provideSignerRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepositoryImpl;", "provideSubjectDao", "Lhu/ekreta/ellenorzo/subject/SubjectDao;", "Lhu/ekreta/ellenorzo/subject/SubjectDaoImpl;", "provideSubjectsRepository", "Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "Lhu/ekreta/ellenorzo/subject/SubjectsRepositoryImpl;", "provideSystemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExitImpl;", "provideTmgiCaseRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TmgiCaseTypeRepositoryImpl;", "provideTmgiRepository", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepositoryImpl;", "provideTypeRepository", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TypeRepository;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/TypeRepositoryImpl;", "provideUpdateProfileStrategy", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategy;", "Lhu/ekreta/ellenorzo/profile/UpdateProfileStrategyImpl;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AppModule.kt */
    public interface DelegateBindings {
    }

    public final long a(PackageInfo packageInfo) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    public final String a() {
        return BuildConfig.GLOBAL_MOBILE_API_KEY;
    }

    public final KeyStoreAdapter b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            return new KeyStoreAdapterFromMVersionImpl(context);
        }
        return new KeyStoreAdapterPreMVersionImpl(context);
    }

    public final m c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m mVar = new m(context);
        Intrinsics.checkExpressionValueIsNotNull(mVar, "NotificationManagerCompat.from(context)");
        return mVar;
    }

    public final boolean c() {
        return false;
    }

    public final PackageInfo d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.checkExpressionValueIsNotNull(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
        return packageInfo;
    }

    public final String d() {
        return "https://eugyintezes.e-kreta.hu/api/v1/";
    }

    public final b e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new b(context);
    }

    public final SharedPreferences f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("ekreta-shared-prefs", 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "context.getSharedPrefere…red-prefs\", MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final String f() {
        return "https://kretaglobalmobileapi2.ekreta.hu/api/v3/";
    }

    public final a g() {
        a aVar = new a(new AppModule$provideHttpLoggingInterceptor$1());
        a.C0141a aVar2 = a.C0141a.NONE;
        if (aVar2 != null) {
            aVar.c = aVar2;
            return aVar;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public final String h() {
        return BuildConfig.IDP_SERVICE_URL;
    }

    public final o.b i() {
        l lVar = new l();
        Class<Calendar> cls = Calendar.class;
        CalendarTypeAdapter calendarTypeAdapter = new CalendarTypeAdapter();
        boolean z = calendarTypeAdapter instanceof v;
        if (!z) {
            boolean z2 = calendarTypeAdapter instanceof p;
        }
        h.w.v.b(true);
        if ((calendarTypeAdapter instanceof p) || z) {
            lVar.f.add(new m.c(calendarTypeAdapter, (a.h.c.b0.a<?>) null, false, cls));
        }
        lVar.e.add(a.h.c.a0.a0.o.b(cls, calendarTypeAdapter));
        k a2 = lVar.a();
        o.b bVar = new o.b();
        p.s.a.a aVar = new p.s.a.a(a2);
        List<e.a> list = bVar.f7772d;
        q.a(aVar, "factory == null");
        list.add(aVar);
        t a3 = k.b.g0.b.a();
        if (a3 != null) {
            g gVar = new g(a3, false);
            List<c.a> list2 = bVar.e;
            q.a(gVar, "factory == null");
            list2.add(gVar);
            Intrinsics.checkExpressionValueIsNotNull(bVar, "Retrofit.Builder()\n     …heduler(Schedulers.io()))");
            return bVar;
        }
        throw new NullPointerException("scheduler == null");
    }

    public final m.v e() {
        return AppModule$provideGeneralInterceptor$1.INSTANCE;
    }

    public final String a(PackageInfo packageInfo, String str) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        return "hu.ekreta.guardian/" + str + '/' + Build.MODEL + '/' + Build.VERSION.RELEASE + '/' + Build.VERSION.SDK_INT;
    }

    public final String b(PackageInfo packageInfo) {
        Intrinsics.checkParameterIsNotNull(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        Intrinsics.checkExpressionValueIsNotNull(str, "packageInfo.versionName");
        return str;
    }

    public final String a(String str, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "versionName");
        return str + '+' + j2;
    }

    public final List<SupportedRole> b() {
        if (!(BuildConfig.AUTHORIZED_ROLENAMES.length() > 0)) {
            return ArraysKt___ArraysKt.toList((T[]) SupportedRole.values());
        }
        List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) BuildConfig.AUTHORIZED_ROLENAMES, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
        for (String valueOf : split$default) {
            arrayList.add(SupportedRole.valueOf(valueOf));
        }
        return arrayList;
    }

    public final c0 a(Context context, RealmSecureStore realmSecureStore) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(realmSecureStore, "realmSecureStore");
        y.a(context);
        c0.a aVar = new c0.a(k.c.a.f7098j);
        aVar.b = "ekreta.ellenorzo.realm";
        Intrinsics.checkExpressionValueIsNotNull(aVar, "RealmConfiguration.Build…\"ekreta.ellenorzo.realm\")");
        Intrinsics.checkParameterIsNotNull(aVar, "$this$migration");
        aVar.a(6);
        RealmMigrationKt$migration$1 realmMigrationKt$migration$1 = RealmMigrationKt$migration$1.INSTANCE;
        if (realmMigrationKt$migration$1 != null) {
            aVar.f = realmMigrationKt$migration$1;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "this\n    .schemaVersion(…        }\n        }\n    }");
            byte[] a2 = realmSecureStore.a();
            if (a2 == null) {
                throw new IllegalArgumentException("A non-null key must be provided");
            } else if (a2.length == 64) {
                aVar.f7126d = Arrays.copyOf(a2, a2.length);
                c0 a3 = aVar.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "RealmConfiguration.Build…Key)\n            .build()");
                return a3;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The provided key must be %s bytes. Yours was: %s", new Object[]{64, Integer.valueOf(a2.length)}));
            }
        } else {
            throw new IllegalArgumentException("A non-null migration must be provided");
        }
    }

    public final m.v b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userAgentFormattedText");
        return new AppModule$provideUserAgentInterceptor$1(str);
    }

    public final GlobalMobileApi b(String str, o.b bVar, y.b bVar2, l.a.a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (GlobalMobileApi) RxDynamicProxyKt.a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new AppModule$provideGlobalMobileApi$$inlined$createAuthenticatedRetrofitInterface$1(bVar, str, bVar2)), aVar), Reflection.getOrCreateKotlinClass(GlobalMobileApi.class));
    }

    public final ContentResolver a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkExpressionValueIsNotNull(contentResolver, "context.contentResolver");
        return contentResolver;
    }

    public final Idp a(String str, o.b bVar, y.b bVar2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Idp idp = (Idp) RxDynamicProxyKt.a(new RxDelegateProxy(new AppModule$provideIdp$1(bVar, str, bVar2)), Reflection.getOrCreateKotlinClass(Idp.class));
        Intrinsics.checkExpressionValueIsNotNull(idp, "createDelegate {\n       …te(Idp::class.java)\n    }");
        return idp;
    }

    public final y.b a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userAgentFormattedText");
        y.b bVar = new y.b();
        bVar.y = m.l0.c.a("timeout", 120, TimeUnit.SECONDS);
        bVar.A = m.l0.c.a("timeout", 120, TimeUnit.SECONDS);
        bVar.z = m.l0.c.a("timeout", 120, TimeUnit.SECONDS);
        bVar.a(g());
        bVar.a(b(str));
        bVar.a(e());
        return bVar;
    }

    /* access modifiers changed from: private */
    public final /* synthetic */ <T> T a(RxDelegateProxy<T> rxDelegateProxy, l.a.a<AuthenticationService> aVar) {
        AppModule$createAuthenticatedProxy$1 appModule$createAuthenticatedProxy$1 = new AppModule$createAuthenticatedProxy$1(rxDelegateProxy, aVar);
        Intrinsics.reifiedOperationMarker(4, "T");
        return RxDynamicProxyKt.a(appModule$createAuthenticatedProxy$1, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final EAdminApi a(String str, o.b bVar, y.b bVar2, l.a.a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (EAdminApi) RxDynamicProxyKt.a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new AppModule$provideEAdminApi$$inlined$createAuthenticatedRetrofitInterface$1(bVar, str, bVar2)), aVar), Reflection.getOrCreateKotlinClass(EAdminApi.class));
    }

    public final MobileApiV3 a(y.b bVar, o.b bVar2, l.a.a<AuthenticationService> aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "okHttpClientBuilder");
        Intrinsics.checkParameterIsNotNull(bVar2, "retrofitBuilder");
        Intrinsics.checkParameterIsNotNull(aVar, "authenticationServiceProvider");
        return (MobileApiV3) RxDynamicProxyKt.a(new AppModule$createAuthenticatedProxy$1(new RxDelegateProxy(new AppModule$provideMobileApiV3$$inlined$createAuthenticatedRetrofitInterface$1(bVar2, "https://www.baseurl.com", bVar)), aVar), Reflection.getOrCreateKotlinClass(MobileApiV3.class));
    }
}
