package hu.ekreta.ellenorzo.classmaster;

import android.content.Intent;
import android.net.Uri;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedListViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedListViewModel;", "Lhu/ekreta/ellenorzo/classmaster/ClassMaster;", "Lhu/ekreta/ellenorzo/classmaster/ClassMastersViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "classMasterRepository", "Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;Lhu/ekreta/ellenorzo/classmaster/ClassMasterRepository;)V", "observeLocalData", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "showEmptyEmailError", "", "showEmptyPhoneNumberError", "startCallPhoneChooser", "phoneNumber", "", "startSendEmailChooser", "email", "startSendSmsChooser", "updateLocalData", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: ClassMastersViewModelImpl.kt */
public final class ClassMastersViewModelImpl extends AuthenticatedListViewModel<ClassMaster> implements ClassMastersViewModel {
    public final GroupRepository t;
    public final ClassMasterRepository u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassMastersViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, GroupRepository groupRepository, ClassMasterRepository classMasterRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService, profileRepository);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        Intrinsics.checkParameterIsNotNull(classMasterRepository, "classMasterRepository");
        this.t = groupRepository;
        this.u = classMasterRepository;
        AuthenticatedListViewModel.start$default(this, new Function1<Profile, n<List<? extends ClassMaster>>>(this) {
            /* renamed from: a */
            public final n<List<ClassMaster>> invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((ClassMastersViewModelImpl) this.receiver).u.q(profile);
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
        }, new Function1<Profile, n<List<? extends ClassMaster>>>(this) {
            /* renamed from: a */
            public final n<List<ClassMaster>> invoke(Profile profile) {
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
        }, false, 4, (Object) null);
    }

    public static final /* synthetic */ n access$updateLocalData(ClassMastersViewModelImpl classMastersViewModelImpl, Profile profile) {
        n<R> c = classMastersViewModelImpl.t.D(profile).d(1).g(ClassMastersViewModelImpl$updateLocalData$1.INSTANCE).c(new ClassMastersViewModelImpl$updateLocalData$2(classMastersViewModelImpl, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "groupRepository\n        …)\n            }\n        }");
        return c;
    }

    public void c0() {
        DataBindingViewModel.showAlert$default(this, R.string.ClassMasterEmptyEmail, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
    }

    public void d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "email");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
    }

    public void e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
    }

    public void f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", "");
        DataBindingViewModel.startChooser$default(this, intent, 0, 2, (Object) null);
    }

    public void l0() {
        DataBindingViewModel.showAlert$default(this, R.string.ClassMasterEmptyPhoneNumber, (Integer) null, (Function1) null, (Integer) null, (Function1) null, 30, (Object) null);
    }

    public /* bridge */ /* synthetic */ void onSelect(ClassMaster classMaster) {
        onSelect(classMaster);
    }
}
