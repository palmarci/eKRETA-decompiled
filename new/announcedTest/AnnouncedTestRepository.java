package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "fetchAnnouncedTests", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getAnnouncedTests", "updateAnnouncedTest", "announcedTest", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestRepository.kt */
public interface AnnouncedTestRepository extends Repository<Reminder>, ReminderRepository {
    n<AnnouncedTest> a(AnnouncedTest announcedTest);

    n<List<AnnouncedTest>> h(Profile profile);

    n<List<AnnouncedTest>> i(Profile profile);
}
