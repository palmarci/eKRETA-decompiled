package hu.ekreta.ellenorzo.authentication;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "Lhu/ekreta/ellenorzo/authentication/AuthenticationState;", "Lhu/ekreta/ellenorzo/authentication/WithProfile;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "(Lhu/ekreta/ellenorzo/profile/Profile;)V", "getProfile", "()Lhu/ekreta/ellenorzo/profile/Profile;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AuthenticationState.kt */
public final class LoggedIn extends AuthenticationState implements WithProfile {
    public final Profile b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggedIn(Profile profile) {
        super(true, false, (DefaultConstructorMarker) null);
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        this.b = profile;
    }

    public static /* synthetic */ LoggedIn copy$default(LoggedIn loggedIn, Profile profile, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            profile = loggedIn.a();
        }
        return loggedIn.a(profile);
    }

    public final LoggedIn a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return new LoggedIn(profile);
    }

    public Profile a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LoggedIn) && Intrinsics.areEqual((Object) a(), (Object) ((LoggedIn) obj).a());
        }
        return true;
    }

    public int hashCode() {
        Profile a2 = a();
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("LoggedIn(profile=");
        a2.append(a());
        a2.append(")");
        return a2.toString();
    }
}
