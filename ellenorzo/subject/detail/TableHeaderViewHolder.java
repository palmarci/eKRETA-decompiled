package p289hu.ekreta.ellenorzo.subject.detail;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p037g.p038a.p039a.p044e.C0340h;
import p000a.p037g.p038a.p039a.p045f.C0351d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation.Type;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JU\u0010\u001c\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00140\u001dH\u0002J\u001a\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006+"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/TableHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getListCaptionText", "", "data", "Lhu/ekreta/ellenorzo/subject/detail/SubjectParameters;", "getPeriodEndText", "handleAverage", "", "tableHeader", "Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem$TableHeader;", "handleChart", "oldListItem", "handleClassAverage", "handleDetail", "handleNote", "handleOnChange", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", "newValue", "initialiseChart", "old", "setAverageValue", "setAverageVisibility", "setClassAverageValue", "setClassAverageVisibility", "EvaluationValueFormatter", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder */
/* compiled from: TableHeaderViewHolder.kt */
public final class TableHeaderViewHolder extends MVVMViewHolder<ListItem> {

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f15086x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TableHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/detail/SubjectDetailViewModel$ListItem;"))};

    /* renamed from: w */
    public final ReadWriteProperty f15087w = new TableHeaderViewHolder$$special$$inlined$observable$1(new TableHeaderViewHolder$handleOnChange$1(this), null, null);

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/detail/TableHeaderViewHolder$EvaluationValueFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "()V", "getPointLabel", "", "kotlin.jvm.PlatformType", "entry", "Lcom/github/mikephil/charting/data/Entry;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$EvaluationValueFormatter */
    /* compiled from: TableHeaderViewHolder.kt */
    public static final class EvaluationValueFormatter extends C0351d {
        /* renamed from: a */
        public String mo561a(C0340h hVar) {
            return new DecimalFormat("###,##0.00").format(hVar != null ? Float.valueOf(hVar.mo518d()) : null);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15088a = new int[Type.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f15089b = new int[Type.values().length];

        static {
            f15088a[Type.EndOfYear.ordinal()] = 1;
            f15088a[Type.FirstQuarter.ordinal()] = 2;
            f15088a[Type.SecondQuarter.ordinal()] = 3;
            f15088a[Type.ThirdQuarter.ordinal()] = 4;
            f15088a[Type.FourthQuarter.ordinal()] = 5;
            f15088a[Type.HalfYear.ordinal()] = 6;
            f15089b[Type.EndOfYear.ordinal()] = 1;
            f15089b[Type.FirstQuarter.ordinal()] = 2;
            f15089b[Type.SecondQuarter.ordinal()] = 3;
            f15089b[Type.ThirdQuarter.ordinal()] = 4;
            f15089b[Type.FourthQuarter.ordinal()] = 5;
            f15089b[Type.HalfYear.ordinal()] = 6;
        }
    }

    public TableHeaderViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        super(C4014R.layout.subject_detail_header, viewGroup);
        Delegates delegates = Delegates.INSTANCE;
    }

    public static final /* synthetic */ void access$handleAverage(TableHeaderViewHolder tableHeaderViewHolder, TableHeader tableHeader) {
        View view = tableHeaderViewHolder.f7113c;
        String str = "itemView";
        Intrinsics.checkExpressionValueIsNotNull(view, str);
        TextView textView = (TextView) view.findViewById(C4014R.C4016id.averageLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.averageLabel");
        textView.setText(tableHeader.mo15908e().mo15940d());
        View view2 = tableHeaderViewHolder.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view2, str);
        Group group = (Group) view2.findViewById(C4014R.C4016id.groupAverage);
        Intrinsics.checkExpressionValueIsNotNull(group, "itemView.groupAverage");
        group.setVisibility(tableHeader.mo15904a() ? 0 : 8);
    }

