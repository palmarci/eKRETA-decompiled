package hu.ekreta.ellenorzo.util.view;

import a.a.a.b;
import a.a.a.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.material.snackbar.Snackbar;
import h.i.f.a;
import h.m.d.d;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0006*\u00020\u0010\u001a&\u0010\u0011\u001a\u00020\u0006*\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016H\b\u001a$\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u000b\u001a$\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u000b\u001a-\u0010\u001d\u001a\u00020\u0006*\u00020\t2!\u0010\u001e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0014j\u0002` ¢\u0006\u0002\b\u00160\u001f\u001a-\u0010\u001d\u001a\u00020\u0006*\u00020\u00072!\u0010\u001e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0014j\u0002` ¢\u0006\u0002\b\u00160\u001f\u001a\u001a\u0010!\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001am\u0010\"\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u000b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000b2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014j\u0004\u0018\u0001`'2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u000b2\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014j\u0004\u0018\u0001`'¢\u0006\u0002\u0010*\u001a<\u0010\"\u001a\u00020\u0006*\u00020\u00022\u0006\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014j\u0004\u0018\u0001`'\u001a\u001e\u0010-\u001a\u00020\u0006*\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\u000b2\b\b\u0003\u0010.\u001a\u00020\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006/"}, d2 = {"applicationGooglePlayIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "getApplicationGooglePlayIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "addFragment", "", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "", "gotoApplication", "pkgName", "", "hideKeyboard", "Landroid/app/Activity;", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "observeAndRunUiCommands", "commands", "Landroidx/lifecycle/LiveData;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "replaceFragment", "showAlertDialog", "messageResourceId", "titleResourceId", "positiveButtonOnClick", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "negativeButtonRes", "negativeButtonOnClick", "(Landroid/content/Context;ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "message", "title", "showSnackbarWidget", "backgroundColorResourceId", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    public static final void a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$this$hideKeyboard");
        Object systemService = activity.getSystemService("input_method");
        if (systemService != null) {
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static /* synthetic */ void showAlertDialog$default(Context context, String str, String str2, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkParameterIsNotNull(context, "$this$showAlertDialog");
        Intrinsics.checkParameterIsNotNull(str, "message");
        f fVar = new f(context, (b) null, 2);
        f.a(fVar, (Integer) null, str, (Function1) null, 5);
        if (str2 != null) {
            f.a(fVar, (Integer) null, str2, 1);
        }
        f.c(fVar, Integer.valueOf(R.string.Alert_ButtonOk_Text), (CharSequence) null, function1, 2);
        fVar.show();
    }

    public static /* synthetic */ void showSnackbarWidget$default(d dVar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = R.color.snackbarErrorBackgroundColor;
        }
        a(dVar, i2, i3);
    }

    public static final void a(d dVar, LiveData<Function1<d, Unit>> liveData) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        hu.ekreta.ellenorzo.util.ExtensionsKt.a((m) dVar, liveData, (Function0<? extends d>) new ExtensionsKt$observeAndRunUiCommands$1(dVar));
    }

    public static final void a(Fragment fragment, LiveData<Function1<d, Unit>> liveData) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        hu.ekreta.ellenorzo.util.ExtensionsKt.a((m) fragment, liveData, (Function0<? extends d>) new ExtensionsKt$observeAndRunUiCommands$2(fragment));
    }

    public static final View a(Fragment fragment, ViewGroup viewGroup, int i2) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$inflate");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return fragment.t().inflate(i2, viewGroup, false);
    }

    public static final void a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "$this$gotoApplication");
        Intrinsics.checkParameterIsNotNull(str, "pkgName");
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            }
            context.startActivity(launchIntentForPackage);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.urlGooglePlayToApplication, new Object[]{str}))));
        }
    }

    public static /* synthetic */ void showAlertDialog$default(Context context, int i2, Integer num, Function1 function1, Integer num2, Function1 function12, int i3, Object obj) {
        a(context, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : function1, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : function12);
    }

    public static final Intent a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$applicationGooglePlayIntent");
        return new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.urlGooglePlayToApplication, new Object[]{context.getPackageName()})));
    }

    public static final void a(Context context, int i2, Integer num, Function1<? super f, Unit> function1, Integer num2, Function1<? super f, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(context, "$this$showAlertDialog");
        f fVar = new f(context, (b) null, 2);
        f.a(fVar, Integer.valueOf(i2), (CharSequence) null, (Function1) null, 6);
        if (num != null) {
            num.intValue();
            f.a(fVar, num, (String) null, 2);
        }
        f.c(fVar, Integer.valueOf(R.string.Alert_ButtonOk_Text), (CharSequence) null, function1, 2);
        if (num2 != null) {
            f.b(fVar, num2, (CharSequence) null, function12, 2);
        }
        fVar.show();
    }

    public static final void a(d dVar, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$showSnackbarWidget");
        Snackbar a2 = Snackbar.a(dVar.findViewById(16908290), i2, 3000);
        a2.c.setPadding(0, 0, 0, 0);
        int a3 = a.a(a2.b, i3);
        Drawable background = a2.c.getBackground();
        if (background != null) {
            Drawable mutate = background.mutate();
            if (Build.VERSION.SDK_INT >= 22) {
                mutate.setTint(a3);
            } else {
                mutate.setColorFilter(a3, PorterDuff.Mode.SRC_IN);
            }
        }
        a.h.a.c.h0.m.b().a(a2.b(), a2.f3550p);
    }
}
