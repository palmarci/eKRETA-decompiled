package hu.ekreta.ellenorzo.secure;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter;", "", "decode", "", "encryptedText", "encode", "plainText", "generateAndSaveKey", "", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: KeyStoreAdapter.kt */
public interface KeyStoreAdapter {
    public static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    public static final Companion Companion = Companion.f6096a;
    public static final String KEY_ALIAS = "KretaEllenorzoNativ";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lhu/ekreta/ellenorzo/secure/KeyStoreAdapter$Companion;", "", "()V", "ANDROID_KEY_STORE", "", "KEY_ALIAS", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: KeyStoreAdapter.kt */
    public static final class Companion {
        public static final String ANDROID_KEY_STORE = "AndroidKeyStore";
        public static final String KEY_ALIAS = "KretaEllenorzoNativ";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f6096a = new Companion();
    }

    String a(String str);

    void a();

    String b(String str);
}
