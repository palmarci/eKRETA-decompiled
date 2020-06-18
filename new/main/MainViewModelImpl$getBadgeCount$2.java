package hu.ekreta.ellenorzo.main;

import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$getBadgeCount$2<T, R> implements h<T, R> {
    public static final MainViewModelImpl$getBadgeCount$2 INSTANCE = new MainViewModelImpl$getBadgeCount$2();

    /* renamed from: a */
    public final Map<MainMenuItem, Integer> apply(Pair<Integer, Integer> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
        int intValue = pair.component1().intValue();
        Integer component2 = pair.component2();
        return MapsKt__MapsKt.mapOf(TuplesKt.to(MainMenuItem.OMISSIONS, Integer.valueOf(intValue)), TuplesKt.to(MainMenuItem.MESSAGES, component2), TuplesKt.to(MainMenuItem.MORE, component2));
    }
}
