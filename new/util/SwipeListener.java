package hu.ekreta.ellenorzo.util;

import h.l.i;
import h.l.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ru.rambler.libs.swipe_layout.SwipeLayout;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/util/SwipeListener;", "T", "Lru/rambler/libs/swipe_layout/SwipeLayout$OnSwipeListener;", "swipeLayout", "Lru/rambler/libs/swipe_layout/SwipeLayout;", "model", "updateFinished", "Landroidx/databinding/ObservableBoolean;", "rightSwipeAction", "Lkotlin/Function1;", "", "leftSwipeAction", "(Lru/rambler/libs/swipe_layout/SwipeLayout;Ljava/lang/Object;Landroidx/databinding/ObservableBoolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "onBeginSwipe", "moveToRight", "", "onLeftStickyEdge", "onRightStickyEdge", "onSwipeClampReached", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SwipeListener.kt */
public final class SwipeListener<T> implements SwipeLayout.c {

    /* renamed from: a  reason: collision with root package name */
    public final SwipeLayout f6298a;
    public final T b;
    public final j c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1<T, Unit> f6299d;
    public final Function1<T, Unit> e;

    public SwipeListener(SwipeLayout swipeLayout, T t, j jVar, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(swipeLayout, "swipeLayout");
        Intrinsics.checkParameterIsNotNull(jVar, "updateFinished");
        this.f6298a = swipeLayout;
        this.b = t;
        this.c = jVar;
        this.f6299d = function1;
        this.e = function12;
        this.c.a(new i.a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SwipeListener f6300a;

            {
                this.f6300a = r1;
            }

            public void a(i iVar, int i2) {
                if (this.f6300a.c.e) {
                    this.f6300a.f6298a.e();
                }
            }
        });
    }

    public void a(SwipeLayout swipeLayout, boolean z) {
    }

    public void b(SwipeLayout swipeLayout, boolean z) {
    }

    public void c(SwipeLayout swipeLayout, boolean z) {
        if (z) {
            Function1<T, Unit> function1 = this.f6299d;
            if (function1 != null) {
                function1.invoke(this.b);
                return;
            }
            return;
        }
        Function1<T, Unit> function12 = this.e;
        if (function12 != null) {
            function12.invoke(this.b);
        }
    }

    public void d(SwipeLayout swipeLayout, boolean z) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeListener(SwipeLayout swipeLayout, Object obj, j jVar, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeLayout, obj, jVar, (i2 & 8) != 0 ? null : function1, (i2 & 16) != 0 ? null : function12);
    }
}
