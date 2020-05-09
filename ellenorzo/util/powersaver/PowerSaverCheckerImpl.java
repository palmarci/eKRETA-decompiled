package p289hu.ekreta.ellenorzo.util.powersaver;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.C5023j;
import p300k.p313b.C5025l;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p321e.p324c.C4784b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverCheckerImpl;", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "context", "Landroid/content/Context;", "sharedPreferences", "Landroid/content/SharedPreferences;", "configurationProvider", "Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "", "skipDialog", "getSkipDialog", "()Z", "setSkipDialog", "(Z)V", "skipDialog$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPowerSaverIntent", "Lio/reactivex/Maybe;", "Landroid/content/Intent;", "isCallable", "intent", "setDialogSeen", "", "seen", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.powersaver.PowerSaverCheckerImpl */
/* compiled from: PowerSaverCheckerImpl.kt */
public final class PowerSaverCheckerImpl implements PowerSaverChecker {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f15424d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(PowerSaverCheckerImpl.class), "skipDialog", "getSkipDialog()Z"))};

    /* renamed from: a */
    public final ReadWriteProperty f15425a;

    /* renamed from: b */
    public final Context f15426b;

    /* renamed from: c */
    public final ConfigurationProvider f15427c;

    public PowerSaverCheckerImpl(Context context, SharedPreferences sharedPreferences, ConfigurationProvider configurationProvider) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(configurationProvider, "configurationProvider");
        this.f15426b = context;
        this.f15427c = configurationProvider;
        this.f15425a = ExtensionsKt.m14635a(sharedPreferences, PowerSaverCheckerImplKt.SKIP_PROTECTED_APP_CHECK_KEY, false);
    }

    /* renamed from: a */
    public C5023j<Intent> mo16343a() {
        if (((Boolean) this.f15425a.getValue(this, f15424d[0])).booleanValue()) {
            C5023j<Intent> a = C4664d.m16037a((C5023j<T>) C4784b.f16544c);
            Intrinsics.checkExpressionValueIsNotNull(a, "Maybe.empty<Intent>()");
            return a;
        }
        C5023j<Intent> c = this.f15427c.mo12318c().mo17266c((C4675h<? super T, ? extends C5025l<? extends R>>) new PowerSaverCheckerImpl$getPowerSaverIntent$1<Object,Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(c, "configurationProvider.ge…      )\n                }");
        return c;
    }

    /* renamed from: a */
    public void mo16344a(boolean z) {
        this.f15425a.setValue(this, f15424d[0], Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final boolean mo16345a(Intent intent) {
        try {
            List queryIntentActivities = this.f15426b.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
            return !queryIntentActivities.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }
}
