package hu.ekreta.ellenorzo.util.dao;

import h.w.v;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificModelRealm;
import hu.ekreta.ellenorzo.util.mapper.ProfileSpecificModel;
import java.util.List;
import k.b.n;
import k.c.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000fH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0019J*\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016R\u001e\u0010\t\u001a\n \n*\u0004\u0018\u00018\u00018\u0001X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "realmObjectClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "ENTITY", "kotlin.jvm.PlatformType", "getENTITY", "()Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "getAllElements", "Lio/reactivex/Observable;", "", "getElementsForProfile", "profileId", "", "modelToRealmModel", "model", "(Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;)Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "realmModelToModel", "realmModel", "(Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;)Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "setElementsForProfile", "elements", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ProfileSpecificDaoImpl.kt */
public abstract class ProfileSpecificDaoImpl<TModel extends ProfileSpecificModel, TRealmClass extends ProfileSpecificModelRealm> implements ProfileSpecificDao<TModel> {

    /* renamed from: a  reason: collision with root package name */
    public final TRealmClass f6307a;

    public ProfileSpecificDaoImpl(Class<TRealmClass> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "realmObjectClass");
        this.f6307a = (ProfileSpecificModelRealm) cls.newInstance();
    }

    public n<List<TModel>> a(String str, List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        Intrinsics.checkParameterIsNotNull(list, "elements");
        TRealmClass trealmclass = this.f6307a;
        Intrinsics.checkExpressionValueIsNotNull(trealmclass, "ENTITY");
        return ExtensionsKt.a((f0) trealmclass, new ProfileSpecificDaoImpl$setElementsForProfile$1(this, list, str));
    }

    public final TRealmClass b() {
        return this.f6307a;
    }

    public abstract TRealmClass modelToRealmModel(TModel tmodel);

    public abstract TModel realmModelToModel(TRealmClass trealmclass);

    public n<List<TModel>> a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        n<List<TModel>> b = v.a((f0) this.f6307a, false, (Function1) new ProfileSpecificDaoImpl$getElementsForProfile$1(str), 1).a(new ProfileSpecificDaoImpl$getElementsForProfile$2(this)).b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ENTITY.queryAsFlowable {…\n        }.toObservable()");
        return b;
    }

    public n<List<TModel>> a() {
        n<List<TModel>> b = v.a((f0) this.f6307a, false, 1).a(new ProfileSpecificDaoImpl$getAllElements$1(this)).b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ENTITY.queryAllAsFlowabl…\n        }.toObservable()");
        return b;
    }
}
