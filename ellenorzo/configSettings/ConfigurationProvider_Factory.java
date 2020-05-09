package p289hu.ekreta.ellenorzo.configSettings;

import android.content.Context;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.configSettings.ConfigurationProvider_Factory */
public final class ConfigurationProvider_Factory implements C4463c<ConfigurationProvider> {

    /* renamed from: a */
    public final C5431a<Context> f11903a;

    /* renamed from: b */
    public final C5431a<String> f11904b;

    /* renamed from: c */
    public final C5431a<Long> f11905c;

    public ConfigurationProvider_Factory(C5431a<Context> aVar, C5431a<String> aVar2, C5431a<Long> aVar3) {
        this.f11903a = aVar;
        this.f11904b = aVar2;
        this.f11905c = aVar3;
    }

    public ConfigurationProvider get() {
        return new ConfigurationProvider((Context) this.f11903a.get(), (String) this.f11904b.get(), ((Long) this.f11905c.get()).longValue());
    }
}
