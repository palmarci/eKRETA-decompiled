package p289hu.ekreta.ellenorzo.noticeboard;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment.NoticeBoardItemViewHolder;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardViewModel.ListItem.NoticeBoardItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragment$NoticeBoardItemViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4284x3cfdedf6 extends ObservableProperty<ListItem> {

    /* renamed from: c */
    public final /* synthetic */ NoticeBoardItemViewHolder f14137c;

    public C4284x3cfdedf6(Object obj, Object obj2, NoticeBoardItemViewHolder noticeBoardItemViewHolder) {
        this.f14137c = noticeBoardItemViewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, ListItem listItem, ListItem listItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        ListItem listItem3 = listItem2;
        ListItem listItem4 = listItem;
        if (!(listItem3 instanceof NoticeBoardItem)) {
            listItem3 = null;
        }
        NoticeBoardItem noticeBoardItem = (NoticeBoardItem) listItem3;
        if (noticeBoardItem != null) {
            View view = this.f14137c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            TextView textView = (TextView) view.findViewById(C4014R.C4016id.title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
            textView.setText(noticeBoardItem.mo13715a().mo13681j());
            View view2 = this.f14137c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView2 = (TextView) view2.findViewById(C4014R.C4016id.content);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.content");
            textView2.setText(noticeBoardItem.mo13715a().mo13676f());
        }
    }
}
