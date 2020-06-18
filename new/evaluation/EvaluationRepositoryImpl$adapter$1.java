package hu.ekreta.ellenorzo.evaluation;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.d0.a;
import k.b.h0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u0005RJ\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"hu/ekreta/ellenorzo/evaluation/EvaluationRepositoryImpl$adapter$1", "", "evaluationsObservable", "Lio/reactivex/observables/ConnectableObservable;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "kotlin.jvm.PlatformType", "profileSubject", "Lio/reactivex/subjects/PublishSubject;", "Lhu/ekreta/ellenorzo/profile/Profile;", "getEvaluations", "Lio/reactivex/Observable;", "profile", "updateEvaluation", "evaluation", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationRepositoryImpl.kt */
public final class EvaluationRepositoryImpl$adapter$1 {

    /* renamed from: a  reason: collision with root package name */
    public final b<Profile> f5591a;
    public final a<List<Evaluation>> b;
    public final /* synthetic */ EvaluationRepositoryImpl c;

    /* JADX WARNING: type inference failed for: r1v0, types: [hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$sam$io_reactivex_functions_Function$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EvaluationRepositoryImpl$adapter$1(hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl r3) {
        /*
            r2 = this;
            r2.c = r3
            r2.<init>()
            k.b.h0.b r3 = new k.b.h0.b
            r3.<init>()
            java.lang.String r0 = "PublishSubject.create<Profile>()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            r2.f5591a = r3
            k.b.h0.b<hu.ekreta.ellenorzo.profile.Profile> r3 = r2.f5591a
            kotlin.reflect.KProperty1 r0 = hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$adapter$1$evaluationsObservable$1.INSTANCE
            if (r0 == 0) goto L_0x001d
            hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$sam$io_reactivex_functions_Function$0 r1 = new hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$sam$io_reactivex_functions_Function$0
            r1.<init>(r0)
            r0 = r1
        L_0x001d:
            k.b.b0.h r0 = (k.b.b0.h) r0
            k.b.n r3 = r3.b(r0)
            hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$adapter$1$evaluationsObservable$2 r0 = new hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$adapter$1$evaluationsObservable$2
            r0.<init>(r2)
            k.b.n r3 = r3.k(r0)
            r0 = 1
            k.b.d0.a r3 = r3.b((int) r0)
            r3.l()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl$adapter$1.<init>(hu.ekreta.ellenorzo.evaluation.EvaluationRepositoryImpl):void");
    }

    public final n<List<Evaluation>> a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        this.f5591a.a(profile);
        a<List<Evaluation>> aVar = this.b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "evaluationsObservable");
        return aVar;
    }

    public final n<Evaluation> a(Evaluation evaluation) {
        Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
        return this.c.a().a(evaluation);
    }
}
