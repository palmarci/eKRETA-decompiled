package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$changeProfile$2 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$changeProfile$2<T, R> implements C4675h<Profile, C4991d> {

    /* renamed from: c */
    public final /* synthetic */ MainViewModelImpl f13732c;

    public MainViewModelImpl$changeProfile$2(MainViewModelImpl mainViewModelImpl) {
        this.f13732c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final C4667b apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, "it");
        return this.f13732c.f13718t.mo14194d(profile);
    }
}
