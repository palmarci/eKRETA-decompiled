package p289hu.ekreta.ellenorzo.notes;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1 */
/* compiled from: NoteDetailsViewModelImpl.kt */
public final /* synthetic */ class NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1 extends MutablePropertyReference0 {
    public NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1(NoteDetailsViewModelImpl noteDetailsViewModelImpl) {
        super(noteDetailsViewModelImpl);
    }

    public Object get() {
        return ((NoteDetailsViewModelImpl) this.receiver).mo13583p();
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
        ((NoteDetailsViewModelImpl) this.receiver).mo13589u((String) obj);
    }
}
