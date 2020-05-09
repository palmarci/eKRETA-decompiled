package p289hu.ekreta.ellenorzo.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.NoticeBoardItem;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$NoticeBoardItem;", "noticeBoardItem", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$toDashboardItem$6 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$toDashboardItem$6<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ HomeViewModelImpl f13368c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13369e;

    public HomeViewModelImpl$toDashboardItem$6(HomeViewModelImpl homeViewModelImpl, Profile profile) {
        this.f13368c = homeViewModelImpl;
        this.f13369e = profile;
    }

    /* renamed from: a */
    public final List<NoticeBoardItem> apply(List<p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "noticeBoardItem");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem noticeBoardItem : list) {
            arrayList.add(new NoticeBoardItem(this.f13369e.mo14050i().compareTo(noticeBoardItem.mo13677g()) > 0, noticeBoardItem, this.f13368c.mo12834Q1()));
        }
        return arrayList;
    }
}
