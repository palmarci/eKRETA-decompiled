package hu.ekreta.ellenorzo.util.firebase;

import android.os.Bundle;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.c0.a.c;
import k.b.c0.e.f.a;
import k.b.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$getToken$1$onError$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ FirebaseContainerImpl$getToken$1 c;
    public final /* synthetic */ v e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseContainerImpl$getToken$1$onError$1(FirebaseContainerImpl$getToken$1 firebaseContainerImpl$getToken$1, v vVar) {
        super(1);
        this.c = firebaseContainerImpl$getToken$1;
        this.e = vVar;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        FirebaseContainer.DefaultImpls.logEvent$default(this.c.f6314a, FirebaseContainer.Event.FCM_REGISTER_FAIL, (Bundle) null, 2, (Object) null);
        v vVar = this.e;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "emitter");
        if (!c.a((k.b.a0.c) ((a.C0123a) vVar).get())) {
            ((a.C0123a) this.e).a(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
