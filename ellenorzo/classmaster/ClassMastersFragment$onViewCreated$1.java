package p289hu.ekreta.ellenorzo.classmaster;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.classmaster.ClassMastersFragment.ClassMasterViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment$ClassMasterViewHolder;", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersFragment;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersFragment$onViewCreated$1 */
/* compiled from: ClassMastersFragment.kt */
public final class ClassMastersFragment$onViewCreated$1 extends Lambda implements Function2<ViewGroup, Integer, ClassMasterViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ ClassMastersFragment f11863c;

    public ClassMastersFragment$onViewCreated$1(ClassMastersFragment classMastersFragment) {
        this.f11863c = classMastersFragment;
        super(2);
    }

    /* renamed from: a */
    public final ClassMasterViewHolder mo12294a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        ClassMastersFragment classMastersFragment = this.f11863c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4014R.layout.item_class_master, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ss_master, parent, false)");
        return new ClassMasterViewHolder(classMastersFragment, inflate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo12294a(viewGroup);
    }
}
