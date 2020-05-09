package p289hu.ekreta.ellenorzo.util.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p296io.realm.RealmQuery;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "it", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl$setElementsForProfile$1 */
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<C5179y, List<? extends TModel>> {

    /* renamed from: c */
    public final /* synthetic */ ReadableByUserDaoImpl f15401c;

    /* renamed from: e */
    public final /* synthetic */ List f15402e;

    /* renamed from: f */
    public final /* synthetic */ String f15403f;

    public ReadableByUserDaoImpl$setElementsForProfile$1(ReadableByUserDaoImpl readableByUserDaoImpl, List list, String str) {
        this.f15401c = readableByUserDaoImpl;
        this.f15402e = list;
        this.f15403f = str;
        super(1);
    }

    /* renamed from: a */
    public final List<TModel> invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<TModel> list = this.f15402e;
        HashMap hashMap = new HashMap();
        if (!(list == null || list.isEmpty())) {
            List<ReadableByUserModelRealm> b = C3984v.m10274b(this.f15401c.mo16313b(), (Function1<? super RealmQuery<T>, Unit>) ReadableByUserDaoImpl$setElementsForProfile$1$1$1.INSTANCE);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
            for (ReadableByUserModelRealm readableByUserModelRealm : b) {
                String d = readableByUserModelRealm.mo11376d();
                if (d == null) {
                    Intrinsics.throwNpe();
                }
                Boolean u = readableByUserModelRealm.mo11399u();
                if (u == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add((Boolean) hashMap.put(d, u));
            }
        }
        C3984v.m10247a(this.f15401c.mo16313b(), (Function1<? super RealmQuery<T>, Unit>) new C4432x7a2417ba<Object,Unit>(this));
        for (TModel modelToRealmModel : list) {
            ReadableByUserModelRealm readableByUserModelRealm2 = (ReadableByUserModelRealm) this.f15401c.modelToRealmModel(modelToRealmModel);
            if (hashMap.containsKey(readableByUserModelRealm2.mo11376d())) {
                readableByUserModelRealm2.mo11372b((Boolean) hashMap.get(readableByUserModelRealm2.mo11376d()));
            }
            C3984v.m10309c(readableByUserModelRealm2);
        }
        return list;
    }
}
