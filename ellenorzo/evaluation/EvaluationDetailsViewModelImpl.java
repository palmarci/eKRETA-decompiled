package p289hu.ekreta.ellenorzo.evaluation;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R/\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R+\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R+\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020*8V@VX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0014\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0014\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R+\u00105\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0014\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010\u0012R+\u00109\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0014\u001a\u0004\b:\u0010\u0010\"\u0004\b;\u0010\u0012R+\u0010=\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0014\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R+\u0010A\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u0010\u0012R+\u0010E\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\bH\u0010\u0014\u001a\u0004\bF\u0010\u0010\"\u0004\bG\u0010\u0012R+\u0010I\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\bL\u0010\u0014\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010\u0012R+\u0010M\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\bP\u0010\u0014\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010\u0012R\u0015\u0010Q\u001a\u00020\r*\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006U"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/evaluation/EvaluationDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "creatingTime", "getCreatingTime", "()Ljava/lang/String;", "setCreatingTime", "(Ljava/lang/String;)V", "creatingTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "date", "getDate", "setDate", "date$delegate", "dateFormat", "Ljava/text/SimpleDateFormat;", "Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "evaluation", "getEvaluation", "()Lhu/ekreta/ellenorzo/evaluation/Evaluation;", "setEvaluation", "(Lhu/ekreta/ellenorzo/evaluation/Evaluation;)V", "evaluation$delegate", "form", "getForm", "setForm", "form$delegate", "group", "getGroup", "setGroup", "group$delegate", "", "midYear", "getMidYear", "()Z", "setMidYear", "(Z)V", "midYear$delegate", "mode", "getMode", "setMode", "mode$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "theme", "getTheme", "setTheme", "theme$delegate", "themeCaptionText", "getThemeCaptionText", "setThemeCaptionText", "themeCaptionText$delegate", "type", "getType", "setType", "type$delegate", "value", "getValue", "setValue", "value$delegate", "weight", "getWeight", "setWeight", "weight$delegate", "formatted", "Ljava/util/Calendar;", "getFormatted", "(Ljava/util/Calendar;)Ljava/lang/String;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModelImpl */
/* compiled from: EvaluationDetailsViewModelImpl.kt */
public final class EvaluationDetailsViewModelImpl extends DataBindingViewModel implements EvaluationDetailsViewModel {

    /* renamed from: y */
    public static final /* synthetic */ KProperty[] f13218y;

    /* renamed from: j */
    public final ReadWriteProperty f13219j = DataBindingViewModel.boundString$default(this, this, 70, null, null, 6, null);

    /* renamed from: k */
    public final ReadWriteProperty f13220k;

    /* renamed from: l */
    public final ReadWriteProperty f13221l;

    /* renamed from: m */
    public final ReadWriteProperty f13222m;

    /* renamed from: n */
    public final ReadWriteProperty f13223n;

    /* renamed from: o */
    public final ReadWriteProperty f13224o;

    /* renamed from: p */
    public final ReadWriteProperty f13225p;

    /* renamed from: q */
    public final ReadWriteProperty f13226q;

    /* renamed from: r */
    public final ReadWriteProperty f13227r;

    /* renamed from: s */
    public final ReadWriteProperty f13228s;

    /* renamed from: t */
    public final ReadWriteProperty f13229t;

    /* renamed from: u */
    public final ReadWriteProperty f13230u;

    /* renamed from: v */
    public final ReadWriteProperty f13231v;

    /* renamed from: w */
    public final ReadWriteProperty f13232w;

    /* renamed from: x */
    public final SimpleDateFormat f13233x;

    static {
        Class<EvaluationDetailsViewModelImpl> cls = EvaluationDetailsViewModelImpl.class;
        f13218y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "value", "getValue()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "theme", "getTheme()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "type", "getType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "form", "getForm()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mode", "getMode()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "weight", "getWeight()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "midYear", "getMidYear()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "themeCaptionText", "getThemeCaptionText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "evaluation", "getEvaluation()Lhu/ekreta/ellenorzo/evaluation/Evaluation;"))};
    }

