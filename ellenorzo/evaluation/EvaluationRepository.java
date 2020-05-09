package p289hu.ekreta.ellenorzo.evaluation;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "fetchEvaluations", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getEvaluations", "updateEvaluation", "evaluation", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationRepository */
/* compiled from: EvaluationRepository.kt */
public interface EvaluationRepository extends Repository<Evaluation> {
    /* renamed from: C */
    C5027n<List<Evaluation>> mo12735C(Profile profile);

    /* renamed from: a */
    C5027n<Evaluation> mo12736a(Evaluation evaluation);

    /* renamed from: m */
    C5027n<List<Evaluation>> mo12737m(Profile profile);
}
