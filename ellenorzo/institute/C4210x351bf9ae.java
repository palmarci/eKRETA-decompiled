package p289hu.ekreta.ellenorzo.institute;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.institute.InstitutePickerActivity.InstituteViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerActivity$InstituteViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4210x351bf9ae extends ObservableProperty<Institute> {

    /* renamed from: c */
    public final /* synthetic */ InstituteViewHolder f13586c;

    public C4210x351bf9ae(Object obj, Object obj2, InstituteViewHolder instituteViewHolder) {
        this.f13586c = instituteViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Institute institute, Institute institute2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Institute institute3 = institute2;
        Institute institute4 = institute;
        if (institute3 != null) {
            View view = this.f13586c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.institute_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.institute_name");
            textView.setText(institute3.mo13067c());
            View view2 = this.f13586c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.institute_code);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.institute_code");
            textView2.setText(institute3.mo13066b());
            View view3 = this.f13586c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.institute_city);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.institute_city");
            textView3.setText(institute3.mo13065a());
        }
    }
}
