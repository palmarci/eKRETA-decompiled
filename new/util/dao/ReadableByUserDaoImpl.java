package hu.ekreta.ellenorzo.util.dao;

import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.dao.ReadableByUserModelRealm;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import java.util.List;
import k.b.n;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\r¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDao;", "realmObjectClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "deleteElement", "Lio/reactivex/Observable;", "element", "(Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;)Lio/reactivex/Observable;", "setElementsForProfile", "", "profileId", "", "elements", "updateElement", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ReadableByUserDaoImpl.kt */
public abstract class ReadableByUserDaoImpl<TModel extends ReadableByUserModel, TRealmClass extends ReadableByUserModelRealm> extends ProfileSpecificDaoImpl<TModel, TRealmClass> implements ReadableByUserDao<TModel> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadableByUserDaoImpl(Class<TRealmClass> cls) {
        super(cls);
        Intrinsics.checkParameterIsNotNull(cls, "realmObjectClass");
    }

    public n<TModel> a(TModel tmodel) {
        Intrinsics.checkParameterIsNotNull(tmodel, "element");
        return ExtensionsKt.a((f0) b(), new ReadableByUserDaoImpl$updateElement$1(this, tmodel));
    }

    public n<TModel> b(TModel tmodel) {
        Intrinsics.checkParameterIsNotNull(tmodel, "element");
        return ExtensionsKt.a((f0) b(), new ReadableByUserDaoImpl$deleteElement$1(this, tmodel));
    }

    public n<List<TModel>> a(String str, List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "elements");
        return ExtensionsKt.a((f0) b(), new ReadableByUserDaoImpl$setElementsForProfile$1(this, list, str));
    }
}
