package hu.ekreta.ellenorzo.util.realm;

import k.c.h0;
import k.c.j0;
import k.c.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u0003\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u0006H\b\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"CURRENT_VERSION", "", "get", "Lio/realm/RealmObjectSchema;", "TObjectSchema", "Lio/realm/RealmObject;", "Lio/realm/RealmSchema;", "migration", "Lio/realm/RealmConfiguration$Builder;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: RealmMigration.kt */
public final class RealmMigrationKt {
    public static final /* synthetic */ <TObjectSchema extends h0> j0 get(l0 l0Var) {
        Intrinsics.checkParameterIsNotNull(l0Var, "$this$get");
        Intrinsics.reifiedOperationMarker(4, "TObjectSchema");
        String simpleName = Reflection.getOrCreateKotlinClass(h0.class).getSimpleName();
        if (simpleName == null) {
            Intrinsics.throwNpe();
        }
        j0 a2 = l0Var.a(simpleName);
        if (a2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "this.get(TObjectSchema::class.simpleName!!)!!");
        return a2;
    }
}
