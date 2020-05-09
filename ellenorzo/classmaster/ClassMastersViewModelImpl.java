package p289hu.ekreta.ellenorzo.classmaster;

import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "classMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;)V", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "showEmptyEmailError", "", "showEmptyPhoneNumberError", "startCallPhoneChooser", "phoneNumber", "", "startSendEmailChooser", "email", "startSendSmsChooser", "updateLocalData", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.classmaster.ClassMastersViewModelImpl */
/* compiled from: ClassMastersViewModelImpl.kt */
public final class ClassMastersViewModelImpl extends AuthenticatedListViewModel<ClassMaster> implements ClassMastersViewModel {

    /* renamed from: s */
    public final GroupRepository f11869s;

    /* renamed from: t */
    public final ClassMasterRepository f11870t;

    public ClassMastersViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, GroupRepository groupRepository, ClassMasterRepository classMasterRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        Intrinsics.checkParameterIsNotNull(classMasterRepository, "classMasterRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService, profileRepository);
        this.f11869s = groupRepository;
        this.f11870t = classMasterRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, C5027n<List<? extends ClassMaster>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ClassMaster>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((ClassMastersViewModelImpl) this.receiver).f11870t.mo12259q(profile);
            }

            public final String getName() {
                return "observeLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(ClassMastersViewModelImpl.class);
            }

            public final String getSignature() {
                return "observeLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, new Function1<Profile, C5027n<List<? extends ClassMaster>>>(this) {
            /* renamed from: a */
            public final C5027n<List<ClassMaster>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ClassMastersViewModelImpl.access$updateLocalData((ClassMastersViewModelImpl) this.receiver, profile);
            }

            public final String getName() {
                return "updateLocalData";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(ClassMastersViewModelImpl.class);
            }

            public final String getSignature() {
                return "updateLocalData(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Observable;";
            }
        }, false, 4, null);
    }

    public static final /* synthetic */ C5027n access$updateLocalData(ClassMastersViewModelImpl classMastersViewModelImpl, Profile profile) {
        C5027n c = classMastersViewModelImpl.f11869s.mo12810D(profile).mo17237d(1).mo17246g(ClassMastersViewModelImpl$updateLocalData$1.INSTANCE).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new ClassMastersViewModelImpl$updateLocalData$2<Object,Object>(classMastersViewModelImpl, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "groupRepository\n        …)\n            }\n        }");
        return c;
    }

    /* renamed from: c0 */
    public void mo12298c0() {
        DataBindingViewModel.showAlert$default(this, C4014R.string.ClassMasterEmptyEmail, null, null, 6, null);
    }

    /* renamed from: d */
    public void mo12299d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "email");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        String str2 = "";
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str2);
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
    }

    /* renamed from: e */
    public void mo12300e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
    }

    /* renamed from: f */
    public void mo12301f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        Intent intent = new Intent("android.intent.action.SENDTO");
        StringBuilder sb = new StringBuilder();
        sb.append("smsto:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("sms_body", "");
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, null);
    }

    /* renamed from: l0 */
    public void mo12302l0() {
        DataBindingViewModel.showAlert$default(this, C4014R.string.ClassMasterEmptyPhoneNumber, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ void onSelect(ClassMaster classMaster) {
        onSelect(classMaster);
    }
}
