package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.TemporaryFile;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.StatusDto;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/subModels/TemporaryFile;", "kotlin.jvm.PlatformType", "statusDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/StatusDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentRepository.kt */
public final class AttachmentRepositoryImpl$uploadAttachment$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AttachmentRepositoryImpl c;
    public final /* synthetic */ AttachmentPurpose e;
    public final /* synthetic */ Profile f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x.b f5148g;

    public AttachmentRepositoryImpl$uploadAttachment$1(AttachmentRepositoryImpl attachmentRepositoryImpl, AttachmentPurpose attachmentPurpose, Profile profile, x.b bVar) {
        this.c = attachmentRepositoryImpl;
        this.e = attachmentPurpose;
        this.f = profile;
        this.f5148g = bVar;
    }

    /* renamed from: a */
    public final n<TemporaryFile> apply(StatusDto statusDto) {
        Intrinsics.checkParameterIsNotNull(statusDto, "statusDto");
        if (this.e == null || !statusDto.getFileServiceFeatures().contains(this.e.a())) {
            EAdminApi a2 = this.c.a();
            String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(this.f.d());
            x.b bVar = this.f5148g;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "body");
            return a2.createAttachment(asAuthorizationHeader, bVar).g(AnonymousClass2.INSTANCE);
        }
        MobileApiV3 b = this.c.b();
        String str = statusDto.getFileServiceApiUrl() + "/ideiglenesfajlok";
        String asAuthorizationHeader2 = MobileApiV3Kt.getAsAuthorizationHeader(this.f.d());
        x.b bVar2 = this.f5148g;
        Intrinsics.checkExpressionValueIsNotNull(bVar2, "body");
        return b.createAttachment(str, asAuthorizationHeader2, bVar2).g(AnonymousClass1.INSTANCE);
    }
}
