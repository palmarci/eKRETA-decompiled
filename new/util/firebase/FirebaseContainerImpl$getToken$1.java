package hu.ekreta.ellenorzo.util.firebase;

import a.h.a.b.m.b;
import a.h.a.b.m.d;
import a.h.a.b.m.d0;
import a.h.a.b.m.e;
import a.h.a.b.m.g;
import a.h.a.b.m.i;
import a.h.b.k.a;
import k.b.v;
import k.b.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$getToken$1<T> implements x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseContainerImpl f6314a;

    public FirebaseContainerImpl$getToken$1(FirebaseContainerImpl firebaseContainerImpl) {
        this.f6314a = firebaseContainerImpl;
    }

    public final void a(v<String> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "emitter");
        FirebaseContainerImpl$getToken$1$onError$1 firebaseContainerImpl$getToken$1$onError$1 = new FirebaseContainerImpl$getToken$1$onError$1(this, vVar);
        g<a> c = this.f6314a.c();
        c.a((e<? super a>) new FirebaseContainerImpl$getToken$1$$special$$inlined$apply$lambda$1(this, vVar, firebaseContainerImpl$getToken$1$onError$1));
        d0 d0Var = (d0) c;
        d0Var.a(i.f1974a, (d) new FirebaseContainerImpl$sam$i$com_google_android_gms_tasks_OnFailureListener$0(firebaseContainerImpl$getToken$1$onError$1));
        d0Var.a(i.f1974a, (b) new FirebaseContainerImpl$getToken$1$$special$$inlined$apply$lambda$2(this, vVar, firebaseContainerImpl$getToken$1$onError$1));
    }
}
