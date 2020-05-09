package p289hu.ekreta.ellenorzo.util.firebase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p054h.p055a.p067b.p104m.C1924d;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl$sam$i$com_google_android_gms_tasks_OnFailureListener$0 */
/* compiled from: FirebaseContainerImpl.kt */
public final class C4436x95918c7a implements C1924d {

    /* renamed from: a */
    public final /* synthetic */ Function1 f15418a;

    public C4436x95918c7a(Function1 function1) {
        this.f15418a = function1;
    }

    public final /* synthetic */ void onFailure(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "p0");
        Intrinsics.checkExpressionValueIsNotNull(this.f15418a.invoke(exc), "invoke(...)");
    }
}
