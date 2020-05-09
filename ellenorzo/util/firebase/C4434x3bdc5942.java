package p289hu.ekreta.ellenorzo.util.firebase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p055a.p067b.p104m.C1926e;
import p000a.p054h.p133b.p146k.C2246a;
import p000a.p054h.p133b.p146k.C2291v0;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.DefaultImpls;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p300k.p313b.C5037v;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p316c0.p317a.C4680c;
import p300k.p313b.p316c0.p321e.p327f.C4914a.C4915a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo17463d2 = {"<anonymous>", "", "it", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onSuccess", "hu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl$getToken$1$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl$getToken$1$$special$$inlined$apply$lambda$1 */
/* compiled from: FirebaseContainerImpl.kt */
public final class C4434x3bdc5942<TResult> implements C1926e<C2246a> {

    /* renamed from: a */
    public final /* synthetic */ FirebaseContainerImpl$getToken$1 f15412a;

    /* renamed from: b */
    public final /* synthetic */ C5037v f15413b;

    public C4434x3bdc5942(FirebaseContainerImpl$getToken$1 firebaseContainerImpl$getToken$1, C5037v vVar, Function1 function1) {
        this.f15412a = firebaseContainerImpl$getToken$1;
        this.f15413b = vVar;
    }

    /* renamed from: a */
    public final void onSuccess(C2246a aVar) {
        C5037v vVar = this.f15413b;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "emitter");
        if (!C4680c.m16088a((C4663c) ((C4915a) vVar).get())) {
            DefaultImpls.logEvent$default(this.f15412a.f15415a, Event.FCM_REGISTER_SUCCESS, null, 2, null);
            C5037v vVar2 = this.f15413b;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            ((C4915a) vVar2).mo17115a(((C2291v0) aVar).f5299a);
        }
    }
}
