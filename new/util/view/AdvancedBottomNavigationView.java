package hu.ekreta.ellenorzo.util.view;

import a.h.a.c.q.b;
import a.h.a.c.q.e;
import a.h.a.c.q.g;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import h.i.m.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/util/view/AdvancedBottomNavigationView;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "menuView", "Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;", "initBadges", "", "setBadgeValue", "menuId", "", "count", "(ILjava/lang/Integer;)V", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AdvancedBottomNavigationView.kt */
public final class AdvancedBottomNavigationView extends g {
    @Deprecated
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public final e f6324l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/view/AdvancedBottomNavigationView$Companion;", "", "()V", "BADGE_MARGIN_LEFT", "", "BADGE_MARGIN_TOP", "BADGE_MIN_WIDTH_HEIGHT", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: AdvancedBottomNavigationView.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdvancedBottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Intrinsics.checkParameterIsNotNull(this, "$this$children");
        Object first = SequencesKt___SequencesKt.first(new v(this));
        if (first != null) {
            this.f6324l = (e) first;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationMenuView");
    }

    public final void a(int i2, Integer num) {
        View findViewById = this.f6324l.findViewById(i2);
        if (findViewById != null) {
            b bVar = (b) findViewById;
            View findViewById2 = bVar.findViewById(R.id.bottom_bar_badge);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "menuItem.findViewById<Co…t>(R.id.bottom_bar_badge)");
            ViewParent parent = ((ConstraintLayout) findViewById2).getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                View findViewById3 = bVar.findViewById(R.id.badge_text);
                if (findViewById3 != null) {
                    TextView textView = (TextView) findViewById3;
                    if (num == null) {
                        return;
                    }
                    if (num.intValue() > 0) {
                        textView.setText(String.valueOf(num.intValue()));
                        viewGroup.setVisibility(0);
                        return;
                    }
                    viewGroup.setVisibility(8);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationItemView");
    }

    public final void a() {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        int i2 = system.getDisplayMetrics().widthPixels;
        int childCount = this.f6324l.getChildCount();
        int i3 = i2 / childCount;
        int a2 = ExtensionsKt.a(5);
        int a3 = ExtensionsKt.a(10);
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = this.f6324l.getChildAt(i4);
            if (childAt != null) {
                ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
                constraintLayout.setVisibility(8);
                View inflate = View.inflate(constraintLayout.getContext(), R.layout.badge_item, (ViewGroup) null);
                constraintLayout.addView(inflate);
                h.g.b.b bVar = new h.g.b.b();
                Intrinsics.checkExpressionValueIsNotNull(inflate, "badge");
                bVar.a(inflate.getId()).b = -2;
                bVar.a(inflate.getId()).n0 = ExtensionsKt.a(25);
                bVar.a(inflate.getId()).c = ExtensionsKt.a(25);
                h.g.b.b bVar2 = bVar;
                bVar2.a(inflate.getId(), 6, 0, 6, (i3 / 2) + a3);
                bVar.a(inflate.getId(), 3, 0, 3, a2);
                bVar2.a(constraintLayout);
                constraintLayout.setConstraintSet((h.g.b.b) null);
                ((b) childAt).addView(constraintLayout);
                i4++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationItemView");
            }
        }
    }
}
