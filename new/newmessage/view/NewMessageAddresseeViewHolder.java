package hu.ekreta.ellenorzo.newmessage.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u0016*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR/\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/view/NewMessageAddresseeViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "parent", "Landroid/view/ViewGroup;", "onItemSelected", "Lkotlin/Function1;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "listener", "Landroid/view/View$OnTouchListener;", "getListener", "()Landroid/view/View$OnTouchListener;", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "setModel", "(Lhu/ekreta/ellenorzo/newmessage/model/Addressee;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "isActionUp", "", "Landroid/view/MotionEvent;", "isClickOnRightIcon", "Lcom/google/android/material/textview/MaterialTextView;", "event", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessageAddresseeViewHolder.kt */
public final class NewMessageAddresseeViewHolder extends MVVMViewHolder<Addressee> {
    public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewMessageAddresseeViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/newmessage/model/Addressee;"))};
    public final ReadWriteProperty w = new NewMessageAddresseeViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
    public final View.OnTouchListener x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NewMessageAddresseeViewHolder(android.view.ViewGroup r4, kotlin.jvm.functions.Function1<? super hu.ekreta.ellenorzo.newmessage.model.Addressee, kotlin.Unit> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            android.view.LayoutInflater r0 = hu.ekreta.ellenorzo.util.ExtensionsKt.a((android.view.View) r4)
            r1 = 2131427504(0x7f0b00b0, float:1.8476626E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "parent.layoutInflater.in…ssee_item, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            kotlin.properties.Delegates r4 = kotlin.properties.Delegates.INSTANCE
            hu.ekreta.ellenorzo.newmessage.view.NewMessageAddresseeViewHolder$$special$$inlined$observable$1 r4 = new hu.ekreta.ellenorzo.newmessage.view.NewMessageAddresseeViewHolder$$special$$inlined$observable$1
            r0 = 0
            r4.<init>(r0, r0, r3)
            r3.w = r4
            hu.ekreta.ellenorzo.newmessage.view.NewMessageAddresseeViewHolder$listener$1 r4 = new hu.ekreta.ellenorzo.newmessage.view.NewMessageAddresseeViewHolder$listener$1
            r4.<init>(r3, r5)
            r3.x = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.newmessage.view.NewMessageAddresseeViewHolder.<init>(android.view.ViewGroup, kotlin.jvm.functions.Function1):void");
    }

    public final View.OnTouchListener D() {
        return this.x;
    }

    /* renamed from: a */
    public void setModel(Addressee addressee) {
        this.w.setValue(this, y[0], addressee);
    }

    public final boolean a(MotionEvent motionEvent) {
        return motionEvent.getAction() == 1;
    }

    public Addressee getModel() {
        return (Addressee) this.w.getValue(this, y[0]);
    }

    public final boolean a(MaterialTextView materialTextView, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        int right = materialTextView.getRight();
        Drawable drawable = materialTextView.getCompoundDrawables()[2];
        Intrinsics.checkExpressionValueIsNotNull(drawable, "compoundDrawables[drawableIndexRight]");
        return rawX >= ((float) (right - drawable.getBounds().width()));
    }
}
