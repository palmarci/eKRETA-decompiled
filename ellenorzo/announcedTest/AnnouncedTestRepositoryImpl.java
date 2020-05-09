package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\n\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "announcedTestDao", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "adapter", "hu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepositoryImpl$adapter$1;", "getAnnouncedTestDao", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDao;", "getDateTimeFactory", "()Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "fetchAnnouncedTests", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchReminders", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "getAnnouncedTests", "getReminders", "updateAnnouncedTest", "announcedTest", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl */
/* compiled from: AnnouncedTestRepositoryImpl.kt */
public final class AnnouncedTestRepositoryImpl implements AnnouncedTestRepository {

    /* renamed from: a */
    public final AnnouncedTestRepositoryImpl$adapter$1 f11095a = new AnnouncedTestRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f11096b;

    /* renamed from: c */
    public final AnnouncedTestDao f11097c;

    /* renamed from: d */
    public final DateTimeFactory f11098d;

    public AnnouncedTestRepositoryImpl(MobileApiV3 mobileApiV3, AnnouncedTestDao announcedTestDao, DateTimeFactory dateTimeFactory) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(announcedTestDao, "announcedTestDao");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        this.f11096b = mobileApiV3;
        this.f11097c = announcedTestDao;
        this.f11098d = dateTimeFactory;
    }

    /* renamed from: a */
    public final AnnouncedTestDao mo11405a() {
        return this.f11097c;
    }

    /* renamed from: b */
    public final DateTimeFactory mo11407b() {
        return this.f11098d;
    }

    /* renamed from: h */
    public C5027n<List<AnnouncedTest>> mo11403h(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f11096b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/BejelentettSzamonkeresek");
        C5027n<List<AnnouncedTest>> c = DefaultImpls.getAnnouncedTests$default(mobileApiV3, sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), null, null, 12, null).mo17246g(new AnnouncedTestRepositoryImpl$fetchAnnouncedTests$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new AnnouncedTestRepositoryImpl$fetchAnnouncedTests$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "mobileApiV3\n            …uncedTests)\n            }");
        return c;
    }

    /* renamed from: i */
    public C5027n<List<AnnouncedTest>> mo11404i(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f11095a.mo11410a(profile);
    }

    /* renamed from: a */
    public C5027n<List<Reminder>> mo11406a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Reminder>> g = mo11404i(profile).mo17246g(new AnnouncedTestRepositoryImpl$getReminders$1(this));
        if (g != null) {
            return g;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    /* renamed from: b */
    public C5027n<List<Reminder>> mo11408b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Reminder>> h = mo11403h(profile);
        if (h != null) {
            return h;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    /* renamed from: a */
    public C5027n<AnnouncedTest> mo11402a(AnnouncedTest announcedTest) {
        Intrinsics.checkParameterIsNotNull(announcedTest, "announcedTest");
        return this.f11095a.mo11409a(announcedTest);
    }
}
