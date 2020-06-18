package hu.ekreta.ellenorzo.home;

import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.home.ListItem;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.profile.Profile;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$OmissionItem;", "omissions", "Lhu/ekreta/ellenorzo/omission/Omission;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$toDashboardItem$3<T, R> implements h<T, R> {
    public final /* synthetic */ HomeViewModelImpl c;
    public final /* synthetic */ Profile e;

    public HomeViewModelImpl$toDashboardItem$3(HomeViewModelImpl homeViewModelImpl, Profile profile) {
        this.c = homeViewModelImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final List<ListItem.DashboardItem.OmissionItem> apply(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "omissions");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Omission omission : list) {
            boolean z = omission.g().compareTo(this.e.i()) < 0;
            String string = this.c.a2().getString(R.string.minute);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.minute)");
            arrayList.add(new ListItem.DashboardItem.OmissionItem(z, omission, string, this.c.a2()));
        }
        return arrayList;
    }
}
