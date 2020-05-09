package p289hu.ekreta.ellenorzo.classmaster;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020 H\u0002J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020 H\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u00102\u001a\u00020 H\u0002J\b\u00106\u001a\u000200H\u0016J\b\u00107\u001a\u000200H\u0016R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R+\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020 8V@VX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\u0010\u0010+\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\u00020\u0011*\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00068"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "context", "Landroid/content/Context;", "classMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Landroid/content/Context;Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;)V", "<set-?>", "", "callEnabled", "getCallEnabled", "()Z", "setCallEnabled", "(Z)V", "callEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "callIntent", "Landroid/content/Intent;", "emailEnabled", "getEmailEnabled", "setEmailEnabled", "emailEnabled$delegate", "emailIntent", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "smsEnabled", "getSmsEnabled", "setSmsEnabled", "smsEnabled$delegate", "smsIntent", "canResolve", "getCanResolve", "(Landroid/content/Intent;)Z", "callPhone", "", "createCallPhoneIntent", "phoneNumber", "createSendEmailIntent", "email", "createSendSmsIntent", "sendEmail", "sendSMS", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMasterViewModelImpl */
/* compiled from: ClassMasterViewModelImpl.kt */
public final class ClassMasterViewModelImpl extends AuthenticatedViewModel implements ClassMasterViewModel {

    /* renamed from: v */
    public static final /* synthetic */ KProperty[] f11827v;

    /* renamed from: m */
    public final ReadWriteProperty f11828m = DataBindingViewModel.boundString$default(this, this, 87, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f11829n;

    /* renamed from: o */
    public final ReadWriteProperty f11830o;

    /* renamed from: p */
    public final ReadWriteProperty f11831p;

    /* renamed from: q */
    public Intent f11832q;

    /* renamed from: r */
    public Intent f11833r;

    /* renamed from: s */
    public Intent f11834s;

    /* renamed from: t */
    public final Context f11835t;

    /* renamed from: u */
    public final ClassMasterRepository f11836u;

    static {
        Class<ClassMasterViewModelImpl> cls = ClassMasterViewModelImpl.class;
        f11827v = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "name", "getName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "emailEnabled", "getEmailEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "smsEnabled", "getSmsEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "callEnabled", "getCallEnabled()Z"))};
    }

    public ClassMasterViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, Context context, ClassMasterRepository classMasterRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(classMasterRepository, "classMasterRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11835t = context;
        this.f11836u = classMasterRepository;
        this.f11829n = DataBindingViewModel.boundBoolean$default(this, this, 82, false, null, 6, null);
        this.f11830o = DataBindingViewModel.boundBoolean$default(this, this, 28, false, null, 6, null);
        this.f11831p = DataBindingViewModel.boundBoolean$default(this, this, 57, false, null, 6, null);
        C5027n c = profileRepository.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ ClassMasterViewModelImpl f11837c;

            {
                this.f11837c = r1;
            }

            /* renamed from: a */
            public final C5027n<ClassMaster> apply(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
                ClassMasterViewModelImpl classMasterViewModelImpl = this.f11837c;
                return classMasterViewModelImpl.mo11505a(classMasterViewModelImpl.f11836u.mo12258l(profile)).mo17237d(1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…   .take(1)\n            }");
        mo16413a(C4998b.m16842a(c, (Function1) new Function1<Throwable, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ClassMasterViewModelImpl f11839c;

            {
                this.f11839c = r1;
            }

            /* renamed from: a */
            public final void mo12281a(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
                DataBindingViewModel.showAlert$default(this.f11839c, C4014R.string.ClassMaster_No_Contact_Data_Available, null, null, 6, null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12281a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }, (Function0) null, (Function1) new Function1<ClassMaster, Unit>(this) {

            /* renamed from: c */
            public final /* synthetic */ ClassMasterViewModelImpl f11838c;

            {
                this.f11838c = r1;
            }

            /* renamed from: a */
            public final void mo12280a(ClassMaster classMaster) {
                this.f11838c.mo12278u(classMaster.mo12222f());
                String str = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster.mo12219b());
                boolean z = false;
                if (!(str == null || StringsKt__StringsJVMKt.isBlank(str))) {
                    ClassMasterViewModelImpl classMasterViewModelImpl = this.f11838c;
                    classMasterViewModelImpl.f11832q = classMasterViewModelImpl.mo12276s(str);
                    ClassMasterViewModelImpl classMasterViewModelImpl2 = this.f11838c;
                    Intent access$getEmailIntent$p = classMasterViewModelImpl2.f11832q;
                    if (access$getEmailIntent$p == null) {
                        Intrinsics.throwNpe();
                    }
                    classMasterViewModelImpl2.mo12273c(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl2, access$getEmailIntent$p));
                }
                String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(classMaster.mo12223g());
                if (str2 == null || StringsKt__StringsJVMKt.isBlank(str2)) {
                    z = true;
                }
                if (!z) {
                    ClassMasterViewModelImpl classMasterViewModelImpl3 = this.f11838c;
                    Intent access$createSendSmsIntent = classMasterViewModelImpl3.mo12277t(str2);
                    ClassMasterViewModelImpl classMasterViewModelImpl4 = this.f11838c;
                    classMasterViewModelImpl4.mo12274d(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl4, access$createSendSmsIntent));
                    classMasterViewModelImpl3.f11833r = access$createSendSmsIntent;
                    ClassMasterViewModelImpl classMasterViewModelImpl5 = this.f11838c;
                    Intent access$createCallPhoneIntent = classMasterViewModelImpl5.mo12275r(str2);
                    ClassMasterViewModelImpl classMasterViewModelImpl6 = this.f11838c;
                    classMasterViewModelImpl6.mo12272b(ClassMasterViewModelImpl.access$getCanResolve$p(classMasterViewModelImpl6, access$createCallPhoneIntent));
                    classMasterViewModelImpl5.f11834s = access$createCallPhoneIntent;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12280a((ClassMaster) obj);
                return Unit.INSTANCE;
            }
        }, 2));
    }

    public static final /* synthetic */ boolean access$getCanResolve$p(ClassMasterViewModelImpl classMasterViewModelImpl, Intent intent) {
        return intent.resolveActivity(classMasterViewModelImpl.f11835t.getPackageManager()) != null;
    }

    /* renamed from: G0 */
    public boolean mo12265G0() {
        return ((Boolean) this.f11831p.getValue(this, f11827v[3])).booleanValue();
    }

    /* renamed from: P0 */
    public boolean mo12266P0() {
        return ((Boolean) this.f11829n.getValue(this, f11827v[1])).booleanValue();
    }

    /* renamed from: S0 */
    public void mo12267S0() {
        Intent intent = this.f11834s;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
        }
    }

