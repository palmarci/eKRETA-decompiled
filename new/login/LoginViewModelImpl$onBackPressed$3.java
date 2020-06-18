package hu.ekreta.ellenorzo.login;

import a.a.a.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$onBackPressed$3 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LoginViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$onBackPressed$3(LoginViewModelImpl loginViewModelImpl) {
        super(0);
        this.c = loginViewModelImpl;
    }

    public final void invoke() {
        DataBindingViewModel.showAlert$default(this.c, R.string.no_active_profile_message, (Integer) null, (Function1) null, Integer.valueOf(R.string.exit_button_text), new Function1<f, Unit>(this) {
            public final /* synthetic */ LoginViewModelImpl$onBackPressed$3 c;

            {
                this.c = r1;
            }

            public final void a(f fVar) {
                Intrinsics.checkParameterIsNotNull(fVar, "it");
                this.c.c.X1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((f) obj);
                return Unit.INSTANCE;
            }
        }, 6, (Object) null);
    }
}
