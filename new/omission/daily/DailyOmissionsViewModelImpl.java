package hu.ekreta.ellenorzo.omission.daily;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionViewModel;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u001bH\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00142\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00148V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011¨\u0006/"}, d2 = {"Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/omission/daily/DailyOmissionsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "emptyViewVisible", "", "getEmptyViewVisible", "()Z", "items", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "getItems", "()Landroidx/lifecycle/MutableLiveData;", "listViewVisible", "getListViewVisible", "<set-?>", "Lhu/ekreta/ellenorzo/omission/Omission;", "omissions", "getOmissions", "()Ljava/util/List;", "setOmissions", "(Ljava/util/List;)V", "omissions$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressVisible", "getProgressVisible", "getLessonStartTimeWithEndTime", "", "lessonStartTime", "Ljava/util/Calendar;", "lessonEndTime", "onSelect", "", "item", "typeNameByType", "omission", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DailyOmissionsViewModelImpl.kt */
public final class DailyOmissionsViewModelImpl extends DataBindingViewModel implements DailyOmissionsViewModel {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5969p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DailyOmissionsViewModelImpl.class), "omissions", "getOmissions()Ljava/util/List;"))};

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5970k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5971l;

    /* renamed from: m  reason: collision with root package name */
    public final r<List<OmissionViewModel>> f5972m = new r<>();

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5973n;

    /* renamed from: o  reason: collision with root package name */
    public final Context f5974o;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5975a = new int[Omission.Type.values().length];
        public static final /* synthetic */ int[] b = new int[Omission.JustificationState.values().length];

        static {
            f5975a[Omission.Type.Absence.ordinal()] = 1;
            f5975a[Omission.Type.Lateness.ordinal()] = 2;
            b[Omission.JustificationState.BeJustified.ordinal()] = 1;
            b[Omission.JustificationState.Justified.ordinal()] = 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DailyOmissionsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f5974o = context;
        Delegates delegates = Delegates.INSTANCE;
        this.f5973n = new DailyOmissionsViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
    }

    public final String a(Calendar calendar, Calendar calendar2) {
        return UtilsKt.h(calendar) + " - " + UtilsKt.h(calendar2);
    }

    public void a(List<Omission> list) {
        this.f5973n.setValue(this, f5969p[0], list);
    }

    public final String b(Omission omission) {
        int i2 = WhenMappings.f5975a[omission.w().ordinal()];
        if (i2 == 1) {
            String string = this.f5974o.getString(R.string.absence);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.absence)");
            return string;
        } else if (i2 != 2) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5974o.getString(R.string.lateness));
            String string2 = this.f5974o.getString(R.string.minute);
            Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(\n     ….minute\n                )");
            sb.append(omission.a(string2));
            return sb.toString();
        }
    }

    public boolean d() {
        return this.f5970k;
    }

    public void e() {
    }

    public boolean f() {
        return this.f5971l;
    }

    /* renamed from: a */
    public void onSelect(OmissionViewModel omissionViewModel) {
        Intrinsics.checkParameterIsNotNull(omissionViewModel, "item");
        b((Function1<? super Activity, ? extends Intent>) new DailyOmissionsViewModelImpl$onSelect$1(omissionViewModel));
    }

    public r<List<OmissionViewModel>> getItems() {
        return this.f5972m;
    }
}
