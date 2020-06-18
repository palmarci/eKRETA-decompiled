package hu.ekreta.ellenorzo.home;

import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem;", "it", "", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$observeLocalData$1<T, R> implements h<Object[], R> {
    public static final HomeViewModelImpl$observeLocalData$1 INSTANCE = new HomeViewModelImpl$observeLocalData$1();

    /* renamed from: a */
    public final List<ListItem.DashboardItem> apply(Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "it");
        return ExtensionsKt.a(objArr);
    }
}
