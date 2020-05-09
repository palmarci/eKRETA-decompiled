package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.attachment.AttachmentView;
import p289hu.ekreta.ellenorzo.message.MessageDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBinding */
public abstract class ActivityMessageDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final AttachmentView f12127A;

    /* renamed from: B */
    public final TextView f12128B;

    /* renamed from: C */
    public final TextView f12129C;

    /* renamed from: D */
    public final TextView f12130D;

    /* renamed from: E */
    public final WebView f12131E;

    /* renamed from: F */
    public final FrameLayout f12132F;

    /* renamed from: G */
    public MessageDetailViewModel f12133G;

    /* renamed from: z */
    public final TextView f12134z;

    public ActivityMessageDetailBinding(Object obj, View view, int i, AppBarLayout appBarLayout, TextView textView, TextView textView2, AttachmentView attachmentView, TextView textView3, TextView textView4, TextView textView5, WebView webView, NestedScrollView nestedScrollView, FrameLayout frameLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.f12134z = textView2;
        this.f12127A = attachmentView;
        this.f12128B = textView3;
        this.f12129C = textView4;
        this.f12130D = textView5;
        this.f12131E = webView;
        this.f12132F = frameLayout;
    }

    /* renamed from: a */
    public abstract void mo12361a(MessageDetailViewModel messageDetailViewModel);
}
