package p289hu.ekreta.ellenorzo.main;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$getBadgeCount$2 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$getBadgeCount$2<T, R> implements C4675h<T, R> {
    public static final MainViewModelImpl$getBadgeCount$2 INSTANCE = new MainViewModelImpl$getBadgeCount$2();

    /* renamed from: a */
    public final Map<MainMenuItem, Integer> apply(Pair<Integer, Integer> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
        return MapsKt__MapsKt.mapOf(TuplesKt.m17868to(MainMenuItem.OMISSIONS, Integer.valueOf(((Number) pair.component1()).intValue())), TuplesKt.m17868to(MainMenuItem.MESSAGES, (Integer) pair.component2()));
    }
}
