package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import i.d.c;
import l.a.a;

public final class HomeworkRepositoryImpl_Factory implements c<HomeworkRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5681a;
    public final a<DateTimeFactory> b;
    public final a<HomeworkDao> c;

    public HomeworkRepositoryImpl_Factory(a<MobileApiV3> aVar, a<DateTimeFactory> aVar2, a<HomeworkDao> aVar3) {
        this.f5681a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public HomeworkRepositoryImpl get() {
        return new HomeworkRepositoryImpl(this.f5681a.get(), this.b.get(), this.c.get());
    }
}
