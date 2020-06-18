package hu.ekreta.ellenorzo.secure;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapterPreMVersionImpl;", "Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "keyStore", "Ljava/security/KeyStore;", "createByteArrayInputStream", "Ljava/io/ByteArrayInputStream;", "encryptedText", "", "createInputCipher", "Ljavax/crypto/Cipher;", "createKeyParGeneratorSpec", "Landroid/security/KeyPairGeneratorSpec;", "createOutputCipher", "decode", "encode", "plainText", "generateAndSaveKey", "", "getPrivateKeysEntry", "Ljava/security/KeyStore$PrivateKeyEntry;", "toArrayListOfByte", "Ljava/util/ArrayList;", "", "Ljavax/crypto/CipherInputStream;", "toByteArray", "", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: KeyStoreAdapterPreMVersionImpl.kt */
public final class KeyStoreAdapterPreMVersionImpl implements KeyStoreAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final KeyStore f6099a;
    public final Context b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapterPreMVersionImpl$Companion;", "", "()V", "KEY_ALIAS", "", "RSA_MODE", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: KeyStoreAdapterPreMVersionImpl.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KeyStoreAdapterPreMVersionImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.b = context;
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Intrinsics.checkExpressionValueIsNotNull(instance, "KeyStore.getInstance(Key…ORE).apply { load(null) }");
        this.f6099a = instance;
    }

    public void a() {
        if (!this.f6099a.containsAlias("KretaEllenorzoNativ")) {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            instance3.add(1, 30);
            KeyPairGeneratorSpec.Builder serialNumber = new KeyPairGeneratorSpec.Builder(this.b).setAlias("KretaEllenorzoNativ").setSubject(new X500Principal("CN=KretaEllenorzoNativ")).setSerialNumber(BigInteger.TEN);
            Intrinsics.checkExpressionValueIsNotNull(instance2, "start");
            KeyPairGeneratorSpec.Builder startDate = serialNumber.setStartDate(instance2.getTime());
            Intrinsics.checkExpressionValueIsNotNull(instance3, "end");
            KeyPairGeneratorSpec build = startDate.setEndDate(instance3.getTime()).build();
            Intrinsics.checkExpressionValueIsNotNull(build, "KeyPairGeneratorSpec.Bui…ime)\n            .build()");
            instance.initialize(build);
            instance.generateKeyPair();
        }
    }

    public final KeyStore.PrivateKeyEntry b() {
        KeyStore.Entry entry = this.f6099a.getEntry("KretaEllenorzoNativ", (KeyStore.ProtectionParameter) null);
        if (entry != null) {
            return (KeyStore.PrivateKeyEntry) entry;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
    }

    public String b(String str) throws Exception {
        Intrinsics.checkParameterIsNotNull(str, "encryptedText");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
        instance.init(2, b().getPrivateKey());
        Intrinsics.checkExpressionValueIsNotNull(instance, "outputCipher");
        CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, instance);
        ArrayList arrayList = new ArrayList();
        for (int read = cipherInputStream.read(); read != -1; read = cipherInputStream.read()) {
            arrayList.add(Byte.valueOf((byte) read));
        }
        byte[] bArr = new byte[arrayList.size()];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = arrayList.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(obj, "this[i]");
            bArr[i2] = ((Number) obj).byteValue();
        }
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkExpressionValueIsNotNull(defaultCharset, "Charset.defaultCharset()");
        return new String(bArr, defaultCharset);
    }

    public String a(String str) throws Exception {
        Intrinsics.checkParameterIsNotNull(str, "plainText");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
        Certificate certificate = b().getCertificate();
        Intrinsics.checkExpressionValueIsNotNull(certificate, "getPrivateKeysEntry().certificate");
        instance.init(1, certificate.getPublicKey());
        Intrinsics.checkExpressionValueIsNotNull(instance, "inputCipher");
        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
        Intrinsics.checkExpressionValueIsNotNull(encodeToString, "Base64.encodeToString(en…dedBytes, Base64.DEFAULT)");
        return encodeToString;
    }
}
