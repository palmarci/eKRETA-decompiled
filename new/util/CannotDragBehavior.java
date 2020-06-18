package hu.ekreta.ellenorzo.util;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/CannotDragBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CannotDragBehavior.kt */
public final class CannotDragBehavior extends AppBarLayout.Behavior {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CannotDragBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setDragCallback(new AppBarLayout.Behavior.a() {
            public boolean a(AppBarLayout appBarLayout) {
                Intrinsics.checkParameterIsNotNull(appBarLayout, "appBarLayout");
                return false;
            }
        });
    }
}
