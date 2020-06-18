package hu.ekreta.ellenorzo.message;

import h.l.j;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H&J\b\u0010\u0016\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u00020\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessagesViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/message/Message;", "contentVisible", "Landroidx/databinding/ObservableBoolean;", "getContentVisible", "()Landroidx/databinding/ObservableBoolean;", "eAdministrationNotAllowedVisible", "getEAdministrationNotAllowedVisible", "initialProgressBarVisible", "getInitialProgressBarVisible", "messageUpdateFinished", "getMessageUpdateFinished", "selectedTabPosition", "", "getSelectedTabPosition", "()I", "setSelectedTabPosition", "(I)V", "deleteMessage", "", "message", "startNewMessageActivity", "updateMessageItemReadStateToOpposite", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessagesViewModel.kt */
public interface MessagesViewModel extends DataBindingListViewModel<Message> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* compiled from: MessagesViewModel.kt */
    public static final class DefaultImpls {
    }

    void a(int i2);

    void a(Message message);

    void b(Message message);

    j h0();

    j j0();

    j k0();

    j r0();

    void s0();
}
