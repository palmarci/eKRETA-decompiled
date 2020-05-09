package p289hu.ekreta.ellenorzo.noticeboard;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p271p.C3834w;
import p211h.p271p.C3835x.C3837b;
import p289hu.ekreta.ellenorzo.p290di.ActivityModuleKt$createOrReUseViewModel$2;
import p289hu.ekreta.ellenorzo.p290di.FragmentScope;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardFragmentModule;", "", "()V", "ProvideViewModel", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModel;", "fragment", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardFragment;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardViewModelImpl;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragmentModule */
/* compiled from: NoticeBoardFragmentModule.kt */
public final class NoticeBoardFragmentModule {
    @FragmentScope
    /* renamed from: a */
    public final NoticeBoardViewModel mo13670a(NoticeBoardFragment noticeBoardFragment, C5431a<NoticeBoardViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(noticeBoardFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        C3834w a = C3158a.m7822a((Fragment) noticeBoardFragment, (C3837b) new ActivityModuleKt$createOrReUseViewModel$2(aVar)).mo10845a(NoticeBoardViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return (NoticeBoardViewModel) a;
    }
}
