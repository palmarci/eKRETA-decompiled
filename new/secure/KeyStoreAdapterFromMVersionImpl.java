package hu.ekreta.ellenorzo.secure;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0017J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapterFromMVersionImpl;", "Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "keyStore", "Ljava/security/KeyStore;", "createKeyGenerator", "Ljavax/crypto/KeyGenerator;", "createKeyParKeyGenParameterSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "decode", "", "encryptedText", "decryptData", "", "encrypted", "encode", "plainText", "encryptData", "input", "generateAndSaveKey", "", "getSecretKey", "Ljava/security/Key;", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: KeyStoreAdapterFromMVersionImpl.kt */
public final class KeyStoreAdapterFromMVersionImpl implements KeyStoreAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final KeyStore f6097a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapterFromMVersionImpl$Companion;", "", "()V", "AES_MODE", "", "FIXED_IV", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: KeyStoreAdapterFromMVersionImpl.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KeyStoreAdapterFromMVersionImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Intrinsics.checkExpressionValueIsNotNull(instance, "KeyStore.getInstance(Key…ORE).apply { load(null) }");
        this.f6097a = instance;
    }

    public void a() {
        this.f6097a.deleteEntry("KretaEllenorzoNativ");
        if (!this.f6097a.containsAlias("KretaEllenorzoNativ")) {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("KretaEllenorzoNativ", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setRandomizedEncryptionRequired(false).build();
            Intrinsics.checkExpressionValueIsNotNull(build, "KeyGenParameterSpec.Buil…lse)\n            .build()");
            instance.init(build);
            Intrinsics.checkExpressionValueIsNotNull(instance, "keyGenerator");
            instance.generateKey();
        }
    }

    public final Key b() throws Exception {
        Key key = this.f6097a.getKey("KretaEllenorzoNativ", (char[]) null);
        Intrinsics.checkExpressionValueIsNotNull(key, "keyStore.getKey(KeyStoreAdapter.KEY_ALIAS, null)");
        return key;
    }

    public String b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "encryptedText");
        byte[] decode = Base64.decode(str, 0);
        Intrinsics.checkExpressionValueIsNotNull(decode, "byteArray");
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        Key b = b();
        byte[] bytes = "70I3kj0m8qiW".getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        instance.init(2, b, new GCMParameterSpec(128, bytes));
        byte[] doFinal = instance.doFinal(decode);
        Intrinsics.checkExpressionValueIsNotNull(doFinal, "c.doFinal(encrypted)");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkExpressionValueIsNotNull(defaultCharset, "Charset.defaultCharset()");
        return new String(doFinal, defaultCharset);
    }

    public String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "plainText");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        Key b = b();
        byte[] bytes2 = "70I3kj0m8qiW".getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
        instance.init(1, b, new GCMParameterSpec(128, bytes2));
        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
        Intrinsics.checkExpressionValueIsNotNull(encodeToString, "Base64.encodeToString(en…dedBytes, Base64.DEFAULT)");
        return encodeToString;
    }
}
