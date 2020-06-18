package hu.ekreta.ellenorzo.util.firebase;

import a.h.a.b.m.e;
import a.h.b.k.a;
import a.h.b.k.v0;
import android.os.Bundle;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.c0.a.c;
import k.b.c0.e.f.a;
import k.b.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onSuccess", "hu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl$getToken$1$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$getToken$1$$special$$inlined$apply$lambda$1<TResult> implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseContainerImpl$getToken$1 f6312a;
    public final /* synthetic */ v b;

    public FirebaseContainerImpl$getToken$1$$special$$inlined$apply$lambda$1(FirebaseContainerImpl$getToken$1 firebaseContainerImpl$getToken$1, v vVar, Function1 function1) {
        this.f6312a = firebaseContainerImpl$getToken$1;
        this.b = vVar;
    }

    /* renamed from: a */
    public final void onSuccess(a aVar) {
        v vVar = this.b;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "emitter");
        if (!c.a((k.b.a0.c) ((a.C0123a) vVar).get())) {
            FirebaseContainer.DefaultImpls.logEvent$default(this.f6312a.f6314a, FirebaseContainer.Event.FCM_REGISTER_SUCCESS, (Bundle) null, 2, (Object) null);
            v vVar2 = this.b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            ((a.C0123a) vVar2).a(((v0) aVar).f2428a);
        }
    }
}
