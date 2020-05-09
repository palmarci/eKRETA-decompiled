package p289hu.ekreta.ellenorzo.newmessage.viewmodel;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModelImpl$createOnTouchListener$1 */
/* compiled from: NewMessageViewModelImpl.kt */
public final class NewMessageViewModelImpl$createOnTouchListener$1 implements OnTouchListener {

    /* renamed from: c */
    public final /* synthetic */ NewMessageViewModelImpl f14023c;

    public NewMessageViewModelImpl$createOnTouchListener$1(NewMessageViewModelImpl newMessageViewModelImpl) {
        this.f14023c = newMessageViewModelImpl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = this.f14023c.f14005x == null;
        if (view != null) {
            EditText editText = (EditText) view;
            if (z) {
                NewMessageViewModelImpl newMessageViewModelImpl = this.f14023c;
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                if (newMessageViewModelImpl.mo13530a(motionEvent) && this.f14023c.mo13531a(editText, motionEvent)) {
                    NewMessageViewModelImpl.access$addAddressee(this.f14023c);
                }
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
    }
}
