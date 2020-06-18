package hu.ekreta.ellenorzo.message;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import h.l.g;
import h.m.d.d;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBinding;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import i.c.h.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lhu/ekreta/ellenorzo/message/MessageDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MessageDetailActivity.kt */
public final class MessageDetailActivity extends a {
    public MessageDetailViewModel x;
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a2 = g.a(this, R.layout.activity_message_detail);
        Intrinsics.checkExpressionValueIsNotNull(a2, "DataBindingUtil.setConte…_message_detail\n        )");
        ActivityMessageDetailBinding activityMessageDetailBinding = (ActivityMessageDetailBinding) a2;
        MessageDetailViewModel messageDetailViewModel = this.x;
        if (messageDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        activityMessageDetailBinding.a(messageDetailViewModel);
        MessageDetailViewModel messageDetailViewModel2 = this.x;
        if (messageDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        Intent intent = getIntent();
        messageDetailViewModel2.c(intent != null ? ExtensionsKt.i(intent) : null);
        AttachmentView attachmentView = (AttachmentView) c(R.id.message_attachments_attachment_view);
        MessageDetailViewModel messageDetailViewModel3 = this.x;
        if (messageDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LiveData items = messageDetailViewModel3.getItems();
        MessageDetailViewModel messageDetailViewModel4 = this.x;
        if (messageDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        AttachmentView.setRecyclerView$default(attachmentView, this, items, new MessageDetailActivity$onCreate$1(messageDetailViewModel4), (Function1) null, 8, (Object) null);
        WebView webView = (WebView) c(R.id.message_web_view);
        Intrinsics.checkExpressionValueIsNotNull(webView, "message_web_view");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings, "message_web_view.settings");
        settings.setDomStorageEnabled(true);
        WebView webView2 = (WebView) c(R.id.message_web_view);
        Intrinsics.checkExpressionValueIsNotNull(webView2, "message_web_view");
        WebSettings settings2 = webView2.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings2, "message_web_view.settings");
        settings2.setLoadsImagesAutomatically(true);
        WebView webView3 = (WebView) c(R.id.message_web_view);
        Intrinsics.checkExpressionValueIsNotNull(webView3, "message_web_view");
        webView3.getSettings().setAppCacheEnabled(true);
        a((Toolbar) c(R.id.toolbar));
        h.b.k.a l2 = l();
        if (l2 != null) {
            l2.c(true);
            l2.d(true);
        }
        MessageDetailViewModel messageDetailViewModel5 = this.x;
        if (messageDetailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((d) this, messageDetailViewModel5.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(R.menu.message_details_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_reply_to_message);
        Intrinsics.checkExpressionValueIsNotNull(findItem, "menu.findItem(R.id.action_reply_to_message)");
        Intent intent = getIntent();
        findItem.setVisible(Intrinsics.areEqual((Object) intent != null ? ExtensionsKt.q(intent) : null, (Object) true));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_reply_to_message) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((Activity) this);
            MessageDetailViewModel messageDetailViewModel = this.x;
            if (messageDetailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            messageDetailViewModel.a0();
            return true;
        }
    }
}
