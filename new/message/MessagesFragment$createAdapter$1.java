package hu.ekreta.ellenorzo.message;

import android.view.View;
import android.widget.LinearLayout;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.SwipeListener;
import hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"hu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "createOnSwipeListener", "Lhu/ekreta/ellenorzo/util/SwipeListener;", "holder", "position", "", "onBindViewHolder", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment$createAdapter$1 extends MVVMRecyclerViewAdapter<Message, MVVMViewHolder<? super Message>> {
    public final /* synthetic */ MessagesFragment e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesFragment$createAdapter$1(MessagesFragment messagesFragment, Function2 function2) {
        super(function2);
        this.e = messagesFragment;
    }

    /* renamed from: a */
    public void onBindViewHolder(MVVMViewHolder<? super Message> mVVMViewHolder, int i2) {
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, "holder");
        mVVMViewHolder.setModel(this.c.get(i2));
        View view = mVVMViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        View view2 = mVVMViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        SwipeLayout swipeLayout = (SwipeLayout) view2.findViewById(R.id.message_SwipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout, "holder.itemView.message_SwipeLayout");
        ((SwipeLayout) view.findViewById(R.id.message_SwipeLayout)).setOnSwipeListener(new SwipeListener(swipeLayout, d(i2), this.e.C0().k0(), new MessagesFragment$createAdapter$1$createOnSwipeListener$1(this.e.C0()), (MessagesFragment$createAdapter$1$createOnSwipeListener$1) null));
        View view3 = mVVMViewHolder.c;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        SwipeLayout swipeLayout2 = (SwipeLayout) view3.findViewById(R.id.message_SwipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "holder.itemView.message_SwipeLayout");
        ((LinearLayout) swipeLayout2.findViewById(R.id.right_view)).setOnClickListener(new MessagesFragment$createAdapter$1$onBindViewHolder$1(this, i2));
    }
}
