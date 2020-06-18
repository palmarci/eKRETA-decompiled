package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.Signer;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.Repository;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/SignerRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/cases/subModels/Signer;", "fetchSigner", "Lio/reactivex/Observable;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "typeCode", "", "signerId", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: SignerRepository.kt */
public interface SignerRepository extends Repository<Signer> {
    n<Signer> a(Profile profile, int i2, int i3);
}
