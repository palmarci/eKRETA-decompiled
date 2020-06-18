package hu.ekreta.ellenorzo.util.viewmodel;

import a.a.a.f;
import android.app.Activity;
import android.content.Intent;
import android.text.SpannableString;
import androidx.lifecycle.LiveData;
import h.l.i;
import h.m.d.d;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import k.b.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import o.b.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0019\u0010\u001e\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0001J#\u0010\u001f\u001a\u00020\u000f2\u001b\u0010 \u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010¢\u0006\u0002\b\u0011Jk\u0010!\u001a\u00020\u000f2\b\b\u0001\u0010\"\u001a\u00020\u001d2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001d2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`&2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001d2\u001c\b\u0002\u0010(\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`&H\u0016¢\u0006\u0002\u0010)J?\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001d2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`&H\u0016¢\u0006\u0002\u0010-JA\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0/2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u00101J\u001c\u00102\u001a\u00020\u000f2\b\b\u0001\u00103\u001a\u00020\u001d2\b\b\u0003\u00104\u001a\u00020\u001dH\u0016J!\u00105\u001a\u00020\u000f2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0006\u0012\u0004\u0018\u0001080\r¢\u0006\u0002\b\u0011J\u0018\u00109\u001a\u00020\u000f2\u0006\u00106\u001a\u0002082\b\b\u0003\u0010:\u001a\u00020\u001dJ\u0006\u0010;\u001a\u00020\u000fJB\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020?0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\b\b\u0002\u0010A\u001a\u00020?2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJB\u0010C\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020D0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\b\b\u0002\u0010A\u001a\u00020D2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJB\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020\u001d0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\b\b\u0002\u0010A\u001a\u00020\u001d2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJB\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020D0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\b\b\u0002\u0010A\u001a\u00020D2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJB\u0010G\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020H0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\b\b\u0002\u0010A\u001a\u00020H2\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJH\u0010I\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0006\u0012\u0004\u0018\u00010H0=*\u00020\u00022\u0006\u0010@\u001a\u00020\u001d2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010H2\u0018\b\u0002\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010H\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R-\u0010\u000b\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010¢\u0006\u0002\b\u00110\fX\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/RxViewModelImpl;", "Landroidx/databinding/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;)V", "uiCommand", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "Lkotlin/ExtensionFunctionType;", "getUiCommand", "()Landroidx/lifecycle/LiveData;", "addOnPropertyChangedCallback", "p0", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "kotlin.jvm.PlatformType", "finishActivity", "finishAffinity", "hideKeyboard", "notifyPropertyChanged", "fieldId", "", "removeOnPropertyChangedCallback", "setUiCommand", "command", "showAlert", "messageRes", "titleRes", "positiveButtonOnClick", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "negativeButtonRes", "negativeButtonOnClick", "(ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "showError", "throwable", "", "(Ljava/lang/Throwable;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "showRxDialog", "Lio/reactivex/Single;", "positiveButtonRes", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "showSnackbar", "messageResourceId", "backgroundColorResourceId", "startActivity", "intent", "Landroid/app/Activity;", "Landroid/content/Intent;", "startChooser", "message", "triggerAppRebirth", "boundBoolean", "Lkotlin/properties/ReadWriteProperty;", "", "", "id", "initialValue", "onNewValue", "boundCharSequence", "", "boundInt", "boundSpanned", "boundString", "", "boundStringOrNull", "BoundProperty", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DataBindingViewModel.kt */
public class DataBindingViewModel extends RxViewModelImpl implements i, UiCommandSource {

    /* renamed from: h  reason: collision with root package name */
    public final ObservableImpl f6326h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecuteOnceUiCommandSource f6327i;

