package hu.ekreta.ellenorzo.util.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h.p.s;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import java.util.Collections;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u0005B\u001f\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\nH\u0016J\u001d\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\u001d\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0002\u0010!R2\u0010\f\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00018\u00008\u0000 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00060\rX\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00100\u00108DX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/util/adapter/MVVMRecyclerViewAdapter;", "TItemViewModel", "TViewHolder", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/lifecycle/Observer;", "", "viewHolderFactory", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "(Lkotlin/jvm/functions/Function2;)V", "items", "", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "onBindViewHolder", "", "holder", "(Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;I)V", "onChanged", "onCreateViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MVVMRecyclerViewAdapter.kt */
public class MVVMRecyclerViewAdapter<TItemViewModel, TViewHolder extends MVVMViewHolder<? super TItemViewModel>> extends RecyclerView.g<TViewHolder> implements s<List<? extends TItemViewModel>> {
    public List<TItemViewModel> c = Collections.emptyList();

    /* renamed from: d  reason: collision with root package name */
    public final Function2<ViewGroup, Integer, TViewHolder> f6304d;

    static {
        new KProperty[1][0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MVVMRecyclerViewAdapter.class), "logger", "getLogger()Lorg/slf4j/Logger;"));
    }

    public MVVMRecyclerViewAdapter(Function2<? super ViewGroup, ? super Integer, ? extends TViewHolder> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "viewHolderFactory");
        this.f6304d = function2;
        LazyKt__LazyJVMKt.lazy(MVVMRecyclerViewAdapter$logger$2.INSTANCE);
    }

    /* renamed from: a */
    public void onChanged(List<? extends TItemViewModel> list) {
        this.c = list;
        d();
    }

    public final TItemViewModel d(int i2) {
        return this.c.get(i2);
    }

    public TViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return (MVVMViewHolder) this.f6304d.invoke(viewGroup, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void onBindViewHolder(TViewHolder tviewholder, int i2) {
        Intrinsics.checkParameterIsNotNull(tviewholder, "holder");
        tviewholder.setModel(this.c.get(i2));
    }

    public int a() {
        return this.c.size();
    }
}
