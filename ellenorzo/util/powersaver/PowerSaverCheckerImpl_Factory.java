package p289hu.ekreta.ellenorzo.util.powersaver;

import android.content.Context;
import android.content.SharedPreferences;
import p289hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.util.powersaver.PowerSaverCheckerImpl_Factory */
public final class PowerSaverCheckerImpl_Factory implements C4463c<PowerSaverCheckerImpl> {

    /* renamed from: a */
    public final C5431a<Context> f15429a;

    /* renamed from: b */
    public final C5431a<SharedPreferences> f15430b;

    /* renamed from: c */
    public final C5431a<ConfigurationProvider> f15431c;

    public PowerSaverCheckerImpl_Factory(C5431a<Context> aVar, C5431a<SharedPreferences> aVar2, C5431a<ConfigurationProvider> aVar3) {
        this.f15429a = aVar;
        this.f15430b = aVar2;
        this.f15431c = aVar3;
    }

    public PowerSaverCheckerImpl get() {
        return new PowerSaverCheckerImpl((Context) this.f15429a.get(), (SharedPreferences) this.f15430b.get(), (ConfigurationProvider) this.f15431c.get());
    }
}
