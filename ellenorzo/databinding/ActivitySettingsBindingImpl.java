package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.settings.SettingsViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl */
public class ActivitySettingsBindingImpl extends ActivitySettingsBinding {

    /* renamed from: E */
    public static final C2867f f12237E = null;

    /* renamed from: F */
    public static final SparseIntArray f12238F = new SparseIntArray();

    /* renamed from: C */
    public final ConstraintLayout f12239C;

    /* renamed from: D */
    public long f12240D = -1;

    static {
        f12238F.put(C4014R.C4016id.appBarLayout_profile_detail, 3);
        f12238F.put(C4014R.C4016id.toolbar, 4);
    }

    public ActivitySettingsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 5, f12237E, f12238F);
        super(fVar, view, 1, (AppBarLayout) a[3], (FrameLayout) a[2], (TextView) a[1], (Toolbar) a[4]);
        this.f12239C = (ConstraintLayout) a[0];
        this.f12239C.setTag(null);
        this.f12236z.setTag(null);
        this.f12234A.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090M1() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.f12240D     // Catch:{ all -> 0x006b }
            r2 = 0
            r15.f12240D = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r15)     // Catch:{ all -> 0x006b }
            hu.ekreta.ellenorzo.settings.SettingsViewModel r4 = r15.f12235B
            r5 = 15
            long r5 = r5 & r0
            r7 = 11
            r9 = 13
            r11 = 0
            r12 = 0
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0055
            long r5 = r0 & r9
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0035
            if (r4 == 0) goto L_0x0024
            boolean r5 = r4.mo15663d()
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            if (r13 == 0) goto L_0x002f
            if (r5 == 0) goto L_0x002c
            r13 = 32
            goto L_0x002e
        L_0x002c:
            r13 = 16
        L_0x002e:
            long r0 = r0 | r13
        L_0x002f:
            if (r5 == 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r5 = 8
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            long r13 = r0 & r7
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0056
            if (r4 == 0) goto L_0x0042
            java.lang.String r11 = r4.mo15664n()
        L_0x0042:
            android.widget.TextView r4 = r15.f12234A
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131689799(0x7f0f0147, float:1.9008624E38)
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r12] = r11
            java.lang.String r11 = r4.getString(r6, r13)
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            long r9 = r9 & r0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0060
            android.widget.FrameLayout r4 = r15.f12236z
            r4.setVisibility(r5)
        L_0x0060:
            long r0 = r0 & r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            android.widget.TextView r0 = r15.f12234A
            p204g.p205a.p206a.p208b.C3158a.m7850a(r0, r11)
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl.mo6090M1():void");
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12240D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12240D = 8;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12377a(SettingsViewModel settingsViewModel) {
        mo6103a(0, (C3705i) settingsViewModel);
        this.f12235B = settingsViewModel;
        synchronized (this) {
            this.f12240D |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12377a((SettingsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12378e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12240D |= 1;
            }
            return true;
        } else if (i == 2) {
            synchronized (this) {
                this.f12240D |= 2;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12240D |= 4;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        SettingsViewModel settingsViewModel = (SettingsViewModel) obj;
        return mo12378e(i2);
    }
}
