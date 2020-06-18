package hu.ekreta.ellenorzo.cases.tmgi;

import hu.ekreta.ellenorzo.profile.Profile;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/cases/tmgi/TmgiRepository;", "", "postTmgiCase", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "tmgiFormPost", "Lhu/ekreta/ellenorzo/cases/tmgi/TmgiFormPost;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TmgiRepository.kt */
public interface TmgiRepository {
    n<Boolean> a(Profile profile, TmgiFormPost tmgiFormPost);
}
