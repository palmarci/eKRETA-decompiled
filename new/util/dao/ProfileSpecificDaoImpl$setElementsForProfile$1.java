package hu.ekreta.ellenorzo.util.dao;

import h.w.v;
import java.util.List;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "it", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<y, List<? extends TModel>> {
    public final /* synthetic */ ProfileSpecificDaoImpl c;
    public final /* synthetic */ List e;
    public final /* synthetic */ String f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileSpecificDaoImpl$setElementsForProfile$1(ProfileSpecificDaoImpl profileSpecificDaoImpl, List list, String str) {
        super(1);
        this.c = profileSpecificDaoImpl;
        this.e = list;
        this.f = str;
    }

    /* renamed from: a */
    public final List<TModel> invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<TModel> list = this.e;
        v.a(this.c.b(), new ProfileSpecificDaoImpl$setElementsForProfile$1$$special$$inlined$apply$lambda$1(this));
        for (TModel modelToRealmModel : list) {
            v.c(this.c.modelToRealmModel(modelToRealmModel));
        }
        return list;
    }
}
