package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import p300k.p313b.p315b0.C4668a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo17463d2 = {"<anonymous>", "", "run"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$handleEAdministrationRelatedViewState$1 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$handleEAdministrationRelatedViewState$1 implements C4668a {

    /* renamed from: a */
    public final /* synthetic */ MainViewModelImpl f13735a;

    /* renamed from: b */
    public final /* synthetic */ MainViewState f13736b;

    public MainViewModelImpl$handleEAdministrationRelatedViewState$1(MainViewModelImpl mainViewModelImpl, MainViewState mainViewState) {
        this.f13735a = mainViewModelImpl;
        this.f13736b = mainViewState;
    }

    public final void run() {
        this.f13735a.getViewState().setValue(this.f13736b);
    }
}
