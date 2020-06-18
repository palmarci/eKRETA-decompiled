package hu.ekreta.ellenorzo.subject;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.b.b;
import o.b.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: SubjectsRepositoryImpl.kt */
public final class SubjectsRepositoryImpl$logger$2 extends Lambda implements Function0<b> {
    public final /* synthetic */ SubjectsRepositoryImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubjectsRepositoryImpl$logger$2(SubjectsRepositoryImpl subjectsRepositoryImpl) {
        super(0);
        this.c = subjectsRepositoryImpl;
    }

    public final b invoke() {
        return c.a(Reflection.getOrCreateKotlinClass(this.c.getClass()).getSimpleName());
    }
}
