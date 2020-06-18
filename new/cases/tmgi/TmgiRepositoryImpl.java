package hu.ekreta.ellenorzo.cases.tmgi;

import h.w.v;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationDocumentType;
import hu.ekreta.ellenorzo.cases.subModels.ApplicationMandatoryDocument;
import hu.ekreta.ellenorzo.cases.subModels.File;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.cases.subModels.TmgiCaseType;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.ApplicationDocumentTypeDto;
import hu.ekreta.ellenorzo.rest.eadminapi.ApplicationMandatoryDocumentDto;
import hu.ekreta.ellenorzo.rest.eadminapi.FileDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TmgiCasePostDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "postTmgiCase", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "tmgiFormPost", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiRepository.kt */
public final class TmgiRepositoryImpl implements TmgiRepository {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5262a;

    public TmgiRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5262a = eAdminApi;
    }

    public n<Boolean> a(Profile profile, TmgiFormPost tmgiFormPost) {
        Iterator<T> it;
        ApplicationDocumentTypeDto applicationDocumentTypeDto;
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(tmgiFormPost, "tmgiFormPost");
        EAdminApi eAdminApi = this.f5262a;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        String c = tmgiFormPost.c();
        String d2 = tmgiFormPost.d();
        String b = tmgiFormPost.b();
        TypeDto a2 = v.a(tmgiFormPost.a());
        TmgiCaseType j2 = tmgiFormPost.j();
        Intrinsics.checkParameterIsNotNull(j2, "$this$toEAdminType");
        TypeDto typeDto = new TypeDto(j2.e(), j2.h().a(), j2.g(), j2.f(), j2.d());
        String a3 = tmgiFormPost.a().h().a();
        String i2 = tmgiFormPost.i();
        String e = tmgiFormPost.e();
        String h2 = tmgiFormPost.h();
        List<ApplicationMandatoryDocument> f = tmgiFormPost.f();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(f, 10));
        Iterator<T> it2 = f.iterator();
        while (it2.hasNext()) {
            ApplicationMandatoryDocument applicationMandatoryDocument = (ApplicationMandatoryDocument) it2.next();
            Intrinsics.checkParameterIsNotNull(applicationMandatoryDocument, "$this$toEAdminMandatoryDocument");
            Integer i3 = applicationMandatoryDocument.i();
            String h3 = applicationMandatoryDocument.h();
            String j3 = applicationMandatoryDocument.j();
            File g2 = applicationMandatoryDocument.g();
            FileDto a4 = g2 != null ? v.a(g2) : null;
            ApplicationDocumentType f2 = applicationMandatoryDocument.f();
            if (f2 != null) {
                it = it2;
                Intrinsics.checkParameterIsNotNull(f2, "$this$toEAdminApplicationDocumentType");
                applicationDocumentTypeDto = new ApplicationDocumentTypeDto(f2.j(), f2.f(), f2.l(), f2.k(), f2.g(), f2.h(), f2.i());
            } else {
                it = it2;
                applicationDocumentTypeDto = null;
            }
            arrayList.add(new ApplicationMandatoryDocumentDto(i3, h3, j3, a4, applicationDocumentTypeDto));
            it2 = it;
        }
        List<OtherThingsToDoAttachment> g3 = tmgiFormPost.g();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(g3, 10));
        for (OtherThingsToDoAttachment a5 : g3) {
            arrayList2.add(v.a(a5));
        }
        n<R> i4 = eAdminApi.createTmgiCase(asAuthorizationHeader, new TmgiCasePostDto(c, d2, b, a2, typeDto, a3, i2, e, h2, arrayList, arrayList2)).g(TmgiRepositoryImpl$postTmgiCase$3.INSTANCE).i(TmgiRepositoryImpl$postTmgiCase$4.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(i4, "eAdminApi.createTmgiCase…          false\n        }");
        return i4;
    }
}
