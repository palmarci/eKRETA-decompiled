package hu.ekreta.ellenorzo.subject.certificate;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.Evaluation;
import hu.ekreta.ellenorzo.subject.certificate.CertificationListItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class CertificationItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<CertificationListItem> {
    public final /* synthetic */ CertificationItemViewHolder c;
    public final /* synthetic */ View e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificationItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, CertificationItemViewHolder certificationItemViewHolder, View view) {
        super(obj2);
        this.c = certificationItemViewHolder;
        this.e = view;
    }

    public void afterChange(KProperty<?> kProperty, CertificationListItem certificationListItem, CertificationListItem certificationListItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        CertificationListItem certificationListItem3 = certificationListItem2;
        CertificationListItem certificationListItem4 = certificationListItem;
        if (!(certificationListItem3 instanceof CertificationListItem.CertificationItem)) {
            certificationListItem3 = null;
        }
        CertificationListItem.CertificationItem certificationItem = (CertificationListItem.CertificationItem) certificationListItem3;
        if (certificationItem != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.subjectNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.subjectNameLabel");
            Evaluation b = certificationItem.b();
            Context context = this.e.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            textView.setText(b.a(context));
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.detailLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.detailLabel");
            ExtensionsKt.b(textView2, certificationItem.b().m());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(R.id.valueLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.valueLabel");
            ExtensionsKt.b(textView3, certificationItem.b().E());
        }
    }
}
