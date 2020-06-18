package hu.ekreta.ellenorzo.util.firebase;

import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: FirebaseContainer.kt */
public final /* synthetic */ class FirebaseContainer$Companion$initialized$1 extends MutablePropertyReference0 {
    public Object get() {
        return ((FirebaseContainer.Companion) this.receiver).b();
    }

    public String getName() {
        return "instance";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(FirebaseContainer.Companion.class);
    }

    public String getSignature() {
        return "getInstance()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;";
    }

    public void set(Object obj) {
        ((FirebaseContainer.Companion) this.receiver).a((FirebaseContainer) obj);
    }
}
