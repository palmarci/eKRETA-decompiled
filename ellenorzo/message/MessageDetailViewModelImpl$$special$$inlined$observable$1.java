package p289hu.ekreta.ellenorzo.message;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class MessageDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Message> {

    /* renamed from: c */
    public final /* synthetic */ MessageDetailViewModelImpl f13847c;

    public MessageDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, MessageDetailViewModelImpl messageDetailViewModelImpl) {
        this.f13847c = messageDetailViewModelImpl;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Message message, Message message2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Message message3 = message2;
        Message message4 = message;
        if (message3 == null) {
            return;
        }
        if (!message3.mo13297w()) {
            MessageDetailViewModelImpl messageDetailViewModelImpl = this.f13847c;
            C5027n c = messageDetailViewModelImpl.f13846z.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4253x8dfe5c62<Object,Object>(message3, this)).mo17238d((C4673f<? super C4663c>) new C4255x8dfe5c63<Object>(this)).mo17224b((C4673f<? super Throwable>) new C4256x8dfe5c64<Object>(this)).mo17233c((C4673f<? super T>) new C4257x8dfe5c65<Object>(this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository\n      …ssSubject.onNext(false) }");
            messageDetailViewModelImpl.mo16413a(C4998b.m16842a(c, (Function1) new C4259x8dfe5c67(this), (Function0) null, (Function1) new C4258x8dfe5c66(this), 2));
            return;
        }
        this.f13847c.mo13329e(message3);
        if (Intrinsics.areEqual((Object) message3.mo13290q(), (Object) Boolean.valueOf(false))) {
            MessageDetailViewModelImpl messageDetailViewModelImpl2 = this.f13847c;
            C4663c i = messageDetailViewModelImpl2.f13846z.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4260x8dfe5c68<Object,Object>(message3, this)).mo17249i();
            Intrinsics.checkExpressionValueIsNotNull(i, "profileRepository.getAct…             .subscribe()");
            messageDetailViewModelImpl2.mo16413a(i);
        }
    }
}
