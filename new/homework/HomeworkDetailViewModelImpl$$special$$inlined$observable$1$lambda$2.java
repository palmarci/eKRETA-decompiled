package hu.ekreta.ellenorzo.homework;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final /* synthetic */ class HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$2 extends MutablePropertyReference0 {
    public HomeworkDetailViewModelImpl$$special$$inlined$observable$1$lambda$2(HomeworkDetailViewModelImpl homeworkDetailViewModelImpl) {
        super(homeworkDetailViewModelImpl);
    }

    public Object get() {
        return ((HomeworkDetailViewModelImpl) this.receiver).p();
    }

    public String getName() {
        return "group";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(HomeworkDetailViewModelImpl.class);
    }

    public String getSignature() {
        return "getGroup()Ljava/lang/String;";
    }

    public void set(Object obj) {
        ((HomeworkDetailViewModelImpl) this.receiver).s((String) obj);
    }
}
