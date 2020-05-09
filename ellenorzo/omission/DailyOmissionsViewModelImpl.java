package p289hu.ekreta.ellenorzo.omission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.omission.Omission.JustificationState;
import p289hu.ekreta.ellenorzo.omission.Omission.Type;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0017\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0013H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u0019H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00122\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00128V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000f¨\u00061"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/DailyOmissionsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/omission/DailyOmissionsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "<set-?>", "Lhu/ekreta/ellenorzo/omission/Omission;", "omissions", "getOmissions", "()Ljava/util/List;", "setOmissions", "(Ljava/util/List;)V", "omissions$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressVisible", "getProgressVisible", "getAppendedNumberOfLessonWithClass", "", "numberOfLessons", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "getLessonStartTimeWithEndTime", "lessonStartTime", "Ljava/util/Calendar;", "lessonEndTime", "onSelect", "", "item", "typeNameByType", "omission", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsViewModelImpl */
/* compiled from: DailyOmissionsViewModelImpl.kt */
public final class DailyOmissionsViewModelImpl extends DataBindingViewModel implements DailyOmissionsViewModel {

    /* renamed from: o */
    public static final /* synthetic */ KProperty[] f14310o = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DailyOmissionsViewModelImpl.class), "omissions", "getOmissions()Ljava/util/List;"))};

    /* renamed from: j */
    public final boolean f14311j;

    /* renamed from: k */
    public final boolean f14312k;

    /* renamed from: l */
    public final C3824r<List<OmissionViewModel>> f14313l = new C3824r<>();

    /* renamed from: m */
    public final ReadWriteProperty f14314m;

    /* renamed from: n */
    public final Context f14315n;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.DailyOmissionsViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14316a = new int[Type.values().length];

        /* renamed from: b */
        public static final /* synthetic */ int[] f14317b = new int[JustificationState.values().length];

        static {
            f14316a[Type.Absence.ordinal()] = 1;
            f14316a[Type.Lateness.ordinal()] = 2;
            f14317b[JustificationState.BeJustified.ordinal()] = 1;
            f14317b[JustificationState.Justified.ordinal()] = 2;
        }
    }

    public DailyOmissionsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14315n = context;
        Delegates delegates = Delegates.INSTANCE;
        this.f14314m = new DailyOmissionsViewModelImpl$$special$$inlined$observable$1(null, null, this);
    }

    /* renamed from: a */
    public final String mo13830a(Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append(this.f14315n.getString(C4014R.string.lesson));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo13829a(List<Omission> list) {
        this.f14314m.setValue(this, f14310o[0], list);
    }

    /* renamed from: b */
    public final String mo13833b(Omission omission) {
        int i = WhenMappings.f14316a[omission.mo13861w().ordinal()];
        if (i == 1) {
            String string = this.f14315n.getString(C4014R.string.absence);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.absence)");
            return string;
        } else if (i != 2) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14315n.getString(C4014R.string.lateness));
            String string2 = this.f14315n.getString(C4014R.string.minute);
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(\n     ….minute\n                )");
            sb.append(omission.mo13838a(string2));
            return sb.toString();
        }
    }

    /* renamed from: d */
    public boolean mo11494d() {
        return this.f14311j;
    }

    /* renamed from: e */
    public void mo11495e() {
    }

    /* renamed from: f */
    public boolean mo11496f() {
        return this.f14312k;
    }

    /* renamed from: a */
    public final String mo13831a(Calendar calendar, Calendar calendar2) {
        StringBuilder sb = new StringBuilder();
        sb.append(UtilsKt.m14844g(calendar));
        sb.append(" - ");
        sb.append(UtilsKt.m14844g(calendar2));
        return sb.toString();
    }

    public C3824r<List<OmissionViewModel>> getItems() {
        return this.f14313l;
    }

    /* renamed from: a */
    public void onSelect(OmissionViewModel omissionViewModel) {
        Intrinsics.checkParameterIsNotNull(omissionViewModel, "item");
        mo16376b((Function1<? super Activity, ? extends Intent>) new DailyOmissionsViewModelImpl$onSelect$1<Object,Object>(omissionViewModel));
    }
}
