package hu.ekreta.ellenorzo.omission;

import a.b.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "", "subject", "", "formattedType", "appendedNumberOfLesson", "", "lessonStartTimeWithEndTime", "omissionIconResource", "omission", "Lhu/ekreta/ellenorzo/omission/Omission;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILhu/ekreta/ellenorzo/omission/Omission;)V", "getAppendedNumberOfLesson", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFormattedType", "()Ljava/lang/String;", "getLessonStartTimeWithEndTime", "getOmission", "()Lhu/ekreta/ellenorzo/omission/Omission;", "getOmissionIconResource", "()I", "getSubject", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILhu/ekreta/ellenorzo/omission/Omission;)Lhu/ekreta/ellenorzo/omission/OmissionViewModel;", "equals", "", "other", "hashCode", "toString", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionViewModel.kt */
public final class OmissionViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final String f5965a;
    public final String b;
    public final Integer c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5966d;
    public final int e;
    public final Omission f;

    public OmissionViewModel(String str, String str2, Integer num, String str3, int i2, Omission omission) {
        Intrinsics.checkParameterIsNotNull(str, "subject");
        Intrinsics.checkParameterIsNotNull(str2, "formattedType");
        Intrinsics.checkParameterIsNotNull(str3, "lessonStartTimeWithEndTime");
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        this.f5965a = str;
        this.b = str2;
        this.c = num;
        this.f5966d = str3;
        this.e = i2;
        this.f = omission;
    }

    public static /* synthetic */ OmissionViewModel copy$default(OmissionViewModel omissionViewModel, String str, String str2, Integer num, String str3, int i2, Omission omission, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = omissionViewModel.f5965a;
        }
        if ((i3 & 2) != 0) {
            str2 = omissionViewModel.b;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            num = omissionViewModel.c;
        }
        Integer num2 = num;
        if ((i3 & 8) != 0) {
            str3 = omissionViewModel.f5966d;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = omissionViewModel.e;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            omission = omissionViewModel.f;
        }
        return omissionViewModel.a(str, str4, num2, str5, i4, omission);
    }

    public final OmissionViewModel a(String str, String str2, Integer num, String str3, int i2, Omission omission) {
        Intrinsics.checkParameterIsNotNull(str, "subject");
        Intrinsics.checkParameterIsNotNull(str2, "formattedType");
        Intrinsics.checkParameterIsNotNull(str3, "lessonStartTimeWithEndTime");
        Intrinsics.checkParameterIsNotNull(omission, "omission");
        return new OmissionViewModel(str, str2, num, str3, i2, omission);
    }

    public final Integer a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.f5966d;
    }

    public final Omission d() {
        return this.f;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OmissionViewModel) {
                OmissionViewModel omissionViewModel = (OmissionViewModel) obj;
                if (Intrinsics.areEqual((Object) this.f5965a, (Object) omissionViewModel.f5965a) && Intrinsics.areEqual((Object) this.b, (Object) omissionViewModel.b) && Intrinsics.areEqual((Object) this.c, (Object) omissionViewModel.c) && Intrinsics.areEqual((Object) this.f5966d, (Object) omissionViewModel.f5966d)) {
                    if (!(this.e == omissionViewModel.e) || !Intrinsics.areEqual((Object) this.f, (Object) omissionViewModel.f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f5965a;
    }

    public int hashCode() {
        String str = this.f5965a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f5966d;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e) * 31;
        Omission omission = this.f;
        if (omission != null) {
            i2 = omission.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("OmissionViewModel(subject=");
        a2.append(this.f5965a);
        a2.append(", formattedType=");
        a2.append(this.b);
        a2.append(", appendedNumberOfLesson=");
        a2.append(this.c);
        a2.append(", lessonStartTimeWithEndTime=");
        a2.append(this.f5966d);
        a2.append(", omissionIconResource=");
        a2.append(this.e);
        a2.append(", omission=");
        a2.append(this.f);
        a2.append(")");
        return a2.toString();
    }
}
