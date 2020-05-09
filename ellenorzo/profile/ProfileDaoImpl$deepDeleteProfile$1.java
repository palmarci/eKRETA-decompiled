package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import p289hu.ekreta.ellenorzo.codegen.DeleteProfileSpecificEntitiesGeneratorModuleKt;
import p296io.realm.RealmQuery;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "realm", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.ProfileDaoImpl$deepDeleteProfile$1 */
/* compiled from: ProfileDaoImpl.kt */
public final class ProfileDaoImpl$deepDeleteProfile$1 extends Lambda implements Function1<C5179y, Unit> {

    /* renamed from: c */
    public final /* synthetic */ String f14493c;

    public ProfileDaoImpl$deepDeleteProfile$1(String str) {
        this.f14493c = str;
        super(1);
    }

    /* renamed from: a */
    public final void mo14085a(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "realm");
        for (KClass javaClass : DeleteProfileSpecificEntitiesGeneratorModuleKt.f11879a) {
            RealmQuery a = yVar.mo17438a(JvmClassMappingKt.getJavaClass(javaClass));
            a.mo16476a("profileId", this.f14493c);
            a.mo16478a().mo17420d();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo14085a((C5179y) obj);
        return Unit.INSTANCE;
    }
}
