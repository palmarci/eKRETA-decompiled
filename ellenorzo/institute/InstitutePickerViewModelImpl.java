package p289hu.ekreta.ellenorzo.institute;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import p000a.p001a.p002a.C0006f;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p337h0.C5016a;
import p300k.p313b.p337h0.C5021d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "instituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/institute/InstituteRepository;)V", "institutes", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "getInstitutes", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "searchTerm", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "searchTerm$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchTermSubject", "Lio/reactivex/subjects/Subject;", "onSelect", "", "institute", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstitutePickerViewModelImpl */
/* compiled from: InstitutePickerViewModelImpl.kt */
public final class InstitutePickerViewModelImpl extends DataBindingViewModel implements InstitutePickerViewModel {

    /* renamed from: n */
    public static final /* synthetic */ KProperty[] f13594n = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstitutePickerViewModelImpl.class), "searchTerm", "getSearchTerm()Ljava/lang/String;"))};

    /* renamed from: j */
    public final ReadWriteProperty f13595j = DataBindingViewModel.boundString$default(this, this, 58, null, new InstitutePickerViewModelImpl$searchTerm$2(this), 2, null);

    /* renamed from: k */
    public final C3824r<List<Institute>> f13596k = new C3824r<>();

    /* renamed from: l */
    public final C5021d<String> f13597l;

    /* renamed from: m */
    public final InstituteRepository f13598m;

    public InstitutePickerViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, InstituteRepository instituteRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(instituteRepository, "instituteRepository");
        super(observableImpl, executeOnceUiCommandSource);
        this.f13598m = instituteRepository;
        C5016a f = C5016a.m16849f("");
        Intrinsics.checkExpressionValueIsNotNull(f, "BehaviorSubject.createDefault(\"\")");
        this.f13597l = f;
        C4663c a = this.f13597l.mo17252k(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ InstitutePickerViewModelImpl f13599c;

            {
                this.f13599c = r1;
            }

            /* renamed from: a */
            public final C5027n<List<Institute>> apply(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                if (StringsKt__StringsJVMKt.isBlank(str)) {
                    return this.f13599c.f13598m.mo13093c();
                }
                return this.f13599c.f13598m.mo13095f(str);
            }
        }).mo17192a((C4673f<? super T>) new C4673f<List<? extends Institute>>(this) {

            /* renamed from: c */
            public final /* synthetic */ InstitutePickerViewModelImpl f13600c;

            {
                this.f13600c = r1;
            }

            /* renamed from: a */
            public final void accept(List<Institute> list) {
                C3824r institutes = this.f13600c.getInstitutes();
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                institutes.setValue(CollectionsKt___CollectionsKt.sorted(list));
            }
        }, (C4673f<? super Throwable>) new C4673f<Throwable>(this) {

            /* renamed from: c */
            public final /* synthetic */ InstitutePickerViewModelImpl f13601c;

            {
                this.f13601c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                InstitutePickerViewModelImpl institutePickerViewModelImpl = this.f13601c;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                DataBindingViewModel.showError$default(institutePickerViewModelImpl, th, null, new Function1<C0006f, Unit>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C42133 f13602c;

                    {
                        this.f13602c = r1;
                    }

                    /* renamed from: a */
                    public final void mo13090a(C0006f fVar) {
                        Intrinsics.checkParameterIsNotNull(fVar, "it");
                        this.f13602c.f13601c.mo16363N1();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo13090a((C0006f) obj);
                        return Unit.INSTANCE;
                    }
                }, 2, null);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "searchTermSubject\n      …ivity() } }\n            )");
        mo16413a(a);
    }

    /* renamed from: F0 */
    public String mo13082F0() {
        return (String) this.f13595j.getValue(this, f13594n[0]);
    }

    /* renamed from: a */
    public void mo13083a(Institute institute) {
        Intrinsics.checkParameterIsNotNull(institute, "institute");
        Intent intent = new Intent();
        ExtensionsKt.m14649a(intent, institute.mo13066b());
        mo16373a((Function1<? super C3737d, Unit>) new InstitutePickerViewModelImpl$onSelect$1<Object,Unit>(intent));
    }

    /* renamed from: o */
    public void mo13085o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13595j.setValue(this, f13594n[0], str);
    }

    public C3824r<List<Institute>> getInstitutes() {
        return this.f13596k;
    }
}
