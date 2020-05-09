package p289hu.ekreta.ellenorzo.util.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableString;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p001a.p002a.C0006f;
import p211h.p258l.C3705i;
import p211h.p258l.C3705i.C3706a;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p300k.p313b.C5036u;
import p300k.p313b.C5039x;
import p365o.p367b.C5621c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0001J\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0019\u0010\u001b\u001a\u00020\r2\u000e\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014H\u0001J#\u0010\u001c\u001a\u00020\r2\u001b\u0010\u001d\u001a\u0017\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e¢\u0006\u0002\b\u000fJA\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u001a2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001a2\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`#H\u0016¢\u0006\u0002\u0010$J?\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001a2\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`#H\u0016¢\u0006\u0002\u0010(JA\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010-J!\u0010.\u001a\u00020\r2\u0019\u0010/\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u0001010\u000b¢\u0006\u0002\b\u000fJ\u0018\u00102\u001a\u00020\r2\u0006\u0010/\u001a\u0002012\b\b\u0003\u00103\u001a\u00020\u001aJ\u0006\u00104\u001a\u00020\rJB\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020806*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u0002082\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJB\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020=06*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020=2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJB\u0010>\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u001a06*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020\u001a2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJB\u0010?\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020=06*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020=2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJB\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020A06*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020A2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bJH\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0006\u0012\u0004\u0018\u00010A06*\u00020\u00022\u0006\u00109\u001a\u00020\u001a2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010A2\u0018\b\u0002\u0010;\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010A\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R-\u0010\t\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e¢\u0006\u0002\b\u000f0\nX\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/RxViewModelImpl;", "Landroidx/databinding/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;)V", "uiCommand", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "getUiCommand", "()Landroidx/lifecycle/LiveData;", "addOnPropertyChangedCallback", "p0", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "kotlin.jvm.PlatformType", "finishActivity", "hideKeyboard", "notifyPropertyChanged", "fieldId", "", "removeOnPropertyChangedCallback", "setUiCommand", "command", "showAlert", "messageRes", "titleRes", "positiveButtonOnClick", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "(ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "showError", "throwable", "", "(Ljava/lang/Throwable;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "showRxDialog", "Lio/reactivex/Single;", "positiveButtonRes", "negativeButtonRes", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "startActivity", "intent", "Landroid/app/Activity;", "Landroid/content/Intent;", "startChooser", "message", "triggerRebirth", "boundBoolean", "Lkotlin/properties/ReadWriteProperty;", "", "", "id", "initialValue", "onNewValue", "boundCharSequence", "", "boundInt", "boundSpanned", "boundString", "", "boundStringOrNull", "BoundProperty", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel */
/* compiled from: DataBindingViewModel.kt */
public class DataBindingViewModel extends RxViewModelImpl implements C3705i, UiCommandSource {

    /* renamed from: h */
    public final ObservableImpl f15441h;

    /* renamed from: i */
    public final ExecuteOnceUiCommandSource f15442i;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B3\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel$BoundProperty;", "T", "Lkotlin/properties/ObservableProperty;", "initialValue", "onNewValue", "Lkotlin/Function1;", "", "id", "", "sender", "Landroidx/databinding/Observable;", "(Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ILandroidx/databinding/Observable;)V", "afterChange", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel$BoundProperty */
    /* compiled from: DataBindingViewModel.kt */
    public final class BoundProperty<T> extends ObservableProperty<T> {

        /* renamed from: c */
        public final Function1<T, Unit> f15443c;

        /* renamed from: e */
        public final int f15444e;

        /* renamed from: f */
        public final C3705i f15445f;

        /* renamed from: g */
        public final /* synthetic */ DataBindingViewModel f15446g;

        public BoundProperty(DataBindingViewModel dataBindingViewModel, T t, Function1<? super T, Unit> function1, int i, C3705i iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "sender");
            this.f15446g = dataBindingViewModel;
            super(t);
            this.f15443c = function1;
            this.f15444e = i;
            this.f15445f = iVar;
        }

