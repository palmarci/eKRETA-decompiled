package hu.ekreta.ellenorzo.message;

import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
/* compiled from: MessagesFragment.kt */
public final class MessagesFragment$createAdapter$1$onBindViewHolder$1 implements View.OnClickListener {
    public final /* synthetic */ MessagesFragment$createAdapter$1 c;
    public final /* synthetic */ int e;

    public MessagesFragment$createAdapter$1$onBindViewHolder$1(MessagesFragment$createAdapter$1 messagesFragment$createAdapter$1, int i2) {
        this.c = messagesFragment$createAdapter$1;
        this.e = i2;
    }

    public final void onClick(View view) {
        this.c.e.C0().a((Message) this.c.d(this.e));
    }
}
