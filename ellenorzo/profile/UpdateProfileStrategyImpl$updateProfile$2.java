package p289hu.ekreta.ellenorzo.profile;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "profiles", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl$updateProfile$2 */
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ UpdateProfileStrategyImpl f14550c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14551e;

    public UpdateProfileStrategyImpl$updateProfile$2(UpdateProfileStrategyImpl updateProfileStrategyImpl, Profile profile) {
        this.f14550c = updateProfileStrategyImpl;
        this.f14551e = profile;
    }

    /* renamed from: a */
    public final C5027n<List<Profile>> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "profiles");
        return C4664d.m16038a((Iterable<? extends T>) list).mo17236d((C4675h<? super T, ? extends C4991d>) new UpdateProfileStrategyImpl$sam$io_reactivex_functions_Function$0<Object,Object>(new Function1<Profile, C4667b>(this.f14550c.f14547d) {
            /* renamed from: a */
            public final C4667b invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((DeleteProfileStrategy) this.receiver).mo14011e(profile);
            }

            public final String getName() {
                return "deleteProfile";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(DeleteProfileStrategy.class);
            }

            public final String getSignature() {
                return "deleteProfile(Lhu/ekreta/ellenorzo/profile/Profile;)Lio/reactivex/Completable;";
            }
        })).mo16976a((C5030q<T>) this.f14550c.f14544a.mo14195d(this.f14551e.mo14054m()).mo17237d(1));
    }
}
