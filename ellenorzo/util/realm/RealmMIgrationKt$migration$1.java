package p289hu.ekreta.ellenorzo.util.realm;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterRealm;
import p289hu.ekreta.ellenorzo.group.GroupRealm;
import p289hu.ekreta.ellenorzo.homework.HomeworkRealm;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRealm;
import p300k.p340c.C5071e0;
import p300k.p340c.C5082i;
import p300k.p340c.C5086j;
import p300k.p340c.C5087j0;
import p300k.p340c.C5095l0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "realm", "Lio/realm/DynamicRealm;", "kotlin.jvm.PlatformType", "oldVersion", "", "newVersion", "migrate"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.realm.RealmMIgrationKt$migration$1 */
/* compiled from: RealmMIgration.kt */
public final class RealmMIgrationKt$migration$1 implements C5071e0 {
    public static final RealmMIgrationKt$migration$1 INSTANCE = new RealmMIgrationKt$migration$1();

    /* renamed from: a */
    public final void mo16356a(C5082i iVar, long j, long j2) {
        Intrinsics.checkExpressionValueIsNotNull(iVar, "realm");
        C5095l0 l0Var = iVar.f17283m;
        String str = "this.get(TObjectSchema::class.simpleName!!)!!";
        if (j == 1) {
            String simpleName = Reflection.getOrCreateKotlinClass(GroupRealm.class).getSimpleName();
            if (simpleName == null) {
                Intrinsics.throwNpe();
            }
            C5087j0 a = l0Var.mo17353a(simpleName);
            if (a == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a, str);
            a.mo17340a("educationTypeUid", String.class, new C5086j[0]);
            j++;
        }
        if (j == 2) {
            String simpleName2 = Reflection.getOrCreateKotlinClass(ClassMasterRealm.class).getSimpleName();
            if (simpleName2 == null) {
                Intrinsics.throwNpe();
            }
            C5087j0 a2 = l0Var.mo17353a(simpleName2);
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a2, str);
            String str2 = "typeCode";
            a2.mo17340a(str2, Integer.TYPE, new C5086j[0]).mo17341a(str2, true);
            j++;
        }
        if (j == 3) {
            String simpleName3 = Reflection.getOrCreateKotlinClass(NoticeBoardItemRealm.class).getSimpleName();
            if (simpleName3 == null) {
                Intrinsics.throwNpe();
            }
            C5087j0 a3 = l0Var.mo17353a(simpleName3);
            if (a3 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a3, str);
            String str3 = "readByUser";
            a3.mo17340a(str3, Boolean.TYPE, new C5086j[0]).mo17341a(str3, true);
            j++;
        }
        if (j == 4) {
            String simpleName4 = Reflection.getOrCreateKotlinClass(HomeworkRealm.class).getSimpleName();
            if (simpleName4 == null) {
                Intrinsics.throwNpe();
            }
            C5087j0 a4 = l0Var.mo17353a(simpleName4);
            if (a4 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(a4, str);
            a4.mo17340a("createDate", Date.class, new C5086j[0]);
        }
    }
}
