package p289hu.ekreta.ellenorzo.profile.list;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4991d;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p321e.p322a.C4731b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/CompletableSource;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.list.ProfileListViewModelImpl$onDeleteProfile$1 */
/* compiled from: ProfileListViewModelImpl.kt */
public final class ProfileListViewModelImpl$onDeleteProfile$1<T, R> implements C4675h<Integer, C4991d> {

    /* renamed from: c */
    public final /* synthetic */ ProfileListViewModelImpl f14629c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14630e;

    public ProfileListViewModelImpl$onDeleteProfile$1(ProfileListViewModelImpl profileListViewModelImpl, Profile profile) {
        this.f14629c = profileListViewModelImpl;
        this.f14630e = profile;
    }

    /* renamed from: a */
    public final C4991d apply(Integer num) {
        Intrinsics.checkParameterIsNotNull(num, "it");
        if (num.intValue() == -1) {
            return this.f14629c.f14622q.mo14197e(this.f14630e);
        }
        return C4664d.m16035a(C4731b.f16421c);
    }
}
