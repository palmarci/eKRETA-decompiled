package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "fetchEvaluations", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getEvaluations", "updateEvaluation", "evaluation", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationRepository.kt */
public interface EvaluationRepository extends Repository<Evaluation> {
    n<List<Evaluation>> C(Profile profile);

    n<Evaluation> a(Evaluation evaluation);

    n<List<Evaluation>> m(Profile profile);
}
