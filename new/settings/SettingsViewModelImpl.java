package hu.ekreta.ellenorzo.settings;

import android.content.Context;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00168V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/settings/SettingsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/settings/SettingsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "appVersionString", "", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Ljava/lang/String;Landroid/content/Context;)V", "<set-?>", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "appVersion$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "progressVisible", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "progressVisible$delegate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SettingsViewModelImpl.kt */
public final class SettingsViewModelImpl extends DataBindingViewModel implements SettingsViewModel {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f6107n;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f6108k = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f6109l = DataBindingViewModel.boundString$default(this, this, 2, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: m  reason: collision with root package name */
    public final String f6110m;

    static {
        Class<SettingsViewModelImpl> cls = SettingsViewModelImpl.class;
        f6107n = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "appVersion", "getAppVersion()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, String str, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(str, "appVersionString");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f6110m = str;
        q(context.getString(R.string.app_name) + ' ' + this.f6110m);
    }

    public boolean d() {
        return ((Boolean) this.f6108k.getValue(this, f6107n[0])).booleanValue();
    }

    public String n() {
        return (String) this.f6109l.getValue(this, f6107n[1]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6109l.setValue(this, f6107n[1], str);
    }
}