    public static final /* synthetic */ void access$handleClassAverage(TableHeaderViewHolder tableHeaderViewHolder, TableHeader tableHeader) {
        String str;
        View view = tableHeaderViewHolder.f7113c;
        String str2 = "itemView";
        Intrinsics.checkExpressionValueIsNotNull(view, str2);
        TextView textView = (TextView) view.findViewById(C4014R.C4016id.classAverageLabel);
        String str3 = "itemView.classAverageLabel";
        Intrinsics.checkExpressionValueIsNotNull(textView, str3);
        if (!tableHeader.mo15908e().mo15953n()) {
            View view2 = tableHeaderViewHolder.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str2);
            str = view2.getContext().getString(C4014R.string.class_average_notavailable);
        } else {
            String e = tableHeader.mo15908e().mo15942e();
            String str4 = "";
            if (e == null) {
                e = str4;
            }
            str = e.length() > 0 ? tableHeader.mo15908e().mo15942e() : str4;
        }
        textView.setText(str);
        String str5 = "itemView.classAverage";
        if (tableHeader.mo15907d()) {
            View view3 = tableHeaderViewHolder.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str2);
            TextView textView2 = (TextView) view3.findViewById(C4014R.C4016id.classAverageLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, str3);
            textView2.setVisibility(0);
            View view4 = tableHeaderViewHolder.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str2);
            TextView textView3 = (TextView) view4.findViewById(C4014R.C4016id.classAverage);
            Intrinsics.checkExpressionValueIsNotNull(textView3, str5);
            textView3.setVisibility(0);
            return;
        }
        View view5 = tableHeaderViewHolder.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view5, str2);
        TextView textView4 = (TextView) view5.findViewById(C4014R.C4016id.classAverageLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView4, str3);
        textView4.setVisibility(8);
        View view6 = tableHeaderViewHolder.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view6, str2);
        TextView textView5 = (TextView) view6.findViewById(C4014R.C4016id.classAverage);
        Intrinsics.checkExpressionValueIsNotNull(textView5, str5);
        textView5.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo15958a(TableHeader tableHeader) {
        int i;
        int i2;
        String str = "itemView.groupDetails";
        String str2 = "itemView";
        if (tableHeader.mo15910f()) {
            View view = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, str2);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.detailLabel");
            String g = tableHeader.mo15908e().mo15945g();
            String str3 = "";
            if (g == null) {
                g = str3;
            }
            textView.setText(g);
            View view2 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str2);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.teacherNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.teacherNameLabel");
            String l = tableHeader.mo15908e().mo15951l();
            if (l == null) {
                l = str3;
            }
            textView2.setText(l);
            View view3 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str2);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.periodEnd);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.periodEnd");
            View view4 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str2);
            Context context = view4.getContext();
            switch (WhenMappings.f15088a[tableHeader.mo15908e().mo15946h().ordinal()]) {
                case 1:
                    i = C4014R.string.period_endofyear;
                    break;
                case 2:
                    i = C4014R.string.period_firstquarter;
                    break;
                case 3:
                    i = C4014R.string.period_secondquarter;
                    break;
                case 4:
                    i = C4014R.string.period_thirdquarter;
                    break;
                case 5:
                    i = C4014R.string.period_fourthquarter;
                    break;
                case 6:
                    i = C4014R.string.period_halfyear;
                    break;
                default:
                    throw new IllegalStateException();
            }
            textView3.setText(context.getString(i));
            View view5 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view5, str2);
            TextView textView4 = (TextView) view5.findViewById(C4014R.C4016id.listCaption);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.listCaption");
            View view6 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view6, str2);
            Context context2 = view6.getContext();
            switch (WhenMappings.f15089b[tableHeader.mo15908e().mo15946h().ordinal()]) {
                case 1:
                    i2 = C4014R.string.evaluation_endofyear;
                    break;
                case 2:
                    i2 = C4014R.string.evaluation_firstquarter;
                    break;
                case 3:
                    i2 = C4014R.string.evaluation_secondquarter;
                    break;
                case 4:
                    i2 = C4014R.string.evaluation_thirdquarter;
                    break;
                case 5:
                    i2 = C4014R.string.evaluation_fourthquarter;
                    break;
                case 6:
                    i2 = C4014R.string.evaluation_halfyear;
                    break;
                default:
                    throw new IllegalStateException();
            }
            textView4.setText(context2.getString(i2));
            View view7 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view7, str2);
            TextView textView5 = (TextView) view7.findViewById(C4014R.C4016id.periodEndLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.periodEndLabel");
            String g2 = tableHeader.mo15911g();
            if (g2 == null) {
                g2 = str3;
            }
            textView5.setText(g2);
            View view8 = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view8, str2);
            Group group = (Group) view8.findViewById(C4014R.C4016id.groupDetails);
            Intrinsics.checkExpressionValueIsNotNull(group, str);
            group.setVisibility(0);
            return;
        }
        View view9 = this.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view9, str2);
        Group group2 = (Group) view9.findViewById(C4014R.C4016id.groupDetails);
        Intrinsics.checkExpressionValueIsNotNull(group2, str);
        group2.setVisibility(8);
    }

    /* renamed from: a */
    public void setModel(ListItem listItem) {
        this.f15087w.setValue(this, f15086x[0], listItem);
    }

    /* renamed from: b */
    public final void mo15961b(TableHeader tableHeader) {
        String str = "itemView.noteLabel";
        String str2 = "itemView";
        if (tableHeader.mo15908e().mo15948i()) {
            View view = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, str2);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.noteLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, str);
            textView.setText(tableHeader.mo15908e().mo15952m());
            return;
        }
        View view2 = this.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view2, str2);
        TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.note);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.note");
        textView2.setVisibility(8);
        View view3 = this.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view3, str2);
        TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.noteLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView3, str);
        textView3.setVisibility(8);
    }

    public ListItem getModel() {
        return (ListItem) this.f15087w.getValue(this, f15086x[0]);
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [a.g.a.a.h.b.e[]] */
    /* JADX WARNING: type inference failed for: r7v9, types: [a.g.a.a.e.j, a.g.a.a.e.k, a.g.a.a.e.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r12 != null) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v9, types: [a.g.a.a.e.j, a.g.a.a.e.k, a.g.a.a.e.d]
      assigns: [a.g.a.a.e.j]
      uses: [a.g.a.a.e.j, a.g.a.a.e.k, a.g.a.a.e.d, ?[OBJECT, ARRAY]]
      mth insns count: 158
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15959a(p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader r11, p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem r12) {
        /*
            r10 = this;
            boolean r0 = r11.mo15906c()
            java.lang.String r1 = "itemView.groupChart"
            java.lang.String r2 = "itemView"
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r12 instanceof p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader
            if (r0 != 0) goto L_0x000f
            r12 = 0
        L_0x000f:
            hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader r12 = (p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel.ListItem.TableHeader) r12
            if (r12 == 0) goto L_0x001a
            java.util.List r12 = r12.mo15905b()
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
            a.g.a.a.e.h r4 = (p000a.p037g.p038a.p039a.p044e.C0340h) r4
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            goto L_0x002d
        L_0x0041:
            java.util.List r12 = r11.mo15905b()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r12, r3)
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L_0x0052:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r12.next()
            a.g.a.a.e.h r5 = (p000a.p037g.p038a.p039a.p044e.C0340h) r5
            java.lang.String r5 = r11.toString()
            r4.add(r5)
            goto L_0x0052
        L_0x0066:
            boolean r12 = r0.containsAll(r4)
            r0 = 0
            if (r12 != 0) goto L_0x01ba
            android.view.View r12 = r10.f7113c
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
            android.view.View r4 = r10.f7113c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r2)
            int r5 = p289hu.ekreta.ellenorzo.C4014R.C4016id.averageChart
            android.view.View r4 = r4.findViewById(r5)
            com.github.mikephil.charting.charts.LineChart r4 = (com.github.mikephil.charting.charts.LineChart) r4
            r5 = 1117126656(0x42960000, float:75.0)
            r6 = 1112014848(0x42480000, float:50.0)
            r4.mo360a(r5, r6, r6, r6)
            r5 = -1
            r4.setBackgroundColor(r5)
            a.g.a.a.d.c r5 = r4.getDescription()
            java.lang.String r6 = "chart.description"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f681a = r0
            a.g.a.a.d.e r5 = r4.getLegend()
            java.lang.String r6 = "chart.legend"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f681a = r0
            r4.setTouchEnabled(r0)
            r4.setDragEnabled(r0)
            r4.setScaleEnabled(r0)
            r4.setPinchZoom(r0)
            a.g.a.a.d.h r5 = r4.getXAxis()
            r6 = 0
            r5.mo506a(r6)
            java.lang.String r6 = "chart.xAxis.apply {\n    …th = 0f\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f681a = r0
            a.g.a.a.d.i r5 = r4.getAxisRight()
            java.lang.String r6 = "chart.axisRight"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r5.f681a = r0
            a.g.a.a.d.i r5 = r4.getAxisLeft()
            r6 = 5
            r5.f670p = r6
            r5.f673s = r0
            r6 = 1
            r5.f673s = r6
            a.g.a.a.d.i$b r7 = p000a.p037g.p038a.p039a.p043d.C0329i.C0331b.OUTSIDE_CHART
            r5.f773R = r7
            r7 = -7829368(0xffffffffff888888, float:NaN)
            r5.f664j = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.f656E = r6
            r5.f659H = r7
            float r8 = r5.f658G
            float r8 = r8 - r7
            float r7 = java.lang.Math.abs(r8)
            r5.f660I = r7
            r7 = 1084227584(0x40a00000, float:5.0)
            r5.f657F = r6
            r5.f658G = r7
            float r8 = r5.f659H
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            r5.f660I = r7
            java.lang.String r7 = "chart.axisLeft.apply {\n …um = 5f\n                }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)
            r5.f681a = r6
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.mo430a(r5)
            a.g.a.a.h.b.e[] r5 = new p000a.p037g.p038a.p039a.p047h.p049b.C0366e[r6]
            a.g.a.a.e.j r7 = new a.g.a.a.e.j
            java.util.List r8 = r11.mo15905b()
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r8)
            java.lang.String r9 = "AverageChart"
            r7.<init>(r8, r9)
            a.g.a.a.e.j$a r8 = p000a.p037g.p038a.p039a.p044e.C0343j.C0344a.LINEAR
            r7.f828H = r8
            r8 = 1067030938(0x3f99999a, float:1.2)
            float r8 = p000a.p037g.p038a.p039a.p053l.C0403h.m684a(r8)
            r7.f846F = r8
            java.util.List<java.lang.Integer> r8 = r7.f788a
            if (r8 != 0) goto L_0x0158
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f788a = r8
        L_0x0158:
            java.util.List<java.lang.Integer> r8 = r7.f788a
            r8.clear()
            java.util.List<java.lang.Integer> r8 = r7.f788a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r8.add(r9)
            java.util.List r8 = r11.mo15905b()
            int r8 = r8.size()
            r9 = 15
            if (r8 >= r9) goto L_0x0174
            r8 = 1
            goto L_0x0175
        L_0x0174:
            r8 = 0
        L_0x0175:
            r7.f836P = r8
            java.util.List r11 = r11.mo15905b()
            int r11 = r11.size()
            if (r11 >= r3) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r6 = 0
        L_0x0183:
            r7.f801n = r6
            r11 = 1082130432(0x40800000, float:4.0)
            float r3 = p000a.p037g.p038a.p039a.p053l.C0403h.m684a(r11)
            r7.f831K = r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r12)
            r7.f829I = r12
            float r11 = p000a.p037g.p038a.p039a.p053l.C0403h.m684a(r11)
            r7.f832L = r11
            hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$EvaluationValueFormatter r11 = new hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder$EvaluationValueFormatter
            r11.<init>()
            r7.mo520a(r11)
            r11 = 1092616192(0x41200000, float:10.0)
            float r11 = p000a.p037g.p038a.p039a.p053l.C0403h.m684a(r11)
            r7.f804q = r11
            r5[r0] = r7
            a.g.a.a.e.i r11 = new a.g.a.a.e.i
            r11.<init>(r5)
            r4.setData(r11)
            r4.invalidate()
        L_0x01ba:
            android.view.View r11 = r10.f7113c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            int r12 = p289hu.ekreta.ellenorzo.C4014R.C4016id.groupChart
            android.view.View r11 = r11.findViewById(r12)
            androidx.constraintlayout.widget.Group r11 = (androidx.constraintlayout.widget.Group) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            r11.setVisibility(r0)
            goto L_0x01e3
        L_0x01ce:
            android.view.View r11 = r10.f7113c
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r2)
            int r12 = p289hu.ekreta.ellenorzo.C4014R.C4016id.groupChart
            android.view.View r11 = r11.findViewById(r12)
            androidx.constraintlayout.widget.Group r11 = (androidx.constraintlayout.widget.Group) r11
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r1)
            r12 = 8
            r11.setVisibility(r12)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.subject.detail.TableHeaderViewHolder.mo15959a(hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem$TableHeader, hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel$ListItem):void");
    }
}
