package hu.ekreta.ellenorzo.subject.averages;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.averages.AveragesFragment;
import hu.ekreta.ellenorzo.subject.averages.AveragesListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class AveragesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 extends ObservableProperty<AveragesListItem> {
    public final /* synthetic */ AveragesFragment.SectionHeaderViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AveragesFragment$SectionHeaderViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, AveragesFragment.SectionHeaderViewHolder sectionHeaderViewHolder) {
        super(obj2);
        this.c = sectionHeaderViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, AveragesListItem averagesListItem, AveragesListItem averagesListItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        AveragesListItem averagesListItem3 = averagesListItem2;
        AveragesListItem averagesListItem4 = averagesListItem;
        if (!(averagesListItem3 instanceof AveragesListItem.SectionHeader)) {
            averagesListItem3 = null;
        }
        AveragesListItem.SectionHeader sectionHeader = (AveragesListItem.SectionHeader) averagesListItem3;
        if (sectionHeader != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.sectionTitleLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.sectionTitleLabel");
            textView.setText(sectionHeader.b());
        }
    }
}
