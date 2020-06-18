package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import java.text.Normalizer;
import java.util.List;
import k.b.n;
import k.b.z.a.a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000RW\u0010\u0007\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u000b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstituteRepositoryImpl;", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "globalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "apiKey", "", "(Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;Ljava/lang/String;)V", "delegate", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "kotlin.jvm.PlatformType", "getDelegate", "()Lio/reactivex/Observable;", "delegate$delegate", "Lkotlin/Lazy;", "fetchInstitutes", "getInstituteByCode", "code", "search", "searchTerm", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl implements InstituteRepository {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5707d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstituteRepositoryImpl.class), "delegate", "getDelegate()Lio/reactivex/Observable;"))};

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f5708a = LazyKt__LazyJVMKt.lazy(new InstituteRepositoryImpl$delegate$2(this));
    public final GlobalMobileApi b;
    public final String c;

    public InstituteRepositoryImpl(GlobalMobileApi globalMobileApi, String str) {
        Intrinsics.checkParameterIsNotNull(globalMobileApi, "globalMobileApi");
        Intrinsics.checkParameterIsNotNull(str, "apiKey");
        this.b = globalMobileApi;
        this.c = str;
    }

    public n<List<InstituteDto>> c() {
        Lazy lazy = this.f5708a;
        KProperty kProperty = f5707d[0];
        n<List<InstituteDto>> a2 = ((n) lazy.getValue()).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "delegate.observeOn(AndroidSchedulers.mainThread())");
        return a2;
    }

    public n<List<InstituteDto>> f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchTerm");
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkExpressionValueIsNotNull(normalize, "Normalizer\n            .…erm, Normalizer.Form.NFD)");
        String replace = new Regex("[^\\p{ASCII}]").replace((CharSequence) normalize, "");
        if (replace != null) {
            String lowerCase = replace.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            Lazy lazy = this.f5708a;
            KProperty kProperty = f5707d[0];
            n<List<InstituteDto>> a2 = ((n) lazy.getValue()).g(new InstituteRepositoryImpl$search$1(lowerCase)).a(a.a());
            Intrinsics.checkExpressionValueIsNotNull(a2, "delegate\n            .ma…dSchedulers.mainThread())");
            return a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public n<List<InstituteDto>> c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        n<R> g2 = c().g(new InstituteRepositoryImpl$getInstituteByCode$1(str));
        Intrinsics.checkExpressionValueIsNotNull(g2, "fetchInstitutes().map { …instituteCode == code } }");
        return g2;
    }
}
