package hu.ekreta.ellenorzo.util.powersaver;

import android.content.Context;
import android.content.SharedPreferences;
import hu.ekreta.ellenorzo.configSettings.ConfigurationProvider;
import i.d.c;
import l.a.a;

public final class PowerSaverCheckerImpl_Factory implements c<PowerSaverCheckerImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f6320a;
    public final a<SharedPreferences> b;
    public final a<ConfigurationProvider> c;

    public PowerSaverCheckerImpl_Factory(a<Context> aVar, a<SharedPreferences> aVar2, a<ConfigurationProvider> aVar3) {
        this.f6320a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public PowerSaverCheckerImpl get() {
        return new PowerSaverCheckerImpl(this.f6320a.get(), this.b.get(), this.c.get());
    }
}
