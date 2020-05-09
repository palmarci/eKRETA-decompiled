package p289hu.ekreta.ellenorzo.message;

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
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBinding;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p292i.p293c.p294h.C4457a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/message/MessageDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/message/MessageDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.message.MessageDetailActivity */
/* compiled from: MessageDetailActivity.kt */
public final class MessageDetailActivity extends C4457a {

    /* renamed from: x */
    public MessageDetailViewModel f13824x;

    /* renamed from: y */
    public HashMap f13825y;

    /* renamed from: c */
    public View mo13311c(int i) {
        if (this.f13825y == null) {
            this.f13825y = new HashMap();
        }
        View view = (View) this.f13825y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13825y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_message_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…_message_detail\n        )");
        ActivityMessageDetailBinding activityMessageDetailBinding = (ActivityMessageDetailBinding) a;
        MessageDetailViewModel messageDetailViewModel = this.f13824x;
        String str = "viewModel";
        if (messageDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityMessageDetailBinding.mo12361a(messageDetailViewModel);
        MessageDetailViewModel messageDetailViewModel2 = this.f13824x;
        if (messageDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        messageDetailViewModel2.mo13320c(intent != null ? ExtensionsKt.m14671h(intent) : null);
        AttachmentView attachmentView = (AttachmentView) mo13311c(C4014R.C4016id.message_attachments_attachment_view);
        MessageDetailViewModel messageDetailViewModel3 = this.f13824x;
        if (messageDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        LiveData items = messageDetailViewModel3.getItems();
        MessageDetailViewModel messageDetailViewModel4 = this.f13824x;
        if (messageDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        AttachmentView.setRecyclerView$default(attachmentView, this, items, new MessageDetailActivity$onCreate$1(messageDetailViewModel4), null, 8, null);
        WebView webView = (WebView) mo13311c(C4014R.C4016id.message_web_view);
        String str2 = "message_web_view";
        Intrinsics.checkExpressionValueIsNotNull(webView, str2);
        WebSettings settings = webView.getSettings();
        String str3 = "message_web_view.settings";
        Intrinsics.checkExpressionValueIsNotNull(settings, str3);
        settings.setDomStorageEnabled(true);
        WebView webView2 = (WebView) mo13311c(C4014R.C4016id.message_web_view);
        Intrinsics.checkExpressionValueIsNotNull(webView2, str2);
        WebSettings settings2 = webView2.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings2, str3);
        settings2.setLoadsImagesAutomatically(true);
        WebView webView3 = (WebView) mo13311c(C4014R.C4016id.message_web_view);
        Intrinsics.checkExpressionValueIsNotNull(webView3, str2);
        webView3.getSettings().setAppCacheEnabled(true);
        mo8719a((Toolbar) mo13311c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
        MessageDetailViewModel messageDetailViewModel5 = this.f13824x;
        if (messageDetailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, messageDetailViewModel5.getUiCommand());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkParameterIsNotNull(menu, "menu");
        getMenuInflater().inflate(C4014R.C4017menu.message_details_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C4014R.C4016id.action_reply_to_message) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14879a(this);
            MessageDetailViewModel messageDetailViewModel = this.f13824x;
            if (messageDetailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            messageDetailViewModel.mo13319a0();
            return true;
        }
    }
}
