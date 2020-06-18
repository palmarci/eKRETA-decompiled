package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.net.URLEncoder;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.e0;
import m.t;
import m.w;
import m.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;Lhu/ekreta/ellenorzo/rest/MobileApiV3;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "uploadAttachment", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "byteArray", "", "fileName", "", "purpose", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/AttachmentPurpose;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AttachmentRepository.kt */
public final class AttachmentRepositoryImpl implements AttachmentRepository {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5147a;
    public final MobileApiV3 b;

    public AttachmentRepositoryImpl(EAdminApi eAdminApi, MobileApiV3 mobileApiV3) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        this.f5147a = eAdminApi;
        this.b = mobileApiV3;
    }

    public final EAdminApi a() {
        return this.f5147a;
    }

    public final MobileApiV3 b() {
        return this.b;
    }

    public n<TemporaryFile> a(Profile profile, byte[] bArr, String str, AttachmentPurpose attachmentPurpose) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        e0 a2 = e0.a(w.b("multipart/form-data"), bArr);
        String encode = URLEncoder.encode(str, "utf-8");
        if (encode == null) {
            encode = "";
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        x.a(sb, "fajl");
        sb.append("; filename=");
        x.a(sb, encode);
        n<R> c = this.f5147a.getStatus(MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).c(new AttachmentRepositoryImpl$uploadAttachment$1(this, attachmentPurpose, profile, x.b.a(t.a("Content-Disposition", sb.toString()), a2)));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi.getStatus(prof…          }\n            }");
        return c;
    }
}
