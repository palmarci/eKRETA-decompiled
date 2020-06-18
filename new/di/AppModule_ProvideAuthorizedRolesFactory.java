package hu.ekreta.ellenorzo.di;

import h.w.v;
import hu.ekreta.ellenorzo.authentication.SupportedRole;
import i.d.c;
import java.util.List;

public final class AppModule_ProvideAuthorizedRolesFactory implements c<List<SupportedRole>> {

    /* renamed from: a  reason: collision with root package name */
    public final AppModule f5325a;

    public AppModule_ProvideAuthorizedRolesFactory(AppModule appModule) {
        this.f5325a = appModule;
    }

    public List<SupportedRole> get() {
        List<SupportedRole> b = this.f5325a.b();
        v.b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
