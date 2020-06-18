package hu.ekreta.ellenorzo.util.viewmodel;

import hu.ekreta.ellenorzo.profile.ProfileRepository;
import k.b.h0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ@\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "T", "", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "reasonSubject", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshReason;", "kotlin.jvm.PlatformType", "refresh", "", "reason", "start", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "observeLocalData", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/profile/Profile;", "updateLocalData", "Lio/reactivex/Completable;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RefreshAdapter.kt */
public final class RefreshAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<RefreshReason> f6337a;
    public final ProfileRepository b;

    public RefreshAdapter(ProfileRepository profileRepository) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        this.b = profileRepository;
        b<RefreshReason> bVar = new b<>();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "PublishSubject.create<RefreshReason>()");
        this.f6337a = bVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k.b.n<hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent<T>> a(kotlin.jvm.functions.Function1<? super hu.ekreta.ellenorzo.profile.Profile, ? extends k.b.n<T>> r4, kotlin.jvm.functions.Function1<? super hu.ekreta.ellenorzo.profile.Profile, ? extends k.b.b> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "observeLocalData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "updateLocalData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r3.b
            k.b.n r0 = r0.e()
            kotlin.reflect.KProperty1 r1 = hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$1.INSTANCE
            if (r1 == 0) goto L_0x001a
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x001a:
            k.b.b0.h r1 = (k.b.b0.h) r1
            k.b.n r0 = r0.b(r1)
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$2 r1 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$2
            r1.<init>(r4)
            k.b.n r4 = r0.k(r1)
            k.b.h0.b<hu.ekreta.ellenorzo.util.viewmodel.RefreshReason> r0 = r3.f6337a
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$3 r1 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$3
            r1.<init>(r3, r5)
            k.b.n r5 = r0.k(r1)
            k.b.n r4 = k.b.n.a(r4, r5)
            k.b.t r5 = k.b.z.a.a.a()
            k.b.n r4 = r4.a((k.b.t) r5)
            java.lang.String r5 = "Observable\n        .merg…dSchedulers.mainThread())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter.a(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):k.b.n");
    }

    public final void a(RefreshReason refreshReason) {
        Intrinsics.checkParameterIsNotNull(refreshReason, "reason");
        this.f6337a.a(refreshReason);
    }
}
