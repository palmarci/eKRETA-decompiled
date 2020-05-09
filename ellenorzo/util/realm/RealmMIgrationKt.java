package p289hu.ekreta.ellenorzo.util.realm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p300k.p340c.C5080h0;
import p300k.p340c.C5087j0;
import p300k.p340c.C5095l0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u0003\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u0006H\b\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo17463d2 = {"CURRENT_VERSION", "", "get", "Lio/realm/RealmObjectSchema;", "TObjectSchema", "Lio/realm/RealmObject;", "Lio/realm/RealmSchema;", "migration", "Lio/realm/RealmConfiguration$Builder;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.realm.RealmMIgrationKt */
/* compiled from: RealmMIgration.kt */
public final class RealmMIgrationKt {
    public static final /* synthetic */ <TObjectSchema extends C5080h0> C5087j0 get(C5095l0 l0Var) {
        Intrinsics.checkParameterIsNotNull(l0Var, "$this$get");
        Intrinsics.reifiedOperationMarker(4, "TObjectSchema");
        String simpleName = Reflection.getOrCreateKotlinClass(C5080h0.class).getSimpleName();
        if (simpleName == null) {
            Intrinsics.throwNpe();
        }
        C5087j0 a = l0Var.mo17353a(simpleName);
        if (a == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(a, "this.get(TObjectSchema::class.simpleName!!)!!");
        return a;
    }
}
