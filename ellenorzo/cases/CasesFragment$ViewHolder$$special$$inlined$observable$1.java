package p289hu.ekreta.ellenorzo.cases;

import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.CasesFragment.ViewHolder;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CasesFragment$ViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class CasesFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<BaseCase> {

    /* renamed from: c */
    public final /* synthetic */ ViewHolder f11335c;

    public CasesFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ViewHolder viewHolder) {
        this.f11335c = viewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, BaseCase baseCase, BaseCase baseCase2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        BaseCase baseCase3 = baseCase2;
        BaseCase baseCase4 = baseCase;
        if (baseCase3 != null) {
            View view = this.f11335c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.caseSentDate);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.caseSentDate");
            Calendar m = baseCase3.mo11586m();
            if (m == null) {
                m = baseCase3.mo11588o();
            }
            textView.setText(UtilsKt.m14828a(m));
            View view2 = this.f11335c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.caseState);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.caseState");
            textView2.setText(baseCase3.mo11589p());
            View view3 = this.f11335c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.caseTypeOfCase);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.caseTypeOfCase");
            String a = this.f11335c.f11334x.mo6148a(baseCase3.mo11575b(baseCase3.mo11594u()));
            Intrinsics.checkExpressionValueIsNotNull(a, "getString(\n             …                        )");
            textView3.setText(baseCase3.mo11574a(a));
        }
    }
}
