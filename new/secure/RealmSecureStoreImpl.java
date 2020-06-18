package hu.ekreta.ellenorzo.secure;

import android.content.SharedPreferences;
import android.util.Base64;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.security.SecureRandom;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\n \u001b*\u0004\u0018\u00010\b0\bH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\bH\u0002R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/secure/RealmSecureStoreImpl;", "Lhu/ekreta/ellenorzo/secure/RealmSecureStore;", "keyStore", "Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;Landroid/content/SharedPreferences;)V", "<set-?>", "", "encodedAndPersistedEncryptionKey", "getEncodedAndPersistedEncryptionKey", "()Ljava/lang/String;", "setEncodedAndPersistedEncryptionKey", "(Ljava/lang/String;)V", "encodedAndPersistedEncryptionKey$delegate", "Lkotlin/properties/ReadWriteProperty;", "encriptionKey", "", "getEncriptionKey", "()[B", "encriptionKey$delegate", "Lkotlin/Lazy;", "getKeyStore", "()Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "generateAndSaveKey", "kotlin.jvm.PlatformType", "generateRandomKey", "getKeyAsString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RealmSecureStoreImpl.kt */
public final class RealmSecureStoreImpl implements RealmSecureStore {
    public static final /* synthetic */ KProperty[] e;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteProperty f6101a = ExtensionsKt.a(this.f6102d, "realm-encoded-encryption-key", (String) null);
    public final Lazy b = LazyKt__LazyJVMKt.lazy(new RealmSecureStoreImpl$encriptionKey$2(this));
    public final KeyStoreAdapter c;

    /* renamed from: d  reason: collision with root package name */
    public final SharedPreferences f6102d;

    static {
        Class<RealmSecureStoreImpl> cls = RealmSecureStoreImpl.class;
        e = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "encodedAndPersistedEncryptionKey", "getEncodedAndPersistedEncryptionKey()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "encriptionKey", "getEncriptionKey()[B"))};
    }

    public RealmSecureStoreImpl(KeyStoreAdapter keyStoreAdapter, SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(keyStoreAdapter, "keyStore");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        this.c = keyStoreAdapter;
        this.f6102d = sharedPreferences;
    }

    public byte[] a() {
        Lazy lazy = this.b;
        KProperty kProperty = e[1];
        return (byte[]) lazy.getValue();
    }

    public final String b() {
        String str = null;
        try {
            String str2 = (String) this.f6101a.getValue(this, e[0]);
            if (str2 != null) {
                str = this.c.b(str2);
            }
        } catch (Exception e2) {
            RealmSecureStoreImplKt.access$getLogger$p().b("Failed to decode encryption key", e2);
            this.f6101a.setValue(this, e[0], null);
        }
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[64];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 0);
        this.c.a();
        KeyStoreAdapter keyStoreAdapter = this.c;
        Intrinsics.checkExpressionValueIsNotNull(encodeToString, "it");
        this.f6101a.setValue(this, e[0], keyStoreAdapter.a(encodeToString));
        Intrinsics.checkExpressionValueIsNotNull(encodeToString, "generateAndSaveKey()");
        return encodeToString;
    }
}
