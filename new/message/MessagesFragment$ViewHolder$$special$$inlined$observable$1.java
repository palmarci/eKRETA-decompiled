package hu.ekreta.ellenorzo.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.message.MessagesFragment;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class MessagesFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Message> {
    public final /* synthetic */ MessagesFragment.ViewHolder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagesFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, MessagesFragment.ViewHolder viewHolder) {
        super(obj2);
        this.c = viewHolder;
    }

    public void afterChange(KProperty<?> kProperty, Message message, Message message2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Message message3 = message2;
        Message message4 = message;
        if (message3 != null) {
            View view = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((SwipeLayout) view.findViewById(R.id.message_SwipeLayout)).e();
            View view2 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.senderNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.senderNameLabel");
            textView.setText(message3.t() == Message.MessageType.INCOMING ? message3.k() : message3.g());
            View view3 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(R.id.sentDateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.sentDateLabel");
            textView2.setText(UtilsKt.a(message3.n()));
            View view4 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView3 = (TextView) view4.findViewById(R.id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.subjectLabel");
            textView3.setText(message3.o());
            View view5 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            ImageView imageView = (ImageView) view5.findViewById(R.id.attachmentIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.attachmentIcon");
            imageView.setVisibility(this.c.a(message3.h()));
            if (Intrinsics.areEqual((Object) message3.q(), (Object) true)) {
                View view6 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                ((ConstraintLayout) view6.findViewById(R.id.itemLayout)).setBackgroundColor(MessagesFragment.ViewHolder.access$getColor(this.c, R.color.colorSecondary));
                View view7 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                TextView textView4 = (TextView) view7.findViewById(R.id.readStateText);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.readStateText");
                textView4.setText(this.c.x.a((int) R.string.readMessage));
                View view8 = this.c.c;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                ((ImageView) view8.findViewById(R.id.readStateIcon)).setImageResource(R.drawable.ic_book_24px);
                return;
            }
            View view9 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((ConstraintLayout) view9.findViewById(R.id.itemLayout)).setBackgroundColor(MessagesFragment.ViewHolder.access$getColor(this.c, R.color.unreadItemBackground));
            View view10 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            TextView textView5 = (TextView) view10.findViewById(R.id.readStateText);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.readStateText");
            textView5.setText(this.c.x.a((int) R.string.notReadMessage));
            View view11 = this.c.c;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ((ImageView) view11.findViewById(R.id.readStateIcon)).setImageResource(R.drawable.ic_unread_24dp);
        }
    }
}
