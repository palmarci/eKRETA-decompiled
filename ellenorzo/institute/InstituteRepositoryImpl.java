package p289hu.ekreta.ellenorzo.institute;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import p300k.p313b.C5027n;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000RW\u0010\u0007\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u000b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstituteRepositoryImpl;", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "globalMobileApi", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;", "apiKey", "", "(Lhu/ekreta/ellenorzo/rest/GlobalMobileApi;Ljava/lang/String;)V", "delegate", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "kotlin.jvm.PlatformType", "getDelegate", "()Lio/reactivex/Observable;", "delegate$delegate", "Lkotlin/Lazy;", "fetchInstitutes", "getInstituteByCode", "code", "search", "searchTerm", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl */
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl implements InstituteRepository {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f13608d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstituteRepositoryImpl.class), "delegate", "getDelegate()Lio/reactivex/Observable;"))};

    /* renamed from: a */
    public final Lazy f13609a = LazyKt__LazyJVMKt.lazy(new InstituteRepositoryImpl$delegate$2(this));

    /* renamed from: b */
    public final GlobalMobileApi f13610b;

    /* renamed from: c */
    public final String f13611c;

    public InstituteRepositoryImpl(GlobalMobileApi globalMobileApi, String str) {
        Intrinsics.checkParameterIsNotNull(globalMobileApi, "globalMobileApi");
        Intrinsics.checkParameterIsNotNull(str, "apiKey");
        this.f13610b = globalMobileApi;
        this.f13611c = str;
    }

    /* renamed from: c */
    public C5027n<List<Institute>> mo13093c() {
        Lazy lazy = this.f13609a;
        KProperty kProperty = f13608d[0];
        C5027n<List<Institute>> a = ((C5027n) lazy.getValue()).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "delegate.observeOn(AndroidSchedulers.mainThread())");
        return a;
    }

    /* renamed from: f */
    public C5027n<List<Institute>> mo13095f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchTerm");
        String normalize = Normalizer.normalize(str, Form.NFD);
        Intrinsics.checkExpressionValueIsNotNull(normalize, "Normalizer\n            .…erm, Normalizer.Form.NFD)");
        String replace = new Regex("[^\\p{ASCII}]").replace((CharSequence) normalize, "");
        if (replace != null) {
            String lowerCase = replace.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            Lazy lazy = this.f13609a;
            KProperty kProperty = f13608d[0];
            C5027n<List<Institute>> a = ((C5027n) lazy.getValue()).mo17246g(new InstituteRepositoryImpl$search$1(lowerCase)).mo17214a(C5041a.m16999a());
            Intrinsics.checkExpressionValueIsNotNull(a, "delegate\n            .ma…dSchedulers.mainThread())");
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public C5027n<List<Institute>> mo13094c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        C5027n<List<Institute>> g = mo13093c().mo17246g(new InstituteRepositoryImpl$getInstituteByCode$1(str));
        Intrinsics.checkExpressionValueIsNotNull(g, "fetchInstitutes().map { …instituteCode == code } }");
        return g;
    }
}
