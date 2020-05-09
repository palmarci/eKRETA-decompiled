package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.cases.subModels.Signer;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\n"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "fetchSigner", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "typeCode", "", "signerId", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.SignerRepository */
/* compiled from: SignerRepository.kt */
public interface SignerRepository extends Repository<Signer> {
    /* renamed from: a */
    C5027n<Signer> mo11865a(Profile profile, int i, int i2);
}
