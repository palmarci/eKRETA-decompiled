package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.reminder.ReminderRepository;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "fetchAnnouncedTests", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getAnnouncedTests", "updateAnnouncedTest", "announcedTest", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository */
/* compiled from: AnnouncedTestRepository.kt */
public interface AnnouncedTestRepository extends Repository<Reminder>, ReminderRepository {
    /* renamed from: a */
    C5027n<AnnouncedTest> mo11402a(AnnouncedTest announcedTest);

    /* renamed from: h */
    C5027n<List<AnnouncedTest>> mo11403h(Profile profile);

    /* renamed from: i */
    C5027n<List<AnnouncedTest>> mo11404i(Profile profile);
}
