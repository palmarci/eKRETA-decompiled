package hu.ekreta.ellenorzo.util.dao;

import h.w.v;
import hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "it", "Lio/realm/Realm;", "invoke", "(Lio/realm/Realm;)Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;"}, k = 3, mv = {1, 1, 15})
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$updateElement$1 extends Lambda implements Function1<y, TModel> {
    public final /* synthetic */ ReadableByUserDaoImpl c;
    public final /* synthetic */ ReadableByUserModel e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadableByUserDaoImpl$updateElement$1(ReadableByUserDaoImpl readableByUserDaoImpl, ReadableByUserModel readableByUserModel) {
        super(1);
        this.c = readableByUserDaoImpl;
        this.e = readableByUserModel;
    }

    /* renamed from: a */
    public final TModel invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        v.a(this.c.modelToRealmModel(this.e));
        return this.e;
    }
}
