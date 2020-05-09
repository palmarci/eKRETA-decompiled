package p289hu.ekreta.ellenorzo.classmaster;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.classmaster.ClassMaster.ClassMasterType;
import p289hu.ekreta.ellenorzo.classmaster.ClassMastersFragment.ClassMasterViewHolder;
import p289hu.ekreta.ellenorzo.classmaster.ClassMastersFragment.ClassMasterViewHolder.WhenMappings;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4101x39cf6f12 extends ObservableProperty<ClassMaster> {

    /* renamed from: c */
    public final /* synthetic */ ClassMasterViewHolder f11853c;

    public C4101x39cf6f12(Object obj, Object obj2, ClassMasterViewHolder classMasterViewHolder) {
        this.f11853c = classMasterViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ClassMaster classMaster, ClassMaster classMaster2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ClassMaster classMaster3 = classMaster2;
        ClassMaster classMaster4 = classMaster;
        if (classMaster3 != null) {
            View view = this.f11853c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            textView.setText(classMaster3.mo12222f());
            View view2 = this.f11853c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.educationTypeDescription);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.educationTypeDescription");
            textView2.setText(classMaster3.mo12218a());
            View view3 = this.f11853c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.groupName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.groupName");
            textView3.setText(classMaster3.mo12220c());
            String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster3.mo12223g());
            boolean z = false;
            if (!(str2 == null || StringsKt__StringsJVMKt.isBlank(str2))) {
                View view4 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view4, str);
                ((ImageView) view4.findViewById(C4014R.C4016id.callIcon)).setOnClickListener(new C4102xdbb683e6(str2, this));
                View view5 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view5, str);
                ((ImageView) view5.findViewById(C4014R.C4016id.callIcon)).setImageResource(C4014R.C4015drawable.ic_call_blue_24dp);
                View view6 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view6, str);
                ((ImageView) view6.findViewById(C4014R.C4016id.smsIcon)).setOnClickListener(new C4103xdbb683e7(str2, this));
                View view7 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view7, str);
                ((ImageView) view7.findViewById(C4014R.C4016id.smsIcon)).setImageResource(C4014R.C4015drawable.ic_message_blue_24dp);
            } else {
                View view8 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view8, str);
                ((ImageView) view8.findViewById(C4014R.C4016id.callIcon)).setOnClickListener(new C4104xdbb683e8(this));
                View view9 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view9, str);
                ((ImageView) view9.findViewById(C4014R.C4016id.callIcon)).setImageResource(C4014R.C4015drawable.ic_call_grey_24dp);
                View view10 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view10, str);
                ((ImageView) view10.findViewById(C4014R.C4016id.smsIcon)).setOnClickListener(new C4105xdbb683e9(this));
                View view11 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view11, str);
                ((ImageView) view11.findViewById(C4014R.C4016id.smsIcon)).setImageResource(C4014R.C4015drawable.ic_message_grey_24dp);
            }
            String str3 = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster3.mo12219b());
            if (str3 == null || StringsKt__StringsJVMKt.isBlank(str3)) {
                z = true;
            }
            if (!z) {
                View view12 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view12, str);
                ((ImageView) view12.findViewById(C4014R.C4016id.emailIcon)).setOnClickListener(new C4106xdbb683ea(str3, this));
                View view13 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view13, str);
                ((ImageView) view13.findViewById(C4014R.C4016id.emailIcon)).setImageResource(C4014R.C4015drawable.ic_email_blue_24dp);
            } else {
                View view14 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view14, str);
                ((ImageView) view14.findViewById(C4014R.C4016id.emailIcon)).setOnClickListener(new C4107xdbb683eb(this));
                View view15 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view15, str);
                ((ImageView) view15.findViewById(C4014R.C4016id.emailIcon)).setImageResource(C4014R.C4015drawable.ic_email_grey_24dp);
            }
            ClassMasterType h = classMaster3.mo12224h();
            String str4 = "itemView.classMasterTitle";
            if (WhenMappings.f11852a[h.ordinal()] != 1) {
                View view16 = this.f11853c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view16, str);
                TextView textView4 = (TextView) view16.findViewById(C4014R.C4016id.classMasterTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView4, str4);
                textView4.setVisibility(8);
                return;
            }
            View view17 = this.f11853c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view17, str);
            TextView textView5 = (TextView) view17.findViewById(C4014R.C4016id.classMasterTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView5, str4);
            textView5.setText(this.f11853c.f11851y.mo6148a((int) C4014R.string.ClassMasterAssistant));
        }
    }
}
