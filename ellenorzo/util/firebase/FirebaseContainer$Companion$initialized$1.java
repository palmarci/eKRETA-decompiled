package p289hu.ekreta.ellenorzo.util.firebase;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Companion;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainer$Companion$initialized$1 */
/* compiled from: FirebaseContainer.kt */
public final /* synthetic */ class FirebaseContainer$Companion$initialized$1 extends MutablePropertyReference0 {
    public Object get() {
        return ((Companion) this.receiver).mo16336b();
    }

    public String getName() {
        return "instance";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Companion.class);
    }

    public String getSignature() {
        return "getInstance()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;";
    }

    public void set(Object obj) {
        ((Companion) this.receiver).mo16334a((FirebaseContainer) obj);
    }
}