    /* renamed from: a1 */
    public void mo12268a1() {
        Intent intent = this.f11833r;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
        }
    }

    /* renamed from: b */
    public void mo12272b(boolean z) {
        this.f11831p.setValue(this, f11827v[3], Boolean.valueOf(z));
    }

    /* renamed from: b1 */
    public void mo12269b1() {
        Intent intent = this.f11832q;
        if (intent != null) {
            DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
        }
    }

    /* renamed from: c */
    public void mo12273c(boolean z) {
        this.f11829n.setValue(this, f11827v[1], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo12274d(boolean z) {
        this.f11830o.setValue(this, f11827v[2], Boolean.valueOf(z));
    }

    public String getName() {
        return (String) this.f11828m.getValue(this, f11827v[0]);
    }

    /* renamed from: n1 */
    public boolean mo12271n1() {
        return ((Boolean) this.f11830o.getValue(this, f11827v[2])).booleanValue();
    }

    /* renamed from: r */
    public final Intent mo12275r(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        return intent;
    }

    /* renamed from: s */
    public final Intent mo12276s(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        String str2 = "";
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str2);
        return intent;
    }

    /* renamed from: t */
    public final Intent mo12277t(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        StringBuilder sb = new StringBuilder();
        sb.append("smsto:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("sms_body", "");
        return intent;
    }

    /* renamed from: u */
    public void mo12278u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11828m.setValue(this, f11827v[0], str);
    }
}
