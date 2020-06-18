package hu.ekreta.ellenorzo.main;

import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.exception.NoContentException;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "throwable", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$handleEAdministrationRelatedViewState$2<T, R> implements h<Throwable, Integer> {
    public final /* synthetic */ MainViewModelImpl c;

    public MainViewModelImpl$handleEAdministrationRelatedViewState$2(MainViewModelImpl mainViewModelImpl) {
        this.c = mainViewModelImpl;
    }

    /* renamed from: a */
    public final Integer apply(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        this.c.getViewState().setValue(MainViewState.MORE);
        this.c.r.a(MainViewState.MORE);
        if (th instanceof NoContentException) {
            return Integer.valueOf(R.string.server_is_under_maintenance);
        }
        Intrinsics.checkParameterIsNotNull(th, "$this$internalServerError");
        if ((th instanceof HttpException) && ((HttpException) th).a() == 500) {
            return Integer.valueOf(R.string.server_not_found);
        }
        return Integer.valueOf(v.a(th));
    }
}
