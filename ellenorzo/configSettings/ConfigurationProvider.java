package p289hu.ekreta.ellenorzo.configSettings;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p300k.p313b.C5036u;
import p300k.p313b.C5039x;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "", "context", "Landroid/content/Context;", "appVersionName", "", "appVersionCode", "", "(Landroid/content/Context;Ljava/lang/String;J)V", "getAppVersionCode", "()J", "getAppVersionName", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getConfiguration", "Lio/reactivex/Single;", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.ConfigurationProvider */
/* compiled from: ConfigurationProvider.kt */
public final class ConfigurationProvider {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f11895d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ConfigurationProvider.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: a */
    public final Lazy f11896a = LazyKt__LazyJVMKt.lazy(ConfigurationProvider$logger$2.INSTANCE);

    /* renamed from: b */
    public final String f11897b;

    /* renamed from: c */
    public final long f11898c;

    public ConfigurationProvider(Context context, String str, long j) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "appVersionName");
        this.f11897b = str;
        this.f11898c = j;
    }

    public static final /* synthetic */ C5620b access$getLogger$p(ConfigurationProvider configurationProvider) {
        Lazy lazy = configurationProvider.f11896a;
        KProperty kProperty = f11895d[0];
        return (C5620b) lazy.getValue();
    }

    /* renamed from: a */
    public final long mo12316a() {
        return this.f11898c;
    }

    /* renamed from: b */
    public final String mo12317b() {
        return this.f11897b;
    }

    /* renamed from: c */
    public final C5036u<Configuration> mo12318c() {
        C5036u<Configuration> a = C5036u.m16977a((C5039x<T>) new ConfigurationProvider$getConfiguration$1<T>(this));
        Intrinsics.checkExpressionValueIsNotNull(a, "Single.create { subscrib…}\n            }\n        }");
        return a;
    }
}
