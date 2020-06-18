package hu.ekreta.ellenorzo.subject;

import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "Tab", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectsViewModel.kt */
public interface SubjectsViewModel extends DataBindingListViewModel<Tab> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: SubjectsViewModel.kt */
    public static final class DefaultImpls {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "", "shouldBeVisible", "Lkotlin/Function1;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getShouldBeVisible", "()Lkotlin/jvm/functions/Function1;", "Averages", "Quarterly", "HalfYear", "EndOfYear", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectsViewModel.kt */
    public enum Tab {
        Averages(AnonymousClass1.INSTANCE),
        Quarterly(AnonymousClass2.INSTANCE),
        HalfYear(AnonymousClass3.INSTANCE),
        EndOfYear(AnonymousClass4.INSTANCE);
        
        public final Function1<Set<? extends Evaluation.Type>, Boolean> c;

        /* access modifiers changed from: public */
        Tab(Function1<? super Set<? extends Evaluation.Type>, Boolean> function1) {
            this.c = function1;
        }

        public final Function1<Set<? extends Evaluation.Type>, Boolean> a() {
            return this.c;
        }
    }
}
