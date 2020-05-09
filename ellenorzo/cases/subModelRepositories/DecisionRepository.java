package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "", "postDecision", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "decisionDetailPost", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailPost;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepository */
/* compiled from: DecisionRepository.kt */
public interface DecisionRepository {
    /* renamed from: a */
    C5027n<Boolean> mo11862a(Profile profile, DecisionDetailPost decisionDetailPost);
}
