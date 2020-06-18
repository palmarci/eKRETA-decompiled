package hu.ekreta.ellenorzo.omission.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionDetailViewModelImpl.kt */
public final /* synthetic */ class OmissionDetailViewModelImpl$$special$$inlined$observable$1$lambda$1 extends MutablePropertyReference0 {
    public OmissionDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(OmissionDetailViewModelImpl omissionDetailViewModelImpl) {
        super(omissionDetailViewModelImpl);
    }

    public Object get() {
        return ((OmissionDetailViewModelImpl) this.receiver).p();
    }

    public String getName() {
        return "group";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(OmissionDetailViewModelImpl.class);
    }

    public String getSignature() {
        return "getGroup()Ljava/lang/String;";
    }

    public void set(Object obj) {
        ((OmissionDetailViewModelImpl) this.receiver).r((String) obj);
    }
}
