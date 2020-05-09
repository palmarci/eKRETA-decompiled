package p289hu.ekreta.ellenorzo.subject.detail;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p037g.p038a.p039a.p044e.C0340h;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fJ\b\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\nH&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "evaluations", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "getEvaluations", "()Landroidx/lifecycle/LiveData;", "listViewVisible", "getListViewVisible", "progressVisible", "getProgressVisible", "subjectParameters", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "getSubjectParameters", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "setSubjectParameters", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;)V", "title", "", "getTitle", "()Ljava/lang/String;", "onRefresh", "", "onSelect", "item", "ListItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel */
/* compiled from: SubjectDetailViewModel.kt */
public interface SubjectDetailViewModel extends UiCommandSource, C3705i {

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "", "()V", "EvaluationItem", "SectionHeader", "TableHeader", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$EvaluationItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem */
    /* compiled from: SubjectDetailViewModel.kt */
    public static abstract class ListItem {

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$EvaluationItem;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "evaluation", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$EvaluationItem */
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class EvaluationItem extends ListItem {

            /* renamed from: a */
            public final Evaluation f15020a;

            public EvaluationItem(Evaluation evaluation) {
                Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
                super(null);
                this.f15020a = evaluation;
            }

            public static /* synthetic */ EvaluationItem copy$default(EvaluationItem evaluationItem, Evaluation evaluation, int i, Object obj) {
                if ((i & 1) != 0) {
                    evaluation = evaluationItem.f15020a;
                }
                return evaluationItem.mo15894a(evaluation);
            }

            /* renamed from: a */
            public final Evaluation mo15893a() {
                return this.f15020a;
            }

            /* renamed from: a */
            public final EvaluationItem mo15894a(Evaluation evaluation) {
                Intrinsics.checkParameterIsNotNull(evaluation, "evaluation");
                return new EvaluationItem(evaluation);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15020a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem) r2).f15020a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$EvaluationItem r2 = (p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem) r2
                    hu.ekreta.ellenorzo.evaluation.Evaluation r0 = r1.f15020a
                    hu.ekreta.ellenorzo.evaluation.Evaluation r2 = r2.f15020a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.EvaluationItem.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                Evaluation evaluation = this.f15020a;
                if (evaluation != null) {
                    return evaluation.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("EvaluationItem(evaluation=");
                a.append(this.f15020a);
                a.append(")");
                return a.toString();
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$SectionHeader */
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class SectionHeader extends ListItem {

            /* renamed from: a */
            public final String f15021a;

            public SectionHeader(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                super(null);
                this.f15021a = str;
            }

            public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sectionHeader.f15021a;
                }
                return sectionHeader.mo15898a(str);
            }

            /* renamed from: a */
            public final SectionHeader mo15898a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                return new SectionHeader(str);
            }

