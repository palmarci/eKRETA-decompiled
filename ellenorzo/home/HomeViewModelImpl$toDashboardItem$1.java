package p289hu.ekreta.ellenorzo.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.home.ListItem.DashboardItem.EvaluationItem;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/home/ListItem$DashboardItem$EvaluationItem;", "evaluations", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$toDashboardItem$1 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$toDashboardItem$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ HomeViewModelImpl f13358c;

    /* renamed from: e */
    public final /* synthetic */ Profile f13359e;

    public HomeViewModelImpl$toDashboardItem$1(HomeViewModelImpl homeViewModelImpl, Profile profile) {
        this.f13358c = homeViewModelImpl;
        this.f13359e = profile;
    }

    /* renamed from: a */
    public final List<EvaluationItem> apply(List<Evaluation> list) {
        Intrinsics.checkParameterIsNotNull(list, "evaluations");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Evaluation evaluation : list) {
            arrayList.add(new EvaluationItem(evaluation.mo12595f().compareTo(this.f13359e.mo14050i()) < 0, evaluation, this.f13358c.mo12834Q1()));
        }
        return arrayList;
    }
}
