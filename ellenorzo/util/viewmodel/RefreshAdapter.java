package p289hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p300k.p313b.p337h0.C5018b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ@\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/RefreshAdapter;", "T", "", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "(Lhu/ekreta/ellenorzo/profile/ProfileRepository;)V", "reasonSubject", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshReason;", "kotlin.jvm.PlatformType", "refresh", "", "reason", "start", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/RefreshEvent;", "observeLocalData", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/profile/Profile;", "updateLocalData", "Lio/reactivex/Completable;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter */
/* compiled from: RefreshAdapter.kt */
public final class RefreshAdapter<T> {

    /* renamed from: a */
    public final C5018b<RefreshReason> f15472a;

    /* renamed from: b */
    public final ProfileRepository f15473b;

    public RefreshAdapter(ProfileRepository profileRepository) {
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        this.f15473b = profileRepository;
        C5018b<RefreshReason> bVar = new C5018b<>();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "PublishSubject.create<RefreshReason>()");
        this.f15472a = bVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.reflect.KProperty1, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p300k.p313b.C5027n<p289hu.ekreta.ellenorzo.util.viewmodel.RefreshEvent<T>> mo16395a(kotlin.jvm.functions.Function1<? super p289hu.ekreta.ellenorzo.profile.Profile, ? extends p300k.p313b.C5027n<T>> r4, kotlin.jvm.functions.Function1<? super p289hu.ekreta.ellenorzo.profile.Profile, ? extends p300k.p313b.C4667b> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "observeLocalData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "updateLocalData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            hu.ekreta.ellenorzo.profile.ProfileRepository r0 = r3.f15473b
            k.b.n r0 = r0.mo14198e()
            kotlin.reflect.KProperty1 r1 = p289hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$1.INSTANCE
            if (r1 == 0) goto L_0x001a
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0 r2 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$sam$io_reactivex_functions_Function$0
            r2.<init>(r1)
            r1 = r2
        L_0x001a:
            k.b.b0.h r1 = (p300k.p313b.p315b0.C4675h) r1
            k.b.n r0 = r0.mo17225b(r1)
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$2 r1 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$2
            r1.<init>(r4)
            k.b.n r4 = r0.mo17252k(r1)
            k.b.h0.b<hu.ekreta.ellenorzo.util.viewmodel.RefreshReason> r0 = r3.f15472a
            hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$3 r1 = new hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter$start$3
            r1.<init>(r3, r5)
            k.b.n r5 = r0.mo17252k(r1)
            k.b.n r4 = p300k.p313b.C5027n.m16891a(r4, r5)
            k.b.t r5 = p300k.p313b.p338z.p339a.C5041a.m16999a()
            k.b.n r4 = r4.mo17214a(r5)
            java.lang.String r5 = "Observable\n        .merg…dSchedulers.mainThread())"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.util.viewmodel.RefreshAdapter.mo16395a(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):k.b.n");
    }

    /* renamed from: a */
    public final void mo16396a(RefreshReason refreshReason) {
        Intrinsics.checkParameterIsNotNull(refreshReason, "reason");
        this.f15472a.mo17017a(refreshReason);
    }
}
