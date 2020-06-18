package hu.ekreta.ellenorzo.announcedTest;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import i.d.c;
import l.a.a;

public final class AnnouncedTestRepositoryImpl_Factory implements c<AnnouncedTestRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5034a;
    public final a<AnnouncedTestDao> b;
    public final a<DateTimeFactory> c;

    public AnnouncedTestRepositoryImpl_Factory(a<MobileApiV3> aVar, a<AnnouncedTestDao> aVar2, a<DateTimeFactory> aVar3) {
        this.f5034a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public AnnouncedTestRepositoryImpl get() {
        return new AnnouncedTestRepositoryImpl(this.f5034a.get(), this.b.get(), this.c.get());
    }
}
