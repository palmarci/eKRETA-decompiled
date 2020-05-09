package p289hu.ekreta.ellenorzo.secure;

import android.content.SharedPreferences;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.secure.RealmSecureStoreImpl_Factory */
public final class RealmSecureStoreImpl_Factory implements C4463c<RealmSecureStoreImpl> {

    /* renamed from: a */
    public final C5431a<KeyStoreAdapter> f14775a;

    /* renamed from: b */
    public final C5431a<SharedPreferences> f14776b;

    public RealmSecureStoreImpl_Factory(C5431a<KeyStoreAdapter> aVar, C5431a<SharedPreferences> aVar2) {
        this.f14775a = aVar;
        this.f14776b = aVar2;
    }

    public RealmSecureStoreImpl get() {
        return new RealmSecureStoreImpl((KeyStoreAdapter) this.f14775a.get(), (SharedPreferences) this.f14776b.get());
    }
}
