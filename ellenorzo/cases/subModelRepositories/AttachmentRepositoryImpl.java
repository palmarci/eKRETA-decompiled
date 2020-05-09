package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p353m.C5447e0;
import p353m.C5571t;
import p353m.C5577w;
import p353m.C5578x;
import p353m.C5578x.C5580b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "uploadAttachment", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "byteArray", "", "fileName", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.AttachmentRepositoryImpl */
/* compiled from: AttachmentRepository.kt */
public final class AttachmentRepositoryImpl implements AttachmentRepository {

    /* renamed from: a */
    public final EAdminApi f11514a;

    public AttachmentRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f11514a = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<String> mo11856a(Profile profile, byte[] bArr, String str) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5447e0 a = C5447e0.m17917a(C5577w.m18345b("multipart/form-data"), bArr);
        String encode = URLEncoder.encode(str, "utf-8");
        if (encode == null) {
            encode = "";
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        C5578x.m18347a(sb, "fajl");
        sb.append("; filename=");
        C5578x.m18347a(sb, encode);
        C5580b a2 = C5580b.m18355a(C5571t.m18299a("Content-Disposition", sb.toString()), a);
        EAdminApi eAdminApi = this.f11514a;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d());
        Intrinsics.checkExpressionValueIsNotNull(a2, "body");
        C5027n<String> g = eAdminApi.createAttachment(asAuthorizationHeader, a2).mo17246g(AttachmentRepositoryImpl$uploadAttachment$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "eAdminApi.createAttachme…ce().readUtf8()\n        }");
        return g;
    }
}
