package hu.ekreta.ellenorzo.noticeboard;

import android.view.View;
import android.widget.TextView;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class NoticeBoardFragment$NoticeBoardItemViewHolder$$special$$inlined$observable$1 extends ObservableProperty<NoticeBoardViewModel.ListItem> {
    public final /* synthetic */ NoticeBoardFragment.NoticeBoardItemViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeBoardFragment$NoticeBoardItemViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, NoticeBoardFragment.NoticeBoardItemViewHolder noticeBoardItemViewHolder) {
        super(obj2);
        this.c = noticeBoardItemViewHolder;
    }

    public void afterChange(KProperty<?> kProperty, NoticeBoardViewModel.ListItem listItem, NoticeBoardViewModel.ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        NoticeBoardViewModel.ListItem listItem3 = listItem2;
        NoticeBoardViewModel.ListItem listItem4 = listItem;
        if (!(listItem3 instanceof NoticeBoardViewModel.ListItem.NoticeBoardItem)) {
            listItem3 = null;
        }
        NoticeBoardViewModel.ListItem.NoticeBoardItem noticeBoardItem = (NoticeBoardViewModel.ListItem.NoticeBoardItem) listItem3;
        if (noticeBoardItem != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
            textView.setText(noticeBoardItem.a().j());
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.content);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.content");
            textView2.setText(noticeBoardItem.a().f());
        }
    }
}
