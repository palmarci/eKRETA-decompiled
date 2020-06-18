package hu.ekreta.ellenorzo.util.powersaver;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.List;
import k.b.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverCheckerImpl;", "Lhu/ekreta/ellenorzo/util/powersaver/PowerSaverChecker;", "context", "Landroid/content/Context;", "sharedPreferences", "Landroid/content/SharedPreferences;", "configurationProvider", "Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "", "skipDialog", "getSkipDialog", "()Z", "setSkipDialog", "(Z)V", "skipDialog$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPowerSaverIntent", "Lio/reactivex/Maybe;", "Landroid/content/Intent;", "isCallable", "intent", "setDialogSeen", "", "seen", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: PowerSaverCheckerImpl.kt */
public final class PowerSaverCheckerImpl implements PowerSaverChecker {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6318d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(PowerSaverCheckerImpl.class), "skipDialog", "getSkipDialog()Z"))};

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteProperty f6319a;
    public final Context b;
    public final ConfigurationProvider c;

    public PowerSaverCheckerImpl(Context context, SharedPreferences sharedPreferences, ConfigurationProvider configurationProvider) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(configurationProvider, "configurationProvider");
        this.b = context;
        this.c = configurationProvider;
        this.f6319a = ExtensionsKt.a(sharedPreferences, PowerSaverCheckerImplKt.SKIP_PROTECTED_APP_CHECK_KEY, false);
    }

    public j<Intent> a() {
        if (((Boolean) this.f6319a.getValue(this, f6318d[0])).booleanValue()) {
            j<Intent> c2 = j.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "Maybe.empty<Intent>()");
            return c2;
        }
        j<R> c3 = this.c.c().c(new PowerSaverCheckerImpl$getPowerSaverIntent$1(this));
        Intrinsics.checkExpressionValueIsNotNull(c3, "configurationProvider.ge…asMaybe\n                }");
        return c3;
    }

    public void a(boolean z) {
        this.f6319a.setValue(this, f6318d[0], Boolean.valueOf(z));
    }

    public final boolean a(Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = this.b.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkExpressionValueIsNotNull(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
            return !queryIntentActivities.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }
}
