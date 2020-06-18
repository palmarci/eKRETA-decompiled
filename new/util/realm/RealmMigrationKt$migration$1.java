package hu.ekreta.ellenorzo.util.realm;

import hu.ekreta.ellenorzo.classmaster.ClassMasterRealm;
import hu.ekreta.ellenorzo.group.GroupRealm;
import hu.ekreta.ellenorzo.homework.HomeworkRealm;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm;
import java.util.Date;
import k.c.e0;
import k.c.i;
import k.c.j;
import k.c.j0;
import k.c.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "realm", "Lio/realm/DynamicRealm;", "kotlin.jvm.PlatformType", "oldVersion", "", "newVersion", "migrate"}, k = 3, mv = {1, 1, 15})
/* compiled from: RealmMigration.kt */
public final class RealmMigrationKt$migration$1 implements e0 {
    public static final RealmMigrationKt$migration$1 INSTANCE = new RealmMigrationKt$migration$1();

    public final void a(i iVar, long j2, long j3) {
        Class<HomeworkRealm> cls = HomeworkRealm.class;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "realm");
        l0 l0Var = iVar.f7141m;
        if (j2 == 1) {
            String simpleName = Reflection.getOrCreateKotlinClass(GroupRealm.class).getSimpleName();
            if (simpleName == null) {
                Intrinsics.throwNpe();
            }
            j0 a2 = l0Var.a(simpleName);
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a2, "this.get(TObjectSchema::class.simpleName!!)!!");
            a2.a("educationTypeUid", String.class, new j[0]);
            j2++;
        }
        if (j2 == 2) {
            String simpleName2 = Reflection.getOrCreateKotlinClass(ClassMasterRealm.class).getSimpleName();
            if (simpleName2 == null) {
                Intrinsics.throwNpe();
            }
            j0 a3 = l0Var.a(simpleName2);
            if (a3 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a3, "this.get(TObjectSchema::class.simpleName!!)!!");
            a3.a("typeCode", Integer.TYPE, new j[0]).a("typeCode", true);
            j2++;
        }
        if (j2 == 3) {
            String simpleName3 = Reflection.getOrCreateKotlinClass(NoticeBoardItemRealm.class).getSimpleName();
            if (simpleName3 == null) {
                Intrinsics.throwNpe();
            }
            j0 a4 = l0Var.a(simpleName3);
            if (a4 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a4, "this.get(TObjectSchema::class.simpleName!!)!!");
            a4.a("readByUser", Boolean.TYPE, new j[0]).a("readByUser", true);
            j2++;
        }
        if (j2 == 4) {
            String simpleName4 = Reflection.getOrCreateKotlinClass(cls).getSimpleName();
            if (simpleName4 == null) {
                Intrinsics.throwNpe();
            }
            j0 a5 = l0Var.a(simpleName4);
            if (a5 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a5, "this.get(TObjectSchema::class.simpleName!!)!!");
            a5.a("createDate", Date.class, new j[0]);
            j2++;
        }
        if (j2 == 5) {
            String simpleName5 = Reflection.getOrCreateKotlinClass(cls).getSimpleName();
            if (simpleName5 == null) {
                Intrinsics.throwNpe();
            }
            j0 a6 = l0Var.a(simpleName5);
            if (a6 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a6, "this.get(TObjectSchema::class.simpleName!!)!!");
            a6.a("isDone", Boolean.TYPE, new j[0]).a("isDone", true);
        }
    }
}
