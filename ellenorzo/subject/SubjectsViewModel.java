package p289hu.ekreta.ellenorzo.subject;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "Tab", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsViewModel */
/* compiled from: SubjectsViewModel.kt */
public interface SubjectsViewModel extends DataBindingListViewModel<Tab> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.SubjectsViewModel$DefaultImpls */
    /* compiled from: SubjectsViewModel.kt */
    public static final class DefaultImpls {
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsViewModel$Tab;", "", "shouldBeVisible", "Lkotlin/Function1;", "", "Lhu/ekreta/ellenorzo/evaluation/Evaluation$Type;", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getShouldBeVisible", "()Lkotlin/jvm/functions/Function1;", "Averages", "Quarterly", "HalfYear", "EndOfYear", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.SubjectsViewModel$Tab */
    /* compiled from: SubjectsViewModel.kt */
    public enum Tab {
        Averages(C43451.INSTANCE),
        Quarterly(C43462.INSTANCE),
        HalfYear(C43473.INSTANCE),
        EndOfYear(C43484.INSTANCE);
        

        /* renamed from: c */
        public final Function1<Set<? extends Type>, Boolean> f14879c;

        /* access modifiers changed from: public */
        Tab(Function1<? super Set<? extends Type>, Boolean> function1) {
            this.f14879c = function1;
        }

        /* renamed from: a */
        public final Function1<Set<? extends Type>, Boolean> mo15755a() {
            return this.f14879c;
        }
    }
}
