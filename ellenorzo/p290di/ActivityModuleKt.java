package p289hu.ekreta.ellenorzo.p290di;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3834w;
import p211h.p271p.C3835x;
import p211h.p271p.C3835x.C3837b;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\b¢\u0006\u0002\u0010\b\u001a:\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\t*\u00020\n\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u00042\u0006\u0010\u000b\u001a\u0002H\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007H\b¢\u0006\u0002\u0010\f¨\u0006\r"}, mo17463d2 = {"createOrReUseViewModel", "ViewModelImpl", "Activity", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/lifecycle/ViewModel;", "activity", "provider", "Ljavax/inject/Provider;", "(Landroidx/fragment/app/FragmentActivity;Ljavax/inject/Provider;)Landroidx/lifecycle/ViewModel;", "Frag", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Ljavax/inject/Provider;)Landroidx/lifecycle/ViewModel;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.di.ActivityModuleKt */
/* compiled from: ActivityModule.kt */
public final class ActivityModuleKt {
    public static final /* synthetic */ <Activity extends C3737d, ViewModelImpl extends C3834w> ViewModelImpl createOrReUseViewModel(Activity activity, C5431a<ViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        C3835x a = C3158a.m7823a((C3737d) activity, (C3837b) new ActivityModuleKt$createOrReUseViewModel$1(aVar));
        Intrinsics.reifiedOperationMarker(4, "ViewModelImpl");
        ViewModelImpl a2 = a.mo10845a(C3834w.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return a2;
    }

    public static final /* synthetic */ <Frag extends Fragment, ViewModelImpl extends C3834w> ViewModelImpl createOrReUseViewModel(Frag frag, C5431a<ViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(frag, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        C3835x a = C3158a.m7822a((Fragment) frag, (C3837b) new ActivityModuleKt$createOrReUseViewModel$2(aVar));
        Intrinsics.reifiedOperationMarker(4, "ViewModelImpl");
        ViewModelImpl a2 = a.mo10845a(C3834w.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return a2;
    }
}
