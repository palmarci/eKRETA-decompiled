package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import android.content.Context;
import android.content.Intent;
import h.l.k;
import h.m.d.d;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeSelectorService;
import hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType;
import hu.ekreta.ellenorzo.addresseeselector.model.EmployeeDetails;
import hu.ekreta.ellenorzo.addresseeselector.model.GuardianEAdmin;
import hu.ekreta.ellenorzo.addresseeselector.model.KretaClass;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.Iterator;
import java.util.List;
import k.b.a0.c;
import k.b.b0.a;
import k.b.b0.f;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J1\u0010?\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u0001082\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u000208H\u0002¢\u0006\u0002\u0010EJ\u0018\u0010F\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010J\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010K\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010L\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020N2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010O\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020N2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010P\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0018\u0010Q\u001a\n R*\u0004\u0018\u000108082\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010S\u001a\u00020-H\u0002J\u0010\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020BH\u0002J\b\u0010V\u001a\u00020-H\u0002J\b\u0010W\u001a\u00020-H\u0002J\b\u0010X\u001a\u00020-H\u0002J\b\u0010Y\u001a\u00020-H\u0002J\b\u0010Z\u001a\u00020-H\u0002J\b\u0010[\u001a\u00020-H\u0002J\b\u0010\\\u001a\u00020-H\u0002J\b\u0010]\u001a\u00020-H\u0002J\u0010\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0016J\b\u0010a\u001a\u00020-H\u0002J\b\u0010b\u001a\u00020-H\u0002J\b\u0010c\u001a\u00020-H\u0002J\u0010\u0010d\u001a\u00020-2\u0006\u0010e\u001a\u00020,H\u0016J(\u0010f\u001a\u00020-2\u0006\u0010_\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020iH\u0016J\b\u0010l\u001a\u00020-H\u0002J\b\u0010m\u001a\u00020-H\u0002J\u0010\u0010n\u001a\u00020-2\u0006\u0010_\u001a\u00020`H\u0016R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00130\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R*\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013@BX\u000e¢\u0006\b\n\u0000\"\u0004\b2\u00103R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u00104\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R+\u00109\u001a\u0002082\u0006\u0010\u001e\u001a\u0002088V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010&\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006o"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "addresseeSelectorService", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorService;", "context", "Landroid/content/Context;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeSelectorService;Landroid/content/Context;)V", "addressableTypes", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;", "addresseeTypes", "Landroidx/databinding/ObservableField;", "getAddresseeTypes", "()Landroidx/databinding/ObservableField;", "addresseesForSelection", "Landroidx/lifecycle/MutableLiveData;", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "getAddresseesForSelection", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "classSelectorIsVisible", "getClassSelectorIsVisible", "()Z", "setClassSelectorIsVisible", "(Z)V", "classSelectorIsVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "classes", "Lhu/ekreta/ellenorzo/addresseeselector/model/KretaClass;", "getClasses", "listItemSelectedListener", "Lkotlin/Function1;", "Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "", "getListItemSelectedListener", "()Lkotlin/jvm/functions/Function1;", "value", "notFilteredAddressees", "setNotFilteredAddressees", "(Ljava/util/List;)V", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "", "searchText", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "searchText$delegate", "createAddressee", "name", "kretaId", "", "type", "displayName", "(Ljava/lang/String;Ljava/lang/Long;Lhu/ekreta/ellenorzo/addresseeselector/model/AddresseeType;Ljava/lang/String;)Lhu/ekreta/ellenorzo/newmessage/model/Addressee;", "createListItemFromAdministratorsAddressee", "employeeDetails", "Lhu/ekreta/ellenorzo/addresseeselector/model/EmployeeDetails;", "addressType", "createListItemFromClassMasterAddressee", "createListItemFromDirectorsAddressee", "createListItemFromGuardian", "guardianEAdmin", "Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "createListItemFromSzmkRepresentative", "createListItemFromTeacherAddressee", "createTypeForClassMaster", "kotlin.jvm.PlatformType", "fetchAddressableClasses", "fetchAddressableGuardiansForClass", "classId", "fetchAddressableSzmkRepresentative", "fetchAddressableTypeList", "fetchAdministratorsAddressList", "fetchClassMastersAddressList", "fetchDirectorsAddressList", "fetchTeacherAddressList", "onAdministratorSelected", "onClassMasterSelected", "onClassSelected", "newValue", "", "onDirectorSelected", "onEmptySelected", "onGuardianSelected", "onItemSelected", "addressee", "onSearchTextChanged", "", "start", "", "before", "count", "onSzmkRepresentativeSelected", "onTeacherSelected", "onTypeSelected", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl extends AuthenticatedViewModel implements AddresseeSelectorViewModel {
    public static final /* synthetic */ KProperty[] z;

    /* renamed from: n  reason: collision with root package name */
    public final k<List<AddresseeType>> f4988n = new k<>();

    /* renamed from: o  reason: collision with root package name */
    public final k<List<KretaClass>> f4989o = new k<>();

    /* renamed from: p  reason: collision with root package name */
    public final r<List<AddresseeSelectorListItem>> f4990p = new r<>();

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f4991q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final Function1<Addressee, Unit> t;
    public List<AddresseeType> u;
    public List<AddresseeSelectorListItem> v;
    public final ProfileRepository w;
    public final AddresseeSelectorService x;
    public final Context y;

    static {
        Class<AddresseeSelectorViewModelImpl> cls = AddresseeSelectorViewModelImpl.class;
        z = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "classSelectorIsVisible", "getClassSelectorIsVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "searchText", "getSearchText()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddresseeSelectorViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, AddresseeSelectorService addresseeSelectorService, Context context) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(addresseeSelectorService, "addresseeSelectorService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.w = profileRepository;
        this.x = addresseeSelectorService;
        this.y = context;
        this.f4991q = DataBindingViewModel.boundBoolean$default(this, this, 19, false, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundString$default(this, this, 44, (String) null, (Function1) null, 6, (Object) null);
        this.t = new AddresseeSelectorViewModelImpl$listItemSelectedListener$1(this);
        this.v = CollectionsKt__CollectionsKt.emptyList();
        n<R> a2 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchAddressableTypeList$1(this)).d((f<? super c>) new AddresseeSelectorViewModelImpl$fetchAddressableTypeList$2(this)).c((a) new AddresseeSelectorViewModelImpl$fetchAddressableTypeList$3(this)).a(k.b.z.a.a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getAct…dSchedulers.mainThread())");
        a(b.a(a2, new AddresseeSelectorViewModelImpl$fetchAddressableTypeList$5(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchAddressableTypeList$4(this), 2));
    }

    public k<List<AddresseeType>> J1() {
        return this.f4988n;
    }

    public r<List<AddresseeSelectorListItem>> L1() {
        return this.f4990p;
    }

    public boolean X0() {
        return ((Boolean) this.f4991q.getValue(this, z[0])).booleanValue();
    }

    public Function1<Addressee, Unit> Z1() {
        return this.t;
    }

    public final Addressee a(String str, Long l2, AddresseeType addresseeType, String str2) {
        return new Addressee((Long) null, str, l2, Long.valueOf(addresseeType.c()), addresseeType.a(), addresseeType.e(), addresseeType.d(), addresseeType.b(), str2, false, ConstantsKt.MINIMUM_BLOCK_SIZE, (DefaultConstructorMarker) null);
    }

    public final void b(List<AddresseeSelectorListItem> list) {
        L1().setValue(AddresseeFilter.INSTANCE.a(list, h1()));
        this.v = list;
    }

    public final AddresseeSelectorListItem c(EmployeeDetails employeeDetails, AddresseeType addresseeType) {
        String str;
        String c = employeeDetails.c();
        String str2 = c != null ? c : "";
        String d2 = employeeDetails.d();
        if (d2 != null) {
            str = d2;
        } else {
            str = "";
        }
        String c2 = employeeDetails.c();
        Long b = employeeDetails.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.getString(R.string.addresseeSelector_prefixDirector));
        sb.append(' ');
        String c3 = employeeDetails.c();
        if (c3 == null) {
            c3 = "";
        }
        sb.append(c3);
        return new AddresseeSelectorListItem(str2, str, "", a(c2, b, addresseeType, sb.toString()), Z1());
    }

    public void c(boolean z2) {
        this.f4991q.setValue(this, z[0], Boolean.valueOf(z2));
    }

    public final AddresseeSelectorListItem d(EmployeeDetails employeeDetails, AddresseeType addresseeType) {
        String c = employeeDetails.c();
        String str = c != null ? c : "";
        String c2 = employeeDetails.c();
        Long b = employeeDetails.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.getString(R.string.addresseeSelector_prefixTeacher));
        sb.append(' ');
        String c3 = employeeDetails.c();
        if (c3 == null) {
            c3 = "";
        }
        sb.append(c3);
        return new AddresseeSelectorListItem(str, "", "", a(c2, b, addresseeType, sb.toString()), Z1());
    }

    public void d(boolean z2) {
        this.r.setValue(this, z[1], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.r.getValue(this, z[1])).booleanValue();
    }

    public String h1() {
        return (String) this.s.getValue(this, z[2]);
    }

    public void k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, z[2], str);
    }

    public k<List<KretaClass>> x1() {
        return this.f4989o;
    }

    public void b(Object obj) {
        AddresseeType addresseeType;
        T t2;
        AddresseeType addresseeType2;
        T t3;
        AddresseeType addresseeType3;
        T t4;
        AddresseeType addresseeType4;
        T t5;
        AddresseeType addresseeType5;
        T t6;
        Intrinsics.checkParameterIsNotNull(obj, "newValue");
        String a2 = ((AddresseeType) obj).a();
        switch (a2.hashCode()) {
            case -1276399727:
                if (a2.equals("ADMINISZTRATOROK")) {
                    c(false);
                    List<AddresseeType> list = this.u;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                t2 = it.next();
                                if (Intrinsics.areEqual((Object) ((AddresseeType) t2).a(), (Object) "ADMIN")) {
                                }
                            } else {
                                t2 = null;
                            }
                        }
                        addresseeType = (AddresseeType) t2;
                    } else {
                        addresseeType = null;
                    }
                    if (addresseeType != null) {
                        n<R> c = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchAdministratorsAddressList$1(this));
                        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…read())\n                }");
                        a(b.a(c, new AddresseeSelectorViewModelImpl$fetchAdministratorsAddressList$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchAdministratorsAddressList$2(this, addresseeType), 2));
                        return;
                    }
                    return;
                }
                return;
            case -1185084827:
                if (a2.equals("GONDVISELOK")) {
                    c(true);
                    b((List<AddresseeSelectorListItem>) CollectionsKt__CollectionsKt.emptyList());
                    n<R> c2 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchAddressableClasses$1(this));
                    Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…inThread())\n            }");
                    a(b.a(c2, new AddresseeSelectorViewModelImpl$fetchAddressableClasses$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchAddressableClasses$2(this), 2));
                    return;
                }
                return;
            case -1042438099:
                if (a2.equals("OSZTALYFONOKOK")) {
                    c(false);
                    List<AddresseeType> list2 = this.u;
                    if (list2 != null) {
                        Iterator<T> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                t3 = it2.next();
                                if (Intrinsics.areEqual((Object) ((AddresseeType) t3).a(), (Object) "OSZTALYFONOK")) {
                                }
                            } else {
                                t3 = null;
                            }
                        }
                        addresseeType2 = (AddresseeType) t3;
                    } else {
                        addresseeType2 = null;
                    }
                    if (addresseeType2 != null) {
                        n<R> c3 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchClassMastersAddressList$1(this));
                        Intrinsics.checkExpressionValueIsNotNull(c3, "profileRepository.getAct…read())\n                }");
                        a(b.a(c3, new AddresseeSelectorViewModelImpl$fetchClassMastersAddressList$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchClassMastersAddressList$2(this, addresseeType2), 2));
                        return;
                    }
                    return;
                }
                return;
            case -824154930:
                if (a2.equals("TANAROK")) {
                    c(false);
                    List<AddresseeType> list3 = this.u;
                    if (list3 != null) {
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                t4 = it3.next();
                                if (Intrinsics.areEqual((Object) ((AddresseeType) t4).a(), (Object) "TANAR")) {
                                }
                            } else {
                                t4 = null;
                            }
                        }
                        addresseeType3 = (AddresseeType) t4;
                    } else {
                        addresseeType3 = null;
                    }
                    if (addresseeType3 != null) {
                        n<R> c4 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchTeacherAddressList$1(this));
                        Intrinsics.checkExpressionValueIsNotNull(c4, "profileRepository.getAct…read())\n                }");
                        a(b.a(c4, new AddresseeSelectorViewModelImpl$fetchTeacherAddressList$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchTeacherAddressList$2(this, addresseeType3), 2));
                        return;
                    }
                    return;
                }
                return;
            case 66096429:
                if (a2.equals("EMPTY")) {
                    c(false);
                    b((List<AddresseeSelectorListItem>) CollectionsKt__CollectionsKt.emptyList());
                    return;
                }
                return;
            case 241104903:
                if (a2.equals("SZMK_KEPVISELOK")) {
                    c(false);
                    List<AddresseeType> list4 = this.u;
                    if (list4 != null) {
                        Iterator<T> it4 = list4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                t5 = it4.next();
                                if (Intrinsics.areEqual((Object) ((AddresseeType) t5).a(), (Object) "SZMK_KEPVISELO")) {
                                }
                            } else {
                                t5 = null;
                            }
                        }
                        addresseeType4 = (AddresseeType) t5;
                    } else {
                        addresseeType4 = null;
                    }
                    if (addresseeType4 != null) {
                        n<R> c5 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchAddressableSzmkRepresentative$1(this));
                        Intrinsics.checkExpressionValueIsNotNull(c5, "profileRepository.getAct…read())\n                }");
                        a(b.a(c5, new AddresseeSelectorViewModelImpl$fetchAddressableSzmkRepresentative$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchAddressableSzmkRepresentative$2(this, addresseeType4), 2));
                        return;
                    }
                    return;
                }
                return;
            case 2141822221:
                if (a2.equals("IGAZGATOSAG")) {
                    c(false);
                    List<AddresseeType> list5 = this.u;
                    if (list5 != null) {
                        Iterator<T> it5 = list5.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                t6 = it5.next();
                                if (Intrinsics.areEqual((Object) ((AddresseeType) t6).a(), (Object) "IGAZGATOSAG")) {
                                }
                            } else {
                                t6 = null;
                            }
                        }
                        addresseeType5 = (AddresseeType) t6;
                    } else {
                        addresseeType5 = null;
                    }
                    if (addresseeType5 != null) {
                        n<R> c6 = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchDirectorsAddressList$1(this));
                        Intrinsics.checkExpressionValueIsNotNull(c6, "profileRepository.getAct…read())\n                }");
                        a(b.a(c6, new AddresseeSelectorViewModelImpl$fetchDirectorsAddressList$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchDirectorsAddressList$2(this, addresseeType5), 2));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final AddresseeSelectorListItem a(EmployeeDetails employeeDetails, AddresseeType addresseeType) {
        String c = employeeDetails.c();
        String str = c != null ? c : "";
        String string = this.y.getString(R.string.addresseeSelector_administrator);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…eeSelector_administrator)");
        String c2 = employeeDetails.c();
        Long b = employeeDetails.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.getString(R.string.addresseeSelector_prefixAdministrator));
        sb.append(' ');
        String c3 = employeeDetails.c();
        if (c3 == null) {
            c3 = "";
        }
        sb.append(c3);
        return new AddresseeSelectorListItem(str, string, "", a(c2, b, addresseeType, sb.toString()), Z1());
    }

    public void c(Addressee addressee) {
        Intrinsics.checkParameterIsNotNull(addressee, "addressee");
        Intent intent = new Intent();
        ExtensionsKt.a(intent, addressee);
        a((Function1<? super d, Unit>) new AddresseeSelectorViewModelImpl$onItemSelected$1(intent));
    }

    public void a(Object obj) {
        AddresseeType addresseeType;
        T t2;
        Intrinsics.checkParameterIsNotNull(obj, "newValue");
        long d2 = ((KretaClass) obj).d();
        List<AddresseeType> list = this.u;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (Intrinsics.areEqual((Object) ((AddresseeType) t2).a(), (Object) "GONDVISELO")) {
                    break;
                }
            }
            addresseeType = (AddresseeType) t2;
        } else {
            addresseeType = null;
        }
        if (addresseeType != null) {
            n<R> c = this.w.b().c(new AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$1(this, d2));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…read())\n                }");
            a(b.a(c, new AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$3(this), (Function0) null, new AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$2(this, addresseeType), 2));
        }
    }

    public final AddresseeSelectorListItem a(GuardianEAdmin guardianEAdmin, AddresseeType addresseeType) {
        String str;
        String str2;
        String a2 = guardianEAdmin.a();
        String str3 = a2 != null ? a2 : "";
        String c = guardianEAdmin.c();
        if (c != null) {
            str = c;
        } else {
            str = "";
        }
        String e = guardianEAdmin.e();
        if (e != null) {
            str2 = e;
        } else {
            str2 = "";
        }
        String a3 = guardianEAdmin.a();
        Long b = guardianEAdmin.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.getString(R.string.addresseeSelector_prefixGuardian));
        sb.append(' ');
        sb.append(guardianEAdmin.a());
        sb.append(" (");
        String e2 = guardianEAdmin.e();
        if (e2 == null) {
            e2 = "";
        }
        sb.append(e2);
        sb.append(", ");
        String d2 = guardianEAdmin.d();
        if (d2 == null) {
            d2 = "";
        }
        sb.append(d2);
        sb.append(')');
        return new AddresseeSelectorListItem(str3, str, str2, a(a3, b, addresseeType, sb.toString()), Z1());
    }

    public void a(CharSequence charSequence, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(charSequence, "newValue");
        L1().setValue(AddresseeFilter.INSTANCE.a(this.v, charSequence.toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem b(hu.ekreta.ellenorzo.addresseeselector.model.EmployeeDetails r11, hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType r12) {
        /*
            r10 = this;
            hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem r6 = new hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem
            java.lang.String r0 = r11.c()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            java.lang.Boolean r0 = r11.e()
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x0027
            android.content.Context r0 = r10.y
            r3 = 2131689794(0x7f0f0142, float:1.9008613E38)
            java.lang.String r0 = r0.getString(r3)
        L_0x0025:
            r3 = r0
            goto L_0x003c
        L_0x0027:
            java.lang.Boolean r0 = r11.f()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x003b
            android.content.Context r0 = r10.y
            r3 = 2131689795(0x7f0f0143, float:1.9008615E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x0025
        L_0x003b:
            r3 = r1
        L_0x003c:
            java.lang.String r0 = "createTypeForClassMaster(employeeDetails)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            java.lang.String r0 = r11.a()
            if (r0 == 0) goto L_0x0049
            r4 = r0
            goto L_0x004a
        L_0x0049:
            r4 = r1
        L_0x004a:
            java.lang.String r0 = r11.c()
            java.lang.Long r5 = r11.b()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = r10.y
            r9 = 2131689799(0x7f0f0147, float:1.9008624E38)
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            java.lang.String r9 = r11.c()
            if (r9 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r9 = r1
        L_0x0070:
            r7.append(r9)
            r7.append(r8)
            java.lang.String r11 = r11.a()
            if (r11 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r11 = r1
        L_0x007e:
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            hu.ekreta.ellenorzo.newmessage.model.Addressee r11 = r10.a((java.lang.String) r0, (java.lang.Long) r5, (hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType) r12, (java.lang.String) r11)
            kotlin.jvm.functions.Function1 r5 = r10.Z1()
            r0 = r6
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModelImpl.b(hu.ekreta.ellenorzo.addresseeselector.model.EmployeeDetails, hu.ekreta.ellenorzo.addresseeselector.model.AddresseeType):hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorListItem");
    }

    public final AddresseeSelectorListItem b(GuardianEAdmin guardianEAdmin, AddresseeType addresseeType) {
        String str;
        String a2 = guardianEAdmin.a();
        String str2 = a2 != null ? a2 : "";
        String d2 = guardianEAdmin.d();
        if (d2 != null) {
            str = d2;
        } else {
            str = "";
        }
        String a3 = guardianEAdmin.a();
        Long b = guardianEAdmin.b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.y.getString(R.string.addresseeSelector_prefixSzmk));
        sb.append(' ');
        String a4 = guardianEAdmin.a();
        if (a4 == null) {
            a4 = "";
        }
        sb.append(a4);
        sb.append(" (");
        sb.append(this.y.getString(R.string.addresseeSelector_infixSzmk));
        sb.append(' ');
        String d3 = guardianEAdmin.d();
        if (d3 == null) {
            d3 = "";
        }
        sb.append(d3);
        sb.append(')');
        return new AddresseeSelectorListItem(str2, "", str, a(a3, b, addresseeType, sb.toString()), Z1());
    }
}
