package p289hu.ekreta.ellenorzo.p290di;

import java.util.List;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.authentication.SupportedRole;
import p292i.p295d.C4463c;

/* renamed from: hu.ekreta.ellenorzo.di.AppModule_ProvideAuthorizedRolesFactory */
public final class AppModule_ProvideAuthorizedRolesFactory implements C4463c<List<SupportedRole>> {

    /* renamed from: a */
    public final AppModule f12575a;

    public AppModule_ProvideAuthorizedRolesFactory(AppModule appModule) {
        this.f12575a = appModule;
    }

    public List<SupportedRole> get() {
        List<SupportedRole> b = this.f12575a.mo12459b();
        C3984v.m10272b(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
