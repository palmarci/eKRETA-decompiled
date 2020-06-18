package hu.ekreta.ellenorzo.cases.tmgi;

import a.a.a.b;
import a.a.a.f;
import a.a.a.n.a;
import a.a.a.o.c;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.afollestad.date.DatePicker;
import h.m.d.d;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$showDatePickerDialogWithMaxDateSetToActualDate$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ TmgiFormViewModelImpl c;
    public final /* synthetic */ Calendar e;
    public final /* synthetic */ Function2 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TmgiFormViewModelImpl$showDatePickerDialogWithMaxDateSetToActualDate$1(TmgiFormViewModelImpl tmgiFormViewModelImpl, Calendar calendar, Function2 function2) {
        super(1);
        this.c = tmgiFormViewModelImpl;
        this.e = calendar;
        this.f = function2;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        f fVar = new f(dVar, (b) null, 2);
        Calendar calendar = this.e;
        Calendar a2 = this.c.N.a();
        Function2 function2 = this.f;
        Intrinsics.checkParameterIsNotNull(fVar, "$this$datePicker");
        Integer valueOf = Integer.valueOf(a.a.a.o.d.md_datetime_picker_date);
        Context context = fVar.f16q;
        Intrinsics.checkParameterIsNotNull(context, "$this$isLandscape");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        boolean z = resources.getConfiguration().orientation == 2;
        Intrinsics.checkParameterIsNotNull(fVar, "$this$customView");
        Intrinsics.checkParameterIsNotNull("customView", "method");
        if (valueOf != null) {
            fVar.a().put("md.custom_view_no_vertical_padding", true);
            if (z) {
                f.a(fVar, (Integer) null, (Integer) 0, 1);
            }
            View a3 = fVar.f10k.getContentLayout().a(valueOf, (View) null, false, false);
            if (z) {
                a aVar = new a(fVar, z);
                Intrinsics.checkParameterIsNotNull(a3, "$this$waitForWidth");
                Intrinsics.checkParameterIsNotNull(aVar, "block");
                if (a3.getMeasuredWidth() <= 0 || a3.getMeasuredHeight() <= 0) {
                    a3.getViewTreeObserver().addOnGlobalLayoutListener(new a.a.a.r.a(a3, aVar));
                } else {
                    aVar.invoke(a3);
                }
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$this$getDatePicker");
            DatePicker datePicker = (DatePicker) fVar.findViewById(c.datetimeDatePicker);
            if (calendar != null) {
                datePicker.setMaxDate(calendar);
            }
            if (a2 != null) {
                DatePicker.a(datePicker, a2, false, 2);
            }
            datePicker.a((Function1<? super Calendar, Unit>) new a.a.a.o.a(fVar, (Calendar) null, calendar, a2, false));
            f.c(fVar, 17039370, (CharSequence) null, new a.a.a.o.b(fVar, function2), 2);
            f.b(fVar, 17039360, (CharSequence) null, (Function1) null, 6);
            fVar.show();
            return;
        }
        throw new IllegalArgumentException(a.b.a.a.a.a("customView", ": You must specify a resource ID or literal value"));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
