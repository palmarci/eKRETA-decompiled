package hu.ekreta.ellenorzo.classmaster;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.classmaster.ClassMastersFragment;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1 extends ObservableProperty<ClassMaster> {
    public final /* synthetic */ ClassMastersFragment.ClassMasterViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ClassMastersFragment.ClassMasterViewHolder classMasterViewHolder) {
        super(obj2);
        this.c = classMasterViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, ClassMaster classMaster, ClassMaster classMaster2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ClassMaster classMaster3 = classMaster2;
        ClassMaster classMaster4 = classMaster;
        if (classMaster3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
            textView.setText(classMaster3.f());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.educationTypeDescription);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.educationTypeDescription");
            textView2.setText(classMaster3.a());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.groupName);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.groupName");
            textView3.setText(classMaster3.c());
            String str = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster3.g());
            boolean z = false;
            if (!(str == null || StringsKt__StringsJVMKt.isBlank(str))) {
                View view4 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                ((ImageView) view4.findViewById(R.id.callIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$1(str, this));
                View view5 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                ((ImageView) view5.findViewById(R.id.callIcon)).setImageResource(R.drawable.ic_call_24dp);
                View view6 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((ImageView) view6.findViewById(R.id.smsIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$2(str, this));
                View view7 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                ((ImageView) view7.findViewById(R.id.smsIcon)).setImageResource(R.drawable.ic_message_24dp);
            } else {
                View view8 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                ((ImageView) view8.findViewById(R.id.callIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$3(this));
                View view9 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                ((ImageView) view9.findViewById(R.id.callIcon)).setImageResource(R.drawable.ic_call_grey_24dp);
                View view10 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                ((ImageView) view10.findViewById(R.id.smsIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$4(this));
                View view11 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
                ((ImageView) view11.findViewById(R.id.smsIcon)).setImageResource(R.drawable.ic_message_grey_24dp);
            }
            String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster3.b());
            if (str2 == null || StringsKt__StringsJVMKt.isBlank(str2)) {
                z = true;
            }
            if (!z) {
                View view12 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
                ((ImageView) view12.findViewById(R.id.emailIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$5(str2, this));
                View view13 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
                ((ImageView) view13.findViewById(R.id.emailIcon)).setImageResource(R.drawable.ic_email_24dp);
            } else {
                View view14 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
                ((ImageView) view14.findViewById(R.id.emailIcon)).setOnClickListener(new ClassMastersFragment$ClassMasterViewHolder$$special$$inlined$observable$1$lambda$6(this));
                View view15 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
                ((ImageView) view15.findViewById(R.id.emailIcon)).setImageResource(R.drawable.ic_email_grey_24dp);
            }
            if (ClassMastersFragment.ClassMasterViewHolder.WhenMappings.f5285a[classMaster3.h().ordinal()] != 1) {
                View view16 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
                TextView textView4 = (TextView) view16.findViewById(R.id.classMasterTitle);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.classMasterTitle");
                textView4.setVisibility(8);
                return;
            }
            View view17 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            TextView textView5 = (TextView) view17.findViewById(R.id.classMasterTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.classMasterTitle");
            textView5.setText(this.c.y.a((int) R.string.ClassMasterAssistant));
        }
    }
}