    /* renamed from: j  reason: collision with root package name */
    public final SystemExit f6328j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B3\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel$BoundProperty;", "T", "Lkotlin/properties/ObservableProperty;", "initialValue", "onNewValue", "Lkotlin/Function1;", "", "id", "", "sender", "Landroidx/databinding/Observable;", "(Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ILandroidx/databinding/Observable;)V", "afterChange", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: DataBindingViewModel.kt */
    public final class BoundProperty<T> extends ObservableProperty<T> {
        public final Function1<T, Unit> c;
        public final int e;
        public final i f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ DataBindingViewModel f6329g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BoundProperty(DataBindingViewModel dataBindingViewModel, T t, Function1<? super T, Unit> function1, int i2, i iVar) {
            super(t);
            Intrinsics.checkParameterIsNotNull(iVar, "sender");
            this.f6329g = dataBindingViewModel;
            this.c = function1;
            this.e = i2;
            this.f = iVar;
        }

        public void afterChange(KProperty<?> kProperty, T t, T t2) {
            Intrinsics.checkParameterIsNotNull(kProperty, "property");
            if (!Intrinsics.areEqual((Object) t, (Object) t2)) {
                Function1<T, Unit> function1 = this.c;
                if (function1 != null) {
                    Unit invoke = function1.invoke(t2);
                }
                this.f6329g.f6326h.a(this.f, this.e);
            }
        }
    }

    public DataBindingViewModel(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        this.f6326h = observableImpl;
        this.f6327i = executeOnceUiCommandSource;
        this.f6328j = systemExit;
    }

