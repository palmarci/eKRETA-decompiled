package hu.ekreta.ellenorzo.profile;

import java.util.List;
import k.b.a0.d;
import k.b.b;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "profiles", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ UpdateProfileStrategyImpl c;
    public final /* synthetic */ Profile e;

    public UpdateProfileStrategyImpl$updateProfile$2(UpdateProfileStrategyImpl updateProfileStrategyImpl, Profile profile) {
        this.c = updateProfileStrategyImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<List<Profile>> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "profiles");
        return d.a(list).d(new UpdateProfileStrategyImpl$sam$io_reactivex_functions_Function$0(new Function1<Profile, b>(this.c.f6032d) {
            /* renamed from: a */
            public final b invoke(Profile profile) {
                Intrinsics.checkParameterIsNotNull(profile, "p1");
                return ((DeleteProfileStrategy) this.receiver).e(profile);
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
        })).a(this.c.f6031a.d(this.e.m()).d(1));
    }
}
