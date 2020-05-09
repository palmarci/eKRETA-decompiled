package p289hu.ekreta.ellenorzo.util.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000a.p054h.p055a.p105c.p122q.C2114b;
import p000a.p054h.p055a.p105c.p122q.C2117e;
import p000a.p054h.p055a.p105c.p122q.C2121g;
import p211h.p232g.p235b.C3497b;
import p211h.p238i.p250m.C3660v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/view/AdvancedBottomNavigationView;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "menuView", "Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;", "initBadges", "", "setBadgeValue", "menuId", "", "count", "(ILjava/lang/Integer;)V", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView */
/* compiled from: AdvancedBottomNavigationView.kt */
public final class AdvancedBottomNavigationView extends C2121g {
    @Deprecated
    public static final Companion Companion = new Companion(null);

    /* renamed from: l */
    public final C2117e f15434l;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/view/AdvancedBottomNavigationView$Companion;", "", "()V", "BADGE_MARGIN_LEFT", "", "BADGE_MARGIN_TOP", "BADGE_MIN_WIDTH_HEIGHT", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView$Companion */
    /* compiled from: AdvancedBottomNavigationView.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AdvancedBottomNavigationView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(this, "$this$children");
        Object first = SequencesKt___SequencesKt.first(new C3660v(this));
        if (first != null) {
            this.f15434l = (C2117e) first;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationMenuView");
    }

    /* renamed from: a */
    public final void mo16359a(int i, Integer num) {
        View findViewById = this.f15434l.findViewById(i);
        if (findViewById != null) {
            C2114b bVar = (C2114b) findViewById;
            View findViewById2 = bVar.findViewById(C4014R.C4016id.bottom_bar_badge);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "menuItem.findViewById<Co…t>(R.id.bottom_bar_badge)");
            ViewParent parent = ((ConstraintLayout) findViewById2).getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                View findViewById3 = bVar.findViewById(C4014R.C4016id.badge_text);
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

    /* renamed from: a */
    public final void mo16358a() {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        int i = system.getDisplayMetrics().widthPixels;
        int childCount = this.f15434l.getChildCount();
        int i2 = i / childCount;
        int a = ExtensionsKt.m14624a(5);
        int a2 = ExtensionsKt.m14624a(10);
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f15434l.getChildAt(i3);
            if (childAt != null) {
                C2114b bVar = (C2114b) childAt;
                ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
                constraintLayout.setVisibility(8);
                View inflate = View.inflate(constraintLayout.getContext(), C4014R.layout.badge_item, null);
                constraintLayout.addView(inflate);
                C3497b bVar2 = new C3497b();
                Intrinsics.checkExpressionValueIsNotNull(inflate, "badge");
                bVar2.mo10156a(inflate.getId()).f9653b = -2;
                bVar2.mo10156a(inflate.getId()).f9678n0 = ExtensionsKt.m14624a(25);
                bVar2.mo10156a(inflate.getId()).f9655c = ExtensionsKt.m14624a(25);
                C3497b bVar3 = bVar2;
                bVar3.mo10158a(inflate.getId(), 6, 0, 6, (i2 / 2) + a2);
                bVar2.mo10158a(inflate.getId(), 3, 0, 3, a);
                bVar3.mo10160a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                bVar.addView(constraintLayout);
                i3++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationItemView");
            }
        }
    }
}
