package hu.ekreta.ellenorzo.message;

import k.b.a0.c;
import k.b.b0.f;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Message> {
    public final /* synthetic */ MessageDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, MessageDetailViewModelImpl messageDetailViewModelImpl) {
        super(obj2);
        this.c = messageDetailViewModelImpl;
    }

    public void afterChange(KProperty<?> kProperty, Message message, Message message2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Message message3 = message2;
        Message message4 = message;
        if (message3 == null) {
            return;
        }
        if (!message3.w()) {
            MessageDetailViewModelImpl messageDetailViewModelImpl = this.c;
            n<R> c2 = messageDetailViewModelImpl.A.b().c(new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(message3, this)).d((f<? super c>) new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$2(this)).b((f<? super Throwable>) new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$3(this)).c(new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$4(this));
            Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository\n      …ssSubject.onNext(false) }");
            messageDetailViewModelImpl.a(b.a(c2, new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$6(this), (Function0) null, new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$5(this), 2));
            return;
        }
        this.c.e(message3);
        if (Intrinsics.areEqual((Object) message3.q(), (Object) false)) {
            MessageDetailViewModelImpl messageDetailViewModelImpl2 = this.c;
            c i2 = messageDetailViewModelImpl2.A.b().c(new MessageDetailViewModelImpl$$special$$inlined$observable$1$lambda$7(message3, this)).i();
            Intrinsics.checkExpressionValueIsNotNull(i2, "profileRepository.getAct…             .subscribe()");
            messageDetailViewModelImpl2.a(i2);
        }
    }
}
