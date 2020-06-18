package hu.ekreta.ellenorzo.util.firebase;

import android.content.Context;
import i.d.c;
import l.a.a;

public final class FirebaseContainerImpl_Factory implements c<FirebaseContainerImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f6316a;

    public FirebaseContainerImpl_Factory(a<Context> aVar) {
        this.f6316a = aVar;
    }

    public FirebaseContainerImpl get() {
        return new FirebaseContainerImpl(this.f6316a.get());
    }
}
