package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "announcedTestDao", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "adapter", "hu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl$adapter$1;", "getAnnouncedTestDao", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "getDateTimeFactory", "()Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchAnnouncedTests", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchReminders", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "getAnnouncedTests", "getReminders", "updateAnnouncedTest", "announcedTest", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl implements AnnouncedTestRepository {

    /* renamed from: a  reason: collision with root package name */
    public final AnnouncedTestRepositoryImpl$adapter$1 f5031a = new AnnouncedTestRepositoryImpl$adapter$1(this);
    public final MobileApiV3 b;
    public final AnnouncedTestDao c;

    /* renamed from: d  reason: collision with root package name */
    public final DateTimeFactory f5032d;

    public AnnouncedTestRepositoryImpl(MobileApiV3 mobileApiV3, AnnouncedTestDao announcedTestDao, DateTimeFactory dateTimeFactory) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(announcedTestDao, "announcedTestDao");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        this.b = mobileApiV3;
        this.c = announcedTestDao;
        this.f5032d = dateTimeFactory;
    }

    public final AnnouncedTestDao a() {
        return this.c;
    }

    public final DateTimeFactory b() {
        return this.f5032d;
    }

    public n<List<AnnouncedTest>> h(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.b;
        String str = profile.p() + "/ellenorzo/V3/Sajat/BejelentettSzamonkeresek";
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        Object clone = this.f5032d.a().clone();
        if (clone != null) {
            Calendar calendar = (Calendar) clone;
            UtilsKt.a(calendar, 3, 3);
            n<List<AnnouncedTest>> c2 = MobileApiV3.DefaultImpls.getAnnouncedTests$default(mobileApiV3, str, asAuthorizationHeader, UtilsKt.c(calendar), (String) null, 8, (Object) null).g(new AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1(profile)).c(new AnnouncedTestRepositoryImpl$fetchAnnouncedTests$2(this, profile));
            Intrinsics.checkExpressionValueIsNotNull(c2, "mobileApiV3\n            …uncedTests)\n            }");
            return c2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    public n<List<AnnouncedTest>> i(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5031a.a(profile);
    }

    public n<List<Reminder>> a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> g2 = i(profile).g(new AnnouncedTestRepositoryImpl$getReminders$1(this));
        if (g2 != null) {
            return g2;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    public n<List<Reminder>> b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<List<AnnouncedTest>> h2 = h(profile);
        if (h2 != null) {
            return h2;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    public n<AnnouncedTest> a(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "announcedTest");
        return this.f5031a.a(announcedTest);
    }
}