            /* renamed from: a */
            public final String mo15899a() {
                return this.f15021a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15021a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.SectionHeader) r2).f15021a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.SectionHeader
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.SectionHeader) r2
                    java.lang.String r0 = r1.f15021a
                    java.lang.String r2 = r2.f15021a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.SectionHeader.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f15021a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f15021a, ")");
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "data", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "chartData", "", "Lcom/github/mikephil/charting/data/Entry;", "periodEndDateString", "", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;Ljava/util/List;Ljava/lang/String;)V", "averageVisible", "", "getAverageVisible", "()Z", "getChartData", "()Ljava/util/List;", "chartVisible", "getChartVisible", "classAverageVisible", "getClassAverageVisible", "getData", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "detailsVisible", "getDetailsVisible", "getPeriodEndDateString", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader */
        /* compiled from: SubjectDetailViewModel.kt */
        public static final class TableHeader extends ListItem {

            /* renamed from: a */
            public final boolean f15022a;

            /* renamed from: b */
            public final boolean f15023b;

            /* renamed from: c */
            public final boolean f15024c;

            /* renamed from: d */
            public final boolean f15025d;

            /* renamed from: e */
            public final SubjectParameters f15026e;

            /* renamed from: f */
            public final List<C0340h> f15027f;

            /* renamed from: g */
            public final String f15028g;

            public /* synthetic */ TableHeader(SubjectParameters subjectParameters, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 4) != 0) {
                    str = null;
                }
                this(subjectParameters, list, str);
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<a.g.a.a.e.h>, for r2v0, types: [java.util.List] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static /* synthetic */ p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader copy$default(p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader r0, p289hu.ekreta.ellenorzo.subject.detail.SubjectParameters r1, java.util.List<p000a.p037g.p038a.p039a.p044e.C0340h> r2, java.lang.String r3, int r4, java.lang.Object r5) {
                /*
                    r5 = r4 & 1
                    if (r5 == 0) goto L_0x0006
                    hu.ekreta.ellenorzo.subject.detail.SubjectParameters r1 = r0.f15026e
                L_0x0006:
                    r5 = r4 & 2
                    if (r5 == 0) goto L_0x000c
                    java.util.List<a.g.a.a.e.h> r2 = r0.f15027f
                L_0x000c:
                    r4 = r4 & 4
                    if (r4 == 0) goto L_0x0012
                    java.lang.String r3 = r0.f15028g
                L_0x0012:
                    hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader r0 = r0.mo15903a(r1, r2, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader.copy$default(hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader, hu.ekreta.ellenorzo.subject.detail.SubjectParameters, java.util.List, java.lang.String, int, java.lang.Object):hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader");
            }

            /* renamed from: a */
            public final TableHeader mo15903a(SubjectParameters subjectParameters, List<? extends C0340h> list, String str) {
                Intrinsics.checkParameterIsNotNull(subjectParameters, "data");
                Intrinsics.checkParameterIsNotNull(list, "chartData");
                return new TableHeader(subjectParameters, list, str);
            }

            /* renamed from: a */
            public final boolean mo15904a() {
                return this.f15024c;
            }

            /* renamed from: b */
            public final List<C0340h> mo15905b() {
                return this.f15027f;
            }

            /* renamed from: c */
            public final boolean mo15906c() {
                return this.f15023b;
            }

            /* renamed from: d */
            public final boolean mo15907d() {
                return this.f15025d;
            }

            /* renamed from: e */
            public final SubjectParameters mo15908e() {
                return this.f15026e;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f15028g, (java.lang.Object) r3.f15028g) != false) goto L_0x0029;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029
                    boolean r0 = r3 instanceof p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader
                    if (r0 == 0) goto L_0x0027
                    hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader r3 = (p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader) r3
                    hu.ekreta.ellenorzo.subject.detail.SubjectParameters r0 = r2.f15026e
                    hu.ekreta.ellenorzo.subject.detail.SubjectParameters r1 = r3.f15026e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    java.util.List<a.g.a.a.e.h> r0 = r2.f15027f
                    java.util.List<a.g.a.a.e.h> r1 = r3.f15027f
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r0 = r2.f15028g
                    java.lang.String r3 = r3.f15028g
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                    if (r3 == 0) goto L_0x0027
                    goto L_0x0029
                L_0x0027:
                    r3 = 0
                    return r3
                L_0x0029:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader.equals(java.lang.Object):boolean");
            }

            /* renamed from: f */
            public final boolean mo15910f() {
                return this.f15022a;
            }

            /* renamed from: g */
            public final String mo15911g() {
                return this.f15028g;
            }

            public int hashCode() {
                SubjectParameters subjectParameters = this.f15026e;
                int i = 0;
                int hashCode = (subjectParameters != null ? subjectParameters.hashCode() : 0) * 31;
                List<C0340h> list = this.f15027f;
                int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                String str = this.f15028g;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("TableHeader(data=");
                a.append(this.f15026e);
                a.append(", chartData=");
                a.append(this.f15027f);
                a.append(", periodEndDateString=");
                return C0082a.m106a(a, this.f15028g, ")");
            }

            public TableHeader(SubjectParameters subjectParameters, List<? extends C0340h> list, String str) {
                Intrinsics.checkParameterIsNotNull(subjectParameters, "data");
                Intrinsics.checkParameterIsNotNull(list, "chartData");
                super(null);
                this.f15026e = subjectParameters;
                this.f15027f = list;
                this.f15028g = str;
                boolean z = false;
                this.f15022a = this.f15026e.mo15946h() != Type.MidYear;
                this.f15023b = this.f15026e.mo15946h() == Type.MidYear && (this.f15027f.isEmpty() ^ true);
                this.f15024c = this.f15026e.mo15946h() == Type.MidYear && this.f15026e.mo15940d() != null && (Intrinsics.areEqual((Object) this.f15026e.mo15940d(), (Object) "") ^ true);
                if (this.f15026e.mo15946h() == Type.MidYear && this.f15024c) {
                    z = true;
                }
                this.f15025d = z;
            }
        }

        public ListItem() {
        }

        public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: a */
    void mo15886a(ListItem listItem);

    /* renamed from: a */
    void mo15887a(SubjectParameters subjectParameters);

    /* renamed from: d */
    boolean mo15888d();

    /* renamed from: e */
    void mo15889e();

    /* renamed from: f */
    boolean mo15890f();

    LiveData<List<ListItem>> getEvaluations();

    String getTitle();
}
