package p289hu.ekreta.ellenorzo.settings;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR+\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148V@VX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/settings/SettingsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/settings/SettingsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "appVersionString", "", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Ljava/lang/String;Landroid/content/Context;)V", "<set-?>", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "appVersion$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "progressVisible", "getProgressVisible", "()Z", "setProgressVisible", "(Z)V", "progressVisible$delegate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.settings.SettingsViewModelImpl */
/* compiled from: SettingsViewModelImpl.kt */
public final class SettingsViewModelImpl extends DataBindingViewModel implements SettingsViewModel {

    /* renamed from: m */
    public static final /* synthetic */ KProperty[] f14785m;

    /* renamed from: j */
    public final ReadWriteProperty f14786j = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);

    /* renamed from: k */
    public final ReadWriteProperty f14787k = DataBindingViewModel.boundString$default(this, this, 2, null, null, 6, null);

    /* renamed from: l */
    public final String f14788l;

    static {
        Class<SettingsViewModelImpl> cls = SettingsViewModelImpl.class;
        f14785m = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "appVersion", "getAppVersion()Ljava/lang/String;"))};
    }

    public SettingsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, String str, Context context) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(str, "appVersionString");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14788l = str;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C4014R.string.app_name));
        sb.append(' ');
        sb.append(this.f14788l);
        mo15665r(sb.toString());
    }

    /* renamed from: d */
    public boolean mo15663d() {
        return ((Boolean) this.f14786j.getValue(this, f14785m[0])).booleanValue();
    }

    /* renamed from: n */
    public String mo15664n() {
        return (String) this.f14787k.getValue(this, f14785m[1]);
    }

    /* renamed from: r */
    public void mo15665r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14787k.setValue(this, f14785m[1], str);
    }
}
