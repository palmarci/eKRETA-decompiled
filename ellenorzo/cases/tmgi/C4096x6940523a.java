package p289hu.ekreta.ellenorzo.cases.tmgi;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.afollestad.date.DatePicker;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.p002a.C0006f;
import p000a.p001a.p002a.p003n.C0015a;
import p000a.p001a.p002a.p004o.C0016a;
import p000a.p001a.p002a.p004o.C0017b;
import p000a.p001a.p002a.p004o.C0018c;
import p000a.p001a.p002a.p004o.C0019d;
import p000a.p001a.p002a.p009r.C0023a;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$showDatePickerDialogWithMaxDateSetToActualDate$1 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class C4096x6940523a extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TmgiFormViewModelImpl f11770c;

    /* renamed from: e */
    public final /* synthetic */ Calendar f11771e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f11772f;

    public C4096x6940523a(TmgiFormViewModelImpl tmgiFormViewModelImpl, Calendar calendar, Function2 function2) {
        this.f11770c = tmgiFormViewModelImpl;
        this.f11771e = calendar;
        this.f11772f = function2;
        super(1);
    }

    /* renamed from: a */
    public final void mo12213a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        C0006f fVar = new C0006f(dVar, null, 2);
        Calendar calendar = this.f11771e;
        Calendar a = this.f11770c.f11725M.mo16327a();
        Function2 function2 = this.f11772f;
        Intrinsics.checkParameterIsNotNull(fVar, "$this$datePicker");
        Integer valueOf = Integer.valueOf(C0019d.md_datetime_picker_date);
        Context context = fVar.f21q;
        Intrinsics.checkParameterIsNotNull(context, "$this$isLandscape");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        boolean z = resources.getConfiguration().orientation == 2;
        Intrinsics.checkParameterIsNotNull(fVar, "$this$customView");
        String str = "customView";
        Intrinsics.checkParameterIsNotNull(str, "method");
        if (valueOf != null) {
            fVar.mo15a().put("md.custom_view_no_vertical_padding", Boolean.valueOf(true));
            if (z) {
                C0006f.m9a(fVar, null, Integer.valueOf(0), 1);
            }
            View a2 = fVar.f15k.getContentLayout().mo7181a(valueOf, (View) null, false, false);
            if (z) {
                C0015a aVar = new C0015a(fVar, z);
                Intrinsics.checkParameterIsNotNull(a2, "$this$waitForWidth");
                Intrinsics.checkParameterIsNotNull(aVar, "block");
                if (a2.getMeasuredWidth() <= 0 || a2.getMeasuredHeight() <= 0) {
                    a2.getViewTreeObserver().addOnGlobalLayoutListener(new C0023a(a2, aVar));
                } else {
                    aVar.invoke(a2);
                }
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$this$getDatePicker");
            DatePicker datePicker = (DatePicker) fVar.findViewById(C0018c.datetimeDatePicker);
            if (calendar != null) {
                datePicker.setMaxDate(calendar);
            }
            if (a != null) {
                DatePicker.m6845a(datePicker, a, false, 2);
            }
            C0016a aVar2 = new C0016a(fVar, null, calendar, a, false);
            datePicker.mo7102a((Function1<? super Calendar, Unit>) aVar2);
            C0006f.m11c(fVar, Integer.valueOf(17039370), null, new C0017b(fVar, function2), 2);
            C0006f.m10b(fVar, Integer.valueOf(17039360), null, null, 6);
            fVar.show();
            return;
        }
        throw new IllegalArgumentException(C0082a.m102a(str, ": You must specify a resource ID or literal value"));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12213a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
