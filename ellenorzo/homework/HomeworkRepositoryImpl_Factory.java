package p289hu.ekreta.ellenorzo.homework;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl_Factory */
public final class HomeworkRepositoryImpl_Factory implements C4463c<HomeworkRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f13515a;

    /* renamed from: b */
    public final C5431a<DateTimeFactory> f13516b;

    /* renamed from: c */
    public final C5431a<HomeworkDao> f13517c;

    public HomeworkRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<DateTimeFactory> aVar2, C5431a<HomeworkDao> aVar3) {
        this.f13515a = aVar;
        this.f13516b = aVar2;
        this.f13517c = aVar3;
    }

    public HomeworkRepositoryImpl get() {
        return new HomeworkRepositoryImpl((MobileApiV3) this.f13515a.get(), (DateTimeFactory) this.f13516b.get(), (HomeworkDao) this.f13517c.get());
    }
}
