package hu.ekreta.ellenorzo.profile.detail;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import k.b.a0.c;
import k.b.b0.f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class ProfileDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Profile> {
    public final /* synthetic */ ProfileDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        super(obj2);
        this.c = profileDetailViewModelImpl;
    }

    public void afterChange(KProperty<?> kProperty, Profile profile, Profile profile2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Profile profile3 = profile2;
        Profile profile4 = profile;
        if (profile3 != null) {
            this.c.v(profile3.z());
            this.c.s(profile3.h());
            this.c.r(UtilsKt.a(profile3.g()));
            this.c.t(profile3.t());
            this.c.u(profile3.r());
            this.c.q(CollectionsKt___CollectionsKt.joinToString$default(profile3.f(), "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            ProfileDetailViewModelImpl profileDetailViewModelImpl = this.c;
            ProfileRepository access$getProfileRepository$p = profileDetailViewModelImpl.t;
            Profile Z1 = this.c.Z1();
            if (Z1 == null) {
                Intrinsics.throwNpe();
            }
            c a2 = access$getProfileRepository$p.e(Z1.m()).a(new ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(this), (f<? super Throwable>) new ProfileDetailViewModelImpl$$special$$inlined$observable$1$lambda$2(this));
            Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getGua…w() } }\n                )");
            profileDetailViewModelImpl.a(a2);
        }
    }
}
