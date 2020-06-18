package hu.ekreta.ellenorzo.notes;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: NoteDetailsViewModelImpl.kt */
public final /* synthetic */ class NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1 extends MutablePropertyReference0 {
    public NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1(NoteDetailsViewModelImpl noteDetailsViewModelImpl) {
        super(noteDetailsViewModelImpl);
    }

    public Object get() {
        return ((NoteDetailsViewModelImpl) this.receiver).p();
    }

    public String getName() {
        return "group";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(NoteDetailsViewModelImpl.class);
    }

    public String getSignature() {
        return "getGroup()Ljava/lang/String;";
    }

    public void set(Object obj) {
        ((NoteDetailsViewModelImpl) this.receiver).t((String) obj);
    }
}
