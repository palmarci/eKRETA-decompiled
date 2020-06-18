package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.settings.SettingsViewModel;

public class ActivitySettingsBindingImpl extends ActivitySettingsBinding {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final ConstraintLayout C;
    public long D = -1;

    static {
        F.put(R.id.appBarLayout_profile_detail, 3);
        F.put(R.id.toolbar, 4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivitySettingsBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 5
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.Toolbar r9 = (androidx.appcompat.widget.Toolbar) r9
            r5 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.D = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.C = r11
            androidx.constraintlayout.widget.ConstraintLayout r11 = r10.C
            r0 = 0
            r11.setTag(r0)
            android.widget.FrameLayout r11 = r10.z
            r11.setTag(r0)
            android.widget.TextView r11 = r10.A
            r11.setTag(r0)
            r10.a((android.view.View) r12)
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.D     // Catch:{ all -> 0x006b }
            r2 = 0
            r15.D = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r15)     // Catch:{ all -> 0x006b }
            hu.ekreta.ellenorzo.settings.SettingsViewModel r4 = r15.B
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
            boolean r5 = r4.d()
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
            java.lang.String r11 = r4.n()
        L_0x0042:
            android.widget.TextView r4 = r15.A
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131689809(0x7f0f0151, float:1.9008644E38)
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
            android.widget.FrameLayout r4 = r15.z
            r4.setVisibility(r5)
        L_0x0060:
            long r0 = r0 & r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006a
            android.widget.TextView r0 = r15.A
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r11)
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivitySettingsBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(SettingsViewModel settingsViewModel) {
        a(0, (i) settingsViewModel);
        this.B = settingsViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.D = 8;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((SettingsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        } else if (i2 == 2) {
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.D |= 4;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        SettingsViewModel settingsViewModel = (SettingsViewModel) obj;
        return e(i3);
    }
}
