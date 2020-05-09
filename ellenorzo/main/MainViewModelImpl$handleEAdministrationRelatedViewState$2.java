package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.exception.NoContentException;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "throwable", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Integer;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$handleEAdministrationRelatedViewState$2 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$handleEAdministrationRelatedViewState$2<T, R> implements C4675h<Throwable, Integer> {

    /* renamed from: c */
    public final /* synthetic */ MainViewModelImpl f13737c;

    public MainViewModelImpl$handleEAdministrationRelatedViewState$2(MainViewModelImpl mainViewModelImpl) {
        this.f13737c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final Integer apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        this.f13737c.getViewState().setValue(MainViewState.MORE);
        this.f13737c.f13715q.mo17017a(MainViewState.MORE);
        if (th instanceof NoContentException) {
            return Integer.valueOf(C4014R.string.server_is_under_maintenance);
        }
        return Integer.valueOf(C4014R.string.server_not_found);
    }
}
