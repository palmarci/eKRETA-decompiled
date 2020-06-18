package hu.ekreta.ellenorzo.main;

import k.b.b0.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$handleEAdministrationRelatedViewState$1 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainViewModelImpl f5744a;
    public final /* synthetic */ MainViewState b;

    public MainViewModelImpl$handleEAdministrationRelatedViewState$1(MainViewModelImpl mainViewModelImpl, MainViewState mainViewState) {
        this.f5744a = mainViewModelImpl;
        this.b = mainViewState;
    }

    public final void run() {
        this.f5744a.getViewState().setValue(this.b);
    }
}
