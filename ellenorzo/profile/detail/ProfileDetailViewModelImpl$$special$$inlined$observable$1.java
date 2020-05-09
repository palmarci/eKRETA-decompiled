package p289hu.ekreta.ellenorzo.profile.detail;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class ProfileDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Profile> {

    /* renamed from: c */
    public final /* synthetic */ ProfileDetailViewModelImpl f14589c;

    public ProfileDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, ProfileDetailViewModelImpl profileDetailViewModelImpl) {
        this.f14589c = profileDetailViewModelImpl;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Profile profile, Profile profile2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Profile profile3 = profile2;
        Profile profile4 = profile;
        if (profile3 != null) {
            this.f14589c.mo14239w(profile3.mo14069z());
            this.f14589c.mo14236t(profile3.mo14048h());
            this.f14589c.mo14235s(UtilsKt.m14828a(profile3.mo14047g()));
            this.f14589c.mo14237u(profile3.mo14061t());
            this.f14589c.mo14238v(profile3.mo14059r());
            this.f14589c.mo14234r(CollectionsKt___CollectionsKt.joinToString$default(profile3.mo14046f(), "\n\n", null, null, 0, null, null, 62, null));
            ProfileDetailViewModelImpl profileDetailViewModelImpl = this.f14589c;
            ProfileRepository access$getProfileRepository$p = profileDetailViewModelImpl.f14588s;
            Profile P1 = this.f14589c.mo14233P1();
            if (P1 == null) {
                Intrinsics.throwNpe();
            }
            C4663c a = access$getProfileRepository$p.mo14199e(P1.mo14054m()).mo17192a((C4673f<? super T>) new C4313xadb7e580<Object>(this), (C4673f<? super Throwable>) new C4314xadb7e581<Object>(this));
            Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getGua…w() } }\n                )");
            profileDetailViewModelImpl.mo16413a(a);
        }
    }
}
