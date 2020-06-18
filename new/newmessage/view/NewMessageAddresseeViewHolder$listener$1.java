package hu.ekreta.ellenorzo.newmessage.view;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageAddresseeViewHolder.kt */
public final class NewMessageAddresseeViewHolder$listener$1 implements View.OnTouchListener {
    public final /* synthetic */ NewMessageAddresseeViewHolder c;
    public final /* synthetic */ Function1 e;

    public NewMessageAddresseeViewHolder$listener$1(NewMessageAddresseeViewHolder newMessageAddresseeViewHolder, Function1 function1) {
        this.c = newMessageAddresseeViewHolder;
        this.e = function1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Addressee model;
        if (view != null) {
            MaterialTextView materialTextView = (MaterialTextView) view;
            NewMessageAddresseeViewHolder newMessageAddresseeViewHolder = this.c;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (!newMessageAddresseeViewHolder.a(motionEvent) || !this.c.a(materialTextView, motionEvent) || (model = this.c.getModel()) == null) {
                return true;
            }
            this.e.invoke(model);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.textview.MaterialTextView");
    }
}
