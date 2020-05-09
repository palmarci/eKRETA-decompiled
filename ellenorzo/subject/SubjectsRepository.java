package p289hu.ekreta.ellenorzo.subject;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/subject/SubjectsRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/subject/Subject;", "fetchSubjects", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getSubjects", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepository */
/* compiled from: SubjectsRepository.kt */
public interface SubjectsRepository extends Repository<Subject> {
    /* renamed from: n */
    C5027n<List<Subject>> mo15742n(Profile profile);

    /* renamed from: r */
    C5027n<List<Subject>> mo15743r(Profile profile);
}
