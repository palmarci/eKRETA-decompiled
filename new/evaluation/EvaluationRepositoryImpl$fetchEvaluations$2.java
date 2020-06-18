package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl$fetchEvaluations$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ EvaluationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public EvaluationRepositoryImpl$fetchEvaluations$2(EvaluationRepositoryImpl evaluationRepositoryImpl, Profile profile) {
        this.c = evaluationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<Evaluation>> apply(List<Evaluation> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return this.c.a().a(this.e.m(), list);
    }
}