    public static /* synthetic */ ReadWriteProperty boundBoolean$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                z = false;
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.a(iVar, i2, z, (Function1<? super Boolean, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundBoolean");
    }

    public static /* synthetic */ ReadWriteProperty boundCharSequence$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, CharSequence charSequence, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                charSequence = "";
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.a(iVar, i2, charSequence, (Function1<? super CharSequence, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundCharSequence");
    }

    public static /* synthetic */ ReadWriteProperty boundInt$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, int i3, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            if ((i4 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.a(iVar, i2, i3, (Function1<? super Integer, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundInt");
    }

    public static /* synthetic */ ReadWriteProperty boundSpanned$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, CharSequence charSequence, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                charSequence = new SpannableString("");
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.b(iVar, i2, charSequence, (Function1<? super CharSequence, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundSpanned");
    }

    public static /* synthetic */ ReadWriteProperty boundString$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, String str, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                str = "";
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.a(iVar, i2, str, (Function1<? super String, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundString");
    }

    public static /* synthetic */ ReadWriteProperty boundStringOrNull$default(DataBindingViewModel dataBindingViewModel, i iVar, int i2, String str, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                str = null;
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            return dataBindingViewModel.b(iVar, i2, str, (Function1<? super String, Unit>) function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: boundStringOrNull");
    }

    public static /* synthetic */ void showAlert$default(DataBindingViewModel dataBindingViewModel, int i2, Integer num, Function1 function1, Integer num2, Function1 function12, int i3, Object obj) {
        if (obj == null) {
            dataBindingViewModel.a(i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : function1, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlert");
    }

    public static /* synthetic */ void showError$default(DataBindingViewModel dataBindingViewModel, Throwable th, Integer num, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            dataBindingViewModel.a(th, num, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
    }

    public static /* synthetic */ u showRxDialog$default(DataBindingViewModel dataBindingViewModel, Integer num, Integer num2, Integer num3, Integer num4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                num = null;
            }
            if ((i2 & 2) != 0) {
                num2 = null;
            }
            if ((i2 & 4) != 0) {
                num3 = null;
            }
            if ((i2 & 8) != 0) {
                num4 = null;
            }
            return dataBindingViewModel.a(num, num2, num3, num4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRxDialog");
    }

    public static /* synthetic */ void showSnackbar$default(DataBindingViewModel dataBindingViewModel, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i3 = R.color.snackbarErrorBackgroundColor;
            }
            dataBindingViewModel.a(i2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
    }

    public static /* synthetic */ void startChooser$default(DataBindingViewModel dataBindingViewModel, Intent intent, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = R.string.ClassMasterPage_Email_Client;
            }
            dataBindingViewModel.a(intent, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooser");
    }

    public final void W1() {
        a((Function1<? super d, Unit>) DataBindingViewModel$finishActivity$1.INSTANCE);
    }

    public final void X1() {
        a((Function1<? super d, Unit>) DataBindingViewModel$finishAffinity$1.INSTANCE);
    }

    public final void Y1() {
        a((Function1<? super d, Unit>) new DataBindingViewModel$triggerAppRebirth$1(this));
    }

    public final ReadWriteProperty<Object, Boolean> a(i iVar, int i2, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundBoolean");
        return new BoundProperty(this, Boolean.valueOf(z), function1, i2, iVar);
    }

    public void a(i.a aVar) {
        this.f6326h.a(aVar);
    }

    public final ReadWriteProperty<Object, CharSequence> b(i iVar, int i2, CharSequence charSequence, Function1<? super CharSequence, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundSpanned");
        Intrinsics.checkParameterIsNotNull(charSequence, "initialValue");
        return new BoundProperty(this, charSequence, function1, i2, iVar);
    }

    public void b(i.a aVar) {
        this.f6326h.b(aVar);
    }

    public LiveData<Function1<d, Unit>> getUiCommand() {
        return this.f6327i.getUiCommand();
    }

    public final void s() {
        a((Function1<? super d, Unit>) DataBindingViewModel$hideKeyboard$1.INSTANCE);
    }

    public final ReadWriteProperty<Object, String> a(i iVar, int i2, String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundString");
        Intrinsics.checkParameterIsNotNull(str, "initialValue");
        return new BoundProperty(this, str, function1, i2, iVar);
    }

    public final ReadWriteProperty<Object, String> b(i iVar, int i2, String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundStringOrNull");
        return new BoundProperty(this, str, function1, i2, iVar);
    }

    public final ReadWriteProperty<Object, Integer> a(i iVar, int i2, int i3, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundInt");
        return new BoundProperty(this, Integer.valueOf(i3), function1, i2, iVar);
    }

    public final void b(Function1<? super Activity, ? extends Intent> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "intent");
        a((Function1<? super d, Unit>) new DataBindingViewModel$startActivity$1(function1));
    }

    public final ReadWriteProperty<Object, CharSequence> a(i iVar, int i2, CharSequence charSequence, Function1<? super CharSequence, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$boundCharSequence");
        Intrinsics.checkParameterIsNotNull(charSequence, "initialValue");
        return new BoundProperty(this, charSequence, function1, i2, iVar);
    }

    public final void a(Function1<? super d, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "command");
        this.f6327i.getUiCommand().setValue(function1);
    }

    public void a(Throwable th, Integer num, Function1<? super f, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        c.a(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName()).c("Unexpected error", th);
        if (v.b(th)) {
            a((int) R.string.network_error, (int) R.color.snackbarErrorBackgroundColor);
        } else {
            a((Function1<? super d, Unit>) new DataBindingViewModel$showError$1(th, num, function1));
        }
    }

    public void a(int i2, Integer num, Function1<? super f, Unit> function1, Integer num2, Function1<? super f, Unit> function12) {
        a((Function1<? super d, Unit>) new DataBindingViewModel$showAlert$1(i2, num, function1, num2, function12));
    }

    public void a(int i2, int i3) {
        a((Function1<? super d, Unit>) new DataBindingViewModel$showSnackbar$1(i2, i3));
    }

    public final void a(Intent intent, int i2) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        try {
            b((Function1<? super Activity, ? extends Intent>) new DataBindingViewModel$startChooser$1(intent, i2));
        } catch (Exception e) {
            showError$default(this, e, (Integer) null, (Function1) null, 6, (Object) null);
        }
    }

    public final u<Integer> a(Integer num, Integer num2, Integer num3, Integer num4) {
        u<Integer> a2 = u.a(new DataBindingViewModel$showRxDialog$1(this, num3, num4, num2, num));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Single.create { emitter …  .show()\n        }\n    }");
        return a2;
    }
}
