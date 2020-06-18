package hu.ekreta.ellenorzo.subject.certificate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "view", "Landroid/view/View;", "onSelect", "Lkotlin/Function1;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "setModel", "(Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CertificationItemViewHolder.kt */
public final class CertificationItemViewHolder extends MVVMViewHolder<CertificationListItem> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(CertificationItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;"))};
    public final ReadWriteProperty w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/CertificationItemViewHolder$Companion;", "", "()V", "create", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/subject/certificate/CertificationListItem;", "parent", "Landroid/view/ViewGroup;", "onSelect", "Lkotlin/Function1;", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: CertificationItemViewHolder.kt */
    public static final class Companion {
        public Companion() {
        }

        public final MVVMViewHolder<? super CertificationListItem> a(ViewGroup viewGroup, Function1<? super CertificationListItem, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(function1, "onSelect");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.evaluation_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new CertificationItemViewHolder(inflate, function1);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificationItemViewHolder(View view, final Function1<? super CertificationListItem, Unit> function1) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(function1, "onSelect");
        View view2 = this.c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        view2.getRootView().setOnClickListener(new View.OnClickListener(this) {
            public final /* synthetic */ CertificationItemViewHolder c;

            {
                this.c = r1;
            }

            public final void onClick(View view) {
                CertificationListItem model = this.c.getModel();
                if (model != null) {
                    function1.invoke(model);
                }
            }
        });
        Delegates delegates = Delegates.INSTANCE;
        this.w = new CertificationItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this, view);
    }

    /* renamed from: a */
    public void setModel(CertificationListItem certificationListItem) {
        this.w.setValue(this, x[0], certificationListItem);
    }

    public CertificationListItem getModel() {
        return (CertificationListItem) this.w.getValue(this, x[0]);
    }
}
