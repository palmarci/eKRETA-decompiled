package hu.ekreta.ellenorzo.announcedTest;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: AnnouncedTestDetailViewModelImpl.kt */
public final /* synthetic */ class AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 extends MutablePropertyReference0 {
    public AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(AnnouncedTestDetailViewModelImpl announcedTestDetailViewModelImpl) {
        super(announcedTestDetailViewModelImpl);
    }

    public Object get() {
        return ((AnnouncedTestDetailViewModelImpl) this.receiver).p();
    }

    public String getName() {
        return "group";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(AnnouncedTestDetailViewModelImpl.class);
    }

    public String getSignature() {
        return "getGroup()Ljava/lang/String;";
    }

    public void set(Object obj) {
        ((AnnouncedTestDetailViewModelImpl) this.receiver).v((String) obj);
    }
}
