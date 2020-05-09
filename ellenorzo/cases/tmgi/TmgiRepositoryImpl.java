package p289hu.ekreta.ellenorzo.cases.tmgi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import p289hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import p289hu.ekreta.ellenorzo.cases.subModels.File;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import p289hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationDocumentTypeDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.FileDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "postTmgiCase", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "tmgiFormPost", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiRepositoryImpl */
/* compiled from: TmgiRepository.kt */
public final class TmgiRepositoryImpl implements TmgiRepository {

    /* renamed from: a */
    public final EAdminApi f11785a;

    public TmgiRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f11785a = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<Boolean> mo12214a(Profile profile, TmgiFormPost tmgiFormPost) {
        Iterator it;
        ApplicationDocumentTypeDto applicationDocumentTypeDto;
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(tmgiFormPost, "tmgiFormPost");
        EAdminApi eAdminApi = this.f11785a;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d());
        String c = tmgiFormPost.mo12127c();
        String d = tmgiFormPost.mo12128d();
        String b = tmgiFormPost.mo12126b();
        TypeDto a = C3984v.m10163a(tmgiFormPost.mo12124a());
        TmgiCaseType j = tmgiFormPost.mo12136j();
        Intrinsics.checkParameterIsNotNull(j, "$this$toEAdminType");
        TypeDto typeDto = new TypeDto(j.mo11919e(), j.mo12025h().mo12029a(), j.mo11922g(), j.mo11921f(), j.mo11917d());
        String a2 = tmgiFormPost.mo12124a().mo11928h().mo11930a();
        String i = tmgiFormPost.mo12135i();
        String e = tmgiFormPost.mo12129e();
        String h = tmgiFormPost.mo12133h();
        List f = tmgiFormPost.mo12131f();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f, 10));
        Iterator it2 = f.iterator();
        while (it2.hasNext()) {
            ApplicationMandatoryDocument applicationMandatoryDocument = (ApplicationMandatoryDocument) it2.next();
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toEAdminMandatoryDocument");
            Integer i2 = applicationMandatoryDocument.mo11911i();
            String h2 = applicationMandatoryDocument.mo11909h();
            String j2 = applicationMandatoryDocument.mo11912j();
            File g = applicationMandatoryDocument.mo11908g();
            FileDto a3 = g != null ? C3984v.m10161a(g) : null;
            ApplicationDocumentType f2 = applicationMandatoryDocument.mo11907f();
            if (f2 != null) {
                it = it2;
                Intrinsics.checkParameterIsNotNull(f2, "$this$toEAdminApplicationDocumentType");
                applicationDocumentTypeDto = new ApplicationDocumentTypeDto(f2.mo11895j(), f2.mo11890f(), f2.mo11897l(), f2.mo11896k(), f2.mo11891g(), f2.mo11892h(), f2.mo11894i());
            } else {
                it = it2;
                applicationDocumentTypeDto = null;
            }
            ApplicationMandatoryDocumentDto applicationMandatoryDocumentDto = new ApplicationMandatoryDocumentDto(i2, h2, j2, a3, applicationDocumentTypeDto);
            arrayList.add(applicationMandatoryDocumentDto);
            it2 = it;
        }
        List<OtherThingsToDoAttachment> g2 = tmgiFormPost.mo12132g();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10));
        for (OtherThingsToDoAttachment a4 : g2) {
            arrayList2.add(C3984v.m10162a(a4));
        }
        TmgiCasePostDto tmgiCasePostDto = new TmgiCasePostDto(c, d, b, a, typeDto, a2, i, e, h, arrayList, arrayList2);
        C5027n<Boolean> i3 = eAdminApi.createTmgiCase(asAuthorizationHeader, tmgiCasePostDto).mo17246g(TmgiRepositoryImpl$postTmgiCase$3.INSTANCE).mo17250i(TmgiRepositoryImpl$postTmgiCase$4.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(i3, "eAdminApi.createTmgiCase…          false\n        }");
        return i3;
    }
}
