package p289hu.ekreta.ellenorzo.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Ljavax/net/ssl/SSLSession;", "verify"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$trustAllCertificates$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$trustAllCertificates$1 implements HostnameVerifier {
    public static final ExtensionsKt$trustAllCertificates$1 INSTANCE = new ExtensionsKt$trustAllCertificates$1();

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
