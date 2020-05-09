package p289hu.ekreta.ellenorzo.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTest;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.AnnouncedTestItem;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$AnnouncedTestItem;", "announcedTests", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$toDashboardItem$4 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$toDashboardItem$4<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ HomeViewModelImpl f13364c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13365e;

    public HomeViewModelImpl$toDashboardItem$4(HomeViewModelImpl homeViewModelImpl, Profile profile) {
        this.f13364c = homeViewModelImpl;
        this.f13365e = profile;
    }

    /* renamed from: a */
    public final List<AnnouncedTestItem> apply(List<AnnouncedTest> list) {
        Intrinsics.checkParameterIsNotNull(list, "announcedTests");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AnnouncedTest announcedTest : list) {
            arrayList.add(new AnnouncedTestItem(announcedTest.mo11328m().compareTo(this.f13365e.mo14050i()) < 0, announcedTest, this.f13364c.mo12834Q1()));
        }
        return arrayList;
    }
}
