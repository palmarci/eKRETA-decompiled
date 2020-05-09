package p289hu.ekreta.ellenorzo.subject;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import p365o.p367b.C5620b;
import p365o.p367b.C5621c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.subject.SubjectsRepositoryImpl$logger$2 */
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$logger$2 extends Lambda implements Function0<C5620b> {

    /* renamed from: c */
    public final /* synthetic */ SubjectsRepositoryImpl f14872c;

    public SubjectsRepositoryImpl$logger$2(SubjectsRepositoryImpl subjectsRepositoryImpl) {
        this.f14872c = subjectsRepositoryImpl;
        super(0);
    }

    public final C5620b invoke() {
        return C5621c.m18584a(Reflection.getOrCreateKotlinClass(this.f14872c.getClass()).getSimpleName());
    }
}
