package p289hu.ekreta.ellenorzo.subject.certificate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "view", "Landroid/view/View;", "onSelect", "Lkotlin/Function1;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationItemViewHolder */
/* compiled from: CertificationItemViewHolder.kt */
public final class CertificationItemViewHolder extends MVVMViewHolder<CertificationListItem> {
    public static final Companion Companion = new Companion(null);

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f14938x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(CertificationItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;"))};

    /* renamed from: w */
    public final ReadWriteProperty f14939w;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationItemViewHolder$Companion;", "", "()V", "create", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "parent", "Landroid/view/ViewGroup;", "onSelect", "Lkotlin/Function1;", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.subject.certificate.CertificationItemViewHolder$Companion */
    /* compiled from: CertificationItemViewHolder.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final MVVMViewHolder<? super CertificationListItem> mo15819a(ViewGroup viewGroup, Function1<? super CertificationListItem, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(function1, "onSelect");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4014R.layout.evaluation_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new CertificationItemViewHolder(inflate, function1);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CertificationItemViewHolder(View view, final Function1<? super CertificationListItem, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(function1, "onSelect");
        super(view);
        View view2 = this.f7113c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        view2.getRootView().setOnClickListener(new OnClickListener(this) {

            /* renamed from: c */
            public final /* synthetic */ CertificationItemViewHolder f14940c;

            {
                this.f14940c = r1;
            }

            public final void onClick(View view) {
                CertificationListItem model = this.f14940c.getModel();
                if (model != null) {
                    function1.invoke(model);
                }
            }
        });
        Delegates delegates = Delegates.INSTANCE;
        this.f14939w = new CertificationItemViewHolder$$special$$inlined$observable$1(null, null, this, view);
    }

    /* renamed from: a */
    public void setModel(CertificationListItem certificationListItem) {
        this.f14939w.setValue(this, f14938x[0], certificationListItem);
    }

    public CertificationListItem getModel() {
        return (CertificationListItem) this.f14939w.getValue(this, f14938x[0]);
    }
}
