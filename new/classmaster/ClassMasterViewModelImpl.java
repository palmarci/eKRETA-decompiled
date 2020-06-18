package hu.ekreta.ellenorzo.classmaster;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import k.b.b0.h;
import k.b.f0.b;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\"H\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\"H\u0002J\b\u00108\u001a\u000202H\u0016J\b\u00109\u001a\u000202H\u0016R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0010\u0010!\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R+\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\"8V@VX\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R\u0010\u0010-\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010.\u001a\u00020\u0013*\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006:"}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "classMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;)V", "<set-?>", "", "callEnabled", "getCallEnabled", "()Z", "setCallEnabled", "(Z)V", "callEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "callIntent", "Landroid/content/Intent;", "emailEnabled", "getEmailEnabled", "setEmailEnabled", "emailEnabled$delegate", "emailIntent", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "smsEnabled", "getSmsEnabled", "setSmsEnabled", "smsEnabled$delegate", "smsIntent", "canResolve", "getCanResolve", "(Landroid/content/Intent;)Z", "callPhone", "", "createCallPhoneIntent", "phoneNumber", "createSendEmailIntent", "email", "createSendSmsIntent", "sendEmail", "sendSMS", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMasterViewModelImpl.kt */
public final class ClassMasterViewModelImpl extends AuthenticatedViewModel implements ClassMasterViewModel {
    public static final /* synthetic */ KProperty[] w;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5278n = DataBindingViewModel.boundString$default(this, this, 87, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5279o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5280p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5281q;
    public Intent r;
    public Intent s;
    public Intent t;
    public final Context u;
    public final ClassMasterRepository v;

    static {
        Class<ClassMasterViewModelImpl> cls = ClassMasterViewModelImpl.class;
        w = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "name", "getName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emailEnabled", "getEmailEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "smsEnabled", "getSmsEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "callEnabled", "getCallEnabled()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassMasterViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context, ClassMasterRepository classMasterRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(classMasterRepository, "classMasterRepository");
        this.u = context;
        this.v = classMasterRepository;
        this.f5279o = DataBindingViewModel.boundBoolean$default(this, this, 82, false, (Function1) null, 6, (Object) null);
        this.f5280p = DataBindingViewModel.boundBoolean$default(this, this, 28, false, (Function1) null, 6, (Object) null);
        this.f5281q = DataBindingViewModel.boundBoolean$default(this, this, 57, false, (Function1) null, 6, (Object) null);
        n<R> c = profileRepository.b().c(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ ClassMasterViewModelImpl c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<ClassMaster> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
                ClassMasterViewModelImpl classMasterViewModelImpl = this.c;
                return classMasterViewModelImpl.a(classMasterViewModelImpl.v.l(profile)).d(1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…   .take(1)\n            }");
        a(b.a(c, new Function1<Throwable, Unit>(this) {
            public final /* synthetic */ ClassMasterViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showAlert$default(this.c, R.string.ClassMaster_No_Contact_Data_Available, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, new Function1<ClassMaster, Unit>(this) {
            public final /* synthetic */ ClassMasterViewModelImpl c;

            {
                this.c = r1;
            }

            public final void a(ClassMaster classMaster) {
                this.c.t(classMaster.f());
                String str = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster.b());
                boolean z = false;
                if (!(str == null || StringsKt__StringsJVMKt.isBlank(str))) {
                    ClassMasterViewModelImpl classMasterViewModelImpl = this.c;
                    classMasterViewModelImpl.r = classMasterViewModelImpl.r(str);
                    ClassMasterViewModelImpl classMasterViewModelImpl2 = this.c;
                    Intent access$getEmailIntent$p = classMasterViewModelImpl2.r;
                    if (access$getEmailIntent$p == null) {
                        Intrinsics.throwNpe();
                    }
                    classMasterViewModelImpl2.d(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl2, access$getEmailIntent$p));
                }
                String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster.g());
                if (str2 == null || StringsKt__StringsJVMKt.isBlank(str2)) {
                    z = true;
                }
                if (!z) {
                    ClassMasterViewModelImpl classMasterViewModelImpl3 = this.c;
                    Intent access$createSendSmsIntent = classMasterViewModelImpl3.s(str2);
                    ClassMasterViewModelImpl classMasterViewModelImpl4 = this.c;
                    classMasterViewModelImpl4.e(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl4, access$createSendSmsIntent));
                    classMasterViewModelImpl3.s = access$createSendSmsIntent;
                    ClassMasterViewModelImpl classMasterViewModelImpl5 = this.c;
                    Intent access$createCallPhoneIntent = classMasterViewModelImpl5.q(str2);
                    ClassMasterViewModelImpl classMasterViewModelImpl6 = this.c;
                    classMasterViewModelImpl6.c(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl6, access$createCallPhoneIntent));
                    classMasterViewModelImpl5.t = access$createCallPhoneIntent;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ClassMaster) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public static final /* synthetic */ boolean access$getCanResolve$p(ClassMasterViewModelImpl classMasterViewModelImpl, Intent intent) {
        return intent.resolveActivity(classMasterViewModelImpl.u.getPackageManager()) != null;
    }

    public boolean G0() {
        return ((Boolean) this.f5281q.getValue(this, w[3])).booleanValue();
    }

    public boolean S0() {
        return ((Boolean) this.f5279o.getValue(this, w[1])).booleanValue();
    }

    public void V0() {
        Intent intent = this.t;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
        }
    }

    public void c(boolean z) {
        this.f5281q.setValue(this, w[3], Boolean.valueOf(z));
    }

    public void d(boolean z) {
        this.f5279o.setValue(this, w[1], Boolean.valueOf(z));
    }

    public void e(boolean z) {
        this.f5280p.setValue(this, w[2], Boolean.valueOf(z));
    }

    public void e1() {
        Intent intent = this.s;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
        }
    }

    public void f1() {
        Intent intent = this.r;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
        }
    }

    public String getName() {
        return (String) this.f5278n.getValue(this, w[0]);
    }

    public final Intent q(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        return intent;
    }

    public final Intent r(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        return intent;
    }

    public final Intent s(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", "");
        return intent;
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5278n.setValue(this, w[0], str);
    }

    public boolean u1() {
        return ((Boolean) this.f5280p.getValue(this, w[2])).booleanValue();
    }
}
