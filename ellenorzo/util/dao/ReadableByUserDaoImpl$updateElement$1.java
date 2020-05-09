package p289hu.ekreta.ellenorzo.util.dao;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.util.mapper.ReadableByUserModel;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo17463d2 = {"<anonymous>", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserModelRealm;", "it", "Lio/realm/Realm;", "invoke", "(Lio/realm/Realm;)Lhu/ekreta/ellenorzo/util/mapper/ReadableByUserModel;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl$updateElement$1 */
/* compiled from: ReadableByUserDaoImpl.kt */
public final class ReadableByUserDaoImpl$updateElement$1 extends Lambda implements Function1<C5179y, TModel> {

    /* renamed from: c */
    public final /* synthetic */ ReadableByUserDaoImpl f15404c;

    /* renamed from: e */
    public final /* synthetic */ ReadableByUserModel f15405e;

    public ReadableByUserDaoImpl$updateElement$1(ReadableByUserDaoImpl readableByUserDaoImpl, ReadableByUserModel readableByUserModel) {
        this.f15404c = readableByUserDaoImpl;
        this.f15405e = readableByUserModel;
        super(1);
    }

    /* renamed from: a */
    public final TModel invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        C3984v.m10246a(this.f15404c.modelToRealmModel(this.f15405e));
        return this.f15405e;
    }
}
