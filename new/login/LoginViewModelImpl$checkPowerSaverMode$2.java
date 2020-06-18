package hu.ekreta.ellenorzo.login;

import android.content.Intent;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$checkPowerSaverMode$2 extends Lambda implements Function1<Pair<? extends Integer, ? extends Intent>, Unit> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$checkPowerSaverMode$2(LoginViewModelImpl loginViewModelImpl) {
        super(1);
        this.c = loginViewModelImpl;
    }

    public final void a(Pair<Integer, ? extends Intent> pair) {
        int intValue = pair.component1().intValue();
        final Intent intent = (Intent) pair.component2();
        if (intValue == -1) {
            this.c.z.a(true);
            this.c.a((Function1<? super d, Unit>) new Function1<d, Unit>(this) {
                public final /* synthetic */ LoginViewModelImpl$checkPowerSaverMode$2 c;

                {
                    this.c = r1;
                }

                public final void a(d dVar) {
                    Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                    try {
                        dVar.startActivity(intent);
                    } catch (Exception unused) {
                        DataBindingViewModel.showAlert$default(this.c.c, R.string.power_saver_failure_message, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((d) obj);
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        this.c.z.a(false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Pair) obj);
        return Unit.INSTANCE;
    }
}
