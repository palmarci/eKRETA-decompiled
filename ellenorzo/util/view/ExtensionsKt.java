package p289hu.ekreta.ellenorzo.util.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000a.p001a.p002a.C0006f;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\f\u001a&\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\b\u001a$\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0006\u001a$\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0006\u001a-\u0010\u0019\u001a\u00020\u0001*\u00020\u00042!\u0010\u001a\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u001c¢\u0006\u0002\b\u00120\u001b\u001a-\u0010\u0019\u001a\u00020\u0001*\u00020\u00022!\u0010\u001a\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u001c¢\u0006\u0002\b\u00120\u001b\u001a\u001a\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001aC\u0010\u001e\u001a\u00020\u0001*\u00020\b2\b\b\u0001\u0010\u001f\u001a\u00020\u00062\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010j\u0004\u0018\u0001`#¢\u0006\u0002\u0010$¨\u0006%"}, mo17463d2 = {"addFragment", "", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "", "gotoApplication", "Landroid/content/Context;", "pkgName", "", "hideKeyboard", "Landroid/app/Activity;", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "observeAndRunUiCommands", "commands", "Landroidx/lifecycle/LiveData;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommand;", "replaceFragment", "showAlertDialog", "messageResourceId", "titleResourceId", "positiveButtonOnClick", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lcom/afollestad/materialdialogs/DialogCallback;", "(Landroid/content/Context;ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.view.ExtensionsKt */
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    /* renamed from: a */
    public static final void m14879a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$this$hideKeyboard");
        Object systemService = activity.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static /* synthetic */ void showAlertDialog$default(Context context, int i, Integer num, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        m14880a(context, i, num, function1);
    }

    /* renamed from: a */
    public static final void m14883a(C3737d dVar, LiveData<Function1<C3737d, Unit>> liveData) {
        Intrinsics.checkParameterIsNotNull(dVar, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14657a((C3818m) dVar, liveData, (Function0<? extends C3737d>) new ExtensionsKt$observeAndRunUiCommands$1<Object>(dVar));
    }

    /* renamed from: a */
    public static final void m14882a(Fragment fragment, LiveData<Function1<C3737d, Unit>> liveData) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$observeAndRunUiCommands");
        Intrinsics.checkParameterIsNotNull(liveData, "commands");
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14657a((C3818m) fragment, liveData, (Function0<? extends C3737d>) new ExtensionsKt$observeAndRunUiCommands$2<Object>(fragment));
    }

    /* renamed from: a */
    public static final View m14878a(Fragment fragment, ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$inflate");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return fragment.mo6225t().inflate(i, viewGroup, false);
    }

    /* renamed from: a */
    public static final void m14881a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "$this$gotoApplication");
        Intrinsics.checkParameterIsNotNull(str, "pkgName");
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            }
            context.startActivity(launchIntentForPackage);
        } catch (Exception unused) {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder sb = new StringBuilder();
            sb.append("https://play.google.com/store/apps/details?id=");
            sb.append(str);
            intent.setData(Uri.parse(sb.toString()));
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static final void m14880a(Context context, int i, Integer num, Function1<? super C0006f, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "$this$showAlertDialog");
        C0006f fVar = new C0006f(context, null, 2);
        C0006f.m8a(fVar, Integer.valueOf(i), null, null, 6);
        if (num != null) {
            num.intValue();
            fVar.mo13a(num, (String) null);
        }
        C0006f.m11c(fVar, Integer.valueOf(C4014R.string.Alert_ButtonOk_Text), null, function1, 2);
        fVar.show();
    }
}
