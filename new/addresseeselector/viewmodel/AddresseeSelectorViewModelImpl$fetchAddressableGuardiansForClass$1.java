package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import hu.ekreta.ellenorzo.addresseeselector.model.GuardianEAdmin;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.a0.c;
import k.b.b0.a;
import k.b.b0.f;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/addresseeselector/model/GuardianEAdmin;", "kotlin.jvm.PlatformType", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AddresseeSelectorViewModelImpl.kt */
public final class AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AddresseeSelectorViewModelImpl c;
    public final /* synthetic */ long e;

    public AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$1(AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl, long j2) {
        this.c = addresseeSelectorViewModelImpl;
        this.e = j2;
    }

    /* renamed from: a */
    public final n<List<GuardianEAdmin>> apply(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        AddresseeSelectorViewModelImpl addresseeSelectorViewModelImpl = this.c;
        return addresseeSelectorViewModelImpl.a(addresseeSelectorViewModelImpl.x.a(profile.d(), this.e)).d((f<? super c>) new f<c>(this) {
            public final /* synthetic */ AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$1 c;

            {
                this.c = r1;
            }

            public final void a() {
                this.c.c.d(true);
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                c cVar = (c) obj;
                a();
            }
        }).c((a) new a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AddresseeSelectorViewModelImpl$fetchAddressableGuardiansForClass$1 f4993a;

            {
                this.f4993a = r1;
            }

            public final void run() {
                this.f4993a.c.d(false);
            }
        }).a(k.b.z.a.a.a());
    }
}
