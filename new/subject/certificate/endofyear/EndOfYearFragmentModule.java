package hu.ekreta.ellenorzo.subject.certificate.endofyear;

import androidx.fragment.app.Fragment;
import h.p.w;
import h.p.x;
import hu.ekreta.ellenorzo.di.ActivityModuleKt$createOrReUseViewModel$2;
import hu.ekreta.ellenorzo.di.FragmentScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/subject/certificate/endofyear/EndOfYearFragmentModule;", "", "()V", "provideViewModel", "Lhu/ekreta/ellenorzo/subject/certificate/endofyear/EndOfYearViewModel;", "fragment", "Lhu/ekreta/ellenorzo/subject/certificate/endofyear/EndOfYearFragment;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/subject/certificate/endofyear/EndOfYearViewModelImpl;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: EndOfYearFragmentModule.kt */
public final class EndOfYearFragmentModule {
    @FragmentScope
    public final EndOfYearViewModel a(EndOfYearFragment endOfYearFragment, a<EndOfYearViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(endOfYearFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        w a2 = g.a.a.b.a.a((Fragment) endOfYearFragment, (x.b) new ActivityModuleKt$createOrReUseViewModel$2(aVar)).a(EndOfYearViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(fr…iewModelImpl::class.java)");
        return (EndOfYearViewModel) a2;
    }
}