        public void afterChange(KProperty<?> kProperty, T t, T t2) {
            Intrinsics.checkParameterIsNotNull(kProperty, "property");
            if (!Intrinsics.areEqual((Object) t, (Object) t2)) {
                Function1<T, Unit> function1 = this.f15443c;
                if (function1 != null) {
                    Unit unit = (Unit) function1.invoke(t2);
                }
                this.f15446g.f15441h.mo16394a(this.f15445f, this.f15444e);
            }
        }
    }

    public DataBindingViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        this.f15441h = observableImpl;
        this.f15442i = executeOnceUiCommandSource;
    }

    public static /* synthetic */ ReadWriteProperty boundBoolean$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, boolean z, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16369a(iVar, i, z, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundBoolean");
    }

    public static /* synthetic */ ReadWriteProperty boundCharSequence$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, CharSequence charSequence, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                charSequence = "";
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16367a(iVar, i, charSequence, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundCharSequence");
    }

    public static /* synthetic */ ReadWriteProperty boundInt$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, int i2, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16366a(iVar, i, i2, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundInt");
    }

    public static /* synthetic */ ReadWriteProperty boundSpanned$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, CharSequence charSequence, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                charSequence = new SpannableString("");
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16374b(iVar, i, charSequence, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundSpanned");
    }

    public static /* synthetic */ ReadWriteProperty boundString$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, String str, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16368a(iVar, i, str, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundString");
    }

    public static /* synthetic */ ReadWriteProperty boundStringOrNull$default(DataBindingViewModel dataBindingViewModel, C3705i iVar, int i, String str, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.mo16375b(iVar, i, str, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundStringOrNull");
    }

    public static /* synthetic */ void showAlert$default(DataBindingViewModel dataBindingViewModel, int i, Integer num, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            dataBindingViewModel.mo16370a(i, num, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlert");
    }

    public static /* synthetic */ void showError$default(DataBindingViewModel dataBindingViewModel, Throwable th, Integer num, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            dataBindingViewModel.mo16372a(th, num, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
    }

    public static /* synthetic */ C5036u showRxDialog$default(DataBindingViewModel dataBindingViewModel, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            if ((i & 4) != 0) {
                num3 = null;
            }
            if ((i & 8) != 0) {
                num4 = null;
            }
            return dataBindingViewModel.mo16365a(num, num2, num3, num4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRxDialog");
    }

    public static /* synthetic */ void startChooser$default(DataBindingViewModel dataBindingViewModel, Intent intent, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = C4014R.string.ClassMasterPage_Email_Client;
            }
            dataBindingViewModel.mo16371a(intent, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooser");
    }

    /* renamed from: N1 */
    public final void mo16363N1() {
        mo16373a((Function1<? super C3737d, Unit>) DataBindingViewModel$finishActivity$1.INSTANCE);
    }

    /* renamed from: O1 */
    public final void mo16364O1() {
        mo16373a((Function1<? super C3737d, Unit>) DataBindingViewModel$triggerRebirth$1.INSTANCE);
    }

    /* renamed from: a */
    public final ReadWriteProperty<Object, Boolean> mo16369a(C3705i iVar, int i, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundBoolean");
        BoundProperty boundProperty = new BoundProperty(this, Boolean.valueOf(z), function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: a */
    public void mo10510a(C3706a aVar) {
        this.f15441h.mo10510a(aVar);
    }

    /* renamed from: b */
    public final ReadWriteProperty<Object, CharSequence> mo16374b(C3705i iVar, int i, CharSequence charSequence, Function1<? super CharSequence, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundSpanned");
        Intrinsics.checkParameterIsNotNull(charSequence, "initialValue");
        BoundProperty boundProperty = new BoundProperty(this, charSequence, function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: b */
    public void mo10511b(C3706a aVar) {
        this.f15441h.mo10511b(aVar);
    }

    public LiveData<Function1<C3737d, Unit>> getUiCommand() {
        return this.f15442i.getUiCommand();
    }

    /* renamed from: s */
    public final void mo16378s() {
        mo16373a((Function1<? super C3737d, Unit>) DataBindingViewModel$hideKeyboard$1.INSTANCE);
    }

    /* renamed from: a */
    public final ReadWriteProperty<Object, String> mo16368a(C3705i iVar, int i, String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundString");
        Intrinsics.checkParameterIsNotNull(str, "initialValue");
        BoundProperty boundProperty = new BoundProperty(this, str, function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: b */
    public final ReadWriteProperty<Object, String> mo16375b(C3705i iVar, int i, String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundStringOrNull");
        BoundProperty boundProperty = new BoundProperty(this, str, function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: a */
    public final ReadWriteProperty<Object, Integer> mo16366a(C3705i iVar, int i, int i2, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundInt");
        BoundProperty boundProperty = new BoundProperty(this, Integer.valueOf(i2), function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: b */
    public final void mo16376b(Function1<? super Activity, ? extends Intent> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "intent");
        mo16373a((Function1<? super C3737d, Unit>) new DataBindingViewModel$startActivity$1<Object,Unit>(function1));
    }

    /* renamed from: a */
    public final ReadWriteProperty<Object, CharSequence> mo16367a(C3705i iVar, int i, CharSequence charSequence, Function1<? super CharSequence, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundCharSequence");
        Intrinsics.checkParameterIsNotNull(charSequence, "initialValue");
        BoundProperty boundProperty = new BoundProperty(this, charSequence, function1, i, iVar);
        return boundProperty;
    }

    /* renamed from: a */
    public final void mo16373a(Function1<? super C3737d, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "command");
        this.f15442i.getUiCommand().setValue(function1);
    }

    /* renamed from: a */
    public void mo16372a(Throwable th, Integer num, Function1<? super C0006f, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        C5621c.m18584a(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName()).mo118d("Unexpected error", th);
        mo16373a((Function1<? super C3737d, Unit>) new DataBindingViewModel$showError$1<Object,Unit>(th, num, function1));
    }

    /* renamed from: a */
    public void mo16370a(int i, Integer num, Function1<? super C0006f, Unit> function1) {
        mo16373a((Function1<? super C3737d, Unit>) new DataBindingViewModel$showAlert$1<Object,Unit>(i, num, function1));
    }

    /* renamed from: a */
    public final void mo16371a(Intent intent, int i) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        try {
            mo16376b((Function1<? super Activity, ? extends Intent>) new DataBindingViewModel$startChooser$1<Object,Object>(intent, i));
        } catch (Exception e) {
            showError$default(this, e, null, null, 6, null);
        }
    }

    /* renamed from: a */
    public final C5036u<Integer> mo16365a(Integer num, Integer num2, Integer num3, Integer num4) {
        DataBindingViewModel$showRxDialog$1 dataBindingViewModel$showRxDialog$1 = new DataBindingViewModel$showRxDialog$1(this, num3, num4, num2, num);
        C5036u<Integer> a = C5036u.m16977a((C5039x<T>) dataBindingViewModel$showRxDialog$1);
        Intrinsics.checkExpressionValueIsNotNull(a, "Single.create { emitter …  .show()\n        }\n    }");
        return a;
    }
}
