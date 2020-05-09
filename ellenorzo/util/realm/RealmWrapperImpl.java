package p289hu.ekreta.ellenorzo.util.realm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p340c.C5061c0;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/realm/RealmWrapperImpl;", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "getConfig", "()Lio/realm/RealmConfiguration;", "deleteRealm", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.realm.RealmWrapperImpl */
/* compiled from: RealmWrapperImpl.kt */
public final class RealmWrapperImpl implements RealmWrapper {

    /* renamed from: a */
    public final C5061c0 f15432a;

    public RealmWrapperImpl(C5061c0 c0Var) {
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        this.f15432a = c0Var;
    }

    /* renamed from: a */
    public boolean mo16357a() {
        return C5179y.m17794a(this.f15432a);
    }
}
