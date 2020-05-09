package p289hu.ekreta.ellenorzo.secure;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.secure.RealmSecureStoreImpl$encriptionKey$2 */
/* compiled from: RealmSecureStoreImpl.kt */
public final class RealmSecureStoreImpl$encriptionKey$2 extends Lambda implements Function0<byte[]> {

    /* renamed from: c */
    public final /* synthetic */ RealmSecureStoreImpl f14772c;

    public RealmSecureStoreImpl$encriptionKey$2(RealmSecureStoreImpl realmSecureStoreImpl) {
        this.f14772c = realmSecureStoreImpl;
        super(0);
    }

    public final byte[] invoke() {
        return Base64.decode(this.f14772c.mo15657b(), 1);
    }
}
