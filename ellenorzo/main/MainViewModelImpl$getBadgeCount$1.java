package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4996f;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4670c;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4685a;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4815f;
import p300k.p313b.p335f0.C4997a;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*:\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$getBadgeCount$1 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$getBadgeCount$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ MainViewModelImpl f13734c;

    public MainViewModelImpl$getBadgeCount$1(MainViewModelImpl mainViewModelImpl) {
        this.f13734c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final C5027n<Pair<Integer, Integer>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n p = this.f13734c.f13719u.mo13971p(profile);
        MainViewModelImpl mainViewModelImpl = this.f13734c;
        C5027n b = mainViewModelImpl.f13720v.mo13400E(profile).mo17222b(Integer.valueOf(0));
        Intrinsics.checkExpressionValueIsNotNull(b, "messageRepository.getUnr…    .onErrorReturnItem(0)");
        C5027n a = mainViewModelImpl.mo11505a(b).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "messageRepository.getUnr…dSchedulers.mainThread())");
        Intrinsics.checkParameterIsNotNull(p, "source1");
        Intrinsics.checkParameterIsNotNull(a, "source2");
        C4997a aVar = C4997a.f17149a;
        C4704b.m16116a(p, "source1 is null");
        C4704b.m16116a(a, "source2 is null");
        C4675h a2 = C4685a.m16110a((C4670c<? super T1, ? super T2, ? extends R>) aVar);
        int i = C4996f.f17148c;
        C5030q[] qVarArr = {p, a};
        C4704b.m16116a(qVarArr, "sources is null");
        if (qVarArr.length == 0) {
            return C5027n.m16899j();
        }
        C4704b.m16116a(a2, "combiner is null");
        C4704b.m16114a(i, "bufferSize");
        C4815f fVar = new C4815f(qVarArr, null, a2, i << 1, false);
        return C4664d.m16039a((C5027n<T>) fVar);
    }
}
