package hu.ekreta.ellenorzo.main;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.a0.d;
import k.b.b0.h;
import k.b.c0.b.b;
import k.b.f;
import k.b.n;
import k.b.q;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*:\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$getBadgeCount$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ MainViewModelImpl c;

    public MainViewModelImpl$getBadgeCount$1(MainViewModelImpl mainViewModelImpl) {
        this.c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final n<Pair<Integer, Integer>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<Integer> p2 = this.c.v.p(profile);
        MainViewModelImpl mainViewModelImpl = this.c;
        n<Integer> b = mainViewModelImpl.w.E(profile).b(0);
        Intrinsics.checkExpressionValueIsNotNull(b, "messageRepository.getUnr…    .onErrorReturnItem(0)");
        n<Integer> a2 = mainViewModelImpl.a(b).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "messageRepository.getUnr…dSchedulers.mainThread())");
        Intrinsics.checkParameterIsNotNull(p2, "source1");
        Intrinsics.checkParameterIsNotNull(a2, "source2");
        k.b.f0.a aVar = k.b.f0.a.f7073a;
        b.a(p2, "source1 is null");
        b.a(a2, "source2 is null");
        h a3 = k.b.c0.b.a.a(aVar);
        int i2 = f.c;
        q[] qVarArr = {p2, a2};
        b.a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            return n.j();
        }
        b.a(a3, "combiner is null");
        b.a(i2, "bufferSize");
        return d.a(new k.b.c0.e.e.f(qVarArr, (Iterable) null, a3, i2 << 1, false));
    }
}
