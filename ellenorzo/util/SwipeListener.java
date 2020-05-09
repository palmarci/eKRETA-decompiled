package p289hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p211h.p258l.C3705i;
import p211h.p258l.C3705i.C3706a;
import p211h.p258l.C3707j;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;
import p388ru.rambler.libs.swipe_layout.SwipeLayout.C5839c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/SwipeListener;", "T", "Lru/rambler/libs/swipe_layout/SwipeLayout$OnSwipeListener;", "swipeLayout", "Lru/rambler/libs/swipe_layout/SwipeLayout;", "model", "updateFinished", "Landroidx/databinding/ObservableBoolean;", "rightSwipeAction", "Lkotlin/Function1;", "", "leftSwipeAction", "(Lru/rambler/libs/swipe_layout/SwipeLayout;Ljava/lang/Object;Landroidx/databinding/ObservableBoolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "onBeginSwipe", "moveToRight", "", "onLeftStickyEdge", "onRightStickyEdge", "onSwipeClampReached", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.SwipeListener */
/* compiled from: SwipeListener.kt */
public final class SwipeListener<T> implements C5839c {

    /* renamed from: a */
    public final SwipeLayout f15371a;

    /* renamed from: b */
    public final T f15372b;

    /* renamed from: c */
    public final C3707j f15373c;

    /* renamed from: d */
    public final Function1<T, Unit> f15374d;

    /* renamed from: e */
    public final Function1<T, Unit> f15375e;

    public SwipeListener(SwipeLayout swipeLayout, T t, C3707j jVar, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
        Intrinsics.checkParameterIsNotNull(jVar, "updateFinished");
        this.f15371a = swipeLayout;
        this.f15372b = t;
        this.f15373c = jVar;
        this.f15374d = function1;
        this.f15375e = function12;
        this.f15373c.mo10510a(new C3706a(this) {

            /* renamed from: a */
            public final /* synthetic */ SwipeListener f15376a;

            {
                this.f15376a = r1;
            }

            /* renamed from: a */
            public void mo6119a(C3705i iVar, int i) {
                if (this.f15376a.f15373c.f10170e) {
                    this.f15376a.f15371a.mo22401e();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo13423a(SwipeLayout swipeLayout, boolean z) {
    }

    /* renamed from: b */
    public void mo13424b(SwipeLayout swipeLayout, boolean z) {
    }

    /* renamed from: c */
    public void mo13425c(SwipeLayout swipeLayout, boolean z) {
        if (z) {
            Function1<T, Unit> function1 = this.f15374d;
            if (function1 != null) {
                function1.invoke(this.f15372b);
                return;
            }
            return;
        }
        Function1<T, Unit> function12 = this.f15375e;
        if (function12 != null) {
            function12.invoke(this.f15372b);
        }
    }

    /* renamed from: d */
    public void mo13426d(SwipeLayout swipeLayout, boolean z) {
    }

    public /* synthetic */ SwipeListener(SwipeLayout swipeLayout, Object obj, C3707j jVar, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeLayout, obj, jVar, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function12);
    }
}