    public EvaluationDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, Context context, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        super(observableImpl, executeOnceUiCommandSource);
        this.f13220k = DataBindingViewModel.boundString$default(this, this, 102, null, null, 6, null);
        this.f13221l = DataBindingViewModel.boundString$default(this, this, 50, null, null, 6, null);
        this.f13222m = DataBindingViewModel.boundString$default(this, this, 99, null, null, 6, null);
        this.f13223n = DataBindingViewModel.boundString$default(this, this, 9, null, null, 6, null);
        this.f13224o = DataBindingViewModel.boundString$default(this, this, 111, null, null, 6, null);
        this.f13225p = DataBindingViewModel.boundString$default(this, this, 75, null, null, 6, null);
        this.f13226q = DataBindingViewModel.boundString$default(this, this, 83, null, null, 6, null);
        this.f13227r = DataBindingViewModel.boundString$default(this, this, 64, null, null, 6, null);
        this.f13228s = DataBindingViewModel.boundString$default(this, this, 47, null, null, 6, null);
        this.f13229t = DataBindingViewModel.boundString$default(this, this, 79, null, null, 6, null);
        this.f13230u = DataBindingViewModel.boundBoolean$default(this, this, 60, false, null, 6, null);
        this.f13231v = DataBindingViewModel.boundString$default(this, this, 112, null, null, 6, null);
        Delegates delegates = Delegates.INSTANCE;
        EvaluationDetailsViewModelImpl$$special$$inlined$observable$1 evaluationDetailsViewModelImpl$$special$$inlined$observable$1 = new EvaluationDetailsViewModelImpl$$special$$inlined$observable$1(null, null, this, context, groupRepository);
        this.f13232w = evaluationDetailsViewModelImpl$$special$$inlined$observable$1;
        this.f13233x = new SimpleDateFormat("yyyy.MM.dd");
    }

    /* renamed from: A */
    public void mo12646A(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13220k.setValue(this, f13218y[1], str);
    }

    /* renamed from: B */
    public void mo12647B(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13226q.setValue(this, f13218y[7], str);
    }

    /* renamed from: D0 */
    public String mo12634D0() {
        return (String) this.f13231v.getValue(this, f13218y[12]);
    }

    /* renamed from: D1 */
    public String mo12635D1() {
        return (String) this.f13221l.getValue(this, f13218y[2]);
    }

    /* renamed from: a */
    public final String mo12648a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$formatted");
        String format = this.f13233x.format(calendar.getTime());
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormat.format(time)");
        Intrinsics.checkExpressionValueIsNotNull(format, "this.let { dateFormat.format(time) }");
        return format;
    }

    /* renamed from: a */
    public void mo12636a(Evaluation evaluation) {
        this.f13232w.setValue(this, f13218y[13], evaluation);
    }

    /* renamed from: b */
    public void mo12649b(boolean z) {
        this.f13230u.setValue(this, f13218y[11], Boolean.valueOf(z));
    }

    public String getType() {
        return (String) this.f13223n.getValue(this, f13218y[4]);
    }

    public String getValue() {
        return (String) this.f13220k.getValue(this, f13218y[1]);
    }

    /* renamed from: h */
    public String mo12638h() {
        return (String) this.f13227r.getValue(this, f13218y[8]);
    }

    /* renamed from: i1 */
    public boolean mo12639i1() {
        return ((Boolean) this.f13230u.getValue(this, f13218y[11])).booleanValue();
    }

    /* renamed from: j */
    public String mo12640j() {
        return (String) this.f13219j.getValue(this, f13218y[0]);
    }

    /* renamed from: m */
    public String mo12641m() {
        return (String) this.f13222m.getValue(this, f13218y[3]);
    }

    /* renamed from: p */
    public String mo12642p() {
        return (String) this.f13229t.getValue(this, f13218y[10]);
    }

    /* renamed from: p */
    public void mo12651p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13219j.setValue(this, f13218y[0], str);
    }

    /* renamed from: r */
    public void mo12652r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13228s.setValue(this, f13218y[9], str);
    }

    /* renamed from: s */
    public void mo12653s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13227r.setValue(this, f13218y[8], str);
    }

    /* renamed from: t */
    public void mo12654t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13224o.setValue(this, f13218y[5], str);
    }

    /* renamed from: t1 */
    public String mo12643t1() {
        return (String) this.f13226q.getValue(this, f13218y[7]);
    }

    /* renamed from: u */
    public void mo12655u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13229t.setValue(this, f13218y[10], str);
    }

    /* renamed from: u0 */
    public String mo12644u0() {
        return (String) this.f13225p.getValue(this, f13218y[6]);
    }

    /* renamed from: v */
    public void mo12656v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13225p.setValue(this, f13218y[6], str);
    }

    /* renamed from: w */
    public void mo12657w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13222m.setValue(this, f13218y[3], str);
    }

    /* renamed from: x */
    public void mo12658x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13221l.setValue(this, f13218y[2], str);
    }

    /* renamed from: y */
    public String mo12645y() {
        return (String) this.f13228s.getValue(this, f13218y[9]);
    }

    /* renamed from: y */
    public void mo12659y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13231v.setValue(this, f13218y[12], str);
    }

    /* renamed from: z */
    public void mo12660z(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13223n.setValue(this, f13218y[4], str);
    }
}
