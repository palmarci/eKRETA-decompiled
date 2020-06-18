package hu.ekreta.ellenorzo.subject.detail;

import a.g.a.a.e.h;
import a.g.a.a.f.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JU\u0010\u001c\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dH\u0002J\u001a\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006+"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/TableHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getListCaptionText", "", "data", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "getPeriodEndText", "handleAverage", "", "tableHeader", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "handleChart", "oldListItem", "handleClassAverage", "handleDetail", "handleNote", "handleOnChange", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", "newValue", "initialiseChart", "old", "setAverageValue", "setAverageVisibility", "setClassAverageValue", "setClassAverageVisibility", "EvaluationValueFormatter", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TableHeaderViewHolder.kt */
public final class TableHeaderViewHolder extends MVVMViewHolder<SubjectDetailViewModel.ListItem> {
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TableHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};
    public final ReadWriteProperty w = new TableHeaderViewHolder$$special$$inlined$observable$1(new TableHeaderViewHolder$handleOnChange$1(this), (Object) null, (Object) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lhu/ekreta/ellenorzo/subject/detail/TableHeaderViewHolder$EvaluationValueFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "()V", "getPointLabel", "", "kotlin.jvm.PlatformType", "entry", "Lcom/github/mikephil/charting/data/Entry;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TableHeaderViewHolder.kt */
    public static final class EvaluationValueFormatter extends d {
        public String a(h hVar) {
            return new DecimalFormat("###,##0.00").format(hVar != null ? Float.valueOf(hVar.d()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6215a = new int[Evaluation.Type.values().length];
        public static final /* synthetic */ int[] b = new int[Evaluation.Type.values().length];

        static {
            f6215a[Evaluation.Type.EndOfYear.ordinal()] = 1;
            f6215a[Evaluation.Type.FirstQuarter.ordinal()] = 2;
            f6215a[Evaluation.Type.SecondQuarter.ordinal()] = 3;
            f6215a[Evaluation.Type.ThirdQuarter.ordinal()] = 4;
            f6215a[Evaluation.Type.FourthQuarter.ordinal()] = 5;
            f6215a[Evaluation.Type.HalfYear.ordinal()] = 6;
            b[Evaluation.Type.EndOfYear.ordinal()] = 1;
            b[Evaluation.Type.FirstQuarter.ordinal()] = 2;
            b[Evaluation.Type.SecondQuarter.ordinal()] = 3;
            b[Evaluation.Type.ThirdQuarter.ordinal()] = 4;
            b[Evaluation.Type.FourthQuarter.ordinal()] = 5;
            b[Evaluation.Type.HalfYear.ordinal()] = 6;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TableHeaderViewHolder(ViewGroup viewGroup) {
        super(R.layout.subject_detail_header, viewGroup);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Delegates delegates = Delegates.INSTANCE;
    }

    public static final /* synthetic */ void access$handleAverage(TableHeaderViewHolder tableHeaderViewHolder, SubjectDetailViewModel.ListItem.TableHeader tableHeader) {
        View view = tableHeaderViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.averageLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.averageLabel");
        textView.setText(tableHeader.e().d());
        View view2 = tableHeaderViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        Group group = (Group) view2.findViewById(R.id.groupAverage);
        Intrinsics.checkExpressionValueIsNotNull(group, "itemView.groupAverage");
        group.setVisibility(tableHeader.a() ? 0 : 8);
    }

    public static final /* synthetic */ void access$handleClassAverage(TableHeaderViewHolder tableHeaderViewHolder, SubjectDetailViewModel.ListItem.TableHeader tableHeader) {
        String str;
        View view = tableHeaderViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.classAverageLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.classAverageLabel");
        if (!tableHeader.e().n()) {
            View view2 = tableHeaderViewHolder.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            str = view2.getContext().getString(R.string.class_average_notavailable);
        } else {
            String e = tableHeader.e().e();
            if (e == null) {
                e = "";
            }
            if (e.length() > 0) {
                str = tableHeader.e().e();
            } else {
                str = "";
            }
        }
        textView.setText(str);
        if (tableHeader.d()) {
            View view3 = tableHeaderViewHolder.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(R.id.classAverageLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.classAverageLabel");
            textView2.setVisibility(0);
            View view4 = tableHeaderViewHolder.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView3 = (TextView) view4.findViewById(R.id.classAverage);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.classAverage");
            textView3.setVisibility(0);
            return;
        }
        View view5 = tableHeaderViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView4 = (TextView) view5.findViewById(R.id.classAverageLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.classAverageLabel");
        textView4.setVisibility(8);
        View view6 = tableHeaderViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        TextView textView5 = (TextView) view6.findViewById(R.id.classAverage);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.classAverage");
        textView5.setVisibility(8);
    }

    public final void a(SubjectDetailViewModel.ListItem.TableHeader tableHeader) {
        int i2;
        int i3;
        if (tableHeader.f()) {
            View view = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.detailLabel");
            String g2 = tableHeader.e().g();
            if (g2 == null) {
                g2 = "";
            }
            textView.setText(g2);
            View view2 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.teacherNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.teacherNameLabel");
            String l2 = tableHeader.e().l();
            if (l2 == null) {
                l2 = "";
            }
            textView2.setText(l2);
            View view3 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.periodEnd);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.periodEnd");
            View view4 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            Context context = view4.getContext();
            switch (WhenMappings.f6215a[tableHeader.e().h().ordinal()]) {
                case 1:
                    i2 = R.string.period_endofyear;
                    break;
                case 2:
                    i2 = R.string.period_firstquarter;
                    break;
                case 3:
                    i2 = R.string.period_secondquarter;
                    break;
                case 4:
                    i2 = R.string.period_thirdquarter;
                    break;
                case 5:
                    i2 = R.string.period_fourthquarter;
                    break;
                case 6:
                    i2 = R.string.period_halfyear;
                    break;
                default:
                    throw new IllegalStateException();
            }
            textView3.setText(context.getString(i2));
            View view5 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            TextView textView4 = (TextView) view5.findViewById(R.id.listCaption);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.listCaption");
            View view6 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            Context context2 = view6.getContext();
            switch (WhenMappings.b[tableHeader.e().h().ordinal()]) {
                case 1:
                    i3 = R.string.evaluation_endofyear;
                    break;
                case 2:
                    i3 = R.string.evaluation_firstquarter;
                    break;
                case 3:
                    i3 = R.string.evaluation_secondquarter;
                    break;
                case 4:
                    i3 = R.string.evaluation_thirdquarter;
                    break;
                case 5:
                    i3 = R.string.evaluation_fourthquarter;
                    break;
                case 6:
                    i3 = R.string.evaluation_halfyear;
                    break;
                default:
                    throw new IllegalStateException();
            }
            textView4.setText(context2.getString(i3));
            View view7 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            TextView textView5 = (TextView) view7.findViewById(R.id.periodEndLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.periodEndLabel");
            String g3 = tableHeader.g();
            if (g3 == null) {
                g3 = "";
            }
            textView5.setText(g3);
            View view8 = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            Group group = (Group) view8.findViewById(R.id.groupDetails);
            Intrinsics.checkExpressionValueIsNotNull(group, "itemView.groupDetails");
            group.setVisibility(0);
            return;
        }
        View view9 = this.c;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        Group group2 = (Group) view9.findViewById(R.id.groupDetails);
        Intrinsics.checkExpressionValueIsNotNull(group2, "itemView.groupDetails");
        group2.setVisibility(8);
    }

    /* renamed from: a */
    public void setModel(SubjectDetailViewModel.ListItem listItem) {
        this.w.setValue(this, x[0], listItem);
    }

    public final void b(SubjectDetailViewModel.ListItem.TableHeader tableHeader) {
        if (tableHeader.e().i()) {
            View view = this.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.noteLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.noteLabel");
            textView.setText(tableHeader.e().m());
            return;
        }
        View view2 = this.c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(R.id.note);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.note");
        textView2.setVisibility(8);
        View view3 = this.c;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(R.id.noteLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.noteLabel");
        textView3.setVisibility(8);
    }

    public SubjectDetailViewModel.ListItem getModel() {
        return (SubjectDetailViewModel.ListItem) this.w.getValue(this, x[0]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: a.g.a.a.h.b.e[]} */
    /* JADX WARNING: type inference failed for: r7v9, types: [a.g.a.a.e.j, a.g.a.a.e.k, a.g.a.a.e.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader r11, hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem r12) {
        /*
            r10 = this;
            boolean r0 = r11.c()
            java.lang.String r1 = "itemView.groupChart"
            java.lang.String r2 = "itemView"
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r12 instanceof hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader
            if (r0 != 0) goto L_0x000f
            r12 = 0
        L_0x000f:
            hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader r12 = (hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader) r12
            if (r12 == 0) goto L_0x001a
            java.util.List r12 = r12.b()
            if (r12 == 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
        L_0x001e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, r3)
            r0.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L_0x002d:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r12.next()
            a.g.a.a.e.h r4 = (a.g.a.a.e.h) r4
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            goto L_0x002d
        L_0x0041:
            java.util.List r12 = r11.b()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, r3)
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L_0x0052:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r12.next()
            a.g.a.a.e.h r5 = (a.g.a.a.e.h) r5
            java.lang.String r5 = r11.toString()
            r4.add(r5)
            goto L_0x0052
        L_0x0066:
            boolean r12 = r0.containsAll(r4)
            r0 = 0
            if (r12 != 0) goto L_0x01ba
            android.view.View r12 = r10.c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r2)
            android.content.Context r12 = r12.getContext()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            r6 = 2131034166(0x7f050036, float:1.7678842E38)
            java.lang.String r7 = "ctx"
            if (r4 < r5) goto L_0x0091
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r7)
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r12 = r4.getColor(r6, r12)
            goto L_0x009c
        L_0x0091:
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r7)
            android.content.res.Resources r12 = r12.getResources()
            int r12 = r12.getColor(r6)
        L_0x009c:
            android.view.View r4 = r10.c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r2)
            int r5 = hu.ekreta.ellenorzo.R.id.averageChart
            android.view.View r4 = r4.findViewById(r5)
            com.github.mikephil.charting.charts.LineChart r4 = (com.github.mikephil.charting.charts.LineChart) r4
            r5 = 1117126656(0x42960000, float:75.0)
            r6 = 1112014848(0x42480000, float:50.0)
            r4.a(r5, r6, r6, r6)
            r5 = -1
            r4.setBackgroundColor(r5)
            a.g.a.a.d.c r5 = r4.getDescription()
            java.lang.String r6 = "chart.description"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f291a = r0
            a.g.a.a.d.e r5 = r4.getLegend()
            java.lang.String r6 = "chart.legend"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f291a = r0
            r4.setTouchEnabled(r0)
            r4.setDragEnabled(r0)
            r4.setScaleEnabled(r0)
            r4.setPinchZoom(r0)
            a.g.a.a.d.h r5 = r4.getXAxis()
            r6 = 0
            r5.a((float) r6)
            java.lang.String r6 = "chart.xAxis.apply {\n    …th = 0f\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f291a = r0
            a.g.a.a.d.i r5 = r4.getAxisRight()
            java.lang.String r6 = "chart.axisRight"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f291a = r0
            a.g.a.a.d.i r5 = r4.getAxisLeft()
            r6 = 5
            r5.f289p = r6
            r5.s = r0
            r6 = 1
            r5.s = r6
            a.g.a.a.d.i$b r7 = a.g.a.a.d.i.b.OUTSIDE_CHART
            r5.R = r7
            r7 = -7829368(0xffffffffff888888, float:NaN)
            r5.f283j = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.E = r6
            r5.H = r7
            float r8 = r5.G
            float r8 = r8 - r7
            float r7 = java.lang.Math.abs(r8)
            r5.I = r7
            r7 = 1084227584(0x40a00000, float:5.0)
            r5.F = r6
            r5.G = r7
            float r8 = r5.H
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            r5.I = r7
            java.lang.String r7 = "chart.axisLeft.apply {\n …um = 5f\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)
            r5.f291a = r6
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.a((int) r5)
            a.g.a.a.h.b.e[] r5 = new a.g.a.a.h.b.e[r6]
            a.g.a.a.e.j r7 = new a.g.a.a.e.j
            java.util.List r8 = r11.b()
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r8)
            java.lang.String r9 = "AverageChart"
            r7.<init>(r8, r9)
            a.g.a.a.e.j$a r8 = a.g.a.a.e.j.a.LINEAR
            r7.H = r8
            r8 = 1067030938(0x3f99999a, float:1.2)
            float r8 = a.g.a.a.l.h.a((float) r8)
            r7.F = r8
            java.util.List<java.lang.Integer> r8 = r7.f332a
            if (r8 != 0) goto L_0x0158
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f332a = r8
        L_0x0158:
            java.util.List<java.lang.Integer> r8 = r7.f332a
            r8.clear()
            java.util.List<java.lang.Integer> r8 = r7.f332a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8.add(r9)
            java.util.List r8 = r11.b()
            int r8 = r8.size()
            r9 = 15
            if (r8 >= r9) goto L_0x0174
            r8 = 1
            goto L_0x0175
        L_0x0174:
            r8 = 0
        L_0x0175:
            r7.P = r8
            java.util.List r11 = r11.b()
            int r11 = r11.size()
            if (r11 >= r3) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r6 = 0
        L_0x0183:
            r7.f341n = r6
            r11 = 1082130432(0x40800000, float:4.0)
            float r3 = a.g.a.a.l.h.a((float) r11)
            r7.K = r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r12)
            r7.I = r12
            float r11 = a.g.a.a.l.h.a((float) r11)
            r7.L = r11
            hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$EvaluationValueFormatter r11 = new hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$EvaluationValueFormatter
            r11.<init>()
            r7.a((a.g.a.a.f.d) r11)
            r11 = 1092616192(0x41200000, float:10.0)
            float r11 = a.g.a.a.l.h.a((float) r11)
            r7.f344q = r11
            r5[r0] = r7
            a.g.a.a.e.i r11 = new a.g.a.a.e.i
            r11.<init>(r5)
            r4.setData(r11)
            r4.invalidate()
        L_0x01ba:
            android.view.View r11 = r10.c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            int r12 = hu.ekreta.ellenorzo.R.id.groupChart
            android.view.View r11 = r11.findViewById(r12)
            androidx.constraintlayout.widget.Group r11 = (androidx.constraintlayout.widget.Group) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            r11.setVisibility(r0)
            goto L_0x01e3
        L_0x01ce:
            android.view.View r11 = r10.c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            int r12 = hu.ekreta.ellenorzo.R.id.groupChart
            android.view.View r11 = r11.findViewById(r12)
            androidx.constraintlayout.widget.Group r11 = (androidx.constraintlayout.widget.Group) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            r12 = 8
            r11.setVisibility(r12)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder.a(hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader, hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem):void");
    }
}
