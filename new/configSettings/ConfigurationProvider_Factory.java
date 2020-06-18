package hu.ekreta.ellenorzo.configSettings;

import i.d.c;
import l.a.a;

public final class ConfigurationProvider_Factory implements c<ConfigurationProvider> {

    /* renamed from: a  reason: collision with root package name */
    public final a<String> f5300a;
    public final a<Long> b;

    public ConfigurationProvider_Factory(a<String> aVar, a<Long> aVar2) {
        this.f5300a = aVar;
        this.b = aVar2;
    }

    public ConfigurationProvider get() {
        return new ConfigurationProvider(this.f5300a.get(), this.b.get().longValue());
    }
}
