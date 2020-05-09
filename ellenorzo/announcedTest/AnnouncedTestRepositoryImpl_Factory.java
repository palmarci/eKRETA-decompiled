package p289hu.ekreta.ellenorzo.announcedTest;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepositoryImpl_Factory */
public final class AnnouncedTestRepositoryImpl_Factory implements C4463c<AnnouncedTestRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f11108a;

    /* renamed from: b */
    public final C5431a<AnnouncedTestDao> f11109b;

    /* renamed from: c */
    public final C5431a<DateTimeFactory> f11110c;

    public AnnouncedTestRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<AnnouncedTestDao> aVar2, C5431a<DateTimeFactory> aVar3) {
        this.f11108a = aVar;
        this.f11109b = aVar2;
        this.f11110c = aVar3;
    }

    public AnnouncedTestRepositoryImpl get() {
        return new AnnouncedTestRepositoryImpl((MobileApiV3) this.f11108a.get(), (AnnouncedTestDao) this.f11109b.get(), (DateTimeFactory) this.f11110c.get());
    }
}
