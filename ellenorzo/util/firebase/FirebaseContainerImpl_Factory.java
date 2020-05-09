package p289hu.ekreta.ellenorzo.util.firebase;

import android.content.Context;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl_Factory */
public final class FirebaseContainerImpl_Factory implements C4463c<FirebaseContainerImpl> {

    /* renamed from: a */
    public final C5431a<Context> f15419a;

    public FirebaseContainerImpl_Factory(C5431a<Context> aVar) {
        this.f15419a = aVar;
    }

    public FirebaseContainerImpl get() {
        return new FirebaseContainerImpl((Context) this.f15419a.get());
    }
}
