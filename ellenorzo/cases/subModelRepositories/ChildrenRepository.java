package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.cases.subModels.Children;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/ChildrenRepository;", "", "fetchChildrenData", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/Children;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.ChildrenRepository */
/* compiled from: ChildrenRepository.kt */
public interface ChildrenRepository {
    /* renamed from: a */
    C5027n<Children> mo11860a(Profile profile);
}
