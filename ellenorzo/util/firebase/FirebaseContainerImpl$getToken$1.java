package p289hu.ekreta.ellenorzo.util.firebase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p055a.p067b.p104m.C1920b;
import p000a.p054h.p055a.p067b.p104m.C1924d;
import p000a.p054h.p055a.p067b.p104m.C1925d0;
import p000a.p054h.p055a.p067b.p104m.C1926e;
import p000a.p054h.p055a.p067b.p104m.C1930g;
import p000a.p054h.p055a.p067b.p104m.C1932i;
import p300k.p313b.C5037v;
import p300k.p313b.C5039x;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl$getToken$1 */
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$getToken$1<T> implements C5039x<T> {

    /* renamed from: a */
    public final /* synthetic */ FirebaseContainerImpl f15415a;

    public FirebaseContainerImpl$getToken$1(FirebaseContainerImpl firebaseContainerImpl) {
        this.f15415a = firebaseContainerImpl;
    }

    /* renamed from: a */
    public final void mo12319a(C5037v<String> vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "emitter");
        FirebaseContainerImpl$getToken$1$onError$1 firebaseContainerImpl$getToken$1$onError$1 = new FirebaseContainerImpl$getToken$1$onError$1(this, vVar);
        C1930g c = this.f15415a.mo16338c();
        c.mo3529a((C1926e<? super TResult>) new C4434x3bdc5942<Object>(this, vVar, firebaseContainerImpl$getToken$1$onError$1));
        C1925d0 d0Var = (C1925d0) c;
        d0Var.mo3534a(C1932i.f4263a, (C1924d) new C4436x95918c7a(firebaseContainerImpl$getToken$1$onError$1));
        d0Var.mo3532a(C1932i.f4263a, (C1920b) new C4435x3bdc5943(this, vVar, firebaseContainerImpl$getToken$1$onError$1));
    }
}
