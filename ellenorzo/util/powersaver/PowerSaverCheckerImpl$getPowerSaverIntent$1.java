package p289hu.ekreta.ellenorzo.util.powersaver;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.configSettings.Configuration;
import p300k.p313b.C5023j;
import p300k.p313b.C5025l;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p324c.C4789e;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Landroid/content/Intent;", "configuration", "Lhu/ekreta/ellenorzo/configSettings/Configuration;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.powersaver.PowerSaverCheckerImpl$getPowerSaverIntent$1 */
/* compiled from: PowerSaverCheckerImpl.kt */
public final class PowerSaverCheckerImpl$getPowerSaverIntent$1<T, R> implements C4675h<T, C5025l<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ PowerSaverCheckerImpl f15428c;

    public PowerSaverCheckerImpl$getPowerSaverIntent$1(PowerSaverCheckerImpl powerSaverCheckerImpl) {
        this.f15428c = powerSaverCheckerImpl;
    }

    /* renamed from: a */
    public final C5023j<Intent> apply(Configuration configuration) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(configuration, "configuration");
        List<PowerSaverManagerAppDetails> d = configuration.mo12312d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(d, 10));
        for (PowerSaverManagerAppDetails intent : d) {
            arrayList.add(intent.toIntent());
        }
        PowerSaverCheckerImpl powerSaverCheckerImpl = this.f15428c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (powerSaverCheckerImpl.mo16345a((Intent) obj)) {
                break;
            }
        }
        C4704b.m16116a(obj, "item is null");
        return C4664d.m16037a((C5023j<T>) new C4789e<T>(obj));
    }
}
