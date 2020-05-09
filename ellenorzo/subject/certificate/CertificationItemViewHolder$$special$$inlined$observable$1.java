package p289hu.ekreta.ellenorzo.subject.certificate;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.evaluation.Evaluation;
import p289hu.ekreta.ellenorzo.subject.certificate.CertificationListItem.CertificationItem;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class CertificationItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<CertificationListItem> {

    /* renamed from: c */
    public final /* synthetic */ CertificationItemViewHolder f14942c;

    /* renamed from: e */
    public final /* synthetic */ View f14943e;

    public CertificationItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, CertificationItemViewHolder certificationItemViewHolder, View view) {
        this.f14942c = certificationItemViewHolder;
        this.f14943e = view;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, CertificationListItem certificationListItem, CertificationListItem certificationListItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        CertificationListItem certificationListItem3 = certificationListItem2;
        CertificationListItem certificationListItem4 = certificationListItem;
        if (!(certificationListItem3 instanceof CertificationItem)) {
            certificationListItem3 = null;
        }
        CertificationItem certificationItem = (CertificationItem) certificationListItem3;
        if (certificationItem != null) {
            View view = this.f14942c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.subjectNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.subjectNameLabel");
            Evaluation b = certificationItem.mo15822b();
            Context context = this.f14943e.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            textView.setText(b.mo12592a(context));
            View view2 = this.f14942c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
            ExtensionsKt.m14664b(textView2, certificationItem.mo15822b().mo12603m());
            View view3 = this.f14942c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView3 = (TextView) view3.findViewById(C4014R.C4016id.valueLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.valueLabel");
            ExtensionsKt.m14664b(textView3, certificationItem.mo15822b().mo12589E());
        }
    }
}
