package hu.ekreta.ellenorzo.di;

import androidx.fragment.app.Fragment;
import h.m.d.d;
import h.p.w;
import h.p.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\b¢\u0006\u0002\u0010\b\u001a:\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\t*\u00020\n\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u00042\u0006\u0010\u000b\u001a\u0002H\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"createOrReUseViewModel", "ViewModelImpl", "Activity", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/lifecycle/ViewModel;", "activity", "provider", "Ljavax/inject/Provider;", "(Landroidx/fragment/app/FragmentActivity;Ljavax/inject/Provider;)Landroidx/lifecycle/ViewModel;", "Frag", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Ljavax/inject/Provider;)Landroidx/lifecycle/ViewModel;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: ActivityModule.kt */
public final class ActivityModuleKt {
    public static final /* synthetic */ <Activity extends d, ViewModelImpl extends w> ViewModelImpl createOrReUseViewModel(Activity activity, a<ViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        x a2 = g.a.a.b.a.a((d) activity, (x.b) new ActivityModuleKt$createOrReUseViewModel$1(aVar));
        Intrinsics.reifiedOperationMarker(4, "ViewModelImpl");
        ViewModelImpl a3 = a2.a(w.class);
        Intrinsics.checkExpressionValueIsNotNull(a3, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return a3;
    }

    public static final /* synthetic */ <Frag extends Fragment, ViewModelImpl extends w> ViewModelImpl createOrReUseViewModel(Frag frag, a<ViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(frag, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        x a2 = g.a.a.b.a.a((Fragment) frag, (x.b) new ActivityModuleKt$createOrReUseViewModel$2(aVar));
        Intrinsics.reifiedOperationMarker(4, "ViewModelImpl");
        ViewModelImpl a3 = a2.a(w.class);
        Intrinsics.checkExpressionValueIsNotNull(a3, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return a3;
    }
}
