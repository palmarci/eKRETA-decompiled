package p289hu.ekreta.ellenorzo.login;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "appIntent", "Landroid/content/Intent;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.login.LoginViewModelImpl$checkPowerSaverMode$1 */
/* compiled from: LoginViewModelImpl.kt */
public final class LoginViewModelImpl$checkPowerSaverMode$1 extends Lambda implements Function1<Intent, Unit> {

    /* renamed from: c */
    public final /* synthetic */ LoginViewModelImpl f13661c;

    public LoginViewModelImpl$checkPowerSaverMode$1(LoginViewModelImpl loginViewModelImpl) {
        this.f13661c = loginViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13146a(final Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "appIntent");
        LoginViewModelImpl loginViewModelImpl = this.f13661c;
        loginViewModelImpl.mo16413a(C4998b.m16843a(loginViewModelImpl.mo16365a(Integer.valueOf(C4014R.string.attention), Integer.valueOf(C4014R.string.power_saver_message), Integer.valueOf(C4014R.string.power_saver_dialog_setting_button_text), Integer.valueOf(C4014R.string.power_saver_dialog_later_button_text)), C4998b.f17151b, (Function1<? super T, Unit>) new Function1<Integer, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ LoginViewModelImpl$checkPowerSaverMode$1 f13662c;

            {
                this.f13662c = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (i == -1) {
                    this.f13662c.f13661c.f13649z.mo16344a(true);
                    this.f13662c.f13661c.mo16376b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>(this) {

                        /* renamed from: c */
                        public final /* synthetic */ C42211 f13664c;

                        {
                            this.f13664c = r1;
                        }

                        /* renamed from: a */
                        public final Intent invoke(Activity activity) {
                            Intrinsics.checkParameterIsNotNull(activity, "$receiver");
                            return intent;
                        }
                    });
                    return;
                }
                this.f13662c.f13661c.f13649z.mo16344a(false);
            }
        }));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13146a((Intent) obj);
        return Unit.INSTANCE;
    }
}
