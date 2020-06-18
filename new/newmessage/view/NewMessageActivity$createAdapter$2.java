package hu.ekreta.ellenorzo.newmessage.view;

import android.view.ViewGroup;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/newmessage/view/NewMessageAddresseeViewHolder;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NewMessageActivity.kt */
public final class NewMessageActivity$createAdapter$2 extends Lambda implements Function2<ViewGroup, Integer, NewMessageAddresseeViewHolder> {
    public final /* synthetic */ NewMessageActivity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewMessageActivity$createAdapter$2(NewMessageActivity newMessageActivity) {
        super(2);
        this.c = newMessageActivity;
    }

    public final NewMessageAddresseeViewHolder a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new NewMessageAddresseeViewHolder(viewGroup, new Function1<Addressee, Unit>() {
            public final void a(Addressee addressee) {
                Intrinsics.checkParameterIsNotNull(addressee, "it");
                NewMessageActivity$createAdapter$2.this.c.q().b(addressee);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Addressee) obj);
                return Unit.INSTANCE;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return a((ViewGroup) obj);
    }
}
