package hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R+\u0010(\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R+\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020,8V@VX\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00103\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0016\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R+\u00107\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b8\u0010\u0012\"\u0004\b9\u0010\u0014R+\u0010;\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0016\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010\u0014R+\u0010?\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\bB\u0010\u0016\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R+\u0010C\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\bF\u0010\u0016\u001a\u0004\bD\u0010\u0012\"\u0004\bE\u0010\u0014R+\u0010G\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0016\u001a\u0004\bH\u0010\u0012\"\u0004\bI\u0010\u0014R+\u0010K\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\bN\u0010\u0016\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R+\u0010O\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\bR\u0010\u0016\u001a\u0004\bP\u0010\u0012\"\u0004\bQ\u0010\u0014R\u0015\u0010S\u001a\u00020\u000f*\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "creatingTime", "getCreatingTime", "()Ljava/lang/String;", "setCreatingTime", "(Ljava/lang/String;)V", "creatingTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "date", "getDate", "setDate", "date$delegate", "dateFormat", "Ljava/text/SimpleDateFormat;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "evaluation", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "setEvaluation", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "evaluation$delegate", "form", "getForm", "setForm", "form$delegate", "group", "getGroup", "setGroup", "group$delegate", "", "midYear", "getMidYear", "()Z", "setMidYear", "(Z)V", "midYear$delegate", "mode", "getMode", "setMode", "mode$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "theme", "getTheme", "setTheme", "theme$delegate", "themeCaptionText", "getThemeCaptionText", "setThemeCaptionText", "themeCaptionText$delegate", "type", "getType", "setType", "type$delegate", "value", "getValue", "setValue", "value$delegate", "weight", "getWeight", "setWeight", "weight$delegate", "formatted", "Ljava/util/Calendar;", "getFormatted", "(Ljava/util/Calendar;)Ljava/lang/String;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EvaluationDetailsViewModelImpl.kt */
public final class EvaluationDetailsViewModelImpl extends DataBindingViewModel implements EvaluationDetailsViewModel {
    public static final /* synthetic */ KProperty[] z;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5570k = DataBindingViewModel.boundString$default(this, this, 70, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f5571l;

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f5572m;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5573n;

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5574o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5575p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5576q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final ReadWriteProperty x;
    public final SimpleDateFormat y;

    static {
        Class<EvaluationDetailsViewModelImpl> cls = EvaluationDetailsViewModelImpl.class;
        z = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "value", "getValue()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "theme", "getTheme()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "type", "getType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "form", "getForm()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mode", "getMode()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "weight", "getWeight()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "midYear", "getMidYear()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "themeCaptionText", "getThemeCaptionText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "evaluation", "getEvaluation()Lhu/ekreta/ellenorzo/evaluation/Evaluation;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EvaluationDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, Context context, GroupRepository groupRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.f5571l = DataBindingViewModel.boundString$default(this, this, 104, (String) null, (Function1) null, 6, (Object) null);
        this.f5572m = DataBindingViewModel.boundString$default(this, this, 51, (String) null, (Function1) null, 6, (Object) null);
        this.f5573n = DataBindingViewModel.boundString$default(this, this, 101, (String) null, (Function1) null, 6, (Object) null);
        this.f5574o = DataBindingViewModel.boundString$default(this, this, 8, (String) null, (Function1) null, 6, (Object) null);
        this.f5575p = DataBindingViewModel.boundString$default(this, this, 114, (String) null, (Function1) null, 6, (Object) null);
        this.f5576q = DataBindingViewModel.boundString$default(this, this, 75, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 83, (String) null, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundString$default(this, this, 64, (String) null, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundString$default(this, this, 48, (String) null, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundString$default(this, this, 79, (String) null, (Function1) null, 6, (Object) null);
        this.v = DataBindingViewModel.boundBoolean$default(this, this, 60, false, (Function1) null, 6, (Object) null);
        this.w = DataBindingViewModel.boundString$default(this, this, 116, (String) null, (Function1) null, 6, (Object) null);
        Delegates delegates = Delegates.INSTANCE;
        this.x = new EvaluationDetailsViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this, context, groupRepository);
        this.y = new SimpleDateFormat("yyyy.MM.dd");
    }

    public void A(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, z[7], str);
    }

    public String B1() {
        return (String) this.r.getValue(this, z[7]);
    }

    public String D0() {
        return (String) this.w.getValue(this, z[12]);
    }

    public String M1() {
        return (String) this.f5572m.getValue(this, z[2]);
    }

    public final String a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$formatted");
        String format = this.y.format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormat.format(time)");
        Intrinsics.checkExpressionValueIsNotNull(format, "this.let { dateFormat.format(time) }");
        return format;
    }

    public void a(Evaluation evaluation) {
        this.x.setValue(this, z[13], evaluation);
    }

    public void c(boolean z2) {
        this.v.setValue(this, z[11], Boolean.valueOf(z2));
    }

    public String getType() {
        return (String) this.f5574o.getValue(this, z[4]);
    }

    public String getValue() {
        return (String) this.f5571l.getValue(this, z[1]);
    }

    public String h() {
        return (String) this.s.getValue(this, z[8]);
    }

    public String j() {
        return (String) this.f5570k.getValue(this, z[0]);
    }

    public String m() {
        return (String) this.f5573n.getValue(this, z[3]);
    }

    public void o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5570k.setValue(this, z[0], str);
    }

    public boolean o1() {
        return ((Boolean) this.v.getValue(this, z[11])).booleanValue();
    }

    public String p() {
        return (String) this.u.getValue(this, z[10]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, z[9], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, z[8], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5575p.setValue(this, z[5], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.u.setValue(this, z[10], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5576q.setValue(this, z[6], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5573n.setValue(this, z[3], str);
    }

    public String v0() {
        return (String) this.f5576q.getValue(this, z[6]);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5572m.setValue(this, z[2], str);
    }

    public void x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.w.setValue(this, z[12], str);
    }

    public String y() {
        return (String) this.t.getValue(this, z[9]);
    }

    public void y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5574o.setValue(this, z[4], str);
    }

    public void z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5571l.setValue(this, z[1], str);
    }
}
