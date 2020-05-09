package p289hu.ekreta.ellenorzo.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.message.MessagesFragment.ViewHolder;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessagesFragment$ViewHolder$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class MessagesFragment$ViewHolder$$special$$inlined$observable$1 extends ObservableProperty<Message> {

    /* renamed from: c */
    public final /* synthetic */ ViewHolder f13921c;

    public MessagesFragment$ViewHolder$$special$$inlined$observable$1(Object obj, Object obj2, ViewHolder viewHolder) {
        this.f13921c = viewHolder;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Message message, Message message2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Message message3 = message2;
        Message message4 = message;
        if (message3 != null) {
            View view = this.f13921c.f7113c;
            String str = "itemView";
            Intrinsics.checkExpressionValueIsNotNull(view, str);
            ((SwipeLayout) view.findViewById(C4014R.C4016id.message_SwipeLayout)).mo22401e();
            View view2 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view2, str);
            TextView textView = (TextView) view2.findViewById(C4014R.C4016id.senderNameLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.senderNameLabel");
            textView.setText(message3.mo13284k());
            View view3 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view3, str);
            TextView textView2 = (TextView) view3.findViewById(C4014R.C4016id.sentDateLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.sentDateLabel");
            textView2.setText(UtilsKt.m14828a(message3.mo13287n()));
            View view4 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view4, str);
            TextView textView3 = (TextView) view4.findViewById(C4014R.C4016id.subjectLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.subjectLabel");
            textView3.setText(message3.mo13288o());
            View view5 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view5, str);
            ImageView imageView = (ImageView) view5.findViewById(C4014R.C4016id.attachmentIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.attachmentIcon");
            imageView.setVisibility(this.f13921c.mo13430a(message3.mo13280h()));
            boolean areEqual = Intrinsics.areEqual((Object) message3.mo13290q(), (Object) Boolean.valueOf(true));
            String str2 = "itemView.readStateText";
            if (areEqual) {
                View view6 = this.f13921c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view6, str);
                ((ConstraintLayout) view6.findViewById(C4014R.C4016id.itemLayout)).setBackgroundColor(ViewHolder.access$getColor(this.f13921c, C4014R.color.colorSecondary));
                View view7 = this.f13921c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view7, str);
                TextView textView4 = (TextView) view7.findViewById(C4014R.C4016id.readStateText);
                Intrinsics.checkExpressionValueIsNotNull(textView4, str2);
                textView4.setText(this.f13921c.f13917x.mo6148a((int) C4014R.string.readMessage));
                View view8 = this.f13921c.f7113c;
                Intrinsics.checkExpressionValueIsNotNull(view8, str);
                ((ImageView) view8.findViewById(C4014R.C4016id.readStateIcon)).setImageResource(C4014R.C4015drawable.ic_book_24px);
                return;
            }
            View view9 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view9, str);
            ((ConstraintLayout) view9.findViewById(C4014R.C4016id.itemLayout)).setBackgroundColor(ViewHolder.access$getColor(this.f13921c, C4014R.color.unreadItemBackground));
            View view10 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view10, str);
            TextView textView5 = (TextView) view10.findViewById(C4014R.C4016id.readStateText);
            Intrinsics.checkExpressionValueIsNotNull(textView5, str2);
            textView5.setText(this.f13921c.f13917x.mo6148a((int) C4014R.string.notReadMessage));
            View view11 = this.f13921c.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view11, str);
            ((ImageView) view11.findViewById(C4014R.C4016id.readStateIcon)).setImageResource(C4014R.C4015drawable.ic_unread);
        }
    }
}
