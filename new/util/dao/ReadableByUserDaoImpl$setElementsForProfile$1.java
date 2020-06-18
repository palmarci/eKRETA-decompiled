package hu.ekreta.ellenorzo.util.dao;

import h.w.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.c.y;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "it", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<y, List<? extends TModel>> {
    public final /* synthetic */ ReadableByUserDaoImpl c;
    public final /* synthetic */ List e;
    public final /* synthetic */ String f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadableByUserDaoImpl$setElementsForProfile$1(ReadableByUserDaoImpl readableByUserDaoImpl, List list, String str) {
        super(1);
        this.c = readableByUserDaoImpl;
        this.e = list;
        this.f = str;
    }

    /* renamed from: a */
    public final List<TModel> invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<TModel> list = this.e;
        HashMap hashMap = new HashMap();
        if (!(list == null || list.isEmpty())) {
            List<ReadableByUserModelRealm> b = v.b(this.c.b(), ReadableByUserDaoImpl$setElementsForProfile$1$1$1.INSTANCE);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
            for (ReadableByUserModelRealm readableByUserModelRealm : b) {
                String d2 = readableByUserModelRealm.d();
                if (d2 == null) {
                    Intrinsics.throwNpe();
                }
                Boolean u = readableByUserModelRealm.u();
                if (u == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add((Boolean) hashMap.put(d2, u));
            }
        }
        v.a(this.c.b(), new ReadableByUserDaoImpl$setElementsForProfile$1$$special$$inlined$apply$lambda$1(this));
        for (TModel modelToRealmModel : list) {
            ReadableByUserModelRealm readableByUserModelRealm2 = (ReadableByUserModelRealm) this.c.modelToRealmModel(modelToRealmModel);
            if (hashMap.containsKey(readableByUserModelRealm2.d())) {
                readableByUserModelRealm2.b((Boolean) hashMap.get(readableByUserModelRealm2.d()));
            }
            v.c(readableByUserModelRealm2);
        }
        return list;
    }
}
