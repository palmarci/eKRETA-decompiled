package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.attachment.AttachmentView;
import hu.ekreta.ellenorzo.message.MessageDetailViewModel;

public abstract class ActivityMessageDetailBinding extends ViewDataBinding {
    public final AttachmentView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final WebView E;
    public final FrameLayout F;
    public MessageDetailViewModel G;
    public final TextView z;

    public ActivityMessageDetailBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, TextView textView, TextView textView2, AttachmentView attachmentView, TextView textView3, TextView textView4, TextView textView5, WebView webView, NestedScrollView nestedScrollView, FrameLayout frameLayout, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = textView2;
        this.A = attachmentView;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = webView;
        this.F = frameLayout;
    }

    public abstract void a(MessageDetailViewModel messageDetailViewModel);
}
