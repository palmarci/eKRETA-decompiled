package hu.ekreta.ellenorzo.util.firebase;

import a.h.a.b.m.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl$sam$i$com_google_android_gms_tasks_OnFailureListener$0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f6315a;

    public FirebaseContainerImpl$sam$i$com_google_android_gms_tasks_OnFailureListener$0(Function1 function1) {
        this.f6315a = function1;
    }

    public final /* synthetic */ void onFailure(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "p0");
        Intrinsics.checkExpressionValueIsNotNull(this.f6315a.invoke(exc), "invoke(...)");
    }
}
