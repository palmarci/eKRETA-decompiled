package p289hu.ekreta.ellenorzo.configSettings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/configSettings/NotSupportedAppViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "configurationProvider", "Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;)V", "getConfigurationProvider", "()Lhu/ekreta/ellenorzo/configSettings/ConfigurationProvider;", "exitNotSupportedApp", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModelImpl */
/* compiled from: NotSupportedAppViewModelImpl.kt */
public final class NotSupportedAppViewModelImpl extends DataBindingViewModel implements NotSupportedAppViewModel {

    /* renamed from: j */
    public final ConfigurationProvider f11913j;

    public NotSupportedAppViewModelImpl(ObservableImpl observableImpl, ConfigurationProvider configurationProvider, ExecuteOnceUiCommandSource executeOnceUiCommandSource) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(configurationProvider, "configurationProvider");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        super(observableImpl, executeOnceUiCommandSource);
        this.f11913j = configurationProvider;
    }

    /* renamed from: b */
    public void mo12323b() {
        mo16413a(C4998b.m16843a(this.f11913j.mo12318c(), (Function1<? super Throwable, Unit>) new NotSupportedAppViewModelImpl$exitNotSupportedApp$2<Object,Unit>(this), (Function1<? super T, Unit>) new NotSupportedAppViewModelImpl$exitNotSupportedApp$1<Object,Unit>(this)));
    }
}
