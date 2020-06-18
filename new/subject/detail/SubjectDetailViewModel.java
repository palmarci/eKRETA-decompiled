package hu.ekreta.ellenorzo.subject.detail;

import a.b.a.a.a;
import a.g.a.a.e.h;
import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fJ\b\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\nH&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "evaluations", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "getEvaluations", "()Landroidx/lifecycle/LiveData;", "listViewVisible", "getListViewVisible", "progressVisible", "getProgressVisible", "subjectParameters", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "getSubjectParameters", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "title", "", "getTitle", "()Ljava/lang/String;", "onRefresh", "", "onSelect", "item", "ListItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SubjectDetailViewModel.kt */
public interface SubjectDetailViewModel extends UiCommandSource, i {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "", "()V", "EvaluationItem", "SectionHeader", "TableHeader", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$EvaluationItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: SubjectDetailViewModel.kt */
    public static abstract class ListItem {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "evaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class EvaluationItem extends ListItem {

            /* renamed from: a  reason: collision with root package name */
            public final Evaluation f6189a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public EvaluationItem(Evaluation evaluation) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
                this.f6189a = evaluation;
            }

            public static /* synthetic */ EvaluationItem copy$default(EvaluationItem evaluationItem, Evaluation evaluation, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    evaluation = evaluationItem.f6189a;
                }
                return evaluationItem.a(evaluation);
            }

            public final Evaluation a() {
                return this.f6189a;
            }

            public final EvaluationItem a(Evaluation evaluation) {
                Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
                return new EvaluationItem(evaluation);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof EvaluationItem) && Intrinsics.areEqual((Object) this.f6189a, (Object) ((EvaluationItem) obj).f6189a);
                }
                return true;
            }

            public int hashCode() {
                Evaluation evaluation = this.f6189a;
                if (evaluation != null) {
                    return evaluation.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a2 = a.a("EvaluationItem(evaluation=");
                a2.append(this.f6189a);
                a2.append(")");
                return a2.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class SectionHeader extends ListItem {

            /* renamed from: a  reason: collision with root package name */
            public final String f6190a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SectionHeader(String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(str, "title");
                this.f6190a = str;
            }

            public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = sectionHeader.f6190a;
                }
                return sectionHeader.a(str);
            }

            public final SectionHeader a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                return new SectionHeader(str);
            }

            public final String a() {
                return this.f6190a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof SectionHeader) && Intrinsics.areEqual((Object) this.f6190a, (Object) ((SectionHeader) obj).f6190a);
                }
                return true;
            }

            public int hashCode() {
                String str = this.f6190a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return a.a(a.a("SectionHeader(title="), this.f6190a, ")");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "data", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "chartData", "", "Lcom/github/mikephil/charting/data/Entry;", "periodEndDateString", "", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;Ljava/util/List;Ljava/lang/String;)V", "averageVisible", "", "getAverageVisible", "()Z", "getChartData", "()Ljava/util/List;", "chartVisible", "getChartVisible", "classAverageVisible", "getClassAverageVisible", "getData", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "detailsVisible", "getDetailsVisible", "getPeriodEndDateString", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class TableHeader extends ListItem {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f6191a;
            public final boolean b;
            public final boolean c;

            /* renamed from: d  reason: collision with root package name */
            public final boolean f6192d;
            public final SubjectParameters e;
            public final List<h> f;

            /* renamed from: g  reason: collision with root package name */
            public final String f6193g;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ TableHeader(SubjectParameters subjectParameters, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(subjectParameters, list, (i2 & 4) != 0 ? null : str);
            }

            public static /* synthetic */ TableHeader copy$default(TableHeader tableHeader, SubjectParameters subjectParameters, List<h> list, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    subjectParameters = tableHeader.e;
                }
                if ((i2 & 2) != 0) {
                    list = tableHeader.f;
                }
                if ((i2 & 4) != 0) {
                    str = tableHeader.f6193g;
                }
                return tableHeader.a(subjectParameters, list, str);
            }

            public final TableHeader a(SubjectParameters subjectParameters, List<? extends h> list, String str) {
                Intrinsics.checkParameterIsNotNull(subjectParameters, "data");
                Intrinsics.checkParameterIsNotNull(list, "chartData");
                return new TableHeader(subjectParameters, list, str);
            }

            public final boolean a() {
                return this.c;
            }

            public final List<h> b() {
                return this.f;
            }

            public final boolean c() {
                return this.b;
            }

            public final boolean d() {
                return this.f6192d;
            }

            public final SubjectParameters e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TableHeader)) {
                    return false;
                }
                TableHeader tableHeader = (TableHeader) obj;
                return Intrinsics.areEqual((Object) this.e, (Object) tableHeader.e) && Intrinsics.areEqual((Object) this.f, (Object) tableHeader.f) && Intrinsics.areEqual((Object) this.f6193g, (Object) tableHeader.f6193g);
            }

            public final boolean f() {
                return this.f6191a;
            }

            public final String g() {
                return this.f6193g;
            }

            public int hashCode() {
                SubjectParameters subjectParameters = this.e;
                int i2 = 0;
                int hashCode = (subjectParameters != null ? subjectParameters.hashCode() : 0) * 31;
                List<h> list = this.f;
                int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                String str = this.f6193g;
                if (str != null) {
                    i2 = str.hashCode();
                }
                return hashCode2 + i2;
            }

            public String toString() {
                StringBuilder a2 = a.a("TableHeader(data=");
                a2.append(this.e);
                a2.append(", chartData=");
                a2.append(this.f);
                a2.append(", periodEndDateString=");
                return a.a(a2, this.f6193g, ")");
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TableHeader(SubjectParameters subjectParameters, List<? extends h> list, String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkParameterIsNotNull(subjectParameters, "data");
                Intrinsics.checkParameterIsNotNull(list, "chartData");
                this.e = subjectParameters;
                this.f = list;
                this.f6193g = str;
                boolean z = false;
                this.f6191a = this.e.h() != Evaluation.Type.MidYear;
                this.b = this.e.h() == Evaluation.Type.MidYear && (this.f.isEmpty() ^ true);
                this.c = this.e.h() == Evaluation.Type.MidYear && this.e.d() != null && (Intrinsics.areEqual((Object) this.e.d(), (Object) "") ^ true);
                if (this.e.h() == Evaluation.Type.MidYear && this.c) {
                    z = true;
                }
                this.f6192d = z;
            }
        }

        public ListItem() {
        }

        public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    void a(ListItem listItem);

    void a(SubjectParameters subjectParameters);

    boolean d();

    void e();

    boolean f();

    LiveData<List<ListItem>> getEvaluations();

    String getTitle();
}
