package p289hu.ekreta.ellenorzo.util.firebase;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.DefaultImpls;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p300k.p313b.C5037v;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p316c0.p317a.C4680c;
import p300k.p313b.p316c0.p321e.p327f.C4914a.C4915a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl$getToken$1$onError$1 */
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$getToken$1$onError$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ FirebaseContainerImpl$getToken$1 f15416c;

    /* renamed from: e */
    public final /* synthetic */ C5037v f15417e;

    public FirebaseContainerImpl$getToken$1$onError$1(FirebaseContainerImpl$getToken$1 firebaseContainerImpl$getToken$1, C5037v vVar) {
        this.f15416c = firebaseContainerImpl$getToken$1;
        this.f15417e = vVar;
        super(1);
    }

    /* renamed from: a */
    public final void mo16341a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DefaultImpls.logEvent$default(this.f15416c.f15415a, Event.FCM_REGISTER_FAIL, null, 2, null);
        C5037v vVar = this.f15417e;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "emitter");
        if (!C4680c.m16088a((C4663c) ((C4915a) vVar).get())) {
            ((C4915a) this.f15417e).mo17116a(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16341a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
