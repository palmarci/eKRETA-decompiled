package p289hu.ekreta.ellenorzo.newmessage.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.databinding.ActivityNewMessageBinding;
import p289hu.ekreta.ellenorzo.message.Message;
import p289hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/newmessage/view/NewMessageActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/newmessage/viewmodel/NewMessageViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.newmessage.view.NewMessageActivity */
/* compiled from: NewMessageActivity.kt */
public final class NewMessageActivity extends C4457a {

    /* renamed from: x */
    public NewMessageViewModel f13982x;

    /* renamed from: y */
    public HashMap f13983y;

    /* renamed from: c */
    public View mo13507c(int i) {
        if (this.f13983y == null) {
            this.f13983y = new HashMap();
        }
        View view = (View) this.f13983y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13983y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_new_message);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…out.activity_new_message)");
        ActivityNewMessageBinding activityNewMessageBinding = (ActivityNewMessageBinding) a;
        NewMessageViewModel newMessageViewModel = this.f13982x;
        String str = "viewModel";
        if (newMessageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityNewMessageBinding.mo12363a(newMessageViewModel);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Message h = ExtensionsKt.m14671h(intent);
        if (h != null) {
            NewMessageViewModel newMessageViewModel2 = this.f13982x;
            if (newMessageViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            newMessageViewModel2.mo13521d(h);
            ((TextInputEditText) mo13507c(C4014R.C4016id.newMessage_addressee)).setCompoundDrawables(null, null, null, null);
        }
        AttachmentView attachmentView = (AttachmentView) mo13507c(C4014R.C4016id.attachments_view);
        Intrinsics.checkExpressionValueIsNotNull(attachmentView, "attachments_view");
        TextView textView = (TextView) attachmentView.mo11470c(C4014R.C4016id.attachments_label);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attachments_view.attachments_label");
        textView.setVisibility(8);
        AttachmentView attachmentView2 = (AttachmentView) mo13507c(C4014R.C4016id.attachments_view);
        NewMessageViewModel newMessageViewModel3 = this.f13982x;
        if (newMessageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        C3824r attachments = newMessageViewModel3.getAttachments();
        NewMessageViewModel newMessageViewModel4 = this.f13982x;
        if (newMessageViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        NewMessageActivity$onCreate$2 newMessageActivity$onCreate$2 = new NewMessageActivity$onCreate$2(newMessageViewModel4);
        NewMessageViewModel newMessageViewModel5 = this.f13982x;
        if (newMessageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        attachmentView2.mo11469a(this, attachments, newMessageActivity$onCreate$2, new NewMessageActivity$onCreate$3(newMessageViewModel5));
        mo8719a((Toolbar) mo13507c(C4014R.C4016id.newMessage_toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
        NewMessageViewModel newMessageViewModel6 = this.f13982x;
        if (newMessageViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, newMessageViewModel6.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(C4014R.C4017menu.message_to_class_master_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            String str = "viewModel";
            if (itemId == C4014R.C4016id.action_add_attachment) {
                NewMessageViewModel newMessageViewModel = this.f13982x;
                if (newMessageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                if (newMessageViewModel.mo13522d()) {
                    return true;
                }
                p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14879a(this);
                NewMessageViewModel newMessageViewModel2 = this.f13982x;
                if (newMessageViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                newMessageViewModel2.mo13517U();
                return true;
            } else if (itemId != C4014R.C4016id.action_send_message_to_class_master) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                NewMessageViewModel newMessageViewModel3 = this.f13982x;
                if (newMessageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                if (newMessageViewModel3.mo13522d()) {
                    return true;
                }
                p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14879a(this);
                NewMessageViewModel newMessageViewModel4 = this.f13982x;
                if (newMessageViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                }
                newMessageViewModel4.mo13516E1();
                return true;
            }
        } else {
            onBackPressed();
            return true;
        }
    }
}
