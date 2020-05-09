package p289hu.ekreta.ellenorzo.noticeboard.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/detail/NoticeBoardItemDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/noticeboard/detail/NoticeBoardItemDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;)V", "<set-?>", "", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "noticeBoardItem", "getNoticeBoardItem", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "setNoticeBoardItem", "(Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "noticeBoardItem$delegate", "title", "getTitle", "setTitle", "title$delegate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModelImpl */
/* compiled from: NoticeBoardItemDetailViewModelImpl.kt */
public final class NoticeBoardItemDetailViewModelImpl extends DataBindingViewModel implements NoticeBoardItemDetailViewModel {

    /* renamed from: m */
    public static final /* synthetic */ KProperty[] f14186m;

    /* renamed from: j */
    public final ReadWriteProperty f14187j = DataBindingViewModel.boundString$default(this, this, 95, null, null, 6, null);

    /* renamed from: k */
    public final ReadWriteProperty f14188k = DataBindingViewModel.boundString$default(this, this, 96, null, null, 6, null);

    /* renamed from: l */
    public final ReadWriteProperty f14189l;

    static {
        Class<NoticeBoardItemDetailViewModelImpl> cls = NoticeBoardItemDetailViewModelImpl.class;
        f14186m = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "content", "getContent()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "noticeBoardItem", "getNoticeBoardItem()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;"))};
    }

    public NoticeBoardItemDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        super(observableImpl, executeOnceUiCommandSource);
        Delegates delegates = Delegates.INSTANCE;
        this.f14189l = new C4292xfcdbf7b0(null, null, this);
    }

    /* renamed from: a */
    public void mo13735a(NoticeBoardItem noticeBoardItem) {
        this.f14189l.setValue(this, f14186m[2], noticeBoardItem);
    }

    public String getTitle() {
        return (String) this.f14187j.getValue(this, f14186m[0]);
    }

    /* renamed from: r */
    public void mo13738r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14188k.setValue(this, f14186m[1], str);
    }

    /* renamed from: s */
    public void mo13739s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14187j.setValue(this, f14186m[0], str);
    }

    /* renamed from: x0 */
    public String mo13737x0() {
        return (String) this.f14188k.getValue(this, f14186m[1]);
    }
}
