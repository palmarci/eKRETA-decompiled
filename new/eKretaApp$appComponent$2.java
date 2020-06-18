package hu.ekreta.ellenorzo;

import hu.ekreta.ellenorzo.di.DaggerAppComponent;
import i.c.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ldagger/android/AndroidInjector;", "Lhu/ekreta/ellenorzo/eKretaApp;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: eKretaApp.kt */
public final class eKretaApp$appComponent$2 extends Lambda implements Function0<a<eKretaApp>> {
    public final /* synthetic */ eKretaApp c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eKretaApp$appComponent$2(eKretaApp ekretaapp) {
        super(0);
        this.c = ekretaapp;
    }

    public final a<eKretaApp> invoke() {
        return new DaggerAppComponent.Builder((DaggerAppComponent.AnonymousClass1) null).a(this.c);
    }
}
