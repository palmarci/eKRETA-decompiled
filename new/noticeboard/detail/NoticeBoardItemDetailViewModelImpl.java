package hu.ekreta.ellenorzo.noticeboard.detail;

import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/detail/NoticeBoardItemDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/detail/NoticeBoardItemDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;)V", "<set-?>", "", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "noticeBoardItem", "getNoticeBoardItem", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "setNoticeBoardItem", "(Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "noticeBoardItem$delegate", "title", "getTitle", "setTitle", "title$delegate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemDetailViewModelImpl.kt */
public final class NoticeBoardItemDetailViewModelImpl extends DataBindingViewModel implements NoticeBoardItemDetailViewModel {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5901n;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5902k = DataBindingViewModel.boundString$default(this, this, 97, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f5903l = DataBindingViewModel.boundString$default(this, this, 98, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f5904m;

    static {
        Class<NoticeBoardItemDetailViewModelImpl> cls = NoticeBoardItemDetailViewModelImpl.class;
        f5901n = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "content", "getContent()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "noticeBoardItem", "getNoticeBoardItem()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeBoardItemDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Delegates delegates = Delegates.INSTANCE;
        this.f5904m = new NoticeBoardItemDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);
    }

    public void a(NoticeBoardItem noticeBoardItem) {
        this.f5904m.setValue(this, f5901n[2], noticeBoardItem);
    }

    public String getTitle() {
        return (String) this.f5902k.getValue(this, f5901n[0]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5903l.setValue(this, f5901n[1], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5902k.setValue(this, f5901n[0], str);
    }

    public String x0() {
        return (String) this.f5903l.getValue(this, f5901n[1]);
    }
}
