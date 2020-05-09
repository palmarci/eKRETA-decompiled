package p289hu.ekreta.ellenorzo.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p213b.p214k.C3191a;
import p211h.p258l.C3703g;
import p211h.p262m.p263d.C3737d;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.ActivityHomeworkDetailBinding;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4457a;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4662b;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p337h0.C5018b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "viewModel", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "HomeworkCommentViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivity */
/* compiled from: HomeworkDetailActivity.kt */
public final class HomeworkDetailActivity extends C4457a {

    /* renamed from: x */
    public HomeworkDetailViewModel f13437x;

    /* renamed from: y */
    public final C4662b f13438y = new C4662b();

    /* renamed from: z */
    public HashMap f13439z;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R/\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "Landroid/view/View$OnClickListener;", "commentView", "Landroid/view/View;", "(Lhu/ekreta/ellenorzo/homework/HomeworkDetailActivity;Landroid/view/View;)V", "getCommentView", "()Landroid/view/View;", "deleteCommentButton", "Landroid/widget/ImageButton;", "homeworkCommentSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "homeworkWebView", "Landroid/webkit/WebView;", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "setModel", "(Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "recordDateTextView", "Landroid/widget/TextView;", "recorderStudentNameTextView", "onClick", "", "v", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailActivity$HomeworkCommentViewHolder */
    /* compiled from: HomeworkDetailActivity.kt */
    public final class HomeworkCommentViewHolder extends MVVMViewHolder<HomeworkComment> implements OnClickListener {

        /* renamed from: E */
        public static final /* synthetic */ KProperty[] f13440E = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(HomeworkCommentViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;"))};

        /* renamed from: A */
        public final C5018b<HomeworkComment> f13441A;

        /* renamed from: B */
        public final ReadWriteProperty f13442B = new C4202xfe190156(null, null, this);

        /* renamed from: C */
        public final View f13443C;

        /* renamed from: D */
        public final /* synthetic */ HomeworkDetailActivity f13444D;

        /* renamed from: w */
        public final TextView f13445w;

        /* renamed from: x */
        public final TextView f13446x;

        /* renamed from: y */
        public final WebView f13447y;

        /* renamed from: z */
        public final ImageButton f13448z;

        public HomeworkCommentViewHolder(HomeworkDetailActivity homeworkDetailActivity, View view) {
            Intrinsics.checkParameterIsNotNull(view, "commentView");
            this.f13444D = homeworkDetailActivity;
            super(view);
            this.f13443C = view;
            View findViewById = this.f13443C.findViewById(C4014R.C4016id.student_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "commentView.findViewById(R.id.student_name)");
            this.f13445w = (TextView) findViewById;
            View findViewById2 = this.f13443C.findViewById(C4014R.C4016id.record_date);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "commentView.findViewById(R.id.record_date)");
            this.f13446x = (TextView) findViewById2;
            View findViewById3 = this.f13443C.findViewById(C4014R.C4016id.homework_text_web_view);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "commentView.findViewById…d.homework_text_web_view)");
            this.f13447y = (WebView) findViewById3;
            View findViewById4 = this.f13443C.findViewById(C4014R.C4016id.deleteButton);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "commentView.findViewById(R.id.deleteButton)");
            this.f13448z = (ImageButton) findViewById4;
            C5018b<HomeworkComment> bVar = new C5018b<>();
            Intrinsics.checkExpressionValueIsNotNull(bVar, "PublishSubject.create<HomeworkComment>()");
            this.f13441A = bVar;
            this.f13448z.setOnClickListener(this);
            C5027n k = this.f13441A.mo17252k(new C4675h<T, C5030q<? extends R>>(this) {

                /* renamed from: c */
                public final /* synthetic */ HomeworkCommentViewHolder f13449c;

                {
                    this.f13449c = r1;
                }

                /* renamed from: a */
                public final C5027n<Boolean> apply(HomeworkComment homeworkComment) {
                    Intrinsics.checkParameterIsNotNull(homeworkComment, "it");
                    return this.f13449c.f13444D.mo12926q().mo12945b(homeworkComment);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(k, "homeworkCommentSubject\n …el.canDeleteComment(it) }");
            ExtensionsKt.m14660a(C4998b.m16842a(k, (Function1) new Function1<Throwable, Unit>(this) {

                /* renamed from: c */
                public final /* synthetic */ HomeworkCommentViewHolder f13451c;

                {
                    this.f13451c = r1;
                }

                /* renamed from: a */
                public final void mo12933a(Throwable th) {
                    Intrinsics.checkParameterIsNotNull(th, "it");
                    this.f13451c.f13448z.setVisibility(8);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo12933a((Throwable) obj);
                    return Unit.INSTANCE;
                }
            }, (Function0) null, (Function1) new Function1<Boolean, Unit>(this) {

                /* renamed from: c */
                public final /* synthetic */ HomeworkCommentViewHolder f13450c;

                {
                    this.f13450c = r1;
                }

                /* renamed from: a */
                public final void mo12932a(Boolean bool) {
                    ImageButton access$getDeleteCommentButton$p = this.f13450c.f13448z;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "visibility");
                    access$getDeleteCommentButton$p.setVisibility(bool.booleanValue() ? 0 : 8);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo12932a((Boolean) obj);
                    return Unit.INSTANCE;
                }
            }, 2), homeworkDetailActivity.f13438y);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: D */
        public final View mo12927D() {
            return this.f13443C;
        }

        /* renamed from: a */
        public void setModel(HomeworkComment homeworkComment) {
            this.f13442B.setValue(this, f13440E[0], homeworkComment);
        }

        public HomeworkComment getModel() {
            return (HomeworkComment) this.f13442B.getValue(this, f13440E[0]);
        }

        public void onClick(View view) {
            HomeworkComment model = getModel();
            if (model != null) {
                this.f13444D.mo12926q().mo12944a(model);
            }
        }
    }

    /* renamed from: c */
    public View mo12924c(int i) {
        if (this.f13439z == null) {
            this.f13439z = new HashMap();
        }
        View view = (View) this.f13439z.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13439z.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding a = C3703g.m9412a(this, C4014R.layout.activity_homework_detail);
        Intrinsics.checkExpressionValueIsNotNull(a, "DataBindingUtil.setConte…homework_detail\n        )");
        ActivityHomeworkDetailBinding activityHomeworkDetailBinding = (ActivityHomeworkDetailBinding) a;
        HomeworkDetailViewModel homeworkDetailViewModel = this.f13437x;
        String str = "viewModel";
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        activityHomeworkDetailBinding.mo12350a(homeworkDetailViewModel);
        HomeworkDetailViewModel homeworkDetailViewModel2 = this.f13437x;
        if (homeworkDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        homeworkDetailViewModel2.mo12943a(ExtensionsKt.m14669f(intent));
        RecyclerView recyclerView = (RecyclerView) mo12924c(C4014R.C4016id.comments_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "comments_recycler_view");
        HomeworkDetailViewModel homeworkDetailViewModel3 = this.f13437x;
        if (homeworkDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        ExtensionsKt.m14654a(recyclerView, (C3818m) this, homeworkDetailViewModel3.getHomeworkComments(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new HomeworkDetailActivity$onCreate$1<Object,Object,Object>(this));
        HomeworkDetailViewModel homeworkDetailViewModel4 = this.f13437x;
        if (homeworkDetailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a((C3737d) this, homeworkDetailViewModel4.getUiCommand());
        mo8719a((Toolbar) mo12924c(C4014R.C4016id.toolbar));
        C3191a l = mo8735l();
        if (l != null) {
            l.mo8688c(true);
            l.mo8690d(true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13438y.mo16965b();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics.checkParameterIsNotNull(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
        HomeworkDetailViewModel homeworkDetailViewModel = this.f13437x;
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        homeworkDetailViewModel.mo12950l1();
    }

    /* renamed from: q */
    public final HomeworkDetailViewModel mo12926q() {
        HomeworkDetailViewModel homeworkDetailViewModel = this.f13437x;
        if (homeworkDetailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return homeworkDetailViewModel;
    }
}
