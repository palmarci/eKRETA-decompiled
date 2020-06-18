package hu.ekreta.ellenorzo.newmessage.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import h.l.g;
import h.m.d.d;
import h.p.m;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.Attachment;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.databinding.ActivityNewMessageBinding;
import hu.ekreta.ellenorzo.message.Message;
import hu.ekreta.ellenorzo.newmessage.model.Addressee;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lhu/ekreta/ellenorzo/newmessage/view/NewMessageActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;)V", "createAdapter", "hu/ekreta/ellenorzo/newmessage/view/NewMessageActivity$createAdapter$1", "()Lhu/ekreta/ellenorzo/newmessage/view/NewMessageActivity$createAdapter$1;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NewMessageActivity.kt */
public final class NewMessageActivity extends a {
    public NewMessageViewModel x;
    public HashMap y;

    public View c(int i2) {
        if (this.y == null) {
            this.y = new HashMap();
        }
        View view = (View) this.y.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Addressee a2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && i3 == -1 && intent != null && (a2 = ExtensionsKt.a(intent)) != null) {
            NewMessageViewModel newMessageViewModel = this.x;
            if (newMessageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            newMessageViewModel.a(a2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_new_message);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…out.activity_new_message)");
        ActivityNewMessageBinding activityNewMessageBinding = (ActivityNewMessageBinding) a2;
        NewMessageViewModel newMessageViewModel = this.x;
        if (newMessageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityNewMessageBinding.a(newMessageViewModel);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Message i2 = ExtensionsKt.i(intent);
        if (i2 != null) {
            NewMessageViewModel newMessageViewModel2 = this.x;
            if (newMessageViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            newMessageViewModel2.d(i2);
            setTitle(getString(R.string.newMessage_title_reply));
        } else {
            setTitle(getString(R.string.newMessage_title));
        }
        RecyclerView recyclerView = (RecyclerView) c(R.id.newMessage_addresseeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "newMessage_addresseeRecycleView");
        NewMessageViewModel newMessageViewModel3 = this.x;
        if (newMessageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a(recyclerView, (m) this, newMessageViewModel3.P0(), new NewMessageActivity$createAdapter$1(this, new NewMessageActivity$createAdapter$2(this)));
        AttachmentView attachmentView = (AttachmentView) c(R.id.attachments_view);
        Intrinsics.checkExpressionValueIsNotNull(attachmentView, "attachments_view");
        TextView textView = (TextView) attachmentView.c(R.id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_view.attachments_label");
        textView.setVisibility(8);
        AttachmentView attachmentView2 = (AttachmentView) c(R.id.attachments_view);
        NewMessageViewModel newMessageViewModel4 = this.x;
        if (newMessageViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        r<List<Attachment>> attachments = newMessageViewModel4.getAttachments();
        NewMessageViewModel newMessageViewModel5 = this.x;
        if (newMessageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        NewMessageActivity$onCreate$1 newMessageActivity$onCreate$1 = new NewMessageActivity$onCreate$1(newMessageViewModel5);
        NewMessageViewModel newMessageViewModel6 = this.x;
        if (newMessageViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        attachmentView2.a(this, attachments, newMessageActivity$onCreate$1, new NewMessageActivity$onCreate$2(newMessageViewModel6));
        a((Toolbar) c(R.id.newMessage_toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        NewMessageViewModel newMessageViewModel7 = this.x;
        if (newMessageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, newMessageViewModel7.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(R.menu.message_to_class_master_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == R.id.action_add_attachment) {
            NewMessageViewModel newMessageViewModel = this.x;
            if (newMessageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            if (newMessageViewModel.d()) {
                return true;
            }
            hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((Activity) this);
            NewMessageViewModel newMessageViewModel2 = this.x;
            if (newMessageViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            newMessageViewModel2.U();
            return true;
        } else if (itemId != R.id.action_send_message_to_class_master) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            NewMessageViewModel newMessageViewModel3 = this.x;
            if (newMessageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            if (newMessageViewModel3.d()) {
                return true;
            }
            hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((Activity) this);
            NewMessageViewModel newMessageViewModel4 = this.x;
            if (newMessageViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            newMessageViewModel4.N1();
            return true;
        }
    }

    public final NewMessageViewModel q() {
        NewMessageViewModel newMessageViewModel = this.x;
        if (newMessageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return newMessageViewModel;
    }
}
