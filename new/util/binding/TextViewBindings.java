package hu.ekreta.ellenorzo.util.binding;

import android.widget.TextView;
import h.w.v;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/TextViewBindings;", "", "()V", "setHtml", "", "view", "Landroid/widget/TextView;", "html", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TextViewBindings.kt */
public final class TextViewBindings {
    public static final TextViewBindings INSTANCE = new TextViewBindings();

    @JvmStatic
    public static final void a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        v.a(textView, str);
    }
}
