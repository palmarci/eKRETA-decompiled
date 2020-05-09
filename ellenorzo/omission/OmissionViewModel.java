package p289hu.ekreta.ellenorzo.omission;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "", "subject", "", "formattedType", "appendedNumberOfLessonWithClass", "lessonStartTimeWithEndTime", "omissionIconResource", "", "omission", "Lhu/ekreta/ellenorzo/omission/Omission;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILhu/ekreta/ellenorzo/omission/Omission;)V", "getAppendedNumberOfLessonWithClass", "()Ljava/lang/String;", "getFormattedType", "getLessonStartTimeWithEndTime", "getOmission", "()Lhu/ekreta/ellenorzo/omission/Omission;", "getOmissionIconResource", "()I", "getSubject", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionViewModel */
/* compiled from: OmissionViewModel.kt */
public final class OmissionViewModel {

    /* renamed from: a */
    public final String f14427a;

    /* renamed from: b */
    public final String f14428b;

    /* renamed from: c */
    public final String f14429c;

    /* renamed from: d */
    public final String f14430d;

    /* renamed from: e */
    public final int f14431e;

    /* renamed from: f */
    public final Omission f14432f;

    public OmissionViewModel(String str, String str2, String str3, String str4, int i, Omission omission) {
        Intrinsics.checkParameterIsNotNull(str, "subject");
        Intrinsics.checkParameterIsNotNull(str2, "formattedType");
        Intrinsics.checkParameterIsNotNull(str3, "appendedNumberOfLessonWithClass");
        Intrinsics.checkParameterIsNotNull(str4, "lessonStartTimeWithEndTime");
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        this.f14427a = str;
        this.f14428b = str2;
        this.f14429c = str3;
        this.f14430d = str4;
        this.f14431e = i;
        this.f14432f = omission;
    }

    public static /* synthetic */ OmissionViewModel copy$default(OmissionViewModel omissionViewModel, String str, String str2, String str3, String str4, int i, Omission omission, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = omissionViewModel.f14427a;
        }
        if ((i2 & 2) != 0) {
            str2 = omissionViewModel.f14428b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = omissionViewModel.f14429c;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = omissionViewModel.f14430d;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = omissionViewModel.f14431e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            omission = omissionViewModel.f14432f;
        }
        return omissionViewModel.mo13981a(str, str5, str6, str7, i3, omission);
    }

    /* renamed from: a */
    public final OmissionViewModel mo13981a(String str, String str2, String str3, String str4, int i, Omission omission) {
        Intrinsics.checkParameterIsNotNull(str, "subject");
        Intrinsics.checkParameterIsNotNull(str2, "formattedType");
        Intrinsics.checkParameterIsNotNull(str3, "appendedNumberOfLessonWithClass");
        Intrinsics.checkParameterIsNotNull(str4, "lessonStartTimeWithEndTime");
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        OmissionViewModel omissionViewModel = new OmissionViewModel(str, str2, str3, str4, i, omission);
        return omissionViewModel;
    }

    /* renamed from: a */
    public final String mo13982a() {
        return this.f14429c;
    }

    /* renamed from: b */
    public final String mo13983b() {
        return this.f14428b;
    }

    /* renamed from: c */
    public final String mo13984c() {
        return this.f14430d;
    }

    /* renamed from: d */
    public final Omission mo13985d() {
        return this.f14432f;
    }

    /* renamed from: e */
    public final int mo13986e() {
        return this.f14431e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OmissionViewModel) {
                OmissionViewModel omissionViewModel = (OmissionViewModel) obj;
                if (Intrinsics.areEqual((Object) this.f14427a, (Object) omissionViewModel.f14427a) && Intrinsics.areEqual((Object) this.f14428b, (Object) omissionViewModel.f14428b) && Intrinsics.areEqual((Object) this.f14429c, (Object) omissionViewModel.f14429c) && Intrinsics.areEqual((Object) this.f14430d, (Object) omissionViewModel.f14430d)) {
                    if (!(this.f14431e == omissionViewModel.f14431e) || !Intrinsics.areEqual((Object) this.f14432f, (Object) omissionViewModel.f14432f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13988f() {
        return this.f14427a;
    }

    public int hashCode() {
        String str = this.f14427a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14428b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14429c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14430d;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f14431e) * 31;
        Omission omission = this.f14432f;
        if (omission != null) {
            i = omission.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C0082a.m111a("OmissionViewModel(subject=");
        a.append(this.f14427a);
        a.append(", formattedType=");
        a.append(this.f14428b);
        a.append(", appendedNumberOfLessonWithClass=");
        a.append(this.f14429c);
        a.append(", lessonStartTimeWithEndTime=");
        a.append(this.f14430d);
        a.append(", omissionIconResource=");
        a.append(this.f14431e);
        a.append(", omission=");
        a.append(this.f14432f);
        a.append(")");
        return a.toString();
    }
}
