package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.codegen.DeleteProfileSpecificEntitiesGeneratorModuleKt;
import io.realm.RealmQuery;
import k.c.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "realm", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$deepDeleteProfile$1 extends Lambda implements Function1<y, Unit> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDaoImpl$deepDeleteProfile$1(String str) {
        super(1);
        this.c = str;
    }

    public final void a(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "realm");
        for (KClass javaClass : DeleteProfileSpecificEntitiesGeneratorModuleKt.f5291a) {
            RealmQuery a2 = yVar.a(JvmClassMappingKt.getJavaClass(javaClass));
            a2.a("profileId", this.c);
            a2.a().d();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((y) obj);
        return Unit.INSTANCE;
    }
}
