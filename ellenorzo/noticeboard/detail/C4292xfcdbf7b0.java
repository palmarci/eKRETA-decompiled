package p289hu.ekreta.ellenorzo.noticeboard.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class C4292xfcdbf7b0 extends ObservableProperty<NoticeBoardItem> {

    /* renamed from: c */
    public final /* synthetic */ NoticeBoardItemDetailViewModelImpl f14190c;

    public C4292xfcdbf7b0(Object obj, Object obj2, NoticeBoardItemDetailViewModelImpl noticeBoardItemDetailViewModelImpl) {
        this.f14190c = noticeBoardItemDetailViewModelImpl;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, NoticeBoardItem noticeBoardItem, NoticeBoardItem noticeBoardItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        NoticeBoardItem noticeBoardItem3 = noticeBoardItem2;
        NoticeBoardItem noticeBoardItem4 = noticeBoardItem;
        if (noticeBoardItem3 != null) {
            this.f14190c.mo13739s(noticeBoardItem3.mo13681j());
            this.f14190c.mo13738r(noticeBoardItem3.mo13676f());
        }
    }
}
