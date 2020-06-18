package hu.ekreta.ellenorzo.util.powersaver;

import android.content.Intent;
import hu.ekreta.ellenorzo.configSettings.Configuration;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b.b0.h;
import k.b.j;
import k.b.l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Landroid/content/Intent;", "configuration", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: PowerSaverCheckerImpl.kt */
public final class PowerSaverCheckerImpl$getPowerSaverIntent$1<T, R> implements h<T, l<? extends R>> {
    public final /* synthetic */ PowerSaverCheckerImpl c;

    public PowerSaverCheckerImpl$getPowerSaverIntent$1(PowerSaverCheckerImpl powerSaverCheckerImpl) {
        this.c = powerSaverCheckerImpl;
    }

    /* renamed from: a */
    public final j<Intent> apply(Configuration configuration) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        List<PowerSaverManagerAppDetails> b = configuration.b();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(b, 10));
        for (PowerSaverManagerAppDetails intent : b) {
            arrayList.add(intent.toIntent());
        }
        PowerSaverCheckerImpl powerSaverCheckerImpl = this.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (powerSaverCheckerImpl.a((Intent) obj)) {
                break;
            }
        }
        return ExtensionsKt.a(obj);
    }
}
