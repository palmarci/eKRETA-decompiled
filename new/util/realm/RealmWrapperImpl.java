package hu.ekreta.ellenorzo.util.realm;

import k.c.c0;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/util/realm/RealmWrapperImpl;", "Lhu/ekreta/ellenorzo/util/realm/RealmWrapper;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "getConfig", "()Lio/realm/RealmConfiguration;", "deleteRealm", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RealmWrapperImpl.kt */
public final class RealmWrapperImpl implements RealmWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f6321a;

    public RealmWrapperImpl(c0 c0Var) {
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        this.f6321a = c0Var;
    }

    public boolean a() {
        return y.a(this.f6321a);
    }
}
