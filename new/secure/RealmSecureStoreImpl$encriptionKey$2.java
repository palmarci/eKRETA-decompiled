package hu.ekreta.ellenorzo.secure;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: RealmSecureStoreImpl.kt */
public final class RealmSecureStoreImpl$encriptionKey$2 extends Lambda implements Function0<byte[]> {
    public final /* synthetic */ RealmSecureStoreImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealmSecureStoreImpl$encriptionKey$2(RealmSecureStoreImpl realmSecureStoreImpl) {
        super(0);
        this.c = realmSecureStoreImpl;
    }

    public final byte[] invoke() {
        return Base64.decode(this.c.b(), 1);
    }
}
