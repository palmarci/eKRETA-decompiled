package hu.ekreta.ellenorzo.secure;

import android.content.SharedPreferences;
import i.d.c;
import l.a.a;

public final class RealmSecureStoreImpl_Factory implements c<RealmSecureStoreImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<KeyStoreAdapter> f6104a;
    public final a<SharedPreferences> b;

    public RealmSecureStoreImpl_Factory(a<KeyStoreAdapter> aVar, a<SharedPreferences> aVar2) {
        this.f6104a = aVar;
        this.b = aVar2;
    }

    public RealmSecureStoreImpl get() {
        return new RealmSecureStoreImpl(this.f6104a.get(), this.b.get());
    }
}
