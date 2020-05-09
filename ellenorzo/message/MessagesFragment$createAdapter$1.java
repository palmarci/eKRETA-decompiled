package p289hu.ekreta.ellenorzo.message;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.SwipeListener;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00030\u0001J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo17463d2 = {"hu/ekreta/ellenorzo/message/MessagesFragment$createAdapter$1", "Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "Lhu/ekreta/ellenorzo/message/Message;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "createOnSwipeListener", "Lhu/ekreta/ellenorzo/util/SwipeListener;", "holder", "position", "", "onBindViewHolder", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment$createAdapter$1 */
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment$createAdapter$1 extends MVVMRecyclerViewAdapter<Message, MVVMViewHolder<? super Message>> {

    /* renamed from: g */
    public final /* synthetic */ MessagesFragment f13922g;

    public MessagesFragment$createAdapter$1(MessagesFragment messagesFragment, Function2 function2) {
        this.f13922g = messagesFragment;
        super(function2);
    }

    /* renamed from: a */
    public void onBindViewHolder(MVVMViewHolder<? super Message> mVVMViewHolder, int i) {
        String str = "holder";
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, str);
        Intrinsics.checkParameterIsNotNull(mVVMViewHolder, str);
        mVVMViewHolder.setModel(this.f15381c.get(i));
        View view = mVVMViewHolder.f7113c;
        String str2 = "holder.itemView";
        Intrinsics.checkExpressionValueIsNotNull(view, str2);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(C4014R.C4016id.message_SwipeLayout);
        View view2 = mVVMViewHolder.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view2, str2);
        SwipeLayout swipeLayout2 = (SwipeLayout) view2.findViewById(C4014R.C4016id.message_SwipeLayout);
        Intrinsics.checkExpressionValueIsNotNull(swipeLayout2, "holder.itemView.message_SwipeLayout");
        SwipeListener swipeListener = new SwipeListener(swipeLayout2, mo16300d(i), this.f13922g.mo13428C0().mo13449k0(), new MessagesFragment$createAdapter$1$createOnSwipeListener$1(this.f13922g.mo13428C0()), new MessagesFragment$createAdapter$1$createOnSwipeListener$2(this.f13922g.mo13428C0()));
        swipeLayout.setOnSwipeListener(swipeListener);
    }
}
