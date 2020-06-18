package hu.ekreta.ellenorzo.institute;

import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.a0.c;
import k.b.b0.f;
import k.b.b0.h;
import k.b.h0.a;
import k.b.h0.d;
import k.b.n;
import k.b.q;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/institute/InstitutePickerViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "instituteRepository", "Lhu/ekreta/ellenorzo/institute/InstituteRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/institute/InstituteRepository;)V", "institutes", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "getInstitutes", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "searchTerm", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "searchTerm$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchTermSubject", "Lio/reactivex/subjects/Subject;", "onSelect", "", "institute", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: InstitutePickerViewModelImpl.kt */
public final class InstitutePickerViewModelImpl extends DataBindingViewModel implements InstitutePickerViewModel {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5700o = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(InstitutePickerViewModelImpl.class), "searchTerm", "getSearchTerm()Ljava/lang/String;"))};

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5701k = DataBindingViewModel.boundString$default(this, this, 58, (String) null, new InstitutePickerViewModelImpl$searchTerm$2(this), 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final r<List<InstituteDto>> f5702l = new r<>();

    /* renamed from: m  reason: collision with root package name */
    public final d<String> f5703m;

    /* renamed from: n  reason: collision with root package name */
    public final InstituteRepository f5704n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutePickerViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, InstituteRepository instituteRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(instituteRepository, "instituteRepository");
        this.f5704n = instituteRepository;
        a f = a.f("");
        Intrinsics.checkExpressionValueIsNotNull(f, "BehaviorSubject.createDefault(\"\")");
        this.f5703m = f;
        c a2 = this.f5703m.k(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ InstitutePickerViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<List<InstituteDto>> apply(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                if (StringsKt__StringsJVMKt.isBlank(str)) {
                    return this.c.f5704n.c();
                }
                return this.c.f5704n.f(str);
            }
        }).a(new f<List<? extends InstituteDto>>(this) {
            public final /* synthetic */ InstitutePickerViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(List<InstituteDto> list) {
                r institutes = this.c.getInstitutes();
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                institutes.setValue(CollectionsKt___CollectionsKt.sorted(list));
            }
        }, (f<? super Throwable>) new f<Throwable>(this) {
            public final /* synthetic */ InstitutePickerViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                InstitutePickerViewModelImpl institutePickerViewModelImpl = this.c;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                DataBindingViewModel.showError$default(institutePickerViewModelImpl, th, (Integer) null, new Function1<a.a.a.f, Unit>(this) {
                    public final /* synthetic */ AnonymousClass3 c;

                    {
                        this.c = r1;
                    }

                    public final void a(a.a.a.f fVar) {
                        Intrinsics.checkParameterIsNotNull(fVar, "it");
                        this.c.c.W1();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((a.a.a.f) obj);
                        return Unit.INSTANCE;
                    }
                }, 2, (Object) null);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a2, "searchTermSubject\n      …ivity() } }\n            )");
        a(a2);
    }

    public String F0() {
        return (String) this.f5701k.getValue(this, f5700o[0]);
    }

    public void a(InstituteDto instituteDto) {
        Intrinsics.checkParameterIsNotNull(instituteDto, "institute");
        Intent intent = new Intent();
        ExtensionsKt.a(intent, instituteDto.getInstituteCode());
        a((Function1<? super h.m.d.d, Unit>) new InstitutePickerViewModelImpl$onSelect$1(intent));
    }

    public void n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5701k.setValue(this, f5700o[0], str);
    }

    public r<List<InstituteDto>> getInstitutes() {
        return this.f5702l;
    }
}
