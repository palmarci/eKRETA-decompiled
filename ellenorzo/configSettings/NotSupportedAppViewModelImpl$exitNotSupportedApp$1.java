package p289hu.ekreta.ellenorzo.configSettings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModelImpl$exitNotSupportedApp$1 */
/* compiled from: NotSupportedAppViewModelImpl.kt */
public final class NotSupportedAppViewModelImpl$exitNotSupportedApp$1 extends Lambda implements Function1<Configuration, Unit> {

    /* renamed from: c */
    public final /* synthetic */ NotSupportedAppViewModelImpl f11914c;

    public NotSupportedAppViewModelImpl$exitNotSupportedApp$1(NotSupportedAppViewModelImpl notSupportedAppViewModelImpl) {
        this.f11914c = notSupportedAppViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12324a(final Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "it");
        this.f11914c.mo16376b((Function1<? super Activity, ? extends Intent>) new Function1<Activity, Intent>() {
            /* renamed from: a */
            public final Intent invoke(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "$receiver");
                activity.finish();
                return new Intent("android.intent.action.VIEW", Uri.parse(configuration.mo12309a()));
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12324a((Configuration) obj);
        return Unit.INSTANCE;
    }
}
