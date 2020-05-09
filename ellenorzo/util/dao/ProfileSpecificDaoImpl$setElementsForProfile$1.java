package p289hu.ekreta.ellenorzo.util.dao;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p296io.realm.RealmQuery;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "TModel", "Lhu/ekreta/ellenorzo/util/mapper/ProfileSpecificModel;", "TRealmClass", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificModelRealm;", "it", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl$setElementsForProfile$1 */
/* compiled from: ProfileSpecificDaoImpl.kt */
public final class ProfileSpecificDaoImpl$setElementsForProfile$1 extends Lambda implements Function1<C5179y, List<? extends TModel>> {

    /* renamed from: c */
    public final /* synthetic */ ProfileSpecificDaoImpl f15394c;

    /* renamed from: e */
    public final /* synthetic */ List f15395e;

    /* renamed from: f */
    public final /* synthetic */ String f15396f;

    public ProfileSpecificDaoImpl$setElementsForProfile$1(ProfileSpecificDaoImpl profileSpecificDaoImpl, List list, String str) {
        this.f15394c = profileSpecificDaoImpl;
        this.f15395e = list;
        this.f15396f = str;
        super(1);
    }

    /* renamed from: a */
    public final List<TModel> invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        List<TModel> list = this.f15395e;
        C3984v.m10247a(this.f15394c.mo16313b(), (Function1<? super RealmQuery<T>, Unit>) new C4431xe18984a3<Object,Unit>(this));
        for (TModel modelToRealmModel : list) {
            C3984v.m10309c(this.f15394c.modelToRealmModel(modelToRealmModel));
        }
        return list;
    }
}
